package ModelosEjercicioDos;

public class Arquero extends  Personaje
{


    public Arquero(int vida, int stamina, int danio, double chanceDeCritico) {
        super(vida, stamina, danio, chanceDeCritico);
    }

    @Override
    public void habilidadEspecial()
    {
        setDanio(+5);
    }
}
