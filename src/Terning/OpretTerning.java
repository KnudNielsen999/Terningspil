package Terning;

import java.util.Random;


public class OpretTerning {
    private int terning1;
    private int terning2;

    
    public OpretTerning() {
        Random rand = new Random();
        this.terning1 = rand.nextInt(6) + 1;
        this.terning2 = rand.nextInt(6) + 1;

    }

    public int getTerning1() {
        return terning1;
    }

    public void setTerning1(int terning1) {
        this.terning1 = terning1;
    }

    public int getTerning2() {
        return terning2;
    }

    public void setTerning2(int terning2) {
        this.terning2 = terning2;
    }

    public void udskrivTerninger() {
        int terning= getTerning1();
        int terning2 =getTerning2();
        boolean toSeksere=false;

            System.out.println("terning 1= " + terning + " terning 2 = " + terning2 + " sunialt = " + (terning + terning2));
            toSeksere = terning == 6 && terning2 == 6;
            if (toSeksere) {
                System.out.println("2 seksere tillykke ");
            } else {
                System.out.println("desværre");
                ;
            }


        }
    }

