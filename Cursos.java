public class Cursos{

  private String materia;
	private String jornada;
	private String docente;
	private String edificio;

    public Cursos(){
        materia = " ";
        jornada = " ";
        docente = " ";
        edificio = " ";
    }

    // constructor
    public Cursos(String materia, String jornada, String docente, String edificio){
        materia = materia;
        jornada = jornada;
        docente = docente;
        edificio = edificio;
    }

    //Metodos Getter & setters

    public void setMateria(String materia){
        this.materia = materia;
    }

    public String getMateria(){
        return this.materia;
    }

    public void setJornada(String jornada){
        this.jornada = jornada;
    }

    public String getJornada(){
        return this.jornada;
    }

    public void setDocente(String docente){
        this.docente = docente;
    }

    public String getDocente(){
        return this.docente;
    }

    public void setEdificio(String edificio){
        this.edificio = edificio;
    }

    public String getEdificio(){
        return this.edificio;
    }
}
