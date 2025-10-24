public class Nvien extends Nguoi{

    String manv;
    float hsl;
    float luong;

    public String getmanv(){
        return manv;
    }

    public void setmanv(String manv){
        this.manv=manv;
    }

    public float gethsl(){
        return hsl;
    }

    public void sethsl(float hsl){
        this.hsl=hsl;
    }

    public float getluong(){
        tinhluong();
        return luong;
    }

    public void setluong(float luong){
        tinhluong();
    }
    
    private void tinhluong(){
        luong=hsl*2000000;
    }
    public Nvien(){
        super();
        manv ="A001";
        hsl = 3.33f;
        tinhluong();
    }

    public Nvien(String cmnd, String hoten, String ns){
        super(cmnd, hoten, ns);
    }

    @Override
    public void xuat() {
        super.xuat();
        System.out.println("MaNV: " + manv + "Hsl: " + hsl + "Luong: " + luong);
    }
}

