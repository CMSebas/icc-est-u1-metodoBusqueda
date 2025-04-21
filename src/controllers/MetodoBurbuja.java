package controllers;

import models.Persona;

public class MetodoBurbuja {
    public void ordenar(Persona[] personas) {
        for (int i = 0; i < personas.length; i++) {
            for (int j = 0; j < (personas.length-1); j++) {
                if (personas[j].getEdad() > personas[j+1].getEdad()) {
                    Persona auxiliar = personas[j];
                    personas[j] = personas[j+1];
                    personas[j+1] = auxiliar;
                }
            }
        }

    }

}
