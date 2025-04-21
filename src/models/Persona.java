package models;

public class Persona {

    private int edad;
    private String name;
    
    public Persona(int edad, String name) {
        this.edad = edad;
        this.name = name;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if (edad >=0) {
            this.edad = edad;

        }else {
            System.out.println("El edad no tiene que ser negativo");
            this.edad = 0;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Persona [edad=" + edad + ", name=" + name + "]";
    }
    
    
}
