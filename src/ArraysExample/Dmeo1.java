package ArraysExample;

import java.util.ArrayList;
import java.util.Arrays;

public class Dmeo1 {
    public static void main(String[] args) {
        int[] arr = {1};
//        int length1 = arr.length;
//        System.out.println(Arrays.toString(arr));
//        System.out.println("size of arr : "+length1);
        int flag = 0;
        int n = 1;
        int missingNumber  = 1;
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        int count = 0;
        for(int i = 0 ; i < arr.length ; i++){
            arrayList.add(arr[i]);
            count++;
        }
        arrayList.add(arr[count-1]+1);
        System.out.println(arrayList);

        for(int i = 0 ; i < arrayList.size() ; i++){
            if(n == arrayList.get(i)){
                flag =  0;
                n++;
            }
            else{
                flag = 1;
                missingNumber = arrayList.get(i) - 1;
                System.out.println("Missing number  is : "+missingNumber);
                break;

            }
        }


    }


}

