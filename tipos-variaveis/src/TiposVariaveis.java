public class TiposVariaveis {
    public static void main(String[] args) {
        double salarioMinimo = 2500;

        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal; // Casting

        int numero = 1;
        numero = 2;
        System.out.println(numero);

        final double VALOR_DE_PI = 3.14;
    }
}