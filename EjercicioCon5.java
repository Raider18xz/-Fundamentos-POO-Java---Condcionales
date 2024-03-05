import java.util.Scanner;

public class EjercicioCon5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean salir = false;
        do {
            System.out.println("5. Forma de hacer una división, pero recuerde no agregar un cero");

            System.out.println("Ingrese el Primer número ");
            Scanner src= new Scanner(System.in);
            double Num1 = src.nextDouble();
            System.out.println("Ingrese el segundo número ");
            double Num2 = src.nextDouble();

            if (Num1 == 0 || Num2 == 0){
                System.out.println("Ingresar un numero que no sea cero");
            }else {
                double resul = Num1/Num2;
                System.out.println("La división de usu dos números es " + resul );
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
