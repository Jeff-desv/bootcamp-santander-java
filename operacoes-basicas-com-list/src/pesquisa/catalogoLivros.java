package pesquisa;

import java.util.ArrayList;
import java.util.List;

public class catalogoLivros {
    
    //Criando Atributos
    private List<Livro> livroList;

    public catalogoLivros(){this.livroList = new ArrayList<>();}

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
}
