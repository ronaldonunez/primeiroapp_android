package br.pucminas.rnunez.primeiroapp.exemplo5;


import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import br.pucminas.rnunez.primeiroapp.R;

public class Planet implements Serializable{

    private String name;
    private int image;

    public Planet(String name, int image){
        setName(name);
        setImage(image);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public static List<Planet> getPlanets() {
        List<Planet> planetas = new ArrayList<Planet>();

        planetas.add(new Planet("Mercúrio", R.drawable.planeta_01_mercurio));
        planetas.add(new Planet("Vênus", R.drawable.planeta_02_venus));
        planetas.add(new Planet("Terra", R.drawable.planeta_03_terra));
        planetas.add(new Planet("Marte", R.drawable.planeta_04_marte));
        planetas.add(new Planet("Júpiter", R.drawable.planeta_05_jupiter));
        planetas.add(new Planet("Saturno", R.drawable.planeta_06_saturno));
        planetas.add(new Planet("Urano", R.drawable.planeta_07_urano));
        planetas.add(new Planet("Netuno", R.drawable.planeta_08_neptuno));
        planetas.add(new Planet("Plutão", R.drawable.planeta_09_plutao));

        return planetas;
    }

}
