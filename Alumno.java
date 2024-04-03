
public class Alumno {

    private String nombre;
    private String legajo;
    private List<Materia> materiasAprobadas;



    public void agregarMateriaAprobada(String materia){
        materiasAprobadas.add(materia);
    }

    public boolean aprobe(Materia materia){
        return materiasAprobadas.contains(materia);
    }

    public boolean cumpleConCorrelativas(List <Materia> correlativas){
        return correlativas.allMatch(unaMateria -> this.aprobe(unaMateria));
    }



}