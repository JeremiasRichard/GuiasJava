package Modelos;

import java.util.ArrayList;

public class Estudiante
{
    private String NombreYApellido;
    private String Dni;
    private int Edad;
    private ArrayList<Materia> Materias = new ArrayList<Materia>();
    private ArrayList<Nota> Notas = new ArrayList<Nota>();

    private double Promedio;

    public Estudiante(String nombreYApellido, int edad,String dni)
    {
        this.Edad=edad;
        this.NombreYApellido=nombreYApellido;
        this.Materias =null;
        this.Dni=dni;
    }
    public void setNombreYApellido(String nombreYApellido)
    {
        this.NombreYApellido=nombreYApellido;
    }
    public String getNombreYApellid()
    {
        return  this.NombreYApellido;
    }
    public void setDni(String dni)
    {
        this.Dni=dni;
    }
    public String getDni()
    {
        return this.Dni;
    }
    public void setEdad(int edad)
    {
        this.Edad=edad;
    }
    public int getEdad()
    {
        return  this.Edad;
    }
    public ArrayList<Materia> getListadoMaterias()
    {
       return this.Materias;
    }
    public void setListadoMaterias(ArrayList<Materia> materias)
    {
        this.Materias=materias;
    }
    public ArrayList<Nota> getNotas()
    {
       return this.Notas;
    }
    public void setNotas(ArrayList<Nota> notas)
    {
        this.Notas=notas;
    }
    public void cargarMateria(Materia nuevaMateria)
    {
        Materias.add(nuevaMateria);
    }
    public void cargarNota(Nota nuevaNota)
    {
        Notas.add(nuevaNota);
    }
    public double getPromedio()
    {   double suma=0;

       for(Nota notas : Notas)
       {
           suma+=notas.getNoTa();
       }

       return  suma/Notas.size();
    }
}
