package Array.Day03_Hashing;

import java.util.HashMap;
import java.util.Map;

public class LC169_MajorityElement {

    public static void main(String[] args) {
        int[] sohvi = { 1, 1, 1, 3, 3 };
        int answer = majorityElement(sohvi);
        System.out.println(answer);
    }

    public static int majorityElement(int[] nums) {

        int candidate = 0;
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            if (count == 0) {
                candidate = nums[i];
            }
            if (candidate == nums[i]) {
                count++;
            } else {
                count--;
            }
        }
        return candidate;
    }

    public static int majorityElement1(int[] nums) {

        HashMap<Integer, Integer> map = new HashMap<>();

        // Frequency Count
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        // Majority Element Find
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {

            if (entry.getValue() > nums.length / 2) {
                return entry.getKey();
            }

        }

        return -1;
    }

}
