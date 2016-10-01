package com.coursera.sacbe.petagramaxelsegura.presentador;

import android.content.Context;

import com.coursera.sacbe.petagramaxelsegura.db.ConstructorMascotas;
import com.coursera.sacbe.petagramaxelsegura.fragment.IRecyclerViewFavoritas;
import com.coursera.sacbe.petagramaxelsegura.fragment.IRecyclerViewFragmentView;
import com.coursera.sacbe.petagramaxelsegura.pojo.Mascota;

import java.util.ArrayList;

/**
 * Created by Sacbe on 18/09/2016.
 */
public class RecyclerViewFavoritasPresenter implements IRecyclerViewFavoritasPresenter {

    private IRecyclerViewFavoritas iRecyclerViewFavoritas;
    private Context context;
    private ConstructorMascotas constructorMascotas;
    private ArrayList<Mascota> mascotas;

    public RecyclerViewFavoritasPresenter(IRecyclerViewFavoritas iRecyclerViewFavoritas, Context context) {
        this.iRecyclerViewFavoritas = iRecyclerViewFavoritas;
        this.context = context;
        obtenerMascotasFavoritasBaseDatos();
    }

    @Override
    public void obtenerMascotasFavoritasBaseDatos() {
        constructorMascotas = new ConstructorMascotas(context);
        mascotas = constructorMascotas.obtenerMascotasFavoritas();
        mostrarMascotasRV();
    }

    @Override
    public void mostrarMascotasRV() {
        iRecyclerViewFavoritas.inicializarAdaptador(iRecyclerViewFavoritas.crearAdaptador(mascotas));
        iRecyclerViewFavoritas.generarLinearLyout();
    }
}
