package Classes;

public class Main {
    public static void main(String[] args) {
        // Instances of Cookie class
        Cookie cookie1 = new Cookie("green");
        Cookie cookie2 = new Cookie("red");
        Cookie cookie3 = new Cookie("yellow");

        // Set cookie 2 color to blue
        cookie2.setColor("blue");

        // Printing color of Cookie class
        System.out.println("Cookie 1: " + cookie1.getColor());
        System.out.println("Cookie 2: " + cookie2.getColor());
        System.out.println("Cookie 3: " + cookie3.getColor());
    }
}
