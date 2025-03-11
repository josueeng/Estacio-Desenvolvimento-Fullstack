import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Qual seu nome? ");
        String Nome = scanner.next();
        System.out.println("Quantos anos voce tem? ");
        int Anos = scanner.nextInt();
        System.out.println("qual seu endereço?");
        String endereco = scanner.next();
        scanner.close();
        System.out.println("Seu nome é " + Nome + ", você tem " + Anos + " anos e mora em " + endereco);

    }
}
