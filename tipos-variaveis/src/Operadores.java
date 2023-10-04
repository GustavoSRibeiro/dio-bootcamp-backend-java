public class Operadores {
    public static void main(String[] args) {
        int numero = 5;

        numero = - numero;
        System.out.println(numero);
        numero = - numero;
        System.out.println(numero);

        numero = numero +1; // incremento
        System.out.println(numero);
        numero++; //incremento
        System.out.println(numero);
        System.out.println(++numero);//incremento e impressao

        numero+=2;
        System.out.println(numero);
        System.out.println(numero+=2);
        System.out.println(numero);
        System.out.println(numero/=2);
    }
}
