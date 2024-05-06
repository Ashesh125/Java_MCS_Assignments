package assignment_1;

public class Time{
    private int hour;
    private int minute;
    private int second;

    Time(){
        setTime(System.currentTimeMillis());
    }

    public void setTime(long t){
        this.second = (int) ((t / 1000) % 60);
        this.minute = (int) ((t / 60) % 60);
        this.hour = (int) ((t / 60) % 24);
    }

    public int getHour() {
        return this.hour;
    }

    public int getMinute() {
        return this.minute;
    }

    public int getSecond() {
        return this.second;
    }
}