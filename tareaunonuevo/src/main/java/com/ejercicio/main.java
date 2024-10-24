package com.ejercicio;

import java.util.Scanner;

public class main {
	public static void main(String[] args) {
        CalculadoraAreas calculadora = new CalculadoraAreas();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Seleccione una opción:");
            System.out.println("1. Calcular el área de un círculo");
            System.out.println("2. Calcular el área de un cuadrado");
            System.out.println("3. Calcular el área de un rectángulo");
            System.out.println("4. Calcular el área de un triángulo");
            System.out.println("5. Salir");

            int opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el radio del círculo: ");
                    double radio = scanner.nextDouble();
                    System.out.println("Área del círculo: " + calculadora.calcularAreaCirculo(radio));
                    break;
                case 2:
                    System.out.print("Ingrese el lado del cuadrado: ");
                    double lado = scanner.nextDouble();
                    System.out.println("Área del cuadrado: " + calculadora.calcularAreaCuadrado(lado));
                    break;
                case 3:
                    System.out.print("Ingrese la base del rectángulo: ");
                    double baseRect = scanner.nextDouble();
                    System.out.print("Ingrese la altura del rectángulo: ");
                    double alturaRect = scanner.nextDouble();
                    System.out.println("Área del rectángulo: " + calculadora.calcularAreaRectangulo(baseRect, alturaRect));
                    break;
                case 4:
                    System.out.print("Ingrese la base del triángulo: ");
                    double baseTri = scanner.nextDouble();
                    System.out.print("Ingrese la altura del triángulo: ");
                    double alturaTri = scanner.nextDouble();
                    System.out.println("Área del triángulo: " + calculadora.calcularAreaTriangulo(baseTri, alturaTri));
                    break;
                case 5:
                    System.out.println("Saliendo del programa...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        }
    }

}
