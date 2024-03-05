import java.util.Scanner;

public class EjercicioCon1 {
     public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         boolean salir = false;
     do {
         System.out.println("1. Forma de saber si un numero es negativo o positivo");

         System.out.println("Ingrese el numero ");
         Scanner src= new Scanner(System.in);
         double Num1 = src.nextDouble();
         if (Num1>=0){
             System.out.println("Su numero es positivo");
         }else {
             System.out.println("Su numero es negativo");
         }
         System.out.println("¿Desea salir del progama?");
        int opcion = scanner.nextInt();
         if (opcion == 99){
            salir=true;
             System.out.println("Saliendo del progama");
         }
        }while (!salir);
            scanner.close();
     }

}

