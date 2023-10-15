package edu.hw1;
public class Problem2 {
    public static int minutesToSeconds(String time) {

        String[] parts = time.split(":");
        int min = Integer.parseInt(parts[0]);
        int sec = Integer.parseInt(parts[1]);


        if (sec >= 60) {
            return -1;
        }


        int answer = min * 60 + sec;

        return answer;
    }

}
