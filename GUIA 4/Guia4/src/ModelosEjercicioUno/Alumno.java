package ModelosEjercicioUno;

import java.util.ArrayList;

public class Alumno extends Persona
{
    private  String carrera;
    private ArrayList<Materia> materias;
    public Alumno(String nombre, String dni, int edad,String carrera)
    {
        super(nombre, dni, edad);
        this.materias=null;
        this.carrera=carrera;
    }
    public String estudiar(int idMateria)
    {
        Materia desdeada = buscarMateria(idMateria);
        if(desdeada!=null)
        {
            return "Estudiando la materia "+desdeada.getNombreMateria()+" de la carrera "+this.getCarrera();
        }
        else
        {
            return "Materia no encontrada!";
        }
    }
    public String getCarrera() {
        return carrera;
    }
    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }
    public ArrayList<Materia> getMaterias() {
        return materias;
    }
    public void setMaterias(ArrayList<Materia> materias) {
        this.materias = materias;
    }
    public  void setMateria(Materia nuevaMateria)
    {
        if(nuevaMateria!=null)
        {
            if(buscarMateria(nuevaMateria.getIdMateria())==null)
            {
                materias.add(nuevaMateria);
            }
            else
            {
                System.out.println("La materia ya existe!");
            }
        }
    }
    public Materia buscarMateria(int idMateria)
    {
        Materia aux = null;
        for(Materia materia : materias)
        {
            if(idMateria == materia.getIdMateria())
            {
                aux = materia;
            }
        }
        return aux;
    }

}
