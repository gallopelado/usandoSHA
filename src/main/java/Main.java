import com.google.common.hash.Hashing;
import com.google.gson.Gson;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Ciudad c1 = new Ciudad();
        c1.setCodigo_ciudad("01");
        c1.setNombre_ciudad("villa elisa");

       Ciudad c2 = new Ciudad();
        c2.setCodigo_ciudad("02");
        c2.setNombre_ciudad("fernando de la mora");

        Ciudad c3 = new Ciudad();
        c3.setCodigo_ciudad("03");
        c3.setNombre_ciudad("villeta");

        List<Ciudad> lista = new ArrayList<>();
        lista.add(c1);
        lista.add(c2);
        lista.add(c3);

        String datos = new Gson().toJson(lista);
        String shashasha = Hashing.sha256()
                        .hashString(datos, StandardCharsets.UTF_8).toString();
        System.out.println(datos);
        System.out.println(shashasha);
    }
}
