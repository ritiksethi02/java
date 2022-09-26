public class employee {
    static String firstName = "Ritik";
    static String lastName = "Sethi";
    static int age = 22;

    private static void print() {
        System.out.println("In Static method");
        System.out.println("Ritik Sethi");
    }

    public static void main(String[] args) {
        System.out.println("In main");
        System.out.println(firstName + " " + lastName + " " + age);
        print();
    }

    static {
        System.out.println("In static block");
        System.out.println("Ritik Sethi 22");
    }
}