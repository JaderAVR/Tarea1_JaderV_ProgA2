package com.ejercicio;

public class CalculadoraAreas {
	
	public double calcularAreaCirculo(double radio) {
        if (radio <= 0) throw new IllegalArgumentException("El radio debe ser mayor a 0");
        return Math.PI * radio * radio;
    }

    public double calcularAreaCuadrado(double lado) {
        if (lado <= 0) throw new IllegalArgumentException("El lado debe ser mayor a 0");
        return lado * lado;
    }

    public double calcularAreaRectangulo(double base, double altura) {
        if (base <= 0 || altura <= 0) throw new IllegalArgumentException("La base y la altura deben ser mayores a 0");
        return base * altura;
    }

    public double calcularAreaTriangulo(double base, double altura) {
        if (base <= 0 || altura <= 0) throw new IllegalArgumentException("La base y la altura deben ser mayores a 0");
        return (base * altura) / 2;
    }

}
