/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul3;

import javax.swing.JOptionPane;
public class tugasprogram {
    public static void main(String[] args) {
        String a="";
        String b="";
        String c="";
     a=JOptionPane.showInputDialog("Masukkan Bilangan pertama Anda : ");
     int pertama = Integer.valueOf(a).intValue();
     b=JOptionPane.showInputDialog("Masukkan Bilangan kedua Anda : ");
     int kedua = Integer.valueOf(b).intValue();
     c=JOptionPane.showInputDialog("Masukkan Bilangan ketiga Anda : ");
     int ketiga = Integer.valueOf(c).intValue();
          int terbesar = 0;

             if (pertama > kedua && pertama > ketiga){
            terbesar = pertama; 
        }
        else if (kedua > pertama && kedua > ketiga){
            terbesar = kedua;
        }
        else if (ketiga > pertama && ketiga > kedua){
            terbesar = ketiga;
        }
        else if (pertama == kedua && pertama > ketiga){
            terbesar = pertama;
        }
        else if (kedua == ketiga && kedua > pertama){
            terbesar = ketiga;
        }
        else if (ketiga == pertama && ketiga > pertama){
        }
     int terkecil = 0;
             if (pertama < kedua && pertama < ketiga){
            terkecil = pertama; 
        }
        else if (kedua < pertama && kedua < ketiga){
            terkecil = kedua;
        }
        else if (ketiga < pertama && ketiga < kedua){
            terkecil = ketiga;
        }
        else if (pertama == kedua && pertama < ketiga){
            terkecil = pertama;
        }
        else if (kedua == ketiga && kedua < pertama){
            terkecil = ketiga;
        }
        else if (ketiga == pertama && ketiga < kedua){
            terkecil = ketiga;
        }


             String angka="";
             angka += "Bilangan pertama: " +pertama +"\n";
             angka += "Bilangan kedua: " +kedua +"\n";
             angka += "Bilangan ketiga: " +ketiga +"\n";
             angka += "Bilangan Terbesar: " +terbesar +"\n";
             angka += "Bilangan Terkecil: " +terkecil +"\n";
             JOptionPane.showMessageDialog(null, angka);

    }
    
}
