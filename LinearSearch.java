import java.util.*;
public class LinearSearch { 
        
        /**
         * @param number
         * @param key
         * @return
         */
        public static int Mysearch(int number[],int key){
            for(int i=0;i<number.length;i++){
                if(number[i]==key)
                return i;
                
            }
            return -1;

        }
        public static void main(String[] args) {
            int number[] ={1,2,3,4,5,6,7,8,9,10};
            int key =7;
            int index= Mysearch(number, key);
            if (index== -1){
                System.out.println("key not found");
            }
            else {
                System.out.println("the key is at position:" +index);
            }
        
    }
    
}