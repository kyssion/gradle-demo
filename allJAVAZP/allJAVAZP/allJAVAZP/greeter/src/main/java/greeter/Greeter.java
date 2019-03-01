package greeter;

public class Greeter {
    public static void main(String[] args) {
        final String output = GreetingFormatter.greeting("hello world");
        System.out.println(output);
    }
}