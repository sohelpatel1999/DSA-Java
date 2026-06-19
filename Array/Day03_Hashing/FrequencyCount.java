package Array.Day03_Hashing;

import java.util.HashMap;

public class FrequencyCount {
    public static void main(String[] args) {
        int[] sohvi = {1,2,3,4,5,3,4,2,2,14};
        HashMap<Integer,Integer> hm = new HashMap<>();

        for(int i = 0;i<sohvi.length;i++){
            if(hm.containsKey(sohvi[i])){
                int value = hm.get(sohvi[i]);
                hm.put(sohvi[i], value+1);
            } else{
                hm.put(sohvi[i], 1);
            }
        }

                for (int key : hm.keySet()) {
                    System.out.print(key + " ");
                    System.out.println(hm.get(key));
                }
        
    }
}
