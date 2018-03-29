package AdventOfCode2016;

import java.util.ArrayList;
import java.util.Arrays;

public class AdventOfCodeDaySix {

    private ArrayList<String> columns = new ArrayList<>();

    public void setUp(String input) {
        String[] lines = input.split("\n");

        int sequenceWidth = lines[0].length();
        int sequenceHeight = lines.length;

        for(int i = 0; i < sequenceWidth; i++) {
            String temp = "";
            for(int x = 0; x < sequenceHeight; x++) {
                temp += lines[x].charAt(i);
            }
            columns.add(temp);
        }
    }

    public String buildPassCode() {
        String value = "";
        for(int columnNumber = 0; columnNumber < columns.size(); columnNumber++) {
            value += getMostCommonCharacter(columnNumber);
        }

        return value;
    }

    public String buildPassCodeTwo() {
        String value = "";
        for(int columnNumber = 0; columnNumber < columns.size(); columnNumber++) {
            value += getLeastCommonCharacter(columnNumber);
        }

        return value;
    }

    private String getMostCommonCharacter(int columnNumber) {
        char[] columnCharArray = columns.get(columnNumber).toCharArray();
        Arrays.sort(columnCharArray);
        int highestValue = 0;
        String highestValueCharacter = "";

        for (int i = 0; i < columnCharArray.length; i++) {
            char currentChar = columnCharArray[i];
            int currentCount = 0;
            for (int x = i + 1; x < columnCharArray.length; x++) {
                char nextCharacter = columnCharArray[x];
                if (nextCharacter == currentChar) {
                    currentCount++;
                }
            }
            if (currentCount > highestValue) {
                highestValueCharacter = String.valueOf(currentChar).toUpperCase();
                highestValue = currentCount;
            }
        }
        return highestValueCharacter;
    }

    private String getLeastCommonCharacter(int columnNumber) {
        char[] columnCharArray = columns.get(columnNumber).toCharArray();
        Arrays.sort(columnCharArray);
        int highestValue = Integer.MAX_VALUE;
        String lowestValueCharacter = "";
        int currentCount = 1;

        for (int i = 0; i < columnCharArray.length; i += currentCount) {
            currentCount = 1;
            char currentChar = columnCharArray[i];
            for (int x = i + 1; x < columnCharArray.length; x++) {
                char nextCharacter = columnCharArray[x];
                if (nextCharacter == currentChar) {
                    currentCount++;
                } else {
                    break;
                }
            }
            if (currentCount < highestValue) {
                lowestValueCharacter = String.valueOf(currentChar).toUpperCase();
                highestValue = currentCount;
            }
        }
        return lowestValueCharacter;
    }

    public static void main(String[] args) {
        AdventOfCodeDaySix adventOfCodeDaySix = new AdventOfCodeDaySix();
        adventOfCodeDaySix.setUp(input);

        String result = adventOfCodeDaySix.buildPassCode();
        System.out.println("Result: " + result);

        result = adventOfCodeDaySix.buildPassCodeTwo();
        System.out.println("Result: " + result);
    }

