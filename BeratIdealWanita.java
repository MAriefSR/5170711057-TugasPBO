package pkg5170711057.tugaspbo;

  class BeratIdealWanita extends Manusia {

    @Override
    protected void tinggiTubuh() {
        System.out.println("->Berat ideal Wanita sesuai Tinggi Tubuh yang diinputkan "
        );
    }

    ;
    
    protected double beratIdealW(double tinggi) {

        return (tinggi-100)-((tinggi-100)*15/100);
    }
}
