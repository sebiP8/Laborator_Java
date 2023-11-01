public class MonthDays {
    public static void main(String[] args) {
        int[] monthDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};

        // 1. Display each month alongside its corresponding number of days.
        System.out.println("Ex1:");
        for (int i = 0; i < 12; i++) {
            System.out.println(months[i] + " has " + monthDays[i] + " days.");
        }

        // 2. Display the months that have 31 days.
        System.out.println("Ex2:");
        for (int i = 0; i < 12; i++) {
            if (monthDays[i] == 31) {
                System.out.println(months[i]);
            }
        }

        // 3. Display the months that have fewer than 31 days, along with their number of days.
        System.out.println("Ex3:");
        for (int i = 0; i < 12; i++) {
            if (monthDays[i] < 31) {
                System.out.println(months[i] + " has " + monthDays[i] + " days.");
            }
        }

        // 4. Calculate and display the total number of days for months with fewer than 31 days.
        System.out.println("Ex4:");
        int totalDays = 0;
        for (int i = 0; i < 12; i++) {
            if (monthDays[i] < 31) {
                totalDays += monthDays[i];
            }
        }
        System.out.println("Total number of days for months with fewer than 31 days: " + totalDays);

        // 5. Repeat exercise 1, but only display the first 3 characters of each month's name.
        System.out.println("Ex5:");
        for (int i = 0; i < 12; i++) {
            String abbreviatedMonth = months[i].substring(0, 3);
            System.out.println(abbreviatedMonth + " has " + monthDays[i] + " days.");
        }
    }
}
