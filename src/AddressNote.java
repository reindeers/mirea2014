
/**
 * Created by sever on 14.03.2015.
 */
/*
Написать программу ведения адресной книги. Одна запись в адресной книге содержит имя человека, телефон и e-mail. В классе для адресной книги должны быть методы для:
Добавления записи в книгу (void add(Address newEntry))
Поиска записи по имени человека (возвращает массив индексов найденных записей: int[] find(String name))
Поиска записи по индексу записи в книге (Address get(int index))
Вывода записи на экран (void print(Address entry))
Удаления записи из книги по индексу (void delete(int index))
Получения количества записей в книге (int getCount())
Класс для взаимодействия с пользователем должен быть реализован отдельно и поддерживать команды в виде текстового меню:
Добавление записи (дополнительно запрашивается имя, телефон и e-mail)
Поиск записей (дополнительно запрашиватеся имя для поиска)
Вывод всех записей
Удаление записи (дополнительно запрашивается индекс записи для удаления)
Изменение записи (дополнительно запрашивается индекс изменяемой записи, новые имя, телефон и e-mail)
Выход из программы
*/
public class AddressNote {
    private Address[] addressList = new Address[100];
    private int cnt = 0;
    void add(Address newEntry){
        this.addressList[cnt] = newEntry;
        this.cnt++;
    }
    int[] find(String name){
        int[] arr = new int[cnt];
        int c = 0;

        for (int i = 0; i < cnt; i++){
            if (this.addressList[i].name.equals(name)){
                arr[c] = i;
                c++;
            }
        }
        int[] r =  new int[c];
        System.arraycopy(arr, 0, r, 0, c);

        return r;
    }
    Address get(int index){
        return this.addressList[index];
    }
    void print(Address entry){
        System.out.print(entry.name + " " + entry.email + " " + entry.number);
    }
    void change(int id, Address adr){
        this.addressList[id] = adr;
    }
    void delete(int index){
        for (int i = index; i < this.cnt - 1; i++) {
            this.addressList[i] = this.addressList[i + 1];
        }
        this.addressList[cnt-1] = null;
        this.cnt--;
    }
    int getCount(){
        return this.cnt;
    }

}
