package android.student2.myapplication;

import android.app.Notification;
import android.os.Message;
import android.widget.TextView;

public class MyThread1 implements Runnable{
    MainActivity.MyHandler handler; //внутренний класс
    MyThread1(MainActivity.MyHandler handler)
        {
        this.handler=handler;
        }

    @Override
    public void run() {
        for (int i = 0; i < 10 ; i++){
            //Message message= new Message();
            //message
            handler.sendEmptyMessage(i);
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {

            }
        }
    }
}
