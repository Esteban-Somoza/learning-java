package rectangle;

public class Rectangle {
    private double width;
    private double height;

    public Rectangle(){
        this (1.0, 1.0);
    }

    public Rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }

    public double getArea(){
        return this.width * this.height;
    }

    public double getPerimeter(){
        return 2 * (this.height + this.width);
    }
    // 

    public double getWidth() {
        return this.width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return this.height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    
}

