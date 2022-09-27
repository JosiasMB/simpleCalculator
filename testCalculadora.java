public class testCalculadora {
    public static void main(String[] args) {
        Calculadora cal = new Calculadora();

        System.out.println(cal.sumar(10, 15));
        System.out.println(cal.sumar(10, 15, 5));
        System.out.println(cal.sumar(10, 15, 5, 85));
    }
}
