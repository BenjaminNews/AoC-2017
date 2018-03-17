package AdcentOfCode2017;

import java.util.ArrayList;
import java.util.HashMap;

public class AdventOfCodeDaySeven {

    private HashMap<String, ArrayList<String>> supportingTowers = new HashMap<>();

    public void setUp(String input) {

        String[] levels = input.split("\n");

        for(String s: levels) {
            if (s.contains("->")) {

                String parentTowerName = s.split(" -> ")[0].split(" ")[0];
                String[] towerChildren = s.split(" -> ")[1].split(", ");

                ArrayList<String> childTowers = new ArrayList<>();

                for(int i = 0; i < towerChildren.length; i++) {
                    childTowers.add(towerChildren[i]);
                }
                supportingTowers.put(parentTowerName, childTowers);
            }
        }
    }

    public String getBaseTower() {
        while(supportingTowers.size() > 1) {
            String nameToRemove = "";
            for (String s : supportingTowers.keySet()) {
                ArrayList<String> childrenTowerNames = supportingTowers.get(s);
                for(int i = 0; i < childrenTowerNames.size(); i++) {
                    String childName = childrenTowerNames.get(i);
                    if(supportingTowers.containsKey(childName)) {
                        nameToRemove = childName;
                        break;
                    }
                }
                if(!nameToRemove.equals("")) {
                   break;
                }
            }
            if (!nameToRemove.equals("")) {
                supportingTowers.remove(nameToRemove);
            }
        }
        return supportingTowers.keySet().iterator().next();
    }

    public static void main(String[] args) {
        AdventOfCodeDaySeven adventOfCodeDaySeven = new AdventOfCodeDaySeven();

        adventOfCodeDaySeven.setUp(input);

        System.out.println("Base tower " + adventOfCodeDaySeven.getBaseTower());
    }

