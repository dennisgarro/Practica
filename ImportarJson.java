import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.LinkedList;

public class ImportarJson {
    public LinkedList<objVenta> Importar(String nombreArchivo) {
        LinkedList<objVenta> l = new LinkedList<>();
        Gson gson = new Gson();

        try (FileReader reader = new FileReader(nombreArchivo + ".json")) {
            Type tipo = new TypeToken<LinkedList<objVenta>>() {
            }.getType();
            LinkedList<objVenta> lista = gson.fromJson(reader, tipo);

            for (objVenta o : lista) {
                l.add(o);
            }
            System.out.println("Archivo Importado Correctamente");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return l;
    }
}