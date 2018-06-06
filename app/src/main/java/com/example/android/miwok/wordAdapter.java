package com.example.android.miwok;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by siva on 27/5/18.
 */

public class wordAdapter extends ArrayAdapter<word>
{
    private int mColorResourceId;

    public wordAdapter(Activity context, ArrayList<word> words, int colorResourceId)
    {
        super(context, 0, words);
        mColorResourceId = colorResourceId;
    }
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent)
    {
        View listItemView = convertView;

        if(listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        word currentWord = getItem(position);

        ImageView miwokImageView = (ImageView) listItemView.findViewById(R.id.image);
        if(currentWord.hasImage())
        {
            miwokImageView.setImageResource(currentWord.getImageResourceId());
            miwokImageView.setVisibility(View.VISIBLE);
        }
        else
        {
            miwokImageView.setVisibility(View.GONE);
        }

        View textContainer = listItemView.findViewById(R.id.Text_container);
        int color = ContextCompat.getColor(getContext(), mColorResourceId);
        textContainer.setBackgroundColor(color);

        TextView miwokTextView = (TextView) listItemView.findViewById(R.id.miwok_text_view);
        miwokTextView.setText(currentWord.getMiwokTranslation());

        TextView defaultTextview = (TextView) listItemView.findViewById(R.id.default_text_view);
        defaultTextview.setText(currentWord.getDefaultTranslation());

        return listItemView;
    }
}
