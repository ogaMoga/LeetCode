package easy;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EmployeeImportance {
    public int getImportance(List<Employee> employees, int id) {
        Map<Integer, Employee> src = new HashMap<>();
        for (Employee employee : employees) {
            src.put(employee.id, employee);
        }
        return sum(src, id);
    }

    private int sum(Map<Integer, Employee> employees, int id) {
        Employee current = employees.get(id);
        if (current.subordinates == null) {
            return current.importance;
        }
        int res = current.importance;
        for (Integer sub : current.subordinates) {
            res += sum(employees, sub);
        }
        return res;
    }

    class Employee {
        public int id;
        public int importance;
        public List<Integer> subordinates;

        public Employee(int i, int i1, List<Integer> es) {
            this.id = i;
            this.importance = i1;
            this.subordinates = es;
        }
    }
}
