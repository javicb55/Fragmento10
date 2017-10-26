package es.vcarmen.fragmento10;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

/**
 * Created by matinal on 26/10/17.
 */

public class Fragmento3 extends Fragment {

    public static final String ARG_ID_ENTRADA_SELECCIONADA = "item_id";

    private Contenido.Lista_entrada miItem;

    public Fragmento3() {
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if(getArguments().containsKey(ARG_ID_ENTRADA_SELECCIONADA)){
            miItem = Contenido.ENT_ENTRADA_HASHMAP.get(getArguments().getString(ARG_ID_ENTRADA_SELECCIONADA));
        }
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.layout_detalle, container,false);
        if(miItem != null) {
            ((TextView)rootView.findViewById(R.id.textotitulo)).setText(miItem.textoEncima);
            ((TextView)rootView.findViewById(R.id.textContenido)).setText(miItem.textDebajo);
            ((ImageView)rootView.findViewById(R.id.imagen)).setImageResource(miItem.idImagen);
        }


        return rootView;
    }
}
