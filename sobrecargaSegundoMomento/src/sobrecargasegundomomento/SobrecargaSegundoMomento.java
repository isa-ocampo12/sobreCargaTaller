package sobrecargasegundomomento;

import java.util.Scanner;

public class SobrecargaSegundoMomento {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        matriculas matriculas = new matriculas();
        byte bandera = 0;
        float valorMateria, descuento, cantidadVoluntaria;
        int cantidadMaterias, opcion;

        System.out.print("Ingrese el valor de la materia: ");
        valorMateria = teclado.nextFloat();

        System.out.print("Ingrese la cantidad de materias: ");
        cantidadMaterias = teclado.nextInt();

        System.out.println("Menu");
        System.out.println("1. para estrado 1 y 2");
        System.out.println("2. para estrato 3 y 4");
        System.out.println("3. para estrato 5 y 6");

        do {
            if (bandera == 0) {
                System.out.print("Ingrese entre 1 y 3: ");
                opcion = teclado.nextInt();
                bandera = 1;
            } else {
                System.out.println("ERROR Ingrese entre 1 y 3: ");
                opcion = teclado.nextInt();

            }

        } while (opcion < 1 || opcion > 3);

        switch (opcion) {
            case 1:
                System.out.print("Ingrese el descuento en porcentaje: ");
                descuento = teclado.nextFloat();
                System.out.println("Total: " + matriculas.valorMatricula(cantidadMaterias, valorMateria, descuento));
                break;

            case 2:
                System.out.println("Total: " + matriculas.valorMatricula(cantidadMaterias, valorMateria));
                break;

            case 3:
                System.out.println("Ingrese la cantidad voluntaria: ");
                cantidadVoluntaria = teclado.nextFloat();
                System.out.println("Total: " + matriculas.valorMatricula(valorMateria, cantidadMaterias, cantidadVoluntaria));
                break;
        }

    }

}
