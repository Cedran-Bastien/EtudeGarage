package Vue;

import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

public class VuParametre extends GridPane {
    public static final int INDICE_LISTE_VEHICULE = 1;
    public static final int INDICE_UPDATE = 2;
    public static final int INDICE_TARIF = 3;
    public static final int INDICE_LISTE_AGENCE = 4;
    public static final int INDICE_LISTE_CLIENT = 5;

    public VuParametre(int indice){
        this.setHgap(10);
        this.setVgap(8);
        this.setMinSize(1,300);
        Button b = new Button("Exécuter");
        switch (indice){
            case 1:
                Label cat = new Label("Catégorie : ");
                Label dateD = new Label("Date de début : ");
                Label dateF = new Label("Date de fin : ");
                TextField tx = new TextField();
                tx.setMinWidth(200);
                TextField tx1 = new TextField();
                TextField tx2 = new TextField();
                this.add(cat,0,0);
                this.add(dateD,0,1);
                this.add(dateF,0,2);
                this.add(b,0,3);
                this.add(tx,1,0);
                this.add(tx1,1,1);
                this.add(tx2,1,2);
                break;

            case 2:
                Label immatriculation = new Label("Immatriculation du vehicule : ");
                dateD = new Label("Date de début : ");
                dateF = new Label("Date de fin : ");
                tx = new TextField();
                tx.setMinWidth(200);
                tx1 = new TextField();
                tx2 = new TextField();
                this.add(immatriculation,0,0);
                this.add(dateD,0,1);
                this.add(dateF,0,2);
                this.add(b,0,3);
                this.add(tx,1,0);
                this.add(tx1,1,1);
                this.add(tx2,1,2);
                break;

            case 3:
                Label modéle = new Label("Modèle du vehicule :");
                Label duree = new Label("Durée de la location :");
                tx = new TextField();
                tx.setMinWidth(200);
                tx1 = new TextField();
                this.add(modéle,0,0);
                this.add(duree,0,1);
                this.add(b,0,2);
                this.add(tx,1,0);
                this.add(tx1,1,1);
                break;

            case 4:
                break;

            case 5:
                Label modéle1 = new Label("Modèle du premier vehicule :");
                Label modele2 = new Label("Modèle du premier vehicule :");
                tx = new TextField();
                tx.setMinWidth(200);
                tx1 = new TextField();
                this.add(modéle1,0,0);
                this.add(modele2,0,1);
                this.add(b,0,2);
                this.add(tx,1,0);
                this.add(tx1,1,1);
                break;

        }
    }

}
