package Circulo;

public class Circulo {

    private double radio;

    public Circulo() {
        this.radio = 2.5;
    }

    public double areaCirculo(double radio) {
        return Constantes.PI * (radio * radio);
    }
}
