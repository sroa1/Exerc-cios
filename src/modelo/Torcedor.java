public class Torcedor {
    private String nome;
    private String sexo;
    private int idade;

    public Torcedor(String nome, String sexo, int idade) {
        this.nome = nome;
        this.sexo = sexo;
        this.idade = idade;
    }

    public Torcedor(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = "N";
    }

    public String getNome() {
        return nome;
    }

    public String getSexo() {
        return sexo;
    }

    public int getIdade() {
        return idade;
    }

}