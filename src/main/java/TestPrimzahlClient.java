public class TestPrimzahlClient {


    public static void test(){
        PrimzahlService primzahlService = new PrimzahlService();
        primzahlService.request("localhost/primzahl", 100, 1);
    }
}
