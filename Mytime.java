class Time{
    private int hours;
    private int minutes;
    private int seconds;

    public Time(){
        this.hours = 0;
        this.minutes = 0;
        this.seconds = 0;
    }

    public Time(int hours, int minutes, int seconds){
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public Time addTime(Time t){
        Time temp = new Time();
        temp.hours = this.hours + t.hours;
        temp.minutes = this.minutes + t.minutes;
        temp.seconds = this.seconds + t.seconds;

        if(temp.seconds > 60){
            temp.minutes += 1;
            temp.seconds = temp.seconds - 60;
        }

        if(temp.minutes > 60){
            temp.hours += 1;
            temp.minutes = temp.minutes - 60;
        }
        if(temp.hours > 24){
            temp.hours = 0;
        }
        return temp;
    }

    public Time subtractTime(Time t){
        Time temp = new Time();
        temp.hours = this.hours - t.hours;
        temp.minutes = this.minutes - t.minutes;
        temp.seconds = this.seconds - t.seconds;

        if(temp.seconds > 60){
            temp.minutes += 1;
            temp.seconds = temp.seconds - 60;
        }

        if(temp.minutes > 60){
            temp.hours += 1;
            temp.minutes = temp.minutes - 60;
        }
        if(temp.hours > 24){
            temp.hours = 0;
        }
        return temp;
    }

    public void displayTime(){
        System.out.println("Time is: "+ hours + ":" + minutes + ":" + seconds);
    }



}

public class Mytime{
    public static void main(String[] args){
        Time t1 = new Time(2, 55, 13);
        Time t2 = new Time(7, 36, 7);

        System.out.println("Time 1: ");
        t1.displayTime();

        System.out.println("Time 2: ");
        t2.displayTime();


        Time t3 = t1.addTime(t2);
        System.out.println("Added time: ");
        t3.displayTime();

        Time t4 = t1.subtractTime(t2);
        System.out.println("Subtracted time: ");
        t4.displayTime();

    }
}