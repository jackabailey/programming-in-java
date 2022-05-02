// A class which defines a circle...

public class Circle {
    private double radius;
    public Circle(double input) throws IllegalArgumentException{     
        if (input <= 0){
            throw new IllegalArgumentException("Invalid radius"); // Throws an error with my custom exception
        }     
        this.radius = input;
    }
    public Circle(){
        this.radius = 1.0;
    }
    public double getRadius(){
        return this.radius;
    }
    public double area(){
        double radius = getRadius();
        double area = Math.PI * (radius * radius);
        return area;
    }
    public double perimeter(){
        double radius = getRadius();
        double perimeter = 2 * (Math.PI * radius);
        return perimeter;
    }
    public String toString(){
        String str = "Circle(radius=";
        str += String.format("%.4f", radius);
        str += ")";
        return str;
    }

    public boolean equals(Circle obj){
        if ((radius == obj.radius) || ((radius - obj.radius) < 0.00005)){
            return true;
        }
        return false;
    }
}