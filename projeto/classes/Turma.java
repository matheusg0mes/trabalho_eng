public class Turma {
    private int idTurma;
    private String turno;
    private String horaInicio;
    private String horarioFim;
      private List <Disciplina> Disciplina = new ArreyList();
    private List <Professor> professor = new ArreyList();

    public Turma() {}

    public Turma(int idTurma, String turno, String horaInicio, String horarioFim,
                 Disciplina disciplina, Professor professor) {
        this.idTurma = idTurma;
        this.turno = turno;
        this.horaInicio = horaInicio;
        this.horarioFim = horarioFim;
        this.disciplina = disciplina;
        this.professor = professor;
    }

    public int getIdTurma() { return idTurma; }
    public void setIdTurma(int idTurma) { this.idTurma = idTurma; }
    public String getTurno() { return turno; }
    public void setTurno(String turno) { this.turno = turno; }
    public String getHoraInicio() { return horaInicio; }
    public void setHoraInicio(String horaInicio) { this.horaInicio = horaInicio; }
    public String getHorarioFim() { return horarioFim; }
    public void setHorarioFim(String horarioFim) { this.horarioFim = horarioFim; }
    public Disciplina getDisciplina() { return disciplina; }
    public void setDisciplina(Disciplina disciplina) { this.disciplina = disciplina; }
    public Professor getProfessor() { return professor; }
    public void setProfessor(Professor professor) { this.professor = professor; }

    @Override
    public String toString() {
        return "Turma [id=" + idTurma + ", turno=" + turno + ", inicio=" + horaInicio + ", fim=" + horarioFim + "]";
    }
}
