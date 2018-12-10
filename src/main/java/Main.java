import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        TestPrimzahlClient.test();

        String parameter[] = new String[3];
        parameter[0] = "http://localhost:4434";
        parameter[1] = "10";
        parameter[2] = "2";

       // Main main = new Main();
        //main.start1(args);
//        try {
//            main.start();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        //main.start(parameter);
    }


    private void start1(String[] args) {
        if (args.length == 0 || args[0].equalsIgnoreCase("help")) {

            System.out.printf("" +
                    "Client zum Berechnen von Primzahlen %n" +
                    "---------------------------------- %n" +
                    "Parameter: " +
                    "<URI> prims [1|2|3] %n" +
                    "URI:       HTTP Adresse des Servers und Port sowie Endpoint. Beispiel: http://192.234.34.3:8080/endpoint %n" +
                    "prims:     Anzahl der zuberechenden Primzahlen %n" +
                    "1: Primzahlen werden als Int Array zurueckgeben %n" +
                    "2: Primzahlen werden als String zurückgegeben %n" +
                    "3: Primzahlen als Datenstruktur %n" +
                    "" +
                    "");
        }

        if (args.length >= 3) {
            PrimzahlService primzahlService = new PrimzahlService();
           String result = primzahlService.request(args[0],Integer.parseInt(args[1]), Integer.parseInt(args[2]));
            System.out.println(result);
        }

    }

    private void start() throws IOException {
        PrimzahlService  primzahlService = new PrimzahlService();
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        boolean function = true;
        int prims = 0;
        int returnFormat;


        System.out.println("Hallo,\ndieses Programm berechnet aufsteigend alle Primzahlen, bis zu einem gewünschten Wert");
        System.out.println("Zum Beenden des Programmes kann jederzeit -1 eingegeben werden");


        while (function) {

            System.out.println("Geben Sie bitte ein, wie viele Primzahlen berechnet werden sollen. Der Wert muss >= 1 sein.");

            String eingabe_2 = br.readLine();
            prims = Integer.parseInt(eingabe_2);

            if (prims >= 0) {
                System.out.println("Die ersten " + prims + " Primzahlen sollen berechnet werden.");
            } else if (prims == -1) {
                System.out.println("Das Programm wird beendet");
                function = false;
            } else {
                System.out.println("Bitte positive Zahl zur Berechnung eingeben");
            }

        }

        System.out.println("Geben Sie bitte ein, in welcher Form die Ausgabe erfolgen soll");
        System.out.println("Geben Sie 1 ein, um die Augabe in einem String zu erhalten");
        System.out.println("Geben Sie 2 ein, um die Ausgabe in einem Int Array zu erhalten");
        System.out.println("Geben Sie 3 ein, um die Ausgaben in einem ... zu erhalten");

        String eingabe_2 = br.readLine();
        returnFormat = Integer.parseInt(eingabe_2);


        if (returnFormat >= 0) {
            System.out.println("Die ersten " + prims + " Primzahlen werden ausgegeben.");
        } else if (returnFormat == -1) {
            System.out.println("Das Programm wird beendet");
            function = false;
        } else {
            System.out.println("Bitte positive Zahl zur Berechnung eingeben");
        }


        switch (returnFormat) {
            case 1:

                break;
            case 2: //Ausgabe als Int Array

                break;
            case 3: //Ausgabe als ....

            case -1: //Beenden
                function = false;

        }

    }


 }





