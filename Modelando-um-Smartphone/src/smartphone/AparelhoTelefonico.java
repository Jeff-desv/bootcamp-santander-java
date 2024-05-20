package smartphone;

public class AparelhoTelefonico {
    
    public static void main(String[] args) {
        
        Smartphone cell = new Smartphone();
        System.out.println();
        cell.ligar();
        System.out.println();

        cell.selecionarReprodutorMusica();
        System.out.println();
        cell.selecionarMusica(null);
        cell.tocar();
        cell.pausar();
        System.out.println();
        
    }

}
