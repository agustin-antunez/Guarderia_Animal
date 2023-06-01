package com.guarderia_animal;

public abstract class Animal {

    //ATRIBUTOS

    protected String tipo;
    protected String nombre;
    protected int edad;
    protected String sexo;
    protected double peso;
    protected String nombreDueño;
    protected long dniDueño;
    protected String direccionDueño;


    //CONSTRUCTOR

    public Animal(String tipo, String nombre, int edad, String sexo, double peso, String nombreDueño, long dniDueño, String direccionDueño){
        this.tipo = tipo;
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = peso;
        this.nombreDueño = nombreDueño;
        this.dniDueño = dniDueño;
        this.direccionDueño = direccionDueño;
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

    public String getNombreDueño() {return nombreDueño;}

    public long getDniDueño() {return dniDueño;}

    public String getDireccionDueño() {return direccionDueño;}

    @Override
    public String toString() {
        return "Animal{" +
                "tipo='" + tipo + '\'' +
                ", nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", sexo='" + sexo + '\'' +
                ", peso=" + peso +
                ", nombreDueño='" + nombreDueño + '\'' +
                ", dniDueño=" + dniDueño +
                ", direccionDueño='" + direccionDueño + '\'' +
                '}';
    }
}
