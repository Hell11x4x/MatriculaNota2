
package Entidad;

import javax.swing.JOptionPane;

public class Matricula {
    private int id;
    private String nombre;
    private String dni;
    private String apoderado;
    private String dniApoderado;
    private int edad;
    private String grado;
    
    public Matricula() {}

  
    public Matricula(String nombre, String dni, String apoderado, String dniApoderado, int edad, String grado) {
    this.nombre = nombre;
    this.dni = dni;
    this.apoderado = apoderado;
    this.dniApoderado = dniApoderado;
    this.edad = edad;
    this.grado = grado;
}

    // Getters y setters
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
        this.nombre = nombre;
    }

    public String getDni() {     
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getApoderado() {
        return apoderado;
    }

    public void setApoderado(String apoderado) {
        this.apoderado = apoderado;
    }

    public String getDniApoderado() {
        return dniApoderado;
    }

    public void setDniApoderado(String dniApoderado) {
        this.dniApoderado = dniApoderado;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getGrado() {
        return grado;
    }

    public void setGrado(String grado) {
        this.grado = grado;
    }
}
