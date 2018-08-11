package com.example.android.miwok;

import android.media.Image;

/**
 * Created by clarissajarem on 8/7/18.
 */

public class Word {
    /**
     * CONSTANT value that represents when no images is provided to view
     */
    private static final int NO_IMAGE_PROVIDED = -1;
    //default translation for the word
    private String mDefaultTranslation;
    //miwok translation for the word
    private String mMiwokTranslation;
    //image resource id for word
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    /**
     * @param defaultTranslation is the word the user natively speaks
     * @param miwokTranslation is the word in the Miwok language
     */
    public Word(String defaultTranslation, String miwokTranslation){
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
    }
    /**
     * @param defaultTranslation is the word the user natively speaks
     * @param miwokTranslation is the word in the Miwok language
     * @param imageResourceId finds the image id
     */
    public Word(String defaultTranslation, String miwokTranslation, int imageResourceId){
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageResourceId = imageResourceId;
    }

    /** get the default translation of the word
     *
     */
    public String getDefaultTranslation(){
        return mDefaultTranslation;
    }
    /**
     * get miwok translation of word
     */
    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }
    /**
    get image resource id
     */
    public int getImageResourceId(){
        return mImageResourceId;
    }
    /**
     * Returns whether or not there is an image for this word.
     */
    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }
}
