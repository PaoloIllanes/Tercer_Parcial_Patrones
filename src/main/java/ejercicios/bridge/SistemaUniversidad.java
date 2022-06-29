package ejercicios.bridge;

import java.util.Arrays;

public class SistemaUniversidad implements ISistemaInscripcion{
    private String nombre;
    private int capacidad;
    private String[] estudiantes;
    private String requisitos;

    public SistemaUniversidad(String nombre ,int capacidad ,String[] estudiantes ,String requisitos){
        this.capacidad=capacidad;
        this.nombre=nombre;
        this.estudiantes=estudiantes;
        this.requisitos=requisitos;
    }

    @Override
    public void showInfo(IntegrationRedSocial redSocial) {
        redSocial.showInfo();
        System.out.println("Nombre sistema: "+ nombre);
        System.out.println("Capacidad sistema: "+ capacidad);
        System.out.println("Estudiantes: "+ Arrays.toString(estudiantes));
        System.out.println("Requisitos: "+ requisitos);
        System.out.println("------------------------------");



    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public String[] getEstudiantes() {
        return estudiantes;
    }

    public void setEstudiantes(String[] estudiantes) {
        this.estudiantes = estudiantes;
    }

    public String getRequisitos() {
        return requisitos;
    }

    public void setRequisitos(String requisitos) {
        this.requisitos = requisitos;
    }
}
