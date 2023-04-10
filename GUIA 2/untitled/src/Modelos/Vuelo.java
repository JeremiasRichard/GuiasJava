package Modelos;
import java.time.Duration;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Vuelo
{
    private String origen;
    private String destino;
    private LocalTime horaSalida;
    private LocalTime horaLlegada;


    public  Vuelo(String origen, String destino,LocalTime horaSalida,LocalTime horaLlegada)
    {
        this.origen=origen;
        this.destino=destino;
        this.horaSalida=horaSalida;
        this.horaLlegada=horaLlegada;

    }
    public String VerInfo()
    {
        return "Origen: "+this.origen+" Destino: "+this.destino+" Hora salida: "+this.horaSalida+" Hora llegada: "+this.horaLlegada;
    }
    public LocalTime getHoraSalida()
    {
        return this.horaSalida;
    }
    public LocalTime getHoraLlegada()
    {
        return this.horaLlegada;
    }


}
