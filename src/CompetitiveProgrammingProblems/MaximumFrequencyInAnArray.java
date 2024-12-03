package CompetitiveProgrammingProblems;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

//in this section we will build a program that will be capable to identify the maximum repeated number in an array or max frequency of an number in an array
//If the multiple number are repeated with samee number of times then print the max number  that is repeated.
public class MaximumFrequencyInAnArray {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("How many  numbers you want to enter in the Map ");
        int n = scan.nextInt();

        Map<Integer,Integer> map = new HashMap<>();

        System.out.println("Please enter the element in the Map : ");
        for(int i = 0 ; i < n ; i++){
            int num = scan.nextInt();
            if(map.containsKey(num)){
                int count = map.get(num);
                map.put(num,count+1);
            } else{
                map.put(num,1);
            }
        }
        System.out.println(map);
//        now we will find the maxFrequency element
        int ans = 0;
        int maxFreq = 0;
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            System.out.println("The entrySet() value is : "+entry);
            int num = entry.getKey();
            int count = entry.getValue();

            if(maxFreq < count){
                ans = num;
                maxFreq = count;
            }
            else if(maxFreq == count){
                ans = Math.max(num,ans);
            }
            else{
                continue;
            }

        }
        System.out.println("The max freqency numner in the array/map is : "+ans);

    }
}
