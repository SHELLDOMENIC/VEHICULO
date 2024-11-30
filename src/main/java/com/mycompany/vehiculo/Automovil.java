

package com.mycompany.vehiculo;

    
    public class Automovil {
    
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

   
    public Automovil(String marca, int modelo, double motor, String tipoCombustible, String tipoAuto,
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

    public void setCantidadPuertas(int cantidadPuertas) {
        this.cantidadPuertas = cantidadPuertas;
    }

    public int getCantidadAsientos() {
        return cantidadAsientos;
    }

    public void setCantidadAsientos(int cantidadAsientos) {
        this.cantidadAsientos = cantidadAsientos;
    }

    public double getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setVelocidadMaxima(double velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getVelocidadActual() {
        return velocidadActual;
    }

    public void setVelocidadActual(double velocidadActual) {
        this.velocidadActual = velocidadActual;
    }

   
    public void acelerar(double incremento) {
        if (velocidadActual + incremento > velocidadMaxima) {
            System.out.println("No se puede acelerar más allá de la velocidad máxima.");
        } else {
            velocidadActual += incremento;
            System.out.println("La velocidad actual es: " + velocidadActual + " km/h");
        }
    }

    
    public void desacelerar(double decremento) {
        if (velocidadActual - decremento < 0) {
            velocidadActual = 0;
            System.out.println("La velocidad no puede ser negativa. Se ha detenido el vehículo.");
        } else {
            velocidadActual -= decremento;
            System.out.println("La velocidad actual es: " + velocidadActual + " km/h");
        }
    }

    
    public void calcularTiempo(double distancia) {
        if (velocidadActual == 0) {
            System.out.println("El vehículo está detenido. No se puede calcular el tiempo.");
        } else {
            double tiempo = distancia / velocidadActual;
            System.out.println("El tiempo estimado para recorrer " + distancia + " km es: " + tiempo + " horas.");
        }
    }

    
    public void mostrarInformacion() {
        System.out.println("Información del vehículo:");
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Tipo de Combustible: " + tipoCombustible);
        System.out.println("Tipo de Auto: " + tipoAuto);
        System.out.println("Velocidad máxima: " + velocidadMaxima + " km/h");
        System.out.println("Color: " + color);
        System.out.println("Cantidad de puertas: " + cantidadPuertas);
        System.out.println("Cantidad de asientos: " + cantidadAsientos);
    }

    
    public static void main(String[] args) {
        
        Automovil miAuto = new Automovil("Toyota", 2023, 2.0, "Gasolina", "SUV", 4, 5, 180, "Rojo");

       
        miAuto.mostrarInformacion();

        
        miAuto.acelerar(60); 
        miAuto.desacelerar(20); 
        miAuto.calcularTiempo(100); 
    }

    }  
}