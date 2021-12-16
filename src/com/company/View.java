package com.company;

public class View {
    public static final String INPUT_HELLO = "Text the \"Hello\"";
    public static final String INPUT_WORLD = "Text the \"world!\"";
    public static final String WRONG_INPUT_DATA = "Wrong input! Repeat please! ";
    public static final String MESSAGE = "You have inputed = ";

    public void printMessage(String message){
        System.out.println(message);
    }

    public void printTextMessage(String message, String value_first, String value_second){
        System.out.println(MESSAGE +" "+ value_first + " " + value_second);
    }
}
