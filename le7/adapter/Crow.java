// Crow class (Adaptee)
public class Crow implements Bird {
    @Override
    public void fly() {
        System.out.println("Crow is flying.");
    }

    @Override
    public void sing() {
        System.out.println("Crow is crying.");
    }
    
    @Override
    public void eat() {
        System.out.println("Crow is eating pearls.");
    }
}


