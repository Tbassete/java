package metodos;

public class usuario {
    public static void main(String[] args) {
         tv tv = new tv();

    tv.ligar();
    System.out.println(tv.ligada);
    tv.aumentaVolume();
    System.out.println(tv.volume);
    tv.diminuiVolume();
    System.out.println(tv.volume);
    tv.mudacanalplus();
    System.out.println(tv.canal);
    tv.mudacanalless();
    System.out.println(tv.canal);
    tv.ligar();
    System.out.println(tv.ligada);
    
    }

   
}


