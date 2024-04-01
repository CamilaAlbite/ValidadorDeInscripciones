package dominio;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class InscripcionTest {
    Materia analisis1 = new Materia("Analisis 1");
    Materia analisis2 = new Materia("Analisis 2");
    Materia analisisDeSistemas = new Materia("Analisis De Sistemas");
    Materia disenioDeSistemas = new Materia("Diseño de Sistemas");
    Materia paradigmasDeProgramacion = new Materia("Paradigmas de Programacion");
    Materia matematicaSuperior = new Materia("Matematica Superior");
    Materia administracionDeRecursos = new Materia("Administracion de Recursos");
    List<Materia> materiasAprobadasPorCamila = new ArrayList<>();
    Alumno camila;

    @Test
    public void crearUnaInscripcionQueSeraAprobada() {
        analisis2.agregarCorrelativa(analisis1);
        matematicaSuperior.agregarCorrelativa(analisis2);
        disenioDeSistemas.agregarCorrelativa(analisisDeSistemas);
        disenioDeSistemas.agregarCorrelativa(paradigmasDeProgramacion);
        administracionDeRecursos.agregarCorrelativa(disenioDeSistemas);
        administracionDeRecursos.agregarCorrelativa(matematicaSuperior);

        materiasAprobadasPorCamila.add(analisis1);
        materiasAprobadasPorCamila.add(analisisDeSistemas);
        materiasAprobadasPorCamila.add(paradigmasDeProgramacion);
        materiasAprobadasPorCamila.add(analisis2);
        camila = new Alumno("Camila", materiasAprobadasPorCamila);

        List<Materia> materiasInscripcion = new ArrayList<>();
        materiasInscripcion.add(matematicaSuperior);
        materiasInscripcion.add(disenioDeSistemas);
        Inscripcion inscripcionCamila = new Inscripcion(camila, materiasInscripcion);

        assertEquals(true,inscripcionCamila.aprobada());
    }

    @Test
    public void crearUnaInscripcionQueNoSeraAprobada() {
        analisis2.agregarCorrelativa(analisis1);
        matematicaSuperior.agregarCorrelativa(analisis2);
        disenioDeSistemas.agregarCorrelativa(analisisDeSistemas);
        disenioDeSistemas.agregarCorrelativa(paradigmasDeProgramacion);
        administracionDeRecursos.agregarCorrelativa(disenioDeSistemas);
        administracionDeRecursos.agregarCorrelativa(matematicaSuperior);

        materiasAprobadasPorCamila.add(analisis1);
        materiasAprobadasPorCamila.add(analisisDeSistemas);
        materiasAprobadasPorCamila.add(paradigmasDeProgramacion);
        materiasAprobadasPorCamila.add(analisis2);
        camila = new Alumno("Camila", materiasAprobadasPorCamila);

        List<Materia> materiasInscripcion = new ArrayList<Materia>();
        materiasInscripcion.add(administracionDeRecursos);
        materiasInscripcion.add(disenioDeSistemas);
        Inscripcion inscripcionCamila = new Inscripcion(camila, materiasInscripcion);

        assertEquals(false,inscripcionCamila.aprobada());
    }
}