package Array.Day04_TwoSum;

import java.util.HashMap;

public class TwoSumHashMap {
    public static void main(String[] args) {
        int[] sohvi = { 10, 20, 30, 40, 50 };
        int target = 90;
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < sohvi.length; i++) {
            int needed = target - sohvi[i];
            if (map.containsKey(needed)){
                System.out.println(map.get(needed) +" "+ i);
            }
            map.put(sohvi[i], i);
        }
    }
}
