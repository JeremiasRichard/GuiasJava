package ModelosEjercicioDos;

public class Guerrero extends Personaje
{


    public Guerrero(int vida, int stamina, int danio, double chanceDeCritico) {
        super(vida, stamina, danio, chanceDeCritico);
    }

    @Override
    public void habilidadEspecial()
    {
        setvida(+5);
    }


}
