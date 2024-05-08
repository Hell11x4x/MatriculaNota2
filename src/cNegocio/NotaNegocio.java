
package cNegocio;

import Entidad.Nota;
import cDatos.NotaDAO;
import java.util.List;

public class NotaNegocio {
    private NotaDAO notaDAO;

    public NotaNegocio() {
        notaDAO = new NotaDAO();
    }

    public void registrarNota(Nota nota) {
        notaDAO.registrarNota(nota);
    }

    public List<Nota> obtenerNotas() {
        return notaDAO.obtenerNotas();
    }
}