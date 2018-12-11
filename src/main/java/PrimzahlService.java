import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;

public class PrimzahlService {

    //Klasse führt die REST Anfrage aus
    public static String request(String endpoint, String baseUrl, int parameter, int returnForm){

        //Init von Client gemäß Vorleseung
        Client client = ClientBuilder.newClient();
        WebTarget target = client.target(baseUrl);

        String result = target.path(endpoint)
                .queryParam("parameter", parameter)  //Anzahl der ermittelten Primzahlen
                .queryParam("returnForm", returnForm) //Rückgabeform; 1 String, 2 int Array, 3 Datenstruktur
                .request(MediaType.APPLICATION_JSON).get(String.class); //Request wird an den Server geschickt
        return result;
    }



}
