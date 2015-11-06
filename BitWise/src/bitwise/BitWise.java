package bitwise;

public class BitWise {

    public static void main(String[] args) {
        if(b1() || b2()) // (|| and &&) 
            System.out.println("true");
        else
            System.out.println("false");
        System.out.println("-----------------");
        if(b1() | b2())
            System.out.println("true");
        else
            System.out.println("false");
    }
    
    static boolean b1() {
        System.out.println("b1 ...");
        return true;
    }
    
    static boolean b2() {
        System.out.println("b2 ...");
        return false;
    }
}
