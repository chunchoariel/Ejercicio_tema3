public class Main {
    public static void main(String[] args) {
        int resultsumar;
        resultsumar = sumar(15, 25, 35);
        System.out.println(resultsumar);

        sumar2(20, 30, 40);

        int valor1 = 25;
        int valor2 = 35;
        int valor3 = 45;

        var sumval = suma(valor1, valor2, valor3);

        System.out.println(sumval);
    }
        public static int sumar(int a, int b, int c) { //primer tipo de suma
        return a + b + c;
    }
        public static void sumar2(int d, int e, int f){ //Segundo tipo de suma
        System.out.println(d + e + f);
}
        public static int suma(int g, int h, int i) {  //Tercer suma paso por valor
            return g + h + i;
        }
    }

