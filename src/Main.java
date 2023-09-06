
public class Main {
    public static void main(String[] args) {
        System.out.println();
        Elephant tolya = new Elephant("tolya", "1 may");
        Elephant kolya = new Elephant("Kolya", "1 may");
        tolya.feed();
        System.out.println();
        System.out.println(Elephant.getHobotCount());;
    }
}