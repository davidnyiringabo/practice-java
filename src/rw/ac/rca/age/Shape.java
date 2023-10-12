package rw.ac.rca.age;

public class Shape {
    protected String color;
    protected int dime;
    protected int dimb;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getDime() {
        return dime;
    }

    public void setDime(int dime) {
        this.dime = dime;
    }

    public int getDimb() {
        return dimb;
    }

    public void setDimb(int dimb) {
        this.dimb = dimb;
    }

    public void area(){
        System.out.println("I don't have details.");
    };

    public Shape(String color, int dime, int dimb) {
        this.color = color;
        this.dime = dime;
        this.dimb = dimb;
    }

    public Shape(){};

    @Override
    public String toString() {
        return "Shape{" +
                "color='" + color + '\'' +
                ", dime='" + dime + '\'' +
                ", dimb='" + dimb + '\'' +
                '}';
    }
}
