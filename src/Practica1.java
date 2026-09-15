import java.util.ArrayList;
import java.util.Scanner;

public class Practica1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> noms = new ArrayList<>();
        noms.add("Tao");

        String menu = """
                1. Gestió d'usuaris
                2. Veure estat del sistema
                0. Sortir""";
        String subMenu = """
                \t1. Llistar usuaris
                \t2. Afegir nou usuari
                \t0. Tornar al menú principal
                """;
        System.out.println(menu);
        System.out.print("➢");
        int option = sc.nextInt();
        while (true){
            switch (option){
                case 1 -> {
                    obrirSubmenu(subMenu);
                    System.out.print("➢");
                    option = sc.nextInt();
                    loop:
                    while(true){
                        switch (option){
                            case 1 -> {
                                for (String nom : noms){
                                    System.out.println(nom);
                                }
                                obrirSubmenu(subMenu);
                            }
                            case 2 -> {
                                System.out.println("Indica el nombre del usuario:");
                                sc.nextLine();
                                System.out.print("➢");
                                noms.add(sc.nextLine());
                                obrirSubmenu(subMenu);
                            }
                            case 0 -> {
                                System.out.println("Has seleccionat l'opció d'anar al menú principal");
                                break loop;
                            }
                            default -> System.out.println("\u001B[31mOpció invàlida! escull de nou!\u001B[0m");
                        }
                        System.out.print("➢");
                        option = sc.nextInt();
                    }
                }
                case 2 -> {
                    System.out.println("Has seleccionat l'opció de veure l'estat del sistema");
                    System.out.println(menu);
                }
                case 0 -> {
                    System.out.println("Has seleccionat l'opció de sortir del programa");
                    return;
                }
                default -> System.out.println("\u001B[31mOpció invàlida! escull de nou!\u001B[0m");
            }
            System.out.println(menu);
            System.out.print("➢");
            option = sc.nextInt();
        }
    }
    public static void obrirSubmenu(String submenu){
        System.out.println(submenu);
    }
}
