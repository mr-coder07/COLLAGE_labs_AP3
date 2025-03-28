class Bevreges {
    protected void pour(int qty) { 
        System.out.println("Pour " + qty + "ml of the drink");
    }
    
    protected void addcondinment() {
        System.out.println("Add ice");
    }
    
    protected void stir() {
    }
    
    protected void serve() {
        System.out.println("Serve the drink");
    }

    public final void template_method(int qty) {
        pour(qty);
        addcondinment();
        stir();
        serve();
    }
}


