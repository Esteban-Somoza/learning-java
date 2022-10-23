package rectangle;

import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Rectangle[] rectangles = new Rectangle[3];

        Scanner input = new Scanner(System.in);
        for (int i = 0; i < rectangles.length; i++) {
            System.out.println("enter width + height? (y/n)");

            char choice = input.next().charAt(0); // y/n
            if (choice == 'y') {
                System.out.println("pick height");
                double x = input.nextDouble();
                System.out.println("pick width");
                double y = input.nextDouble();
                rectangles[i] = new Rectangle(x, y);
            } else
                rectangles[i] = new Rectangle();
        }
        input.close();

        System.out.println("The Rectangles are:");
        for (int i = 0; i < rectangles.length; i++) {
            System.out.println(
                    "Rectangle " + (i + 1) +
                            ": width: " + rectangles[i].getWidth() +
                            ":height: " + rectangles[i].getHeight());
        }
    }
}

// class Rectangle {
// double width = 1.0;
// double height = 1.0;

// Rectangle(double x, double y){
// width = x;
// height = y;
// }

// public double getArea(){
// return width * height;
// }

// public double getPerimeter(){
// return (width + height)*2;
// }

// public void setWidth(double x){
// width = x;
// }

// public void setHeight(double y){
// height = y;
// }

// public String getMeasures(){
// return "Width: " + width + " Height: " + height;
// }
// }