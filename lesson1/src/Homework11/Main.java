package Homework11;




import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.nio.file.Files.exists;

public class Main {
        // Use Scanner for reading input from the user
        Scanner scanner = new Scanner(System.in);
        List<String> todoList = new ArrayList<>();

        public static void main(String[] args) {
            Main main = new Main();
            main.start();
        }

        public void start() {
            // Этот бесконечный цикл предназначен для того, чтобы приложение работало
            // пока пользователь не захочет выйти выбрав в меню команду номер 5
            while (true) {
                displayMenu();
                if (scanner.hasNextInt()) {
                    int choice = scanner.nextInt();
                    scanner.nextLine();
                    handleMenuChoice(choice);
                }
            }
        }

        public void displayMenu() {
            System.out.println("Список доступных команд");
            System.out.println("1. Вывести спискок дел");
            System.out.println("2. Добавить дело");
            System.out.println("3. Заменить дело");
            System.out.println("4. Удалить дело");
            System.out.println("5. Выход");
            System.out.println("Введите число от 1 до 5 чтобы выбрать действие:");
        }

        public void handleMenuChoice(int choice) {
            switch (choice) {
                case 1:
                     list();
                    break;
                case 2:
                    add();
                    break;
                case 3:

                    System.out.println("Введите номер дела для редактирования:");
                    int index = scanner.nextInt();
                    System.out.println("Введите новое дело:");
                    scanner.nextLine();
                    String editedTask = scanner.nextLine();
                    edit(index, editedTask);

                    break;
                case 4:
                    System.out.println("Введите номер дела для удаления:");
                    int deleteIndex = scanner.nextInt();
                    delete(deleteIndex);

                    break;
                case 5:
                    System.out.println("Exiting...");
                    System.exit(0);
                    break;
                default:
                    // обработка остальных возмножных варантов ввода пользователя
            }
        }

        // реализация всех методов ToDoList
        private void list() {
            if (todoList.isEmpty()) {
                System.out.println("Список дел пуст.");
            }else{
                System.out.println("Список дел:");
                for (int i = 0; i< todoList.size(); i++ ){
                    System.out.println((i+1) + "." + todoList.get(i));
                }
            }
            }
        private void add() {



            System.out.println("Введите дело которое хотите добавить:");

            if (scanner.hasNextLine()) {
                String command = scanner.nextLine();
                todoList.add(command);

                System.out.println("Дело " + command + " успешно добавлено");
            }
        }

        private void edit(int index, String newTodo) {

            if (index <= todoList.size()) {
                todoList.set(index, newTodo);
                System.out.println("дело под номером" + index+"изменено на:" + newTodo);
                }
            }


        private void delete(int index) {
    if (index <= todoList.size()){

            String removedTodo = todoList.remove(index-1);
        System.out.println("Дело под номером " + index + "удалено:" + removedTodo);


        } else {
        System.out.println("Некорректный номер дела.");
    }
    }
    }



