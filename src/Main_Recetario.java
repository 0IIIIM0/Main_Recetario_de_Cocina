import java.util.ArrayList;
import java.util.Arrays;

public class Main_Recetario {
    public static void main(String[] args) {
    //crear algunos ingredientes
        Ingrediente objetojamon =new Ingrediente("jamon",true,500);
        Ingrediente objetohuevo = new Ingrediente("huevo",true,800);
        Ingrediente objetoaceite= new Ingrediente("aceite",false,20);
        Ingrediente objetosal = new Ingrediente("sal", true,40);
        Ingrediente objetotortilla = new Ingrediente("tortilla",false,400);
        Ingrediente objetojitomate= new Ingrediente("jitomate",false,400);
        Ingrediente objetokatsup =new Ingrediente("katsup",true,60);
        Ingrediente objetolechuga =new Ingrediente("lechuga",false,300);
        //guardar los ingredientes en un arraylist
        //ArraysList<Ingrediente> ingredientesDispo = new ArrayList<>(Arrays.asList(sal,jitomate);

        ArrayList<Ingrediente>ingredientesDisponible = new ArrayList<>();
        ingredientesDisponible.add(objetojamon);
        ingredientesDisponible.add(objetohuevo);
        ingredientesDisponible.add(objetoaceite);
        ingredientesDisponible.add(objetosal);
        ingredientesDisponible.add(objetotortilla);
        ingredientesDisponible.add(objetojitomate);
        ingredientesDisponible.add(objetokatsup);
        ingredientesDisponible.add(objetolechuga);
        //crear algunas recetas

        Receta huevosJamon = new Receta(
                "jamon con huevo",
                15.50,
                new ArrayList<>(Arrays.asList(objetojamon,objetolechuga,objetotortilla,objetoaceite,objetohuevo,objetojitomate,objetokatsup,objetosal)),
                new  ArrayList<>(Arrays.asList("prender la estufa","poner un recipiente","poner aceite","quebrar el huebo en el sarten","poner sal"))
        );
        //crear un recetario y guardar las recetas en el recetario
        //¿como hacer una nueva receta ?
        //abrir un menu
        //desplegar los ingredientes disponibles y ponerles un numero
        //hacer un arraylist de ingredientes
        //los traigo con un get
        //los traigo con un get (indice -1)
        //para ingresar varios ingredientes a la vez uso un do while con una bandera que es cero









    }
}
