public class GarageDoor {
    private boolean doorOpened;

    public GarageDoor() {
        doorOpened = false;
    }

    public void doorOpened() {
        doorOpened = true;
        System.out.println("Garage door open");
    }
}
