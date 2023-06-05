package com.guarderia_animal;

import java.util.*;

public class Guarderia {

    //ARRAYLIST
    private static final ArrayList<Animal> animales = new ArrayList<>();

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int opcion;

        do {

            menu();
            opcion = sc.nextInt();
            sc.nextLine(); //Limpiar el buffer de entrada
            switch (opcion) {
                case 1:
                    ingresarAnimal(sc);
                    break;
                case 2:
                    retirarAnimal(sc);
                    break;
                case 3:
                    calcularTotalAnimales();
                    break;
                case 4:
                    listarAnimales();
                    break;
                case 5:
                    saludoGeneral();
                    break;
                case 0:
                    break;
            }

        } while (opcion != 0);
    }

    public static void menu(){
        System.out.println(" ");
        System.out.println("Hola bienvenido al sistema de datos de la Guarderia SunnySide :)");
        System.out.println("A continuacion ingrese la opcion correspondiente a sus necesidades: ");
        System.out.println("1. Ingresar a un animal a la guarderia.");
        System.out.println("2. Retirar animal de la guarderia");
        System.out.println("3. Calcular cantidad de animales que se encuentran en la guarderia");
        System.out.println("4. Listar todos los animales con sus datos");
        System.out.println("5. Hacer saludar a todos los animales de la guarderia");
        System.out.println("0. Salir del sistema");
        System.out.println(" ");
    }

    public static void ingresarAnimal(Scanner scanner) {
        System.out.println("/////////// Ingresar Animal ///////////");
        System.out.println("Tipo de animal: ");
        String tipo = scanner.nextLine();

        Animal animal;

        System.out.println("nombre del animal: ");
        String nombreAnimal = scanner.nextLine();
        System.out.println("Edad del animal (años): ");
        int edadAnimal = scanner.nextInt();
        scanner.nextLine(); //Limpia el buffer de entrada
        System.out.println("Sexo del animal (Macho o Hembra): ");
        String sexoAnimal = scanner.nextLine();
        System.out.println("Peso del animal en Kg: ");
        double pesoAnimal = scanner.nextDouble();
        scanner.nextLine(); //Limpia el buffer de entrada
        String razaAnimal = null;
        if (tipo.equals("Perro") || tipo.equals("perro")) {
            System.out.println("Raza del animal: ");
            razaAnimal = scanner.nextLine();
        }
        String tipoAgua = null;
        if (tipo.equals("Pez") || (tipo.equals("pez"))) {
            System.out.println("Tipo de agua: ");
            tipoAgua = scanner.nextLine();
        }
        System.out.println("Nombre del dueño: ");
        String nombreDuenio = scanner.nextLine();
        System.out.println("DNI del dueño: ");
        long dniDuenio = scanner.nextLong();
        scanner.nextLine(); //Limpia buffer de entrada
        System.out.println("Direccion del dueño: ");
        String direccionDuenio = scanner.nextLine();
        System.out.println(" ");
        System.out.println("Se ha registrado al animal con exito. Gracias por confiar en nosotros :)");

        //Creamos el objeto Perro en este caso

        if (tipo.equals("Perro") || tipo.equals("perro")) {
            animal = new Perro(tipo, nombreAnimal, edadAnimal, sexoAnimal, pesoAnimal, razaAnimal, nombreDuenio, dniDuenio, direccionDuenio);
            animales.add(animal);
        } else if (tipo.equals("Gato") || tipo.equals("gato")) {
            animal = new Gato(tipo, nombreAnimal, edadAnimal, sexoAnimal, pesoAnimal, nombreDuenio, dniDuenio, direccionDuenio);
            animales.add(animal);
        } else if (tipo.equals("Pez") || tipo.equals("pez")) {
            animal = new Pez(tipo, nombreAnimal, edadAnimal, sexoAnimal, pesoAnimal, tipoAgua, nombreDuenio, dniDuenio, direccionDuenio);
            animales.add(animal);
        } else if (tipo.equals("Hamster") || tipo.equals("hamster")) {
            animal = new Hamster(tipo, nombreAnimal, edadAnimal, sexoAnimal, pesoAnimal, nombreDuenio, dniDuenio, direccionDuenio);
            animales.add(animal);
        } else {
            System.out.println("No aceptamos ese tipo de animales a nuestra guarderia.");
        }


    }

    public static void listarAnimales() {

        if (animales.isEmpty()){
            System.out.println("Aun no se encuentran animales registrados");
        }
        else {
            System.out.println("///////////// Lista de animales ingresados /////////////");

            for (int i = 0; i < animales.size(); i++) {
                Animal animal = animales.get(i);

                System.out.println("Tipo de animal: " + animal.getTipo());
                System.out.println("Nombre del animal: " + animal.getNombre());
                System.out.println("Edad del animal: " + animal.getEdad() + " años");
                System.out.println("Sexo del animal: " + animal.getSexo());
                System.out.println("Peso del animal: " + animal.getPeso() + " Kg");
                if (animal.getTipo().equals("Perro") || animal.getTipo().equals("perro")) {
                    System.out.println("Raza del animal: " + animal.getRaza());
                }
                if (animal.getTipo().equals("Pez") || animal.getTipo().equals("pez")) {
                    System.out.println("Tipo de agua: " + animal.getTipoAgua());
                }
                System.out.println("Nombre del dueño: " + animal.getNombreDuenio());
                System.out.println("DNI del dueño: " + animal.getDniDuenio());
                System.out.println("Direccion del dueño: " + animal.getDireccionDuenio());
                System.out.println("Posicion en la lista: " + i);
                System.out.println("////////////////////////////////////////////////////");
                System.out.println(" ");
            }
        }

    }

    public static void calcularTotalAnimales() {
        int contador = 0;
        for (int i = 0; i < animales.size(); i++) {
            contador++;
        }
        if (contador == 1) {
            System.out.println("En la guarderia hay: " + contador + " animal por el momento");
        } else if (contador > 1) {
            System.out.println("En la guarderia hay: " + contador + " animales por el momento");
        } else {
            System.out.println("No hay animales en la lista todavia");
        }
    }

    public static void retirarAnimal(Scanner scanner) {

        int posicion;

        if (animales.isEmpty()) {
            System.out.println("Aun no se encuentran animales registrados");
        }
        else {
            System.out.println("Ingrese la posicion del animal que desea retirar: ");
            posicion = scanner.nextInt();
            for (int i = 0; i < animales.size(); i++) {
                Animal animal = animales.get(i);
                if (posicion == i) {
                    animales.remove(i);
                    System.out.println("Usted ha retirado a: " + animal.getNombre() + ". Gracias, vuelva prontos");
                } else if (posicion > i) {
                    System.out.println("Usted ha retirado a todos los animales. Gracias, vuelva prontos");
                    animales.clear();
                    System.out.println("Lista vacia:" + animales);
                }

            }
        }
    }

    public static void saludoGeneral(){

        if (animales.size() == 0){
            System.out.println("No hay animales en la lista, primero ingrese un animal");
            System.out.println(" ");
        }
        else {
            for (Animal animal : animales) {
                animal.saludar();
            }
        }
    }

}





