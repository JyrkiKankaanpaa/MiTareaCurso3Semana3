package com.mitareacurso3semana3.mitareacurso3semana3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<Mascotas> mascotases;
    private RecyclerView listaMascotas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        listaMascotas = (RecyclerView)findViewById(R.id.cvMascotas);
        LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        listaMascotas.setLayoutManager(llm);
        iniliciarListaMascotas();
        iniliciarAdabtor();
    }
    public void iniliciarAdabtor(){
        MascotasAdapter adabter = new MascotasAdapter(mascotases);
        listaMascotas.setAdapter(adabter);
    }
    public void iniliciarListaMascotas(){
        mascotases = new ArrayList<Mascotas>();
        mascotases.add(new Mascotas(R.drawable.nappi,"Nappi",1,1));
        mascotases.add(new Mascotas(R.drawable.lyyli,"Lyyli",1,1));

    }
}
