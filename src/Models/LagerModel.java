package Models;

public class LagerModel {
   private String varenummer;
   private String varenavn;
   private Float antal;
   public static int alder=10;

    public LagerModel(String varenummer, String varenavn, Float antal) {
        this.varenummer = varenummer;
        this.varenavn = varenavn;
        this.antal = antal;
    }

    public static void main(String[] args) {
        System.out.println(alder);
    }


}
