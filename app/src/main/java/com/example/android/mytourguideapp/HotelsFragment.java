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
public class HotelsFragment extends Fragment {


    public HotelsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.activity_all, container, false);

        // TODO: Create an ArrayList to contain the information.
        ArrayList<MyInfo> informationDetails = new ArrayList<MyInfo>();

        // Add information to ArrayList.
        informationDetails.add(new MyInfo("Kempinski Hotel", "Luxury 5 Star Hotel",
                "Ministries, Gamel Abdul Nasser Avenue PMB 66, Accra, Ghana", "+233242436000",
                R.drawable.kempinski));
        informationDetails.add(new MyInfo("Mövenpick Ambassador Hotel", "Luxury 5 Star Hotel",
                "Independence Ave, Accra, Ghana", "+233302611000", R.drawable.mvpick));

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
