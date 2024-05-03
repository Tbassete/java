package classes;
public class MinhaClasse{
    public static void main (String [] args){

        // System.out.print("hello world");
        String primeiroNome = "Thiago";
        String segundoNome = "bassete";

        boolean verdadeira = false;


        verdadeira = true;

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);

        System.out.println(nomeCompleto);

    }

    public static String nomeCompleto (String primeiroNome, String segundoNome){
        return primeiroNome.concat(" ").concat(segundoNome);
    }

}