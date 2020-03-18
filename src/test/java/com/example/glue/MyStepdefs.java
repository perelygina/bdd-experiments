package com.example.glue;

import io.cucumber.java.ru.Когда;
import io.cucumber.java.ru.Пусть;
import io.cucumber.java.ru.Тогда;

public class MyStepdefs {
    @Пусть("пользователь открывает приложение МТС ТВ")
    public void пользовательОткрываетПриложениеМТСТВ() {
        System.out.println("пользователь открывает приложение МТС ТВ");
    }

    @Когда("пользователь переходит в раздел ТВ")
    public void пользовательПереходитВРазделТВ() {
        System.out.println("пользователь переходит в раздел ТВ");
    }

    @Тогда("пользователь выбирает Первый канал")
    public void пользовательВыбираетПервыйКанал() {
        System.out.println("пользователь выбирает Первый канал");
    }

    @Тогда("пользователь нажимает кнопку Play")
    public void пользовательНажимаетКнопкуPlay() {
        System.out.println("пользователь нажимает кнопку Play");
    }

    @Тогда("пользователь выбирает СТС")
    public void пользовательВыбираетСТС() {
        System.out.println("пользователь выбирает СТС");
    }
}
