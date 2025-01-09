public class Ingrédient {
        private String nom;
        private int quantite;
        private String unite;

        public void getNom(){
            System.out.println("Nom: " + nom);
        }
        public void getQuantite(){
            System.out.println("Quantite: " + quantite);
        }
        public void getUnite(){
            System.out.println("Unite: " + unite);
        }
        public void setQuantite(int quantite){
            this.quantite = quantite;
        }

        public Ingrédient(String nom,int quantite,String unite){
            this.nom = nom;
            this.quantite = quantite;
            this.unite = unite;
        }
}
