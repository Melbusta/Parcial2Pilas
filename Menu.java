import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Metodos metodos = new Metodos();
        Scanner sc = new Scanner(System.in);
        int opt;

        do {
            System.out.println("\n--- MENÚ BANCO ---");
            System.out.println("1. Registrar crédito");
            System.out.println("2. Actualizar crédito");
            System.out.println("3. Vender crédito");
            System.out.println("4. Eliminar crédito");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");
            opt = sc.nextInt();
            sc.nextLine();

            switch (opt) {
                case 1:
                    System.out.print("Ingrese el usuario: ");
                    String usuario = sc.nextLine();
                    System.out.print("Ingrese el monto: ");
                    double monto = sc.nextDouble();
                    System.out.print("Ingrese la tasa de interés: ");
                    double interes = sc.nextDouble();
                    System.out.print("Ingrese el plazo en meses: ");
                    int plazo = sc.nextInt();
                    metodos.registrarCredito(usuario, monto, interes, plazo);
                    break;
                case 2:
                    System.out.print("Ingrese el usuario del crédito a actualizar: ");
                    usuario = sc.nextLine();
                    System.out.print("Ingrese el nuevo monto: ");
                    monto = sc.nextDouble();
                    System.out.print("Ingrese la nueva tasa de interés: ");
                    interes = sc.nextDouble();
                    System.out.print("Ingrese el nuevo plazo en meses: ");
                    plazo = sc.nextInt();
                    metodos.actualizarCredito(usuario, monto, interes, plazo);
                    break;
                case 3:
                    System.out.print("Ingrese el usuario del crédito a vender: ");
                    usuario = sc.nextLine();
                    metodos.venderCredito(usuario);
                    break;
                case 4:
                    System.out.print("Ingrese el usuario del crédito a eliminar: ");
                    usuario = sc.nextLine();
                    metodos.eliminarCredito(usuario);
                    break;
                case 5:
                    metodos.MostrarCredito();
                     break;
                case 0:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción inválida.");
                    break;
            }
        } while (opt != 0);

        sc.close();
    }
}
