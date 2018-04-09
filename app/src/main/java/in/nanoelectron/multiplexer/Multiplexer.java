package in.nanoelectron.multiplexer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Multiplexer extends AppCompatActivity {
    private Button result;
    private EditText a,b,c,d,s0,s1;
    private TextView res;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_multiplexer);

        a = (EditText) findViewById(R.id.editText4);
        b = (EditText) findViewById(R.id.editText5);
        c = (EditText) findViewById(R.id.editText6);
        d = (EditText) findViewById(R.id.editText);
        s0 = (EditText) findViewById(R.id.editText7);
        s1 = (EditText) findViewById(R.id.ds1);
        res = (TextView) findViewById(R.id.editText10);

        result = (Button) findViewById(R.id.result);

        result.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try{


                    String sa =  a.getText().toString();
                    String sb =  b.getText().toString();
                    String sc =  c.getText().toString();
                    String sd =  d.getText().toString();
                    String ss0 =  s0.getText().toString();
                    int is0 = Integer.parseInt(ss0,2);
                    String ss1 =  s1.getText().toString();
                    int is1 = Integer.parseInt(ss1,2);


                    if(is0 == 0 && is1 == 0){

                        res.setText(sa);

                    }
                    else if (is0 == 0 && is1 == 1){

                        res.setText(sb);
                    }

                    else if (is0 == 1 && is1 == 0){

                        res.setText(sc);
                    }

                    else if (is0 == 1 && is1 == 1){

                        res.setText(sd);
                    }


                }
                catch(Exception e){
                    e.printStackTrace();
                    Toast.makeText(getBaseContext(),"Enter binary values",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
