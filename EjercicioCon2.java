import java.util.Scanner;

public class EjercicioCon2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean salir = false;
        do {
            System.out.println("1. Forma de saber que numero es mayor que el otro");

            System.out.println("Ingrese el numero ");
            Scanner src= new Scanner(System.in);
            double Num1 = src.nextDouble();
            System.out.println("Ingrese el segundo numero ");
            double Num2 = src.nextDouble();

            if (Num2>Num1){
                System.out.println("El numero mayor es  "+ Num2 + " y el menor es "+ Num1);
            }else {
            System.out.println("El numero mayor es "+Num1 + " y el menor es "+Num2);
            }


            System.out.println("¿Desea salir del progama pulse 99 si escoja cualquier otro numero ?");
            int opcion = scanner.nextInt();
            if (opcion == 99){
                salir=true;
                System.out.println("Saliendo del progama");
            }
        }while (!salir);
        scanner.close();

    }
}
