package Vue;

import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;

public class BoutonChoix extends VBox {

    public BoutonChoix(){
        Button listeVehicule =new Button("liste des vehicules");
        listeVehicule.setMinWidth(135);
        Button updateCalendrier= new Button("Mise a jour Calendrier");
        updateCalendrier.setMinWidth(135);
        Button tarif = new Button("Tarif de la location");
        tarif.setMinWidth(135);
        Button Agence = new Button("Affichage agence");
        Agence.setMinWidth(135);
        Button listeClient = new Button("Liste de clients");
        listeClient.setMinWidth(135);
        this.getChildren().addAll(listeVehicule,updateCalendrier,tarif,Agence,listeClient);
    }


}


