//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner benjamin = new Scanner(System.in);

        boolean[] asientos = new boolean[10];
        int opcion;

        do {
            System.out.println("\n--- SISTEMA DE VENTA DE BOLETOS CIVA -----");
            System.out.println("1. Mostrar los asientos del bus");
            System.out.println("2. Comprar boleto");
            System.out.println("3. Mostrar resumen de asientos comprados y vendidos");
            System.out.println("4. Salir");
            System.out.println("Selecciona una opcion a realizar:");
            opcion = benjamin.nextInt();

            switch (opcion) {

                case 1:
                    System.out.println("\n--- LISTA DE ASIENTOS ----");

                    for (int i = 0; i < asientos.length; i++) {

                        if (asientos[i] == false) {
                            System.out.println("------------------------------------");
                            System.out.println("Asiento " + (i + 1) + ": DISPONIBLE :)");
                            System.out.println("-------------------------------------");

                        } else {
                            System.out.println("------------------------------------");
                            System.out.println("Asiento " + (i + 1) + ": OCUPADO :(");
                            System.out.println("-------------------------------------");
                        }
                    }
                    break;

                case 2:
                    System.out.println("\n--- COMPRA DE BOLETOS DE CIVA -----");
                    System.out.println("----------------------------------");
                    System.out.println("--- LISTA DE ASIENTOS ----");

                    for (int i = 0; i < asientos.length; i++) {

                        if (asientos[i] == false) {
                            System.out.println("Asiento " + (i + 1) + ": DISPONIBLE :)");
                        } else {
                            System.out.println("Asiento " + (i + 1) + ": OCUPADO :(");
                        }
                    }

                    // Iniciando la compra
                    System.out.println("\nIngresa el asiento que comprara:");
                    int asiento = benjamin.nextInt();

                    // Validando numero de asiento
                    if (asiento < 1 || asiento > 10) {

                        System.out.println("El bus no cuenta con ese numero de asiento");

                    } else {

                        int posicion = asiento - 1;

                        if (asientos[posicion] == false) {

                            asientos[posicion] = true;

                            System.out.println("Asiento comprado correctamente!!");
                            System.out.println("Asiento asignado es el siguiente: " + asiento);

                        } else {

                            System.out.println("Asiento ya ocupado");
                        }
                    }

                    break;

                case 3:

                    System.out.println("\n--- RESUMEN DE ASIENTOS ---");

                    int vendidos = 0;
                    int disponibles = 0;

                    System.out.println("\nASIENTOS VENDIDOS:");

                    for (int i = 0; i < asientos.length; i++) {

                        if (asientos[i] == true) {

                            System.out.println("Asiento " + (i + 1) + ": VENDIDO");
                            vendidos++;

                        }
                    }

                    if (vendidos == 0) {
                        System.out.println("No hay asientos vendidos.");
                    }

                    System.out.println("\nASIENTOS DISPONIBLES:");

                    for (int i = 0; i < asientos.length; i++) {

                        if (asientos[i] == false) {

                            System.out.println("Asiento " + (i + 1) + ": DISPONIBLE");
                            disponibles++;

                        }
                    }

                    System.out.println("\n----------------------------------");
                    System.out.println("Total de asientos: " + asientos.length);
                    System.out.println("Asientos vendidos: " + vendidos);
                    System.out.println("Asientos disponibles: " + disponibles);
                    System.out.println("----------------------------------");

                    break;

                case 4:

                    System.out.println("\nSaliendo del sistema!!");

                    break;

                default:

                    System.out.println("\nOpcion no valida. Intenta nuevamente.");

                    break;
            }

        } while (opcion != 4);

        benjamin.close();
    }
}