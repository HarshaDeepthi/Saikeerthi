package MethodOverriding;

import MethodOverloading.Division1;

class Multiplication extends Division1 {
     public int div(int a, int b, int c) {
         return (a * b * c);
     }

     public static void main(String args[]) {
         Division1 ob2 = new Division1();
         ob2.div(10, 2);
         MethodOverriding.Multiplication ob1 = new MethodOverriding.Multiplication();
         ob1.div(10, 2, 3);
         Division1 ob = new MethodOverriding.Multiplication();
         ob.div(10, 2);
         System.out.println(" division is= " + ob2.div(10, 2));
         System.out.println("multiplication is= " + ob1.div(10, 2, 3));
         System.out.println("second division is= " + ob.div(10, 2));
     }
 }

