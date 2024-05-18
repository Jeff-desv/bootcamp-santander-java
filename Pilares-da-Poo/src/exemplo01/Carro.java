package exemplo01;

public class Carro {
    public void ligar(){
        confereCambil();
        confereCombustivel();
        System.out.println("Carro Ligado");
    }

    //Usando o Encapsulamento
    private void confereCombustivel(){
        System.out.println("Conferindo Combustível");
    }

    private void confereCambil(){
        System.out.println("Conferindo se o Câmbio está em P");
    }
}
