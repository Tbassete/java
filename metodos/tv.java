package metodos;

public class tv {
    
        boolean ligada = false;
        int canal = 0;
        int volume = 5;
    
    public void ligar(){
        if(!ligada){
         ligada = true;
         System.out.println(" tv ligada ");
        }else{
         ligada = false;
         System.out.println("tv desligada" );
        }
     }
 
    
     public void aumentaVolume(){
          volume = volume+1;
          System.out.println("o volume é :" + volume);
     }
 
     public void diminuiVolume(){
         volume = volume-1;
         System.out.println("o volume é :" + volume);
    }
 
    public void mudacanalplus(){
         canal = canal+1;
         System.out.println("o canal é :" + canal);
     }
 
     public void mudacanalless(){
         canal = canal-1;
         System.out.println("o canal é :" + canal);
     }

  
}