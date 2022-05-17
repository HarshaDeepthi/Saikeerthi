package Switch.java;

public class Test {
    public static void main(String[] args){
        int number=44;
        String size;
        switch (number){
            case 29:
                size="Small";
                break;
            case 44:
                size="Large";
                break;
            default:
                size="Unknown";
                break;
        }
        System.out.println("Size:"+size);
    }
}
