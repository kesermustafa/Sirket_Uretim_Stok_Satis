package devtim;

public class FabrikaBiskivi {

    public static double bikuvi = 3.75;

    public static double biskivuGelir;


    public int uretim( int uretilen){
        DepoStok.biskuviStokAdet+=uretilen;
        return DepoStok.biskuviStokAdet;
    }


    public int satis(int satis){
        DepoStok.biskuviStokAdet-=satis;
        biskivuGelir = biskivuGelir + (bikuvi*satis);
        return DepoStok.biskuviStokAdet;
    }




}
