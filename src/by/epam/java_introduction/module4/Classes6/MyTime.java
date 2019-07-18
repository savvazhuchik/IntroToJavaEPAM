package by.epam.java_introduction.module4.Classes6;

//Составьте описание класса для представления времени. Предусмотрте возможности установки времени и
//изменения его отдельных полей (час, минута, секунда) с проверкой допустимости вводимых значений. В случае
//недопустимых значений полей поле устанавливается в значение 0. Создать методы изменения времени на
//заданное количество часов, минут и секунд. (!) сделал увеличение

public class MyTime {
    private int hour;
    private int minute;
    private int second;

    public MyTime() {
        this.hour = 0;
        this.minute = 0;
        this.second = 0;
    }

    public MyTime(int hour, int minute, int second) {
        if((hour<0)||(hour>23)) {
            this.hour = 0;
        } else {
            this.hour = hour;
        }
        if((minute<0)||(minute>59)) {
            this.minute = 0;
        } else {
            this.minute = minute;
        }
        if((second<0)||(second>23)) {
            this.second = 0;
        } else {
            this.second = second;
        }
    }

    public void changeHour(int hour) {
        if((hour<0)||(hour>23)) {
            this.hour = 0;
        } else {
            this.hour = hour;
        }
    }

    public void changeMinute(int minute) {
        if((minute<0)||(minute>59)) {
            this.minute = 0;
        } else {
            this.minute = minute;
        }
    }

    public void changeSecond(int second) {
        if((second<0)||(second>23)) {
            this.second = 0;
        } else {
            this.second = second;
        }
    }

    public void plusHour(int hour) {
        this.hour += hour;
        if(this.hour>23) {
            int n = this.hour/24;
            this.hour = this.hour - n* 24;
        }
    }

    public void plusMinute(int minute) {
        this.minute += minute;
        if(this.minute>59) {
            int n = this.minute / 60;
            this.minute = this.minute - n*60;
            this.hour += n;
        }
        if(this.hour>23) {
            this.hour = this.hour - (this.hour / 24) * 24;
        }
    }

    public void plusSecond(int second) {
        this.second += second;
        if(this.second > 59) {
            int n = this.second / 60;
            this.second = this.second - n*60;
            this.minute += n;
        }
        if(this.minute>59) {
            int n = this.minute / 60;
            this.minute = this.minute - n*60;
            this.hour += n;
        }
        if(this.hour>23) {
            this.hour = this.hour - (this.hour / 24) * 24;
        }
    }

    public void toScreen() {
        System.out.println(this.hour+":"+this.minute+":"+this.second);
    }
}
