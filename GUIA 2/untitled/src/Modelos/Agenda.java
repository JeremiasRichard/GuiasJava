package Modelos;

import java.util.ArrayList;

public class Agenda
{
    private ArrayList<Persona> Contactos = new ArrayList<>();


    public void setContactos(ArrayList<Persona> contactos)
    {
        this.Contactos = contactos;
    }
    public void cargarContacto(String nombreYApellido, String telefono, String email)
    {
        Persona personaNueva = new Persona(nombreYApellido,telefono,email);
        Contactos.add(personaNueva);
    }

    public ArrayList<Persona>getAgenda()
    {
        return  this.Contactos;
    }

    public void verAgenda()
    {
        for (Persona contacto : Contactos)
        {
               System.out.println(contacto.MostrarPersona());
        }
    }
    public  void BorrarContacto(String nombreYApellido)
    {
        for(Persona contacto : Contactos)
        {
            if(contacto.getNombre().equals(nombreYApellido))
            {
                Contactos.remove(contacto);
                break;
            }
        }
    }

    public Persona buscarContacto(String nombreYApellido)
    {
        Persona deseada= null;

        for(Persona persona : Contactos)
        {
            if(persona.getNombre().equals(nombreYApellido)) {
                deseada = persona;

                break;
            }
        }

       return deseada;
    }
}
