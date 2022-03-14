import java.util.ArrayList;

public class Recetario {
    private ArrayList<Recetario>recetarios;
    private String titulo; //nacho recetas
    private String autor; //nacho

    public ArrayList<Recetario> getRecetarios() {
        return recetarios;
    }

    public void setRecetarios(ArrayList<Recetario> recetarios) {
        this.recetarios = recetarios;
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

    public Recetario(ArrayList<Recetario> recetarios, String titulo, String autor) {
        this.recetarios = recetarios;
        this.titulo = titulo;
        this.autor = autor;
    }
}
