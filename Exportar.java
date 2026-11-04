import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;

public class Exportar {
    public void exportarArchivo(LinkedList<objVenta> l, int opt) {
        if (l.isEmpty()) {
            System.out.println("La lista esta vacia no se puede exportar el archivo");
            return;
        } else {
            try (FileWriter e = new FileWriter("Ventas.txt")) {
                for (objVenta obj : l) {
                    e.write("Numero Factura: " + obj.getNumeroFactura() + "\n");
                    e.write("Nombre Cliente: " + obj.getNombreCliente() + "\n");
                    e.write("Nombre Vendedor: " + obj.getNombreVendedor() + "\n");
                    e.write("Total Venta: " + obj.getTotalVenta() + "\n");
                    e.write("Cantidad Productos: " + obj.getCantidadProductos() + "\n");
                    e.write("Estado Venta: " + obj.getEstadoVenta() + "\n");
                    e.write("------------------------------------------------------ \n");

                }
                switch (opt) {
                    case 1:
                        System.out.println("Registo Ingresado Correctamente");
                        break;
                    case 2:
                        System.out.println("Registo Modificado Correctamente");
                        break;

                    default:
                        System.out.println("Archivo Exportado Correctamente");
                        break;
                }

            } catch (IOException e) {
                // TODO: handle exception
                e.printStackTrace();
            }
        }
    }
}