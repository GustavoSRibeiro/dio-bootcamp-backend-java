public class Operadores {
    public static void main(String[] args) {
        int a, b, c, d;

        a = 5;
        b = 6;

        String resultado = "";
        if (a==b)
            resultado = "verdadeiro";
        else
            resultado = "falso";

        System.out.println(resultado);

        c = 4;
        d = 4;

        String resultado2 = c==d ? "verdadeiro" : "falso";

        System.out.println(resultado2);

        int numero1 = 1;
        int numero2 = 2;

        boolean simNao = numero1 == numero2;

        System.out.println("numeroUm é igual a numerodois? "+ simNao);

        String nome1 = "GUSTAVO";
        String nome2 = new String("GUSTAVO");

        System.out.println(nome1.equals(nome2));

        boolean condicao1 = true;
        boolean condicao2 = false;

        if(condicao1 && condicao2)
            System.out.println("as duas condições são verdadeiras");

        if(condicao1 || condicao2)
            System.out.println("uma condição é verdadeira");
    }
}
