public class lecture_3 {
    // non parameterised
    public static void func() { // declaration of function
        System.out.print(" Hello !!! ");
        // 100 lines of code
    }

    // parameterised
    public static void func1(String name) { // declaration of function
        System.out.print("Hello " + name);
    }

    public static void func2(String name, int age) {
        System.out.println("There is a " + name + " who is " + age + " years old");
    }

    public static void func3(String name, boolean isBoy) {
        if ( isBoy ) {
            System.out.println(name + " is a boy");
        } else {
            System.out.println(name + " is a girl");
        }
    }

    public static void func3(String name, int age) {
    
    }

    public static void food(String dish) {
        System.out.println("We are serving " + dish);
    }

    // String, int, boolean, Array, byte, short, .......
    public static String food1(String dish) {
        // statenents
        return dish;
    }

    public static void main(String[] args) {
        // func(); // calling of a function
        // func();

        // func1("Kunal"); // calling of a function

        // func2("Divya", 23); // arguments
        // func2("Rahul", 21);
        // func2("Kapil", 20);

        // func3("Divyamani", true);
        // func3("Sonali", false);

        // function Overloading
        // func3("Shubh", true);
        // func3("Shubh", 38);

        food("Daal Makhani");

        String dish = food1("Paneer");
    }
}
