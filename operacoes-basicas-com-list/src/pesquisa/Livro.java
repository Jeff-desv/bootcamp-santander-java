package pesquisa;

public class Livro {

    //Atributos
    private String titulo;

    private String autor;

    private int anoPublicacao;

    //Criando um Construtor para receber os atributos
    public Livro(String titulo, String autor, int anoPublicacao){
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
    }

    //Criando o Getter pois os atributos são privados
    //O Getter vai servir para que possamos ter essas informações
    public String getTitulo(){
        return titulo;
    }

    public String getAutor(){
        return autor;
    }

    public int getAnoPublicacao(){
        return anoPublicacao;
    }
    //Sobrescrevendo para toString 
    //Isso será feito quando precisar imprimir uma lista
    //No nosso caso uma lista de livros

    public String toString(){
        return " Livro {" +
        "titulo' " + titulo + '\'' +
        ", autor' " + autor + '\'' +
        ", anoPublicacao " + anoPublicacao +
        '}';
    }

}


