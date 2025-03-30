package org.uniquindio.edu.co.poo.app;

import org.uniquindio.edu.co.poo.model.Consultorio;
import org.uniquindio.edu.co.poo.model.Especialidad;
import org.uniquindio.edu.co.poo.model.Odontologo;
import org.uniquindio.edu.co.poo.model.Paciente;

import javax.swing.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Paciente> listaPacientes = new ArrayList<>();
        List<Odontologo> listaOdontologos = new ArrayList<>();


        listaPacientes.add(new Paciente(1, "Carlos Pérez", 45, "3124567890", LocalDate.of(2024, 5, 12), 6));
        listaPacientes.add(new Paciente(2, "Ana Gómez", 30, "3109876543", LocalDate.of(2024, 3, 8), 4));
        listaPacientes.add(new Paciente(3, "Mariana Ramírez", 40, "312334455", LocalDate.of(2025, 2, 16), 8));


        boolean agregarPaciente;
        do {
            int numeroHistoria = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de historia clínica del paciente:"));
            String nombre = JOptionPane.showInputDialog("Ingrese el nombre del paciente:");
            double edad = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la edad del paciente:"));
            String telefono = JOptionPane.showInputDialog("Ingrese el teléfono del paciente:");
            LocalDate fechaConsulta = LocalDate.now();
            int tratamientos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de tratamientos realizados:"));

            listaPacientes.add(new Paciente(numeroHistoria, nombre, (int)edad, telefono, fechaConsulta, tratamientos));

            agregarPaciente = JOptionPane.showConfirmDialog(null, "¿Desea agregar otro paciente?", "SI", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION;
        } while (agregarPaciente);

        Consultorio consultorio = new Consultorio("Odontología La Aurora", listaPacientes, "Calle 123 # 45-67");

        JOptionPane.showMessageDialog(null, "Consultorio: " + consultorio.getNombre() + "\nDirección: " + consultorio.getDireccion());


        StringBuilder pacientesInfo = new StringBuilder("Pacientes registrados:\n");
        for (Paciente pacienteAux : listaPacientes) {
            pacientesInfo.append(" ").append(pacienteAux.nombre()).append("  N° Historia Clínica: ").append(pacienteAux.numeroHistoC()).append(" Teléfono: ").append(pacienteAux.telefono()).append("  Edad: ").append(pacienteAux.edad()).append("  Última fecha: ").append(pacienteAux.fechaUltimaConsulta()).append("  # Tratamientos: ").append(pacienteAux.cantTratamientosRealzdos()).append("\n");
        }
        JOptionPane.showMessageDialog(null, pacientesInfo.toString());


        boolean agregarOdontologo;
        do {
            String nombre = JOptionPane.showInputDialog("Ingrese el nombre del odontólogo:");
            String id = JOptionPane.showInputDialog("Ingrese el ID del odontólogo:");
            String telefono = JOptionPane.showInputDialog("Ingrese el teléfono del odontólogo:");
            String[] especialidades = {"ORTODONCIA", "ENDODONCIA", "PERIODONCIA", "CIRUGÍA ORAL"};
            Especialidad especialidad = Especialidad.valueOf((String) JOptionPane.showInputDialog(null, "Seleccione la especialidad:", "Especialidad", JOptionPane.QUESTION_MESSAGE, null, especialidades, especialidades[0]));

            listaOdontologos.add(new Odontologo(nombre, id, telefono, especialidad));

            agregarOdontologo = JOptionPane.showConfirmDialog(null, "¿Desea agregar otro odontólogo?", "Confirmación", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION;
        } while (agregarOdontologo);


        StringBuilder odontologosInfo = new StringBuilder("Odontólogos disponibles:\n");
        for (Odontologo odontologo : listaOdontologos) {
            odontologosInfo.append(" ").append(odontologo.getNombre()).append(" ID: ").append(odontologo.getId()).append("  Nombre: ")
                    .append(odontologo.getNombre()).append(" Especialidad: ")
                    .append(odontologo.getEspecialidad()).append("\n");
        }
        JOptionPane.showMessageDialog(null, odontologosInfo.toString());

        
        StringBuilder pacientesGratis = new StringBuilder("Pacientes con más de 5 tratamientos:\n");
        boolean hayPacientesGratis = false;

        for (Paciente pacienteAux : listaPacientes) {
            if (pacienteAux.cantTratamientosRealzdos() > 5) {
                pacientesGratis.append(" ").append(pacienteAux.nombre()).append("\n");
                hayPacientesGratis = true;
            }
        }

        if (hayPacientesGratis) {
            JOptionPane.showMessageDialog(null, pacientesGratis.toString());
        } else {
            JOptionPane.showMessageDialog(null, "No hay pacientes para una revisión gratuita.");
        }
    }
}
