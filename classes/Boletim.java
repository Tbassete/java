package classes;
public class Boletim {
    public static void main(String [] args){
        double media = 5.9;
        String situacao = "";
        if(media<4){
            situacao = "reprovado";
            System.out.println(situacao);
        }else if ( media  <= 5.9){
            situacao = "recuperação";
            System.out.println(situacao);
        }
        else{
            situacao = "aprovado";
            System.out.println(situacao);
        }
    }
}
