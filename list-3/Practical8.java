interface P1 {
    void methodP1();
}

interface P2 {
    void methodP2();
}

interface P12 extends P1, P2 {
    void methodP12();
}

class Q implements P12 {
    public void methodP1() {
        System.out.println("Inside methodP1");
    }

    public void methodP2() {
        System.out.println("Inside methodP2");
    }

    public void methodP12() {
        System.out.println("Inside methodP12");
    }
}

public class Practical8{
    public static void main(String[] args) {
        Q q = new Q();
        q.methodP1(); // Invoke method from interface P1
        q.methodP2(); // Invoke method from interface P2
        q.methodP12(); // Invoke method from interface P12
    }
}
