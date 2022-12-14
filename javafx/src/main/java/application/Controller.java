package application;

import Modele.Jdbc;
import Vue.Vue;
import Vue.VuParametre;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

import java.io.StringReader;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;


public class Controller implements EventHandler<ActionEvent> {
    Vue vue;
    int indiceRequete;

    public Controller(Vue vue){
        this.vue = vue;
        this.indiceRequete = VuParametre.INDICE_LISTE_VEHICULE;
    }


    @Override
    public void handle(ActionEvent actionEvent) {
        String s= ((Button)(actionEvent.getTarget())).getText();

        switch (s){
            case "liste des vehicules":
                this.vue.updateVue(VuParametre.INDICE_LISTE_VEHICULE);
                this.indiceRequete= VuParametre.INDICE_LISTE_VEHICULE;
                break;
            case "Mise a jour Calendrier":
                this.vue.updateVue(VuParametre.INDICE_UPDATE);
                this.indiceRequete=VuParametre.INDICE_UPDATE;
                break;
            case "Tarif de la location":
                this.vue.updateVue(VuParametre.INDICE_TARIF);
                this.indiceRequete=VuParametre.INDICE_TARIF;
                break;
            case "Affichage agence":
                this.vue.updateVue(VuParametre.INDICE_LISTE_AGENCE);
                this.indiceRequete=VuParametre.INDICE_LISTE_AGENCE;
                break;
            case "Liste de clients":
                this.vue.updateVue(VuParametre.INDICE_LISTE_CLIENT);
                this.indiceRequete=VuParametre.INDICE_LISTE_CLIENT;
                break;
            case "Exécuter":
                switch (this.indiceRequete){
                    case 1:
                        String cat = (((TextField)((GridPane)(this.vue.getChildren().get(1))).getChildren().get(4))).getText();
                        String dateD  =(((TextField)((GridPane)(this.vue.getChildren().get(1))).getChildren().get(5))).getText();
                        String dateF  =(((TextField)((GridPane)(this.vue.getChildren().get(1))).getChildren().get(6))).getText();
                        String[][] res= null;
                        try {
                            res = Jdbc.selectVehicule(cat,dateD,dateF);
                        } catch (SQLException e) {
                            e.printStackTrace();
                        } catch (ClassNotFoundException e) {
                            e.printStackTrace();
                        }
                        this.vue.afficherTab(res);
                        break;
                    case 2:
                        String imma = (((TextField)((GridPane)(this.vue.getChildren().get(1))).getChildren().get(4))).getText();
                        dateD  =(((TextField)((GridPane)(this.vue.getChildren().get(1))).getChildren().get(5))).getText();
                        dateF  =(((TextField)((GridPane)(this.vue.getChildren().get(1))).getChildren().get(6))).getText();
                        try {
                            Jdbc.updateReservation(dateD,dateF,imma);
                            this.vue.resultat.setText("Mise a jour effectuer");
                        } catch (SQLException e) {
                            e.printStackTrace();
                        } catch (ClassNotFoundException e) {
                            this.vue.resultat.setText("erreur : verifier la validité des valeur entrées");
                            e.printStackTrace();
                        }

                        break;
                    case 3:
                        String modele = (((TextField)((GridPane)(this.vue.getChildren().get(1))).getChildren().get(4))).getText();
                        int duree  = Integer.parseInt((((TextField)((GridPane)(this.vue.getChildren().get(1))).getChildren().get(5))).getText());
                        String[] res1= null;
                         try {
                            res1 = Jdbc.calculeTarif(modele,duree);
                        } catch (SQLException e) {
                            e.printStackTrace();
                        } catch (ClassNotFoundException e) {
                            e.printStackTrace();
                        }
                         this.vue.afficherTab(res1);
                        break;
                    case 4:
                        res1= null;
                        try {
                            res1= Jdbc.afficherAgence();
                        } catch (SQLException e) {
                            e.printStackTrace();
                        } catch (ClassNotFoundException e) {
                            e.printStackTrace();
                        }
                        this.vue.afficherTab(res1);
                        break;
                    case 5:
                        String modele1 = (((TextField)((GridPane)(this.vue.getChildren().get(1))).getChildren().get(4))).getText();
                        String modele2 = (((TextField)((GridPane)(this.vue.getChildren().get(1))).getChildren().get(5))).getText();
                        res = null;
                        try {
                            res = Jdbc.afficherClient(modele1,modele2);
                        } catch (SQLException e) {
                            e.printStackTrace();
                        } catch (ClassNotFoundException e) {
                            e.printStackTrace();
                        }
                        this.vue.afficherTab(res);
                        break;
                }
        }
    }
}