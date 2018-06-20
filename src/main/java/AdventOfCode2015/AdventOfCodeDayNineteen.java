package AdventOfCode2015;

import java.util.ArrayList;

public class AdventOfCodeDayNineteen {

    private ArrayList<String> replacements = new ArrayList<String>();
    private ArrayList<String> newMolecules = new ArrayList<String>();

    private String startValue;

    public void setUp(String input, String startValue) {
        for(String s : input.split("\n")) {
            replacements.add(s);
        }
        this.startValue = startValue;
    }

    public int getUniqueMolecules() {
        for(String s: replacements) {
            String startVal = s.split(" => ")[0];
            String replaceVal = s.split(" => ")[1];

            for(int i = 0; i < startValue.length(); i++) {
                String start = startValue.substring(0, i);
                String end = startValue.substring(i, startValue.length());
                end = end.replaceFirst(startVal, replaceVal);
                String newMolecule = start + end;
                if(!newMolecules.contains(newMolecule) && !newMolecule.equals(startValue)) {
                    newMolecules.add(start + end);
                    System.out.println("new molecule: " + start + end);
                }
            }
        }
        return newMolecules.size();
    }

    public static void main(String[] args) {
        AdventOfCodeDayNineteen adventOfCodeDayNineteen = new AdventOfCodeDayNineteen();
        adventOfCodeDayNineteen.setUp(startInput, startInputValue);
        int result = adventOfCodeDayNineteen.getUniqueMolecules();
        System.out.println(result);

    }
    private static final String startInputValue = "CRnCaCaCaSiRnBPTiMgArSiRnSiRnMgArSiRnCaFArTiTiBSiThFYCaFArCaCaSiThCaPBSiThSiThCaCaPTiRnPBSiThRnFArArCaCaSiThCaSiThSiRnMgArCaPTiBPRnFArSiThCaSiRnFArBCaSiRnCaPRnFArPMgYCaFArCaPTiTiTiBPBSiThCaPTiBPBSiRnFArBPBSiRnCaFArBPRnSiRnFArRnSiRnBFArCaFArCaCaCaSiThSiThCaCaPBPTiTiRnFArCaPTiBSiAlArPBCaCaCaCaCaSiRnMgArCaSiThFArThCaSiThCaSiRnCaFYCaSiRnFYFArFArCaSiRnFYFArCaSiRnBPMgArSiThPRnFArCaSiRnFArTiRnSiRnFYFArCaSiRnBFArCaSiRnTiMgArSiThCaSiThCaFArPRnFArSiRnFArTiTiTiTiBCaCaSiRnCaCaFYFArSiThCaPTiBPTiBCaSiThSiRnMgArCaF";
    private static final String startInput =    "Al => ThF\n" +
                                                "Al => ThRnFAr\n" +
                                                "B => BCa\n" +
                                                "B => TiB\n" +
                                                "B => TiRnFAr\n" +
                                                "Ca => CaCa\n" +
                                                "Ca => PB\n" +
                                                "Ca => PRnFAr\n" +
                                                "Ca => SiRnFYFAr\n" +
                                                "Ca => SiRnMgAr\n" +
                                                "Ca => SiTh\n" +
                                                "F => CaF\n" +
                                                "F => PMg\n" +
                                                "F => SiAl\n" +
                                                "H => CRnAlAr\n" +
                                                "H => CRnFYFYFAr\n" +
                                                "H => CRnFYMgAr\n" +
                                                "H => CRnMgYFAr\n" +
                                                "H => HCa\n" +
                                                "H => NRnFYFAr\n" +
                                                "H => NRnMgAr\n" +
                                                "H => NTh\n" +
                                                "H => OB\n" +
                                                "H => ORnFAr\n" +
                                                "Mg => BF\n" +
                                                "Mg => TiMg\n" +
                                                "N => CRnFAr\n" +
                                                "N => HSi\n" +
                                                "O => CRnFYFAr\n" +
                                                "O => CRnMgAr\n" +
                                                "O => HP\n" +
                                                "O => NRnFAr\n" +
                                                "O => OTi\n" +
                                                "P => CaP\n" +
                                                "P => PTi\n" +
                                                "P => SiRnFAr\n" +
                                                "Si => CaSi\n" +
                                                "Th => ThCa\n" +
                                                "Ti => BP\n" +
                                                "Ti => TiTi\n" +
                                                "e => HF\n" +
                                                "e => NAl\n" +
                                                "e => OMg";
}
