package task.three;

import org.json.JSONObject;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

/**
 * Create by Imperator on 13.10.2022
 */

public class KanyeService {

    public final static String KAYNE_API_URI = "https://api.kanye.rest/";

    public String getKanyeWestQuotes() throws URISyntaxException, IOException, InterruptedException {
        HttpRequest request = HttpRequest.newBuilder()
                .uri(new URI(KAYNE_API_URI))
                .version(HttpClient.Version.HTTP_2)
                .GET()
                .build();

        HttpResponse<String> response = HttpClient.newBuilder()
                .build()
                .send(request, HttpResponse.BodyHandlers.ofString());

        return response.body();
    }

    public String quot() throws URISyntaxException, IOException, InterruptedException {
        JSONObject jsonObject = new JSONObject(getKanyeWestQuotes());
        return jsonObject.getString("quote");
    }


}
