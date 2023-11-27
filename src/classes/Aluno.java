package classes;

public class Aluno {
    private String nome;
    private int idade;
    private String nivelIdioma;
    private int matricula;

    public Aluno(String nome, int idade, String nivelIdioma, int matricula) {
        this.nome = nome;
        this.idade = idade;
        this.nivelIdioma = nivelIdioma;
        this.matricula = matricula;
    }

    // Métodos getters e setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNivelIdioma() {
        return nivelIdioma;
    }

    public void setNivelIdioma(String nivelIdioma) {
        this.nivelIdioma = nivelIdioma;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String toString() {
        return "Nome: " + nome + ", Idade: " + idade + ", Nível de Idioma: " + nivelIdioma + ", Matrícula: " + matricula;
    }
}