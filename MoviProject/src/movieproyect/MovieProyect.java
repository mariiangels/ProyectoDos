package movieproyect;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 *
 * @author n
 */

    /**
     * @param args the command line arguments
     */
   
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import org.json.JSONArray;
import org.json.JSONObject;

public class MovieProyect {

 public static void main(String[] args) {

        try {
            // Configura tu clave de API de TMDb
            String apiKey = "1e06b5db7677d5edf1c81d7f19f93735";

            // URL de la API de TMDb para obtener películas populares
            String apiUrl = "https://api.themoviedb.org/3/movie/popular?api_key=1e06b5db7677d5edf1c81d7f19f93735";

            // Construye la URL con la clave de API
            URL url = new URL(apiUrl + "1e06b5db7677d5edf1c81d7f19f93735" + apiKey);

            // Realiza la conexión HTTP
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");

            // Lee la respuesta
            BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            StringBuilder response = new StringBuilder();
            String line;

            while ((line = reader.readLine()) != null) {
                response.append(line);
            }
            reader.close();

            // Analiza la respuesta JSON
            JSONObject jsonResponse = new JSONObject(response.toString());

            // Obtiene la lista de películas desde la respuesta
            JSONArray results = jsonResponse.getJSONArray("results");

            // Muestra los nombres de las películas
            for (int i = 0; i < results.length(); i++) {
                JSONObject movie = results.getJSONObject(i);
                System.out.println("Título: " + movie.getString("title"));
            }

            // Cierra la conexión
            connection.disconnect();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}