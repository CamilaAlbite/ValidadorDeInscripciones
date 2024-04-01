package dominio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Materia {
    String nombreMateria;
    List<Materia> correlativas;

    public Materia(String nombreMateria) {
        this.nombreMateria = nombreMateria;
        this.correlativas = new ArrayList<>();
    }

    public void agregarCorrelativa(Materia materia) {
        this.correlativas.add(materia);
    }

    public List<Materia> getCorrelativas() {
        return correlativas;
    }
}
