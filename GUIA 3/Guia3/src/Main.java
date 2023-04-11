import javax.print.attribute.standard.PresentationDirection;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.*;
import  java.util.Random;

public class Main
{
    public static void main(String[] args)
    {
        // Ejercicio 1
        /*LocalDate fechaNacimiento = LocalDate.of(1995,9,8);
        ejercicio1(fechaNacimiento);

        // Ejercicio 2
         String nuevo = "Mendoza";
        System.out.println(ejercicio2(nuevo));

        // Ejercicio 3
        String nuevo1 = "Neuquen";
        char subcadena = 'e';
        ejercicio3(nuevo1,subcadena);*/

        // Ejercicio 4
        /*String cadenaDeTexto= "manuel tiene un auto rojo";
        ejercicio4(cadenaDeTexto);

        // Ejercicio 5
        ejercicio5();

        // Ejercicio 6
        ejercicio6("Jeremias");

        //Ejercicio 7
        ejercicio7();

        // Ejercicio 8
        ejercicio8();*/

        // Ejercicio 9




    }

    public static void ejercicio1(LocalDate fechaNacimiento)
    {
        LocalDate ahora = LocalDate.now();
        Period edad = Period.between(fechaNacimiento,ahora);
        System.out.println("La persona tiene: "+edad.getYears()+" años "+edad.getMonths()+" meses y "+edad.getDays()+" dias");
    }

    public static String ejercicio2(String cadena)
    {
        StringBuilder cadenaInvertida = new StringBuilder(cadena);
        cadenaInvertida.reverse();
        cadenaInvertida.toString();
        int flag = 0;

        for(int i = 0;i<cadena.length();i++)
        {
            char deCadena=cadena.charAt(i);
            char deInvertida=cadenaInvertida.charAt(i);

            if(deCadena != deInvertida)
            {
                flag=1;
            }

        }
        if(flag==0)
        {
           return "Es capicua";
        }
        else
        {
            return "No es capicua";
        }
    }

    public  static void ejercicio3(String cadena, char subcadena)
    {
        int contador = 0;

        if(cadena == null)
        {
            System.out.println("CADENA VACIA!");
        }
        else
        {
            for(int i = 0;i<cadena.length();i++)
            {
                char deCadena=cadena.charAt(i);
                if(deCadena==subcadena)
                {
                    contador++;
                }

            }
            System.out.println("Cadena: "+cadena);
            System.out.println("El caracter: "+subcadena+" se encontro: "+contador+" veces");
        }
    }

    public static void ejercicio4(String cadenaDeTexto)
    {
        String resultado="";

        if(cadenaDeTexto==null)
        {
            resultado=null;
        }
        else
        {
            for(int i = 0; i<cadenaDeTexto.length();i++)
            {
                char deCadena = cadenaDeTexto.charAt(i);
                if(i==0)
                {
                    deCadena = Character.toUpperCase(deCadena);
                    resultado+=deCadena;
                }
                else
                {
                    resultado+=deCadena;
                }
                if(deCadena == ' ')
                {
                    resultado+=deCadena;
                    i=i+1;
                    deCadena=cadenaDeTexto.charAt(i);
                    deCadena = Character.toUpperCase(deCadena);
                    resultado+=deCadena;

                }


            }

            System.out.println("Recibido: "+cadenaDeTexto);
            System.out.println("Corregido: "+resultado);

        }


    }


    public static void ejercicio5()
    {
        Random random = new Random();
        int respuesta = random.nextInt(100) + 1;
        int rtaUsuario = 0;
        Scanner scanner = new Scanner(System.in);
        do
        {
            System.out.println("Ingrese un numero:");
            rtaUsuario=scanner.nextInt();
            if(respuesta < rtaUsuario)
            {
                System.out.println("El numero es menor que el que ingresaste");
            }
            else
            {
                System.out.println("El numero es mayor que el que ingresaste");
            }
            if(respuesta == rtaUsuario)
            {
                System.out.println("Felicidades, has acertado!");
            }
        }
        while(respuesta != rtaUsuario);
    }

    public static void ejercicio6(String cadena)
    {

        String respuesta = "";
        for(int i = 0; i<cadena.length();i++)
        {
            char deCadena=cadena.toLowerCase().charAt(i);
            if(deCadena=='a' || deCadena=='e'||deCadena=='i'||deCadena=='o'|| deCadena=='u')
            {
                continue;
            }
            else
            {
                respuesta+=deCadena;
            }
        }

        System.out.println("Recibido: "+cadena);
        System.out.println("Resultad: "+respuesta);
    }

    public static void ejercicio7()
    {
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println("Ingrese una fecha respetando el formato dia/mes/año");
        String fechaUno = scanner.nextLine();
        LocalDate fechaUnoDate = LocalDate.parse(fechaUno,formatter);
        System.out.println("Ingrese otra fecha respetando el mismo formato");
        String fechaDos = scanner.nextLine();
        LocalDate fechaDosDate = LocalDate.parse(fechaDos,formatter);

        long diferenciaEntreFechas = ChronoUnit.DAYS.between(fechaUnoDate,fechaDosDate);

        System.out.println("La diferencia entre ambas fechas es de : "+diferenciaEntreFechas+" dias");

    }

    public static void ejercicio8()
    {

        Scanner scanner = new Scanner(System.in);
        String cadenaIngresada = "";
        System.out.println("Ingrese un texto separando cada letra por un espacio en blanco ");
        cadenaIngresada=scanner.nextLine();
        String resultado ="";
        for(int i = 0; i<cadenaIngresada.length();i++)
        {
            char substring = cadenaIngresada.charAt(i);
            if(substring == ' ')
            {
                resultado+='-';
            }
            else
            {
                resultado+=substring;
            }
        }

        System.out.println("Ingresado: "+cadenaIngresada);
        System.out.println("Resultado: "+resultado);
    }

}

