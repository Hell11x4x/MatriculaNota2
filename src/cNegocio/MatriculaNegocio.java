package cNegocio;

import Entidad.Matricula;
import cDatos.MatriculaDAO;
import java.util.List;

public class MatriculaNegocio {
    private MatriculaDAO matriculaDAO;

    public MatriculaNegocio() {
        matriculaDAO = new MatriculaDAO();
    }

    public void registrarMatricula(Matricula matricula) {
        matriculaDAO.registrarMatricula(matricula);
    }

    public List<Matricula> obtenerMatriculas() {
        return matriculaDAO.obtenerMatriculas();
    }
}
