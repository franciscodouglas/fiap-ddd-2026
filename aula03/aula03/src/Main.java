import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Olá");
        System.out.println("Olá mundo");

        //comentário 1 linha

        /*comentário
        de
        N
        linhas*/

        //alt+shift+= aumentar o zoom
        String nome = "Francisco";
        int idade = 30;
        float altura =1.75f;
        boolean status = true;

        //Exibindo o conteúdo da variavel
        System.out.println(nome);
        System.out.println(idade);
        System.out.println(altura);
        System.out.println(status);;

        //trocando o conteudo da variavel
        idade = 31;
        nome = "Francisco Douglas";

        System.out.println(nome);
        System.out.println(idade);

        //operadores matemáticos
        int a = idade +1;
        int b = idade *2;
        double c = idade /2;
        int d = idade -10;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);

        if(idade==30){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
        // operadores de comparação
        System.out.println(idade ==30);
        System.out.println(idade >30);
        System.out.println(idade <30);
        System.out.println(idade >=30);
        System.out.println(idade <=30);
        System.out.println(idade !=30);


        //operadores acumuladores
        idade = idade +5;
        System.out.println(idade);
        //ou
        idade += 5;
        System.out.println(idade);

        //operadores de incremento e decremento
        System.out.println(idade++);
        System.out.println(idade--);

        //entrada de dados em java
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o seu nome: ");
        nome = sc.nextLine();
        System.out.println(nome);

        System.out.println("Digite a sua idade: ");
        idade = sc.nextInt();
        //nextInt() obtem o valor do terminal e converte para numero inteiro

        System.out.println(idade);
    }
}