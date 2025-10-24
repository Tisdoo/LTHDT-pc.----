public class Nhao extends BDS {
    public int solau;
    public Nhao(double Chieudai, double Chieurong, String Maso, int solau)
    {
super(Chieudai,Chieurong,Maso);
this.solau=solau;


    }
    @Override
    public double giaban()
    {
return dienTich()*10000+solau*100000;

    }
}
