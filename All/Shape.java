package All;

import java.sql.SQLOutput;

public  interface Shape {
    public void draw();

    public double area();

}
class Rectangle implements Shape {
    int l;
    int w;
     Rectangle(int l,int w){
         this.l=l;
         this.w=w;
     }
     public void draw(){
        System.out.println("Rectangle has been draw");
    }
    public  double area(){
         return l*w;
    }
 }
 class Test{
    public static void main(String Args[]){

        Rectangle rect=new Rectangle(10,20);
        System.out.println("area of rectangle= " +rect.area());
        rect.draw();
        }
    }


