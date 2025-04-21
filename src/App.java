import controllers.MetodoBurbuja;
import controllers.MetodoBusqueda;
import models.Persona;
import views.ShowConsole;

public class App {
    public static void main(String[] args) {

        ShowConsole showConsole = new ShowConsole();
        MetodoBurbuja metBur=new MetodoBurbuja();

        int tamanio= showConsole.getTam();

        Persona[] personas = new Persona[tamanio];
        System.out.println(tamanio);

        for (int i = 0; i < tamanio; i++) {
            String name = showConsole.getName();
            int edad = showConsole.getEdad();
            personas[i]=new Persona(edad,name);
        }

        int edadBuscada= showConsole.getEdadBuscada();

        metBur.ordenar(personas);

        for (int i = 0; i < tamanio; i++) {
            System.out.println(personas[i]);
        }

        MetodoBusqueda mB= new MetodoBusqueda(personas,edadBuscada);
        mB.encontrarPorEdad();

        mB.showPersonByCode();











    }

    }
