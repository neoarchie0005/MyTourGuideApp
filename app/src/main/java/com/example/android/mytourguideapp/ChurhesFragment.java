package com.example.android.mytourguideapp;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class ChurhesFragment extends Fragment {


    public ChurhesFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.activity_all, container, false);

        // TODO: Create an ArrayList to contain the information.
        ArrayList<MyInfo> informationDetails = new ArrayList<MyInfo>();

        // Add information to ArrayList.
        informationDetails.add(new MyInfo("Christ Embassy Accra Ghana",
                "LoveWorld Arena Accra", "Gulf St, Accra, Ghana", "+233244722741", R.drawable.celaa));
        informationDetails.add(new MyInfo("Light House Chapel",
                "Quodesh", "Kotei Robertson St, Accra, Ghana", "+233243664701",
                R.drawable.lighthouse));


        // Create an {@link InfoAdapter}, whose data source is a list of {@link MyInfo}. The
        // adapter knows how to create list items for each item in the list.
        InfoAdapter adapter = new InfoAdapter(getActivity(), informationDetails);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called allxml, which is declared in the
        // activity_all.xml layout file.
        ListView listView = (ListView) rootView.findViewById(R.id.allxml);

        // Make the {@link ListView} use the {@link InfoAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link MyInfo} in the list.
        listView.setAdapter(adapter);

        return rootView;


    }

}