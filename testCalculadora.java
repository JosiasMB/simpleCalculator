public class testCalculadora {
    public static void main(String[] args) {
        Calculadora cal = new Calculadora();

        System.out.println("--------------- Sumas --------------------");
        System.out.println(cal.sumar(10, 15));
        System.out.println(cal.sumar(10, 15, 5));
        System.out.println(cal.sumar(10, 15, 5, 85));
        System.out.println("--------------- Restas --------------------");
        System.out.println(cal.restar(10, 15));
        System.out.println(cal.restar(10, 15, 5));
        System.out.println(cal.restar(10, 15, 5, 85));
        System.out.println("--------------- multiplicaciones --------------------");
        System.out.println(cal.multiplicar(10, 15));
        System.out.println(cal.multiplicar(10, 15, 5));
        System.out.println(cal.multiplicar(10, 15, 5, 85));
        System.out.println("--------------- Diviciones  --------------------");
        System.out.println(cal.dividir(10, 15));
        System.out.println(cal.dividir(10, 15, 5));
        System.out.println(cal.dividir(10, 15, 5, 85));
    }
}
