/* CLASE EJEMPLO Turletti Lucas:
Se desea modelar un sistema de administración de una escuela de música. La escuela ofrece cursos de
diferentes instrumentos musicales y de solfeo o historia de la música. Cada clase está a cargo de un 
profesor. A su vez, cada profesor puede dar más de un curso. Los alumnos se inscriben en las clases 
y pueden tomar varias clases, pero cada clase solo puede tener un máximo de 20 alumnos.
Del Curso se conoce el nombre, el dia de la semana que se dicta, la hora de inicio y la hora de fin, 
ademas del cupo maximo de alumnos.
Del Profesor se conoce su nombre y su apellido. 
Del Alumno se conoce el nombre y el apellido.

Se pide:
Generar el código de las entidades usando JPA, incluyendo:
    Atributos y relaciones
    Uso de herencia
    Getters y Setters
    Constructores
    Anotaciones
    Hacer el crud de cada una de las entidades.
    Escribir algunas consultas a la bdd con @NativeQuery - @NamedQuery y @Query

Analisis:
    Necesitamos 3 entidades principales: Curso, Profesor y Alumno.
    RELACIONES
    Curso y Profesor tienen una relación 1:N porque un profesor puede dar varios cursos 
pero un curso solo tiene un profesor.
    @OneToMany de Profesor a Curso
    Curso y Alumno tienen una relación N:M porque un alumno puede tomar varios cursos y un 
curso tiene varios alumnos.
    @ManyToMany de Curso a Alumno

ENTIDADES:
    Curso(id, nombre, dia, horaInicio, horaFin, cupo)
    Profesor(id, nombre, apellido)
    Alumno(id, nombre, apellido)
    Mapear las entidades con JPA (anotaciones como
    @Entity, @Table, @Id, etc.)
    Generar el archivo persistence.xml con los datos para conectar a la BD y realizar las consultas
    Probar las consultas y el funcionamiento de las relaciones.
 */
package guia16_practicajpa;

import servicios.ServiciosGenerales;

public class Guia16_PracticaJPA {

    
    public static void main(String[] args) {
        ServiciosGenerales serviciosGenerales =  new ServiciosGenerales();
        serviciosGenerales.cargarBase();
        serviciosGenerales.consultas();
    }
    
}
