package AdventOfCode2015;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class AdventOfCodeDayNine {

    private ArrayList<String> routeValues = new ArrayList<String>();
    private ArrayList<String> cities = new ArrayList<String>();

    private ArrayList<String[]> arrangements = new ArrayList<String[]>();

    public void setUp(String input) {
        for(String s : input.split("\n")) {
            routeValues.add(s);
            if(!cities.contains(s.split(" ")[0])) {
                cities.add(s.split(" ")[0]);
            } else if(!cities.contains(s.split(" ")[2])) {
                cities.add(s.split(" ")[2]);
            }
        }
        permute(cities, 0);
        printRoutes();
    }

    private void printRoutes() {
        for(int i = 0; i < arrangements.size(); i++) {
            System.out.println(Arrays.toString(arrangements.get(i)).replace("[", "").replace("]", "").replace(", ", " -> "));
        }
    }

    public int getShortestRoute() {
        int shortestDistance = Integer.MAX_VALUE;
        for(int i = 0; i < arrangements.size(); i++) {
            int totalDistance = 0;
            String[] currentRoute = arrangements.get(i);
            currentRoute = Arrays.toString(currentRoute).replace("[", "")
                                             .replace("]","")
                                             .split(", ");
            for(int x = 0; x < currentRoute.length - 1; x++) {
                totalDistance += getDistanceBetweenLocations(currentRoute[x], currentRoute[x + 1]);
            }
            if (totalDistance < shortestDistance) {
                shortestDistance = totalDistance;
            }
        }
        return shortestDistance;
    }

    public int getLongestRoute() {
        int longestDistance = Integer.MIN_VALUE;
        for(int i = 0; i < arrangements.size(); i++) {
            int totalDistance = 0;
            String[] currentRoute = arrangements.get(i);
            currentRoute = Arrays.toString(currentRoute).replace("[", "")
                    .replace("]","")
                    .split(", ");
            for(int x = 0; x < currentRoute.length - 1; x++) {
                totalDistance += getDistanceBetweenLocations(currentRoute[x], currentRoute[x + 1]);
            }
            if (totalDistance > longestDistance) {
                longestDistance = totalDistance;
            }
        }
        return longestDistance;
    }

    private int getDistanceBetweenLocations(String startPoint, String endPoint) {
        for(String s : routeValues) {
            if(s.contains(startPoint) && s.contains(endPoint))
                return Integer.parseInt(s.split(" ")[4]);
        }
        return -1;
    }

    private void permute(List<String> arr, int k){
        for(int i = k; i < arr.size(); i++){
            Collections.swap(arr, i, k);
            permute(arr, k + 1);
            Collections.swap(arr, k, i);
        }
        if (k == arr.size() - 1){
            arrangements.add(asStrings(arr));
        }
    }

    private static String[] asStrings(Object... objArray) {
        String[] strArray = new String[objArray.length];
        for (int i = 0; i < objArray.length; i++)
            strArray[i] = String.valueOf(objArray[i]);
        return strArray;
    }

    public static void main(String[] args){
        AdventOfCodeDayNine adventOfCodeDayNine = new AdventOfCodeDayNine();
        adventOfCodeDayNine.setUp(input);
        System.out.println("Shortest route: " + adventOfCodeDayNine.getShortestRoute());
        System.out.println("Longest route: " + adventOfCodeDayNine.getLongestRoute());
    }

    private static final String input = "AlphaCentauri to Snowdin = 66\n" +
                                        "AlphaCentauri to Tambi = 28\n" +
                                        "AlphaCentauri to Faerun = 60\n" +
                                        "AlphaCentauri to Norrath = 34\n" +
                                        "AlphaCentauri to Straylight = 34\n" +
                                        "AlphaCentauri to Tristram = 3\n" +
                                        "AlphaCentauri to Arbre = 108\n" +
                                        "Snowdin to Tambi = 22\n" +
                                        "Snowdin to Faerun = 12\n" +
                                        "Snowdin to Norrath = 91\n" +
                                        "Snowdin to Straylight = 121\n" +
                                        "Snowdin to Tristram = 111\n" +
                                        "Snowdin to Arbre = 71\n" +
                                        "Tambi to Faerun = 39\n" +
                                        "Tambi to Norrath = 113\n" +
                                        "Tambi to Straylight = 130\n" +
                                        "Tambi to Tristram = 35\n" +
                                        "Tambi to Arbre = 40\n" +
                                        "Faerun to Norrath = 63\n" +
                                        "Faerun to Straylight = 21\n" +
                                        "Faerun to Tristram = 57\n" +
                                        "Faerun to Arbre = 83\n" +
                                        "Norrath to Straylight = 9\n" +
                                        "Norrath to Tristram = 50\n" +
                                        "Norrath to Arbre = 60\n" +
                                        "Straylight to Tristram = 27\n" +
                                        "Straylight to Arbre = 81\n" +
                                        "Tristram to Arbre = 90";
}