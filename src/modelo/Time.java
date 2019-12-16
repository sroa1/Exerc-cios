package modelo;

public class Time {

    private String nome;
    private String categoria;
    private int anoDeCriacao;
    private int quantidadeDeSocios;
    private String historico;

    public Time(String nome, String categoria) {
        this.nome = nome;
        this.categoria = categoria;
        this.anoDeCriacao = 0;
        this.quantidadeDeSocios = 0;
        this.historico = "indefinido";
    }

    public void setAnoDeCriacao(int anoDeCriacao) {
        this.anoDeCriacao = anoDeCriacao;
    }

    public void setQuantidadeDeSocios(int quantidadeDeSocios) {
        this.quantidadeDeSocios = quantidadeDeSocios;
    }

    public void setHistorico(String historico) {
        this.historico = historico;
    }

}