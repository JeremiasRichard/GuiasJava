package ModelosEjercicioDos;

import java.util.Random;

public abstract class Personaje
{
    private int vida;
    private int stamina;
    private int danio;
    private double chanceDeCritico;
    public Personaje(int vida, int stamina,int danio,double chanceDeCritico) {
        this.vida = vida;
        this.stamina = stamina;
        this.danio=danio;
        this.chanceDeCritico=chanceDeCritico;
    }

    public int getvida() {
        return vida;
    }

    public void setvida(int vida) {
        this.vida += vida;
    }

    public int getstamina() {
        return stamina;
    }

    public void setstamina(int stamina) {
        stamina += stamina;
    }

    public int getDanio() {
        return danio;
    }

    public void setDanio(int danio) {
        this.danio += danio;
    }

    public double getChanceDeCritico() {
        return chanceDeCritico;
    }

    public void setChanceDeCritico(double chanceDeCritico) { this.chanceDeCritico = chanceDeCritico; }

    public int atacar()
    {
        if(getstamina() > 0)
        {
            Random random = new Random();
            double chance = 0;
            chance = random.nextDouble(100 - this.chanceDeCritico + 1 ) + this.chanceDeCritico;
            if(chance <= getChanceDeCritico())
            {
                return this.getDanio() + 5;
            }
            setstamina(-2);


            return this.getDanio();
        }
        return 0;
    }
    public void recibirDanio(int ataqueRecibido)
    {
        if(getvida() > 0)
        {
            setvida(-ataqueRecibido);
        }
        else
        {
            System.out.println("El personaje ha muerto!");
        }
    }
    public abstract void habilidadEspecial();



}
