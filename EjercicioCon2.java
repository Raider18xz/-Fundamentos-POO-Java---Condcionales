import java.util.Scanner;

public class EjercicioCon2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean salir = false;
        do {
            System.out.println("2. Forma de saber que número es mayor que el otro");

            System.out.println("Ingrese el Primer número ");
            Scanner src= new Scanner(System.in);
            double Num1 = src.nextDouble();
            System.out.println("Ingrese el Segundo numero ");
            double Num2 = src.nextDouble();

            if (Num2>Num1){
                System.out.println("El numero mayor es  "+ Num2 + " y el menor es "+ Num1);
            }else {
            System.out.println("El numero mayor es "+Num1 + " y el menor es "+Num2);
            }


            System.out.println("Para salir del progamá pulse 99, si quiere continuar ponga cualquier número");
            int opcion = scanner.nextInt();
            if (opcion == 99){
                salir=true;
                System.out.println("Saliendo del progama");
            }
        }while (!salir);
        scanner.close();

    }
}
