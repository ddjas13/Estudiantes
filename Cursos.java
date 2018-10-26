public class Cursos {

  //Variables publicas
  String materia;
	String jornada;
	String docente;
	String edificio;

  // constructor
  public Cursos(String materia, String jornada, String docente, String edificio){
    this.materia = materia;
    this.jornada = jornada;
    this.docente = docente;
    this.edificio = edificio;
  }

  //Metodos Getter & setters

  public void setMateria(String materia){
    this.materia = materia;
  }

  public String getMateria(){
    return materia;
  }

  public void setJornada(String jornada){
    this.jornada = jornada;
  }

  public String getJornada(){
    return jornada;
  }

  public void setDocente(String docente){
    this.docente = docente;
  }

  public String getDocente(){
    return docente;
  }

  public void setEdificio(String edificio){
    this.edificio = edificio;
  }

  public String getEdificio(){
    return edificio;
  }
}
