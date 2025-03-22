import java.util.Scanner;
import java.util.Stack;

public class Metodos {
    private Stack<Credito> pila = new Stack<>();
    private Scanner sc = new Scanner(System.in);

    public void registrarCredito(String usuario, double monto, double interes, int plazo) {
        pila.push(new Credito(usuario, monto, interes, plazo));
        System.out.println("Crédito registrado correctamente.");
    }

    public void actualizarCredito(String usuario, double nuevoMonto, double nuevoInteres, int nuevoPlazo) {
        Stack<Credito> temp = new Stack<>();
        boolean encontrado = false;

        while (!pila.isEmpty()) {
            Credito c = pila.pop();
            if (c.getUsuario().equals(usuario)) {
                c.setMonto(nuevoMonto);
                c.setInteres(nuevoInteres);
                c.setPlazo(nuevoPlazo);
                encontrado = true;
            }
            temp.push(c);
        }

        while (!temp.isEmpty()) {
            pila.push(temp.pop());
        }

        if (encontrado) {
            System.out.println("Crédito actualizado correctamente.");
        } else {
            System.out.println("Usuario no encontrado.");
        }
    }

    public void venderCredito(String usuario) {
        Stack<Credito> temp = new Stack<>();
        boolean vendido = false;

        while (!pila.isEmpty()) {
            Credito c = pila.pop();
            if (c.getUsuario().equals(usuario)) {
                System.out.println("Crédito vendido: " + c);
                vendido = true;
                break;
            }
            temp.push(c);
        }

        while (!temp.isEmpty()) {
            pila.push(temp.pop());
        }

        if (!vendido) {
            System.out.println("Crédito no encontrado.");
        }
    }

    public void eliminarCredito(String usuario) {
        Stack<Credito> temp = new Stack<>();
        boolean eliminado = false;

        while (!pila.isEmpty()) {
            Credito c = pila.pop();
            if (c.getUsuario().equals(usuario)) {
                System.out.println("Crédito eliminado correctamente.");
                eliminado = true;
                break;
            }
            temp.push(c);
        }

        while (!temp.isEmpty()) {
            pila.push(temp.pop());
        }

        if (!eliminado) {
            System.out.println("Usuario no encontrado.");
        }
    }
}