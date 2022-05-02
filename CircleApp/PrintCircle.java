// A demonstration file for use alongside the Circle.Java program

import java.util.Scanner;

public class PrintCircle {
    public static void main(String[] args) {

        Scanner stdin = new Scanner( System.in );

        System.out.printf("Enter Circle Radius: ");

        double input = stdin.nextDouble();

        stdin.close();

        Circle c = new Circle(input);

        System.out.println("Radius = " + c.getRadius());
        System.out.println("Perimeter = " + c.perimeter());
        System.out.println("Area = " + c.area());
    }
}