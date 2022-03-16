import java.sql.SQLOutput;

public class Ingrediente {
    private String nombre;
    private boolean salado;
    private double peso; // kg,l



    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isSalado() {
        return salado;
    }

    public void setSalado(boolean salado) {
        this.salado = salado;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public Ingrediente(String nombre, boolean salado, double peso) {
        this.nombre = nombre;
        this.salado = salado;
        this.peso = peso;
       // System.out.println("Ingrediente creado ");

    }
    public Ingrediente (){}

    //public String toString(){
      //  return nombre;        en caso de querer poner to string solo ponemos el .getNombre
    //}
}
