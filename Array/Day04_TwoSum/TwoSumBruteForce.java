package Array.Day04_TwoSum;

public class TwoSumBruteForce {

    public static void main(String[] args) {
        int[] sohvi = { 10, 20, 30, 40, 50 };

        int target = 90;

        for (int i = 0; i < sohvi.length; i++) {
            for (int j = i + 1; j < sohvi.length; j++) {
                if (target == sohvi[i] + sohvi[j]) {
                    System.out.println(i + " " + j);
                    break;
                }
            }
        }
    }

}
