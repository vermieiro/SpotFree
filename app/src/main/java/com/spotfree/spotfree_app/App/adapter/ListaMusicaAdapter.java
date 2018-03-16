package com.spotfree.spotfree_app.App.adapter;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.spotfree.spotfree_app.App.model.ListaMusica;
import com.spotfree.spotfree_app.R;


import java.util.List;

public class ListaMusicaAdapter extends BaseAdapter{

    private List<ListaMusica> musicas;
    private Activity raiz;

    public ListaMusicaAdapter() {
        super();
    }

    @Override
    public int getCount() {
        return musicas.size();
    }

    @Override
    public Object getItem(int position) {
        return musicas.get(position);
    }

    @Override
    public long getItemId(int position) {
        return musicas.get(position).getId();
    }

    @Override
    public View getView(int position, View view, ViewGroup parent) {
        View item = raiz.getLayoutInflater().inflate(R.layout.item_lista_musicas, parent,false);
        TextView Nome = item.findViewById(R.id.itemListaMusicasNomeMusica);
        ImageView Foto= item.findViewById(R.id.itemListaMusicaFoto);
        TextView Artisita = item.findViewById(R.id.itemListaMusicasArtista);
        TextView Duracao = item.findViewById(R.id.itemListaMusicasDuracao);

        return item;
    }

    public ListaMusicaAdapter(List<ListaMusica> musicas, Activity raiz){
        this.musicas=musicas;
        this.raiz=raiz;

    }
}
