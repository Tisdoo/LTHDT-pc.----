public class Main {
    public static void main(String[] args) {
        Monhoc mh1 = new Lythuyet("L01", "Lập trình Java", 3, 7.5, 8.0);
        Monhoc mh2 = new Thuchanh("T01", "Thực hành Java", 2, new double[] { 8.0, 7.0, 9.0, 8.5 });
        Monhoc mh3 = new Doan("D01", "Đồ án Java", 3, 9.0, 8.5);

        mh1.hienThi();
        mh2.hienThi();
        mh3.hienThi();
    }
}
