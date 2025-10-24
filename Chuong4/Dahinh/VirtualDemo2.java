public class VirtualDemo2 {
    public static void main(String[] args) {
        Salary s = new Salary("Mohd Mohtashim", "Ambheta, UP", 3, 3600.00);
        Employee_Poly e = new Salary("John Adams", "Boston, MA", 2, 2400.00);
        Employee_Poly E = new Employee_Poly("John Smith", "Florida, USA", 123456789);

        System.out.println("Call mailCheck using Salary reference --");
        s.mailCheck();

        System.out.println("\nCall mailCheck using Employee reference --");
        e.mailCheck();

        System.out.println("\nCall mailCheck using Employee reference --");
        E.mailCheck();
    }
}
