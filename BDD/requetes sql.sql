--question 1
select vehicule.no_imm, modele FROM vehicule, categorie1, calendrier
                WHERE vehicule.no_imm=calendrier.no_imm
                AND vehicule.code_categ=categorie1.code_categ
                AND libelle LIKE '%familiale%'
                AND TO_CHAR(DATEJOUR, 'DD/MM/YYYY' ) BETWEEN '01/10/2015' AND '01/10/2015'
;

--question 2
INSERT INTO calendrier VALUES (?,?,?)

--question 3
select TARIF_JOUR
    from TARIF,VEHICULE, CATEGORIE1
    where TARIF.CODE_TARIF=CATEGORIE1.CODE_TARIF
    and CATEGORIE1.CODE_CATEG=VEHICULE.CODE_CATEG
    and MODELE like '% %';
--question 4
SELECT AGENCE.CODE_AG FROM AGENCE,VEHICULE,CATEGORIE1
    where AGENCE.CODE_AG=VEHICULE.CODE_AG
    and VEHICULE.CODE_CATEG=CATEGORIE1.CODE_CATEG
    having COUNT(*) = (select COUNt(*) from  CATEGORIE1)
    group by CATEGORIE1.CODE_CATEG, AGENCE.CODE_AG;

--question5
(select NOM, VILLE, CODPOSTAL
    from CLIENT1,DOSSIER
    where CLIENT1.CODE_CLI=DOSSIER.CODE_CLI
    and NO_IMM like '%%')
intersect
(select NOM, VILLE, CODPOSTAL
    from CLIENT1,DOSSIER
    where CLIENT1.CODE_CLI=DOSSIER.CODE_CLI
    and NO_IMM like '%%');