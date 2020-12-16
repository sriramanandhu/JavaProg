/* 15. Implement multiple inheritance in java with one class 
and one interface (use your own class and interface)
Ref.: https://www.tutorialspoint.com/multiple-inheritance-by-interface-in-java */

interface AnimalEat {
    void eat();
}

interface AnimalTravel {
    void travel();
}

class Animal implements AnimalEat, AnimalTravel {
    public void eat() {
        System.out.println("Animal is eating");
    }

    public void travel() {
        System.out.println("Animal is travelling");
    }
}

public class MultiInheritanceDemo {
    public static void main(String[] args) {
        Animal a = new Animal();
        a.eat();
        a.travel();
    }
}
