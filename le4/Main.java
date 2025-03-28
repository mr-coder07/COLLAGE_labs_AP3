
public class Main {
    public static void main(String[] args) {
        Bevreges b = new Wiskey();
        b.template_method(30); 

        b = new Beer();
        b.template_method(200);
    }
}
