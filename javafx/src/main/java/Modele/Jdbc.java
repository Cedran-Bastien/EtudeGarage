package Modele;

import java.sql.*;
import java.util.HashMap;
import java.util.Map;

public class Jdbc {

    public static Connection connectionOJDBC(String user, String password) throws SQLException, ClassNotFoundException {
        // charger le driver JDBC
        Class.forName("oracle.jdbc.driver.OracleDriver");
        System.out.println("Driver loaded");
        // établir une connexion
        String url = "jdbc:oracle:thin:@charlemagne.iutnc.univ-lorraine.fr:1521:infodb";
        java.sql.Connection connection = DriverManager. getConnection(url,user,password);
        System.out.println("Database connected");
        return connection;
    }

    public static Map selectVehicule(String categorie, String dateDebue, String dateFin) throws SQLException, ClassNotFoundException {
        Connection connection = Jdbc.connectionOJDBC("bastie141u", "207Oracleapt!");
        PreparedStatement pr = connection.prepareStatement("select vehicule.no_imm, modele FROM vehicule, categorie1, calendrier\n" +
                "                WHERE vehicule.no_imm=calendrier.no_imm\n" +
                "                AND vehicule.code_categ=categorie1.code_categ\n" +
                "                AND libelle LIKE ?\n" +
                "                AND TO_CHAR(DATEJOUR, 'DD/MM/YYYY' ) BETWEEN ? AND ?");

        pr.setString(1, categorie);
        pr.setString(2, dateDebue);
        pr.setString(3, dateFin);
        ResultSet result = pr.executeQuery();


        Map<String,String> resultat = new HashMap<String, String>();
        while (result.next()){
            resultat.put(result.getString(1),result.getString(2));
        }

        connection.close();

        return resultat;
    }


    public static void updateReservation(String dateDebut, String dateFin,String numImma) throws SQLException, ClassNotFoundException {
        Connection connection = Jdbc.connectionOJDBC("bastie141u", "207Oracleapt!");
        PreparedStatement pr = connection.prepareStatement("Update calendrier set paslibre='x' " +
                "where no_imm=? and datejour " +
                "between to_date(?) " +
                "and to_date(?);");
        pr.setString(1, numImma);
        pr.setString(2, dateDebut);
        pr.setString(3, dateFin);
        pr.executeUpdate();
        connection.close();
    }

    public static Map calculeTarif(String modéle, int duree) throws SQLException, ClassNotFoundException {
        Connection connection = Jdbc.connectionOJDBC("bastie141u", "207Oracleapt!");
        PreparedStatement pr = connection.prepareStatement("select TARIF_JOUR\n" +
                "    from TARIF,VEHICULE, CATEGORIE1\n" +
                "    where TARIF.CODE_TARIF=CATEGORIE1.CODE_TARIF\n" +
                "    and CATEGORIE1.CODE_CATEG=VEHICULE.CODE_CATEG\n" +
                "    and MODELE like ?");
        pr.setString(1, modéle);
        ResultSet result = pr.executeQuery();

        Map<String,String> resultat = new HashMap<String, String>();
        while (result.next()){
            resultat.put(result.getString(1),"");
        }

        connection.close();

        return resultat;
    }


    public static Map afficherAgence() throws SQLException, ClassNotFoundException {
        Connection connection = Jdbc.connectionOJDBC("bastie141u", "207Oracleapt!");
        PreparedStatement pr = connection.prepareStatement("SELECT AGENCE.CODE_AG FROM AGENCE,VEHICULE,CATEGORIE1\n" +
                "    where AGENCE.CODE_AG=VEHICULE.CODE_AG\n" +
                "    and VEHICULE.CODE_CATEG=CATEGORIE1.CODE_CATEG\n" +
                "    having COUNT(*) = (select COUNt(*) from  CATEGORIE1)\n" +
                "    group by CATEGORIE1.CODE_CATEG, AGENCE.CODE_AG");
        ResultSet result = pr.executeQuery();

        Map<String,String> resultat = new HashMap<String, String>();
        while (result.next()){
            resultat.put(result.getString(1),result.getString(2));
        }

        connection.close();

        return resultat;
    }

    public static Map afficherClient(String modele1, String modele2) throws SQLException, ClassNotFoundException {
        Connection connection = Jdbc.connectionOJDBC("bastie141u", "207Oracleapt!");
        PreparedStatement pr = connection.prepareStatement("(select NOM, VILLE, CODPOSTAL\n" +
                "    from CLIENT1,DOSSIER\n" +
                "    where CLIENT1.CODE_CLI=DOSSIER.CODE_CLI\n" +
                "    and NO_IMM like ?)\n" +
                "intersect\n" +
                "(select NOM, VILLE, CODPOSTAL\n" +
                "    from CLIENT1,DOSSIER\n" +
                "    where CLIENT1.CODE_CLI=DOSSIER.CODE_CLI\n" +
                "    and NO_IMM like ?);");
        pr.setString(1, modele1);
        pr.setString(2, modele2);
        ResultSet result = pr.executeQuery();

        Map<String,String> resultat = new HashMap<String, String>();
        while (result.next()){
            resultat.put(result.getString(1),result.getString(2));
        }

        connection.close();

        return resultat;
    }

}
