package com.guarderia_animal;

public class Gato extends Animal{

    //CONSTRUCTOR
    public Gato(String tipo, String nombre, int edad, String sexo, double peso, String nombreDuenio, long dniDuenio, String direccionDuenio) {
        super(tipo, nombre, edad, sexo, peso, nombreDuenio, dniDuenio, direccionDuenio);
    }

    //METODOS
    @Override
    public void saludar() {System.out.println(" Hola soy " + getNombre() + " y estoy saludando, digo... Miau");}

    @Override
    public String getRaza() {
        return null;
    }

    @Override
    public String getTipoAgua() {
        return null;
    }
}
