import java.io.BufferedReader;
import java.io.FileReader;
import java.util.LinkedList;

public class Importar {

    public LinkedList<objVenta> ImportarArchivo() {

        String rutaArchivo = "Ventas.txt";
        LinkedList<objVenta> l = new LinkedList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(rutaArchivo))) {

            String linea;
            objVenta obj = null;

            while ((linea = br.readLine()) != null) {

                if (linea.startsWith("Numero Factura:")) {

                    if (obj != null) {
                        l.add(obj);
                    }

                    obj = new objVenta();
                    obj.setNumeroFactura(Integer.parseInt(linea.substring(16).trim()));

                } else if (linea.startsWith("Nombre Cliente:")) {

                    if (obj != null) {
                        obj.setNombreCliente(linea.substring(15).trim());

                    }

                } else if (linea.startsWith("Nombre Vendedor:")) {

                    if (obj != null) {
                        obj.setNombreVendedor(linea.substring(15).trim());
                    }

                } else if (linea.startsWith("Total Venta:")) {

                    if (obj != null) {
                        obj.setTotalVenta(Double.parseDouble(linea.substring(13).trim()));
                    }

                } else if (linea.startsWith("Cantidad Productos:")) {

                    if (obj != null) {
                        obj.setCantidadProductos(Integer.parseInt(linea.substring(20).trim()));
                    }

                } else if (linea.startsWith("Estado Venta:")) {

                    if (obj != null) {
                        obj.setEstadoVenta(Integer.parseInt(linea.substring(14).trim()));
                        l.add(obj);
                        obj = null;
                    }
                }
            }

            System.out.println("Archivo importado correctamente.");

        } catch (Exception e) {

            System.out.println("Error al importar el archivo: " + e.getMessage());
            e.printStackTrace();
        }

        return l;
    }
}