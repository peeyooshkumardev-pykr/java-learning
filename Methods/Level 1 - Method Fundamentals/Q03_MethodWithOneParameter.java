// Q03 — Method With One Parameter
// Create a method named greetUser() that accepts a name as a parameter and prints:

// Hello, Peeyoosh!

public class Q03_MethodWithOneParameter{
    public static void main(String[] args) {
        greetUser("Peeyoosh");
    }

    static void greetUser(String name){
        System.out.print("Hello "+ name);
    }
}