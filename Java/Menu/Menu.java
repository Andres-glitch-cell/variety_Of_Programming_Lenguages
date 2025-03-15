package Menu;
import java.util.Scanner;
public class Menu {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("--Menu--");
        System.out.println("1. Introduce cuantos productos quieres añadir al código");
        System.out.println("2. Dar de alta un producto");
        System.out.println("3. Visualizar los productos");
        System.out.println("4. Media de los productos (precios)");
        System.out.println("5. Eliminar un producto");
        System.out.println("6. Almacenar varios productos en un bloque (array)");
        System.out.println("7. Visualizar el bloque de productos");
        System.out.println("8. Salir");
        System.out.println("Elige una opción:");
        int opcion = sc.nextInt();
        sc.close();
    }

}