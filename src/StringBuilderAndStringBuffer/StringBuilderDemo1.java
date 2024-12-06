package StringBuilderAndStringBuffer;

public class StringBuilderDemo1 {
    public static void main(String[] args) {
        String[] strs = {"flower","flow","flight"};
        System.out.println(strs[0]);
        StringBuilder result = new StringBuilder("");
        for(int i = 0 ; i < strs[1].length(); i++){
            if( (strs[0].charAt(i) == strs[1].charAt(i)) && (strs[1].charAt(i) == strs[2].charAt(i)) ){
                System.out.println("they are equal : "+ strs[0].charAt(i) + " =  "+ strs[1].charAt(i));
                result.append(strs[0].charAt(i));
            }
        }
        System.out.println("result is  : "+result);







//        StringBuilder str1 = new StringBuilder("Hello, this is...");
//        StringBuffer str2 = new StringBuffer("Hello i am ....");
//
//        System.out.println("Before appending any thing in the str1 : "+ str1);
//        System.out.println("Before appending any thing in the str2 : "+ str2);
//
//        str1.append("Rahman");
//        str2.append("Tami");
//
//        System.out.println("after appending something in the str1 : "+ str1);
//        System.out.println("after appending something in the str2 : "+ str2);
    }
}
