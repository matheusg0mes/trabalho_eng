public class Main {

    public static void main(String[] args) {

        Disciplina disciplina = new Disciplina(1, "Estrutura de Dados", "Ciência da Computação");
        System.out.println("=== DISCIPLINA ===");
        System.out.println(disciplina);

        Professor professor = new Professor(1, "Carlos Mendes", "Banco de Dados");
        System.out.println("\n=== PROFESSOR ===");
        System.out.println(professor);

        Aluno aluno = new Aluno(1, "Ana Souza", 20);
        System.out.println("\n=== ALUNO ===");
        System.out.println(aluno);

        Turma turma = new Turma(1, "Manhã", "08:00", "10:00", disciplina, professor);
        System.out.println("\n=== TURMA ===");
        System.out.println(turma);

        Prova prova = new Prova(1, turma, "Explique o conceito de pilha e fila.", "11:00");
        System.out.println("\n=== PROVA ===");
        System.out.println(prova);

        Cursa cursa = new Cursa(1, aluno, turma, 2025, 1);
        System.out.println("\n=== CURSA ===");
        System.out.println(cursa);

        Realiza realiza = new Realiza(prova, cursa, 8.75);
        System.out.println("\n=== REALIZA ===");
        System.out.println(realiza);

        System.out.println("\n==========================================");
        System.out.println("RESUMO");
        System.out.println("==========================================");
        System.out.printf("Aluno      : %s (idade: %d)%n", aluno.getNome(), aluno.getIdade());
        System.out.printf("Turma      : %s | %s - %s%n", turma.getTurno(), turma.getHoraInicio(), turma.getHorarioFim());
        System.out.printf("Disciplina : %s (%s)%n", disciplina.getNome(), disciplina.getMateria());
        System.out.printf("Professor  : %s - %s%n", professor.getNome(), professor.getEspecializacao());
        System.out.printf("Prova      : \"%s\" ate %s%n", prova.getPergunta(), prova.getHorarioFim());
        System.out.printf("Matricula  : Ano %d / Semestre %d%n", cursa.getAno(), cursa.getSemestre());
        System.out.printf("Nota       : %.2f%n", realiza.getNota());
    }
}
