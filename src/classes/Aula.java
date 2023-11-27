package classes;

public class Aula {
    private Turma turma;
    private String data;

    public Aula(Turma turma, String data) {
        this.turma = turma;
        this.data = data;
    }

    // Métodos getters e setters
    public Turma getTurma() {
        return turma;
    }
    public void setTurma(Turma turma) {
        this.turma = turma;
    }
    
    public String getData() {
        return data;
    }
    public void setData(String data) {
        this.data = data;
    }
    
}


    
