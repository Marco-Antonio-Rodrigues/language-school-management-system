package classes;

public class Aluno {
    private String nome;
    private int idade;
    private int matricula;
    private boolean ativo;

    public Aluno(String nome, int idade, int matricula) {
        this.nome = nome;
        this.idade = idade;
        this.matricula = matricula;
        this.ativo = true;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getIdade() {
        return this.idade;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public int getMatricula() {
        return this.matricula;
    }

    public String toString() {
        return "Nome: " + this.nome + ", Idade: " + this.idade + ", Matrícula: " + this.matricula + ", Ativo: " + this.ativo;
    }
}