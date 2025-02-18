class Parent {}
class Child extends Parent {}

public class Classcast {
    public static void main(String[] args) {
        Parent obj = new Child();

        if (obj instanceof Child) {
            Child childObj = (Child) obj;
            System.out.println("Casting successful.");
        } else {
            System.out.println("Invalid casting, prevented!");
        }
    }
}