    private static final String input = "nzyiue (57)\n" +
            "pdmkag (39)\n" +
            "bogbg (13)\n" +
            "nubay (45)\n" +
            "dukzh (17)\n" +
            "kpjxln (44) -> dzzbvkv, gzdxgvj, wsocb, jidxg\n" +
            "cxjyxl (83)\n" +
            "vusplt (151) -> mcfst, orrwx\n" +
            "mxrfq (98)\n" +
            "bdoez (62)\n" +
            "vrajpg (78)\n" +
            "qzsowpu (90)\n" +
            "nrxoha (51)\n" +
            "xtjrkv (351) -> jlbhafs, pyocxtt\n" +
            "rlnii (18986) -> xjosf, ljvpv, wkumzkr\n" +
            "ddrrgp (23)\n" +
            "wladmn (42)\n" +
            "ryskzh (209) -> wsyya, xbqpjo\n" +
            "jbjkp (34)\n" +
            "fnfiur (86)\n" +
            "zxzkl (82)\n" +
            "hbmxey (1869) -> khkuxc, mjuwde, tztycfl, miauii\n" +
            "zjyqcfa (97)\n" +
            "zbtck (48)\n" +
            "mgsasl (39)\n" +
            "cemygp (34)\n" +
            "iolrkmv (139) -> rntjx, itxtmhb\n" +
            "jzmqzl (1446) -> pptocz, mwfryd, utgkveb, sflwom\n" +
            "wagpkyw (88)\n" +
            "saiyjff (67)\n" +
            "kwwhb (219) -> htvpmr, rojhup\n" +
            "huspq (74)\n" +
            "mzrafi (44)\n" +
            "fchlc (89)\n" +
            "ezkddph (62)\n" +
            "zehnmg (5)\n" +
            "tgirh (50)\n" +
            "xantdh (73)\n" +
            "zicvvl (10)\n" +
            "kcimi (86) -> uwizfa, kmhyz, wagpkyw, iuovz\n" +
            "wsocb (64)\n" +
            "aemffo (284) -> dukzh, vczudlu, tpubu\n" +
            "gfgoc (18)\n" +
            "bmovg (80)\n" +
            "trsnrjd (89) -> oujkd, fstzdn\n" +
            "bmqiwai (12928) -> yqeaqcn, cgzyc, bwgkn, giftd, hdhvzi\n" +
            "ktehtif (151) -> fvplhrm, jesphm\n" +
            "jkfyg (76) -> ajeisgv, jfrooen, hvhtokr\n" +
            "dkfepj (1970) -> tgirh, mnsqjxv\n" +
            "jjseenh (99)\n" +
            "jvpecm (7) -> dpyuayl, lyigbhi, bflxonp, tvcyh, tddik\n" +
            "silklk (59)\n" +
            "swscfel (68)\n" +
            "dilefzx (89)\n" +
            "spthyf (75)\n" +
            "tiiwbg (17)\n" +
            "ayqgp (58)\n" +
            "qhygx (14)\n" +
            "hqccsb (26) -> bdkfx, srrxb\n" +
            "lbojqfo (34)\n" +
            "arbebt (32)\n" +
            "fsvkj (115) -> ftqtzxk, twzgms, otvvje\n" +
            "sdigtox (39)\n" +
            "awsphe (79)\n" +
            "lftlc (35)\n" +
            "apzabs (68)\n" +
            "aboilvw (452)\n" +
            "rntylx (44)\n" +
            "xhhfsuw (280)\n" +
            "yucwtc (41)\n" +
            "qlgkqk (54) -> sqfrw, acdkw, ycinfxk, wcinck, hyfswg\n" +
            "thneyz (57)\n" +
            "pplkoa (79)\n" +
            "vsxzpf (197) -> spyxh, yvcbk, fkmccg\n" +
            "miymiit (1002) -> lmmeg, jxulvx, yqergs\n" +
            "jaamgi (45)\n" +
            "tvwosmc (1462) -> frvmu, qmfmfxh, jemmk\n" +
            "ngemsu (85)\n" +
            "ohiftl (143) -> loggp, xhwfcu\n" +
            "bztor (157) -> gjfkx, grsdifs, spchmoq\n" +
            "tifkr (52)\n" +
            "kgctcau (82)\n" +
            "yvcbk (32)\n" +
            "srvwd (1234) -> dxerl, pzjsf, yqyyoj\n" +
            "xrise (358)\n" +
            "biwdu (70) -> kvpju, hlullj, bfpvsfz, fvfitqc\n" +
            "utgkveb (76) -> fmhjs, pplkoa, mznkfco\n" +
            "mvhqou (22) -> njgzn, okfcek, zjyqcfa, culvtcm\n" +
            "gadyi (398) -> ndxim, efwhif\n" +
            "ujzofuy (39)\n" +
            "jjgem (852) -> hnvybq, gnffzh, fbuklc\n" +
            "rbucosf (122) -> jvpgl, yuhioxl\n" +
            "ffxnegs (222) -> zfcylzq, xjxjaq, cocau, vusplt, cjlxgf, yjonn, iazte\n" +
            "wrtyhxg (403) -> zqckoxe, vindf, jbvugg, idivffq\n" +
            "imbpvgl (52)\n" +
            "frrvvai (193) -> gxcnp, zvjrwke\n" +
            "ywlrls (31) -> gqdxrur, dfyqo, cxndroi, gbpcav\n" +
            "olzdhtj (42)\n" +
            "thvjlgo (76) -> cufudi, jdyspx\n" +
            "jearhat (57)\n" +
            "jxanwhq (27)\n" +
            "wsyya (98)\n" +
            "tahstqe (37)\n" +
            "dyvooj (80)\n" +
            "yuypmb (98)\n" +
            "uehdbi (26)\n" +
            "inspqeu (34)\n" +
            "nxqqsza (119) -> guxwd, iyxkzat\n" +
            "jgkmy (86)\n" +
            "hllzej (154) -> sodrm, ekfpabq, utqxb\n" +
            "gcbvf (68)\n" +
            "ctoxz (98)\n" +
            "advlxrg (22)\n" +
            "eetxll (37)\n" +
            "lmpauyz (72)\n" +
            "lwxts (76)\n" +
            "rkuyxrc (55)\n" +
            "pitdti (55)\n" +
            "ucjew (91)\n" +
            "gynwftf (91)\n" +
            "czojwyg (15)\n" +
            "uigoxw (75)\n" +
            "rcjqfuo (129) -> lgoak, zcomcn\n" +
            "vvkbav (56)\n" +
            "npcyutn (35)\n" +
            "jfaoy (57)\n" +
            "iqcgwzk (58) -> pdepl, zxeopkg, dukqd, gxdtiob, ylnvdoq\n" +
            "rqnsxm (2056) -> jaxig, bolxwme, dgsse\n" +
            "bsyiv (38)\n" +
            "hhnpg (164) -> dmvajb, pvwdkm\n" +
            "oydoajo (87)\n" +
            "fowpeur (85)\n" +
            "ycnih (17)\n" +
            "zwpyj (12)\n" +
            "wpprf (97) -> fdthu, sxslizl\n" +
            "icqsww (55)\n" +
            "ckedyqu (54)\n" +
            "ageyuq (19)\n" +
            "ebrgtq (112) -> bochc, wqdvql, ogafygg\n" +
            "ygteuy (89)\n" +
            "tuhxr (76)\n" +
            "rvuvico (91)\n" +
            "ecjujqu (92)\n" +
            "tvhgbau (79)\n" +
            "zvsnz (26)\n" +
            "fquywyi (308)\n" +
            "gqrgh (24)\n" +
            "zcfswa (37)\n" +
            "hkbxj (55)\n" +
            "cnknlru (70) -> udfuty, sawqp\n" +
            "jljnags (38)\n" +
            "tztycfl (939) -> rrtqyew, gqzemw, hsfxq\n" +
            "xzyri (187) -> yakzm, zkikhk\n" +
            "sdzoy (51)\n" +
            "ojtrl (130) -> hpgktb, pjkwlmk, phkvcix, zguqo\n" +
            "lyhok (95) -> hdpemqh, nfvsrpa, bwthm, bilzbf, nrlvovz, iqcgwzk, sljgt\n" +
            "hpanc (17)\n" +
            "ykvtr (51)\n" +
            "qbbmsf (97)\n" +
            "ppfyonm (98) -> ylwniqh, ecjrblb\n" +
            "jdsdqzd (32)\n" +
            "oujkd (97)\n" +
            "dpija (23)\n" +
            "pdjnnzd (85)\n" +
            "ghzqyv (37)\n" +
            "yvlxoom (58) -> yxoqwg, wgwkss\n" +
            "gjupqe (180) -> oszyw, zyqqzou\n" +
            "qmfmfxh (7) -> rkgxu, unrhnl\n" +
            "hxlefwp (268) -> yablonq, ouxjkf\n" +
            "fdthu (86)\n" +
            "voonmio (63)\n" +
            "uxlcvt (143) -> scipnb, veutu\n" +
            "xybcccw (7)\n" +
            "inomnjg (91)\n" +
            "gfuxooq (221) -> aceiy, axtzeb\n" +
            "xirqz (71)\n" +
            "tuqzsn (73) -> hueqfk, hcyohc, nerlvh\n" +
            "jaxig (82) -> llofnny, snvqyqb\n" +
            "czztmlk (61)\n" +
            "ffrilz (148) -> qnvzqc, ckedyqu\n" +
            "ejslpy (5616) -> wwcih, jzdmjdf, gnrqrsj, ayirpk, kvifa, bapvub\n" +
            "bfwbkxq (493) -> hiqhe, ouqwmnj, wqxcn, jkfyg\n" +
            "upftju (48)\n" +
            "bqcizg (67)\n" +
            "mkyqul (5)\n" +
            "wjjar (296) -> ywutc, nsvrfae\n" +
            "pabgfh (244) -> bogbg, hgcxyx, siisskc\n" +
            "oltky (7)\n" +
            "aeapmwq (76)\n" +
            "btjxv (35) -> wpgyc, ripmztc\n" +
            "onuxzz (247)\n" +
            "ahayh (54732) -> byrvfhp, rokie, ejslpy\n" +
            "idooz (192) -> owxuzp, uehdbi\n" +
            "ghjpcv (162) -> xucdiz, ygrbgm, yxqesmi, ebktv\n" +
            "zhffrzu (42)\n" +
            "bpygf (26)\n" +
            "tojpm (42)\n" +
            "iihzs (67) -> hkbxj, enekg\n" +
            "ydpihb (46)\n" +
            "rgssc (27)\n" +
            "dkgsvl (82)\n" +
            "qrfhxne (65)\n" +
            "sntuz (68)\n" +
            "oznhe (98) -> tgvdjhh, cpvlq\n" +
            "evfqyvl (304)\n" +
            "qftqq (27)\n" +
            "yxcbn (11)\n" +
            "buifcn (15)\n" +
            "xbpqmua (25)\n" +
            "vjroix (85)\n" +
            "evqrr (48)\n" +
            "unrhnl (88)\n" +
            "ihuzl (35)\n" +
            "giftd (1250) -> zbedu, vyaoad, qcolnc\n" +
            "uqjmbb (17)\n" +
            "egulpbe (80)\n" +
            "fpmwz (218)\n" +
            "nihmyu (98)\n" +
            "avaoo (176) -> xxshup, xsufhnb\n" +
            "fmqon (61)\n" +
            "mbokr (57)\n" +
            "gprznw (41)\n" +
            "bflxonp (105) -> pdmsm, jearhat\n" +
            "oylgfzb (65) -> rugzyaj, hbgyu, rlnii, gwznzk, bmqiwai\n" +
            "cepqh (19)\n" +
            "hfjhadi (58)\n" +
            "ajtkddh (60)\n" +
            "vyadxnv (94) -> pyntdrr, mdpcfvu, cbvjwlo, ijleirw, sltrdk, adueu, qlkqplv\n" +
            "anvvug (1847) -> tfuxhhz, kgctcau\n" +
            "tjobe (129) -> hdspavt, mcduq\n" +
            "qvgeei (273)\n" +
            "dkxsqjt (1416) -> cuwqi, fcoxtp, yvlxoom\n" +
            "urwgjd (39)\n" +
            "vxqcf (105) -> gfnapwr, lmpauyz\n" +
            "etnkepp (5)\n" +
            "koyke (15)\n" +
            "qqhjlu (78)\n" +
            "glguoq (75)\n" +
            "hdvfyp (7) -> eoaprcr, cksyln, hknzmvs\n" +
            "pqvid (15)\n" +
            "jesphm (6)\n" +
            "bdkfx (81)\n" +
            "gqdxrur (77)\n" +
            "fmifd (94)\n" +
            "ijiqjtf (63)\n" +
            "dfyqo (77)\n" +
            "spchmoq (31)\n" +
            "tvcyh (149) -> lqbtnb, matcdld\n" +
            "ilzwrk (64)\n" +
            "tdtznh (64) -> phacwjs, offas\n" +
            "tygst (91)\n" +
            "uzjoys (198) -> bgcjrf, zdrfiw\n" +
            "wfbuzbg (47) -> qpuyqq, ajrcal\n" +
            "kwqcbe (19)\n" +
            "qdovgra (303) -> zziyhz, gfgoc\n" +
            "vfcbliu (19)\n" +
            "fwtfkp (325)\n" +
            "rmdqvgh (61)\n" +
            "dtjzr (28)\n" +
            "cocau (77) -> ficmghd, nkejtw, qowyx\n" +
            "aftsom (70)\n" +
            "fsmzljm (123) -> tatjry, hnfeims\n" +
            "lwufmc (45)\n" +
            "fzzcxvm (61)\n" +
            "cxokosi (70) -> sszzop, gatdr\n" +
            "mmlra (32) -> wdlwryo, wpprf, jexreg, lzowumq, rcjqfuo, lhnevgo, smuybnw\n" +
            "tydlqpq (160) -> fsbojm, mjlmuca\n" +
            "oevvote (68) -> silklk, polrzc, erysec, xoyjtol\n" +
            "fxsatsm (83) -> sntuz, qgxcbt\n" +
            "cvvtz (80) -> vpjhl, rgssc\n" +
            "feonsg (74)\n" +
            "htvpmr (7)\n" +
            "gqzemw (43) -> pxdgkik, jtvntr\n" +
            "pvpqoq (17)\n" +
            "ldfmurk (88) -> fubtwbq, ycawl, sqsqge, aemffo, mszwp\n" +
            "aufym (51)\n" +
            "ldflo (188)\n" +
            "izyjved (5)\n" +
            "zgydn (72)\n" +
            "cqfri (9)\n" +
            "ytnti (150) -> lamtp, fugeht\n" +
            "appkqpe (95)\n" +
            "sjxbk (117) -> tinbqcj, amwtic\n" +
            "fbvvrqt (81)\n" +
            "vlwjehz (22)\n" +
            "lwhev (44) -> zesvlul, wmwzhjg, hpjgrb, sxbusu\n" +
            "hugfkt (42)\n" +
            "tnobvt (18)\n" +
            "zesvlul (73)\n" +
            "gfnapwr (72)\n" +
            "tabzzo (62) -> rvuvico, inomnjg\n" +
            "ixdcgsa (177) -> gmhxee, cogovv\n" +
            "fnvgp (85)\n" +
            "awhwxdm (91)\n" +
            "frgot (59)\n" +
            "boete (78) -> ionnnfx, vytdgko, ouhfxyf\n" +
            "ikxewmm (14)\n" +
            "qfkka (49)\n" +
            "xidye (11)\n" +
            "krdlzf (115)\n" +
            "hxjhcuc (694) -> miuvc, iolrkmv, trsnrjd\n" +
            "ikbkb (136) -> uigoxw, spthyf\n" +
            "yqeaqcn (53) -> qysdgq, mkjvhl, evfqyvl, bhzbv, usuujhq, hxlefwp\n" +
            "dnrxyh (887) -> xthhlfy, fxsatsm, cqpns, xzyri\n" +
            "siswh (41)\n" +
            "pfxrf (51)\n" +
            "dlzgufq (7462) -> ldfmurk, dnrxyh, dzetsz\n" +
            "whlfwr (46)\n" +
            "gbiluq (11)\n" +
            "euaceg (42)\n" +
            "iwdesog (152) -> cqyluwl, dbeskg\n" +
            "afjmzb (15)\n" +
            "sofxmjx (83)\n" +
            "ortcrq (18)\n" +
            "phacwjs (58)\n" +
            "uiwgpi (995) -> hqvvrd, caihc, rvxed\n" +
            "oiyxr (86) -> zibbm, sbklnq\n" +
            "yukoxaw (27)\n" +
            "orrwx (47)\n" +
            "tlxbtng (44)\n" +
            "ayirpk (1850) -> cdkcn, wbllfh, xounvb\n" +
            "lqjznss (67)\n" +
            "mldkiku (55)\n" +
            "dyfhy (58)\n" +
            "jxulvx (34) -> ujzjt, ykmej\n" +
            "yuhioxl (20)\n" +
            "uwiza (106) -> lddiw, hxaza, bnvjmae, oltky\n" +
            "hpsxqdm (41) -> luzcpkn, azdklp, rupdbwl, vwqog\n" +
            "fubtwbq (211) -> bdoez, ezkddph\n" +
            "cwgbjaq (41)\n" +
            "kmhyz (88)\n" +
            "tpubu (17)\n" +
            "bfrbwb (27)\n" +
            "mgwauar (8)\n" +
            "ixwyi (13)\n" +
            "ljugvh (7) -> nxrkz, gnwjseo, ibjbozh, iaiywwa, pcdtne, nvtbk, vobfi\n" +
            "rcongvf (20)\n" +
            "csqyn (46)\n" +
            "ygbyt (15)\n" +
            "gwznzk (11) -> ehqavsc, yimottm, heuyaxx, yirkbjn, fqhag, ovqhdvy, zzxlo\n" +
            "wwcih (1585) -> dyveac, pejho, cyfuwdb, tojnst\n" +
            "alqog (157) -> dyvooj, wvkaie\n" +
            "qecgvu (19)\n" +
            "jexreg (209) -> bonnse, phgkg\n" +
            "vbisx (49)\n" +
            "bcukkvc (72)\n" +
            "trcbs (90)\n" +
            "xjxjaq (211) -> kfhwxyy, vnmxsi\n" +
            "uptgby (16) -> eocoy, lqjznss, petluuh\n" +
            "rjnht (63)\n" +
            "urhwog (146) -> mxscf, fwqru\n" +
            "caihc (158) -> kzjkjz, rjijdre\n" +
            "mwjtydb (15)\n" +
            "eqahcc (73)\n" +
            "rntjx (72)\n" +
            "ripmztc (96)\n" +
            "cksyln (93)\n" +
            "ktfeae (20) -> asoirn, jbxnffu, feonsg\n" +
            "bdukt (71)\n" +
            "jtxbfm (55)\n" +
            "ebwtpod (66)\n" +
            "fjerhwe (50)\n" +
            "xxshup (66)\n" +
            "jdyspx (97)\n" +
            "nyxiai (73) -> pjmci, ejvaoj, fbiqxqk\n" +
            "dxznun (49)\n" +
            "umwial (183)\n" +
            "mnsqjxv (50)\n" +
            "wtoive (80) -> nfcru, goicjt\n" +
            "zkzefwh (22)\n" +
            "oszyw (78)\n" +
            "ekxdjlp (60)\n" +
            "tymor (6)\n" +
            "jbydxyp (66)\n" +
            "dzlqgrt (43)\n" +
            "grsdifs (31)\n" +
            "pdepl (238) -> ulezwmd, fhlul\n" +
            "mbunh (8)\n" +
            "iwajy (70)\n" +
            "lknchr (68) -> nercz, skmvkj\n" +
            "klpctiz (75)\n" +
            "lazlx (8)\n" +
            "fbuhz (159) -> aarioi, fbrvfk\n" +
            "kvifa (69) -> fquywyi, ndmcgpn, vczcept, rjhfcl, jatvkwy, fodud, avaoo\n" +
            "ilydn (74)\n" +
            "nerlvh (85)\n" +
            "qqduoo (735) -> wgglzpb, tcrkcu, boete\n" +
            "gfxnuuk (34)\n" +
            "amwtic (72)\n" +
            "ltpban (87)\n" +
            "klyso (67) -> qenjyl, egabi, hmdwqdq\n" +
            "jotxc (57)\n" +
            "cqyluwl (9)\n" +
            "siyuvy (52)\n" +
            "bbsomm (61) -> izonhi, jjseenh\n" +
            "pzjsf (49) -> etnuzv, hrrampl\n" +
            "vshekb (34)\n" +
            "zvjrwke (27)\n" +
            "xekggcw (89) -> tvwosmc, dpfov, anvvug, fneqe\n" +
            "hsulvq (78)\n" +
            "idivffq (292)\n" +
            "bapvub (821) -> acnvtg, lvkpx, zeopgv, dcpnyer\n" +
            "ziwkz (331) -> eqzuic, qrtwjv\n" +
            "bvock (81)\n" +
            "vsyuckp (54)\n" +
            "bsoef (40)\n" +
            "ncjhpa (247)\n" +
            "axtzeb (13)\n" +
            "yotlucw (134) -> jbydxyp, ebwtpod\n" +
            "ceqfbbl (33)\n" +
            "qhbotj (62)\n" +
            "hrmpq (90)\n" +
            "pgznzly (13)\n" +
            "vgndgst (72)\n" +
            "auvla (65)\n" +
            "ylnvdoq (350)\n" +
            "fgxst (8)\n" +
            "pptocz (287) -> werriw, hglhjt\n" +
            "lqbtnb (35)\n" +
            "xvuri (293)\n" +
            "dbeskg (9)\n" +
            "crkapwa (87) -> ogpka, npdwg\n" +
            "bilzbf (803) -> brkux, qcoyrha, cplvif\n" +
            "byrvfhp (80) -> gqgewi, csear, vyadxnv, rqnsxm, cgjula, luuxtc, jzmqzl\n" +
            "cqiipxn (84)\n" +
            "oryrq (103) -> cabsaub, zfthi, palqky\n" +
            "gkzeqaw (38) -> iyflfx, hntdp\n" +
            "xqnrp (33)\n" +
            "zcomcn (70)\n" +
            "tjcpka (87)\n" +
            "nfcru (41)\n" +
            "vfpdqlb (43)\n" +
            "msdff (82)\n" +
            "tddik (43) -> vlthh, btbses\n" +
            "qlmojkv (264) -> tymor, xkfuzi, ligpl\n" +
            "sodrm (37)\n" +
            "mvvgro (84)\n" +
            "cbvjwlo (270) -> nsqzndf, synjm\n" +
            "kowco (46) -> gqrgh, nhxmab\n" +
            "xrapmvb (150)\n" +
            "iifltp (95) -> fowpeur, vjroix\n" +
            "tinbqcj (72)\n" +
            "lbjuqcd (19)\n" +
            "hlhomy (30) -> oylgfzb, ahayh, razvskj, hvtvcpz, teyrfjn, lqirhg, dxxty\n" +
            "veutu (53)\n" +
            "tfuxhhz (82)\n" +
            "oenrkia (44)\n" +
            "oipjwtz (40) -> tgqpp, mjbjv\n" +
            "ndcjr (75)\n" +
            "oermd (94)\n" +
            "xsmgj (99)\n" +
            "cfmhi (107) -> obrwb, hoelsa\n" +
            "nwyftp (72)\n" +
            "nmdhmy (39)\n" +
            "qslgo (92)\n" +
            "mjbjv (89)\n" +
            "hhvqa (41)\n" +
            "erysec (59)\n" +
            "xdnuvji (20)\n" +
            "bfxezgb (8)\n" +
            "njmrq (192) -> uufrda, pdmkag\n" +
            "gutukz (70)\n" +
            "acjtwvt (98)\n" +
            "kddchk (71)\n" +
            "apzjw (149) -> jetfvjc, peomyg\n" +
            "xzhvvy (431) -> ehxkgh, alcpfsx, kvjqli, tjdap\n" +
            "sowzlz (19)\n" +
            "ucvgxii (85)\n" +
            "uzprmq (83) -> ygteuy, exhxs, pfzqe\n" +
            "bvaor (35)\n" +
            "gekcx (78)\n" +
            "cxlip (44)\n" +
            "psnkhtd (157)\n" +
            "yimottm (2101) -> fsmzljm, uptgby, tvhfxfo, ickxyrm, nxqqsza\n" +
            "ocbxx (66)\n" +
            "acnvtg (277) -> wbbfe, nchjk\n" +
            "vangx (51) -> xobyzo, jdhiflw\n" +
            "sfoivjz (17)\n" +
            "lunbob (66)\n" +
            "ecabcm (190) -> vlwjehz, advlxrg\n" +
            "qarjx (7)\n" +
            "gyktq (98)\n" +
            "imfog (52)\n" +
            "zsdvfrk (1190) -> vxqcf, fvivhx, oxyxy\n" +
            "zssgj (44)\n" +
            "efbffd (20)\n" +
            "etdofb (62)\n" +
            "juakl (67)\n" +
            "iltti (60)\n" +
            "ffgoyk (74) -> jgdumgz, ltpban\n" +
            "lamtp (89)\n" +
            "loggp (75)\n" +
            "pejho (106) -> mqaajk, tnobvt, gxhia\n" +
            "enekg (55)\n" +
            "cplvif (95) -> xfanpad, uhepxt, lebqr, hqipq\n" +
            "dgsse (88) -> nwztmzp, akrgdse\n" +
            "rwjzc (107) -> qrfhxne, lcufpmj, paqlttl\n" +
            "drszzbe (132) -> ucjew, unfgdb, tokvgmd\n" +
            "vtnpx (79)\n" +
            "rrkhcl (26) -> seazs, koemv, qnxnatu\n" +
            "ekfpabq (37)\n" +
            "pwvmmda (278) -> rntylx, hrkswsk, zssgj\n" +
            "vqekr (85)\n" +
            "luccp (175) -> ebrgtq, rvuktmb, pslyfi\n" +
            "xkfuzi (6)\n" +
            "obaorae (45)\n" +
            "dpfov (96) -> roqnodm, adasbyp, uorpbn, zyonam, zjcdwr\n" +
            "lzowumq (41) -> sjthmr, mtboq, aeapmwq\n" +
            "pynxen (152) -> omzpkv, rwuxn, dpija, xgogpx\n" +
            "itxtmhb (72)\n" +
            "hanbscg (21) -> npsza, jdjaem, lvuzab, fffxc\n" +
            "teyrfjn (62414) -> ilfgats, qlgkqk, vyvcb, rnsxz\n" +
            "pocxfrt (39)\n" +
            "mqecf (76)\n" +
            "cpacyeu (67)\n" +
            "gycde (88)\n" +
            "tlhgrte (2388) -> xijwk, mmlra, ejtoqaj\n" +
            "jumdfk (64)\n" +
            "swsffrv (13)\n" +
            "fujvp (155) -> gwxkdy, hsftfol\n" +
            "dyxcd (87)\n" +
            "ljvpv (452) -> huutnfp, hoauxku, euvkg\n" +
            "xydxl (88)\n" +
            "ibdiplp (20)\n" +
            "xvwqzt (70) -> ppdsem, pyhqixj, rjnht\n" +
            "djmoed (90)\n" +
            "raioiq (134) -> ipdbccy, inspqeu\n" +
            "bwywt (67)\n" +
            "jfvquxv (70)\n" +
            "mtxzcd (282) -> ucvgxii, ngemsu\n" +
            "lfgmv (87)\n" +
            "lcufpmj (65)\n" +
            "pvwdkm (50)\n" +
            "dbnstqf (56)\n" +
            "jwgjnuu (33)\n" +
            "ndmcgpn (256) -> zvsnz, bpygf\n" +
            "rktkzfw (35)\n" +
            "zxeopkg (218) -> yjyipdp, drnyyes\n" +
            "nutlr (116) -> ybuhf, fjerhwe, xmrcq\n" +
            "cdkcn (39) -> dzlqgrt, vfpdqlb\n" +
            "jfrooen (95)\n" +
            "xmrcq (50)\n" +
            "qpuyqq (83)\n" +
            "hiqhe (361)\n" +
            "xuxlspe (44)\n" +
            "apvfi (59)\n" +
            "wahwi (303) -> lnnii, boxvu\n" +
            "affxphr (22)\n" +
            "lhtzrh (213)\n" +
            "yeewxiw (50)\n" +
            "zyxjqs (65)\n" +
            "kqgqdyg (69) -> yqctq, tcihaf\n" +
            "sqnfwo (67)\n" +
            "mbqkm (12)\n" +
            "mqaajk (18)\n" +
            "nxhetg (60)\n" +
            "hrxfpx (65)\n" +
            "wjfsiec (19) -> znpqzc, xvuri, vsxzpf, doazn, tjbyhjw, czxbmp, vqqrb\n" +
            "hsfxq (99) -> jtxbfm, lzhdsyq\n" +
            "lbiigt (26)\n" +
            "bwgkn (1005) -> uzily, urxxlfo, yqnbqgc, cgnibii\n" +
            "hpjgrb (73)\n" +
            "ajpcyv (42)\n" +
            "pirivl (144) -> bmovg, yexyj\n" +
            "szuiho (73)\n" +
            "lnhiiq (64)\n" +
            "yacaqwf (82)\n" +
            "nqcadtp (310) -> kzvwk, akatbi, gncvcwi\n" +
            "bvgfpab (15)\n" +
            "cxndroi (77)\n" +
            "efwhif (6)\n" +
            "njkxyjn (12)\n" +
            "kvpju (39)\n" +
            "gyyqk (5845) -> jeshqdv, xzhvvy, ynwpoz, jtlhia, gzykr, coyroy, tqjpfzx\n" +
            "jwpqgy (168) -> jxanwhq, fsixon, lnsyuz\n" +
            "jwxff (95) -> ihtomiz, xeprhhl\n" +
            "yycux (15)\n" +
            "fmhjs (79)\n" +
            "wvieaw (67)\n" +
            "iancjuu (39)\n" +
            "vczcept (112) -> muavtro, ipeig\n" +
            "mwtusu (81)\n" +
            "moewgvz (89)\n" +
            "gmfktbe (31)\n" +
            "dcpnyer (67) -> fmjyudw, wuhyc, icccxzg, nufpcxh\n" +
            "hnfeims (47)\n" +
            "rouiui (30) -> tqlentr, zdkil, veqahi, txnzg, euiig, qlmojkv\n" +
            "bppos (37)\n" +
            "hoauxku (219)\n" +
            "ficmghd (56)\n" +
            "lxpshey (95)\n" +
            "hglhjt (13)\n" +
            "oqbet (58)\n" +
            "bsmxm (88) -> trcbs, ewsrnsd, qzsowpu\n" +
            "dxerl (79) -> kdujkg, njkxyjn\n" +
            "gxhia (18)\n" +
            "eqifs (3869) -> aqjkcss, uiwgpi, cmeqx, jwlaj\n" +
            "hqipq (60)\n" +
            "upbmqk (18)\n" +
            "culvtcm (97)\n" +
            "cgdbu (90)\n" +
            "tnrpi (241) -> zjtid, xybcccw\n" +
            "hlullj (39)\n" +
            "ihcbt (44)\n" +
            "wfjgqqm (55)\n" +
            "dmzwm (86)\n" +
            "hvtvcpz (81171) -> dxcpj, eqifs, mdfbhs\n" +
            "uufrda (39)\n" +
            "lsfdgam (77)\n" +
            "huutnfp (57) -> blrzef, ihllda\n" +
            "vnmxsi (17)\n" +
            "tjbyhjw (161) -> ihcbt, tlxbtng, cxlip\n" +
            "fshvy (84) -> indgw, gynwftf\n" +
            "agsjzih (10)\n" +
            "ppdsem (63)\n" +
            "skmvkj (33)\n" +
            "oxyxy (205) -> aawxzzs, tdnzc\n" +
            "ywavdk (67)\n" +
            "pkxhxdz (70) -> gklur, vqekr, fnvgp\n" +
            "xsufhnb (66)\n" +
            "ouhfxyf (97)\n" +
            "dukqd (50) -> opyzwha, sfxsn, ndcjr, uystf\n" +
            "zybvpry (20)\n" +
            "wwobe (34)\n" +
            "bolxwme (74) -> jfvquxv, rsqexkv\n" +
            "adhilml (299) -> cqfri, mhassfj\n" +
            "icrnru (160) -> gutukz, fuega\n" +
            "oagluxi (40)\n" +
            "ligpl (6)\n" +
            "fttsg (255) -> gmfktbe, ebtbnei\n" +
            "ihtomiz (99)\n" +
            "gblxcsj (251) -> kuaeh, pmfpitp\n" +
            "lrvxyg (91) -> lfgmv, ohtzuf\n" +
            "wuhyc (71)\n" +
            "qjuud (160) -> ckexdc, oencfz\n" +
            "jbfzjha (305) -> vbmhjxo, txvuv, mkyqul, zehnmg\n" +
            "xjosf (89) -> dfdgoj, xagwh, xkpulvc, tnrpi\n" +
            "zkcwgx (22)\n" +
            "ilbopwx (87)\n" +
            "akatbi (222) -> qjazr, pizkx\n" +
            "uxuscb (249) -> jpeprwv, mdrir\n" +
            "hbgyu (19007) -> nqcadtp, tkeoe, jvpecm\n" +
            "kjzsi (56)\n" +
            "cduzde (13)\n" +
            "edoftkj (84)\n" +
            "lxisjl (86) -> euqvd, hugfkt\n" +
            "owxuzp (26)\n" +
            "nalhhj (4471) -> dkfepj, wjfsiec, egrga, dkxsqjt\n" +
            "vcaekf (67)\n" +
            "evwne (21) -> czztmlk, fmqon, fzzcxvm, rmdqvgh\n" +
            "crojfnw (171)\n" +
            "upiow (82) -> hukskkk, ilbopwx\n" +
            "srgua (120) -> koyke, hvefi\n" +
            "rcywun (81) -> moewgvz, fchlc\n" +
            "qlkqplv (138) -> hsulvq, ghuoa, ozwaa\n" +
            "czxbmp (197) -> ieeqmzl, yzivqv, arbebt\n" +
            "jjmyu (80)\n" +
            "cyfuwdb (40) -> mywmo, nppdvs, fwafvkf\n" +
            "hmdwqdq (79)\n" +
            "oencfz (10)\n" +
            "pjkjcy (20)\n" +
            "sxxhmpb (8)\n" +
            "uwpwbgy (213) -> gbiluq, xidye\n" +
            "mywmo (40)\n" +
            "rbmmiy (833) -> rwbhl, vtono, shkfk, umwial\n" +
            "dmvajb (50)\n" +
            "smuybnw (89) -> uktqwa, vdistyb\n" +
            "uagezb (984) -> hdvfyp, kwtukd, ikbkb\n" +
            "nrlvovz (840) -> qoipc, oznhe, uvhmzj, kebff\n" +
            "vbmhjxo (5)\n" +
            "ckafg (86)\n" +
            "ovqhdvy (2715) -> psnkhtd, zxqix, trnjhsl\n" +
            "uktqwa (90)\n" +
            "lzhdsyq (55)\n" +
            "kofvzz (66)\n" +
            "mcduq (60)\n" +
            "qnsnc (62)\n" +
            "kwtukd (232) -> nhzmidl, bfrbwb\n" +
            "zzavd (13)\n" +
            "fmjyudw (71)\n" +
            "vcnph (161) -> wqgpm, nnvpkf\n" +
            "lgamzp (64)\n" +
            "ukqcayx (92)\n" +
            "diduy (116) -> xwphya, msdff\n" +
            "izonhi (99)\n" +
            "jetfvjc (16)\n" +
            "rjhfcl (308)\n" +
            "vqqrb (179) -> jfaoy, jhgxtg\n" +
            "tulxdf (308) -> bcukkvc, zgydn\n" +
            "rxuqpgb (144) -> aqogxi, aicncxc\n" +
            "spyxh (32)\n" +
            "yqergs (100) -> kitsxb, woeoaa\n" +
            "bthswyg (34)\n" +
            "rfaxua (81) -> zugxr, dtyxosg\n" +
            "fcoxtp (42) -> aqqdnpb, nkgmg\n" +
            "jbxnffu (74)\n" +
            "bwthm (929) -> jwxff, ohiftl, aqtml\n" +
            "ionnnfx (97)\n" +
            "urigx (141) -> xsmgj, eyozeel\n" +
            "nsggol (249)\n" +
            "mgeseyn (267) -> hvacjk, pvgay\n" +
            "eqzuic (37)\n" +
            "pxdgkik (83)\n" +
            "zjqbfd (188) -> viklkmp, vfcbliu\n" +
            "wivwqm (74)\n" +
            "nowyhln (52)\n" +
            "sqsqge (219) -> amaeuv, paqvyfa\n" +
            "vynvu (87)\n" +
            "ovysqnt (86)\n" +
            "brfocu (230) -> zicvvl, zbhahq, agsjzih, ydhfmt\n" +
            "dgumiir (40) -> olzdhtj, inezd, kqrjpgl\n" +
            "vpjhl (27)\n" +
            "aqqdnpb (88)\n" +
            "qaszsa (94)\n" +
            "ajeisgv (95)\n" +
            "aoscme (73)\n" +
            "owlyge (65)\n" +
            "kdqslsn (73)\n" +
            "hukskkk (87)\n" +
            "vindf (73) -> szuiho, aoscme, fbdfh\n" +
            "kosxb (140) -> tcpujhx, itlsv\n" +
            "oeaqbvl (142) -> bsyiv, fiqzxhc\n" +
            "lyigbhi (105) -> pqmye, nzyiue\n" +
            "trnjhsl (73) -> iinql, yhzwdu, dtjzr\n" +
            "mkucbvs (138) -> ikxewmm, qhygx\n" +
            "fvplhrm (6)\n" +
            "qnvzqc (54)\n" +
            "jdbub (48)\n" +
            "opyzwha (75)\n" +
            "xeprhhl (99)\n" +
            "xounvb (101) -> mbqkm, zwpyj\n" +
            "aswpgvv (42)\n" +
            "razvskj (60626) -> dlzgufq, xwifd, nalhhj, lyhok\n" +
            "ygrbgm (172)\n" +
            "tcrkcu (329) -> ibdiplp, efbffd\n" +
            "mijxl (63)\n" +
            "ajfkd (9)\n" +
            "aaaak (6) -> mdopg, mzrafi\n" +
            "qgnah (42)\n" +
            "emppnct (78)\n" +
            "qysdgq (154) -> uutlw, klpctiz\n" +
            "hkewsbw (89)\n" +
            "lcfundi (52)\n" +
            "iccpjfn (92)\n" +
            "modzqb (30)\n" +
            "nsqzndf (51)\n" +
            "dpyuayl (18) -> wvieaw, cpacyeu, hwkwp\n" +
            "eocoy (67)\n" +
            "fbuklc (82) -> lcyuk, klzfl\n" +
            "ieeqmzl (32)\n" +
            "qcoyrha (255) -> kjqiop, oagluxi\n" +
            "lbfgh (123) -> obaorae, yktqkyl\n" +
            "payoa (194) -> khbvu, nrxoha\n" +
            "ywutc (71)\n" +
            "fodud (178) -> axmjgih, auvla\n" +
            "actggv (65)\n" +
            "jngcap (845) -> tydlqpq, ebdxuo, ktfeae\n" +
            "hcgbmwl (60)\n" +
            "lqirhg (70965) -> hbmxey, tlhgrte, xekggcw, lxffhxk, knhst\n" +
            "ifntl (26) -> emfbheo, heicvby, vcnph, qvgeei, gcylwr, uxuscb, ubrrbmk\n" +
            "uiasar (15)\n" +
            "sfkzoax (46)\n" +
            "bqtppn (236) -> xqnrp, fsguvid\n" +
            "peomyg (16)\n" +
            "sqincn (80)\n" +
            "zjtid (7)\n" +
            "cpvlq (72)\n" +
            "nwbmwa (17)\n" +
            "yjonn (185) -> rbhdx, cbnef, bvgfpab, czojwyg\n" +
            "jafdtcn (79)\n" +
            "uqofam (245) -> lxpshey, qwdppks\n" +
            "nkejtw (56)\n" +
            "tcihaf (28)\n" +
            "jwkgg (17)\n" +
            "hsftfol (46)\n" +
            "ehqavsc (22) -> aboilvw, diavsdh, nuybvi, ziyyvk, wyule, mtxzcd, tulxdf\n" +
            "dyveac (96) -> jdsdqzd, lhmjc\n" +
            "yfztc (74)\n" +
            "nuybvi (452)\n" +
            "ymfosm (38) -> hdkpuyx, ckafg, dmzwm\n" +
            "vrjea (1809) -> stcaf, hemnmbr, zuxvjpc\n" +
            "qteruty (8) -> mwtusu, pvpyhb\n" +
            "cpmcrx (13)\n" +
            "ouxjkf (18)\n" +
            "rvuktmb (147) -> yhlbg, cwgbjaq\n" +
            "blrzef (81)\n" +
            "guxwd (49)\n" +
            "yyyqzje (225) -> fnfiur, jfngjl\n" +
            "qbkipp (92)\n" +
            "wdlwryo (149) -> nxhetg, iltti\n" +
            "tjdap (240)\n" +
            "udxegjf (44) -> lzbbin, atfpsi, tuqzsn, ytnti, zdade, skotajh\n" +
            "aeliqqs (26)\n" +
            "shkfk (183)\n" +
            "adueu (372)\n" +
            "zbhahq (10)\n" +
            "jbtzoy (80)\n" +
            "pkcakwk (300)\n" +
            "hwkwp (67)\n" +
            "gatxz (45)\n" +
            "qizvid (38)\n" +
            "cbqebx (152) -> ornybn, zcfswa\n" +
            "ppmjzx (267) -> whlfwr, sfkzoax, csqyn\n" +
            "rwuxn (23)\n" +
            "pcdtne (6) -> fbuhz, alqog, hanbscg, fttsg, gblxcsj, cujhtj, adhilml\n" +
            "fvfitqc (39)\n" +
            "rgfur (104) -> aswpgvv, qgnah\n" +
            "jhgxtg (57)\n" +
            "pkotpki (86)\n" +
            "ujzjt (92)\n" +
            "zkikhk (16)\n" +
            "skotajh (328)\n" +
            "ycinfxk (1450) -> kosxb, cwvkon, nyxiai, bztor\n" +
            "gnffzh (234) -> tiiwbg, sfoivjz\n" +
            "juvwj (79)\n" +
            "ckcaugr (62) -> zebdkqz, xuxlspe\n" +
            "gjfkx (31)\n" +
            "blome (73) -> jjmyu, bljfcim\n" +
            "yqctq (28)\n" +
            "gpzaa (68) -> sqfopc, lxxfgli, yyyqzje, cjkoxak\n" +
            "qoipc (68) -> tjcpka, oydoajo\n" +
            "olhuxt (7)\n" +
            "zdade (166) -> oyfob, bvock\n" +
            "ihllda (81)\n" +
            "sbklnq (85)\n" +
            "yyblsz (54) -> nrmvc, dszjyr, bppos, tahstqe\n" +
            "qenjyl (79)\n" +
            "zukgdrx (79)\n" +
            "fszrgv (34)\n" +
            "ulezwmd (56)\n" +
            "xgogpx (23)\n" +
            "gwxkdy (46)\n" +
            "knhst (5583) -> ghjpcv, szvrql, ojtrl\n" +
            "mblvffb (79)\n" +
            "qowyx (56)\n" +
            "yablonq (18)\n" +
            "mwfryd (93) -> mldkiku, sveuu, kzjfme, kzwbhrg\n" +
            "xjafd (17)\n" +
            "njgzn (97)\n" +
            "jpeprwv (12)\n" +
            "lnnii (18)\n" +
            "tsetywu (22)\n" +
            "gdutjjl (73)\n" +
            "lnsyuz (27)\n" +
            "qyypm (417) -> uqofam, xtvyh, ajpujs\n" +
            "uutlw (75)\n" +
            "cbnef (15)\n" +
            "gikqie (90) -> qpwfl, pxhbe, yxcbn, lftlpr\n" +
            "nkuesm (60)\n" +
            "znpqzc (53) -> ekxdjlp, skvytv, nkuesm, ajtkddh\n" +
            "mszwp (53) -> qaszsa, tupro, otljqmh\n" +
            "stcaf (54) -> cufaveh, foblbqu\n" +
            "nmlykny (112) -> uitef, lsfdgam\n" +
            "frlmoih (92)\n" +
            "hqvvrd (34) -> juvwj, ayafxml\n" +
            "unzzng (22)\n" +
            "xucelzn (49) -> jumdfk, ilzwrk\n" +
            "nyjmiyq (91)\n" +
            "zfjpii (181) -> btjxv, rfhjgxy, digfyo\n" +
            "vyvcb (4479) -> jsniger, rbmmiy, zvildgh, kvtvmi, ogiie\n" +
            "fwqru (62)\n" +
            "skvytv (60)\n" +
            "ujogppt (95)\n" +
            "mgzotal (125) -> frgot, sjcbxp\n" +
            "ytpiey (83)\n" +
            "bfqba (872) -> vopeoj, gfknji, iwdesog, qteruty, lxisjl\n" +
            "foblbqu (20)\n" +
            "bzlgar (37)\n" +
            "dszjyr (37)\n" +
            "nrpyfqd (39) -> nihmyu, acjtwvt\n" +
            "vgvvr (66)\n" +
            "hzsgvc (8)\n" +
            "lddiw (7)\n" +
            "ydhfmt (10)\n" +
            "uspvnv (94)\n" +
            "seazs (92)\n" +
            "zrydf (108) -> zzavd, ppbevc\n" +
            "pkglsge (93)\n" +
            "oamrbi (33)\n" +
            "bendlfs (92)\n" +
            "rkgxu (88)\n" +
            "fqhag (2673) -> vangx, crojfnw, njrzjdt\n" +
            "wesyh (26)\n" +
            "jbaazop (19)\n" +
            "tgvdjhh (72)\n" +
            "ebdxuo (242)\n" +
            "xthhlfy (61) -> jafdtcn, kbout\n" +
            "vlthh (88)\n" +
            "sqfrw (830) -> ppmjzx, vixlf, ryskzh, ynkkomw\n" +
            "kzjfme (55)\n" +
            "heicvby (145) -> akrsjfc, lnhiiq\n" +
            "cuaect (114) -> ftdkas, jwgjnuu\n" +
            "oyjtku (93)\n" +
            "eyozeel (99)\n" +
            "rfhjgxy (227)\n" +
            "eoasnfq (94) -> idszh, vshekb\n" +
            "phgkg (30)\n" +
            "dxgnqsj (34)\n" +
            "egrga (1130) -> nrpyfqd, cfmhi, uwpwbgy, zqtok\n" +
            "sljgt (1013) -> iifltp, igfjvkm, rxefab\n" +
            "bszcup (56)\n" +
            "kkyfjh (83)\n" +
            "frvmu (143) -> xdnuvji, vwhynu\n" +
            "fsbojm (41)\n" +
            "mavbgo (91)\n" +
            "digfyo (188) -> tkejpfe, ynirne, swsffrv\n" +
            "xoyjtol (59)\n" +
            "qvbuj (1045) -> dgumiir, ofnmnyy, mkucbvs\n" +
            "dzetsz (1418) -> nsbli, ulxsa, krdlzf\n" +
            "zguqo (92) -> ripgc, oenrkia\n" +
            "klgsk (6)\n" +
            "yktqkyl (45)\n" +
            "jhcurc (50)\n" +
            "teuzi (57)\n" +
            "gfknji (26) -> nwyftp, vgndgst\n" +
            "gcylwr (221) -> wesyh, lsycscb\n" +
            "hxaza (7)\n" +
            "asoirn (74)\n" +
            "ofnmnyy (36) -> sziwpzi, zyxjqs\n" +
            "xobyzo (60)\n" +
            "azdklp (43)\n" +
            "mcfst (47)\n" +
            "vwqog (43)\n" +
            "tupro (94)\n" +
            "lytukj (25)\n" +
            "roqnodm (92) -> qbbmsf, oxewutr, pdcaqbr\n" +
            "axmjgih (65)\n" +
            "ezztp (87)\n" +
            "luuxtc (2600) -> qfkka, dxznun\n" +
            "pvzyops (94) -> oiyxr, ffrilz, upiow\n" +
            "adasbyp (237) -> kdqslsn, xantdh\n" +
            "iaiywwa (1850) -> nhxfu, boiic, kqgqdyg\n" +
            "zdkil (214) -> cemygp, bgctgn\n" +
            "pslyfi (7) -> ilydn, birahww, yfztc\n" +
            "wbllfh (43) -> xwmnaj, gprznw\n" +
            "drnyyes (66)\n" +
            "coyroy (175) -> oevvote, zzwtuu, klyso, pirivl\n" +
            "ddkgzi (19)\n" +
            "btbses (88)\n" +
            "mhassfj (9)\n" +
            "rbhdx (15)\n" +
            "kfhwxyy (17)\n" +
            "ozwaa (78)\n" +
            "lhmjc (32)\n" +
            "lftlpr (11)\n" +
            "ncaoc (58)\n" +
            "zacywmu (12)\n" +
            "vixlf (45) -> cgdbu, djmoed, npfkpts, eisrj\n" +
            "vwtmps (142) -> jljnags, qizvid\n" +
            "fsguvid (33)\n" +
            "gxdtiob (203) -> vbisx, gzter, bzkwsro\n" +
            "xwphya (82)\n" +
            "jtujnwo (37)\n" +
            "wyule (401) -> nwbmwa, pvpqoq, jwkgg\n" +
            "wpgyc (96)\n" +
            "jbvugg (224) -> dxgnqsj, fsfuluo\n" +
            "tojnst (160)\n" +
            "jeshqdv (1303) -> affxphr, lyhxuh, zkcwgx, cqdtav\n" +
            "icncbl (48)\n" +
            "kqiraxg (54)\n" +
            "aicncxc (29)\n" +
            "zbedu (209)\n" +
            "pdmsm (57)\n" +
            "kictlpo (37)\n" +
            "brkux (335)\n" +
            "zrbkrdx (41)\n" +
            "otljqmh (94)\n" +
            "kcreb (48) -> ihuzl, bvaor, popymuq\n" +
            "muavtro (98)\n" +
            "ayypg (56)\n" +
            "vdistyb (90)\n" +
            "euvkg (203) -> mgwauar, lazlx\n" +
            "ayafxml (79)\n" +
            "bnvjmae (7)\n" +
            "ogpka (80)\n" +
            "gnrqrsj (2189) -> ortcrq, upbmqk\n" +
            "rxefab (131) -> vcaekf, sqnfwo\n" +
            "pgpnvo (931) -> eahos, kcreb, lwefm, bbdimns\n" +
            "bphrvm (64)\n" +
            "doazn (211) -> siswh, hhvqa\n" +
            "sawqp (32)\n" +
            "mwdvbr (68)\n" +
            "mtboq (76)\n" +
            "dxcpj (93) -> afcgdxg, kzwgln, wkydaz, spkeqv, udxegjf\n" +
            "lyhxuh (22)\n" +
            "iuovz (88)\n" +
            "csear (1969) -> fnijmph, mgzotal, evmblgk\n" +
            "rojhup (7)\n" +
            "ebtbnei (31)\n" +
            "lhnevgo (269)\n" +
            "zibbm (85)\n" +
            "nrmvc (37)\n" +
            "txxpej (280) -> actggv, krqxe\n" +
            "lhvtmoo (130) -> icncbl, zbtck\n" +
            "wgwkss (80)\n" +
            "aawxzzs (22)\n" +
            "aarioi (79)\n" +
            "cabsaub (60)\n" +
            "otymybu (223) -> ddkgzi, viafs\n" +
            "cbgfg (58)\n" +
            "wcinck (20) -> ziwkz, wfeupmd, drszzbe, mgeseyn, xasioks, xtjrkv\n" +
            "orkcq (65) -> iujqo, ehdax\n" +
            "okfcek (97)\n" +
            "ybbrr (247)\n" +
            "iatmtm (55) -> lwxts, mqecf, tuhxr\n" +
            "yyxmp (80)\n" +
            "ysvjxvz (78)\n" +
            "birahww (74)\n" +
            "mxxfu (57) -> qdovgra, ywlrls, wahwi, mzjwcds, axrojbs, urigx\n" +
            "xbqpjo (98)\n" +
            "kqmhotc (94) -> rkuyxrc, wfjgqqm, xdylc\n" +
            "qwtodu (71)\n" +
            "qdxteam (61) -> ybbrr, frrvvai, ncjhpa, onuxzz, jvepbal, qznpwb\n" +
            "fbiqxqk (59)\n" +
            "rokie (9708) -> vmgqltz, qdxteam, srvwd, qvbuj, pgpnvo, hxjhcuc\n" +
            "ovmvvkl (24) -> tvhgbau, exgsmmj, uwvbon\n" +
            "qnxnatu (92)\n" +
            "hrkswsk (44)\n" +
            "ndodv (296)\n" +
            "koemv (92)\n" +
            "hfqjj (37)\n" +
            "yexyj (80)\n" +
            "fhlul (56)\n" +
            "dzzbvkv (64)\n" +
            "gmhxee (74)\n" +
            "jbgqlat (65)\n" +
            "qclpa (84)\n" +
            "indgw (91)\n" +
            "krqxe (65)\n" +
            "lmmeg (26) -> ummcw, zqhdiwz\n" +
            "bgmwpam (68)\n" +
            "wpfbdof (151) -> sbutyr, klgsk\n" +
            "qznpwb (153) -> vfmwzb, haicg\n" +
            "hdpemqh (168) -> txxpej, pwvmmda, gadyi, mvhqou\n" +
            "gpfaupm (13)\n" +
            "iqfmvz (67)\n" +
            "pdcaqbr (97)\n" +
            "qfkow (64)\n" +
            "exhxs (89)\n" +
            "zebdkqz (44)\n" +
            "rrtqyew (191) -> zbxakfn, ajfkd\n" +
            "ukrki (39)\n" +
            "hvacjk (69)\n" +
            "udfuty (32)\n" +
            "mrgccl (85)\n" +
            "uzily (82) -> swscfel, apzabs\n" +
            "lxffhxk (1245) -> bfqba, cpxgct, rouiui, qyypm\n" +
            "jfngjl (86)\n" +
            "ceevpgx (47)\n" +
            "sziwpzi (65)\n" +
            "pqmye (57)\n" +
            "phkvcix (90) -> nubay, jaamgi\n" +
            "gxcnp (27)\n" +
            "wmwzhjg (73)\n" +
            "miuvc (283)\n" +
            "nvtbk (1775) -> srgua, ckcaugr, xrapmvb\n" +
            "zfthi (60)\n" +
            "inezd (42)\n" +
            "irzuowk (90) -> ayqgp, zruqij, oqbet, fdckzry\n" +
            "zuxvjpc (62) -> mbunh, mgvoh, bfxezgb, sxxhmpb\n" +
            "wmyvz (59)\n" +
            "tqjpfzx (47) -> gjupqe, lwhev, bxhjjd, fmquyhw\n" +
            "xhwfcu (75)\n" +
            "tnltvzk (90) -> cevkjvr, hrmpq\n" +
            "uhepxt (60)\n" +
            "sjixg (25)\n" +
            "kuaeh (33)\n" +
            "uwvbon (79)\n" +
            "jzoue (94)\n" +
            "hdspavt (60)\n" +
            "kosgqpu (50)\n" +
            "mznkfco (79)\n" +
            "xfanpad (60)\n" +
            "zcpyr (81)\n" +
            "gutifk (228)\n" +
            "scipnb (53)\n" +
            "ejvaoj (59)\n" +
            "ybuhf (50)\n" +
            "bpmkexj (166) -> mbokr, ytbtswy\n" +
            "ogafygg (39)\n" +
            "fooowuf (42)\n" +
            "yiwdaj (86) -> iwajy, aftsom\n" +
            "hoelsa (64)\n" +
            "cjvdngb (91) -> qedkzuz, vtamjj\n" +
            "rsqexkv (70)\n" +
            "ftqtzxk (43)\n" +
            "azgjimy (92)\n" +
            "bochc (39)\n" +
            "qfsue (35)\n" +
            "objqgkm (146) -> tsiuz, glguoq\n" +
            "tatjry (47)\n" +
            "tcpujhx (55)\n" +
            "nnvpkf (56)\n" +
            "gatdr (89)\n" +
            "jcmviuv (37)\n" +
            "pzhyoh (3960) -> bkset, bfwbkxq, zsdvfrk, wrobpcw, ffxnegs, ifntl\n" +
            "svyojyu (60) -> qslgo, ukqcayx\n" +
            "sxbusu (73)\n" +
            "jtikaai (194) -> yukoxaw, qftqq\n" +
            "nkgmg (88)\n" +
            "zolmsue (66)\n" +
            "ziyyvk (60) -> yuypmb, ctoxz, dcwpsvy, mxrfq\n" +
            "bgcjrf (80)\n" +
            "qlqqlq (350)\n" +
            "npsza (74)\n" +
            "eahos (19) -> ywavdk, iqfmvz\n" +
            "cpxgct (14) -> tabzzo, svyojyu, pynxen, idooz, nzorg, zudqkt, fsvkj\n" +
            "nxrkz (1541) -> gutifk, avqjqdf, mgyfdm\n" +
            "twzgms (43)\n" +
            "uwizfa (88)\n" +
            "tiush (60)\n" +
            "cqpns (123) -> tfnem, kqguihx\n" +
            "necmih (10) -> dppzdx, zvelptp, tpsgt\n" +
            "ehxkgh (172) -> bthswyg, lbojqfo\n" +
            "yxoqwg (80)\n" +
            "emfbheo (85) -> uspvnv, oermd\n" +
            "siisskc (13)\n" +
            "icccxzg (71)\n" +
            "pjvpqmg (64)\n" +
            "dxxty (64884) -> ljugvh, gyyqk, pzhyoh\n" +
            "neladb (11)\n" +
            "polrzc (59)\n" +
            "snvqyqb (66)\n" +
            "lebqr (60)\n" +
            "shfjyzk (68)\n" +
            "acdkw (1907) -> apzjw, ialtabg, cjvdngb\n" +
            "xdylc (55)\n" +
            "hknzmvs (93)\n" +
            "obrwb (64)\n" +
            "werriw (13)\n" +
            "jjjfkf (19)\n" +
            "zqckoxe (118) -> vynvu, zgnwz\n" +
            "mgvoh (8)\n" +
            "oxewutr (97)\n" +
            "qqydcts (62)\n" +
            "pjkwlmk (56) -> etdofb, qqydcts\n" +
            "kzwbhrg (55)\n" +
            "cgzyc (669) -> bqtppn, rwjzc, bwylliz, rrkhcl\n" +
            "sltrdk (88) -> qwtodu, rpkpa, kddchk, xirqz\n" +
            "aqjkcss (77) -> rfaxua, nsggol, uxlcvt, jwpqgy, tjobe, ovrkpd\n" +
            "xagwh (99) -> sdigtox, pocxfrt, iancjuu, iefyz\n" +
            "apjxafk (1513) -> rznyr, oamrbi\n" +
            "uturjs (85)\n" +
            "qwxrsa (261)\n" +
            "cgjula (2020) -> lhvtmoo, yiwdaj, biwdu\n" +
            "yakzm (16)\n" +
            "ejtoqaj (1426) -> whggku, ktehtif, wpfbdof\n" +
            "eoaprcr (93)\n" +
            "otaty (141) -> ydpihb, ouabc\n" +
            "rjijdre (17)\n" +
            "atfpsi (196) -> qoqydb, vgvvr\n" +
            "qjazr (21)\n" +
            "petluuh (67)\n" +
            "xdupyte (19)\n" +
            "rpkpa (71)\n" +
            "aytjryx (25)\n" +
            "pfmor (80)\n" +
            "rfbdpc (66) -> payoa, ymfosm, ndodv, thutxib, objqgkm, gjjfju\n" +
            "kkciirc (71)\n" +
            "hfnijbd (234) -> qarjx, olhuxt\n" +
            "mrvdvga (54)\n" +
            "vwhynu (20)\n" +
            "nnsyc (59)\n" +
            "rlwvuj (280)\n" +
            "vtono (37) -> gdutjjl, eqahcc\n" +
            "jdjaem (74)\n" +
            "hgcxyx (13)\n" +
            "mkjvhl (282) -> neladb, tsrrzuc\n" +
            "cmeqx (521) -> uzprmq, xjmrcc, qlqqlq\n" +
            "fffxc (74)\n" +
            "sbutyr (6)\n" +
            "jikzxd (50)\n" +
            "zvildgh (1079) -> wtoive, rbucosf, eoasnfq\n" +
            "unfgdb (91)\n" +
            "npdwg (80)\n" +
            "ftdkas (33)\n" +
            "ewdpntl (66)\n" +
            "akrgdse (63)\n" +
            "vczudlu (17)\n" +
            "ablvgzq (58)\n" +
            "kbout (79)\n" +
            "aqogxi (29)\n" +
            "igfjvkm (265)\n" +
            "rkbtnzd (40)\n" +
            "jatvkwy (92) -> kqiraxg, vsyuckp, zwjds, mrvdvga\n" +
            "mjuwde (888) -> cbqebx, kihxgg, zjqbfd\n" +
            "ytbtswy (57)\n" +
            "rugzyaj (16029) -> apjxafk, jngcap, wrtyhxg, hblcbb\n" +
            "fuega (70)\n" +
            "lejoaru (64)\n" +
            "zvelptp (28)\n" +
            "mdfbhs (5185) -> miymiit, jjgem, gpzaa\n" +
            "xwifd (7225) -> rfbdpc, qqduoo, uagezb\n" +
            "bxhjjd (172) -> yacaqwf, ngksxux\n" +
            "xduga (88)\n" +
            "rwbhl (183)\n" +
            "cpazla (101) -> ayypg, kjzsi\n" +
            "ttmei (19)\n" +
            "hblcbb (5) -> qwxrsa, ovmvvkl, orkcq, otymybu, sjxbk, frqtkkr\n" +
            "lzbbin (250) -> ujzofuy, urwgjd\n" +
            "bgctgn (34)\n" +
            "uaqik (15)\n" +
            "kvpztt (93)\n" +
            "zeopgv (312) -> pgznzly, ixwyi, tefcd\n" +
            "oyfob (81)\n" +
            "yhzwdu (28)\n" +
            "xwmnaj (41)\n" +
            "ngksxux (82)\n" +
            "brmtxo (300)\n" +
            "kdujkg (12)\n" +
            "cjlxgf (165) -> bsoef, rkbtnzd\n" +
            "tefcd (13)\n" +
            "jsniger (680) -> lycpdcu, iihzs, aubhuwo, xucelzn, qykoae\n" +
            "thutxib (138) -> mblvffb, zukgdrx\n" +
            "npfkpts (90)\n" +
            "yqbkjg (51)\n" +
            "tsiuz (75)\n" +
            "otvvje (43)\n" +
            "boxvu (18)\n" +
            "etnuzv (27)\n" +
            "fkmccg (32)\n" +
            "zzxlo (2220) -> zhiai, oqhwa, irzuowk\n" +
            "haicg (47)\n" +
            "veqahi (50) -> yugjkuz, ncaoc, hfjhadi, cmzoogc\n" +
            "uystf (75)\n" +
            "wqxcn (292) -> ddrrgp, sxvlfn, ipmbqts\n" +
            "jlbhafs (27)\n" +
            "lvuzab (74)\n" +
            "hrfyodg (84)\n" +
            "apctfnv (246) -> baygmx, zacywmu\n" +
            "wafjawl (56)\n" +
            "dlsss (88) -> mijxl, voonmio\n" +
            "nlrobhq (87)\n" +
            "jzdmjdf (1849) -> aaaak, necmih, fmifd, kowco\n" +
            "yzivqv (32)\n" +
            "cufudi (97)\n" +
            "zwjds (54)\n" +
            "pizkx (21)\n" +
            "fbdfh (73)\n" +
            "cwvkon (193) -> cepqh, jjjfkf, xdupyte\n" +
            "wqgpm (56)\n" +
            "vopeoj (14) -> sgqaiyz, ysvjxvz\n" +
            "zqtok (151) -> fhgnht, fooowuf\n" +
            "fugeht (89)\n" +
            "mgyfdm (60) -> mvvgro, hrfyodg\n" +
            "wqdvql (39)\n" +
            "ogiie (573) -> hfnijbd, cxokosi, jtikaai, ffgoyk\n" +
            "tgqpp (89)\n" +
            "fdaddso (15)\n" +
            "cmzoogc (58)\n" +
            "gjjfju (270) -> kndcyxb, cpmcrx\n" +
            "wowkfnh (64)\n" +
            "lwefm (115) -> ageyuq, jbaazop\n" +
            "qykoae (61) -> cbgfg, dyfhy\n" +
            "ipeig (98)\n" +
            "iyjcoy (63)\n" +
            "omzpkv (23)\n" +
            "kqguihx (48)\n" +
            "qrtwjv (37)\n" +
            "sgqaiyz (78)\n" +
            "gzdxgvj (64)\n" +
            "wfeupmd (65) -> pdjnnzd, mrgccl, uturjs, yfszfef\n" +
            "vmgqltz (841) -> ecabcm, vigvho, ppfyonm\n" +
            "txvuv (5)\n" +
            "zfcylzq (113) -> ocbxx, kofvzz\n" +
            "vigvho (76) -> vtnpx, hjdms\n" +
            "njrzjdt (171)\n" +
            "iyflfx (90)\n" +
            "spkeqv (1828) -> qbkipp, bendlfs\n" +
            "dqiyfw (21) -> mliwyi, kvpztt, oyjtku\n" +
            "nufpcxh (71)\n" +
            "ppbevc (13)\n" +
            "bljfcim (80)\n" +
            "hjdms (79)\n" +
            "mcfrv (19)\n" +
            "zruqij (58)\n" +
            "gmurq (89)\n" +
            "zyqqzou (78)\n" +
            "pyocxtt (27)\n" +
            "akrsjfc (64)\n" +
            "nzorg (102) -> bdukt, kkciirc\n" +
            "vobfi (734) -> lbfgh, wfbuzbg, kklix, hpsxqdm, lhtzrh, cpazla, skhmac\n" +
            "zugxr (84)\n" +
            "ldwhpl (324) -> takkbk, thneyz\n" +
            "kzwgln (1217) -> evwne, lrvxyg, hllzej\n" +
            "heuyaxx (2337) -> iatmtm, pabgfh, oryrq\n" +
            "kzjkjz (17)\n" +
            "ykmej (92)\n" +
            "sqfopc (33) -> mavbgo, uucyyr, nyjmiyq, tygst\n" +
            "qcpuch (270)\n" +
            "qcolnc (11) -> ewdpntl, zolmsue, lunbob\n" +
            "tfxyjz (87)\n" +
            "fiqzxhc (38)\n" +
            "hvhtokr (95)\n" +
            "ledgpb (132) -> kqltx, wivwqm\n" +
            "bonnse (30)\n" +
            "dcwpsvy (98)\n" +
            "xjmrcc (268) -> yucwtc, ilueo\n" +
            "bzkwsro (49)\n" +
            "zziyhz (18)\n" +
            "qoqydb (66)\n" +
            "ubrrbmk (87) -> pkglsge, gjorp\n" +
            "cgnibii (188) -> pqvid, uiasar\n" +
            "sxvlfn (23)\n" +
            "gqgewi (2538) -> ndxuv, egulpbe\n" +
            "qosqq (47)\n" +
            "jkczp (37)\n" +
            "pxhbe (11)\n" +
            "vpjmvzd (37)\n" +
            "rvjzxtg (86)\n" +
            "pfzqe (89)\n" +
            "uvhmzj (114) -> bphrvm, lgamzp\n" +
            "gklur (85)\n" +
            "wbbfe (37)\n" +
            "wkumzkr (1049) -> nxtyiha, modzqb\n" +
            "pyhqixj (63)\n" +
            "ohtzuf (87)\n" +
            "lsycscb (26)\n" +
            "bdsibf (87)\n" +
            "gzter (49)\n" +
            "ogelzdv (87)\n" +
            "fstzdn (97)\n" +
            "ebktv (146) -> gpfaupm, cduzde\n" +
            "iinql (28)\n" +
            "tdurwbh (58)\n" +
            "hnvybq (268)\n" +
            "sfxsn (75)\n" +
            "jgdumgz (87)\n" +
            "zqhdiwz (96)\n" +
            "rznyr (33)\n" +
            "ouqwmnj (265) -> jdbub, evqrr\n" +
            "tiuag (62) -> xhbjag, bmehz\n" +
            "fdckzry (58)\n" +
            "hdkpuyx (86)\n" +
            "hemnmbr (16) -> ukrki, mgsasl\n" +
            "rupdbwl (43)\n" +
            "bbdimns (57) -> upftju, iracqt\n" +
            "ipdbccy (34)\n" +
            "fbrvfk (79)\n" +
            "hueqfk (85)\n" +
            "bxrkfwo (67)\n" +
            "fwafvkf (40)\n" +
            "nsbli (47) -> hpanc, xjafd, uqjmbb, ycnih\n" +
            "ifhpy (79)\n" +
            "fneqe (1219) -> vmatvgx, bofjde, hhnpg\n" +
            "mliwyi (93)\n" +
            "utqxb (37)\n" +
            "fvivhx (75) -> nwlyt, dyxcd\n" +
            "whggku (97) -> vomrnc, ceqfbbl\n" +
            "kndcyxb (13)\n" +
            "ynwpoz (785) -> raioiq, yyblsz, rxuqpgb\n" +
            "hrrampl (27)\n" +
            "kkftjia (87)\n" +
            "rvxed (122) -> rktkzfw, qfsue\n" +
            "miauii (66) -> kpjxln, icrnru, dqiyfw, brmtxo, pkcakwk\n" +
            "bkset (857) -> brfocu, thvjlgo, urhwog, apctfnv\n" +
            "nhxfu (35) -> lwufmc, gatxz\n" +
            "skhmac (101) -> dbnstqf, wafjawl\n" +
            "bdwswow (65)\n" +
            "lgoak (70)\n" +
            "mdrob (51)\n" +
            "fsixon (27)\n" +
            "hcyohc (85)\n" +
            "kihxgg (44) -> awhwxdm, sbgtiqe\n" +
            "hdhvzi (1759) -> kzhpyr, apvfi\n" +
            "bwylliz (110) -> kwvybk, ftexc\n" +
            "xijwk (841) -> bsmxm, xrise, uzjoys\n" +
            "xkpulvc (93) -> fbvvrqt, zcpyr\n" +
            "xhbjag (76)\n" +
            "azrpi (92)\n" +
            "lxxfgli (49) -> nlrobhq, ogelzdv, tfxyjz, bdsibf\n" +
            "qedkzuz (45)\n" +
            "bmehz (76)\n" +
            "exgsmmj (79)\n" +
            "ijcxfx (136) -> jbgqlat, bdwswow\n" +
            "nsvrfae (71)\n" +
            "offas (58)\n" +
            "ipofw (15)\n" +
            "matcdld (35)\n" +
            "gjorp (93)\n" +
            "bofjde (152) -> jcuiffa, vvkbav\n" +
            "yxqesmi (172)\n" +
            "eisrj (90)\n" +
            "pjmci (59)\n" +
            "palqky (60)\n" +
            "aipmq (41)\n" +
            "ripgc (44)\n" +
            "ehdax (98)\n" +
            "jtlhia (749) -> tiuag, bdbxp, dlsss\n" +
            "uucyyr (91)\n" +
            "dtqbtvx (223) -> izyjved, etnkepp\n" +
            "yhlbg (41)\n" +
            "kwvybk (96)\n" +
            "fhgnht (42)\n" +
            "ummcw (96)\n" +
            "khkuxc (1254) -> qqhjlu, gekcx, vrajpg, emppnct\n" +
            "nwlyt (87)\n" +
            "txnzg (74) -> lcfundi, tifkr, imfog, imbpvgl\n" +
            "dkzitf (20)\n" +
            "bdbxp (80) -> fcvpdiz, bxrkfwo\n" +
            "degnsd (177) -> eetxll, jkczp, ghzqyv, kictlpo\n" +
            "zudqkt (142) -> fszrgv, wwobe, jbjkp\n" +
            "zjcdwr (249) -> bqcizg, saiyjff\n" +
            "sjthmr (76)\n" +
            "kryoh (144) -> jcmviuv, hfqjj\n" +
            "ghuoa (78)\n" +
            "uitef (77)\n" +
            "cjkoxak (340) -> sowzlz, ttmei, lajyaur\n" +
            "pczkz (88)\n" +
            "itlsv (55)\n" +
            "nwztmzp (63)\n" +
            "tsrrzuc (11)\n" +
            "rxrzt (65) -> krembdy, zrbkrdx, aipmq\n" +
            "frqtkkr (185) -> qecgvu, lbjuqcd, mcfrv, kwqcbe\n" +
            "mdrir (12)\n" +
            "vytdgko (97)\n" +
            "tkeoe (865) -> wzcgi, awsphe, ifhpy\n" +
            "orwbp (96) -> ecjujqu, iccpjfn\n" +
            "ckexdc (10)\n" +
            "popymuq (35)\n" +
            "euiig (166) -> ablvgzq, tdurwbh\n" +
            "ibjbozh (895) -> ijcxfx, nmlykny, fshvy, nutlr, yotlucw\n" +
            "idszh (34)\n" +
            "tfnem (48)\n" +
            "kqrjpgl (42)\n" +
            "ewsrnsd (90)\n" +
            "rnsxz (9718) -> pvzyops, zfjpii, luccp\n" +
            "avqjqdf (50) -> dilefzx, dulpw\n" +
            "euqvd (42)\n" +
            "dulpw (89)\n" +
            "nppdvs (40)\n" +
            "gncvcwi (104) -> pfmor, yyxmp\n" +
            "fmquyhw (188) -> hwqvzw, huspq\n" +
            "hpgktb (60) -> hcgbmwl, tiush\n" +
            "iyxkzat (49)\n" +
            "seyed (86)\n" +
            "zzwtuu (260) -> unzzng, ebsxx\n" +
            "nfvsrpa (876) -> kwwhb, blome, otaty, dtqbtvx\n" +
            "mnwhky (1339) -> hqccsb, ldflo, rgfur, rxrzt\n" +
            "kebff (242)\n" +
            "cogovv (74)\n" +
            "takkbk (57)\n" +
            "yyswun (98)\n" +
            "ecjrblb (68)\n" +
            "ycawl (224) -> vpjmvzd, bzlgar, jtujnwo\n" +
            "dppzdx (28)\n" +
            "alcpfsx (136) -> siyuvy, nowyhln\n" +
            "dfdgoj (153) -> aufym, pfxrf\n" +
            "jcuiffa (56)\n" +
            "yjyipdp (66)\n" +
            "ilueo (41)\n" +
            "iazte (201) -> tsetywu, zkzefwh\n" +
            "diavsdh (326) -> wladmn, zudqxa, ajpcyv\n" +
            "llofnny (66)\n" +
            "kitsxb (59)\n" +
            "kqltx (74)\n" +
            "klzfl (93)\n" +
            "tpdcb (84)\n" +
            "afcgdxg (1202) -> qcpuch, njmrq, tnltvzk\n" +
            "gnwjseo (600) -> pkxhxdz, jbfzjha, ixdcgsa, degnsd, fwtfkp\n" +
            "yqnbqgc (178) -> dkzitf, zybvpry\n" +
            "ialtabg (21) -> jbtzoy, sqincn\n" +
            "uorpbn (353) -> ygbyt, afjmzb\n" +
            "jdhiflw (60)\n" +
            "qpwfl (11)\n" +
            "xasioks (405)\n" +
            "lajyaur (19)\n" +
            "ajpujs (271) -> zxzkl, dkgsvl\n" +
            "ovrkpd (147) -> sdzoy, mdrob\n" +
            "sveuu (55)\n" +
            "jtvntr (83)\n" +
            "pvgay (69)\n" +
            "boiic (80) -> ipofw, ggjmhab, mwjtydb\n" +
            "sjcbxp (59)\n" +
            "uvzwdly (20)\n" +
            "sbgtiqe (91)\n" +
            "luzcpkn (43)\n" +
            "ndxuv (80)\n" +
            "tkejpfe (13)\n" +
            "ggjmhab (15)\n" +
            "szvrql (46) -> cnknlru, zrydf, cvvtz, uwiza, gikqie, lknchr\n" +
            "lvkpx (233) -> wmyvz, nnsyc\n" +
            "bhzbv (28) -> azgjimy, frlmoih, azrpi\n" +
            "cujhtj (193) -> qhbotj, qnsnc\n" +
            "vmatvgx (90) -> uaavvo, ezztp\n" +
            "pvpyhb (81)\n" +
            "mdpcfvu (176) -> gyktq, yyswun\n" +
            "aubhuwo (99) -> yyqleqa, nmdhmy\n" +
            "wgglzpb (191) -> gmurq, hkewsbw\n" +
            "amaeuv (58)\n" +
            "ijleirw (172) -> jikzxd, yeewxiw, jhcurc, kosgqpu\n" +
            "tvhfxfo (105) -> wnzdcc, bszcup\n" +
            "kzvwk (74) -> ujogppt, appkqpe\n" +
            "qgxcbt (68)\n" +
            "ipmbqts (23)\n" +
            "woeoaa (59)\n" +
            "yfszfef (85)\n" +
            "ickxyrm (87) -> hrxfpx, owlyge\n" +
            "mjlmuca (41)\n" +
            "iracqt (48)\n" +
            "dtyxosg (84)\n" +
            "vyaoad (83) -> tojpm, euaceg, zhffrzu\n" +
            "jemmk (47) -> mwdvbr, shfjyzk\n" +
            "viafs (19)\n" +
            "iefyz (39)\n" +
            "wkydaz (332) -> orwbp, xhhfsuw, ledgpb, rlwvuj, bpmkexj, diduy\n" +
            "zhiai (228) -> qosqq, ceevpgx\n" +
            "aydmhhv (87)\n" +
            "vtamjj (45)\n" +
            "egabi (79)\n" +
            "zgnwz (87)\n" +
            "kvtvmi (39) -> fpmwz, oeaqbvl, oipjwtz, usevgds, vwtmps, kryoh, gkzeqaw\n" +
            "sszzop (89)\n" +
            "uaavvo (87)\n" +
            "xtvyh (83) -> pczkz, xydxl, xduga, gycde\n" +
            "fpgciql (51)\n" +
            "ynkkomw (279) -> iyjcoy, ijiqjtf\n" +
            "yirkbjn (1872) -> wjjar, ldwhpl, kcimi\n" +
            "paqvyfa (58)\n" +
            "khbvu (51)\n" +
            "jvpgl (20)\n" +
            "sxslizl (86)\n" +
            "gbpcav (77)\n" +
            "kjqiop (40)\n" +
            "ulxsa (115)\n" +
            "nhzmidl (27)\n" +
            "nchjk (37)\n" +
            "yokqfgn (94)\n" +
            "qwdppks (95)\n" +
            "fnijmph (90) -> yqbkjg, ykvtr, fpgciql\n" +
            "xucdiz (6) -> kkyfjh, cxjyxl\n" +
            "ftexc (96)\n" +
            "krembdy (41)\n" +
            "gzykr (1135) -> lejoaru, qfkow, wowkfnh, pjvpqmg\n" +
            "srrxb (81)\n" +
            "ylwniqh (68)\n" +
            "usuujhq (46) -> pkotpki, seyed, jgkmy\n" +
            "ilfgats (6031) -> mxxfu, vrjea, mnwhky\n" +
            "urxxlfo (84) -> juakl, bwywt\n" +
            "fsfuluo (34)\n" +
            "staqwo (8)\n" +
            "ynirne (13)\n" +
            "zyonam (217) -> sofxmjx, ytpiey\n" +
            "ornybn (37)\n" +
            "jvepbal (79) -> cqiipxn, qclpa\n" +
            "goicjt (41)\n" +
            "bfpvsfz (39)\n" +
            "zbxakfn (9)\n" +
            "cqdtav (22)\n" +
            "cufaveh (20)\n" +
            "zxqix (157)\n" +
            "zudqxa (42)\n" +
            "fcvpdiz (67)\n" +
            "kzhpyr (59)\n" +
            "cuwqi (104) -> jotxc, teuzi\n" +
            "mdopg (44)\n" +
            "pyntdrr (320) -> lbiigt, aeliqqs\n" +
            "ouabc (46)\n" +
            "wnzdcc (56)\n" +
            "wvkaie (80)\n" +
            "axrojbs (239) -> aytjryx, xbpqmua, sjixg, lytukj\n" +
            "lcyuk (93)\n" +
            "tdnzc (22)\n" +
            "wrobpcw (1196) -> fujvp, gfuxooq, crkapwa\n" +
            "hyfswg (1414) -> rcywun, kqmhotc, xvwqzt, bbsomm\n" +
            "yugjkuz (58)\n" +
            "tokvgmd (91)\n" +
            "yyqleqa (39)\n" +
            "pmfpitp (33)\n" +
            "nhxmab (24)\n" +
            "hwqvzw (74)\n" +
            "hntdp (90)\n" +
            "nercz (33)\n" +
            "kvjqli (72) -> tpdcb, edoftkj\n" +
            "zdrfiw (80)\n" +
            "viklkmp (19)\n" +
            "evmblgk (183) -> yycux, buifcn, uaqik, fdaddso\n" +
            "wzcgi (55) -> hzsgvc, staqwo, fgxst\n" +
            "baygmx (12)\n" +
            "mxscf (62)\n" +
            "oqhwa (186) -> gcbvf, bgmwpam\n" +
            "sflwom (253) -> uvzwdly, pjkjcy, rcongvf\n" +
            "ajrcal (83)\n" +
            "yqyyoj (33) -> lftlc, npcyutn\n" +
            "tpsgt (28)\n" +
            "ebsxx (22)\n" +
            "aceiy (13)\n" +
            "jwlaj (1031) -> qjuud, tdtznh, cuaect\n" +
            "hvefi (15)\n" +
            "nxtyiha (30)\n" +
            "mzjwcds (229) -> icqsww, pitdti\n" +
            "ndxim (6)\n" +
            "vomrnc (33)\n" +
            "vfmwzb (47)\n" +
            "jidxg (64)\n" +
            "aqtml (293)\n" +
            "cevkjvr (90)\n" +
            "lycpdcu (5) -> rvjzxtg, ovysqnt\n" +
            "thmlk (34)\n" +
            "iujqo (98)\n" +
            "synjm (51)\n" +
            "paqlttl (65)\n" +
            "kklix (25) -> jzoue, yokqfgn\n" +
            "usevgds (44) -> aydmhhv, kkftjia\n" +
            "tqlentr (214) -> gfxnuuk, thmlk";
}
