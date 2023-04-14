package ModelosEjercicioDos;

public class Mago extends  Personaje
{

    public Mago(int vida, int stamina, int danio, double chanceDeCritico) {
        super(vida, stamina, danio, chanceDeCritico);
    }

    @Override
    public void habilidadEspecial()
    {
        setstamina(+5);
    }


}
