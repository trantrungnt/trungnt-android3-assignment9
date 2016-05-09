package techkids.mad3.learnactivitystack;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by TrungNT on 5/9/2016.
 */
public class Activity4 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layout_4);

        Button btnOpenActivity = (Button) this.findViewById(R.id.btnAcitivy4);
        btnOpenActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Activity4.this, Activity5.class);
                startActivity(i);
            }
        });

        final Button btnBackActivity3 = (Button) this.findViewById(R.id.btnBackActivity3);
        btnBackActivity3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent iBack = new Intent(Activity4.this, Activity3.class);
                startActivity(iBack);
            }
        });
    }
}
