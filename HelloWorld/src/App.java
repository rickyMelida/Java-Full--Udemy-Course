import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el nombre del usuario: ");
        String user = scanner.next();
        System.out.println("Ingrese su password: ");

        String password = scanner.next();

        LogicOperatorLogin login = new LogicOperatorLogin();

        System.out.println(login.SigIn(user, password));

    }
}
