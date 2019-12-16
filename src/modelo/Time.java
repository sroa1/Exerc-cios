package modelo;

public class Time{

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
    
    public int calcularIdade(int anoDeCriacao){
        int idade = (2019 - anoDeCriacao);
        return idade;
    }

    public String getNome() {
        return nome;
    }

    public String getCategoria() {
        return categoria;
    }

    public int getAnoDeCriacao() {
        return anoDeCriacao;
    }

    public int getQuantidadeDeSocios() {
        return quantidadeDeSocios;
    }

    public String getHistorico() {
        return historico;
    }

}