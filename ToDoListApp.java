import java.util.ArrayList;
import java.util.Scanner;

public class ToDoListApp {

    public static void main(String[] args) {
        ArrayList<String> tasks = new ArrayList<>(); // List to store tasks
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- To-Do List Menu ---");
            System.out.println("1. View Tasks");
            System.out.println("2. Add Task");
            System.out.println("3. Mark Task as Done");
            System.out.println("4. Delete Task");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1: // View Tasks
                    if (tasks.isEmpty()) {
                        System.out.println("Your to-do list is empty!");
                    } else {
                        System.out.println("\nYour Tasks:");
                        for (int i = 0; i < tasks.size(); i++) {
                            System.out.println((i + 1) + ". " + tasks.get(i));
                        }
                    }
                    break;

                case 2: // Add Task
                    System.out.print("Enter a new task: ");
                    String newTask = scanner.nextLine();
                    tasks.add(newTask);
                    System.out.println("Task added successfully!");
                    break;

                case 3: // Mark Task as Done
                    if (tasks.isEmpty()) {
                        System.out.println("No tasks to mark as done!");
                    } else {
                        System.out.println("Enter the task number to mark as done: ");
                        int doneTaskNumber = scanner.nextInt();
                        if (doneTaskNumber > 0 && doneTaskNumber <= tasks.size()) {
                            System.out.println("Task \"" + tasks.get(doneTaskNumber - 1) + "\" marked as done!");
                            tasks.set(doneTaskNumber - 1, tasks.get(doneTaskNumber - 1) + " (DONE)");
                        } else {
                            System.out.println("Invalid task number!");
                        }
                    }
                    break;

                case 4: // Delete Task
                    if (tasks.isEmpty()) {
                        System.out.println("No tasks to delete!");
                    } else {
                        System.out.println("Enter the task number to delete: ");
                        int deleteTaskNumber = scanner.nextInt();
                        if (deleteTaskNumber > 0 && deleteTaskNumber <= tasks.size()) {
                            System.out.println("Task \"" + tasks.remove(deleteTaskNumber - 1) + "\" deleted!");
                        } else {
                            System.out.println("Invalid task number!");
                        }
                    }
                    break;

                case 5: // Exit
                    System.out.println("Exiting the To-Do List app. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        } while (choice != 5);

        scanner.close();
    }
}
