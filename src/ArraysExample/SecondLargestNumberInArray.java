package ArraysExample;

import java.util.Arrays;

public class SecondLargestNumberInArray {
    public static void main(String[] args) {
        int[] arr = {12,35,1,10,34,1};
        Arrays.sort(arr);
        int max = arr[arr.length-1];
        System.out.println(max);
        int secMax = arr[arr.length-2];
        System.out.println(secMax);
        if(secMax == max){
            System.out.println("No second largest number present");
        }


    }
}
