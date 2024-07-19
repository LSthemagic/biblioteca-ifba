package entity;

import java.time.Instant;

public abstract class Publicacao {



    private String titulo;
    private String autor;
    private Integer anoPublicacao;
    private String genero;
    private String editora;
    private Integer quantidadeDisponivel;

    public Publicacao(String titulo, String autor, Integer anoPublicacao, String genero, String editora, Integer quantidadeDisponivel) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
        this.genero = genero;
        this.editora = editora;
        this.quantidadeDisponivel = quantidadeDisponivel;
    }

    public void imprimirDados() {
        System.out.println(
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", anoPublicacao=" + anoPublicacao +
                ", genero='" + genero + '\'' +
                ", editora='" + editora + '\'' +
                ", quantidadeDisponivel=" + quantidadeDisponivel +
                '}');
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public Integer getAnoPublicacao() {
        return anoPublicacao;
    }

    public String getGenero() {
        return genero;
    }

    public String getEditora() {
        return editora;
    }

    public Integer getQuantidadeDisponivel() {
        return quantidadeDisponivel;
    }
}
