import java.util.LinkedList;
import java.util.Scanner;

public class utilidades {
    validaciones v = new validaciones();

    public int menu(Scanner sc) {
        System.out.println("Bienvenido a la tienda de structuras noche");
        System.out.println("que desea realizar");
        System.out.println("1. Registrar una venta");
        System.out.println("2. Mostrar las ventas");
        System.out.println("3. Buscar una venta");
        System.out.println("4. Modificar una venta");
        System.out.println("5. Cancelar una venta");
        System.out.println("6. Eliminar una venta");
        System.out.println("7. Generar un informe");
        int num = v.ValidaEntero(sc);
        return num;

    }

    public LinkedList<objVenta> LLenaLista(LinkedList<objVenta> l) {
        boolean pedir = true;
        while (pedir) {

        }
    }

    public static int NumeroFactura(LinkedList<objVenta> l) {
        int UltimaFactura = l.size();
        return UltimaFactura++;
    }

    public String PedirNombre(Scanner sc, int opt) {
        switch (opt) {
            case 1:
                System.out.println("Ingres el nombre del cliente");
                break;

            default:
                System.out.println("Ingrese el nombre del vendedor");
                break;
        }
        return sc.next();

    }

    public static Double TotalVenta(Scanner sc, validaciones v) {
        System.out.println("Ingrese el total de la venta");
        return v.ValidarDecimal(sc);
    }

    public int DatosEnteros(Scanner sc, int opt) {
        switch (opt) {
            case 1:
                System.out.println("Ingrese la cantidad de productos");
                break;

            default:
                System.out.println("Ingrese el estado de la venta 1: registrado 0: cancelado 3: eliminado");
                break;
        }
        return v.ValidaEntero(sc);

    }

}
