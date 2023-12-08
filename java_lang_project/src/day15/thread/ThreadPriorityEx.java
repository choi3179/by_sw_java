package day15.thread;

public class ThreadPriorityEx {
    public static void main(String[] args) {
        long id = Thread.currentThread().getId();
        String name = Thread.currentThread().getName();

        Thread.currentThread().setPriority(Thread.MAX_PRIORITY);
        Thread.currentThread().setPriority(Thread.MIN_PRIORITY);

        int priority = Thread.currentThread().getPriority();
        Thread.State state = Thread.currentThread().getState();

        System.out.println("현재 스레드 ID : " + id);
        System.out.println("현재 스레드 Name : " + name);
        System.out.println("현재 스레드 Priority : " + priority);
        System.out.println("현재 스레드 State : " + state);      // RUNNABLE : 동작 중
    }
}
