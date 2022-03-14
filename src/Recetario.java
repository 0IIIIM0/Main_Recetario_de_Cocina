import java.util.ArrayList;

public class Recetario {
    private ArrayList<Receta>recetas;
    private String titulo; //nacho recetas
    private String autor; //nacho

    public Recetario(ArrayList<Receta> recetas, String titulo, String autor) {
        this.recetas = recetas;
        this.titulo = titulo;
        this.autor = autor;
    }

    public ArrayList<Receta> getRecetas() {
        return recetas;
    }

    public void setRecetas(ArrayList<Receta> recetas) {
        this.recetas = recetas;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void mostrarRecetario(){
        System.out.println(titulo);
        System.out.println(autor);
        for(Receta receta: recetas){
            receta.mostrarReceta();
        }
    }
}
