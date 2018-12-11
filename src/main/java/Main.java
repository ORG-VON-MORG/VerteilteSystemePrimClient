import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) {

        Main main = new Main();

            //Startet die Abfrage
             main.start();

    }

    private void start(){
        //Wird in der while Schlleife
        boolean  functionBool = true;

        while (functionBool){

            try {
                functionBool =  function();
           }catch (Exception e){
                System.out.println("Allgemeiner Fehler. Programm wird neu gestartet");
           }




        }

    }

    //Dialog Methode
    private boolean function() throws IOException {

        //PrimzahlServer wird instanziert. Die Klasse führt die REST Abfrage mittels HTTP und dem Verb get
        //aus
        PrimzahlService  primzahlService = new PrimzahlService();
        //Input und BufferReader für die Konsoleneingaben auszulesen
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        //Wird auf false gesetzt um die Schleife zu verlassen
        boolean function = true;

        //Parameter für die Anzahl der Primzahlen
        int prims = 0;

        //Abfrageformat: 1 als String, 2 als int Array, 3 Datenstruktur (Kombination aus 1 und 2)
        int returnFormat = 0;

        //URI Beispiel: http://localhost:3343
        String uri;

        //Endpoint Beispiel /primzahl
        String endpoint;

        //String mit dem Ergebnis
        String result;
        String exitProgram;


        System.out.println("Hallo,\ndieses Programm berechnet aufsteigend alle Primzahlen, bis zu einem gewünschten Wert");
        System.out.println("Zum Beenden des Programmes kann -1 eingegeben werden");

        System.out.println("Bitte geben Sie die URI an.");
        uri = br.readLine();

        System.out.println("Bitte geben Sie den Endpoint an.");
        endpoint = br.readLine();

        while (function) {


            System.out.println("Geben Sie bitte ein, wie viele Primzahlen berechnet werden sollen. Der Wert muss >= 1 sein.");

            //Einlesen von
            String eingabe_2 = br.readLine();
            prims = Integer.parseInt(eingabe_2);


            System.out.println("Die ersten " + prims + " Primzahlen sollen berechnet werden.");

            System.out.println("Geben Sie bitte ein, in welcher Form die Ausgabe erfolgen soll");
            System.out.println("Geben Sie 1 ein, um die Augabe in einem String zu erhalten");
            System.out.println("Geben Sie 2 ein, um die Ausgabe in einem Int Array zu erhalten");
            System.out.println("Geben Sie 3 ein, um die Ausgaben in einer Datenstruktur 2zu erhalten");


            returnFormat = Integer.parseInt(br.readLine());


            result = primzahlService.request(endpoint, uri, prims, returnFormat);
            System.out.println(result);

            System.out.println("Soll das Programm beendet werden: Bitte j eingeben");
            exitProgram = br.readLine();
            if(exitProgram.equalsIgnoreCase("j")){
                //Schleife wird beendet
                function = false;
            }
        }


        return false;
    }}








