package com.guarderia_animal;

public class Perro extends Animal{

    //ATRIBUTOS

    private String raza;

    //CONSTRUCTOR
    public Perro(String tipo, String nombre, int edad, String sexo, double peso, String raza, String nombreDuenio, long dniDuenio, String direccionDuenio) {
        super(tipo, nombre, edad, sexo, peso, nombreDuenio, dniDuenio, direccionDuenio);
        this.raza = raza;
    }

    //METODOS
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
                ", nombreDuenio='" + nombreDuenio + '\'' +
                ", dniDuenio=" + dniDuenio +
                ", direccionDuenio='" + direccionDuenio + '\'' +
                '}';
    }
}
