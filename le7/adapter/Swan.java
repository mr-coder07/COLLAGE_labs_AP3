// Swan class (Adaptee)
public class Swan implements Bird {
    @Override
    public void fly() {
        System.out.println("Swan is flying.");
    }

    @Override
    public void sing() {
        System.out.println("Swan is singing.");
    }
    
    @Override
    public void eat() {
        System.out.println("Swan is eating.");
    }
}