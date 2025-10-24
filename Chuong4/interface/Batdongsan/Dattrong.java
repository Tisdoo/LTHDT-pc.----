public class Dattrong extends BDS {
    public Dattrong(double Chieudai, double Chieurong, String Maso){
    super(Chieudai,Chieurong,Maso);

}
@Override
public double giaban(){

return dienTich()*1000;

}
}
