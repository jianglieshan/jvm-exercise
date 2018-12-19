package dev.jz;

import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

public class FutureExample {
    public static void main(String[] args) {
        FutureTask<?> task = new FutureTask<>(FutureExample::test);
//        ((FutureTask<?>) task).run();

        new Thread(task);

    }

    public static Object test() {
        return null;
    }
}
