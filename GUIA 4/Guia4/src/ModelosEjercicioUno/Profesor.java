package ModelosEjercicioUno;

public class Profesor extends Persona
{
    private Materia materia;
    public Profesor(String nombre, String dni, int edad)
    {
        super(nombre, dni, edad);
    }
    public Materia getMateria()
    {
        return materia;
    }
    public void setMateria(Materia materia)
    {
        this.materia = materia;
    }
    public String eseniar()
    {
        return "Enseniando "+this.materia.getNombreMateria();
    }

}
