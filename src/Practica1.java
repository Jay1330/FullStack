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
                1. Llistar usuaris
                2. Afegir nou usuari
                0. Tornar al menú principal
                """;
        System.out.println(menu);
        int option = sc.nextInt();
        while (true){
            switch (option){
                case 1 -> {
                    obrirSubmenu(subMenu);
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
                                noms.add(sc.nextLine());
                                obrirSubmenu(subMenu);
                            }
                            case 0 -> {
                                System.out.println("Has seleccionat l'opció d'anar al menú principal");
                                obrirSubmenu(subMenu);
                                break loop;
                            }
                            default -> System.out.println("Opció invàlida! escull de nou!");
                        }
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
                default -> System.out.println("Opció invàlida! escull de nou!");
            }
            option = sc.nextInt();
        }
    }
    public static void obrirSubmenu(String submenu){
        System.out.println(submenu);
    }
}
