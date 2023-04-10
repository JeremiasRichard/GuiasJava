package Modelos;

public class Persona {
    private String nombreYapellido;
    private String numeroTelefono;
    private String email;

    public Persona(String nombreYapellido, String numeroTelefono, String email) {
        this.nombreYapellido = nombreYapellido;
        this.numeroTelefono = numeroTelefono;
        this.email = email;
    }
    public String MostrarPersona() {

      return "Nombre y apellido: "+this.nombreYapellido+" Telefono: " + this.numeroTelefono+" E-mail: " + this.email;
    }
    public String getNombre() {
        return this.nombreYapellido;
    }
    public void setNombreYapellido(String nYa)
    {
       this.nombreYapellido=nYa;
    }
    public String getEmail()
    {
        return this.email;
    }
    public  void  setEmail(String email)
    {
        this.email=email;
    }
    public void setNumeroTelefono(String telefono)
    {
       this.numeroTelefono=telefono;
    }
    public String getNumeroTelefono()
    {
        return this.numeroTelefono;
    }

}
