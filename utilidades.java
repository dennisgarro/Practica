import java.util.LinkedList;
import java.util.Scanner;

public class utilidades {
    validaciones v = new validaciones();
    Exportar e = new Exportar();

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

    public LinkedList<objVenta> LLenaLista(LinkedList<objVenta> l, Scanner sc) {

        objVenta o = new objVenta(NumeroFactura(l), PedirNombre(sc, 1), PedirNombre(sc, 2), TotalVenta(sc, v),
                DatosEnteros(sc, 1), 1);
        l.add(o);
        e.exportarArchivo(l, 1);
        ExportarJson ej = new ExportarJson();
        ej.exportarJson(l);

        return l;

    }

    public static int NumeroFactura(LinkedList<objVenta> l) {
        return l.size() + 1;
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
