package Array.Day03_Hashing;

import java.util.HashSet;

public class LC217_PresentDuplicate {
    


    public static void main(String[] args) {
        int[] sohvi = {1,2,3};
        boolean answer = containsDuplicate(sohvi);
        System.out.println(answer);
        
    }
    public static boolean containsDuplicate(int[] nums) {

        HashSet<Integer> set = new HashSet<>();

        for(int i =0; i < nums.length; i++){
            if(set.contains(nums[i])){
                return true;
            }
            set.add(nums[i]);
        }
        return false;
        
    }
}
