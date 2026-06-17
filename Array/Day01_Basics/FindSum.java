package Array.Day01_Basics;

public class FindSum {
    public static void main(String[] args) {
        int[] sohvi = { 5, 8, 2, 9, 1, -1 };

        int sum = 0;
        for (int i = 0; i < sohvi.length; i++) {
            sum += sohvi[i];
        }

        System.out.println(sum);

    }
}
