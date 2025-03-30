package org.uniquindio.edu.co.poo.model;

public class Odontologo {
    private String nombre;
    private String id;
    private String numeroLicencia;

    public Especialidad especialidad;

    public Odontologo(String nombre, String id, String numeroLicencia, Especialidad especialidad) {
        this.nombre = nombre;
        this.id = id;
        this.numeroLicencia = numeroLicencia;
        this.especialidad = especialidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNumeroLicencia() {
        return numeroLicencia;
    }

    public void setNumeroLicencia(String numeroLicencia) {
        this.numeroLicencia = numeroLicencia;
    }

    public Especialidad getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(Especialidad especialidad) {
        this.especialidad = especialidad;
    }
}
