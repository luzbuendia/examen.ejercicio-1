package emc.ejercicio1;

public class Docente
{
    private String nombre;
    private String apellido;
    private Curso[]curso;
    private int contador;
      
    public Docente(String nombre,String apellido )
    {
       this.nombre=nombre;
       
       this.curso=new Curso[3];
       this.contador=0;
    }
    public void setNombre(String nombre)
    {
      this.nombre=nombre;
    }
    public String getMostrarNombre()
    {
      return this.nombre;

    }
    public void setApellido(String apellido)
    {
      this.apellido=apellido;
    }
    public String getMostrarApellido()
    {
      return this.apellido;

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
     
}
