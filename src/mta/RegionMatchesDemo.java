package mta;

public class RegionMatchesDemo {
    public static void main(String[] args) {
        String searchMe = "Green Green Eggs and Ham";
        String findMe = "ee";
        int searchMeLength = searchMe.length();
        int findMeLength = findMe.length();
        System.out.println(searchMeLength-findMeLength);
        boolean foundIt = false;
        for (int i = 0;
             i <= (searchMeLength - findMeLength);
             i++) {
            if (searchMe.regionMatches(2, findMe, 2, findMeLength)) {
                foundIt = true;
                System.out.println(searchMe.substring(i, i + findMeLength));
                break;
            }
        }
        if (!foundIt)
            System.out.println("No match found.");
    }
}