package cDatos;

import Entidad.Nota;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class NotaDAO {

    private static final String ARCHIVO_NOTAS = "notas.txt";

    public void registrarNota(Nota nota) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(ARCHIVO_NOTAS, true))) {
            writer.write(nota.getDniAlumno() + "," + nota.getCurso() + "," + nota.getNota1() + "," + nota.getNota2() + "," + nota.getNota3() + "," + nota.getPromedioFinal());
            writer.newLine();
        } catch (IOException e) {
            System.err.println("Error al registrar nota: " + e.getMessage());
        }
    }

    public List<Nota> obtenerNotas() {
        List<Nota> notas = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(ARCHIVO_NOTAS))) {
            String line;
            while ((line = reader.readLine()) != null) {
                Nota nota = parseNota(line);
                notas.add(nota);
            }
        } catch (IOException e) {
            System.err.println("Error al obtener notas: " + e.getMessage());
        }
        return notas;
    }

    private Nota parseNota(String line) {
        // Implementar la lógica para parsear la línea y crear una instancia de Nota
        String[] campos = line.split(",");
        Nota nota = new Nota();
        nota.setDniAlumno(campos[0]);
        nota.setCurso(campos[1]);
        nota.setNota1(Double.parseDouble(campos[2]));
        nota.setNota2(Double.parseDouble(campos[3]));
        nota.setNota3(Double.parseDouble(campos[4]));
        nota.setPromedioFinal(Double.parseDouble(campos[5]));
        return nota;
    }

}
