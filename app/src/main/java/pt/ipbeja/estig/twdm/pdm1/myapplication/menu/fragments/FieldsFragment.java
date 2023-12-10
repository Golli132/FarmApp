package pt.ipbeja.estig.twdm.pdm1.myapplication.menu.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import pt.ipbeja.estig.twdm.pdm1.myapplication.R;

public class FieldsFragment extends Fragment {

    public FieldsFragment() {
        // Required empty public constructor
    }
    public static FieldsFragment newInstance() {
        return new FieldsFragment();
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_fields, container, false);
    }
}