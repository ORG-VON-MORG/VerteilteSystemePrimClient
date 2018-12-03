import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;

public class Main {

    public static void main(String[] args){

        String parameter[] = new String[3];
        parameter[0] = "http://localhost:4434";
        parameter[1] = "10";

        Main main = new Main();
        main.start(parameter);
    }



    private void start(String[] args){
        if(args.length == 0|| args[0].equalsIgnoreCase("help")){

            System.out.printf("" +
                    "Client zum Berechnen von Primzahlen %n" +
                    "---------------------------------- %n" +
                    "Parameter: " +
                    "<IP-Adresse Server> [1|2|3] %n" +
                    "Das erste Argument, welches übergeben wird, ist die IP-Adresse der Servers %n" +
                    "1: Primzahlen werden als Int Array zurueckgeben %n" +
                    "2: Primzahlen werden als String zurückgegeben %n" +
                    "3: Primzahlen als Datenstruktur %n" +
                    "" +
                    "" +
                    "" +
                    "");
        }

        if(args.length >= 2){
            PrimzahlService primzahlService = new PrimzahlService();
            String result = primzahlService.request(args[0],Integer.parseInt(args[1]));
            System.out.println(result);
        }





    }


}
