package smartphone;

public class AparelhoTelefonico {
    
    public static void main(String[] args) {
        
        Smartphone cell = new Smartphone();
        System.out.println();
        cell.desbloquearAparelho();
        System.out.println();

        cell.selecionarReprodutorMusica();
        System.out.println();
        cell.selecionarMusica(null);
        cell.tocar();
        cell.pausar();
        System.out.println();

        cell.atender();
        cell.ligar();
        cell.iniciarCorreioVoz();
        System.out.println();

        cell.abrindoNavegador();
        cell.exibirPagina();
        cell.adicionarNovaAba();
        cell.atualizarPagina();
        System.out.println();
        
    }

}
