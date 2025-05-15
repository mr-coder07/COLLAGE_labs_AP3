public class Main {
    public static void main(String[] args) {
        // Create instances of different birds
        Bird crow = new Crow();
        Bird swan = new Swan();
        
        // Create an instance of Princess
        Princess princess = new Princess();
        Bird princessAdapter = new PrincessAdapter(princess);

        // Demonstrating the functionality of different birds and Princess (via Adapter)
        System.out.println("Crow:");
        crow.fly();
        crow.sing();
        crow.eat();
        
        System.out.println("\nSwan:");
        swan.fly();
        swan.sing();
        swan.eat();
        
        System.out.println("\nPrincess (via Adapter):");
        princessAdapter.fly(); // Princess doesn't fly, but it's part of the interface
        princessAdapter.sing(); // Princess sings beautifully
        princessAdapter.eat();
    }
}
