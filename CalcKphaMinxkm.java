import java.util.Scanner;

public class CalcKphaMinxkm {

    public static void main(String[] args) {
        // Pasamos de velocidad (kph) a ritmo (minutos/km)
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la velocidad");
        float velocidad = sc.nextFloat();

        VelocidadARitmo(velocidad);

    }
    static void VelocidadARitmo(float velocidad) {
        // 1. 1 hora/ x km = y horas/km
        float horasPorKm = 1/velocidad;

        // 2. Y horas/km * 60 min/hora = Z.P min/km
        float minPorKm = horasPorKm * 60;
        int minXKm = (int) minPorKm;


        // 3. 0.P min/kn * 60 seg/h = h seg
        float segundos = (minPorKm - (float) minXKm) * 60;
        int segxKm = (int) segundos;

        // ritmo Z:H
        System.out.println("El ritmo es: " + minXKm + ":" + segxKm);
    }

}
