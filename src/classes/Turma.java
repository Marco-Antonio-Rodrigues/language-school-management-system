package classes;

import java.util.ArrayList;
import java.util.List;

public class Turma {
    private String nome;
    private int capacidade;
    private String idioma;
    private List<Aluno> alunos;

    public Turma(String nome, int capacidade, String idioma) {
        this.nome = nome;
        this.capacidade = capacidade;
        this.idioma = idioma;
        this.alunos = new ArrayList<>();

    }


    // Métodos getters e setters
    public void adicionarAluno(Aluno aluno) {
        alunos.add(aluno);
    }

    public String getnome() {
        return nome;
    }
    
    public void setnome(String nome) {
        this.nome = nome;
    }
    
    public int getcapacidade() {
        return capacidade;
    }
    
    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public String getidioma() {
        return idioma;
    }
    
    public void setidioma(String idioma) {
        this.idioma = idioma;
    }

    public void imprimirAlunos() {
        System.out.println("Alunos da turma " + nome + ":");
        System.out.println("Capacidade da turma: " + capacidade);
        System.out.println("Idioma da turma: " + idioma);
        for (Aluno aluno : alunos) {
            System.out.println(aluno);
        }
    }

    public String toString() {
        return "Nome: " + nome + ", Capacidade: " + capacidade + ", Idioma: " + idioma;
    }
    
    // Outros métodos relevantes para a turma
    // ...
    
}

    

