package programs;
import java.lang.*;

//another program
 abstract class Shape{
     abstract void Colour();
     public void area(){
         int l=10;
         int b=20;
         int a=l*b;
         System.out.println("Area =" +a);
     }
}
class Rectangle extends Shape{
     public  void Colour(){
        System.out.println("The Rectangle is:Red");
    }

        public static  void main(String[] args) {
            Rectangle rectangle=new Rectangle();
            rectangle.Colour();
            rectangle.area();
        }
    }

