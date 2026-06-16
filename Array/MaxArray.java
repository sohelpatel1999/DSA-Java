package Array;

public class MaxArray {
    public static void main(String[] args) {
        int[] sohvi = { 5, 8, 2, 9, 10 };

        int max = sohvi[0];
        for (int i = 0; i < sohvi.length; i++) {
            if (max < sohvi[i]) {
                max = sohvi[i];
            }
        }
        System.out.println(max);

    }

}
