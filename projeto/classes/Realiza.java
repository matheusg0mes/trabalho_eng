public class Realiza {
    private Prova prova;
    private Cursa cursa;
    private double nota;

    public Realiza() {}

    public Realiza(Prova prova, Cursa cursa, double nota) {
        this.prova = prova;
        this.cursa = cursa;
        this.nota = nota;
    }

    public Prova getProva() { return prova; }
    public void setProva(Prova prova) { this.prova = prova; }
    public Cursa getCursa() { return cursa; }
    public void setCursa(Cursa cursa) { this.cursa = cursa; }
    public double getNota() { return nota; }
    public void setNota(double nota) { this.nota = nota; }

    @Override
    public String toString() {
        return "Realiza [aluno=" + cursa.getAluno().getNome() + ", prova=" + prova.getPergunta() + ", nota=" + nota + "]";
    }
}
