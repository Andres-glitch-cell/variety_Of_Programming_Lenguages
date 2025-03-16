package Menu;

import java.util.Scanner;

public class Menu {
    // Esto lo he leido que te ignora las Warnings de null.
    @SuppressWarnings("null")
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int numeroProductos = 0;
        Producto[] numeroProductosIntroducidos = null;
        int contadorProductos = 0;
        int opcion;
        String[] numeroDeProductosUsuario = null;

        double precioProductoConDecimales = 0;
        int precioProductoSinDecimales = 0;

        do {
            System.out.println("\n--Menu--");
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
                // 1. Introduce cuantos productos quieres añadir al código
                case 1:
                    System.out.println("Introduce el número de productos que quieres añadir:");
                    numeroProductos = sc.nextInt();
                    numeroProductosIntroducidos = new Producto[numeroProductos];
                    System.out.println("Se ha creado espacio para " + numeroProductos + " productos");
                    if (numeroProductos <= 0) {
                        System.out.println("No puedes continuar si no introduces una cantidad de productos (Mínimo 1)");
                    }
                    break;

                // 2. Dar de alta un producto
                case 2:
                    if (numeroProductosIntroducidos == null) {
                        System.out.println("Tienes que introducir al menos 1 producto antes...");
                    } else {
                        String[] nombreProducto = new String[numeroProductos]; // Inicializar array correctamente
                        numeroDeProductosUsuario = new String[numeroProductos];

                        sc.nextLine(); // Limpiar buffer

                        do {
                            for (int i = 0; i < numeroProductosIntroducidos.length; i++) {
                                System.out.println("Introduce el nombre del producto " + (i + 1) + ":");
                                nombreProducto[i] = sc.nextLine();
                                numeroDeProductosUsuario[i] = nombreProducto[i];
                            }

                            System.out.println("Los nombres de los productos son:");
                            for (int i = 0; i < numeroProductosIntroducidos.length; i++) {
                                System.out.println("Producto " + (i + 1) + ": " + nombreProducto[i]);
                            }

                            // Para cada producto, pedir su precio
                            for (int i = 0; i < numeroProductosIntroducidos.length; i++) {
                                System.out.println("\nPara el producto " + nombreProducto[i]);
                                System.out.println("\n¿Quieres introducir un precio con decimales? (S/N)");
                                char SioNo = sc.next().charAt(0);

                                if (SioNo == 'S') {
                                    System.out.println("Introduce el precio con decimales:");
                                    precioProductoConDecimales = sc.nextDouble();
                                    // Crear y guardar el producto
                                    numeroProductosIntroducidos[i] = new Producto(nombreProducto[i],
                                            precioProductoConDecimales, 0);
                                } else if (SioNo == 'N') {
                                    System.out.println("Introduce el precio sin decimales:");
                                    precioProductoSinDecimales = sc.nextInt();
                                    // Crear y guardar el producto
                                    numeroProductosIntroducidos[i] = new Producto(nombreProducto[i], 0,
                                            precioProductoSinDecimales);
                                }
                                contadorProductos++;

                                // Esta parte lo admito lo ha hecho la IA por que ni yo me aclaría
                                System.out.println("Los precios con los nombres de los productos son:");
                                for (int y = 0; y < numeroProductosIntroducidos.length; y++) {
                                    if (numeroProductosIntroducidos[y].getPrecioConDecimales() > 0) {
                                        System.out.println("Producto " + (y + 1) + ": " + nombreProducto[y] +
                                                " - Precio: " + numeroProductosIntroducidos[y].getPrecioConDecimales()
                                                + "€");
                                    } else {
                                        System.out.println("Producto " + (y + 1) + ": " + nombreProducto[y] +
                                                " - Precio: " + numeroProductosIntroducidos[y].getPrecioSinDecimales()
                                                + "€");
                                    }
                                }
                            }
                            break; // Salir del do-while después de procesar todos los productos
                        } while (false); // Cambiado para que solo se ejecute una vez
                    }
                    break;

                // 3. Visualizar los productos
                case 3:
                    if (numeroProductosIntroducidos == null || contadorProductos == 0) {
                        System.out.println("No has introducido ningun producto para mostrar");
                    } else {
                        for (int i = 0; i < contadorProductos; i++) {
                            System.out.println("Producto " + (i + 1) + ": " + numeroProductosIntroducidos[i].getNombre()
                                    + " " + numeroProductosIntroducidos[i].getPrecioConDecimales() + " " +
                                    numeroProductosIntroducidos[i].getPrecioSinDecimales());
                        }
                    }
                    break;

                case 4:
                    // Media de los productos (precios)

            }
        } while (opcion != 8);
        sc.close();
    }
}