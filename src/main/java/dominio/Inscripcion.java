package dominio;


import java.util.List;

public class Inscripcion {
    Alumno alumno;
    List<Materia> materias;
    public Inscripcion(Alumno alumno, List<Materia> materias) {
        this.alumno = alumno;
        this.materias = materias;
    }
    public Boolean aprobada(){
        return this.materias.stream().allMatch(materia -> this.alumno.correlativasAprobadas(materia));
    }
}
