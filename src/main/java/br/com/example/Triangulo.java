package br.com.example;

public class Triangulo {
    private int altura;
    private int base;
    private int lado;
    
    public Triangulo(int altura, int base, int lado) {
        this.altura = altura;
        this.base = base;
        this.lado = lado;
    }

    public int calcularArea(){
        return (base*altura)/2;
    }

    public int calcularPerimetro(){
        return lado*3;
    }
}
