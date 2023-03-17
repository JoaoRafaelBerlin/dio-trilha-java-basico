import javax.swing.plaf.synth.SynthSeparatorUI;
import javax.swing.plaf.synth.SynthToolBarUI;

public class Operadores {

public static void main(String[] args) {

    boolean condicao1 = true;
    boolean condicao2 = false;

    if(condicao1 && condicao2);{

        System.out.println("as duas condicoes sao verdaderias");

    }

    if(condicao1 || condicao2);{

        System.out.println("uma das condicoes é verdaderia");

    }

    System.out.println("fim");

    String nomeUm = "GLEISON";
    //String nomeDois = "GLEISON";

    String nomeDois = new String("GLEISON");

    System.out.println(nomeUm == nomeDois);

    System.out.println(nomeUm.equals(nomeDois));

    System.out.println(nomeCompleto);
        
    String concatenacao = "?";

    concatenacao = 1+1+1+"1";

    System.out.println(concatenacao);

    concatenacao = 1+"1"+1+"1";

    System.out.println(concatenacao);

    concatenacao ="1"+1+1+1;

    System.out.println(concatenacao);

    concatenacao = "1"+(1+1+1);

    System.out.println(concatenacao);

    //repeticao 

    int numero = 5;

    /*numero = numero + 2;*/

    System.out.println(numero);

    //numero = numero + 1;

    numero++;

    System.out.println(numero);

    System.out.println(++ numero);

    System.out.println(numero --);

    System.out.println(numero);

    //boolean

    boolean variavel = true;

    System.out.println(!variavel);

    System.out.println(variavel);

    variavel = !variavel;

    int a, b;
    a = 5;
    b = 6;

    String resultado = "";
    if (a==b)
        resultado = "verdadeiro";
    else 
        resultado = "falso";

     String resultado = a==b ?"verdadeiro" : "falso";

     System.out.println(resultado);

     int a, b;
     a = 6;
     b = 6;

     String resultado = a==b ?"verdadeiro" : "falso";

     System.out.println(resultado);

     //operador ternário nao se limita somente a String como também a valor inteiro

     String resultado = a==b ?"1" : "0";

     System.out.println(resultado);

     int numero1 = 1;
     int numero2 = 2;

     boolean simNao = numero1 == numero2;

     if(numero1 < numero2) {
        System.out.println("a nossa condicao é verdadeira");
     }

     System.out.println("numeroUm é igual a numeroDois? " +simNao);

     simNao = numero1 != numero2;

     System.out.println("numeroUm é diferente a numeroDois? " +simNao);

     simNao = numero1 > numero2;

     System.out.println("numeroUm é maior a numeroDois? " +simNao);

}

}
