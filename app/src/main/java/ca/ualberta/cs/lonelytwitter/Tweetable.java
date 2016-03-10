package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

public interface Tweetable {
    // getMessage returns the tweet message.
    String getMessage();

    Date getDate();
}
