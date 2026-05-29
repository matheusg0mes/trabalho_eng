public class Prova {
    private int idProva;
    private Turma turma;
    private String pergunta;
    private String horarioFim;

    public Prova() {}

    public Prova(int idProva, Turma turma, String pergunta, String horarioFim) {
        this.idProva = idProva;
        this.turma = turma;
        this.pergunta = pergunta;
        this.horarioFim = horarioFim;
    }

    public int getIdProva() { return idProva; }
    public void setIdProva(int idProva) { this.idProva = idProva; }
    public Turma getTurma() { return turma; }
    public void setTurma(Turma turma) { this.turma = turma; }
    public String getPergunta() { return pergunta; }
    public void setPergunta(String pergunta) { this.pergunta = pergunta; }
    public String getHorarioFim() { return horarioFim; }
    public void setHorarioFim(String horarioFim) { this.horarioFim = horarioFim; }

    @Override
    public String toString() {
        return "Prova [id=" + idProva + ", pergunta=" + pergunta + ", horarioFim=" + horarioFim + "]";
    }
}
