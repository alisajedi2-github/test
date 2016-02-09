package ca.ualberta.cs.lonelytwitter;

import android.content.Intent;
import android.test.ActivityInstrumentationTestCase2;
import android.widget.TextView;

/**
 * Created by sajediba on 2/8/16.
 */
public class IntentReaderActivityTest extends ActivityInstrumentationTestCase2{

    public IntentReaderActivityTest() {
        super(IntentReaderActivity.class);
    }

    //
    //
    public void testSendText(){
        Intent intent = new Intent();
        intent.putExtra(IntentReaderActivity.TEXT_TO_TRANSFORM_KEY, "testing text 1");

        setActivityIntent(intent);
        IntentReaderActivity ira = (IntentReaderActivity) getActivity();
        assertEquals("IntentReaderActivity should get the text from intent", "testing text 1", ira.getText());
    }

    public void testDisplayText(){
        Intent intent = new Intent();
        intent.putExtra(IntentReaderActivity.TEXT_TO_TRANSFORM_KEY, "testing text 2");

        setActivityIntent(intent);
        IntentReaderActivity ira = (IntentReaderActivity) getActivity();

        TextView textView = (TextView) ira.findViewById(R.id.intentText);
        assertEquals("Text should be displayed", "testing text 2", textView.getText().toString());
    }

    public void testDoubleText(){
        Intent intent = new Intent();
        intent.putExtra(IntentReaderActivity.TEXT_TO_TRANSFORM_KEY, "testing text 3");
        intent.putExtra(IntentReaderActivity.MODE_OF_TRANSFORM_KEY, IntentReaderActivity.DOUBLE);

        setActivityIntent(intent);
        IntentReaderActivity ira = (IntentReaderActivity) getActivity();
        assertEquals("Text should be repeated twice", "testing text 3testing text 3", ira.getText());
    }

    //
    //

    //TODO: Add your code here ...
//-------------------------------------------------------------------------------

//-------------------------------------------------------------------------------
}
