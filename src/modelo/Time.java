package modelo;

public class Time{
    
    private String nome;
    private String categoria;
    private int anoDeCriacao;
    private int quantidadeDeSocios;
    private String historico;

    public void adicionarSocios(final int novosSocios) {      
        this.quantidadeDeSocios += novosSocios;

    }
    
}