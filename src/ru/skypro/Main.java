package ru.skypro;

import java.util.Locale;

public class Main {

    public static void main(String[] args) {
//	  задача 1
        String firstName = "Семён" + " ";
        String middleName = "Семёнович" + " ";
        String lastName = "Иванов" + " ";
        String fullName = lastName + firstName + middleName;
        System.out.println("ФИО сотрудника - " + fullName);

//    задача 2
        String capLett = fullName.toUpperCase(Locale.ROOT);
        System.out.println("Данные ФИО сотрудника для заполнения отчета - " + capLett);

//    задача 3
        String perCom = fullName.replace(' ', ';');
        System.out.println("Данные ФИО сотрудника для административного отдела - " + perCom);

//    задача 4
        String swap = fullName.replace("ё", "е");
        System.out.println("Данные ФИО сотрудника - " + swap);
    }
}
