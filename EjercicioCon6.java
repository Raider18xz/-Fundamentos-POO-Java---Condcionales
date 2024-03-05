import java.util.Scanner;

public class EjercicioCon6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean salir = false;
        do {
            System.out.println("6.Para sumar dos número ambos tienen que ser positivos, de lo contrario se multiplicara");
            System.out.println("Ingrese el Primer número ");
            Scanner src= new Scanner(System.in);
            double Num1 = src.nextDouble();
            System.out.println("Ingrese el segundo número ");
            double Num2 = src.nextDouble();

            if (Num1 <0 || Num2 <0){
                double resul = Num1*Num2;
                System.out.println("El resultado de la multiplicación es " + resul);
            }else {
                double resul = Num1+Num2;
                System.out.println("El resultado de la suma es " + resul );
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
