package Largest_Number;

/**
 * Created by Administrator on 2017/3/9.
 */

import java.util.Arrays;
import java.util.Comparator;

public class Largest_Number {
    public static void main(String[] args){
        System.out.println("hello");
        int[] input = new int[]{3,30,23,9,5,10};
        Largest_Number largest_number = new Largest_Number();
        System.out.println(largest_number.LargestNumber(input));
    }

    public String LargestNumber(int[] inputArray){
        String[] strArray = new String[inputArray.length];
        for(int i = 0;i < inputArray.length;i++){
            strArray[i] = inputArray[i] + "";
        }
        Arrays.sort(strArray,new MyComparetor<String>());
        for(int i = 0;i < strArray.length;i++){
            System.out.print(strArray[i]+" ");
        }
        StringBuilder sb = new StringBuilder("");
        for(String s:strArray){
            sb.append(s);
        }
        String returnString = sb.toString();
        return returnString;
    }
}
class MyComparetor<String> implements Comparator<String> {
    public int compare(String s1,String s2){
        return (s2.toString()+s1).compareTo(s1.toString()+s2.toString());
    }
}