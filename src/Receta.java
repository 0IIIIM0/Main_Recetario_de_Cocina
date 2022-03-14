
import java.util.ArrayList;

public class Receta {
    private double tiempoPreparacion;
    private ArrayList<Ingrediente>ingredientes;
    private ArrayList<String>pasos;
    private String nombre;

    public Receta(double tiempoPreparacion, ArrayList<Ingrediente> ingredientes, ArrayList<String> pasos, String nombre) {
        this.tiempoPreparacion = tiempoPreparacion;
        this.ingredientes = ingredientes;
        this.pasos = pasos;
        this.nombre = nombre;
    }

    public Receta (){}

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getTiempoPreparacion() {
        return tiempoPreparacion;
    }

    public void setTiempoPreparacion(double tiempoPreparacion) {
        this.tiempoPreparacion = tiempoPreparacion;
    }

    public ArrayList<Ingrediente> getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(ArrayList<Ingrediente> ingredientes) {
        this.ingredientes = ingredientes;
    }

    public ArrayList<String> getPasos() {
        return pasos;
    }

    public void setPasos(ArrayList<String> pasos) {
        this.pasos = pasos;
    }

    public void mostrarIngredientes(){
        for (Ingrediente ingrediente : ingredientes){
            System.out.println(ingrediente);
        }
        //como sacar el tamaño de un arraylist
       // for (int i =0; i< ingredientes.size();i++){
           // System.out.println(i+" - "+ingredientes.get(i));
       // }


    }
    public void mostrarPasos(){
        for (int i=0; i< pasos.size();i++){
            System.out.println(i+1+"."+pasos.get(i));
        }
    }

    public void mostrarReceta(){
        System.out.println(nombre);
        System.out.println(tiempoPreparacion);
        mostrarIngredientes();
        mostrarPasos();

    }




}
