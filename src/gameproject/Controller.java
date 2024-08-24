/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gameproject;

/**
 *
 * @author Amind
 */
public class Controller {
    
    private String value1;
    private String value2;
    private String value3;
    private String value4;
    private String value5;
    private String value6;
    private String value7;
    private String value8;
    private String value9;

    void getValue(String text, int index) {
        switch (index) {
            case 1:
                value1=text;
                break;
            case 2:
                value2=text;
                break;
            case 3:
                value3=text;
                break;
            case 4:
                value4=text;
                break;
            case 5:
                value5=text;
                break;
            case 6:
                value6=text;
                break;
            case 7:
                value7=text;
                break;
            case 8:
                value8=text;
                break;
            case 9:
                value9=text;
                break;
            default:
                break;
        }
    }
    
}
