package Array.Day02_Traversal;

public class LC1480_RunningSum {

    public static void main(String[] args) {
        int[] sohvi = {1,2,3,4,5};
        int[] getanswerfromfunction = runningSum(sohvi);

        for (int i = 0; i < getanswerfromfunction.length; i++) {
            System.out.println(getanswerfromfunction[i]);
        }

    }

    public static int[] runningSum(int[] nums) {

    int[] ans = new int[nums.length];
    int sum = 0;

    for (int i = 0; i < nums.length; i++) {
        sum = sum + nums[i];
        ans[i] = sum;
    }

    return ans;
}
    
}
