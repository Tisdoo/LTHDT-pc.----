public class Khachsan extends BDS implements phikd {
    protected int sosao;
    public Khachsan(double Chieudai, double Chieurong,String Maso,int sosao){
        super(Chieudai,Chieurong,Maso);
        this.sosao=sosao;
    }
@Override
public double phikinhdoanh(){
return 100000+sosao*50000;
}
@Override
public double giaban()
{


    return Chieurong*5000;

}

}
