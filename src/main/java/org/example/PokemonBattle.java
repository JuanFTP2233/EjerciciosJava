import java.util.Scanner;

public class PokemonBattle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Tipo atacante (Agua, Fuego, Planta, Electrico): ");
        String atacante = sc.nextLine();
        System.out.print("Tipo defensor (Agua, Fuego, Planta, Electrico): ");
        String defensor = sc.nextLine();
        System.out.print("Ataque (1-100): ");
        int ataque = sc.nextInt();
        System.out.print("Defensa (1-100): ");
        int defensa = sc.nextInt();

        double efectividad = calcularEfectividad(atacante, defensor);
        double dano = 50 * ((double) ataque / defensa) * efectividad;

        System.out.println("Daño: " + dano);
    }

    private static double calcularEfectividad(String atacante, String defensor) {
        switch (atacante) {
            case "Agua":
                return defensor.equals("Fuego") ? 2 : defensor.equals("Planta") ? 0.5 : 1;
            case "Fuego":
                return defensor.equals("Planta") ? 2 : defensor.equals("Agua") ? 0.5 : 1;
            case "Planta":
                return defensor.equals("Agua") ? 2 : defensor.equals("Fuego") ? 0.5 : 1;
            case "Electrico":
                return defensor.equals("Agua") ? 2 : 1;
            default:
                return 1;
        }
    }
}