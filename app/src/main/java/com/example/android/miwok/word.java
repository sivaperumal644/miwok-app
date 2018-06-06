package com.example.android.miwok;

/**
 * Created by siva on 26/5/18.
 */

public class word
{
    /** Default translation for the word */
    private String mDefaultTranslation;

    /** Miwok translation for the word */
    private String mMiwokTranslation;

    /** linking image with the respective number*/
    private int mImageResourceId = no_image_provided;
    private static final int no_image_provided = -1;
    private int mAudioResourceId;

    /**
 +     * Create a new Word object.
 +     *
 +     * @param defaultTranslation is the word in a language that the user is already familiar with
 +     *                           (such as English)
 +     * @param miwokTranslation is the word in the Miwok language
 +     */
    public word(String defaultTranslation, String miwokTranslation, int AudioResourceId)
    {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mAudioResourceId = AudioResourceId;
    }
    public word(String defaultTranslation, String miwokTranslation, int ImageResourceId, int AudioResourceId)
    {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageResourceId = ImageResourceId;
        mAudioResourceId = AudioResourceId;
    }

    /**
 +     * Get the default translation of the word.
 +     */
    public String getDefaultTranslation()
    {
        return mDefaultTranslation;
    }

            /**
 +     * Get the Miwok translation of the word.
 +     */
            public String getMiwokTranslation()
            {
                return mMiwokTranslation;
            }

            public int getImageResourceId(){return mImageResourceId;}

            public int getAudioResourceId(){return mAudioResourceId;}

            public boolean hasImage()
            {
                return mImageResourceId != no_image_provided;
            }
}
