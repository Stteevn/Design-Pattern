public class Main {

    public static void main(String[] args) {
        Light light = new Light();
        LightOnCommand lightOnCommand = new LightOnCommand(light);
        GarageDoor garageDoor = new GarageDoor();
        GarageDoorOpenCommand garageDoorOpenCommand = new GarageDoorOpenCommand(garageDoor);
        RemoteControl remoteControl = new RemoteControl();
        remoteControl.setCommand(0, lightOnCommand);
        remoteControl.setCommand(1, garageDoorOpenCommand);
        remoteControl.buttonPressed(0);
        remoteControl.buttonPressed(1);
    }
}
