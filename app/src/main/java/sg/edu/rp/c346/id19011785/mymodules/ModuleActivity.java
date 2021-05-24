package sg.edu.rp.c346.id19011785.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ModuleActivity extends AppCompatActivity {

    TextView moduleInfo;
    Button backBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_module);

        Intent intReceived = getIntent();
        String modSelected = intReceived.getStringExtra("modules");

        moduleInfo = findViewById(R.id.infoMod);
        backBtn = findViewById(R.id.btnBack);

        if (modSelected.equalsIgnoreCase("C322")){
            moduleInfo.setText("Module Code: C322 \n\nModule Name: Data Centre and Cloud Mgmt \n\nAcademic Year: 2021 \n\n" +
                    "Semester: 1 \n\nModule Credit: 4 \n\nVenue: E61G");
        }
        else if (modSelected.equalsIgnoreCase("C346")){
            moduleInfo.setText("Module Code: C346 \n\nModule Name: Mobile App Development \n\nAcademic Year: 2021 \n\n" +
                    "Semester: 1 \n\nModule Credit: 4 \n\nVenue: E62E");
        }
        else{
            moduleInfo.setText("Module Code: C382 \n\nModule Name: IT Service Delivery \n\nAcademic Year: 2021 \n\n" +
                    "Semester: 1 \n\nModule Credit: 4 \n\nVenue: E62G");
        }

        backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent back = new Intent(ModuleActivity.this, MainActivity.class);
                startActivity(back);
            }
        });

    }
}