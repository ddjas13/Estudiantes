public class Cursos {

  //Variables publicas
  String materia;
	String jornada;
	String docente;
	String edificio;
	int idCurso;
	int idDocente;
	int aula;
	int capacidadAula;

  // constructor
  public Cursos(String materia, String jornada, String docente, String edificio, int idCurso, int aula, int capacidadAula){
    this.materia = materia;
    this.jornada = jornada;
    this.docente = docente;
    this.edificio = edificio;
    this.idCurso = idCurso;
    this.idDocente = idDocente;
    this.aula = aula;
    this.capacidadAula = capacidadAula;
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

  public void setIdCurso(int idCurso){
    this.idCurso = idCurso;
  }

  public int getIdCurso(){
    return idCurso;
  }

  public void setIdDocente(int idDocente){
    this.idDocente = idDocente;
  }

  public int getIdDocente(){
    return idDocente;
  }

  public void setAula(int aula){
    this.aula = aula;
  }

  public int getAula(){
    return aula;
  }

  public void setCapacidadAula(int capacidadAula){
    this.capacidadAula = capacidadAula;
  }

  public int getCapacidadAula(){
    return capacidadAula;
  }

}
