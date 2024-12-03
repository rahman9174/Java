package ArraysExample;
//jagged array is like a 2-dimentional array but can have diff-diff columns
public class JaggedArray {
    public static void main(String[] args) {

        int[][] arr = new int[4][]; // Jagged array

        arr[0] = new int[4];
        arr[1] = new int[6];
        arr[2] = new int[3];
        arr[3] = new int[10];

        for(int i = 0; i < arr.length; i++){
            for(int j = 0 ; j < arr[i].length ; j++){
                arr[i][j] = (int)(Math.random()*10);
                System.out.print(arr[i][j]+" ");
            }
            System.out.println(" ");
        }
    }
}
