package org.uniquindio.edu.co.poo.model;

import java.util.List;

public class Consultorio {
    private String nombre;
    private List<Paciente> listaPacientes;
    private String direccion;

    public Consultorio(String nombre, List<Paciente> listaPacientes, String direccion) {
        this.nombre = nombre;
        this.listaPacientes = listaPacientes;
        this.direccion = direccion;
    }

    public void agregarPaciente(Paciente paciente) {
        listaPacientes.add(paciente);
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Paciente> getListaPacientes() {
        return listaPacientes;
    }

    public void setListaPacientes(List<Paciente> listaPacientes) {
        this.listaPacientes = listaPacientes;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}
