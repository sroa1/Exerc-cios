package modelo;

public class Time{

    private String nome;
    private String categoria;
    private int anoDeCriacao;
    private int quantidadeDeSocios;
    private String historico;
<<<<<<< HEAD
    
    public Time(String nome, String categoria) {
    	this.nome = nome;
    	this.categoria = categoria;
    	this.anoDeCriacao = 0;
    	this.quantidadeDeSocios = 0;
    	this.historico = "indefinido";
    	
    }
    
=======


    public void adicionarSocios(int novosSocios) {      
        this.quantidadeDeSocios += novosSocios;
        System.out.println("Foram adicionados " + novosSocios);
    }
    public void imprimeInfo() {
    	getNome();
    	getCategoria();
    	getAnoDeCriacao();
    	getQuantidadeDeSocios();
    	getHistorico();
    }

    
  
>>>>>>> 1a3ac049712be1b9956624e6492b99a7ac9b06e7
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