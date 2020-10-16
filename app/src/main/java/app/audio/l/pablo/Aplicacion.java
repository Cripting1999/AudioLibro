package app.audio.l.pablo;

import android.app.Application;
import android.content.SharedPreferences;

import java.util.Vector;

/**
 * @author  choco: Pablo Secundino Aguilar
 */

public class Aplicacion extends Application {
    private Vector<Libro> vectorLibros;
    private AdaptadorLibrosFiltro adaptador;
    private Object application;

    @Override
    public void onCreate() {
        super.onCreate();
        vectorLibros = Libro.ejemploLibros();
        adaptador = new AdaptadorLibrosFiltro(this, vectorLibros);
        SharedPreferences pref = getSharedPreferences("pref", MODE_PRIVATE);
    }

    public AdaptadorLibrosFiltro getAdaptador() {
        return adaptador;
    }

    public Vector<Libro> getVectorLibros() {
        return vectorLibros;
    }

    public Object getApplication() {
        return application;
    }
}
