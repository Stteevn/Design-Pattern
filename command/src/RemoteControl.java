public class RemoteControl {

    Command[] slots;

    public RemoteControl() {
        slots = new Command[5];
    }

    public void setCommand(int slot, Command command) {
        slots[slot] = command;
    }

    public void buttonPressed(int slot) {
        slots[slot].execute();
    }
}
