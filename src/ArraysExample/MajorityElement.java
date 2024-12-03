package ArraysExample;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    public static void main(String[] args) {
        int[] nums = {1,1,3,5,3,33,5,10,55,33,4,33};
        Arrays.sort(nums);
//        int max = 1;

        Map<Integer,Integer> map1 = new HashMap<Integer, Integer>();
        for(int i = 0 ;  i < nums.length ; i++){
            if(!(map1.containsKey(nums[i]))){
                map1.put(nums[i],1);
            } else if (map1.containsKey(nums[i])) {
                map1.put(nums[i],(map1.get(nums[i])+1));
            }
        }
        Integer max = 0;
        Integer key1 = null;
        for(Integer key : map1.keySet()){
            if(max < map1.get(key)){
                max = map1.get(key);
                key1 = key;
            }
            System.out.println(key +" : "+ map1.get(key));
        }
        System.out.println(key1+" with mmax value : "+max);
//        System.out.println(map1+" with key : "+key);

    }
}
