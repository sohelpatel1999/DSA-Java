package Array.Day02_Traversal;

public class EvenCount {
    public static void main(String[] args) {
        int[] sohvi = {1,2,3,3,5,6};
        int evenCount = 0;
        int oddCount = 0;

        for (int i = 0; i < sohvi.length; i++) {
            if(sohvi[i]%2==1){
                oddCount++;
            }else{
                evenCount++;
            }
        }
        System.out.println(evenCount);
        System.out.println(oddCount);
        
        
    }
}
