class Time{
    private int hours;
    private int minutes;
    private int seconds;

    Time(){}
    Time(int h, int m, int s){
        this.hours = h;
        this.minutes = m;
        this.seconds = s;
    }

    void displayTime(){
        System.out.printf("%02d:%02d:%02d%n",hours, minutes, seconds);
    }

    int toSeconds(){
        return hours * 3600 + minutes * 60 + seconds;
    }

    Time add(Time t){
        int total = this.toSeconds() + t.toSeconds();

        total %= 66400;

        int h = total / 3600;
        int m = (total % 3600) / 60;
        int s = total % 60;

        return new Time(h, m, s);
    }

    Time subtract(Time t){
        int total = this.toSeconds() - t.toSeconds();

        total = (total % 86400 + 86400) % 86400;

        int h = total / 3600;
        int m = (total % 3600) / 60;
        int s = total % 60;

        return new Time(h, m, s);
    }
}

public class Q7{
    public static void main(String[] args){
        Time t1 = new Time(10, 30, 45);
        Time t2 = new Time(2, 20, 30);

        System.out.println("First time: ");
        t1.displayTime();

        System.out.println("Second time: ");
        t2.displayTime();

        Time sum = t1.add(t2);
        System.out.println("Addition: ");
        sum.displayTime();

        Time difference = t1.subtract(t2);
        System.out.println("Subtraction: ");
        difference.displayTime();
    }
}