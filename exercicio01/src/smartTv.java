public class smartTv {
    
    boolean Ligada = false;
    int canal = 1;
    int volume = 25;

   public void mudarCanal(int novoCanal){
    canal = novoCanal;
   }

   public void aumentaCanal(){
    canal++;
   }

   public void diminuirCanal(){
    canal--;
   }

   public void aumentaVolume(){
    //volume = volume + 1
    volume++;
    System.out.println("Aumentando volume para " + volume);
   }

   public void diminuiVolume(){
    //volume = volume - 1;
    volume--;
    System.out.println("Diminuindo volume para " + volume);
   }

   public void ligada(){
      Ligada=true;
   }

   public void desligada(){
      Ligada = false;
   }
}