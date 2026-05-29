public class Disciplina {
    private int idDisciplina;
    private String nome;
    private String materia;

    public Disciplina() {}

    public Disciplina(int idDisciplina, String nome, String materia) {
        this.idDisciplina = idDisciplina;
        this.nome = nome;
        this.materia = materia;
    }

    public int getIdDisciplina() { return idDisciplina; }
    public void setIdDisciplina(int idDisciplina) { this.idDisciplina = idDisciplina; }
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public String getMateria() { return materia; }
    public void setMateria(String materia) { this.materia = materia; }

    @Override
    public String toString() {
        return "Disciplina [id=" + idDisciplina + ", nome=" + nome + ", materia=" + materia + "]";
    }
}
