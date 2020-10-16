package app.audio.l.pablo.fragments;

import android.os.Bundle;
import android.support.v7.preference.PreferenceFragmentCompat;

import app.audio.l.R;

public class PreferenciasFragment extends PreferenceFragmentCompat {
    @Override
    public void onCreatePreferences(Bundle bundle, String s) {
        addPreferencesFromResource(R.xml.preferences);
    }
}
