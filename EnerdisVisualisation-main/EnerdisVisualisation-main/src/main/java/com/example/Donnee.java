package com.example;

public class Donnee {
    private int id;
    private String date;
    private float frequence;
    private float tension;
    private float intensite;
    private float puissance;

    public Donnee(int id, String date, float frequence, float tension, float intensite, float puissance) {
        this.id = id;
        this.date = date;
        this.frequence = frequence;
        this.tension = tension;
        this.intensite = intensite;
        this.puissance = puissance;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public float getFrequence() {
        return frequence;
    }

    public void setFrequence(float frequence) {
        this.frequence = frequence;
    }

    public float getTension() {
        return tension;
    }

    public void setTension(float tension) {
        this.tension = tension;
    }

    public float getPuissance() {
        return puissance;
    }

    public void setPuissance(float puissance) {
        this.puissance = puissance;
    }

    public float getIntensite() {
        return intensite;
    }

    public void setIntensite(float intensite) {
        this.intensite = intensite;
    }

}