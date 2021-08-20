package medium;

public class IncrementalMemoryLeak {
    public int[] memLeak(int memory1, int memory2) {
        int time = 1;
        while (true) {
            if (memory1 >= memory2) {
                memory1 -= time;
            } else {
                memory2 -= time;
            }
            if (memory1 < 0) {
                memory1 += time;
                break;
            }
            if (memory2 < 0) {
                memory2 += time;
                break;
            }
            time++;
        }
        return new int[] {time, memory1, memory2};
    }
}
