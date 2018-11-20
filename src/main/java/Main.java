import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;

public class Main {

    public static void main(String[] args){

        String queryType = args[0];
        String baseUrl = "http://localhost:6006";
        String webContextPath="/primzahl";

        Client client = ClientBuilder.newClient();
        WebTarget target = client.target(baseUrl);

        String result = target.path(webContextPath)
                .queryParam("name", name)
                .request(MediaType.TEXT_PLAIN).get(String.class);
    }
}
