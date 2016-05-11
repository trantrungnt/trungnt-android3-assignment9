package techkids.mad3.learnactivitystack;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by TrungNT on 5/9/2016.
 */
public class Activity8 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layout_8);

        Button btnOpenActivity = (Button) this.findViewById(R.id.btnAcitivy8);
        btnOpenActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Activity8.this, Activity9.class);
                i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(i);
            }
        });

        Button btnBack = (Button) this.findViewById(R.id.btnBackActivity8);
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent iBack = new Intent(Activity8.this, Activity7.class);
                startActivity(iBack);
            }
        });
    }
}
