class MyThread5 extends Thread {
    public MyThread5(String name) {
        super(name);
    }

    public void run() {
        try {
            Thread.sleep(1500);
            System.out.println(Thread.currentThread().getName() + " Sleeping.");
        } catch (InterruptedException ie) {
            System.out.println(ie);
        }
        System.out.println(Thread.currentThread().getName() + " Finished.");
    }

    public static void main(String[] args) {
        MyThread5 t1 = new MyThread5("first thread");
        MyThread5 t2 = new MyThread5("second thread");

        System.out.println(t1.getName() + " state: " + t1.getState());
        System.out.println(t2.getName() + " state: " + t2.getState());

        t1.start();
        t2.start();

        System.out.println(t1.getName() + " state: " + t1.getState());
        System.out.println(t2.getName() + " state: " + t2.getState());
    }
}