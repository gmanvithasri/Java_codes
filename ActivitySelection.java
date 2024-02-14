import java.util.Arrays;
import java.util.Comparator;

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
        Activity[] activities = {
            new Activity(5, 9),
            new Activity(1, 2),
            new Activity(3, 4),
            new Activity(0, 6),
            new Activity(5, 7),
            new Activity(8, 9)
        };

        selectActivities(activities);
    }
}
