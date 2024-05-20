class Acessors {
    int a = 10; // default access: package-private
    public int b = 20; // public access
    private int c; // private access


    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    
}


class AcessorsTest {
    public static void main(String[] args) {
        Acessors t = new Acessors();

        t.a = 100; // OK
        t.b = 200; // OK
        // t.c = 300; // Error: c has private access in Test

        // Use public getter and setter
        t.setC(140);

        System.out.println("a, b and c: " + t.a + " " + t.b + " " + t.getC());
    }
}