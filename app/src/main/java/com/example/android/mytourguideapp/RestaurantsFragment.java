package com.example.android.mytourguideapp;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class RestaurantsFragment extends Fragment {


    public RestaurantsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.activity_all, container, false);

        // TODO: Create an ArrayList to contain the information.
        ArrayList<MyInfo> informationDetails = new ArrayList<>();

        // Add informationn to ArrayList.
        informationDetails.add(new MyInfo("KFC Fast Food", "Bar and Restaurant",
                "Near Melcom Plus North Industrial Area, Accra, Ghana", "+233302945547",
                R.drawable.kfc));
        informationDetails.add(new MyInfo("Papaye Fast Food", "Bar and Restaurant",
                "High Street, Accra, Ghana", "+233265306116", R.drawable.papaye));

        // Create an {@link InfoAdapter}, whose data source is a list of {@link MyInfo}. The
        // adapter knows how to create list items for each item in the list.
        InfoAdapter adapter = new InfoAdapter(getContext(), informationDetails);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called allxml, which is declared in the
        // activity_all.xml layout file.
        ListView listVIew = (ListView) rootView.findViewById(R.id.allxml);

        // Make the {@link ListView} use the {@link InfoAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link MyInfo} in the list.
        listVIew.setAdapter(adapter);

        return rootView;
    }

}
