package List.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {

    private List <Livro>livroList; //criando uma lista de livros como atributo do catalogo.

    public CatalogoLivros() {
        this.livroList = new ArrayList<>();
    }

    //método para adicionar um livro
    public void adicionarLivro(String titulo, String autor, int anoPublicacao){
        Livro livro = new Livro(titulo,autor,anoPublicacao);
        livroList.add(livro);
    }

    public void exibirLivros(){
        if(!livroList.isEmpty()){
            System.out.println(livroList);
        }
        else {System.out.println("A lista esta vazia");}
    }

    public List<Livro> pesquisarPorAutor(String autor) {
        List<Livro> livroPorAutor = new ArrayList<>();
        if (!livroList.isEmpty()) {
            for (Livro l : livroList) {
                if (l.getAutor().equalsIgnoreCase(autor)) {
                livroPorAutor.add(l);
                }
                else {
                    System.out.println("Não encontramos nenhum livro deste autor");
                }
        }
        return livroPorAutor;
    }else{
            throw new RuntimeException("A lista está vazia!");
        }
    }

    public List<Livro> pesquisarPorAnoDePublibicacao(int anoInicial, int anoFinal){
        List<Livro> livroPorAnoDePublicacao = new ArrayList<>();
        if (!livroList.isEmpty()){
            for(Livro l: livroList){
                if(l.getAnoDePublicao()>=anoInicial && l.getAnoDePublicao()<=anoFinal){
                    livroPorAnoDePublicacao.add(l);
                }
            }
            return livroPorAnoDePublicacao;
        }
        else{
            throw new RuntimeException("A lista está vazia!");
        }
    }

    public List<Livro> pesquisarPorTitulo(String titulo){
        List<Livro> livroPorTitulo = new ArrayList<>();
        if (!livroList.isEmpty()){
            for(Livro l:livroList){
                if (l.getTitulo().equalsIgnoreCase(titulo)) {
                    livroPorTitulo.add(l);
                }
                else {
                    System.out.println("Não existe um livro com esse titulo");
                }
            }
        }
        return livroPorTitulo;
    }

    public static void main(String[] args) {

        CatalogoLivros catalogoLivros = new CatalogoLivros();

        catalogoLivros.adicionarLivro("Senhor dos aneis","joaozin",2003);
        catalogoLivros.adicionarLivro("Percy Jackson","maria",2010);
        catalogoLivros.adicionarLivro("Percy Jackson 2","maria",2013);
        catalogoLivros.adicionarLivro("Atlas","Ivis",1998);

        catalogoLivros.exibirLivros();
        //System.out.println(catalogoLivros.pesquisarPorTitulo("Percy Jackson"));
        //catalogoLivros.pesquisarPorAutor("maria");
        System.out.println(catalogoLivros.pesquisarPorAnoDePublibicacao(2010,2013));
    }


}
