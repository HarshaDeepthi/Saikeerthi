package String;
import java.io.*;
    class StringBuffer1 {
    public static void main(String[] args) {
        StringBuffer s = new StringBuffer("HarshaDeepthi");
        s.append("Mulisetti");
        s.insert(0,5);
        s.insert(1,"for");
        s.insert(5,true);
        char s1[]={'s','a','i'};
                s.insert(0,s1);
        int a=  s.length();
        int b=  s.capacity();
        System.out.println("length of string HarshaDeepthi= "  + a);
        System.out.println("capacity of string HarshaDeepthi= "  + b);
        System.out.println( s );
        System.out.println("inserting 0 index=" +s);
    }
}
