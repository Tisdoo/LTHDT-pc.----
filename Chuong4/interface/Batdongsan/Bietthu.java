public class Bietthu extends BDS implements phikd {
    public Bietthu(double Chieudai, double Chieurong,String Maso){
        super(Chieudai,Chieurong,Maso);
    }
@Override
public double phikinhdoanh(){
return dienTich()*400000;
}
@Override
public double giaban()
{


    return dienTich()*1000;

}
}
