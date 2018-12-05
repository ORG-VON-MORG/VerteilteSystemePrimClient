import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;

public class PrimzahlService {


    public String request(String url, int parameter, int returnForm){
        final String ENDPOINT = "/primzahl";
        int queryType = parameter;
        String baseUrl = "http://localhost:4434";
        //String baseUrl = url;


        Client client = ClientBuilder.newClient();
        WebTarget target = client.target(baseUrl);

        String result = target.path(ENDPOINT)
                .queryParam("parameter", parameter)
                .queryParam("returnForm", returnForm)
                .request(MediaType.APPLICATION_JSON).get(String.class);

        System.out.println(result);
        return result;
    }



}
