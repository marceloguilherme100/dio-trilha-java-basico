import java.util.Scanner;

public class MediaAluno {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        String[] alunos = {"Camila", "Lucas", "Bruna", "Pedro"};

        double media = calcularMediaDaTurma(alunos, scan);

        System.out.printf("Media de turma %1.f", media);
    }

    /**
     *
     * @param alunos
     * @param scanner
     * @return
     */
    public static double calcularMediaDaTurma(String[] alunos, Scanner scanner) {

        double soma = 0;
        for(String aluno : alunos) {
            System.out.printf("Nota do aluno %s: ", aluno);
            double nota = scanner.nextDouble();
            soma += nota;
        }
        
        return soma / alunos.length;
    }

}