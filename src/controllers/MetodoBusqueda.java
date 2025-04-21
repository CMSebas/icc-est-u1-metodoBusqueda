package controllers;

import models.Persona;
import views.ShowConsole;

public class MetodoBusqueda {
    private Persona[] people;
    private ShowConsole console;
    private int edadBusca;


    public MetodoBusqueda (Persona[] personas, int edadBusca){
        this.console = new ShowConsole();
        this.people = personas;
        this.edadBusca = edadBusca;
    }

    public int encontrarPorEdad (){
        int bajo=0;
        int alto=people.length-1;



        while(bajo<=alto){
            int central=bajo+(alto-bajo)/2;
            int central1=(bajo + alto)/2;

            for(int i=bajo; i<=alto; i++){
                System.out.print(people[i].getEdad());
                if(i<alto){
                    System.out.print(" | ");
                }

            }
            System.out.println();

            System.out.print("bajo=" + bajo);
            System.out.print("      alto=" + alto);
            System.out.print("      centro=" + central);
            System.out.print("      valorCentro=" + central1);


            if(people[central].getEdad()==edadBusca){
                System.out.println("              --> ENCONTRADO ");
                return central;// aqui el return si se cumple la condicion termina el while ya no sigue a lo demas abajo
            }
            if(people[central].getEdad()<edadBusca){
                System.out.println("              --> DERECHA ");
                bajo=central+1;
            }else{
                System.out.println("              --> IZQUIERDA ");
                alto=central-1;
            }

        }
        return -1;

    }

    public void showPersonByCode(){

        int indexPerson=encontrarPorEdad();
        String nombre = people[indexPerson].getName();
        if(indexPerson==-1){
            console.showMessage("No hay la persona en este codigo");
        }else{
            console.showMessage("La persona con la edad " + edadBusca + " es " + nombre);
        }
    }





}
