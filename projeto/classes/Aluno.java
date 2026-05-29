public class Aluno {
    private int idAluno;
    private String nome;
    private int idade;

    public Aluno() {}

    public Aluno(int idAluno, String nome, int idade) {
        this.idAluno = idAluno;
        this.nome = nome;
        this.idade = idade;
    }

    public int getIdAluno() { return idAluno; }
    public void setIdAluno(int idAluno) { this.idAluno = idAluno; }
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public int getIdade() { return idade; }
    public void setIdade(int idade) { this.idade = idade; }

    @Override
    public String toString() {
        return "Aluno [id=" + idAluno + ", nome=" + nome + ", idade=" + idade + "]";
    }
}
