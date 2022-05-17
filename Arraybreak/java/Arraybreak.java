package Arraybreak.java;

public class Arraybreak {
     public static void main(String  args[]){
         int array[]=new int[]{1,2,3,4,5};
         for(int i=0;i<array.length;i++)
         {
            if (array[i] == 3)
            {
                break;
            }
        System.out.println(array[i]);
       }
    }
}