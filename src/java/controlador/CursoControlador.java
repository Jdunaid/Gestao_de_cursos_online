
package controlador;

import java.util.List;
import javax.inject.Named;
import javax.enterprise.context.Dependent;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import modelo.dao.CursoDao;
import modelo.entidade.Curso;


/**
 *
 * @author elcon
 */
@ManagedBean
@ViewScoped
public class CursoControlador  {

    /**
     * Creates a new instance of CursoControlador
     */
    private List<Curso> listacurso;
    private Curso curso;

    public CursoControlador() {
        curso = new Curso();
    }

    public List<Curso> getListacurso() {
        CursoDao ad = new CursoDao();
        listacurso = ad.listarcurso();
        return listacurso;
    }

    public void setListacurso(List<Curso> listacurso) {
        this.listacurso = listacurso;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public void limpiarCurso() {
        curso = new Curso();
    }

    public void agregarCurso() {
        CursoDao ad = new CursoDao();
        ad.agregar(curso);
    }

    public void modificarCurso() {
        CursoDao ad = new CursoDao();
        ad.modificar(curso);
        limpiarCurso(); 
    }

    public void eliminarCurso() {
        CursoDao ad = new CursoDao();
        ad.eliminar(curso);
        limpiarCurso();
    }
}

