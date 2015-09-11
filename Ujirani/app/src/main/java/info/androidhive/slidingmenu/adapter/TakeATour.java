package info.androidhive.slidingmenu.adapter;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.student.ujirani.R;

/**
 * Created by Student on 8/21/2015.
 */
public class TakeATour extends android.app.Fragment {
    private LayoutInflater inflater;

    public TakeATour() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        this.inflater = inflater;

        View rootView = inflater.inflate(R.layout.take_atour_fragment, container, false);

        return rootView;
    }
}
