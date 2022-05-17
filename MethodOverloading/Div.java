package MethodOverloading;

public class Div {
    public int div(int a, int b) {
        return (a / b);

    }

    public int div(int a, int b, int c) {
        return ((a + b )/ c);
    }

    public static void main(String args[]) {
        Div ob=new Div();

        System.out.println("first div is "+ob.div(10,2));
        System.out.println("Second div is "+ob.div(10,2,3));

    }
}