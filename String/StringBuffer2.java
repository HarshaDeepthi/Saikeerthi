package String;

public class StringBuffer2 {
    public static void main(String[] args){
        StringBuffer s=new StringBuffer("Keerthi");
        s.append("Sai");
        System.out.println(s);
        s.insert(2,"Sai");
        System.out.println(s);
        s.replace(0,3,"Char");
        System.out.println(s);
    }
}
