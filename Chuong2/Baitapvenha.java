public class Baitapvenha {
    public static void main(String[] args) {
        // Vận động viên
        VanDongVien vdv = new VanDongVien();
        System.out.println("Nhap thong tin VDV:");
        vdv.nhap();

        if (!vdv.thoiGianHopLe()) {
            System.out.println("Thoi gian nhap khong hop le");
            return;
        }

        System.out.println("\nThong tin van đong vien:");
        vdv.xuat();
//Hình chữ nhật
        HCN2 hcn = new HCN2();
        System.out.println("Nhap thong tin hinh chu nhat:");
        hcn.nhap();

        System.out.println("\nThong tin ban dau:");
        hcn.xuat();

        System.out.println("\nThay doi kich thuoc: tang 2 chieu len 3 va 4");
        hcn.changeSize(3, 4, 1);
        hcn.xuat();

        System.out.println("\nTao HCN moi de cong vao:");
        HCN2 hcnn = new HCN2(2, 2);
        hcn.changeSize(hcnn, 1);
        hcn.xuat();

        System.out.println("\nGiam kich thuoc bang HCN moi:");
        hcn.changeSize(hcnn, 0);
        hcn.xuat();
        //Thời gian
        Time t1 = new Time(19, 30, 45);
        //Lưu lại tg gốc
                int gioGoc = t1.getGio();
                int phutGoc = t1.getPhut();
                int giayGoc = t1.getGiay();
        
        //Thời gian ban đầu
                System.out.print("Thoi gian ban dau (24h): ");
                t1.xuat24h();
                System.out.print("Thoi gian ban dau (12h): ");
                t1.xuat12h();
        //Tăng h thông thường
                System.out.println("\nTang 3600 giay:");
                t1.tangGio(3600);
                t1.xuat24h();
        //Giảm h thông thường
                t1 = new Time(gioGoc, phutGoc, giayGoc);
                System.out.println("Giam 3600 giay:");
                t1.giamGio(3600);
                t1.xuat24h();
        //Tăng giảm h theo dạng 12h
                t1 = new Time(gioGoc, phutGoc, giayGoc);
                System.out.println("\nTang 3600 giay theo 12h:");
                t1.tangGio(3600, "12");
        
                t1 = new Time(gioGoc, phutGoc, giayGoc);
                System.out.println("Giam 3600 giay theo 12h:");
                t1.giamGio(3600, "12");
        //Tăng giảm h theo dạng 24h
                t1 = new Time(gioGoc, phutGoc, giayGoc);
                System.out.println("\nTang 3600 giay theo 24h:");
                t1.tangGio(3600, "24");
        
                t1 = new Time(gioGoc, phutGoc, giayGoc);
                System.out.println("Giam 3600 giay theo 24h:");
                t1.giamGio(3600, "24");
    }
}
