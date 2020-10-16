package app.audio.l.pablo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import app.audio.l.pablo.fragments.PreferenciasFragment;

/**
 * @author  choco: Pablo Secundino Aguilar
 */

public class PreferenciasActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportFragmentManager().beginTransaction().replace(android.R.id.
                content, new PreferenciasFragment()).commit();
    }
}