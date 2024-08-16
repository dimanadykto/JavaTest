package SuperThis;

public class Animal {

    String name;
    int age;

    public Animal() {}
    public Animal(int age, String name) {
        this.age = age;
        this.name = name;
    }
    public void makeNoise() {
        System.out.println("Hello, i am an animal");
    }

    public void eat() {
        System.out.println("Munch Munch");
    }
}
