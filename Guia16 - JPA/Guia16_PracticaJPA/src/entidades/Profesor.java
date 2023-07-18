package entidades;

import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@NamedQueries({
@NamedQuery(
        name="Profesor.buscarTodos", //Nombre de la clase donde está la Query.Nombre que le agrego yo para identificarla
        query="SELECT p FROM Profesor p" //Que debe hacer la Query
),
@NamedQuery(
        name="Profesor.buscarPorId",
        query="SELECT p FROM Profesor p WHERE p.id = :id"
)
})
@Entity
@Table(name="profesores")
public class Profesor extends Persona{
    
    @OneToMany(mappedBy="profesor")
    private Set<Curso> cursos;

    public Profesor() {
    }

    public Set<Curso> getCursos() {
        return cursos;
    }

    public void setCursos(Set<Curso> cursos) {
        this.cursos = cursos;
    }
}