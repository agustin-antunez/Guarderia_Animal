package com.guarderia_animal;

public abstract class Animal {

    //ATRIBUTOS

    protected String tipo;
    protected String nombre;
    protected int edad;
    protected String sexo;
    protected double peso;
    protected String nombreDuenio;
    protected long dniDuenio;
    protected String direccionDuenio;


    //CONSTRUCTOR

    public Animal(String tipo, String nombre, int edad, String sexo, double peso, String nombreDuenio, long dniDuenio, String direccionDuenio){
        this.tipo = tipo;
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = peso;
        this.nombreDuenio = nombreDuenio;
        this.dniDuenio = dniDuenio;
        this.direccionDuenio = direccionDuenio;
    }

    //METODOS
    public abstract void saludar();

    public String getTipo() {return tipo;}

    public String getNombre() {return nombre;}

    public int getEdad() {return edad;}

    public String getSexo() {return sexo;}

    public double getPeso() {return peso;}

    public abstract String getRaza();

    public abstract String getTipoAgua();

    public String getNombreDuenio() {return nombreDuenio;}

    public long getDniDuenio() {return dniDuenio;}

    public String getDireccionDuenio() {return direccionDuenio;}

    @Override
    public String toString() {
        return "Animal{" +
                "tipo='" + tipo + '\'' +
                ", nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", sexo='" + sexo + '\'' +
                ", peso=" + peso +
                ", nombreDuenio='" + nombreDuenio + '\'' +
                ", dniDuenio=" + dniDuenio +
                ", direccionDuenio='" + direccionDuenio + '\'' +
                '}';
    }
}
