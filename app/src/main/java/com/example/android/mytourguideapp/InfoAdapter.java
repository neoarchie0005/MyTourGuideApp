package com.example.android.mytourguideapp;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;


/**
 * Created by ROBO on 10/15/2017.
 */
public class InfoAdapter extends ArrayAdapter<MyInfo> {

    public InfoAdapter(Context context, ArrayList<MyInfo> information) {
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for multiple TextViews and an ImageView, the adapter is
        // not going to use this second argument, so it can be any value. Here, we used 0.
        super(context, 0, information);
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the {@link MyInfo} object located at this position in the list
        MyInfo currentMyInfo = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID version_name
        TextView nameTextView = (TextView) listItemView.findViewById(R.id.name_text_view);
        // Get the version name from the current MyInfo object and
        // set this text on the name TextView
        nameTextView.setText(currentMyInfo.getName());

        // Find the TextView in the list_item.xml layout with the ID version_description
        TextView descriptionTextView = (TextView) listItemView.findViewById(R.id.description_text_view);
        // Get the version number from the current MyInfo object and
        // set this text on the description TextView
        descriptionTextView.setText(currentMyInfo.getDescription());

        // Find the TextView in the list_item.xml layout with the ID version_address
        TextView addressTextView = (TextView) listItemView.findViewById(R.id.address_text_view);
        // Get the version name from the current MyInfo object and
        // set this text on the address TextView
        addressTextView.setText(currentMyInfo.getAddress());

        // Find the TextView in the list_item.xml layout with the ID version_phone
        TextView phoneTextView = (TextView) listItemView.findViewById(R.id.phone_text_view);
        // Get the version number from the current MyInfo object and
        // set this text on the phone TextView
        phoneTextView.setText(currentMyInfo.getPhone());

        // Find the ImageView in the list_item.xml layout with the ID "item_photo_image".
        ImageView photoView = (ImageView) listItemView.findViewById(R.id.item_photo_image);

        if (currentMyInfo.hasImage()) {
            // Get the image resource ID from the current MyInfo object and set the image to photoView
            photoView.setImageResource(currentMyInfo.getImageResourceId());

            //Make sure the view is visible.
            photoView.setVisibility(View.VISIBLE);

        } else {
            //Otherwise hide the image (set visibility to GONE).
            photoView.setVisibility(View.GONE);
        }

        // Return the whole list item layout (containing 4 TextViews and an ImageView)
        // so that it can be shown in the ListView
        return listItemView;
    }
}