import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Введите первую строку (a):");
        String a = scanner.nextLine();
        
        System.out.println("Введите вторую строку (b):");
        String b = scanner.nextLine();
        
        // Проверка на пустые строки
        if (a == null || b == null) {
            System.out.println("Одна из строк является null");
            return;
        }
        
        // Проверка на пустые строки после ввода
        if (a.isEmpty() || b.isEmpty()) {
            System.out.println("Одна из строк пустая");
            return;
        }
        
        // Сравнение строк
        if (a.equals(b)) {
            System.out.println("Строки идентичны");
        } else {
            System.out.println("Строки неидентичны");
        }
        
        scanner.close();


        // Вообще у меня проблема со сравнениями слов через стандартную командную строку windows
        // он там воспринимает кириллицу одинаково, у него все коды символов "0 0 0 0 0"
        // GitBash все работает корректно, но вся кириллица прописанная в коде превращается в символы
        // по этому я использую bat файлы для запуска в cmd что бы проверить кириллицу в программе
        // и gitbash для проверки работы логики программы
        // я уже замучался с этим и все настройки переделал под UTF-8 и прочее, проблему пока так и не решил
    }
}