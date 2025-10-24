package VD2;

public class InterfaceDemo {
    public static void main(String[] args) {
        Printable p = new Document(); // Interface reference
        p.print();
        p.show();
    }
}
