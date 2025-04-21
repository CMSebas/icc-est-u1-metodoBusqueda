package views;

import java.util.Scanner;

public class ShowConsole {
    private Scanner scanner = new Scanner(System.in);

    public void showMenu(){
        System.out.println("Metodo Busqueda");
    }

    public int getTam(){
        System.out.println("Ingrese el tamaño del listado de personas:");
        int tam = scanner.nextInt();
        System.out.println("El listado de la persona es de: "+ tam);
        return tam;
    }

    public String getName() {
        System.out.println("Ingrese Persona:");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nombre de la Persona: ");
        return scanner.nextLine();
    }

    public int getEdad() {
        System.out.print("Edad de la Persona: ");
        int edad = scanner.nextInt();
        return edad;
    }

    public int getEdadBuscada() {
        System.out.println("Ingrese La edad a buscar:");
        int edadBuscada = scanner.nextInt();
        return edadBuscada;
    }

    public void showMessage(String message){
        System.out.println(message);
          }
}