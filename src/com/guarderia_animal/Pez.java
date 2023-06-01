package com.guarderia_animal;

public class Pez extends Animal{

    //ATRIBUTO

    private String tipoAgua;

    public Pez(String tipo, String nombre, int edad, String sexo, double peso, String tipoAgua, String nombreDueño, long dniDueño, String direccionDueño) {
        super(tipo, nombre, edad, sexo, peso, nombreDueño, dniDueño, direccionDueño);
        this.tipoAgua = tipoAgua;
    }

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
                ", nombreDueño='" + nombreDueño + '\'' +
                ", dniDueño=" + dniDueño +
                ", direccionDueño='" + direccionDueño + '\'' +
                '}';
    }
}
