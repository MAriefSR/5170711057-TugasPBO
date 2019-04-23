 
package pkg5170711057.tugaspbo;

import java.util.Scanner;
 
 class TugasPBO {

  
  public static void main(String[] args) {double  tinggi;
    float p,w;
   
        Manusia tubuh = new Manusia();
        BeratIdealPria ideal = new BeratIdealPria();
        BeratIdealWanita ide = new BeratIdealWanita();
        
        
        tubuh.tinggiTubuh();
        
        tinggi= tinggiBadan();
        ideal.tinggiTubuh();
       
        p=(float) ideal.beratIdealP(tinggi);
         w=(float) ide.beratIdealW(tinggi);
         
              System.out.println("jika tinggi Pria = "+tinggi+" Cm Maka berat "
                      + "badan yang idealnya adalah "+p+ " Kg");
               
       
                  
              System.out.println("");
              ide.tinggiTubuh();
              System.out.println("jika tinggi Wanita = "+tinggi+" Cm Maka berat"
                      + " badan yang idealnya adalah "+w+ " Kg");
        
    }
      protected static double tinggiBadan() {
        double tinggi;
        Scanner baca = new Scanner(System.in);
        System.out.print("Masukkan tinggi Badan (cm) : ");
        tinggi = baca.nextDouble();

        return tinggi;
      }
    
}
