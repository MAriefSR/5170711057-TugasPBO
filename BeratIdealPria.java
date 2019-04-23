package pkg5170711057.tugaspbo;

 class BeratIdealPria extends Manusia {

    @Override
   protected  void tinggiTubuh() {System.out.println("");System.out.println("");
        System.out.println("->Berat ideal pria sesuai Tinggi Tubuh yang diinputkan");
    }

    ;
    
    protected double beratIdealP(double tinggi) {

        return (tinggi-100)-((tinggi-100)*10/100);
    }
}
