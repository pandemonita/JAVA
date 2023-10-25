import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> tasks = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("To-Do List");
            System.out.println("1. Adicionar tarefa");
            System.out.println("2. Listar tarefas");
            System.out.println("3. Marcar tarefa como concluída");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");

            int choice = scanner.nextInt();
            scanner.nextLine();  // Limpar a nova linha deixada pelo nextInt()

            switch (choice) {
                case 1:
                    System.out.print("Digite a tarefa a ser adicionada: ");
                    String task = scanner.nextLine();
                    tasks.add(task);
                    System.out.println("Tarefa adicionada!");
                    break;

                case 2:
                    System.out.println("Tarefas:");
                    for (int i = 0; i < tasks.size(); i++) {
                        System.out.println((i + 1) + ". " + tasks.get(i));
                    }
                    break;

                case 3:
                    System.out.print("Digite o número da tarefa concluída: ");
                    int taskIndex = scanner.nextInt();
                    if (taskIndex >= 1 && taskIndex <= tasks.size()) {
                        tasks.remove(taskIndex - 1);
                        System.out.println("Tarefa marcada como concluída!");
                    } else {
                        System.out.println("Índice inválido.");
                    }
                    break;

                case 4:
                    System.out.println("Saindo do programa.");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}
