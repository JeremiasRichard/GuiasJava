package ModelosEjercicioUno;

public class Materia
{
    private  String nombreMateria;
    private  int idMateria;

    public Materia(String nombreMateria, int idMateria) {
        this.nombreMateria = nombreMateria;
        this.idMateria = idMateria;
    }

    public String mostrarInformacionMateria()
    {
        return "\nMateria: "+this.nombreMateria+"\nId:"+this.idMateria;
    }

    public void setnombreMateria(String nombreMateria)
    {
        this.nombreMateria=nombreMateria;
    }

    public String getNombreMateria()
    {
        return this.nombreMateria;
    }

    public void setIdMateria(int idMateria)
    {
        this.idMateria=idMateria;
    }

    public int getIdMateria()
    {
        return this.idMateria;
    }


}
