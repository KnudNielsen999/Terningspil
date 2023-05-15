import Terning.OpretTerning;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

public class YatzySpil {
    public  void Startyatzy() {
        boolean toSeksere = false;
        int tael=0;
        double sumialt=0;
        double snit=0;

       // DecimalFormat df = new DecimalFormat("#.##");
        DecimalFormat df = new DecimalFormat("#.00", DecimalFormatSymbols.getInstance(Locale.ENGLISH));

        //String GennemsnitSnit = df.format(snit);

        while (!toSeksere) {
            OpretTerning udskriv = new OpretTerning();
            toSeksere = udskriv.getTerning1() == 6 & udskriv.getTerning2() == 6;
            udskriv.udskrivTerninger();
            tael +=1;
            sumialt +=udskriv.getTerning1()+udskriv.getTerning2();
            snit =sumialt/tael;

        }
        String GennemsnitSnit = df.format(snit);
        System.out.println("der skulle bruges antal "+tael+" kast  gennemsnittet af alle 2 terninger ="+GennemsnitSnit);
        HjalpeKlasse.skrivHilsen();
        double belob =300.0;
        HjalpeKlasse beregnMoms = new HjalpeKlasse();
        double moms=beregnMoms.beregnMoms(belob);
        String momsFormat = df.format(moms);
        System.out.println("moms udgør "+momsFormat);



    }
}
