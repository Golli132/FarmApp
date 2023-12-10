package pt.ipbeja.estig.twdm.pdm1.myapplication.menu.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import pt.ipbeja.estig.twdm.pdm1.myapplication.R;

public class ExtrasFragment extends Fragment {
    public ExtrasFragment() {
        // Required empty public constructor
    }

    // TODO: Rename and change types and number of parameters
    public static ExtrasFragment newInstance() {
        return new ExtrasFragment();
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_extras, container, false);
    }
}