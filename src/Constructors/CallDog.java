package Constructors;

public class CallDog {
    public static void main(String[] args) {
        Dog myDog = new Dog("dima",17); //Constructors are used to initialize the state of an object. They typically set initial values for the object's fields.
        System.out.println(myDog.age + " " + myDog.name);

    }

}
