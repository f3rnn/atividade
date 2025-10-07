package br.com.example;

public class Circulo {
    private double raio;

    public Circulo(double raio){
        this.raio = raio;
    }

    public double calcularArea(){
        return Math.round(Math.PI * Math.pow(raio, 2)*100)/100;
    }

    public double calcularPerimetro(){
        return Math.round(2 * Math.PI *raio * 100)/100;
    }
}
