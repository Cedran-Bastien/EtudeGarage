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
                ((Label)(this.vueParametre.getChildren().get(0))).setMaxWidth(300);
                ((Label)(this.vueParametre.getChildren().get(0))).setMaxHeight(100);
                ((Label)(this.vueParametre.getChildren().get(1))).setMaxWidth(300);
                ((Label)(this.vueParametre.getChildren().get(1))).setMaxHeight(100);
                ((Label)(this.vueParametre.getChildren().get(2))).setMaxWidth(300);
                ((Label)(this.vueParametre.getChildren().get(2))).setMaxHeight(100);
                ((TextField)(this.vueParametre.getChildren().get(4))).setMaxWidth(400);
                ((TextField)(this.vueParametre.getChildren().get(4))).setMinWidth(200);
                ((TextField)(this.vueParametre.getChildren().get(4))).setMaxHeight(400);
                ((TextField)(this.vueParametre.getChildren().get(5))).setMaxWidth(400);
                ((TextField)(this.vueParametre.getChildren().get(5))).setMinWidth(200);
                ((TextField)(this.vueParametre.getChildren().get(5))).setMaxHeight(400);
                ((TextField)(this.vueParametre.getChildren().get(6))).setMaxWidth(400);
                ((TextField)(this.vueParametre.getChildren().get(6))).setMinWidth(200);
                ((TextField)(this.vueParametre.getChildren().get(6))).setMaxHeight(400);
                break;
            case 2:
                ((Label)(this.vueParametre.getChildren().get(0))).setText("Immatriculation du vehicule : ");
                ((Label)(this.vueParametre.getChildren().get(1))).setText("Date de début : ");
                ((Label)(this.vueParametre.getChildren().get(2))).setText("Date de fin : ");
                ((Label)(this.vueParametre.getChildren().get(0))).setMaxWidth(300);
                ((Label)(this.vueParametre.getChildren().get(0))).setMaxHeight(100);
                ((Label)(this.vueParametre.getChildren().get(1))).setMaxWidth(300);
                ((Label)(this.vueParametre.getChildren().get(1))).setMaxHeight(100);
                ((Label)(this.vueParametre.getChildren().get(2))).setMaxWidth(300);
                ((Label)(this.vueParametre.getChildren().get(2))).setMaxHeight(100);
                ((TextField)(this.vueParametre.getChildren().get(4))).setMaxWidth(400);
                ((TextField)(this.vueParametre.getChildren().get(4))).setMinWidth(200);
                ((TextField)(this.vueParametre.getChildren().get(4))).setMaxHeight(400);
                ((TextField)(this.vueParametre.getChildren().get(5))).setMaxWidth(400);
                ((TextField)(this.vueParametre.getChildren().get(5))).setMinWidth(200);
                ((TextField)(this.vueParametre.getChildren().get(5))).setMaxHeight(400);
                ((TextField)(this.vueParametre.getChildren().get(6))).setMaxWidth(400);
                ((TextField)(this.vueParametre.getChildren().get(6))).setMinWidth(200);
                ((TextField)(this.vueParametre.getChildren().get(6))).setMaxHeight(400);
                break;
            case 3:
                ((Label)(this.vueParametre.getChildren().get(0))).setText("Modèle du vehicule :");
                ((Label)(this.vueParametre.getChildren().get(1))).setText("Durée de la location :");
                ((Label)(this.vueParametre.getChildren().get(2))).setText("");
                ((Label)(this.vueParametre.getChildren().get(0))).setMaxWidth(100);
                ((Label)(this.vueParametre.getChildren().get(0))).setMaxHeight(100);
                ((Label)(this.vueParametre.getChildren().get(1))).setMaxWidth(100);
                ((Label)(this.vueParametre.getChildren().get(1))).setMaxHeight(100);
                ((Label)(this.vueParametre.getChildren().get(2))).setMaxWidth(0);
                ((Label)(this.vueParametre.getChildren().get(2))).setMaxHeight(0);
                ((TextField)(this.vueParametre.getChildren().get(4))).setMaxWidth(400);
                ((TextField)(this.vueParametre.getChildren().get(4))).setMinWidth(200);
                ((TextField)(this.vueParametre.getChildren().get(4))).setMaxHeight(400);
                ((TextField)(this.vueParametre.getChildren().get(5))).setMaxWidth(400);
                ((TextField)(this.vueParametre.getChildren().get(5))).setMinWidth(200);
                ((TextField)(this.vueParametre.getChildren().get(5))).setMaxHeight(400);
                ((TextField)(this.vueParametre.getChildren().get(6))).setMaxWidth(0);
                ((TextField)(this.vueParametre.getChildren().get(6))).setMinWidth(0);
                ((TextField)(this.vueParametre.getChildren().get(6))).setMaxHeight(0);
                break;
            case 4:
                ((Label)(this.vueParametre.getChildren().get(0))).setText("");
                ((Label)(this.vueParametre.getChildren().get(1))).setText("");
                ((Label)(this.vueParametre.getChildren().get(2))).setText("");
                ((Label)(this.vueParametre.getChildren().get(0))).setMaxWidth(0);
                ((Label)(this.vueParametre.getChildren().get(0))).setMaxHeight(0);
                ((Label)(this.vueParametre.getChildren().get(1))).setMaxWidth(0);
                ((Label)(this.vueParametre.getChildren().get(1))).setMaxHeight(0);
                ((Label)(this.vueParametre.getChildren().get(2))).setMaxWidth(0);
                ((Label)(this.vueParametre.getChildren().get(2))).setMaxHeight(0);
                ((TextField)(this.vueParametre.getChildren().get(4))).setMaxWidth(0);
                ((TextField)(this.vueParametre.getChildren().get(4))).setMinWidth(0);
                ((TextField)(this.vueParametre.getChildren().get(4))).setMaxHeight(0);
                ((TextField)(this.vueParametre.getChildren().get(5))).setMaxWidth(0);
                ((TextField)(this.vueParametre.getChildren().get(5))).setMinWidth(0);
                ((TextField)(this.vueParametre.getChildren().get(5))).setMaxHeight(0);
                ((TextField)(this.vueParametre.getChildren().get(6))).setMaxWidth(0);
                ((TextField)(this.vueParametre.getChildren().get(6))).setMinWidth(0);
                ((TextField)(this.vueParametre.getChildren().get(6))).setMaxHeight(0);
                break;
            case 5:
                ((Label)(this.vueParametre.getChildren().get(0))).setText("Modèle du premier vehicule :");
                ((Label)(this.vueParametre.getChildren().get(1))).setText("Module du premier vehicule :");
                ((Label)(this.vueParametre.getChildren().get(2))).setText("");
                ((Label)(this.vueParametre.getChildren().get(0))).setMaxWidth(300);
                ((Label)(this.vueParametre.getChildren().get(0))).setMaxHeight(100);
                ((Label)(this.vueParametre.getChildren().get(1))).setMaxWidth(300);
                ((Label)(this.vueParametre.getChildren().get(1))).setMaxHeight(100);
                ((Label)(this.vueParametre.getChildren().get(2))).setMaxWidth(0);
                ((Label)(this.vueParametre.getChildren().get(2))).setMaxHeight(0);
                ((TextField)(this.vueParametre.getChildren().get(4))).setMaxWidth(400);
                ((TextField)(this.vueParametre.getChildren().get(4))).setMinWidth(200);
                ((TextField)(this.vueParametre.getChildren().get(4))).setMaxHeight(400);
                ((TextField)(this.vueParametre.getChildren().get(5))).setMaxWidth(400);
                ((TextField)(this.vueParametre.getChildren().get(5))).setMinWidth(200);
                ((TextField)(this.vueParametre.getChildren().get(5))).setMaxHeight(400);
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

    public void afficherTab(String[][] map){


        if (map == null ||map[0] == null || map[0][0] == null){
            this.resultat.setText("absence de donnée");
        }else {
            String res = "";
            int taile = map.length;
            for (int i=0;i<map[0].length;i++){
                if (map[0][i]==null){
                    res+= "";
                }
                else {
                    res+= ""+map[0][i]+" - "+map[1][i]+"\n";
                }
            }
            this.resultat.setText(res);
        }

    }

    public void afficherTab(String[] map){


        if (map == null){
            this.resultat.setText("absence de donnée");
        }else {
            String res = "";
            int taile = map.length;
            for (int i=0;i<map.length;i++){
                if (map[i]==null){
                    res+="";
                }
                else {
                    res+= ""+map[i]+"\n";
                }


            }
            this.resultat.setText(res);
        }

    }

}
