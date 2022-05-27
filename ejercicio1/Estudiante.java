package emc.ejercicio1;

public class Estudiante 
{
    private String nombre;
    private Curso[]curso;
    private int contador;
    private Docente[]docente;
    

    public Estudiante(String nombre )
    {
       this.nombre=nombre;
       this.curso=new Curso[3];
       this.contador=0;
       this.docente=new Docente[3];
       
       
    }
    public void setNombre(String nombre)
    {
      this.nombre=nombre;
    }
    public String getMostrarNombre()
    {
      return this.nombre;
    }
    public void setCurso(Curso curso)
    {
      this.curso[this.contador]= curso;
      this.contador++;
    }
    public Curso[] getMostrarCurso()
    {
      return this.curso;
    }
    public void setDocente(Docente docente)
    {
      this.docente[this.contador]=docente;
      this.contador++;
    }
    public Docente[] getMostrarDocentes()
    {
      return this.docente;
    }
    
 
 
    
}
