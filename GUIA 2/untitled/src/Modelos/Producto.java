package Modelos;

public class Producto
{
        private int Codigo;
        private String Descripcion;
        private  int Stock;
        private double Precio;
        private int AnioVencimiento;



        public Producto(int codigo,String descripcion, int stock, double precio, int anioVencimiento)
        {
            this.Codigo=codigo;
            this.Descripcion=descripcion;
            this.Stock=stock;
            this.Precio=precio;
            this.AnioVencimiento=anioVencimiento;
        }
        public int getCodigo()
        {
            return this.Codigo;
        }
        public void setCodigo(int codigo)
        {
            this.Codigo=codigo;
        }
        public String getDescripcion(String descripcion)
        {
           return this.Descripcion=descripcion;
        }
        public void setDescripcion(String descripcion){ this.Descripcion = descripcion; }
        public  int getStock(){ return this.Stock; }
        public void setStock(int stock)
        {
            this.Stock+=stock;
        }
        public double getPrecio()
        {
            return this.Precio;
        }
        public void setPrecio(double precio)
        {
            this.Precio=precio;
        }
        public int getAnioVencimiento()
        {
            return this.AnioVencimiento;
        }
        public void setAnioVencimiento(int anioVencimiento)
        {
            this.AnioVencimiento=anioVencimiento;
        }









}
