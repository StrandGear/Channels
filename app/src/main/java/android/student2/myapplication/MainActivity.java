package android.student2.myapplication;

import android.os.Handler;
import android.os.Message;
import android.support.v4.media.session.PlaybackStateCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    class MyHandler extends Handler {
        @Override
        public void handleMessage(Message msg) {
            tv.append(msg.what + " ");
        }
    }

    MyHandler handler = new MyHandler();
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv = (TextView)findViewById(R.id.text);
        MyThread1 tr1 = new MyThread1(handler);
        (new Thread(tr1)).start(); //два раза старт (объект)
        MyThread2 tr2 = new MyThread2(handler);
        (new Thread(tr2)).start();
    }
}

