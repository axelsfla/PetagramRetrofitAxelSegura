package com.coursera.sacbe.petagramaxelsegura.fragment;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.support.v7.widget.RecyclerView;

import com.coursera.sacbe.petagramaxelsegura.R;
import com.coursera.sacbe.petagramaxelsegura.adapter.MascotaAdaptador;
import com.coursera.sacbe.petagramaxelsegura.pojo.Mascota;
import com.coursera.sacbe.petagramaxelsegura.presentador.IRecyclerViewFragmentPresenter;
import com.coursera.sacbe.petagramaxelsegura.presentador.RecyclerViewFragmentPresenter;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class RecyclerViewFragment extends Fragment implements IRecyclerViewFragmentView{

    private ArrayList<Mascota> mascotas;
    private RecyclerView listaMascotas;
    private IRecyclerViewFragmentPresenter presenter;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_recyclerview, container, false);
        listaMascotas = (RecyclerView) v.findViewById(R.id.rvMascota);
        presenter = new RecyclerViewFragmentPresenter(this, getContext());
        return v;
    }

    /*
    public void inicializarListaMascotas(){

        mascotas = new ArrayList<Mascota>();

        mascotas.add(new Mascota(R.drawable.husky, "Miky", "Husky"));
        mascotas.add(new Mascota(R.drawable.bostonterrier, "Terry", "Boston Terrier"));
        mascotas.add(new Mascota(R.drawable.braco, "Toth", "Braco"));
        mascotas.add(new Mascota(R.drawable.chowchow, "Oso", "Chow Chow"));
        mascotas.add(new Mascota(R.drawable.bullterrier, "Seth", "Bull Terrier"));
        mascotas.add(new Mascota(R.drawable.foxhound, "Lasha", "Foxhound"));
        mascotas.add(new Mascota(R.drawable.goldenretriever, "Anubis", "Golden Retriever"));
        mascotas.add(new Mascota(R.drawable.pastoraustraliano, "Boby", "Pastor Australiano"));
        mascotas.add(new Mascota(R.drawable.perrocrestado, "Pelos", "Crestado"));

    }
    */

    @Override
    public void generarLinearLyout() {
        LinearLayoutManager llm = new LinearLayoutManager(getActivity());
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        listaMascotas.setLayoutManager(llm);
    }

    @Override
    public MascotaAdaptador crearAdaptador(ArrayList<Mascota> mascotas) {
        MascotaAdaptador adaptador = new MascotaAdaptador(mascotas, getActivity());
        return adaptador;
    }

    @Override
    public void inicializarAdaptador(MascotaAdaptador adaptador) {
        listaMascotas.setAdapter(adaptador);
    }
}
