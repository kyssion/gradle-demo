package demo;

public class App {

    public String getGreeting(){
        return "hello world";
    }

    public static void main(String[] args) {
        System.out.println(new App().getGreeting());
    }
}
