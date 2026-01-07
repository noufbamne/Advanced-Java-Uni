class Mathoperation{
    // Method with 2 parameters
    int add(int a, int b){
        return a+b;
    }
    // Method with 3 parameters
    int add(int a, int b, int c){
        return a+b+c;
    }
    // Method with double parameters
    double add(double a, double b){
        return a+b;
    }
}
public class Prac01_MethodOverloading {
    public static void main(String[] args) {
        Mathoperation mo = new Mathoperation();

        // Calling add method with 2 parameters
        System.out.println(mo.add(5, 6));

        // Calling add method with 3 parameters
        System.out.println(mo.add(5, 6, 7));

        // Calling add method with double parameters
        System.out.println(mo.add(5.5, 6.5));
    }
}
