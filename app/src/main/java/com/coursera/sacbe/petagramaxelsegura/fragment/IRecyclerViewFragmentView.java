package com.coursera.sacbe.petagramaxelsegura.fragment;

import com.coursera.sacbe.petagramaxelsegura.adapter.MascotaAdaptador;
import com.coursera.sacbe.petagramaxelsegura.pojo.Mascota;

import java.util.ArrayList;

/**
 * Created by Sacbe on 18/09/2016.
 */
public interface IRecyclerViewFragmentView {

    public void generarLinearLyout();

    public MascotaAdaptador crearAdaptador(ArrayList<Mascota> mascotas);

    public void inicializarAdaptador(MascotaAdaptador adaptador);

}
