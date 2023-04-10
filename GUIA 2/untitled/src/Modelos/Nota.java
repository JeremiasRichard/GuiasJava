package Modelos;

public class Nota
{
    private Materia materia;
    double Nota;


    public Nota(Materia materia, int nota)
    {
        this.materia=materia;
        this.Nota=nota;
    }

    public void setMateria(Materia materia)
    {
        this.materia=materia;
    }

    public Materia getMateria()
    {
        return this.materia;
    }

    public void setNota(int nota)
    {
        this.Nota=nota;
    }

    public double getNoTa()
    {
        return this.Nota;
    }


}
