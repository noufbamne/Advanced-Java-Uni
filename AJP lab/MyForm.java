import java.awt.*;
import java.awt.event.*;

public class MyForm extends Frame {
    Label nameLabel, emailLabel, passwordLabel, addressLabel, phoneLabel;
    TextField nameField, emailField, passwordField, addressField, phoneField;
    Button submitButton, resetButton;
    CheckboxGroup genderGroup;
    Checkbox maleCheckbox, femaleCheckbox;
    Choice countryChoice;

    MyForm() {
        setLayout(null);

        nameLabel = new Label("Name:");
        nameLabel.setBounds(50, 50, 100, 20);
        add(nameLabel);

        nameField = new TextField(20);
        nameField.setBounds(150, 50, 200, 20);
        add(nameField);

        emailLabel = new Label("Email:");
        emailLabel.setBounds(50, 80, 100, 20);
        add(emailLabel);

        emailField = new TextField(20);
        emailField.setBounds(150, 80, 200, 20);
        add(emailField);

        passwordLabel = new Label("Password:");
        passwordLabel.setBounds(50, 110, 100, 20);
        add(passwordLabel);

        passwordField = new TextField(20);
        passwordField.setBounds(150, 110, 200, 20);
        passwordField.setEchoChar('*');
        add(passwordField);

        addressLabel = new Label("Address:");
        addressLabel.setBounds(50, 140, 100, 20);
        add(addressLabel);

        addressField = new TextField(20);
        addressField.setBounds(150, 140, 200, 20);
        add(addressField);

        phoneLabel = new Label("Phone:");
        phoneLabel.setBounds(50, 170, 100, 20);
        add(phoneLabel);

        phoneField = new TextField(20);
        phoneField.setBounds(150, 170, 200, 20);
        add(phoneField);

        Label genderLabel = new Label("Gender:");
        genderLabel.setBounds(50, 200, 100, 20);
        add(genderLabel);

        genderGroup = new CheckboxGroup();
        maleCheckbox = new Checkbox("Male", genderGroup, true);
        maleCheckbox.setBounds(150, 200, 50, 20);
        add(maleCheckbox);

        femaleCheckbox = new Checkbox("Female", genderGroup, false);
        femaleCheckbox.setBounds(200, 200, 50, 20);
        add(femaleCheckbox);

        Label countryLabel = new Label("Country:");
        countryLabel.setBounds(50, 230, 100, 20);
        add(countryLabel);

        countryChoice = new Choice();
        countryChoice.add("India");
        countryChoice.add("USA");
        countryChoice.add("UK");
        countryChoice.setBounds(150, 230, 100, 20);
        add(countryChoice);

        submitButton = new Button("Submit");
        submitButton.setBounds(150, 260, 100, 20);
        add(submitButton);

        resetButton = new Button("Reset");
        resetButton.setBounds(250, 260, 100, 20);
        add(resetButton);

        submitButton.addActionListener((java.awt.event.ActionListener) new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String name = nameField.getText();
                String email = emailField.getText();
                String password = passwordField.getText();
                String address = addressField.getText();
                String phone = phoneField.getText();
                String gender = genderGroup.getSelectedCheckbox().getLabel();
                String country = countryChoice.getSelectedItem();

                System.out.println("Name: " + name);
                System.out.println("Email: " + email);
                System.out.println("Password: " + password);
                System.out.println("Address: " + address);
                System.out.println("Phone: " + phone);
                System.out.println("Gender: " + gender);
                System.out.println("Country: " + country);
            }
        });

        resetButton.addActionListener((java.awt.event.ActionListener) new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                nameField.setText("");
                emailField.setText("");
                passwordField.setText("");
                addressField.setText("");
                phoneField.setText("");
                genderGroup.setSelectedCheckbox(maleCheckbox);
                countryChoice.select(0);
            }
        });

        setSize(500, 400);
        setVisible(true);
    }

    public static void main(String[] args) {
        MyForm form = new MyForm();
    }
}