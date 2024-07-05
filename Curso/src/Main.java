import java.util.Scanner;


import MatriculaCurso.Curso;


public class Main {
       @SuppressWarnings("unused")
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        @SuppressWarnings("")
        Curso matricula = new Curso();
        
        System.out.println("Digite o curso");
        String nome = scanner.next();
        System.out.println("Digite o valor do Curso");
        double valor = scanner.nextDouble();
        System.out.println("Nome da Turma");
        nome = scanner.next();
        
    

               
        scanner.close();

                   
       }
}
