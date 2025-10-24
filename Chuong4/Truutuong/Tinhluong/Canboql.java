package Tinhluong;

public class Canboql extends Nhanvien {
private String chucvu;
private double hschucvu;
public Canboql(String ma, String ten, int nvl, double hsl,String chucvu,double hschucvu)
{
super(ma, ten, nvl, hsl);
this.chucvu=chucvu;
this.hschucvu=hschucvu;

}

public double tinhluong()
{


    return hsl*luongcoban+hschucvu*1100;
}
    @Override
public char Xeploai() {
    return 'A';
}
    
}