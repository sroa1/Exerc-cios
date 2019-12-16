package modelo;

<<<<<<<HEAD
public class Time {
    =======
    public class Time {
        >>>>>>>62739896933065 a4d28fddf3c2e36913e04cd134

        private String nome;
        private String categoria;
        private int anoDeCriacao;
        private int quantidadeDeSocios;
        private String historico;

        <<<<<<<HEAD

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
=======

        public int calcularIdade(int anoDeCriacao) {
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
>>>>>>> 62739896933065a4d28fddf3c2e36913e04cd134
    }

}