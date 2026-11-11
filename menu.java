import java.util.LinkedList;
import java.util.Scanner;

public class menu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        utilidades u = new utilidades();
        Importar i = new Importar();
        ImportarJson ij = new ImportarJson();
        LinkedList<objVenta> l = new LinkedList<>();
        LinkedList<objVenta> lj = new LinkedList<>();
        l = i.ImportarArchivo();
        lj = ij.Importar("Ventas");
        boolean seguir = true;
        while (seguir) {
            switch (u.menu(sc)) {
                case 1:
                    l = u.LLenaLista(l, sc);
                    break;
                case 2:
                    System.out.println("pagina en mantenimiento");

                    break;

                case 3:
                    System.out.println("pagina en mantenimiento");
                    break;

                case 4:
                    System.out.println("pagina en mantenimiento");
                    break;

                case 5:
                    System.out.println("pagina en mantenimiento");
                    break;

                case 6:
                    System.out.println("pagina en mantenimiento");
                    break;

                case 7:
                    seguir = false;
                    break;

                default:
                    System.out.println("esta opcion no esta disponible por favor valide ");
                    break;
            }
        }
    }
}
