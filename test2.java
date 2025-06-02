import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Введите первую строку (a):");
        String a = scanner.nextLine();
        
        System.out.println("Введите вторую строку (b):");
        String b = scanner.nextLine();
        
        if (a == null || b == null) {
            System.out.println("Одна из строк является null");
            return;
        }
        
        if (a.isEmpty() || b.isEmpty()) {
            System.out.println("Одна из строк пустая");
            return;
        }
        
        if (a.equals(b)) {
            System.out.println("Строки идентичны");
        } else {
            System.out.println("Строки неидентичны");
        }
        
        scanner.close();

    }
}
