package ru.inno.course.lesson5.homework;

public class Card {

    private String number;

    private String pinCode;

    public Card(String number, String pinCode) {
        this.number = number;
        this.pinCode = pinCode;
    }

    public String getNumber(){
        return "**** **** **** " + this.number.substring(this.number.length() - 4);
    }

    public String getNumber(String pinCode){
        if (pinCode.equals(this.pinCode))
        {
            return this.number;
        }
        else {
            return "Пинкод не подходит";
        }
    }
}
