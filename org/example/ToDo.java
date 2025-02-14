package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class ToDo {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        ArrayList<String> tasks = new ArrayList<>();

        while (true) {
            System.out.println("\n1. Add task");
            System.out.println("2. Show tasks");
            System.out.println("3. Remove task");
            System.out.println("4. Exit");
            System.out.print("Choose option: ");

            int opt = scan.nextInt();
            scan.nextLine();

            switch(opt) {
                case 1:
                    System.out.print("Write a task: ");
                    String task = scan.nextLine();
                    tasks.add(task);
                    System.out.println("New task was added!");
                    break;

                case 2:
                    if(tasks.isEmpty()) {
                        System.out.println("No task available!");
                    } else {
                        System.out.println("\nYour tasks: ");
                        for (int i = 0; i < tasks.size(); i++) {
                            System.out.println((i + 1) + ". " + tasks.get(i));
                        }
                    }
                    break;
                case 3:
                    System.out.print("Type the number of the task u want to remove: ");
                    int taskNumber = scan.nextInt();

                    if(taskNumber > 0 && taskNumber <= tasks.size()) {
                        tasks.remove(taskNumber - 1);
                        System.out.println("Task successfully removed!");
                    } else {
                        System.out.println("Invalid number!");
                    }
                    break;
                case 4:
                    System.out.println("Exit...Bye!");
                    scan.close();
                    return;
                default:
                    System.out.println("Invalid option, please try again!");
            }
        }
    }
}