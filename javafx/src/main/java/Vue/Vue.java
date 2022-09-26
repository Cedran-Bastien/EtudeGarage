package Vue;

import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;

import java.util.Map;
import java.util.Set;

public class Vue extends Pane {
    public BoutonChoix boutonChoix;
    public VuParametre vueParametre;

    public Vue(int choixRequetes){
        this.boutonChoix = new BoutonChoix();
        this.boutonChoix.setLayoutX(0);
        this.boutonChoix.setLayoutY(0);

        this.vueParametre=new VuParametre(choixRequetes);
        this.vueParametre.setLayoutX(200);

        this.getChildren().addAll(this.boutonChoix,this.vueParametre);
    }

    public void updateVue(int choixRequetes){
        this.boutonChoix = new BoutonChoix();
        this.boutonChoix.setLayoutX(0);
        this.boutonChoix.setLayoutY(0);

        this.vueParametre=new VuParametre(choixRequetes);
        this.vueParametre.setLayoutX(200);

    }

    public void afficherMap(Map<String,String> map){
        VBox vb = new VBox();
        vb.setLayoutY(this.boutonChoix.getWidth()+20);
        vb.setLayoutY(this.vueParametre.getHeight()+20);
        Set<String> dom = map.keySet();
        String res="";
        for (String s : dom){
            res += s+ " - "+map.get(s)+"\n";
        }
        Label l = new Label(res);
        l.setLayoutX(150);
        l.setLayoutY(75);
        this.getChildren().add(l);
    }

}
