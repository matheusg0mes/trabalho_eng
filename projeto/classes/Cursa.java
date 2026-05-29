public class Cursa {
    private int idCursa;
    private Aluno aluno;
    private List <Turma> Turma = new ArreyList();
    private int ano;
    private int semestre;

    public Cursa() {}

    public Cursa(int idCursa, Aluno aluno, Turma turma, int ano, int semestre) {
        this.idCursa = idCursa;
        this.aluno = aluno;
        this.turma = turma;
        this.ano = ano;
        this.semestre = semestre;
    }

    public int getIdCursa() { return idCursa; }
    public void setIdCursa(int idCursa) { this.idCursa = idCursa; }
    public Aluno getAluno() { return aluno; }
    public void setAluno(Aluno aluno) { this.aluno = aluno; }
    public Turma getTurma() { return turma; }
    public void setTurma(Turma turma) { this.turma = turma; }
    public int getAno() { return ano; }
    public void setAno(int ano) { this.ano = ano; }
    public int getSemestre() { return semestre; }
    public void setSemestre(int semestre) { this.semestre = semestre; }

    @Override
    public String toString() {
        return "Cursa [id=" + idCursa + ", aluno=" + aluno.getNome() + ", turma=" + turma.getTurno() + ", ano=" + ano + ", semestre=" + semestre + "]";
    }
}
