// Adapter for Princess to make her behave like a Bird
public class PrincessAdapter implements Bird {
    private Princess princess;

    public PrincessAdapter(Princess princess) {
        this.princess = princess;
    }

    @Override
    public void fly() {
        // Princess doesn't fly, but we can print a message
        System.out.println("Princess cannot fly.");
    }

    @Override
    public void sing() {
        princess.sing(); // Princess sings just like the bird
    }
    
    @Override
    public void eat() {
        // we can print a message
        System.out.println("Princess cannot eat.");
    }
}
