import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;

public class ExportarJson {
    public void exportarJson(LinkedList<objVenta> l) {

        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        try (FileWriter writer = new FileWriter("Ventas.json")) {
            gson.toJson(l, writer);
            System.out.println("Lista exportada correctamente a carros.json");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}