import java.util.*;
public class Baitapvenha {
   


    // g. Tính các tổng
    public static int tongTu1DenN(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) sum += i;
        
        return sum;
    }

    public static double tongPhanSo(int n) {
        double sum = 0;
        for (int i = 1; i <= n; i++) sum += 1.0 / i;
        return sum;
    }

    // h. Giải phương trình bậc 2
    public static void giaiPTBac2(double a, double b, double c) {
        if (a == 0) {
            if (b == 0) {
                System.out.println(c == 0 ? "Vô số nghiệm" : "Vô nghiệm");
            } else {
                System.out.println("Nghiệm x = " + (-c / b));
            }
            return;
        }
        double delta = b * b - 4 * a * c;
        if (delta < 0) {
            System.out.println("Phương trình vô nghiệm");
        } else if (delta == 0) {
            System.out.println("Phương trình có nghiệm kép: x = " + (-b / (2 * a)));
        } else {
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("Nghiệm x1 = " + x1 + ", x2 = " + x2);
        }
    }

    // i. Kiểm tra số hoàn thiện
    public static boolean laSoHoanThien(int x) {
        if (x <= 1) return false;
        int sum = 0;
        for (int i = 1; i <= x / 2; i++) {
            if (x % i == 0) sum += i;
        }
        return sum == x;
    }

    // j. Tổng phần tử có tổng chữ số chẵn
    private static int tongChuSo(int n) {
        int s = 0;
        while (n > 0) { s += n % 10; n /= 10; }
        return s;
    }
    public static int tongChuSoChan(ArrayList<Integer> a) {
        int sum = 0;
        for (int num : a) {
            if (tongChuSo(num) % 2 == 0) sum += num;
        }
        return sum;
    }

    // k. Cắt mảng thành mảng con 3 phần tử
    public static void catMang(ArrayList<Integer> a) {
        for (int i = 0; i < a.size(); i += 3) {
            List<Integer> sub = a.subList(i, Math.min(i+3, a.size()));
            System.out.println(sub);
        }
    }

    // l. Sắp xếp tăng dần/giảm dần
    public static void sapXep(ArrayList<Integer> a) {
        ArrayList<Integer> tang = new ArrayList<>(a);
        Collections.sort(tang);
        System.out.println("Tăng dần: " + tang);

        ArrayList<Integer> giam = new ArrayList<>(a);
        giam.sort(Collections.reverseOrder());
        System.out.println("Giảm dần: " + giam);
    }

    // m. Chèn tổng giữa 2 số chẵn
    public static ArrayList<Integer> chenTong(ArrayList<Integer> a) {
        ArrayList<Integer> res = new ArrayList<>();
        for (int i = 0; i < a.size(); i++) {
            res.add(a.get(i));
            if (i < a.size()-1 && a.get(i)%2==0 && a.get(i+1)%2==0) {
                res.add(a.get(i) + a.get(i+1));
            }
        }
        return res;
    }

    // n. Đếm số chẵn / lẻ
    public static void demChanLe(ArrayList<Integer> a) {
        int chan=0, le=0;
        for (int num : a) {
            if (num % 2 == 0) chan++;
            else le++;
        }
        System.out.println("Số chẵn: " + chan + ", số lẻ: " + le);
    }

    // o. Tìm min/max
    public static void timMinMax(ArrayList<Integer> a) {
        int max = Collections.max(a);
        int min = Collections.min(a);
        System.out.println("Max = " + max + ", Min = " + min);
    }

    // p. Trung bình cộng
    public static double trungBinh(ArrayList<Integer> a) {
        int sum = 0;
        for (int num : a) sum += num;
        return (double) sum / a.size();
    }

    // Hàm chạy chương trình
    public static void main(String[] args) {
        // câu g
        System.out.println("S1 = " + tongTu1DenN(10));
        System.out.println("S2 = " + tongPhanSo(5));

        // câu h
        giaiPTBac2(1, -3, 2);  // PT: x^2 - 3x + 2 = 0

        // câu i
        System.out.println("6 là số hoàn thiện? " + laSoHoanThien(6));

        // ArrayList
        ArrayList<Integer> a = new ArrayList<>(Arrays.asList(24, 13, 20, 28, 71));
       // câu j
        System.out.println("Tổng phần tử có tổng chữ số chẵn: " + tongChuSoChan(a));
       // câu k
        catMang(a);
       //câu l
        sapXep(a);
       //câu m
        System.out.println("Chèn tổng: " + chenTong(a));
       //câu n
        demChanLe(a);
       //câu o
        timMinMax(a);
       //câu p
        System.out.println("Trung bình cộng = " + trungBinh(a));
    }
}


