class A {
    public void showA() {
        System.out.println("Class A Method");
    }
}

class B extends A {
    public void showB() {
        System.out.println("Class B Method");
    }
}

class C extends B {
    public void showC() {
        System.out.println("Class C Method");
    } 
}

public class MultiLevel {
    public static void main(String[] args) {
        C c = new C();
        c.showA(); // Accessing method from class A
        c.showB(); // Accessing method from class B
        c.showC(); // Accessing method from class C
    }
}
