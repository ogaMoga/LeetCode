package medium;

import java.util.ArrayList;
import java.util.Arrays;

public class CourseSchedule {
    public static boolean canFinish(int numCourses, int[][] prerequisites) {
        ArrayList<Integer>[] graph = new ArrayList[numCourses];
        for (int i = 0; i < numCourses; i++) {
            graph[i] = new ArrayList<>(numCourses - 1);
        }

        for (int[] prerequisite : prerequisites) {
            int root = prerequisite[0];
            graph[root].add(prerequisite[1]);
        }
        return !hasCycle(graph);
    }

    private static boolean hasCycle(ArrayList<Integer>[] graph) {
        Color[] colors = new Color[graph.length];
        Arrays.fill(colors, Color.WHITE);

        for (int node = 0; node < graph.length; node++) {
            if ((colors[node] == Color.WHITE) && (bfsCycleCheck(graph, node, colors))) {
                return true;
            }
        }
        return false;
    }

    private static boolean bfsCycleCheck(ArrayList<Integer>[] graph, int node, Color[] colors) {
        if (colors[node] == Color.GRAY) {
            return true;
        }

        colors[node] = Color.GRAY;
        for (Integer nextNode : graph[node]) {
            if ((colors[nextNode] != Color.BLACK) && (bfsCycleCheck(graph, nextNode, colors))) {
                return true;
            }
        }
        colors[node] = Color.BLACK;
        return false;
    }

    enum Color {
        WHITE,  //  unchecked
        GRAY,   //  checking is in progress
        BLACK   //  checked
    }
}
