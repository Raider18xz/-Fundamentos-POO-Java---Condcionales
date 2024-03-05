import java.util.Scanner;

public class EjercicioCon7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean salir = false;
        do {
            System.out.println("7. Para Saber si un año es bisieto o no");

            System.out.println("Ingrese un año ");
            Scanner src= new Scanner(System.in);
            double Year = src.nextDouble();
            if ((Year % 4 == 0 && Year % 100 != 0 ||(Year%400 == 0))){

                System.out.println("El año "+ Year +" es bisiesto " );
            }else {

                System.out.println("El año "+Year+" no es bisiesto ");
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
