import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

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
                15.50,
                new ArrayList<>(Arrays.asList(objetojamon,objetolechuga,objetotortilla,objetoaceite,objetohuevo,objetojitomate,objetokatsup,objetosal)),
                new  ArrayList<>(Arrays.asList("prender la estufa","poner un recipiente","poner aceite","quebrar el huebo en el sarten","poner sal")),"JAMON CON HUEVO"
        );
        //crear un recetario y guardar las recetas en el recetario

        // Arratlist<Receta> recetasActuales = new Arraylist<>(Arrays.asList(huevocon jamon));
        Recetario miRecetario = new Recetario(
                new ArrayList<>(Arrays.asList(huevosJamon)),"Huevo con jamon","Nacho"
        );


        //¿como hacer una nueva receta ?
        //abrir un menu
        //desplegar los ingredientes disponibles y ponerles un numero
        //hacer un arraylist de ingredientes
        //los traigo con un get
        //los traigo con un get (indice -1)
        //para ingresar varios ingredientes a la vez uso un do while con una bandera que es cero

        // mostrar las opciones que el usuario tiene

       /* System.out.println("Bienvenido, elige una opción:");
        System.out.println("1. Agregar un ingrediente nuevo.");
        System.out.println("2. Agregar receta nueva.");
        System.out.println("3. Ver mi recetario");
        System.out.println("4. ingresa 0 para salir");
        //pendiente opcion para salir*/

        Scanner scanner = new Scanner(System.in);

        int respuesta=0;


        do {
            System.out.println("Bienvenido, elige una opción:");
            System.out.println("1. Agregar un ingrediente nuevo.");
            System.out.println("2. Agregar receta nueva.");
            System.out.println("3. Ver mi recetario");
            System.out.println("4. Eliminar un ingrediente");
            System.out.println("5. Elminar una receta");
            System.out.println("0  -Salir");
            respuesta= scanner.nextInt();
            switch (respuesta) {

                case 1:
                    Ingrediente nuevo = new Ingrediente();
                    System.out.println("Ingresa el nombre del ingrediente");
                    nuevo.setNombre(scanner.next());
                    System.out.println("Ingresa la cantidad");
                    nuevo.setPeso(scanner.nextDouble());
                    System.out.println("¿Tu ingrediente es saladap? 1.Sí\t 2. No");

                    if (scanner.nextInt() == 1) {
                        nuevo.setSalado(true);
                    } else {
                        nuevo.setSalado(false);
                    }
                    ingredientesDisponible.add(nuevo);
                    break;

                case 2:

                    Receta nueva = new Receta();
                    System.out.println("ingresa la nueva receta");
                    nueva.setNombre(scanner.next());
                    System.out.println("Ingresa el tiempo de preparacion");
                    nueva.setTiempoPreparacion(scanner.nextDouble());
                    System.out.println("los ingredientes disponibles son: ");

                    for (int i = 0; i < ingredientesDisponible.size(); i++) {
                        System.out.println(i + 1 + ". " + ingredientesDisponible.get(i).getNombre());
                    }

                    ArrayList<Ingrediente> ingredientesReceta = new ArrayList<>();
                    System.out.println("ingrese el numero correspondiente del ingrediente y da enter, " +
                            "si ya no queire agregar mas escribe 0");
                    do {
                        respuesta=scanner.nextInt();
                        if (respuesta!=0){
                            ingredientesReceta.add(ingredientesDisponible.get(respuesta-1));
                        }

                    }while (respuesta!=0);
                    respuesta=15;
                    nueva.setIngredientes(ingredientesReceta);
                    ArrayList<String> pasosReceta = new ArrayList<>();
                    System.out.println("Ingrese los pasos de uno en uno y de enter" +
                            "si ya no quiere agregar mas escribe 0");
                    String res = "";

                    do {
                        res = scanner.next();

                        if (!res.equals("0")) {
                            pasosReceta.add(res);
                        }

                    } while (!res.equals("0"));
                    nueva.setPasos(pasosReceta);
                    miRecetario.getRecetas().add(nueva);
                    break;

                case 3:
                    miRecetario.mostrarRecetario();
                    break;
                case 4:
                    int ingrediente_A_Eliminar=0;
                    System.out.println("ingresa el numero del ingrediente que deseas eliminar: ");
                    for (int i = 0; i < ingredientesDisponible.size(); i++) {
                        System.out.println(i + 1 + ". " + ingredientesDisponible.get(i).getNombre());

                    }
                    ingrediente_A_Eliminar=scanner.nextInt();
                    ingredientesDisponible.remove(ingrediente_A_Eliminar-1);

                    break;

                case 5:
                    int receta_A_Eliminar=0;
                    System.out.println("ingresa el numero del ingrediente que deseas eliminar: ");
                    for (int i = 0; i < miRecetario.getRecetas().size(); i++) {
                        System.out.println(i + 1 + ". " + miRecetario.getRecetas().get(i).getNombre());

                    }
                    receta_A_Eliminar=scanner.nextInt();
                    miRecetario.getRecetas().remove(receta_A_Eliminar-1);

                    break;
            }


        }while (respuesta!=0);
        //remove
        //nombreArraylist.remove(# indice);
    }
}
