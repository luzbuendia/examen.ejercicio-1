package emc.ejercicio1;

public class Main 
{

    public static void main (String args[]) 
    {
      
      Matricula matricula = new Matricula(  120);
      System.out.println("Matricula:"   + matricula.getMostrarMatricula());
      matricula.setSemestre(new Semestre( 2022));
      System.out.println("Semestre:"  + matricula.getSemestre().getMostrarSemestre());
    
     Estudiante estudianteCurso=new Estudiante("Robert");
     
     
     

     estudianteCurso.setCurso(new Curso("Algebra"));
     estudianteCurso.setCurso(new Curso("Matematica"));
     
     estudianteCurso.setCurso(new Curso("Algoritmo"));
     

     matricula.setEstudiante(estudianteCurso);
     
     
     for( Estudiante estudiante: matricula.getEstudiante())
     {
       System.out.println("Estudiante:" + estudiante.getMostrarNombre()); 
     
         for(Curso curso: estudiante.getMostrarCurso())
         {
            System.out.println("CURSO:"  + curso.getMostrarNombre());

         }
     }
     
    
    } 
}   


    
     