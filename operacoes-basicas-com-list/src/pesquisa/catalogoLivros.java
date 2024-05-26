package pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    
    //Criando Atributos
    private List<Livro> livroList;

    public CatalogoLivros(){this.livroList = new ArrayList<>();}

    //Criando o método adcionarLivros
    public void adcionarLivro(String titulo, String autor, int anoPublicacao){
        //
        livroList.add(new Livro(titulo, autor, anoPublicacao));
    }

    //Criando o método pesquisarPorAutor
    public List<Livro> pesquisarPorAutor(String autor){
        //Verificando se a Lista está vazia
        List<Livro> livrosPorAutor = new ArrayList<>();
        if(!livroList.isEmpty()){
            for(Livro l : livroList){
                if(l.getAutor().equalsIgnoreCase(autor)){
                    livrosPorAutor.add(l);
                }
            }
        }
        return livrosPorAutor;
    }

    //Criando o método pesquisarPorIntervalosAnos
    public List<Livro> pesquisarPorIntervalosAnos(int anoInicial, int anoFinal){
        List<Livro> livrosPorIntervalosAnos = new ArrayList<>();
        if(!livroList.isEmpty()){
            for(Livro l : livroList){
                if(l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal){
                    livrosPorIntervalosAnos.add(l);
                }
            }
        }
        return livrosPorIntervalosAnos;
    }
    //Criando o método pesquisarPorTítulo
    public Livro pesquisarPorTitulo(String titulo){
        Livro livroPorTitulo = null;
        if(livroList.isEmpty()){
            for(Livro l : livroList){
                if(l.getTitulo().equalsIgnoreCase(titulo)){
                    livroPorTitulo = l;
                    break;
                }
            }
        }
        return livroPorTitulo;
    }

    public static void main(String[] args) {
        CatalogoLivros catalogoLivros = new CatalogoLivros();
        //Adcionando Livros
        
        catalogoLivros.adcionarLivro("Livro 1", "Autor 1", 2019);
        catalogoLivros.adcionarLivro("Livro 2", "Autor 2", 2020);
        catalogoLivros.adcionarLivro("Livro 3", "Autor 3", 2021);
        catalogoLivros.adcionarLivro("Livro 4", "Autor 4", 2022);
        catalogoLivros.adcionarLivro("Livro 5", "Autor 5", 2023);
        catalogoLivros.adcionarLivro("Livro 6", "Autor 6", 2024);

        System.out.println(catalogoLivros.pesquisarPorAutor("Autor 2"));

    }
}
