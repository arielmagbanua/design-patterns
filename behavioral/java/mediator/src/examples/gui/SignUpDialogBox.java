package examples.gui;

public class SignUpDialogBox {
    private final TextBox usernameTextBox = new TextBox();
    private final TextBox passwordTextBox = new TextBox();
    private final CheckBox termsCheckBox = new CheckBox();
    private final Button signupButton = new Button();

    public SignUpDialogBox() {
        usernameTextBox.addEventHandler(this::onSignupChanges);
        passwordTextBox.addEventHandler(this::onSignupChanges);
        termsCheckBox.addEventHandler(this::onSignupChanges);
    }

    public void setUsername(String username) {
        usernameTextBox.setContent(username);
    }

    public void setPassword(String password) {
        passwordTextBox.setContent(password);
    }

    public void toggleTerms() {
        boolean state = termsCheckBox.isChecked();
        termsCheckBox.setChecked(!state);
    }

    public void onSignupChanges() {
        // only enable sign up button if all boxes are filled out
        // and the if user agreed to the terms
        String username = usernameTextBox.getContent();
        String password = passwordTextBox.getContent();
        boolean agreedToTerms = termsCheckBox.isChecked();

        username = username == null ? "" : username;
        password = password == null ? "" : password;

        signupButton.setEnabled(!username.isEmpty() && !password.isEmpty() && agreedToTerms);
        System.out.println(signupButton);
    }
}
