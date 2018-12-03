import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;

public class PrimzahlService {


    public String request(String url, int parameter){
        final String ENDPOINT = "/primzahl";
        int queryType = parameter;
        //String baseUrl = "http://localhost:6006";
        String baseUrl = url;


        Client client = ClientBuilder.newClient();
        WebTarget target = client.target(baseUrl);

        String result = target.path(ENDPOINT)
                .queryParam("parameter", parameter)
                .request(MediaType.APPLICATION_JSON).get(String.class);

        return result;
    }



}
