public class multiplicar {
    static int mult(int a, int b){
        return a * b;
    }
    static double mult(double a, double b){
        return a * b;
    }
    static double mult(double a, double b, double c)
    {
        return a * b * c;
    }
    public static void main(String[] args) {
        System.out.println("Resultado: " + multiplicar.mult(5, 3));
        System.out.println("Resultado: " + multiplicar.mult(10, 3, 8));  
        System.out.println("Resultado: " + multiplicar.mult(4.5, 3.8, 2));  
    }
}