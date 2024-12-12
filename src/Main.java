import java.time.Year;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Menu();


    }

    public static void Menu() {
        Scanner scan = new Scanner(System.in);
        char option;

          do {
        System.out.println("(a) Mayores de edad");
        System.out.println("(b) Calculadora de ingresos de canal de Youtube");
        System.out.println("(c) Calculo horario");
        System.out.println("(d) Salir ");
        option = scan.next().charAt(0);
        System.out.println("Has elegido la opción " + option);



        switch (option) {
            case 'a':
                System.out.println("Cuantas personas hay");
                int personas = scan.nextInt();
                int edad;

                for (int i = 1; i <= personas; i++) {
                    System.out.println("Introduce el año en el que naciste persona " + i);
                    edad = scan.nextInt();

                    if (Year.now().getValue() - edad < 18) System.out.println("Eres menor de edad");
                    else System.out.println("Eres mayor de edad");


                }
                break;

            case 'b':
                int seguir;
                do {

                    System.out.println("Introduce la tematica del video (1. ASMR 2. Deportes 3. Animales 4. Tecnologia 5. Bebes ");
                    int tematica = scan.nextInt();

                    switch (tematica) {
                        case 1:
                            double cpm = 0.1;

                            System.out.println("Introduce la cantidad de visitas");
                            int visitasvideo = scan.nextInt();

                            double videototal = (cpm * visitasvideo) / 1000;
                            System.out.println("El video ha generado " + videototal);

                            break;

                        case 2:
                            cpm = 1;

                            System.out.println("Introduce la cantidad de visitas");
                            visitasvideo = scan.nextInt();

                            videototal = (cpm * visitasvideo) / 1000;
                            System.out.println("El video ha generado " + videototal);

                            break;

                        case 3:
                            cpm = 0.2;
                            System.out.println("Introduce la cantidad de visitas");
                            visitasvideo = scan.nextInt();

                            videototal = (cpm * visitasvideo) / 1000;
                            System.out.println("El video ha generado " + videototal);

                            break;
                        case 4:
                            cpm = 0.5;
                            System.out.println("Introduce la cantidad de visitas");
                            visitasvideo = scan.nextInt();

                            videototal = (cpm * visitasvideo) / 1000;
                            System.out.println("El video ha generado " + videototal);

                            break;
                        case 5:
                            cpm = 0.5;
                            System.out.println("Introduce la cantidad de visitas");
                            visitasvideo = scan.nextInt();

                            videototal = (cpm * visitasvideo) / 1000;
                            System.out.println("El video ha generado " + videototal);
                            break;
                    }

                    System.out.println("Quieres analizar otro video? 1. Si 2. No");
                    seguir = scan.nextInt();


                } while (seguir != 2);

            break;
            case 'c':
                double hora;
                double minutos;
                int ampm;

                do {
                    System.out.println("Introduce la hora");
                    hora = scan.nextInt();

                } while (hora < 0 || hora > 24);


                do {
                    System.out.println("Introduce los minutos");
                    minutos = scan.nextInt();

                } while (minutos < 0 || minutos > 59);


                do {
                    System.out.println("Introduce 1. AM 2. PM");
                    ampm = scan.nextInt();
                } while (ampm != 1 && ampm != 2);


                double huso;
                do {
                    System.out.println("Introduce el huso (-11 a +12");
                    huso = scan.nextInt();
                } while (huso < -11 || huso > 12);

                int horatotal = (int) (hora + huso);
                System.out.println("La hora " + hora + " los minutos " + minutos + " " + "El tiempo del dia " +  ampm + " (1 es AM 2 es PM)" +  huso  + "Es las " + horatotal);

                break;
        }

          } while (option != 'd');


    }


}




