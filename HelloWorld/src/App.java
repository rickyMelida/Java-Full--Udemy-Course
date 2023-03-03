import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        String[] names = { "Andres", "Pepe", "Maria", "Paco", "Lalo", "Bea", "Pato", "Pepa" };

        Iterators ite = new Iterators(names);
        //ite.SimpleIteration();

        ite.SearchName();

    }
}
