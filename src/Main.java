import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);
        System.out.println("Que voulez vous faire : ");
        System.out.println("1 - Voir les ingrédients");
        System.out.println("2 - Ajouter un ingrédient");
        int choix = clavier.nextInt();
        if (choix == 2) {
            System.out.println("Saisissez le nom de l'ingrédient");
            String nomIngredient = clavier.next();
            System.out.println("Saisissez la quantité de l'ingrédient");
            int quantiteIngredient = clavier.nextInt();
            System.out.println("Saisissez l'unité de l'ingrédient");
            String uniteIngredient = clavier.next();
            new Ingrédient(nomIngredient, quantiteIngredient, uniteIngredient);
            Ingrédient monIngrédient = new Ingrédient(nomIngredient, quantiteIngredient, uniteIngredient);
        }
        else if (choix == 1) {
            System.out.println("Voici les ingrédients :");
        }

    }
}