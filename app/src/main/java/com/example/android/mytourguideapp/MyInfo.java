package com.example.android.mytourguideapp;
/**
 * Created by ROBO on 10/15/2017.
 */

public class MyInfo {

    /**
     * Various variables (information) to be used to populate the list item.
     */
    private String mName;
    private String mDescription;
    private String mAddress;
    private String mPhone;
    private int mImageResourceId = NO_IMAGE_PROVIDED;
    private static final int NO_IMAGE_PROVIDED = -1;

    /**
     * First public constructor for MyInfo.java.
     * This has the name, description, address, phone.
     */
    public MyInfo(String name, String description, String address, String phone) {
        mName = name;
        mDescription = description;
        mAddress = address;
        mPhone = phone;
    }

    /**
     * Second public constructor for MyInfo.java.
     * This has the name, description, address, phone and also imageResource.
     */
    public MyInfo(String name, String description, String address, String phone, int imageResourceId) {
        mName = name;
        mDescription = description;
        mAddress = address;
        mPhone = phone;
        mImageResourceId = imageResourceId;
    }


    /**
     * Get the name.
     */
    public String getName() {
        return mName;
    }

    /**
     * Get the description.
     */
    public String getDescription() {
        return mDescription;
    }

    /**
     * Get the address.
     */
    public String getAddress() {
        return mAddress;
    }

    /**
     * Get the description.
     */
    public String getPhone() {
        return mPhone;
    }

    /**
     * Get the ImageResourceId
     */
    public int getImageResourceId() {
        return mImageResourceId;
    }

    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }

}