package pt.ipbeja.estig.twdm.pdm1.myapplication.menu.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import pt.ipbeja.estig.twdm.pdm1.myapplication.R;

public class BackpackFragment extends Fragment {
    public static BackpackFragment newInstance() {
        return new BackpackFragment();
    }

    public BackpackFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_backpack, container, false);
    }
}