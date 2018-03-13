package AdcentOfCode2017;

import java.util.ArrayList;
import java.util.HashMap;

public class AdventOfCodeDayTwelve {

    String input  = "0 <-> 2\n"+
    "1 <-> 1\n"+
    "2 <-> 0, 3, 4\n"+
    "3 <-> 2, 4\n"+
    "4 <-> 2, 3, 6\n"+
    "5 <-> 6\n"+
    "6 <-> 4, 5";

    private HashMap<String, ArrayList<String>> initialElements = new HashMap<>();
    private ArrayList<String> checkedElements = new ArrayList();

    private ArrayList<String> connectedElements = new ArrayList<>();



    public void setUp() {
        String[] lines = input.split("\n");

        for(int i = 0; i < lines.length; i++) {

            String[] keys = lines[i].split(" <-> ");
            String masterKey = keys[0];

            String pairs[] = keys[1].split(", ");

            ArrayList<String> allPairs = new ArrayList<>();

            for(String s : pairs) {
                allPairs.add(s);
            }

            initialElements.put(masterKey, allPairs);
        }

        System.out.println("initial elements: " + initialElements);
    }

    public void getConnectionsToZero() {
        connectedElements.add("0"); //add zero as always connected to self
        checkedElements.add("0");
        ArrayList<String> startValues = initialElements.get("0");

        for(int i = 0; i < startValues.size(); i++) {
            if(checkedElements.contains(startValues.get(i))) {
                //do nothing
            } else {
                ArrayList<String> children = initialElements.get(startValues.get(i));
                for(int x = 0; x < children.size(); x++) {
                    if(checkedElements.contains(children.get(x))) {
                        //do nothing
                    } else {
                        connectedElements.add(children.get(x));
                    }
                }
            }
        }

        System.out.println("connected elements: " + connectedElements);

    }

//    String[] splitLine = input.split("\n");
//
//        for(int i = 0; i < splitLine.length; i++) {
//        String masterKey = splitLine[i].split(" <-> ")[0];
//
//
//        String connectedToMasterKey = splitLine[i].split(" <-> ")[1];
//
//        String[] connectedToMasterKeySections = connectedToMasterKey.split(", ");
//
//        for (int x= 0; x < connectedToMasterKeySections.length; x++) {
//            if(!checkedElements.contains(connectedToMasterKeySections[x])) {
//                connectedElements.add(connectedToMasterKeySections[x]);
//            }
//        }
//
//        checkedElements.add(masterKey);
//    }
//        System.out.println("initial elements: " + initialElements);
//        System.out.println("connected to master elements: " + connectedElements);
}
