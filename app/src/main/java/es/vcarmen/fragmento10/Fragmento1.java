package es.vcarmen.fragmento10;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

/**
 * Created by matinal on 26/10/17.
 */

public class Fragmento1 extends ListFragment {

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setListAdapter(new Adaptador(getActivity(), R.layout.layout_listado, Contenido.ENT_ENTRADA) {

            @Override
            public void onEntrada(Object entrada, View view) {
                TextView textoSuperiorEntrada = (TextView) view.findViewById(R.id.textotitulo);
                textoSuperiorEntrada.setText(((Contenido.Lista_entrada)entrada).textoEncima);
                ImageView imageView = (ImageView) view.findViewById(R.id.imagenlista);
                imageView.setImageResource(((Contenido.Lista_entrada)entrada).idImagen);
            }
        });
    }

    public Fragmento1() {

    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        callBackVacio = (Callbacks) activity;
    }

    @Override
    public void onDetach() {
        super.onDetach();

        Callbacks mCallBack = callBackVacio;
    }

    public interface Callbacks {
        public void onEntradaSeleccionada(String id);


    }

    private static Callbacks callBackVacio= new Callbacks() {
        @Override
        public void onEntradaSeleccionada(String id) {

        }
    };

    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);
        callBackVacio.onEntradaSeleccionada(Contenido.ENT_ENTRADA.get(position).id);
    }
}
