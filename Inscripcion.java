public class Inscripcion {

    private Alumno unAlumno;
    private List<Materia> materias;


    public void inscribirseA(Materia unaMateria){
        materias.add(unaMateria);
    }

    public boolean estaAprobado(Materia unaMateria)
        return unAlumno.aprobe(unaMateria);
    }




}