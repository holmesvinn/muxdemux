package in.nanoelectron.multiplexer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Demultiplexer extends AppCompatActivity {


    private TextView a,b,c,d;
    private EditText s0,s1,input;
    private Button result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demultiplexer);

        a = (TextView) findViewById(R.id.da);
        b = (TextView) findViewById(R.id.db);
        c = (TextView) findViewById(R.id.dc);
        d = (TextView) findViewById(R.id.dd);

        s0 = (EditText) findViewById(R.id.ds0);
        s1 = (EditText) findViewById(R.id.ds1);
        input = (EditText) findViewById(R.id.input);

        result = (Button) findViewById(R.id.demux_result);

        result.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                try{
                    String in = input.getText().toString();

                    String ss0 = s0.getText().toString();
                    int dss0 = Integer.parseInt(ss0,2);
                    String ss1 = s1.getText().toString();
                    int dss1 = Integer.parseInt(ss1,2);

                    if(dss0 == 0  && dss1 == 0){
                        a.setText(in);
                        b.setText("X");
                        c.setText("X");
                        d.setText("X");
                    }

                    else if(dss0 == 0  && dss1 == 1){
                        a.setText("X");
                        b.setText( in);
                        c.setText("X");
                        d.setText("X");

                    }

                    else if(dss0 == 1  && dss1 == 0){
                        a.setText("X");
                        b.setText("X");
                        c.setText(in);
                        d.setText("X");

                    }

                    else if(dss0 == 1  && dss1 == 1){
                        a.setText("X");
                        b.setText("X");
                        c.setText("X");
                        d.setText(in);

                    }

                }
                catch (Exception e){
                    e.printStackTrace();
                    Toast.makeText(getApplicationContext(),"Enter Binary values",Toast.LENGTH_SHORT)
                            .show();
                }

            }
        });



    }
}
