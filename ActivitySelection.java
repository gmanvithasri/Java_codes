import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class Activity {
    int start, finish;

    public Activity(int start, int finish) {
        this.start = start;
        this.finish = finish;
    }
}

public class ActivitySelection {

    public static void selectActivities(Activity[] activities) {
        Arrays.sort(activities, new Comparator<Activity>() {
            public int compare(Activity s1, Activity s2) {
                return s1.finish - s2.finish;
            }
        });

        System.out.println("Selected activities:");
        int i = 0; // The index of the first activity
        System.out.println("(" + activities[i].start + ", " + activities[i].finish + ")");

        for (int j = 1; j < activities.length; j++) {
            if (activities[j].start >= activities[i].finish) {
                System.out.println("(" + activities[j].start + ", " + activities[j].finish + ")");
                i = j;
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of activities: ");
        int n = scanner.nextInt();
        Activity[] activities = new Activity[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter start and finish time for activity " + (i + 1) + ":");
            int start = scanner.nextInt();
            int finish = scanner.nextInt();
            activities[i] = new Activity(start, finish);
        }

        selectActivities(activities);
    }
}
