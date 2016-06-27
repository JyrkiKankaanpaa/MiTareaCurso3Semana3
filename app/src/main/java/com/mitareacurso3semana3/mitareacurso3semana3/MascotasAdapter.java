package com.mitareacurso3semana3.mitareacurso3semana3;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;

/**
 * Created by kanjyr0 on 26.6.2016.
 */
public class MascotasAdapter extends RecyclerView.Adapter<MascotasAdapter.MascotaViewHolder>{

    ArrayList<Mascotas> mascotases;

    public MascotasAdapter(ArrayList<Mascotas> mascotases){
        this.mascotases = mascotases;

    }


    @Override
    public MascotaViewHolder onCreateViewHolder(ViewGroup parent, int viewType){
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview_mascotas, parent, false);
        return new MascotaViewHolder(v);
    }

    @Override
    public void onBindViewHolder(MascotaViewHolder mascotaViewHolder, int position){
        Mascotas mascotas = mascotases.get(position);
        mascotaViewHolder.imgFoto.setImageResource(mascotas.getFoto());
        mascotaViewHolder.tvNombre.setText(mascotas.getMascotaNombre());

    }

    @Override
    public int getItemCount(){

        return mascotases.size();
    }

    public static class MascotaViewHolder extends RecyclerView.ViewHolder{
        private ImageView imgFoto;
        private TextView tvNombre;




        public MascotaViewHolder(View itemView) {
            super(itemView);
            imgFoto = (ImageView) itemView.findViewById(R.id.imgFoto);
            tvNombre = (TextView) itemView.findViewById(R.id.tvNombre);
        }
    }
}
