/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Santo Tomas
 */
public class Cuidador {
    private int id;
    private String nombre; // min 3 max 15, requerido 
    private String run;
    private int edad;

    public Cuidador() {
    }

    public Cuidador(int id, String nombre, String run, int edad) {
        this.id = id;
        //this.nombre = nombre;
        setNombre(nombre);
        this.run = run;
        this.edad = edad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {  
        // || es un or
        // && es un and
     
        if (nombre == null || nombre.trim().isEmpty()) {
            System.out.println("Error, el nombre es requerido");
        }
        
        if (nombre.length() >= 3 && nombre.length() <= 15) {
            this.nombre = nombre;
        } else {
            System.out.println("Error, Nombre no es valido");
        }
        
        
    }

    public String getRun() {
        return run;
    }

    public void setRun(String run) {
        this.run = run;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Cuidador{" + "id=" + id + ", nombre=" + nombre + ", run=" + run + ", edad=" + edad + '}';
    }
    
    
}
