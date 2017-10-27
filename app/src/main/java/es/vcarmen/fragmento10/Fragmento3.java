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
import android.widget.Toast;

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
            //Toast.makeText(getActivity(),"Cogiendo Argumentos " + getArguments() , Toast.LENGTH_SHORT).show();

        }
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {


        //Toast.makeText(getActivity(),"Create si entra", Toast.LENGTH_SHORT).show();

        View rootView = inflater.inflate(R.layout.layout_detalle, container,false);
        if(miItem != null) {
            ((TextView)rootView.findViewById(R.id.textTitulo)).setText(miItem.textoEncima);
            ((TextView)rootView.findViewById(R.id.textContenido)).setText(miItem.textDebajo);
            ((ImageView)rootView.findViewById(R.id.imagen)).setImageResource(miItem.idImagen);
            //Toast.makeText(getActivity(),"Create si entra en la vista", Toast.LENGTH_SHORT).show();

        }


        return rootView;
    }




}
