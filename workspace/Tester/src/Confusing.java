public class Confusing {
    public static void main(String[] args) {
        method2();
        method1();
        method3();
        method2();
    }
    
    public static void method2() {
        method1();
        System.out.println("I am method 2.");
    }
    
    public static void method3() {
        method2();
        System.out.println("I am method 3.");
        method1();
    }
    
    public static void method1() {
        System.out.println("I am method 1.");
    }
}