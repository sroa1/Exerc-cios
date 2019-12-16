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

    public Time() {
        this.nome = "indefinido";
        this.categoria = "indefinido";
        this.anoDeCriacao = 0;
        this.quantidadeDeSocios = 0;
        this.historico = "indefinido";
    }

    public int calcularIdade() {
        int idade = (2019 - anoDeCriacao);
        return idade;
    }

    public void imprimeInfo() {
        getNome();
        getCategoria();
        getAnoDeCriacao();
        getQuantidadeDeSocios();
        getHistorico();
    }

    public String contagemRegressiva() {
        return "Faltam " + (100 - calcularIdade()) + " para o centenário do time. ";
    }

    public void adicionarSocios(int novosSocios) {
        this.quantidadeDeSocios += novosSocios;
        System.out.println("Foram adicionados " + novosSocios);
    }

    public String imprimeMensagem(String mensagem) {
        return ("Mensagem recebida: " + mensagem);
    }

    public String imprimeMensagem() {
        return "Nenhuma mensagem recebida. Utilize o outro método";
    }

    public String imprimeMensagem(String primeiraMensagem, String segundaMensagem) {
        return ("Mensagem 1 recebida: " + primeiraMensagem 
                + " Mensagem 2 recebida: " + segundaMensagem);
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

    public void setCategoria(String categoria) {
        this.categoria = categoria;
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