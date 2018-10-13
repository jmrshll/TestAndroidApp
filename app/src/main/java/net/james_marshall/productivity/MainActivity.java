package net.james_marshall.productivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button btnGoodbye;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnGoodbye = findViewById(R.id.btnGoodbye);
    }

    public void OnClick(View v){
        Intent intent = new Intent(this, GoodbyeActivity.class);
        startActivity(intent);
    }
}
