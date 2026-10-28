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

}
