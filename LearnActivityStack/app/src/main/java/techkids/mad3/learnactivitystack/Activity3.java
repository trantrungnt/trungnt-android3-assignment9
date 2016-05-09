package techkids.mad3.learnactivitystack;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by TrungNT on 5/9/2016.
 */
public class Activity3 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layout_3);
        Button btnOpenActivity = (Button) this.findViewById(R.id.btnAcitivy3);
        btnOpenActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Activity3.this, Activity4.class);
                startActivity(i);
                finish();
            }
        });

        Button btnBackActivity2 = (Button) this.findViewById(R.id.btnBackActivity2);
        btnBackActivity2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent iBackActivity2 = new Intent(Activity3.this, Activity2.class);
                startActivity(iBackActivity2);
            }
        });
    }
}
