package emc.ejercicio1;

public class Curso
{
    private String nombre;
    private Docente docente;
    private Estudiante estudiante;
    private Matricula matricula;
    
    public Curso(String nombre  )
    {
       this.nombre=nombre;
       
      
    }
    public void setNombre(String nombre)
    {
      this.nombre=nombre;
    }
    public String getMostrarNombre()
    {
      return this.nombre;
    }
    public void setEstudiante( Estudiante estudiante)
    {
      this.estudiante=estudiante;
    }
    public Estudiante getMostrarEstudiante()
    {
      return this.estudiante;
    }
    public void setMatricula( Matricula matricula)
    {
      this.matricula=matricula;
    }
    public Matricula getMostrarmatricula()
    {
      return this.matricula;
    }
    public void setDocente( Docente docente)
    {
      this.docente=docente;
    }
    public Docente getDocente()
    {
      return this.docente;
    }
   
   
   

}
