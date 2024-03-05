import java.util.Scanner;

public class EjercicioCon4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean salir = false;
        do {
            System.out.println("4. Para sumar dos números el primero tiene que ser mayor que el segundo o de lo contrario se restara");

            System.out.println("Ingrese el Primer número ");
            Scanner src= new Scanner(System.in);
            double Num1 = src.nextDouble();
            System.out.println("Ingrese el segundo número ");
            double Num2 = src.nextDouble();
            if (Num2>Num1){
                double resul = Num2-Num1;
                System.out.println("El Resultado de la resta de sus dos numeros es "+ resul );
            }else {
                double resul = Num1+Num2;
                System.out.println("El Resultado de la suma es " + resul );
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
