package term2.fe.rupp.week1;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.Interpolator;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button btn_clickMe;
    private TextView txt_counter;

    private Integer counter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        buttonClickMe();
    }

    private void initView(){
        btn_clickMe = (Button) this.findViewById(R.id.btn_ClickMe);
        txt_counter = (TextView) this.findViewById(R.id.txt_counter);
        counter = 0;
    }

    private void buttonClickMe(){
        btn_clickMe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn_clickMe.setBackgroundColor(Color.BLUE);
                counter++;
                txt_counter.setText(counter.toString());
            }
        });
        btn_clickMe.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                btn_clickMe.setBackgroundColor(Color.GREEN);
                return false;
            }
        });

    }


}
