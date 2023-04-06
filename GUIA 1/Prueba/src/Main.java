import javax.annotation.processing.SupportedSourceVersion;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {


        /*int[] array = {1, 2, 3, 4, 5};
        int[] array2 = new int[5];
        double[] Temperaturas = new double[30];
        Temperaturas=cargarTemperaturas(Temperaturas);
        ejercicio1(array);
        ejercicio1a(array2);
        ejercicio2(3);
        ejercicio3();
        ejercicio4(4);
        ejercicio6();
        ejercicio7();
        ejercicio8();
        ejercicio9("2029");
        ejercicio10('@');
        ejercicio11(5,7);
        ejercicio12();
        ejercicio13("Jeremias");
        ejercicio14();
        ejercicio15(32.5);
        ejercicio16(5.7);
        ejercicio17(105);
        ejercicio18(3,4);
        ejercicio19(Temperaturas);
        ejercicio20();*/




    }

    public static void ejercicio1(int[] array) {
        double suma = 0;
        if(array == null)
        {
            System.out.println("Array nulo!");
        }
        for (int i = 0; i < array.length; i++) {
            suma += array[i];
        }

        suma = (suma / array.length);

        System.out.println("El promedio es: " + suma);
    }

    public static void ejercicio1a(int[] array)
    {
        Scanner scanner = new Scanner(System.in);
        int i = 0;
        if(array == null)
        {
            System.out.println("Array nulo!");
        }
        while (i< array.length)
        {
            System.out.println("Ingrese un un numero para cargar al arreglo: ");
            array[i]= scanner.nextInt();
            i++;
        }
        scanner.close();
        ejercicio1(array);
    }

    public static  void ejercicio2(int num)
    {
        if(num%2==0)
        {
            System.out.println("El numero " +num +" es par");
        }
        else
        {
            System.out.println("El numero " +num +" es impar");
        }
    }

    public  static  void ejercicio3()
    {
        int contador = 0;
        int numero = 2;

        while(contador < 100) {
            boolean esPrimo = true;
            for(int i = 2; i <= Math.sqrt(numero); i++)
            {
                if(numero % i == 0) {
                    esPrimo = false;
                    break;
                }
            }
            if(esPrimo) {
                System.out.println(numero);
                contador++;
            }
            numero++;
        }
    }

    public  static  void ejercicio4(int n)
    {
        int contador = 0;
        int numero = 2;

        while(contador < n) {
            boolean esPrimo = true;
            for(int i = 2; i <= Math.sqrt(numero); i++)
            {
                if(numero % i == 0) {
                    esPrimo = false;
                    break;
                }
            }
            if(esPrimo) {
                System.out.println(numero);
                contador++;
            }
            numero++;
        }
    }

    public static  void ejercicio6()
    {   char option = 's';
        int numero = 0;
        Scanner scan = new Scanner(System.in);

        while(option == 's')
        {
            System.out.println("Ingrese un numero: ");
            numero = scan.nextInt();
            if(esPrimo(numero)==true)
            {
                System.out.println(numero +" es un numero primo");
            }
            else
            {
                System.out.println(numero +" no es un numero primo");
            }
            System.out.println("Desea seguir cargando numeros:  s/n");
            option = scan.next().charAt(0);

        }
        scan.close();

    }

    public  static  boolean esPrimo(int n)
    {
        if(n <= 1)
        {
            return  false;
        }
        for(int i = 2 ; i<Math.sqrt(n);i++)
        {
            if(n % i == 0)
            {
                return  false;
            }
        }
        return  true;
    }

    public static int ejercicio7()
    {
        int suma=0;

        for(int i = 0; i<10;i++)
        {
            suma+=i;
        }
        System.out.println("La suma es: "+suma);
        return suma;
    }

    public static void ejercicio8()
    {
        char option = 's';
        int numero = 0;
        int contador = 0;
        Scanner scan = new Scanner(System.in);

        while(option == 's')
        {
            System.out.println("Ingrese un numero: ");
            numero = scan.nextInt();
            contador++;
            System.out.println("Desea seguir cargando numeros:  s/n");
            option = scan.next().charAt(0);

        }
        scan.close();
        System.out.println("El valor del contador es: "+contador);
    }

    public static void ejercicio9(String fecha)
    {
        int temp =Integer.parseInt(fecha);
        double aux = (temp / 4.0);
        double aux2 = Math.floor(aux);

        if((aux - aux2) > 0 )
        {
            System.out.println("No es biciesto!");

        }
        else
        {
            System.out.println("Es biciesto!");
        }

    }

    public static void ejercicio10(char x)
    {
        int aux = x;
        System.out.println("El valor de "+ x + " es: "+aux);
    }

    public static void ejercicio11(int a ,int b)
    {
        System.out.println("El resultado de multiplicar " +a+ " x "+b+" es = "+(a*b));

    }

    public static  void ejercicio12()
    {
        char option = 's';
        String figura = "";
        Scanner scan = new Scanner(System.in);
        while(option == 's')
        {
            System.out.println("Ingrese una figura: ");
            figura=scan.next();
            figura=figura.substring(0,1).toUpperCase() + figura.substring(1);
            switch (figura)
            {
                case "Circulo":
                      double radio = 5.0;
                      double area = Math.PI * radio * radio;
                      System.out.println("El area del circulo es: " + area);
                    break;
                case "Cuadrado":
                      double lado = 8.0;
                      area = lado * lado;
                      System.out.println("El area del cuadrado es: " + area);
                    break;
                case "Rectangulo":
                       double  base = 12.0;
                       double altura = 4.0;
                       area = (base * altura);
                       System.out.println("El area del rectangulo es: " + area);
                    break;
                case "Triangulo":
                    base = 10.0;
                    altura = 6.0;
                    area = ((base * altura ) / 2.0);
                    System.out.println("El area del triangulo es: " + area);
                    break;
                default:System.out.println("Ha ingresado una figura invalida");
            }
            System.out.println("Desea probar con otra figura? S/N ");
            option = scan.next().charAt(0);

        }
        scan.close();
    }

    public static void ejercicio13(String name)
    {
        System.out.println("Buenos dias " + name);
    }

    public static void ejercicio14()
    {


        char option = 's';
        int n = 0;
        Scanner scan = new Scanner(System.in);
        while(option == 's')
        {
            System.out.println("Ingrese un numero: ");
            n = scan.nextInt();
            System.out.println("El doble es: "+ (n*2));
            System.out.println("El triple es: "+ (n*3));
            System.out.println("Desea seguir cargando numeros:  s/n");
            option = scan.next().charAt(0);

        }
        scan.close();

    }

    public static void ejercicio15(double gradosC)
    {
        double gradosF = 32 +( 9 * gradosC/5);
        System.out.println("Grados C°:"+gradosC + " Grados F°:" +gradosF);
    }

    public  static void ejercicio16(double radio)
    {
        double areaCircuferencia = (Math.PI * (Math.pow(radio,2)));
        double longitudCircunferencia = (2 * Math.PI * areaCircuferencia);
        System.out.println("Longitud:"+longitudCircunferencia+ " \nArea:"+areaCircuferencia);
    }

    public static void ejercicio17(double velocidad)
    {
        System.out.println("KM/H:"+velocidad+" MP/H:"+(velocidad*0.621371));
    }

    public static  void ejercicio18(double catetoA, double catetoB)
    {
        double hipotenusa=(catetoA * catetoA)+(catetoB*catetoB);
        hipotenusa=Math.sqrt(hipotenusa);
        System.out.println("La hipotenusa es: "+hipotenusa);
    }

    public static double[] cargarTemperaturas(double [] Temperaturas)
    {
        Random random = new Random();

        if(Temperaturas!=null)
        {
            for(int i = 0; i<Temperaturas.length;i++)
            {
                Temperaturas[i]= 10+random.nextDouble()*15;
            }

        }
        return Temperaturas;
    }

    public  static  void ejercicio19(double [] Temperaturas)
    {
        Arrays.sort(Temperaturas);
        double min = Temperaturas[0];
        double max = Temperaturas[29];
        double promedios = (Arrays.stream(Temperaturas).sum() / Temperaturas.length);

        System.out.println("Temperatura min: "+min);
        System.out.println("Temperatura max: "+max);
        System.out.println("Promedio: "+promedios);
    }

    public static  void  ejercicio20aux(double rangoA, double rangoB)
    {   int i = 0;

        double [] ArregloRandom = new double [10];

        Random random = new Random();

        for(i=0 ; i<ArregloRandom.length; i++)
        {
            ArregloRandom[i] = random.nextDouble(rangoB-rangoA + 1) + rangoA;
        }
        System.out.println("RANGO MIN: "+rangoA+" RANGO MAX: "+rangoB);
        for(i = 0; i<ArregloRandom.length;i++)
        {
            System.out.println(ArregloRandom[i]);
        }

    }

   public static void ejercicio20()
    {
        double rangoA=0;
        double rangoB=0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el rango minimo: ");
        rangoA=scanner.nextDouble();
        System.out.print("Ingrese el rango maximo: ");
        rangoB=scanner.nextDouble();
        scanner.close();
        ejercicio20aux(rangoA,rangoB);
    }


}