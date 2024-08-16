package SuperThis;

public class Super {
    public static void main(String[] args) {

        Cat myCat = new Cat(3,"Johny","poop");
        System.out.println("Hello my name is " + myCat.name + " , i am " + myCat.age + " years of age, and i like to eat " + myCat.catFoodPreference);
        myCat.makeNoise();
        myCat.eat();
        //update test words
    }
}
