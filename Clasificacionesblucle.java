import java.io.Console;

public class Clasificacionesblucle {
      public static void main(String[] args) {
        Console console = System.console(); // llamamos a la consola 
        int calificaciones = Integer.parseInt(console.readLine("Ingrese cuantas calificaciones va a calcular: ")); // pedimos ingresar cuantas calificaciones va a clasificar
        for(int i = 0; i < calificaciones ; i++){ // usamos el contador de for para indicarle que entre a las condiciones if
            float calificacion = Float.parseFloat(console.readLine("ingrese la calificacion: ")); //pedimos la calificacion para clasificarla en las condiciones
        if (calificacion <= 3 && calificacion >=0 ){
            System.out.println("Suspendido");    
        }else if(calificacion > 3 && calificacion <=5){
             System.out.println("Insuficiente");            //cuando nos entrega la clasificacion entra en su clasificatoria segun su valor e imprime en pantalla su clasificar
        }else if(calificacion > 5 && calificacion <=8){
            System.out.println("Bueno");
        }else if(calificacion >8 && calificacion <=10){
            System.out.println("Excelente");
        }else{
            System.out.println("valor fuera de los rangos");
            }
        }
    }
}                                                             // cuando en el for deja de cumplir la condicion del contador dejamos de entrar a las condiciones cerrar el bucle
 

