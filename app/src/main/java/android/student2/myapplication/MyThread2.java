package android.student2.myapplication;


    public class MyThread2 implements Runnable{
        MainActivity.MyHandler handler;
        MyThread2 (MainActivity.MyHandler handler)
        {
            this.handler=handler;
        }

        @Override
        public void run() {
            for (int i = 0; i < 10 ; i++){
                handler.sendEmptyMessage(i);
                try {
                    Thread.sleep(300);
                } catch (InterruptedException e) {

                }
            }
        }
    }

