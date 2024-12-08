package ArraysExample;

public class MaximumSumOfSubArray {
    public static void main(String[] args) {
        int[] arr = {-2,-4};

        int max = Integer.MIN_VALUE;
        for(int i = 0 ; i< arr.length ; i++){
            int sum = 0;
            for(int j = i ; j < arr.length ; j++){
                sum = sum + (arr[j]);
            }
            if(sum>max){
                max = sum;
            }
//            if(sum < 0){
//                nmax = sum;
//            }
            System.out.println("sum for i = "+i+" is :  "+sum);
        }
//        if(max >= 0){
//            System.out.println("possitive sum is : "+max);
//        }
//        else{
//            System.out.println("Negative max is : "+nmax);
//        }
        System.out.println("finally the max sum of given array's sub array is : "+ max);
    }
}
