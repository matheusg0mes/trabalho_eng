public class Professor {
    private int idProfessor;
    private String nome;
    private String especializacao;

    public Professor() {}

    public Professor(int idProfessor, String nome, String especializacao) {
        this.idProfessor = idProfessor;
        this.nome = nome;
        this.especializacao = especializacao;
    }

    public int getIdProfessor() { return idProfessor; }
    public void setIdProfessor(int idProfessor) { this.idProfessor = idProfessor; }
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public String getEspecializacao() { return especializacao; }
    public void setEspecializacao(String especializacao) { this.especializacao = especializacao; }

    @Override
    public String toString() {
        return "Professor [id=" + idProfessor + ", nome=" + nome + ", especializacao=" + especializacao + "]";
    }
}
