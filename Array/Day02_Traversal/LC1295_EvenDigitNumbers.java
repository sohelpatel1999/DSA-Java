package Array.Day02_Traversal;

public class LC1295_EvenDigitNumbers {

    public static void main(String[] args) {

        int[] sohvi = {1,23,32,3234,5};
        int answer = findNumbers(sohvi);
        System.out.println(answer);        
    }

    public static int findNumbers(int[] nums) {

    int count = 0;

    for (int num : nums) {

        int digits = 0;

        while (num > 0) {
            digits++;
            num = num / 10;
        }

        if (digits % 2 == 0) {
            count++;
        }
    }

    return count;
}
    
}
