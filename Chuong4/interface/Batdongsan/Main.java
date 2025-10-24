
public class Main {
    public static void main(String[] args) {
        // 1. Bietthu (Villa/House)
        // Constructor: Bietthu(double Chieudai, double Chieurong, String Maso)
        BDS bietThuA = new Bietthu(
                20.5, // Chieudai (Length)
                15.0, // Chieurong (Width)
                "BTA001" // Maso (ID Code)
        );
        System.out.println("Created Bietthu with ID: " + bietThuA.Maso + "gia ban "+ bietThuA.giaban());

        // ---

        // 2. Dattrong (Vacant Land)
        // Constructor: Dattrong(double Chieudai, double Chieurong, String Maso)
        BDS datTrongB = new Dattrong(
                50.0, // Chieudai (Length)
                30.0, // Chieurong (Width)
                "DTB002" // Maso (ID Code)
        );
        System.out.println("Created Dattrong with ID: " + datTrongB.Maso + "gia ban "+ datTrongB.giaban());

        // ---

        // 3. Khachsan (Hotel)
        // Constructor: Khachsan(double Chieudai, double Chieurong, String Maso, int
        // sosao)
        BDS khachSanC = new Khachsan(
                35.0, // Chieudai (Length)
                25.0, // Chieurong (Width)
                "KSC003", // Maso (ID Code)
                5 // sosao (Star rating)
        );

        System.out.println("Created Khacsan with ID: " + khachSanC.Maso + "gia ban "+ khachSanC.giaban());
        // ---

        // 4. Nhao (House/Residential Building)
        // Constructor: Nhao(double Chieudai, double Chieurong, String Maso, int solau)
        BDS nhaOD = new Nhao(
                12.0, // Chieudai (Length)
                7.5, // Chieurong (Width)
                "NOD004", // Maso (ID Code)
                3 // solau (Number of floors)
        );
        System.out.println("Created NHADO with ID: " + nhaOD.Maso + "gia ban "+ nhaOD.giaban());
    }
}
