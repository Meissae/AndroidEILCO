package com.example.tp5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class ContactAcivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact_acivity);
    }
}

public class Contact {
    private String nom;
    private String prenom;
    private String imageURL;

    public Contact(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
        this.imageURL = imageURL;
    }

}