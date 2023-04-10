package Modelos;

public class CuentaBancaria
{
    private double saldo;
    private String nombre;
    private static  double interes = 0.002;
    public CuentaBancaria(String nombre, double saldo)
    {
        this.nombre=nombre;
        this.saldo=saldo;
    }

    public double getSaldo() {
        return this.saldo;
    }
    public String getNombre() {
        return this.nombre;
    }
    public String CalculaInteres() {
        return "Su saldo es: $"+getSaldo()+". Luego del mes de inversion tendra: $"+((getSaldo()*interes)+getSaldo());
    }

    public double setSaldo(double saldo)
    {
        return this.saldo+=saldo;
    }

}
