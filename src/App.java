import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        CajeroAutomatico cajero = new CajeroAutomatico();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Por favor, indique la cantidad que desea dispensar o escriba 0 para cancelar.");
            int cantidad = scanner.nextInt();

            if (cantidad == 0) {
                System.out.println("Nos complace que haya utilizado nuestro cajero automatico.");
                break;
            }

            cajero.dispensar(cantidad);
        }

        scanner.close();
    }
}

