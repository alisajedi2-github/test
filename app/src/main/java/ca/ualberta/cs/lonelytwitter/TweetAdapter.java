package ca.ualberta.cs.lonelytwitter;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * NEW!
 * Using the example from https://github.com/codepath/android_guides/wiki/Using-an-ArrayAdapter-with-ListView
 */
public class TweetAdapter extends ArrayAdapter<Tweet> {
    public TweetAdapter(Context context, ArrayList<Tweet> users) {
        super(context, 0, users);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Get the data item for this position
        Tweet tweet = getItem(position);
        String message = tweet.getMessage();
        String dateString = tweet.getDate().toString();
        Bitmap thumbnail = tweet.getThumbnail();

        // Check if an existing view is being reused, otherwise inflate the view
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.tweet, parent, false);
        }

        ImageView tweetImage = (ImageView) convertView.findViewById(R.id.pictureButton);
        TextView tweetText = (TextView) convertView.findViewById(R.id.tweetText);
        TextView tweetDate = (TextView) convertView.findViewById(R.id.tweetDate);

        // Populate the data into the template view using the data object

        tweetText.setText(message);
        tweetDate.setText(dateString);
//        if(thumbnail != null) {
            // Only add it if it's null.
            tweetImage.setImageBitmap(thumbnail);
//        }

        // Return the completed view to render on screen
        return convertView;
    }
}
