package modelo;

public class Time{

    private String nome;
    private String categoria;
    private int anoDeCriacao;
    private int quantidadeDeSocios;
    private String historico;
  
    public int calcularIdade(int anoDeCriacao){
        int idade = (2019 - anoDeCriacao);
        return idade;
    }
    
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