import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;

public class PrimzahlService {


    public static String request(String endpoint, String baseUrl, int parameter, int returnForm){

        int queryType = parameter;


        Client client = ClientBuilder.newClient();
        WebTarget target = client.target(baseUrl);

        String result = target.path(endpoint)
                .queryParam("parameter", parameter)
                .queryParam("returnForm", returnForm)
                .request(MediaType.APPLICATION_JSON).get(String.class);

        System.out.println(result);
        return result;
    }



}
