package programs;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.sql.SQLOutput;

public class SwapInt {
     static void swapvalues(int m,int n){
        int temp=m;
        m=n;
        n=temp;
         System.out.println("value of m is  "  +  m  +  "  and value of n is " +  n);
         System.out.println("");
    }
    public static void main(String[] args){
        int m=10,n=20;
        swapvalues(m,n);
        System.out.println("swap values  "   + m +","  +   n);
    }
}

