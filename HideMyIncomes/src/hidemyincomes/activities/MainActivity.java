package hidemyincomes.activities;

import com.example.hidemyincomes.R;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.LinearLayout;

public class MainActivity extends Activity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main_layout);
		LinearLayout l = (LinearLayout) findViewById(R.id.footer);
		l.setBackgroundColor(Color.BLACK);
	}
}
