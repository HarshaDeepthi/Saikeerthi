package ptoject1;

import Break.java.Break;
import com.sun.org.apache.bcel.internal.generic.SWITCH;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.lang.invoke.SwitchPoint;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Survey {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to online survry system");
        System.out.println(" Enter the number of people participate in the survey");
        int x = sc.nextInt();
        int count;
        int rating1=0,rating2=0,rating3=0,rating4=0,rating5=0;
        for (int i = 0; i < x; i++) ;
        System.out.println("Say yes or no");

        System.out.println("1.Do you enjoy our company culture? ");
        String n = sc.next();
        System.out.println("2.Do any of our processes seem inefficient to you? ");
        String n1 = sc.next();
        System.out.println("3.Which company value would you like to embody more?  ");
        String n2 = sc.next();
        System.out.println("4. What do you need help with? ");
        String n3 = sc.next();
        System.out.println("5. Is there anything in your work world that’s causing frustration or delays?");
        String n4 = sc.next();
        System.out.println("Rating out of 5*");
        int rating = sc.nextInt();
        switch (rating) {
            case 1:
                rating1++;
                System.out.println("rating 1* out of 5*");
                break;
            case 2:
                rating2++;
                System.out.println("rating 2* out of 5 *");
                break;
            case 3:
                rating3++;
                System.out.println("rating 3* out of 5*");
                break;
            case 4:
                rating4++;
                System.out.println("rating 4* out of 5*");
                break;
            case 5:
                rating5++;
                System.out.println("rating 5* out of 5*");
                break;
        }
        System.out.println("Thanks for submitting the feedback");
    }
}