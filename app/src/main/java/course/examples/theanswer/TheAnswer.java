package course.examples.theanswer;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class TheAnswer extends Activity {

	private static final int REAL_ANSWER = 27;
	private static final int answer = 23;
	private static String TAG = "TheAnswer";
	String output;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		
		// Required call through to Activity.onCreate()
		// Restore any saved instance state
		super.onCreate(savedInstanceState);

		// Set up the application's user interface (content view)
		setContentView(R.layout.answer_layout);

		// Get a reference to a TextView in the content view
		TextView answerView = findViewById(R.id.answer_view);


		if (findAnswer()){
			output = String.valueOf(answer);
		}
		else {
			output = getString(R.string.fan_falso);
		}

		// Set desired text in answerView TextView
		answerView
				.setText(output);
	}

	private boolean findAnswer() {
		Log.d(TAG,"Entering findAnswer()");

			if (REAL_ANSWER == answer){
				Log.d(TAG,"Hemos encontrado la respuesta");
				return true;
			}
		Log.e(TAG, "ERROR ERROR ! FAN FALSO");
		return false;
	}
}
