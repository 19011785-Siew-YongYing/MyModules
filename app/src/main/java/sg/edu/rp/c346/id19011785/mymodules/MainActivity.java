package sg.edu.rp.c346.id19011785.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView mod1, mod2, mod3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mod1 = findViewById(R.id.module1);
        mod2 = findViewById(R.id.module2);
        mod3 = findViewById(R.id.module3);

        mod1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int1 = new Intent(MainActivity.this, ModuleActivity.class);
                int1.putExtra("modules", "C322");
                startActivity(int1);
            }
        });

        mod2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int2 = new Intent(MainActivity.this, ModuleActivity.class);
                int2.putExtra("modules", "C346");
                startActivity(int2);
            }
        });

        mod3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int3 = new Intent(MainActivity.this, ModuleActivity.class);
                int3.putExtra("modules", "C382");
                startActivity(int3);
            }
        });


    }
}