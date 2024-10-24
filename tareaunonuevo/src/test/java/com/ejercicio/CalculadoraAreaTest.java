package com.ejercicio;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CalculadoraAreaTest {

    private CalculadoraAreas calculadora = new CalculadoraAreas();
    
   /*Pruebas Circulo*/
    @Test
    public void probandoAreaCirculo_Caso_1() {
        double radio = 3;
        double resultado = calculadora.calcularAreaCirculo(radio);
        assertEquals(28.27, resultado, 0.001);  // π * 3^2 ≈ 28.27
    }

    @Test
    public void probandoAreaCirculo_Caso_2() {
        double radio = 0;
        double resultado = calculadora.calcularAreaCirculo(radio);
        assertEquals(0, resultado, 0.001);
    }

    @Test
    public void probandoAreaCirculo_Caso_3() {
        double radio = -1;
        double resultado = calculadora.calcularAreaCirculo(radio);
        assertEquals(0, resultado, 0.001); 
    }
    
    /*Cuadrado*/
    @Test
    public void probandoAreaCuadrado_Caso_1() {
        double lado = 4;
        double resultado = calculadora.calcularAreaCuadrado(lado);
        assertEquals(16, resultado, 0.001);  // 4^2 = 16
    }

    @Test
    public void probandoAreaCuadrado_Caso_2() {
        double lado = 0; 
        double resultado = calculadora.calcularAreaCuadrado(lado);
        assertEquals(0, resultado, 0.001);
    }

    @Test
    public void probandoAreaCuadrado_Caso_3() {
        double lado = -3;
        double resultado = calculadora.calcularAreaCuadrado(lado);
        assertEquals(9, resultado, 0.001);
    }
    
    /*rectangulo*/
    @Test
    public void probandoAreaRectangulo_Caso_1() {
        double base = 5;
        double altura = 4;
        double resultado = calculadora.calcularAreaRectangulo(base, altura);
        assertEquals(20, resultado, 0.001);  // 5 * 4 = 20
    }

    @Test
    public void probandoAreaRectangulo_Caso_2() {
        double base = 0;  // Base 0
        double altura = 10;
        double resultado = calculadora.calcularAreaRectangulo(base, altura);
        assertEquals(0, resultado, 0.001);
    }

    @Test
    public void probandoAreaRectangulo_Caso_3() {
        double base = -5;
        double altura = 4;
        double resultado = calculadora.calcularAreaRectangulo(base, altura);
        assertEquals(-20, resultado, 0.001);
    }
    
    /*Triangulo*/
    @Test
    public void probandoAreaTriangulo_Caso_1() {
        double base = 6;
        double altura = 3;
        double resultado = calculadora.calcularAreaTriangulo(base, altura);
        assertEquals(9, resultado, 0.001);  // (6 * 3) / 2 = 9
    }

    @Test
    public void probandoAreaTriangulo_Caso_2() {
        double base = 0;  // Base 0
        double altura = 5;
        double resultado = calculadora.calcularAreaTriangulo(base, altura);
        assertEquals(0, resultado, 0.001);
    }

    @Test
    public void probandoAreaTriangulo_Caso_3() {
        double base = -6; 
        double altura = 3;
        double resultado = calculadora.calcularAreaTriangulo(base, altura);
        assertEquals(-9, resultado, 0.001);
    }

    
}
