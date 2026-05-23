import java.util.Arrays;
import java.util.PriorityQueue;

public class Main {
    public static void heapSort(int[] arr) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int num : arr) {
            pq.add(num);
        }
        int i = 0;
        while (!pq.isEmpty()) {
            arr[i++] = pq.poll();
        }
    }
    public static void main(String[] args) {
        int[] arr = new int[] { 4, 3, 2, 1 };
        heapSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}