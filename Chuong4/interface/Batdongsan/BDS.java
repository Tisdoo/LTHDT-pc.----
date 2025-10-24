abstract public  class BDS {
    protected double Chieurong;
    protected double Chieudai;
    protected String Maso;
    
    abstract public double  giaban();
    public BDS(double Chieudai, double Chieurong, String Maso){
this.Chieudai=Chieudai;
this.Chieurong=Chieurong;
this.Maso=Maso;


    }
public double dienTich()
{
    return Chieudai*Chieurong;
}
}
