package org.uniquindio.edu.co.poo.model;

import java.time.LocalDate;

public record Paciente(int numeroHistoC,
        String nombre,
        int edad,
        String telefono,
        LocalDate fechaUltimaConsulta,
        int cantTratamientosRealzdos) {
}
