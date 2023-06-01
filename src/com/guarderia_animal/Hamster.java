package com.guarderia_animal;

public class Hamster extends Animal{

    public Hamster(String tipo, String nombre, int edad, String sexo, double peso, String nombreDueño, long dniDueño, String direccionDueño) {
        super(tipo, nombre, edad, sexo, peso, nombreDueño, dniDueño, direccionDueño);
    }

    @Override
    public void saludar() {
        System.out.println(" Hola soy " + getNombre() + " y estoy saludando, digo... squish squish");
    }

    @Override
    public String getRaza() {
        return null;
    }

    @Override
    public String getTipoAgua() {
        return null;
    }
}
