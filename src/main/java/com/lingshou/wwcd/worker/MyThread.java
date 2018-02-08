package com.lingshou.wwcd.worker;

public class MyThread extends FatherThread{
    //todo 实现你的线程, 做完一切事情后, call notifyFinish();



    private void notifyFinish(){
        countDownLatch.countDown();
    }
}
