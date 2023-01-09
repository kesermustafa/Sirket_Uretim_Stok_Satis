package devtim;

public class Muhasebe {

    public static double toplamGelir;


    public double maasOde(double maas){
        toplamGelir -= maas;
        return toplamGelir;
    }

    public double krediAl(double kredi){
        toplamGelir+=kredi;
        return toplamGelir;
    }

    public double borcOde(double borc){
        toplamGelir -=borc;
        return toplamGelir;
    }




}
