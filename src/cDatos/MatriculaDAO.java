package cDatos;

import Entidad.Matricula;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MatriculaDAO {

    private static final String ARCHIVO_MATRICULAS = "matriculas.txt";

    public void registrarMatricula(Matricula matricula) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(ARCHIVO_MATRICULAS, true))) {
            writer.write(matricula.getNombre() + "," + matricula.getDni() + "," + matricula.getApoderado() + "," + matricula.getDniApoderado() + "," + matricula.getEdad() + "," + matricula.getGrado());
            writer.newLine();
        } catch (IOException e) {
            System.err.println("Error al registrar matrícula: " + e.getMessage());
        }
    }

    public List<Matricula> obtenerMatriculas() {
        List<Matricula> matriculas = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(ARCHIVO_MATRICULAS))) {
            String line;
            while ((line = reader.readLine()) != null) {
                Matricula matricula = parseMatricula(line);
                matriculas.add(matricula);
            }
        } catch (IOException e) {
            System.err.println("Error al obtener matrículas: " + e.getMessage());
        }
        return matriculas;
    }

    public Matricula parseMatricula(String line) {
        // Implementar la lógica para parsear la línea y crear una instancia de Matricula
        String[] campos = line.split(",");
        Matricula matricula = new Matricula();
        if (campos.length >= 6) {
            matricula.setNombre(campos[0]);
            matricula.setDni(campos[1]);
            matricula.setApoderado(campos[2]);
            matricula.setDniApoderado(campos[3]);
            matricula.setEdad(Integer.parseInt(campos[4]));
            matricula.setGrado(campos[5]);
        } else {
            // Manejar el caso en que la línea no contiene comas
            System.err.println("Error al parsear la línea: " + line);
        }
        return matricula;
    }

    public Matricula obtenerMatriculaPorDni(String dni) {
        List<Matricula> matriculas = obtenerMatriculas();
        for (Matricula matricula : matriculas) {
            if (matricula.getDni().equals(dni)) {
                return matricula;
            }
        }
        return null;
    }

}
