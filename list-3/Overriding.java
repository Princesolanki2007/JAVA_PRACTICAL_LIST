class A {
    public void use() {
        System.out.println("Class A Method");
    }
}

class B extends A {
    public void use() {
        super.use();
        System.out.println("Class B Method");
    }
}

public class Overriding {
    public static void main(String[] args) {
        A b = new B();
        b.use(); // Calls overridden method in class B and superclass method in class A
    }
}

