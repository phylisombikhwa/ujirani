import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.student.ujirani.R;


/**
 * Created by Student on 8/21/2015.
 */

public class Events extends Fragment {

    private LayoutInflater inflater;

    public Events() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        this.inflater = inflater;

        View rootView = inflater.inflate(R.layout.eventsfragment, container, false);

        return rootView;
    }
}