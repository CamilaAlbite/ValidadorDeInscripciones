package dominio;

import java.util.List;

public class Alumno {
    String nombre;
    List<Materia> materiasAprobadas;

    public Alumno(String nombre, List<Materia> materiasAprobadas) {
        this.nombre = nombre;
        this.materiasAprobadas = materiasAprobadas;
    }

    public boolean correlativasAprobadas(Materia materia){
        if(materia.getCorrelativas().isEmpty()){
            return true;
        } else {
        return materiasAprobadas.containsAll(materia.getCorrelativas());
        }
    }
}
