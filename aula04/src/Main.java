//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        /* Conversão Implicita (ou Automática, Coersão)*/
        int numero = 10;
        double real = numero;

        System.out.println("Valor original: " + numero);
        System.out.println("Valor convertido: " + real);

        /*Conversão Explicita (Casting)*/
        double preco = 20.91;
        int inteiro = (int) preco;

        System.out.println("Valor original: " + preco);
        System.out.println("Valor convertido: " + inteiro);

        /*Juntar texto -> Concatenar */
        String a = "10";
        String b = "30.50";
        System.out.println(a+b);
        System.out.println(a+5);


        /*Conversão de String para Inteiro*/
        int n1 = Integer.parseInt(a);
        System.out.println(n1+5);

        /*Conversão de String para Double*/
        double n2 = Double.parseDouble(b);
        System.out.println(n2+5);

        /*Conversão de String para Float*/
        float n3 = Float.parseFloat(b);
        System.out.println(n3+20);

        /*Numérico para String*/
        String texto = String.valueOf(n3);
        String texto2 = ""+20;
        System.out.println(texto);
        System.out.println(texto2);


    }
}