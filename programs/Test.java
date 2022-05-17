package programs;
import java.io.*;
public class Test {
    String name;
    int id;

    Test(String name, int id) {
        this.name = name;
        this.id = id;
    }
}
class  Test1 {

    public static void main(String[] args) {
        Test Test1 = new Test("Harsha", 1);
        System.out.println("Name is=  " + Test1.name);
        System.out.println("Id is=  " + Test1.id);
    }
}






