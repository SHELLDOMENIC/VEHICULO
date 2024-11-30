

package com.mycompany.vehiculo;


public class Vehiculo {
 private String marca;
    private int modelo; 
    private double motor; 
    private String tipoCombustible; 
    private String tipoAuto; 
    private int cantidadPuertas;
    private int cantidadAsientos;
    private double velocidadMaxima;
    private String color; 
    private double velocidadActual;

   
    public Vehiculo(String marca, int modelo, double motor, String tipoCombustible, String tipoAuto,
                     int cantidadPuertas, int cantidadAsientos, double velocidadMaxima, String color) {
        this.marca = marca;
        this.modelo = modelo;
        this.motor = motor;
        this.tipoCombustible = tipoCombustible;
        this.tipoAuto = tipoAuto;
        this.cantidadPuertas = cantidadPuertas;
        this.cantidadAsientos = cantidadAsientos;
        this.velocidadMaxima = velocidadMaxima;
        this.color = color;
        this.velocidadActual = 0.0; 
         
        
       public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public double getMotor() {
        return motor;
    }

    public void setMotor(double motor) {
        this.motor = motor;
    }

    public String getTipoCombustible() {
        return tipoCombustible;
    }

    public void setTipoCombustible(String tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
    }

    public String getTipoAuto() {
        return tipoAuto;
    }

    public void setTipoAuto(String tipoAuto) {
        this.tipoAuto = tipoAuto;
    }

    public int getCantidadPuertas() {
        return cantidadPuertas;
    }
}
