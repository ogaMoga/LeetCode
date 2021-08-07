package easy;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EmployeeImportance {
    public static int getImportance(List<Employee> employees, int id) {
        Map<Integer, Employee> src = new HashMap<>();
        for (Employee employee : employees) {
            src.put(employee.id, employee);
        }
        return sum(src, id);
    }

    private static int sum(Map<Integer, Employee> employees, int id) {
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

    static class Employee {
        public int id;
        public int importance;
        public List<Integer> subordinates;

        public Employee(int i, int i1, List<Integer> es) {
            this.id = i;
            this.importance = i1;
            this.subordinates = es;
        }
    }

    public static void main(String[] args) {
        System.out.println("expected: 11, \tactual: " + getImportance(List.of(new Employee(1, 5, List.of(2, 3))
                , new Employee(2, 3, null), new Employee(3, 3, null) ), 1));
    }
}
