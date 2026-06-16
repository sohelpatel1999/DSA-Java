package Array;

public class MinArray {
    public static void main(String[] args) {
        int[] sohvi = { 5, 8, 2, 9, 1, -1 };

        int min = sohvi[0];
        for(int i = 0;i<sohvi.length;i++){
            if(min>sohvi[i]){
                min=sohvi[i];
            }                           
        }
        System.out.println(min);

    }
}
