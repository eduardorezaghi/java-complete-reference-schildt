class TypeInference {
    private int i;

    TypeInference(int k) { i = k;}

    int geti() {
        return i;
    }

    void seti(int k) {
        if (k >= 0)
            i = k;
    }
}

class RefVarDemo {
    public static void main(String[] args) {
        var mc = new TypeInference(10); // Notice the use of var here.
        System.out.println("Value of i in mc is " + mc.geti());
        mc.seti(19);
        System.out.println("Value of i in mc is now " + mc.geti());
    }
}