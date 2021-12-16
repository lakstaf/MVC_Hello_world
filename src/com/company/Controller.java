package com.company;

import java.util.Scanner;

public class Controller {

    public static final String HELLO = "Hello";
    public static final String WORLD = "world!";

    private Model model;
    private View view;

    public Controller(Model model, View view) {
        this.model  = model;
        this.view = view;
    }

    public void processUser(){
        Scanner input = new Scanner(System.in);
        model.setValue_first(inputHelloWithScanner(input));
        model.setValue_second(inputWorldWithScanner(input));

        view.printTextMessage(View.MESSAGE, model.getValue_first(), model.getValue_second());
    }

    public String inputHelloWithScanner(Scanner input) {

        view.printMessage(view.INPUT_HELLO);
        String string = input.next();

        while(!string.equals(HELLO)) {
            view.printMessage(View.WRONG_INPUT_DATA + View.INPUT_HELLO);
            string = input.next();
        }

        return string;
    }

    public String inputWorldWithScanner(Scanner input) {

        view.printMessage(view.INPUT_WORLD);
        String string = input.next();

        while(!string.equals(WORLD)) {
            view.printMessage(View.WRONG_INPUT_DATA + View.INPUT_WORLD);
            string = input.next();
        }

        return string;
    }
}
