package techkids.mad3.learnactivitystack;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by TrungNT on 5/9/2016.
 */
public class Activity5 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layout_5);

        Button btnOpenActivity = (Button) this.findViewById(R.id.btnAcitivy5);
        btnOpenActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Activity5.this, Activity6.class);
                startActivity(i);
            }
        });

        Button btnBackActivity4 = (Button) this.findViewById(R.id.btnBackActivity4);
        btnBackActivity4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent iBack = new Intent(Activity5.this, Activity4.class);
                startActivity(iBack);
            }
        });
    }
}
