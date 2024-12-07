import java.util.*;
public class LargestAndSmallestNumberInArray {
    public static int LargeSmall(int number[]){
        int largest= Integer.MIN_VALUE;
        int smallest=Integer.MAX_VALUE;
        for (int i=0;i<number.length;i++){
            if(number[i]>largest){
                largest=number[i];
            }
            if(number[i]<smallest){
                smallest=number[i];
            }

        }
        System.out.println("the samllest number is:"+smallest);
        return largest;
    }
    public static void main(String args[]){
        int number[]={10,3,34,67,78,91,23,4,14,28};
        int largest= LargeSmall(number);
        System.out.println("the largest is:"+largest);

    }
    
}
