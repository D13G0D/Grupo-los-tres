import java.io.Console;

public class VentaBoletos {
    public static void main(String[] args) {
    Console console = System.console();
    int cantidad = Integer.parseInt(console.readLine("La cantidad de boletos: "));
    
    int billeteNormal = 7; //precio de ticket normal
    double precioFinal = 0; //  variable de precio con descuento
    double total = 0; // variable que representa la compra total 
    while(cantidad != 0) { // la condición se realiza mientras que la cantidad de boletos sea diferente de 0
        int edad = Integer.parseInt(console.readLine("Ingrese su edad: ")); // Solicitud de ingreso de edad al usuario
        
        if (edad < 5 && edad >= 0) { // precio de boleto con 60% desc para personas menores a 5 años
            precioFinal = billeteNormal * 0.4;
        } else if (edad > 60) { //precio de boleto con 55% desc para personas mayores a 60 años
            precioFinal = billeteNormal * 0.45;
        } else {
            precioFinal = billeteNormal; // precio normal
        }
        double scale = Math.pow(10, 3); // truncar en 2 decimales, la variable precio final
        double doubleM1 = Math.round(precioFinal*scale)/scale;
        System.out.println("El valor del boleto es de: "+doubleM1);
        total += precioFinal; // total de la compra, si se compra más de un ticket
        cantidad--; //decremento
    }
        double scale2 = Math.pow(10, 3);
        double doubleM2 = Math.round(total*scale2)/scale2;
        System.out.println("El valor final es de: "+doubleM2);

    }
 }