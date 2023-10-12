package rw.ac.rca.age;

public class Triangle extends Shape{
    public Triangle(){
        super("Yellow", 12, 23);
    }

    @Override
    public void area() {
        System.out.println("The area is" + dime * dimb);
    }
}
