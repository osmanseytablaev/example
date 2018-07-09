class superfamile1 {
    int i;  
}
class B extends superfamile1 {
    int i; 
    B(int а, int b) {
        super.i = а; 
        i = b;
    }

    void show() {
        System.out.println("суперсемейка привет");
        System.out.println("суперсемейка привет");
    }
}
class UseSuper {
    public static void main(String args[]) {
        B subOb = new B(1, 2);
        subOb.show();
    }
}