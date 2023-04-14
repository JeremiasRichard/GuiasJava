import ModelosEjercicioDos.Arquero;
import ModelosEjercicioDos.Guerrero;
import ModelosEjercicioDos.Mago;

public class Main {
    public static void main(String[] args)
    {
        // Ejercicio 1
        /*Profesor profesorUno = new Profesor("Nahuel Garrido","678901",25);
        Alumno alumnoUno = new Alumno("Jeremias Richard","123456",27,"Tecnicatura Programacion");

        Materia materiaUno = new Materia("Matematica",0);
        Materia materiaDos = new Materia("Ingles",1);
        Materia materiaTres = new Materia("Programacion",2);
        Materia materiaCuatro = new Materia("Laboratorio",3);

        ArrayList<Materia> materiasMain = new ArrayList<>();

        materiasMain.add(materiaUno);
        materiasMain.add(materiaDos);
        materiasMain.add(materiaTres);
        materiasMain.add(materiaCuatro);

        alumnoUno.setMaterias(materiasMain);
        profesorUno.setMateria(materiaUno);
        System.out.println(alumnoUno.estudiar(2).toString());
        System.out.println(profesorUno.eseniar());*/

        // Ejercicio 2

        Arquero arquero = new Arquero(100,20,20,25);
        Guerrero guerrero = new Guerrero(100,20,40,12.5);
        Mago mago = new Mago(100,20,30,18.5);



    }
}