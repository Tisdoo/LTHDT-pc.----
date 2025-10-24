package VD3;

// Lớp C implements nhiều interface
class C implements A, B {
    public void showA() {
        System.out.println("This is showA() from interface A");
    }

    public void showB() {
        System.out.println("This is showB() from interface B");
    }
}
