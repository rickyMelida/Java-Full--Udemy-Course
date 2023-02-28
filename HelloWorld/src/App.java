import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el primer numero: ");
        int num1 = scanner.nextInt();

        System.out.println("Ingrese el segundo numero: ");
        int num2 = scanner.nextInt();

        System.out.println("Ingrese el tercer numero: ");
        int num3 = scanner.nextInt();

        LogicsOperators logic = new LogicsOperators("");

        System.out.println(logic.NumeroMayor(num1, num2, num3));
    }
}
