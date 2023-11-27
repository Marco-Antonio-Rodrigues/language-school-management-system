package classes;
public class AgendamentoAulas {
    private String aluno;
    private String disciplina;
    private String data;
    private String horario;

    // Construtor
    public AgendamentoAulas(String aluno, String disciplina, String data, String horario) {
        this.aluno = aluno;
        this.disciplina = disciplina;
        this.data = data;
        this.horario = horario;
    }

    // Getters e Setters
    public String getAluno() {
        return aluno;
    }

    public void setAluno(String aluno) {
        this.aluno = aluno;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }
}
