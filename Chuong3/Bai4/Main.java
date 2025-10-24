package Bai4;

public class Main {

    public static void main(String[] args) {
        

        
  
        NhanVien nv1 = new NhanVien();
        System.out.println("-> Nhân viên 1 (Mặc định):");
        nv1.xuat();

        System.out.println("\n-------------------------------------------------");

    
        NhanVien nv2 = new NhanVien("NV015", "Nguyen Van A", 3.5);
        System.out.println("-> Nhân viên 2 (Mã hợp lệ):");
        nv2.xuat();
        
        System.out.println("\n-------------------------------------------------");
        
    
        NhanVien nv3 = new NhanVien("MNV005", "Tran Thi B", 1.8);
        System.out.println("-> Nhân viên 3 (Mã KHÔNG hợp lệ):");
        nv3.xuat();

        System.out.println("\n\n****************** TEST CÁN BỘ LÃNH ĐẠO ******************");
        
   
        CBLanhDao cbld1 = new CBLanhDao();
        System.out.println("-> Cán bộ Lãnh đạo 1 (Mặc định - Giám đốc):");
        cbld1.xuat();

        System.out.println("\n-------------------------------------------------");


        CBLanhDao cbld2 = new CBLanhDao("NV020", "Le Van C", 5.0, "Trưởng phòng", 5);
        System.out.println("-> Cán bộ Lãnh đạo 2 (Trưởng phòng):");
        cbld2.xuat();

        System.out.println("\n-------------------------------------------------");


        CBLanhDao cbld3 = new CBLanhDao("NV030", "Pham Thi D", 4.0, "Phó phòng", 3);
        System.out.println("-> Cán bộ Lãnh đạo 3 (Phó phòng):");
        cbld3.xuat();
    }
}
