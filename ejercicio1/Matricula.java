package emc.ejercicio1;

public class Matricula 
{
   private int matricula;
   private Estudiante[]estudiante;
   private Curso curso;
   private Docente docente;

   private int contador;
   private Semestre semestre;

   public Matricula(int matricula)
    {
       this.matricula=matricula;

        this.estudiante=new Estudiante[3];
        this.contador=0;
    }
    public void setMatricula(int matricula)
    {
      this.matricula=matricula;
    }
    public int getMostrarMatricula()
    {
      return this.matricula;
    }
    public void setEstudiante(Estudiante estudiante)
    {
        this.estudiante[this.contador]=estudiante;
        this.contador++;
        
    }
    public Estudiante[]getEstudiante()
    {
      return this.estudiante;
    }
    public void setSemestre(Semestre semestre)
    {
      this.semestre=semestre;
    }
    public Semestre getSemestre()
    {
      return this.semestre;
    }
    public void setCurso(Curso curso)
    {
      this.curso=curso;
    }
    public Curso getMostrarCurso()
    {
      return this.curso;
    }
    
    public void setDocente(Docente docente)
    {
      this.docente=docente;
    }
    public Docente getMostrarDocente()
    {
      return this.docente;
    }
    
}
