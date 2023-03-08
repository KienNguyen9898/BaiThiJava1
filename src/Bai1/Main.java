package Bai1;

public class Main {
    public static void main(String[] args) {
        Circle c1 = new Circle(2);
        System.out.println("Chu vi hinh tron c1: "+ c1.getCircumference());
        System.out.println("Dien tich hinh tron c1: "+c1.getArea());
        Circle c2 = new Circle(-1);
        System.out.println("Chu vi hinh tron c2: "+ c2.getCircumference());
        System.out.println("Dien tich hinh tron c2: "+c2.getArea());

    }
}
