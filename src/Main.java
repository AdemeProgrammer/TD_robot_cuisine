import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);
            System.out.println("Saisissez le nom de l'ingrédient");
            String nom = clavier.next();
            System.out.println("Saisissez la quantité de l'ingrédient");
            int quantite = clavier.nextInt();
            System.out.println("Saisissez l'unité de l'ingrédient");
            String unite = clavier.next();
            new Ingrédient(nom, quantite, unite);
            Ingrédient monIngrédient = new Ingrédient(nom, quantite, unite);
            System.out.println("Quantité de l'ingrédient : "+monIngrédient.getQuantite());
            System.out.println("Unité de l'ingrédient : "+monIngrédient.getUnite());
            System.out.println("Nom de l'ingrédient : "+monIngrédient.getNom());

            System.out.println("Entrez une nouvelle quantité");
            int nouvelleQuantite = clavier.nextInt();

            monIngrédient.setQuantite(nouvelleQuantite);
            System.out.println(monIngrédient.afficher());
        }

    }
