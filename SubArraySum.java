public class SubArraySum {
    public static boolean subarraySum(int[] arr, int k) {
        int left = 0;
        int sum = 0;
        for (int right = 0; right < arr.length; right++) {
            sum = sum + arr[right];
            while (sum > k) {
                sum = sum - arr[left];
                left++;
            }
            if (sum == k) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] arr = { 4, 3, 2, 1 };
        int k = 5;
        boolean ans = subarraySum(arr, k);
        System.out.println(ans); 
    }
}