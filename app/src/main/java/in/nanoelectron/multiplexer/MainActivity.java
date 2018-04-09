package in.nanoelectron.multiplexer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button multiplexer, demultiplexer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        multiplexer = (Button) findViewById(R.id.multiplexer);
        demultiplexer = (Button) findViewById(R.id.demultiplexer);
        multiplexer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent  = new Intent(getApplicationContext(),Multiplexer.class);
                startActivity(intent);
            }
        });


        demultiplexer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent  = new Intent(getApplicationContext(),Demultiplexer.class);
                startActivity(intent);

            }
        });
    }
}
