public class Ingrédient {
        private String nom; //toujours mettre en privé pour éviter une modif
        private int quantite;
        private String unite;

    public Ingrédient(String nom,int quantite,String unite){
        this.nom = nom;
        if (quantite<0){
            System.out.println("Impossible de mettre "+quantite+" pour un ingrédient.");
        }else{
            this.quantite = quantite;
        }
        this.quantite = quantite;
        this.unite = unite;

    }

        public String afficher(){
            return this.nom + " : " + this.quantite + " " + this.unite;
        }

        public String getNom(){
            return this.nom;
        }
        public int getQuantite(){
            return this.quantite;
        }
        public String getUnite() {
            return this.unite;
        }
        public void setQuantite(int quantite){
        if (quantite < 0){
            System.out.println("Impossible de mettre "+quantite+" pour un ingrédient.");
        }else{
            this.quantite = quantite;
        }
            this.quantite = quantite;
        }


}
