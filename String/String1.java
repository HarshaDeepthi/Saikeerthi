package String;
import java.lang.*;
public class String1 {
    public static void main(String[] args)
        throws Exception
        {
         StringBuilder s=new StringBuilder("AAAABBBBCCCCDDDDDDD");
         s.append("HHHHHH");
            System.out.println(s);
            s.replace(0,5,"jjjjjj");
            System.out.println(s);
            s.replace(4,8,"uuuuu");
            System.out.println(s);
            char s1[]={'d','d','d'};
            s.insert(0,s1);
            System.out.println(s);
            StringBuilder s2=new StringBuilder(s.toString());
            System.out.println(s2);
            int capacity=s2.capacity();
            System.out.println("capacity of String= " +capacity);
            StringBuilder s3=new StringBuilder("Harsha Deepthi");//Harsha Deepthi Mulisetti
            int a=s3.length();
            System.out.println("length of s3=" +a);
            s3.reverse();
            System.out.println("reverse s3= " +s3);
            s3.append("Mulisetti");
            System.out.println("append s3= " +s3);
            s3.reverse();
            System.out.println("reverse s3= " +s3);
            s3.delete(0,9);
            System.out.println(s3);
            s3.append("  Mulisetti");
            System.out.println(s3);
            StringBuilder builder=new StringBuilder("There is fox   in forest ");
            System.out.println("  before sentence=  "   + builder);
            builder.insert(13,"and tiger");
            System.out.println("  After sentence =   "+ builder);
            System.out.println(builder);//There is fox and tiger in forest
           builder.replace(9,12,"elephant");
           System.out.println("  Modification=  " + builder);
        }
    }
