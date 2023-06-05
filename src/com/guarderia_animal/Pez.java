package com.guarderia_animal;

public class Pez extends Animal{

    //ATRIBUTOS
    private String tipoAgua;

    //CONSTRUCTOR
    public Pez(String tipo, String nombre, int edad, String sexo, double peso, String tipoAgua, String nombreDuenio, long dniDuenio, String direccionDuenio) {
        super(tipo, nombre, edad, sexo, peso, nombreDuenio, dniDuenio, direccionDuenio);
        this.tipoAgua = tipoAgua;
    }

    //METODOS
    @Override
    public void saludar() {
        System.out.println(" Hola soy " + getNombre() + " y estoy saludando, digo:  glup glup");
    }

    @Override
    public String getRaza() {
        return null;
    }

    @Override
    public String getTipoAgua() {
        return tipoAgua;
    }


    @Override
    public String toString() {
        return "Pez{" +
                ", tipo='" + tipo + '\'' +
                ", nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", sexo='" + sexo + '\'' +
                ", peso=" + peso +
                ", tipoAgua='" + tipoAgua + '\'' +
                ", nombreDuenio='" + nombreDuenio + '\'' +
                ", dniDuenio=" + dniDuenio +
                ", direccionDuenio='" + direccionDuenio + '\'' +
                '}';
    }
}
