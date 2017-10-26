package es.vcarmen.fragmento10;

import android.support.annotation.NonNull;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Created by matinal on 26/10/17.
 */

public class Contenido {


    public static ArrayList<Lista_entrada> ENT_ENTRADA = new ArrayList<Lista_entrada>();

    public static Map<String, Lista_entrada> ENT_ENTRADA_HASHMAP = new HashMap<String, Lista_entrada>();

    static {
        aniadirEntrada(new Lista_entrada("0", R.drawable.boticelli, "Boticelli", "Pintor Italiano como Mario"));
        aniadirEntrada(new Lista_entrada("1", R.drawable.caravaggio, "Caravaggio", "Jugador de fútbol Italiano"));
        aniadirEntrada(new Lista_entrada("2", R.drawable.leonardo, "Leonardo", "Tortuga ninja antifaz naranja"));
        aniadirEntrada(new Lista_entrada("3", R.drawable.miguelangel, "Miguel Angel", "Tortuga ninja antifaz roja "));
        aniadirEntrada(new Lista_entrada("4", R.drawable.rafael, "Rafael", "Ángel Rafael"));
        aniadirEntrada(new Lista_entrada("5", R.drawable.rembrant, "Rembrant", "Pintor francés muy bonico"));
        aniadirEntrada(new Lista_entrada("6", R.drawable.renoir, "RENOIR", "Pintor francés más bonico que Rembrant "));
        aniadirEntrada(new Lista_entrada("7", R.drawable.velazquez, "RENOIR", "Pintor francés más bonico que Renoir y mucho más que Rembrant" ));
    }


    public static class Lista_entrada{

        public String id;
        public int idImagen;
        public String textoEncima;
        public String textDebajo;

        public Lista_entrada(String id, int idImagen, String textoEncima, String textDebajo) {
            this.id = id;
            this.idImagen = idImagen;
            this.textoEncima = textoEncima;
            this.textDebajo = textDebajo;
        }

    }

    private static void aniadirEntrada(Lista_entrada entrada){
        ENT_ENTRADA.add(entrada);
        ENT_ENTRADA_HASHMAP.put(entrada.id,entrada);
    }
}
