package techkids.mad3.learnactivitystack;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by TrungNT on 5/8/2016.
 */
public class Activity2 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layout_2);
        Button btnOpenActivity = (Button) this.findViewById(R.id.btnAcitivy2);
        btnOpenActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Activity2.this, Activity3.class);
                i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(i);
            }
        });

        Button btnBackActivity = (Button) this.findViewById(R.id.btnBackMainActivity1);
        btnBackActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentBackActivity = new Intent(Activity2.this, MainActivity1.class);
                intentBackActivity.setFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);
                startActivity(intentBackActivity);
            }
        });

    }
}
