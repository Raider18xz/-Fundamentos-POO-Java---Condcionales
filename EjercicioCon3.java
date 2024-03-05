import java.util.Scanner;

public class EjercicioCon3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean salir = false;
        do {
            System.out.println("3. Forma de saber el mayor número, de 3 numerós al azar ");

            System.out.println("Ingrese el Primer numero ");
            Scanner src= new Scanner(System.in);
            double Num1 = src.nextDouble();
            System.out.println("Ingrese el Segundo número ");
            double Num2 = src.nextDouble();
            System.out.println("Ingrese el Tercer número ");
            double Num3 = src.nextDouble();

            if (Num1<0 || Num2<0 || Num3<0){
                System.out.println("Por favor ingrese un número Positivo");
            }else {
                //To know the greatest number
                double NumMayor= Num1;
                if (Num2>NumMayor){
                    NumMayor=Num2;
                }if (Num3>NumMayor){
                    NumMayor=Num3;
                }
                //To find out the smallest number
                double NumMenor = Num1;
                if (Num2<NumMenor){
                    NumMenor=Num2;
                }if (Num3<NumMenor){
                    NumMenor=Num3;
                }
                System.out.println("El mayor número es " + NumMayor + " y el número mas pequeño es " + NumMenor);
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
