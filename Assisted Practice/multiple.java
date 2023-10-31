// Interface 1
interface run {
    void run();
}

// Interface 2
interface sleep {
    void sleep();
}


class Boy implements run, sleep {
    public void run() {
        System.out.println("Boy is running");
    }

    public void sleep() {
        System.out.println("Boy is sleeping");
    }
}

public class Main {
    public static void main(String[] args) {
        Boy obj = new Boy();
        obj.run();
        obj.sleep();
    }
}
