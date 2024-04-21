//to resolve super keyword is used..

class SuperClass {
    int x;

    SuperClass(int x) {
        this.x = x;
    }

    void display() {
        System.out.println("SuperClass: " + x);
    }
}

class SubClass extends SuperClass {
    int x;

    SubClass(int x, int y) {
        super(x);
        this.x = y;
    }

    void display() {
        super.display(); // Calling superclass display method
        System.out.println("SubClass: " + x);
    }
}

public class Super_keyword_51 {
    public static void main(String[] args) {
        SubClass obj = new SubClass(100, 200);
        obj.display();
    }
}
