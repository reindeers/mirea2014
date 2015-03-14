import java.util.Scanner;

/**
 * Created by sever on 14.03.2015.
 */
public class AddressInterface {
    public static void main(String[] args) {
        AddressNote book = new AddressNote();
        while (true){
            System.out.println("1. Добавление записи");
            System.out.println("2. Поиск записи по имени человека");
            System.out.println("3. Вывод всех записей на экран");
            System.out.println("4. Удаление записи по индексу");
            System.out.println("5. Изменение записи");
            System.out.println("6. Выход");
            System.out.println("Введите номер пункта меню: ");

            Scanner sc = new Scanner(System.in);
            String menu = sc.nextLine();
            int task = Integer.parseInt(menu);

            switch (task){
                case 1:{
                    System.out.println("Введите имя");
                    String name = sc.nextLine();

                    System.out.println("Введите телефон");
                    int number = Integer.parseInt(sc.nextLine());

                    System.out.println("Введите почту");
                    String email = sc.nextLine();

                    Address adr = new Address(name, email, number);
                    book.add(adr);
                    System.out.println("Добавлено.");

                    break;
                }

                case 2:{
                    System.out.println("Введите имя");
                    String name = sc.nextLine();
                    int[] num = book.find(name);
                    if (num.length == 0){
                        System.out.println("Ничего не найдено");
                    } else {
                        for(int i : num) System.out.println(book.get(i));
                    }
                    break;

                }

                case 3:{
                    for(int i = 0; i < book.getCount(); i++){
                        book.print(book.get(i));
                    }
                    break;
                }

                case 4:{
                    System.out.println("Введите индекс");
                    int id = Integer.parseInt(sc.nextLine());
                    book.delete(id);
                    System.out.println("Запись удалена");
                    break;
                }

                case 5:{
                    System.out.println("Введите индекс");
                    int id = Integer.parseInt(sc.nextLine());

                    System.out.println("Введите имя");
                    String name = sc.nextLine();

                    System.out.println("Введите телефон");
                    int number = Integer.parseInt(sc.nextLine());

                    System.out.println("Введите почту");
                    String email = sc.nextLine();

                    Address adr = new Address(name, email, number);
                    book.change(id, adr);
                    System.out.println("Запись изменена");
                    break;
                }

                case 6:{
                    return;
                }

                default: {
                    return;
                }
            }
        }
    }
}
