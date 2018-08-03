//user gives an input and a function returns the number of days until there next birthday

//way one
    //easy way with calendar interface and methods
        //case 1 Bday hasn't happened yet.
        //case 2 Bday has happened

    //make a main
    //make a test user data to pass to the function
    //use object to call function and compare the output by printing

    //make a function that takes in a string (##-##-####) and returns an int that is number of days until the next Bday
        //make an output ""
        //if the string is empty or null return output with error message
        //else
            //replace -, ""






//way two
    //brute force approach

//make a function that takes in a string (##-##-####) and returns an int that is number of days until the next Bday
    //make an output ""
    //if the string is empty or null return output with error message
    //else
        //replace -, ""
        //mon=sub(0,2).toInt
        //day=sub(2,4).toInt
        //year=sub(4).toInt


import java.util.Calendar;
import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class BirthdayCal {

    public int DaysUntil(String bDay){
        Calendar c = Calendar.getInstance();
        int output =0;
        if(bDay.length()<10){
            System.out.println("Sorry you have not entered a valid birthday.   ----->  (##-##-####)");
            return -1;
        }else{
            bDay=bDay.replace("-","");
            int month =Integer.parseInt(bDay.substring(0,2),10);
            int day =Integer.parseInt(bDay.substring(2,4),10);
            int year =Integer.parseInt(bDay.substring(4),10);


            LocalDate today = LocalDate.now();
            LocalDate birthday = LocalDate.of(1990, Month.OCTOBER, 20);
            LocalDate nextBDay = birthday.withYear(today.getYear());

            if (nextBDay.isBefore(today) || nextBDay.isEqual(today)) {
                nextBDay = nextBDay.plusYears(1);
            }

            Period p = Period.between(today, nextBDay);
            long p2 = ChronoUnit.DAYS.between(today, nextBDay);
            System.out.println("There are " + p.getMonths() + " months, and " +
                    p.getDays() + " days until your next birthday. (" +
                    p2 + " total)");

        }


        return output;
    }


    public static void main(String[] args){
        Calendar c = Calendar.getInstance();
        System.out.println("Day : " +
                c.get(Calendar.DATE));
        System.out.println(c.get(Calendar.MONTH));
        System.out.println(c.getTime());

        BirthdayCal testCase = new BirthdayCal();
        System.out.println(testCase.DaysUntil("10-20-1990"));

    }
}
