import Modelos.*;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        // Ejercicio 1
        /*Modelos.CuentaBancaria  cuentaBancaria1 = new Modelos.CuentaBancaria("Jeremias",100000);
        System.out.println("Su saldo es: "+cuentaBancaria1.getSaldo());
        System.out.println(cuentaBancaria1.CalculaInteres());
        cuentaBancaria1.setSaldo(-5000);
        System.out.println("Su saldo es: "+cuentaBancaria1.getSaldo());*/

        // Ejercicio 2
        /*Vuelo vuelo1 = new Vuelo("Buenos Aires","Madrid",LocalTime.of(8,30), LocalTime.of(21,15));
        System.out.println(vuelo1.VerInfo());
        System.out.println(CalcularDuracion(vuelo1));*/

        // Ejercicio 3
        /*Agenda agenda = new Agenda();
        agenda.cargarContacto("Jeremias Richard", "02233045648", "midesastrepersonal@gmail.com");
        agenda.cargarContacto("Lautaro Richard", "0223156165912", "lautarorichard@gmail.com");
        ModificarContacto("Pedro Lopez", agenda);
        //agenda.verAgenda();*/

        // Ejercicio 4
        Estudiante estudiante1 = new Estudiante("Jeremias Richard",27,"38829033");
        Estudiante estudiante2 = new Estudiante("Jeremias Richard",28,"38829033");

        Materia materia1=new Materia("Matematica","Susana Guccione",6);
        Materia materia2=new Materia("Ingles","Susana Perez",4);
        Materia materia3=new Materia("Programacion","Agustin Guccione",5);
        Materia materia4=new Materia("Laboratorio","Agustin Guccione",5);

        ArrayList<Materia> materias = new ArrayList<Materia>(Arrays.asList(materia1,materia2,materia3,materia4));

        estudiante1.setListadoMaterias(materias);

        Nota nota1= new Nota(materia1,6);
        Nota nota2 = new Nota(materia2,7);
        Nota nota3 = new Nota(materia3,8);
        Nota nota4 = new Nota(materia4,9);

        ArrayList<Nota> notas = new ArrayList<Nota>(Arrays.asList(nota1,nota2,nota3,nota4));

        estudiante1.setNotas(notas);

        System.out.println("El promedio del estudiante solicitado es: "+estudiante1.getPromedio());

        //Ejercicio 5
        Gestion gestion = new Gestion();
        Producto producto1= new Producto(0001,"Mayonesa Natura",50,125,2023);
        Producto producto2= new Producto(0002,"Ketchup Natura",50,130,2022);
        Producto producto3= new Producto(0003,"Mostaza Natura",50,127,2023);

        gestion.agregarProducto(producto1);
        gestion.agregarProducto(producto2);
        gestion.agregarProducto(producto3);
        System.out.println("STOCK: "+producto1.getStock());
        gestion.modificarStock(producto1,10);
        System.out.println("STOCK: "+producto1.getStock());
        Producto producto4= new Producto(0004,"Mayonesa Hellmans",50,135,2024);
        System.out.println(gestion.existeProducto(producto4.getCodigo()));
        verificarVencimiento(producto4);




    }

    // Aux del Ejercicio2
    public static String CalcularDuracion(Vuelo vuelo) {
        if (vuelo == null) {
            return "Error, vuelo invalido!";
        } else {
            Duration duration = Duration.between(vuelo.getHoraSalida(), vuelo.getHoraLlegada());
            long horas = duration.toHours();
            long minutos = duration.toMinutes() % 60;

            return "El viaje dura: " + horas + " horas,  " + minutos + " minutos";
        }

    }
    // Aux del Ejercicio3
    public static void ModificarContacto(String nombreYApellido, Agenda agenda)
    {
        Scanner scan = new Scanner(System.in);
        int option = 0;
        ArrayList<Persona> contactos = null;
        contactos = agenda.getAgenda();

        if (contactos != null)
        {
            for (Persona persona : contactos) {
                if (persona.getNombre().equals(nombreYApellido)) {
                    System.out.println("\n" + persona.MostrarPersona());
                    System.out.println("\n¿Que campo desea modificar?");
                    System.out.println(" 1-Nombre y Apellido \n 2-Nro Telefono \n 3-E-mail\n");
                    option = scan.nextInt();
                    scan.nextLine();

                    switch (option) {
                        case 1:
                            System.out.println("Ingrese el nuevo nombre");
                            persona.setNombreYapellido(scan.nextLine());
                            break;
                        case 2:
                            System.out.println("Ingrese el nuevo telefono");
                            persona.setNumeroTelefono(scan.nextLine());
                            break;
                        case 3:
                            System.out.println("Ingrese el nuevo email");
                            persona.setEmail(scan.nextLine());
                            break;
                        default:
                            System.out.println("Ha ingresado un campo invalido");
                    }

                }

            }
            scan.close();
        }
    }

    // Aux del ejercicio 5:
    public static void verificarVencimiento(Producto deseado)
    {
        if(deseado!=null)
        {
            if(deseado.getAnioVencimiento() <= 2023)
            {
                System.out.println("El producto seleccionado esta proximo a vencer!");
            }
            else
            {
                System.out.println("El producto seleccionado no esta proximo a vencer!");
            }
        }
        else
        {
            System.out.println("Producto inexistente!");
        }

    }
}

