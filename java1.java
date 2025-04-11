public class NestededClass {
    void display() {
        System.out.println("Outer Class");
    }

    class InnerClass {  
        void show() {
            System.out.println("Inner Class");
        }
    }

    public static void main(String[] args) {
        NestededClass obj1 = new NestededClass();
        obj1.display();

        NestededClass.InnerClass obj2 = obj1.new InnerClass();
        obj2.show();
    }
}