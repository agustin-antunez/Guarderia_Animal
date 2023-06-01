package com.guarderia_animal;

public class Perro extends Animal{

    //ATRIBUTOS

    private String raza;

    public Perro(String tipo, String nombre, int edad, String sexo, double peso, String raza, String nombreDueño, long dniDueño, String direccionDueño) {
        super(tipo, nombre, edad, sexo, peso, nombreDueño, dniDueño, direccionDueño);
        this.raza = raza;
    }

    @Override
    public void saludar() {
        System.out.println(" Hola soy " + getNombre() + " y estoy saludando, digo... guau guau");
    }

    @Override
    public String getRaza() {
        return raza;
    }

    @Override
    public String getTipoAgua() {
        return null;
    }


    @Override
    public String toString() {
        return "Perro{" +
                ", tipo='" + tipo + '\'' +
                ", nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", sexo='" + sexo + '\'' +
                ", peso=" + peso +
                ", raza='" + raza + '\'' +
                ", nombreDueño='" + nombreDueño + '\'' +
                ", dniDueño=" + dniDueño +
                ", direccionDueño='" + direccionDueño + '\'' +
                '}';
    }
}
