package hiding;

public class Birthday {
    public static void main(String[] args) {
        BirthdayTest birth = new BirthdayTest();
        birth.setMonth(2);
        birth.setDay(30);
        birth.setYear(202);
    }
}

class BirthdayTest {
    private int day;
    private int month;
    private int year;

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        if (month == 2) {
            if (day < 1 || day > 28) {
                System.out.println("error");
                return;
            } else {
                this.day = day;
            }
        }
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
