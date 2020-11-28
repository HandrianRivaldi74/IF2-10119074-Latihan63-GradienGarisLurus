/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if2.pkg10119074.latihan63.gradiengarislurus;

/**
 *
 * @author Acer
 * Nama     : Handrian Rivaldi
 * Kelas    : IF-2
 * NIM      : 10119074
 * Deskrifsi :
 */
public class IF210119074Latihan63GradienGarisLurus {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Koordinat koordinat1 = new Koordinat(2, 10, 5, 7);
        System.out.printf("Garis yang melalui titik (%d,%d) dan (%d,%d)%n",  koordinat1.getX1(), koordinat1.getY1(), koordinat1.getX2(), koordinat1.getY2());
        System.out.println("memiliki gradien sebesar " + koordinat1.hitungGradien());

        Koordinat koordinat2 = new Koordinat(5, 1, 3, 12);
        System.out.printf("Garis yang melalui titik (%d,%d) dan (%d,%d)%n",  koordinat2.getX1(), koordinat2.getY1(), koordinat2.getX2(), koordinat2.getY2());
        System.out.println("memiliki gradien sebesar " + koordinat2.hitungGradien());

    
    }
    
}
