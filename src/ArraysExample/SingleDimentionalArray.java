package ArraysExample;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SingleDimentionalArray {
    public static void main(String[] args) {

//        integer type array
        int[] arr1 = new int[5];
        for(int i = 0 ; i< arr1.length ; i++){
            arr1[i] = (int)(Math.random()*100);
            System.out.println(arr1[i]);
        }
        System.out.println(Arrays.toString(arr1));
        int[] arr11 = arr1.clone();
        System.out.println(Arrays.toString(arr11));

//        string type array
        String[] arr2 = new String[5];
        arr2[0] = "India";
        arr2[1] = "Nepal";
        arr2[2] = "Russia";
        arr2[3] = "China";
        arr2[4] = "Taiwan";
        System.out.println(Arrays.toString(arr2));

        String[] cloneSting = arr2.clone();
        System.out.println(Arrays.toString(cloneSting));

        int[] num1 = new int[2];
        num1[0] = 1;
        num1[1] = 3;
        int l1 = num1.length;

        int[] num2 = new int[1];
        num2[0] = 2;
        int l2 = num2.length;

        int[] num3 = new int[num1.length + num2.length];
        int i = 0 ;
        int j = 0 ;
        int k = 0 ;
        for( i = 0 ; i < l1 ; i++){
            num3[k] = num1[i];
            k++;
        }
        for(j = 0 ; j < l2 ; j++){
            num3[k] = num2[j];
            k++;

        }
        Arrays.sort(num3);
        System.out.println(Arrays.toString(num3));
        System.out.println(Arrays.toString(num3));
        System.out.println(num3.length);


    }
}
