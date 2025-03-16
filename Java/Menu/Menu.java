package Menu;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int numeroProductos = 0;
        Producto[] numeroProductosIntroducidos = null;
        int contadorProductos = 0;
        int opcion;

        do {
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
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Introduce el número de productos que quieres añadir:");
                    numeroProductos = sc.nextInt();
                    numeroProductosIntroducidos = new Producto[numeroProductos];
                    System.out.println("Se ha creado espacio para " + numeroProductos + " productos");
                    break;

                case 2:
                    if (numeroProductosIntroducidos == null) {
                        System.out.println("Introduce un número valido antes de continuar...");
                    } else {
                        String nombreProducto;
                        double precioProductoConDecimales = 0;
                        int precioProductoSinDecimales = 0;
                        do {
                            System.out.println("Introduce el nombre del producto:");
                            nombreProducto = sc.next();
                            System.out.println(
                                    "Quieres introducir un precio del producto que sea con decimales? (S / N)");
                            char SioNo = sc.next().charAt(0);

                            if (SioNo == 'S') {
                                System.out.println("Introduce el precio del producto (con decimales):");
                                precioProductoConDecimales = sc.nextDouble();
                            } else if (SioNo == 'N') {
                                System.out.println("Introduce el precio del producto (sin deciamles):");
                                precioProductoSinDecimales = sc.nextInt();
                            } else {
                                System.out.println("Opción no válida");
                            }
                        } while (nombreProducto == null && precioProductoSinDecimales <= 0.0);

                        Producto producto = new Producto(nombreProducto, precioProductoConDecimales,
                                precioProductoSinDecimales);
                        numeroProductosIntroducidos[contadorProductos] = producto;
                        contadorProductos++;
                        System.out.println(
                                "Producto creado: " + producto.getNombre() + " " + producto.getPrecioConDecimales()
                                        + " " + producto.getPrecioSinDecimales());
                    }
                    break;

                case 3:
                    if (numeroProductosIntroducidos == null || contadorProductos == 0) {
                        System.out.println("No hay productos para mostrar");
                    } else {
                        for (int i = 0; i < contadorProductos; i++) {
                            System.out.println("Producto " + (i + 1) + ": " +
                                    numeroProductosIntroducidos[i].getNombre() + " " +
                                    numeroProductosIntroducidos[i].getPrecioConDecimales() + " " +
                                    numeroProductosIntroducidos[i].getPrecioSinDecimales());
                        }
                    }
                    break;
            }
        } while (opcion != 8);
        sc.close();
    }
}