package com.example.tp5;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class ContactActivity extends AppCompatActivity {
    List<Contact> contacts = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView rvContacts = (RecyclerView) findViewById(R.id.rvContacts);

        contacts.add(new Contact("Tchalla","Chadwick","https://vignette.wikia.nocookie.net/marvelstudios/images/2/28/Avengers-endgame-poster-black-panther.jpg/revision/latest?cb=20190327001816&path-prefix=fr"));
        contacts.add(new Contact("Micheal","Jordan","https://www.leparisien.fr/resizer/rhl6NDP6ZkSnaF--XR4txInNy9U=/932x582/arc-anglerfish-eu-central-1-prod-leparisien.s3.amazonaws.com/public/MRCRRNPS6F3KMIW5XICJN6LW2Y.jpg"));
        contacts.add(new Contact("Bill","Gates","https://img-0.journaldunet.com/elpfaIfEs3KBlGG2sxNVGQh2crg=/300x/smart/206e2137b616429dbdfb0260326abcdc/ccmcms-jdn/11547842.jpg"));
        contacts.add(new Contact("Thanos","Francois","https://vignette.wikia.nocookie.net/marvelstudios/images/2/28/Avengers-endgame-poster-black-panther.jpg/revision/latest?cb=20190327001816&path-prefix=fr"));
        ContactsAdapter adapter = new ContactsAdapter(contacts,this);
        rvContacts.setAdapter(adapter);
        rvContacts.setLayoutManager(new LinearLayoutManager(this));


    }
}