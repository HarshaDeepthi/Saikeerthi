package Loops.java;

public class ForEach {
    public static void main(String[] args) {
        String array[] = {"Harsha", "Ganesh", "Saikeerthi"};
        for (String x : array) {
            System.out.println(x);
        }
        for (int i = 0; i < array.length-1; i++) {
            System.out.println(array[i]);
        }
    }
}
