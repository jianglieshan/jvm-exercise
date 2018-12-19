package dev.jz;

public class RunnableExample {
    public static void main(String[] args) {
        Thread myThread = new Thread(){

            @Override
            public void run() {
                super.run();
            }
        };
        myThread.start();


    }
}
