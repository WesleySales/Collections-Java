package List.Pesquisa;

public class Livro {
    private String titulo;
    private String autor;
    private int anoDePublicao;

    public Livro(String titulo, String autor, int anoDePublicao) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoDePublicao = anoDePublicao;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAnoDePublicao() {
        return anoDePublicao;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", anoDePublicao=" + anoDePublicao +
                '}';
    }
}
