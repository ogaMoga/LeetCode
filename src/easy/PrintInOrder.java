package easy;

class Foo {
    private final Object second = new Object();
    private final Object third = new Object();
    private volatile boolean firstDone = false;
    private volatile boolean secondDone = false;

    public Foo() {  }

    public void first(Runnable printFirst) throws InterruptedException {
        synchronized (second) {
            printFirst.run();
            firstDone = true;
            second.notify();
        }
    }

    public void second(Runnable printSecond) throws InterruptedException {
        synchronized (second) {
            while (!firstDone) {
                second.wait();
            }
            printSecond.run();
            secondDone = true;
            synchronized (third) {
                third.notify();
            }
        }
    }

    public void third(Runnable printThird) throws InterruptedException {
        synchronized (third) {
            while (!secondDone) {
                third.wait();
            }
            printThird.run();
        }
    }
}
