package Modelos;

public class Materia
{
    private String NombreMateria;
    private String Profesor;
    private int CargaHoraria;
    private double NotaFinal;


    public Materia(String nombreMateria, String profesor, int cargaHoraria)
    {
        this.NombreMateria=nombreMateria;
        this.CargaHoraria=cargaHoraria;
        this.Profesor=profesor;
    }

    public String getNombreMateria()
    {
        return "Materia: "+this.NombreMateria;
    }

    public void setNombreMateria(String nombreMateria)
    {
        this.NombreMateria=nombreMateria;
    }

    public void setProfesor(String nombreProfesor)
    {
      this.Profesor=nombreProfesor;
    }

    public String getProfesor()
    {
        return "Profesor: "+this.Profesor;
    }

    public void setCargaHoraria(int cargaHoraria)
    {
        this.CargaHoraria = cargaHoraria;
    }

    public int getCargaHoraria()
    {
        return this.CargaHoraria;
    }

    public void setNotaFinal(double notaFinal)
    {
        this.NotaFinal = notaFinal;
    }

    public double getNotaFinal()
    {
        return this.NotaFinal;
    }

    public String MostrarMateria()
    {
        return "\nMateria: "+this.getNombreMateria()+"\nProfesor: "+this.getProfesor()+"\nNota Final: "+this.getNotaFinal();
    }
}
