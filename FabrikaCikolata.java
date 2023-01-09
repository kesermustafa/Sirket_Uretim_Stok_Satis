package devtim;

public class FabrikaCikolata {

    public static double cikolata = 13.99;

    public static double cikolataGelir;

    public int uretim( int uretilen){
        DepoStok.cikolataStokAdet+=uretilen;
        return DepoStok.cikolataStokAdet;
    }

    public int satis(int satis){
        DepoStok.cikolataStokAdet-=satis;
        cikolataGelir += (cikolata*satis);

        return DepoStok.cikolataStokAdet;

    }

}
