public class Q12Time {

    public static int angle(int hours, int minutes) {

        // 1 minute = 6 degrees (since 360 degrees / 60 minutes = 6 degrees per minute)
        // 1 hour = 30 degrees (since 360 degrees / 12 hours = 30 degrees per hour)
        double fraction = (double) minutes / 60;

        double hourAngle = (hours * 30) + (fraction) * 30;

        int minuteAngle = minutes * 6;

        // This is the angle between the hour and minute hands, measured
        // counterclockwise.
        double angles = hourAngle - minuteAngle;
        if (angles < 0) {
            Math.floor(angles); // when negative angels round down
            angles += 360; // the minute hand is in front of the hour hand, add 360 to get a positive angle.
        } else if (angles > 360) {
            angles -= 360;
        } else {
            Math.round(angles); // else round
        }

        return (int) angles;
    }

    public static void main(String[] args) {
        int ans = angle(9, 0);
        System.out.println(ans);

        ans = angle(3, 0);
        System.out.println(ans);

        ans = angle(18, 0);
        System.out.println(ans);

        ans = angle(1, 0);
        System.out.println(ans);

        ans = angle(2, 30);
        System.out.println(ans);

        ans = angle(4, 41);
        System.out.println(ans);
    }
}
