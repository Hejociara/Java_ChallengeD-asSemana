import java.util.Scanner;

public class Main {
    /**
     * @author: Hejociara
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);


        System.out.print("Ingresa el día: ");
        String diaSemana = entrada.next();

        if(diaSemana.equalsIgnoreCase("domingo"))
            System.out.println(1);
        else if (diaSemana.equalsIgnoreCase("lunes"))
            System.out.println(2);
        else if (diaSemana.equalsIgnoreCase("Martes"))
            System.out.println(3);
        else if (diaSemana.equalsIgnoreCase("Miércoles")
                || diaSemana.equalsIgnoreCase("miercoles"))
            System.out.println(4);
        else if (diaSemana.equalsIgnoreCase("Jueves"))
            System.out.println(5);
        else if (diaSemana.equalsIgnoreCase("Viernes"))
            System.out.println(6);
        else if (diaSemana.equalsIgnoreCase("Sábado")
                || diaSemana.equalsIgnoreCase("sabado"))
            System.out.println(7);
        else {
            System.out.println("Día inválido");
        }


        entrada.close();

    }


}