    private static final String input = "drhqjkbv\n" +
                                        "dtmukohn\n" +
                                        "pblnptvr\n" +
                                        "rggqrqre\n" +
                                        "ihknljci\n" +
                                        "ncoeigib\n" +
                                        "qbmbrgzv\n" +
                                        "zfahdmvg\n" +
                                        "mblaahfc\n" +
                                        "irafzbak\n" +
                                        "wghpbuwg\n" +
                                        "pyijzopp\n" +
                                        "dxpqsjkd\n" +
                                        "nhrosahg\n" +
                                        "ekfkwiqi\n" +
                                        "khgwbxsz\n" +
                                        "fkkinvci\n" +
                                        "xlmjkxql\n" +
                                        "rvzsdcve\n" +
                                        "josyoqlp\n" +
                                        "wnyzmbhh\n" +
                                        "bvkkwyxp\n" +
                                        "zdnlhnlv\n" +
                                        "hbgmztkb\n" +
                                        "yugdjalz\n" +
                                        "ittbvkxm\n" +
                                        "pbnxevdt\n" +
                                        "fptnvjdb\n" +
                                        "dsypeozk\n" +
                                        "gcjmtlcc\n" +
                                        "pqsnuztm\n" +
                                        "meilciol\n" +
                                        "uolptcbc\n" +
                                        "jueofzif\n" +
                                        "mryrumjt\n" +
                                        "jxmdacbz\n" +
                                        "plraftrm\n" +
                                        "ljgrwfiz\n" +
                                        "ligncqig\n" +
                                        "hrcmfkwa\n" +
                                        "kraqruef\n" +
                                        "mawxovke\n" +
                                        "fgwermvq\n" +
                                        "ipfzrpoz\n" +
                                        "rhfgebjy\n" +
                                        "ltqkdjag\n" +
                                        "dvgdhywz\n" +
                                        "ojnzjack\n" +
                                        "ktnqjzlc\n" +
                                        "uvcyfogs\n" +
                                        "anqjxrbb\n" +
                                        "rqedwxhi\n" +
                                        "iliuzgff\n" +
                                        "lanioopk\n" +
                                        "kbcwlndi\n" +
                                        "wuzfguwq\n" +
                                        "oclgdxdn\n" +
                                        "euqmnjxb\n" +
                                        "rwgdgwac\n" +
                                        "gepgmuuw\n" +
                                        "xmsfhugr\n" +
                                        "cmmgvoza\n" +
                                        "mrdnpirq\n" +
                                        "muorgsxa\n" +
                                        "awdmmpth\n" +
                                        "abwkhkot\n" +
                                        "hlztzuhm\n" +
                                        "qwbxfktf\n" +
                                        "gkdslbhk\n" +
                                        "rqppdpfj\n" +
                                        "juuuxmwh\n" +
                                        "sprwgdoi\n" +
                                        "eptrqcap\n" +
                                        "fdtoubid\n" +
                                        "lnkxrjrr\n" +
                                        "yxxiuuzb\n" +
                                        "kcbgcuno\n" +
                                        "ssszanxv\n" +
                                        "xajngqze\n" +
                                        "dqprwcbs\n" +
                                        "tmehzhsh\n" +
                                        "eeooqhko\n" +
                                        "eacbmenw\n" +
                                        "qpbwiznc\n" +
                                        "hoofmvah\n" +
                                        "noicaaqv\n" +
                                        "reqwbpnl\n" +
                                        "ctfbzydf\n" +
                                        "kkjvsvob\n" +
                                        "pwkramtw\n" +
                                        "txsebrtx\n" +
                                        "wpxomtjx\n" +
                                        "xwcxfihp\n" +
                                        "iabaswyj\n" +
                                        "ubvgfrsw\n" +
                                        "yhxvrlwg\n" +
                                        "kyighkhi\n" +
                                        "kfmcjeci\n" +
                                        "wtxvnufi\n" +
                                        "eggyqgwj\n" +
                                        "azywqbdk\n" +
                                        "egwprvgp\n" +
                                        "gxtgzqek\n" +
                                        "hbypquhd\n" +
                                        "oqbpykib\n" +
                                        "bsaybmgo\n" +
                                        "ctzhjzgf\n" +
                                        "uqcatiea\n" +
                                        "fkquufln\n" +
                                        "mzuepzcn\n" +
                                        "rwteqddf\n" +
                                        "uandcifd\n" +
                                        "chqjvavf\n" +
                                        "xrugbecb\n" +
                                        "bynqmlhg\n" +
                                        "keruzmmy\n" +
                                        "tpxbrwkw\n" +
                                        "czawkslt\n" +
                                        "duunzdgl\n" +
                                        "mhhrgsfi\n" +
                                        "lhiorqvn\n" +
                                        "uroxbpki\n" +
                                        "uyqvmdvr\n" +
                                        "wbvzxinc\n" +
                                        "hvjbywqh\n" +
                                        "opztxiye\n" +
                                        "jnkvbsss\n" +
                                        "awfhhjuh\n" +
                                        "wldwnsms\n" +
                                        "vzdtdfzz\n" +
                                        "qcgjdsxf\n" +
                                        "ncungtbd\n" +
                                        "bsfmblxe\n" +
                                        "iztafyde\n" +
                                        "omxfacnb\n" +
                                        "bfjgzohh\n" +
                                        "idowhvnt\n" +
                                        "etxcropc\n" +
                                        "dlebejbz\n" +
                                        "dpgrvvyg\n" +
                                        "yyetaiyd\n" +
                                        "zmvvslxw\n" +
                                        "iolevdzw\n" +
                                        "pwrbpwyt\n" +
                                        "ncxnbdcs\n" +
                                        "bizuessl\n" +
                                        "csomkqnr\n" +
                                        "gukypdxo\n" +
                                        "zzazkgze\n" +
                                        "mhygipbc\n" +
                                        "nidnvzql\n" +
                                        "oblusiue\n" +
                                        "rnuvqhpy\n" +
                                        "ybeycdic\n" +
                                        "sbzmvzxq\n" +
                                        "gvvqcrug\n" +
                                        "zkdknqod\n" +
                                        "zkztprqv\n" +
                                        "xlprotcp\n" +
                                        "sndzhrmt\n" +
                                        "cntdipcw\n" +
                                        "siiqfres\n" +
                                        "pnfcbzjo\n" +
                                        "twbgdnrv\n" +
                                        "zzxnngor\n" +
                                        "nmcmxqgt\n" +
                                        "jayxwvrm\n" +
                                        "pahclzsw\n" +
                                        "ztddtnyo\n" +
                                        "odidwauv\n" +
                                        "tzlaantg\n" +
                                        "nttefszm\n" +
                                        "jahhbgpt\n" +
                                        "pvxsgjsl\n" +
                                        "gewlnlqm\n" +
                                        "bykgsqzo\n" +
                                        "zqrrhrkl\n" +
                                        "isxyqlbv\n" +
                                        "wfzkqgvt\n" +
                                        "mcwizlzj\n" +
                                        "ugtgyrez\n" +
                                        "qfyzoall\n" +
                                        "cfyqxoyx\n" +
                                        "vdszizjm\n" +
                                        "bgrcpovm\n" +
                                        "einnyfdv\n" +
                                        "uugncaps\n" +
                                        "letylmon\n" +
                                        "ocltwlem\n" +
                                        "owfskawk\n" +
                                        "hvripclk\n" +
                                        "jmgrulzy\n" +
                                        "kjxyhhle\n" +
                                        "ionkwbuu\n" +
                                        "tmjsudwf\n" +
                                        "kxocxtoa\n" +
                                        "ejbuoost\n" +
                                        "nzqdzsdd\n" +
                                        "dkuiiisp\n" +
                                        "dxwhxbvj\n" +
                                        "ghipctmd\n" +
                                        "mwmcfifl\n" +
                                        "vfptvuxo\n" +
                                        "zfqsjsbx\n" +
                                        "peazobjt\n" +
                                        "nlwomnpb\n" +
                                        "ndxbvgqn\n" +
                                        "zonnhffl\n" +
                                        "vjnyiejx\n" +
                                        "ghrcsxgl\n" +
                                        "fsdiwdmy\n" +
                                        "jmhtpgis\n" +
                                        "sscjmpev\n" +
                                        "oivfuctm\n" +
                                        "zwtllrfo\n" +
                                        "uuzpmnjx\n" +
                                        "wgpccyiu\n" +
                                        "ujhilevq\n" +
                                        "hjjieaag\n" +
                                        "dfbfylpe\n" +
                                        "ypegnmyg\n" +
                                        "vjnjrgcu\n" +
                                        "enylcycn\n" +
                                        "ptlneeqo\n" +
                                        "nfiplyjo\n" +
                                        "dxcrmicb\n" +
                                        "vdxohgvl\n" +
                                        "iycioixk\n" +
                                        "rwqrjyyu\n" +
                                        "rfatusnv\n" +
                                        "mnyvdlhu\n" +
                                        "piyhcljq\n" +
                                        "edcykiom\n" +
                                        "wrtwvqub\n" +
                                        "ejtepubt\n" +
                                        "vegruhiu\n" +
                                        "qmrlbprr\n" +
                                        "wntjsebz\n" +
                                        "hkdkuasw\n" +
                                        "jxkfblck\n" +
                                        "knrwttyx\n" +
                                        "pmjitnry\n" +
                                        "lrtbermt\n" +
                                        "qkhtmeoe\n" +
                                        "skmqdpek\n" +
                                        "fmxlqqhn\n" +
                                        "ureaitwq\n" +
                                        "qufcyfph\n" +
                                        "wcidvwgt\n" +
                                        "ybkrmqem\n" +
                                        "qhuacrls\n" +
                                        "yvnsqqdb\n" +
                                        "xpjchodx\n" +
                                        "lcwzkemd\n" +
                                        "jokzbvsi\n" +
                                        "jjbklvqq\n" +
                                        "xfswceep\n" +
                                        "xsjwsymu\n" +
                                        "slmsyksa\n" +
                                        "oaquyavd\n" +
                                        "zxteczie\n" +
                                        "yglonpuu\n" +
                                        "rdfvsbno\n" +
                                        "wgxhuxga\n" +
                                        "kvpetmdr\n" +
                                        "fjeoobow\n" +
                                        "atdqjabp\n" +
                                        "prjazwst\n" +
                                        "yqkisdog\n" +
                                        "wvswvdtm\n" +
                                        "iogvloma\n" +
                                        "srxeqnqq\n" +
                                        "ipjfezkx\n" +
                                        "joonxwtz\n" +
                                        "yjovntqa\n" +
                                        "svbbkcvw\n" +
                                        "mgyseuqr\n" +
                                        "dxflpkvp\n" +
                                        "gqbiytmk\n" +
                                        "siccxtsn\n" +
                                        "oepstegr\n" +
                                        "uwjjhhqb\n" +
                                        "eosfjfhv\n" +
                                        "dsaqqhda\n" +
                                        "vudzwxak\n" +
                                        "njzjiowv\n" +
                                        "anfpqwsz\n" +
                                        "geuqffcr\n" +
                                        "vhhbkgeb\n" +
                                        "flkqpzbn\n" +
                                        "fgtdspvd\n" +
                                        "yjhxwcps\n" +
                                        "aimfdnpv\n" +
                                        "hhvklxlo\n" +
                                        "yjoxsxhj\n" +
                                        "bllophbc\n" +
                                        "ntclfhgs\n" +
                                        "gtnsuqdp\n" +
                                        "dazhoeap\n" +
                                        "klczitkw\n" +
                                        "tlkedeuy\n" +
                                        "cvbuidmk\n" +
                                        "vjubfgqg\n" +
                                        "qimvfpxg\n" +
                                        "hnqegigv\n" +
                                        "cppyezxe\n" +
                                        "czcmiytj\n" +
                                        "ypvezoca\n" +
                                        "adjxiooc\n" +
                                        "mdshbmjd\n" +
                                        "urthwyqf\n" +
                                        "dhoijcrh\n" +
                                        "vxnnyszn\n" +
                                        "ttzkydfs\n" +
                                        "lhnbywji\n" +
                                        "tyiuyhxa\n" +
                                        "fyryagxi\n" +
                                        "hboupxaq\n" +
                                        "urctvbue\n" +
                                        "cirtbbfu\n" +
                                        "bkoxlmkm\n" +
                                        "rdeoosjs\n" +
                                        "qemhixen\n" +
                                        "zqfioppk\n" +
                                        "vopwlhhe\n" +
                                        "gmpihxop\n" +
                                        "aamsrrzs\n" +
                                        "sdyssprk\n" +
                                        "hmrqkghm\n" +
                                        "oevtvzwl\n" +
                                        "bqufyyuu\n" +
                                        "ennrxvaf\n" +
                                        "slmshjpz\n" +
                                        "qgraeety\n" +
                                        "mczjxfan\n" +
                                        "wzwmupvu\n" +
                                        "sqbkhwxg\n" +
                                        "abbotwty\n" +
                                        "trafaoli\n" +
                                        "bkuarvfz\n" +
                                        "wuffaong\n" +
                                        "fqevpper\n" +
                                        "eekwoblz\n" +
                                        "spsztgee\n" +
                                        "yjfbfeif\n" +
                                        "qcjdtsez\n" +
                                        "omujkwzt\n" +
                                        "vjpfndxp\n" +
                                        "hkpxvjix\n" +
                                        "eiigrazh\n" +
                                        "jmtdqwuu\n" +
                                        "jnsfvufm\n" +
                                        "xhkdzgjf\n" +
                                        "rvqigugc\n" +
                                        "bivqnzgu\n" +
                                        "ydadmvyq\n" +
                                        "ghsohaqa\n" +
                                        "eulugttl\n" +
                                        "nvhaafrh\n" +
                                        "ikdtvxpu\n" +
                                        "fbmztykr\n" +
                                        "gmhluyfq\n" +
                                        "biovnlho\n" +
                                        "xinmgiwl\n" +
                                        "xsvlnvnr\n" +
                                        "gryuussb\n" +
                                        "eeqmavbo\n" +
                                        "fuftdkgb\n" +
                                        "wwmwybtx\n" +
                                        "txshabuj\n" +
                                        "ewxcrjmj\n" +
                                        "lskdajks\n" +
                                        "pabjhzen\n" +
                                        "xzfmdhaj\n" +
                                        "gojxghyk\n" +
                                        "iyqaryra\n" +
                                        "bnlovokf\n" +
                                        "mehlaadw\n" +
                                        "tzqhtnhv\n" +
                                        "kgacrpdt\n" +
                                        "qxawodku\n" +
                                        "fcrouumv\n" +
                                        "yzqxkmgi\n" +
                                        "xzspfhmp\n" +
                                        "omhlnexu\n" +
                                        "olstosyp\n" +
                                        "gxslgwcn\n" +
                                        "juamcglq\n" +
                                        "irdvybpr\n" +
                                        "ncsacfpd\n" +
                                        "hczoulhg\n" +
                                        "kqjpowtq\n" +
                                        "bzefqjnj\n" +
                                        "qnrtwygz\n" +
                                        "rztxjfyr\n" +
                                        "lcpxloro\n" +
                                        "gdibhhkc\n" +
                                        "qgwuyhea\n" +
                                        "uweyjukp\n" +
                                        "hsljwmyy\n" +
                                        "ayhxycnx\n" +
                                        "klzvtttr\n" +
                                        "lgdmpcww\n" +
                                        "cqvtjkyw\n" +
                                        "rfyjuybh\n" +
                                        "tskdjzrt\n" +
                                        "mhwspcvf\n" +
                                        "xplpnemj\n" +
                                        "lrjvgjgs\n" +
                                        "crllldzy\n" +
                                        "ikczhybc\n" +
                                        "oolwtfoj\n" +
                                        "pqfgligu\n" +
                                        "cdgktmmx\n" +
                                        "jbpatjkl\n" +
                                        "keqepeax\n" +
                                        "qfirnsdi\n" +
                                        "juyzjarn\n" +
                                        "tuymbnri\n" +
                                        "jijsmffx\n" +
                                        "xfnbxvzo\n" +
                                        "oxmscdkf\n" +
                                        "hkfcgeuv\n" +
                                        "mkkuxffi\n" +
                                        "vjmccxrb\n" +
                                        "wrpagtbd\n" +
                                        "wcnmlred\n" +
                                        "pafkwcph\n" +
                                        "tcvjkxyl\n" +
                                        "stvhdkom\n" +
                                        "cfzhzuif\n" +
                                        "avdzxwyd\n" +
                                        "wdoyqfpy\n" +
                                        "gtolniag\n" +
                                        "nvznsjsi\n" +
                                        "cabyykqf\n" +
                                        "bxfoznta\n" +
                                        "mobkmnwc\n" +
                                        "sauywroh\n" +
                                        "xexkiuyy\n" +
                                        "oyevexto\n" +
                                        "vqegjclw\n" +
                                        "xoifoyic\n" +
                                        "rshyscwd\n" +
                                        "hvreaslo\n" +
                                        "negmieaw\n" +
                                        "dmfggrux\n" +
                                        "yxmknfpx\n" +
                                        "ttyuarnj\n" +
                                        "tiwewqnv\n" +
                                        "fgmplqux\n" +
                                        "fsdeavfu\n" +
                                        "uvqczvae\n" +
                                        "dydssjnh\n" +
                                        "ihlykqnj\n" +
                                        "xygdlwae\n" +
                                        "usyabtdd\n" +
                                        "yqikfwvv\n" +
                                        "nvqrjqzh\n" +
                                        "rexbjqsu\n" +
                                        "nzerccmq\n" +
                                        "apzjtxxq\n" +
                                        "dgnykfrj\n" +
                                        "izahycnb\n" +
                                        "ruubddeh\n" +
                                        "xkrbsmak\n" +
                                        "eooaoaxz\n" +
                                        "alwnxxey\n" +
                                        "rpxrikkc\n" +
                                        "syafkuqf\n" +
                                        "fqwavgfy\n" +
                                        "jlrielnd\n" +
                                        "ylmuftje\n" +
                                        "jigqlhyu\n" +
                                        "fdbusljj\n" +
                                        "ltsvqjss\n" +
                                        "ryzsnxja\n" +
                                        "sdvtoolp\n" +
                                        "ttvfgkan\n" +
                                        "zzbzmsdh\n" +
                                        "oneyivvm\n" +
                                        "lmkooris\n" +
                                        "qbwaumyc\n" +
                                        "upooekoi\n" +
                                        "oaplwhwf\n" +
                                        "zvvsffan\n" +
                                        "hjujkmzt\n" +
                                        "ksocowvu\n" +
                                        "xmaxctph\n" +
                                        "uohgaowz\n" +
                                        "wyiqttrj\n" +
                                        "apdmkleo\n" +
                                        "ngirmkie\n" +
                                        "zdmekxlr\n" +
                                        "zghwmffq\n" +
                                        "kkwtxmht\n" +
                                        "aopxxxla\n" +
                                        "cwaxcndp\n" +
                                        "mchejzuf\n" +
                                        "qiisajma\n" +
                                        "paqlvgwk\n" +
                                        "neepulbv\n" +
                                        "locpxcge\n" +
                                        "zqihibab\n" +
                                        "mpwwkcnc\n" +
                                        "acltdkmx\n" +
                                        "tsveirfy\n" +
                                        "oyqnektx\n" +
                                        "roljqjyy\n" +
                                        "tppfxdlm\n" +
                                        "pdkdgzbj\n" +
                                        "hqohdklw\n" +
                                        "ffaqesqq\n" +
                                        "cluhwwfj\n" +
                                        "bfwsfqjl\n" +
                                        "yxeforet\n" +
                                        "auhwgphh\n" +
                                        "wqeumebp\n" +
                                        "stagigac\n" +
                                        "typntncz\n" +
                                        "hdlxeizg\n" +
                                        "daaredsw\n" +
                                        "tbgzwdkl\n" +
                                        "jnncvszy\n" +
                                        "vzzojziz\n" +
                                        "uhuiphch\n" +
                                        "sflgjnmx\n" +
                                        "zjcebfsa\n" +
                                        "psvusroj\n" +
                                        "isyddacs\n" +
                                        "qjnifltk\n" +
                                        "lxsjtnwd\n" +
                                        "gfrahlus\n" +
                                        "vvzirpuo\n" +
                                        "zxscyfrr\n" +
                                        "asdpeiwa\n" +
                                        "hzrjpvlj\n" +
                                        "lubqxhin\n" +
                                        "kauqzmng\n" +
                                        "vlchbkuk\n" +
                                        "baivdnom\n" +
                                        "cuwbwhml\n" +
                                        "inwmiyfq\n" +
                                        "ywvdnsqq\n" +
                                        "sohppxig\n" +
                                        "vnvqqmjy\n" +
                                        "aaekdkci\n" +
                                        "byyylakp\n" +
                                        "vwctbbrq\n" +
                                        "pguveyxu\n" +
                                        "ccbkkuqw\n" +
                                        "qmtotaum\n" +
                                        "bbghdbpn\n" +
                                        "miuprwir\n" +
                                        "lkjlnmus\n" +
                                        "zhvpqpwz\n" +
                                        "xtxzqnix\n" +
                                        "lxckscjy\n" +
                                        "lkvlzrta\n" +
                                        "feoujqdq\n" +
                                        "myecxjgd\n" +
                                        "dwkmzbor\n" +
                                        "gfdlcijs\n" +
                                        "abwlgpdc\n" +
                                        "vwspenjl\n" +
                                        "cigbugvr\n" +
                                        "ugjalecy\n" +
                                        "klbkpbsg\n" +
                                        "qraxrapw\n" +
                                        "vyjcmvmy\n" +
                                        "ffhvruro\n" +
                                        "eluiytkn";
}
