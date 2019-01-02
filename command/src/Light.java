public class Light {
    private boolean on;

    public Light() {
        on = false;
    }

    public void on() {
        on = true;
        System.out.println("Light on");
    }
}
