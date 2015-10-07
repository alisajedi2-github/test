package ca.ualberta.cs.lonelytwitter;

import android.test.ActivityInstrumentationTestCase2;


/**
 * Created by romansky on 9/30/15.
 */
public class TweetListTest extends ActivityInstrumentationTestCase2 {
    public TweetListTest() {
        super(LonelyTwitterActivity.class);
    }

    public void testDeleteTweet() {
        TweetList tweetList = new TweetList();
        Tweet tweet = new NormalTweet("hihihihi");
        tweetList.add(tweet);
        tweetList.delete(tweet);
        assertFalse(tweetList.hasTweet(tweet));
    }

    public void testHasTweet() {
        TweetList tweetList = new TweetList();
        Tweet tweet = new NormalTweet("hihihihi");
        assertFalse(tweetList.hasTweet(tweet));
        tweetList.add(tweet);
        assertTrue(tweetList.hasTweet(tweet));

    }

    public void testAddTweet() {
        TweetList tweetList = new TweetList();
        Tweet tweet = new NormalTweet("hihihihi");
        tweetList.add(tweet);
        assertTrue(tweetList.hasTweet(tweet));
    }

    public void testTweetCount() {

    }

    public void testGetTweet() {
        TweetList tweetList = new TweetList();
        Tweet tweet = new NormalTweet("hihihihi");
        tweetList.add(tweet);
        Tweet returnedTweet = tweetList.getTweet(0);
        assertTrue((tweet.date.equals(returnedTweet.date)) &&
                (tweet.getText().equals(returnedTweet.getText())));
    }

    public void testGetTweetType() {

    }
}