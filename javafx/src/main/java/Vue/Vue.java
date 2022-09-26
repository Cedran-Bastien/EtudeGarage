package Vue;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;

import java.util.Map;
import java.util.Set;

public class Vue extends Pane {
    public BoutonChoix boutonChoix;
    public VuParametre vueParametre;
    public Label resultat;

    public Vue(int choixRequetes){
        this.boutonChoix = new BoutonChoix();
        this.boutonChoix.setLayoutX(0);
        this.boutonChoix.setLayoutY(0);

        this.vueParametre=new VuParametre(choixRequetes);
        this.vueParametre.setLayoutX(200);

        this.resultat= new Label("");
        this.resultat.setLayoutX(200);
        this.resultat.setLayoutY(150);

        this.getChildren().addAll(this.boutonChoix,this.vueParametre,this.resultat);
    }

    public void updateVue(int choixRequetes){
        switch (choixRequetes){
            case 1:
                ((Label)(this.vueParametre.getChildren().get(0))).setText("Catégorie : ");
                ((Label)(this.vueParametre.getChildren().get(1))).setText("Date de début : ");
                ((Label)(this.vueParametre.getChildren().get(2))).setText("Date de fin : ");
                ((Label)(this.vueParametre.getChildren().get(2))).setMaxWidth(100);
                ((Label)(this.vueParametre.getChildren().get(2))).setMaxHeight(100);
                ((TextField)(this.vueParametre.getChildren().get(6))).setMaxWidth(400);
                ((TextField)(this.vueParametre.getChildren().get(6))).setMinWidth(200);
                ((TextField)(this.vueParametre.getChildren().get(6))).setMaxHeight(400);
                break;
            case 2:
                ((Label)(this.vueParametre.getChildren().get(0))).setText("Immatriculation du vehicule : ");
                ((Label)(this.vueParametre.getChildren().get(1))).setText("Date de début : ");
                ((Label)(this.vueParametre.getChildren().get(2))).setText("Date de fin : ");
                ((Label)(this.vueParametre.getChildren().get(2))).setMaxWidth(100);
                ((Label)(this.vueParametre.getChildren().get(2))).setMaxHeight(100);
                ((TextField)(this.vueParametre.getChildren().get(6))).setMaxWidth(400);
                ((TextField)(this.vueParametre.getChildren().get(6))).setMinWidth(200);
                ((TextField)(this.vueParametre.getChildren().get(6))).setMaxHeight(400);
                break;
            case 3:
                ((Label)(this.vueParametre.getChildren().get(0))).setText("Modèle du vehicule :");
                ((Label)(this.vueParametre.getChildren().get(1))).setText("Durée de la location :");
                ((Label)(this.vueParametre.getChildren().get(2))).setText("");
                ((Label)(this.vueParametre.getChildren().get(2))).setMaxWidth(0);
                ((Label)(this.vueParametre.getChildren().get(2))).setMaxHeight(0);
                ((TextField)(this.vueParametre.getChildren().get(6))).setMaxWidth(0);
                ((TextField)(this.vueParametre.getChildren().get(6))).setMinWidth(0);
                ((TextField)(this.vueParametre.getChildren().get(6))).setMaxHeight(0);
                break;
            case 4:
                break;
            case 5:
                ((Label)(this.vueParametre.getChildren().get(0))).setText("Modèle du premier vehicule :");
                ((Label)(this.vueParametre.getChildren().get(1))).setText("Module du premier vehicule :");
                ((Label)(this.vueParametre.getChildren().get(2))).setText("");
                ((Label)(this.vueParametre.getChildren().get(2))).setMaxWidth(0);
                ((Label)(this.vueParametre.getChildren().get(2))).setMaxHeight(0);
                ((TextField)(this.vueParametre.getChildren().get(6))).setMaxWidth(0);
                ((TextField)(this.vueParametre.getChildren().get(6))).setMinWidth(0);
                ((TextField)(this.vueParametre.getChildren().get(6))).setMaxHeight(0);
                break;
        }



//        this.vueParametre.getChildren().get(0);
//
//        this.vueParametre=new VuParametre(choixRequetes);
//        this.vueParametre.setLayoutX(200);

    }

    public void afficherMap(Map<String,String> map){
        VBox vb = new VBox();
        vb.setLayoutY(this.boutonChoix.getWidth()+20);
        vb.setLayoutY(this.vueParametre.getHeight()+20);
        Set<String> dom = map.keySet();
        if (dom.size()==0){
            this.resultat.setText("absence de donnée");
        }else {
            String res = "";
            for (String s : dom){
                res+= s+ " - "+map.get(s)+"\n";
            }
            this.resultat.setText(res);
        }

    }

}
