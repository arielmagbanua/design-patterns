package examples.gui;

public class Button extends UIControl {
    private boolean isEnabled;

    public boolean isEnabled() {
        return isEnabled;
    }

    public void setEnabled(boolean enabled) {
        isEnabled = enabled;
        notifyEventHandlers();
    }

    @Override
    public String toString() {
        return "Button{" +
                "isEnabled=" + isEnabled +
                '}';
    }
}
