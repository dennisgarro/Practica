import java.util.Scanner;

public class validaciones {
    public int ValidaEntero(Scanner sc) {
        while (!sc.hasNextInt()) {
            System.out.println("por favor Ingrese un digito numerico");
            sc.next();
        }
        return sc.nextInt();
    }

    public Double ValidarDecimal(Scanner sc) {
        while (!sc.hasNextDouble()) {
            System.out.println("por favor Ingrese un digito numerico");
            sc.next();
        }
        return sc.nextDouble();
    }
}
