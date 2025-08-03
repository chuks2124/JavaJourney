package chapter3;

public class Clock {
    private int hour;
    private int minute;
    private int second;

    public Clock(int hour, int minute, int second){
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }
    public void setHour(int hour) {
        if (hour <= 23) {
            this.hour = hour;
        }
        else this.hour = 00;
    }
    public int getHour() {
        return hour;
    }

    public void setMinute(int minute) {
        if (minute <= 59) {
            this.minute = minute;
        }
        else this.minute = 00;
    }

    public int getMinute() {
        return minute;
    }
    public void setSecond(int second) {
        if (second <= 59) {
            this.second = second;
        }
        else this.second = 00;
    }

    public int getSecond() {
        return second;
    }
}
