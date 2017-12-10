/*
 * Created by Pierre Jimenez
 */
package adventofcode2017;

/**
 *
 * @author piecar
 */
public class AdventOfCode2017 {

    public static void main(String[] args) {
        int dayOfAdvent = Integer.parseInt(args[0]);

        String input ="wdysq (135) -> sxldvex, wiasj\n" +
                "vjwuuft (33) -> inuci, neddz, rwamq\n" +
                "oislgqy (77)\n" +
                "lphki (233)\n" +
                "wgbviwb (417)\n" +
                "vikip (136) -> eofyk, dkexo, xzsxx\n" +
                "elmieqh (19) -> dbziu, spefs, krtxpw\n" +
                "tmzef (79)\n" +
                "ectlgy (232) -> zmstcy, ncobxr\n" +
                "sdatyo (91)\n" +
                "uisri (11)\n" +
                "smqimxg (132) -> husor, olzys\n" +
                "pltzthr (82)\n" +
                "szaqj (188) -> ptnndxj, fljpye\n" +
                "jqdngi (58)\n" +
                "uazwsu (15)\n" +
                "xrrhso (79)\n" +
                "gxeehd (68) -> iweii, rnqlzmv, hpmtom, vfzwqfr, xfzxrd, sgqhelx, hibjkps\n" +
                "evkoenr (43) -> oecxbyt, qbthgst\n" +
                "qivuzn (52)\n" +
                "udeev (389) -> lphki, qthzk, hpgsb\n" +
                "izgqzs (96) -> vbxzk, ubrrdtd\n" +
                "naxtp (65)\n" +
                "mvtkwn (42)\n" +
                "sxldvex (34)\n" +
                "tnlpmw (49)\n" +
                "rzbrbmy (31) -> dvnqv, helyy\n" +
                "esavxwq (81)\n" +
                "yqgru (465) -> gfuyuz, elmieqh, xckzut, tmbhjxf\n" +
                "ygypj (1303) -> ohcuki, ejdjxu, ytabct\n" +
                "yggqq (855) -> gowlaq, ebtoxi, xpljwl\n" +
                "ubaxya (92)\n" +
                "pjkzokv (23)\n" +
                "lvarp (76)\n" +
                "yrysmsi (14)\n" +
                "nofepy (23)\n" +
                "apjeywv (132) -> kclmmu, exsugls\n" +
                "licrtwb (56)\n" +
                "gspffet (84) -> wqzxa, lptaikg\n" +
                "gkrqba (82)\n" +
                "mqreb (126) -> jvdoo, paykww\n" +
                "xtidu (12)\n" +
                "kjauagn (88)\n" +
                "vvafqjs (56) -> qbvhefh, vfhgfb, iqtyv, ebdva, uxqkau, tydtcxc\n" +
                "snuewn (118024) -> vvafqjs, mhaucon, kikva, mqnbmre\n" +
                "gtkii (163) -> txcon, vuvwa\n" +
                "oaoisa (61)\n" +
                "ssqrs (24)\n" +
                "ybditq (21)\n" +
                "xgqxofa (119) -> bedzc, hdbkw, zwgsh\n" +
                "wxfir (71)\n" +
                "pxvse (19)\n" +
                "xemcuk (23)\n" +
                "paunv (28) -> zzvhmse, mubkcmk, vksephm, cbsdget, mellhhn\n" +
                "couhjsv (11)\n" +
                "tuzpls (58)\n" +
                "puomwl (90) -> wtxjnc, jdjbnc\n" +
                "wudlze (78)\n" +
                "ibslyw (153) -> ksncpee, npvuz\n" +
                "zzmczwl (54)\n" +
                "kidvt (3136) -> tuzzzct, qtqhwon\n" +
                "patlvg (20)\n" +
                "yvvxtg (90)\n" +
                "epxwjhy (22)\n" +
                "epvyxld (17)\n" +
                "xhecnbf (85) -> yituewe, wwhyd\n" +
                "mqsrwsz (26)\n" +
                "bhyzi (73)\n" +
                "batky (18815) -> woctu, iykjtnw, tpiwftj\n" +
                "sdponx (44)\n" +
                "qhotyqx (95) -> vdwfz, agthd, tuwedv, ixkkdyc, lnlkwq, bvmhqar, rlwmfp\n" +
                "nubqteb (89)\n" +
                "zygfdu (70)\n" +
                "tkerz (18)\n" +
                "solqvvf (10)\n" +
                "akiaxs (86)\n" +
                "jsfqyd (70)\n" +
                "aialff (68)\n" +
                "uiilkiq (73)\n" +
                "adlyhbs (46)\n" +
                "tnljdhr (20)\n" +
                "frctm (471) -> isqnx, euhgw, nrfqc, cmmnjch, zevrg\n" +
                "jjklma (105) -> xrrhso, uyjor\n" +
                "lpmnwh (56) -> orrfh, bqfzqra\n" +
                "owxski (23)\n" +
                "gqxyh (18)\n" +
                "lpyntz (91)\n" +
                "ivvyjos (81)\n" +
                "qssjswr (268)\n" +
                "jkbks (225)\n" +
                "jwbdb (83)\n" +
                "axqrke (119) -> mgoic, yivgs, bxggi, xamfjfv\n" +
                "uwizlce (24)\n" +
                "wuwhup (50)\n" +
                "suawycj (60)\n" +
                "wazvn (99)\n" +
                "wtxjnc (53)\n" +
                "ebtoxi (64) -> ttbns, voxychz, umsdpa, ajjmsnw\n" +
                "uuhoydu (82) -> gvucdh, hesyq, glwsf\n" +
                "tshyvej (1373) -> ebiovn, uvzpp, pblqb\n" +
                "bhakbq (991) -> izqxal, nhhytw, flmma, isgky, coqek\n" +
                "hcsjun (60) -> inelfwo, qcnstq, eymmhh, lpyntz\n" +
                "otjbn (67) -> szaqj, kkhlzm, jtzdqn\n" +
                "vtwud (10735) -> jldhlug, ikfzj, tsevkec\n" +
                "heztht (86)\n" +
                "rqonynk (65) -> olzqxap, oyhqsok\n" +
                "esbdjah (61)\n" +
                "hdinwud (1515) -> bdiftdg, ydtuje, aambg\n" +
                "rbbjcq (71)\n" +
                "kimffjc (155)\n" +
                "wifrwut (91)\n" +
                "hrlgs (9)\n" +
                "ieowdj (76)\n" +
                "vpqsjbj (147) -> eziosif, rptcpf\n" +
                "rlurjca (51) -> gtbjtpi, ohpkkhx, zkwnhn, cagvlf, zvlobk, ahsqaob, iactix\n" +
                "yzykfd (43) -> atqfhm, kazwz\n" +
                "kikva (6131) -> gkpalaj, jafrv, uekzf\n" +
                "lsoen (51)\n" +
                "uexqjw (10923) -> dxczurt, omqhf, ylfxp, qofsaux\n" +
                "nlnphv (117) -> vzlzrt, ypiwnt\n" +
                "bemxocu (78)\n" +
                "etcsuuv (312)\n" +
                "ihwbmt (27)\n" +
                "oorvvpt (63)\n" +
                "dvnqv (88)\n" +
                "ntlawn (60)\n" +
                "jhaow (45)\n" +
                "kccpv (17)\n" +
                "kbybvzk (89)\n" +
                "ctcmfv (49)\n" +
                "ujqjrz (89)\n" +
                "xekft (62)\n" +
                "wihtv (1278) -> qgbbhdv, adlyhbs\n" +
                "agthd (158) -> ucnehpw, hnutx\n" +
                "vuytzn (21)\n" +
                "svcqds (7)\n" +
                "emqqf (5)\n" +
                "uqddsal (17) -> trait, sdatyo\n" +
                "uhwlk (252) -> sxtto, qyvsaxn\n" +
                "ttbgzv (46) -> rokri, pygoqsv\n" +
                "oecxbyt (71)\n" +
                "xunvu (33)\n" +
                "mvbtomp (35)\n" +
                "uxqkau (693) -> qubhi, gneut, htmcpcy, qmncyu, wdysq\n" +
                "ycrnaf (177) -> ssqrs, twimkx\n" +
                "nlalji (28)\n" +
                "dgvvo (37)\n" +
                "niydqsy (33)\n" +
                "pprvv (89)\n" +
                "tmbhjxf (135) -> jutep, vkhiz\n" +
                "iaftm (63)\n" +
                "zjnrzph (81) -> gsxmqnw, gnxfwv\n" +
                "ggzqccl (5)\n" +
                "wwtiby (121) -> kytha, dgzywn\n" +
                "zismp (58)\n" +
                "hjbrfba (28)\n" +
                "xnlkkx (79) -> puomwl, xnbvupf, hgksz\n" +
                "bptaz (38)\n" +
                "ozaogat (15)\n" +
                "hxxml (27) -> emazu, kproiw\n" +
                "xpptslq (76)\n" +
                "ilohfvn (10)\n" +
                "hadddf (128) -> geapi, ocltuv\n" +
                "gtprqg (17)\n" +
                "qofsaux (209) -> bbnjml, fwskxq\n" +
                "xpljwl (128) -> ufust, aialff\n" +
                "thhbhrm (41) -> smqkli, ovtfd\n" +
                "xamfjfv (36)\n" +
                "jdjbnc (53)\n" +
                "kecpcmj (72)\n" +
                "ixkkdyc (80) -> wutzrk, antev\n" +
                "ysnbr (35)\n" +
                "cyvwwa (190) -> jtqxxa, pgmtcg, btvsj\n" +
                "uyjor (79)\n" +
                "oztxmy (76)\n" +
                "cancxr (213) -> ivdvlvq, ykxalh\n" +
                "zlads (14)\n" +
                "peokkb (167) -> mqkqtjo, qpchzkg, epssvr, yzose\n" +
                "iauxpc (81)\n" +
                "qbodszw (945) -> rgdvqu, oktgjb, abstvp\n" +
                "dmwutl (73) -> desuqj, etjwno\n" +
                "fcaht (134) -> ajidd, kigxtt\n" +
                "fkgkcwd (51) -> mqwagy, gvtve, djvbdm, ckapp, ldiqm, ezspaq, pyrvg\n" +
                "dqzkic (1032) -> inglhm, dgxdydd, hxhhhu\n" +
                "ydtykm (75)\n" +
                "zatfy (35)\n" +
                "rmenjck (89)\n" +
                "nrfqc (238) -> zgxjjm, fwide\n" +
                "schexn (97)\n" +
                "lrplxk (22)\n" +
                "nroecsv (44)\n" +
                "kiawm (64)\n" +
                "zpfuxux (73)\n" +
                "mvdkbch (28)\n" +
                "sufdte (71) -> gfjeud, rbbjcq\n" +
                "xmjunhp (45)\n" +
                "wsnsqx (7)\n" +
                "etyaxa (13)\n" +
                "cfrqn (57)\n" +
                "tslujme (60)\n" +
                "bebuqpx (33)\n" +
                "wwyuud (11)\n" +
                "gtotarq (95)\n" +
                "vtopekt (65)\n" +
                "hxhhhu (230)\n" +
                "aubvpzf (73)\n" +
                "kllsasv (73) -> enuvuv, jlhipos, hittl, smyzyqg\n" +
                "mgiuz (94)\n" +
                "dsytvn (296) -> mxfonyo, yihru\n" +
                "icsxziz (256)\n" +
                "agflbq (73)\n" +
                "amtrbok (12)\n" +
                "qcebc (20)\n" +
                "eymmhh (91)\n" +
                "pbpva (95)\n" +
                "rodxm (199) -> rzvlc, vnmml, rrmlgct\n" +
                "ekblpi (97) -> flwbwcq, ecwpa, usgpgi, pknsw, gkjwl, zzfom\n" +
                "ltpmtif (86)\n" +
                "bkfnip (4873) -> murnoa, qhzem, udeev\n" +
                "yhiab (249) -> sdponx, yvattv\n" +
                "hbaai (70) -> rmnkup, dgtsic\n" +
                "anazjn (225)\n" +
                "zjjyjj (101) -> viwez, ihwbmt, qnwwjwt\n" +
                "husly (98)\n" +
                "jlhipos (20)\n" +
                "xflsc (2516) -> qodow, vdkhvyp, masvpfj\n" +
                "cenqs (156) -> jhaow, mivmhi\n" +
                "rgrcla (84) -> nroecsv, pexfst\n" +
                "pdddwgk (30)\n" +
                "upefkx (75)\n" +
                "abstvp (46) -> wqgoxl, gbwaobo\n" +
                "glzmsn (93)\n" +
                "bgtzw (37)\n" +
                "flvrfdl (146) -> ybditq, vuytzn, yqdaz\n" +
                "jmzpxql (47)\n" +
                "wulvcf (89)\n" +
                "mxfonyo (20)\n" +
                "aambg (69)\n" +
                "jfjvw (32)\n" +
                "uslhk (8)\n" +
                "wwzjdv (45)\n" +
                "zwtsg (248) -> bjjtifj, ogbov\n" +
                "mbxyf (56)\n" +
                "xckzut (157) -> gaalz, upefkx\n" +
                "trseebo (18)\n" +
                "hbcpm (32)\n" +
                "ggoaczz (88)\n" +
                "zangrh (66)\n" +
                "ktbto (55) -> pdqzfg, mfoismz, mkirruz\n" +
                "rhpcgg (197) -> evkoenr, klpzhup, cigew\n" +
                "kbbcau (25)\n" +
                "porttu (92) -> haaqbj, lttlp\n" +
                "gfsgzni (73)\n" +
                "pyaqqhu (134) -> kdkobz, szvocp\n" +
                "eiyiuq (54)\n" +
                "fjgjfpc (17)\n" +
                "lvvkjx (56)\n" +
                "kinah (22)\n" +
                "ivdvlvq (31)\n" +
                "njerlzh (35)\n" +
                "zzdae (63)\n" +
                "rrkbjhn (78)\n" +
                "hnutx (50)\n" +
                "oqokji (198)\n" +
                "voxychz (50)\n" +
                "zovlqz (56)\n" +
                "ulood (81)\n" +
                "yzttfu (15)\n" +
                "htmcpcy (203)\n" +
                "jmytuxi (221) -> dvuctqv, sgilmx, fqdolnu, rdrncg\n" +
                "rehhbv (17)\n" +
                "ixkpaf (59) -> jqbdh, atvtit, qcebc\n" +
                "antev (89)\n" +
                "jfikdf (20)\n" +
                "ykxalh (31)\n" +
                "vqwclk (19) -> ewldimp, wkeqlvj, ouxuh\n" +
                "hxeqn (528) -> kimffjc, qpgphk, vqfiq\n" +
                "umsdpa (50)\n" +
                "aodfzpi (69)\n" +
                "wutzrk (89)\n" +
                "jyjvpeb (81)\n" +
                "ttbns (50)\n" +
                "wmewl (977) -> yhiab, iordzi, uuhoydu\n" +
                "ydejjeb (159) -> yvcanc, jrrubn\n" +
                "bykuuwe (80)\n" +
                "iesjhoq (336) -> bhzfx, sxexfai, mjounwc\n" +
                "kdrhj (1832) -> rrkbjhn, gzpgvqq\n" +
                "smyzyqg (20)\n" +
                "kigxtt (80)\n" +
                "rokvo (7)\n" +
                "wpcng (50)\n" +
                "koevsvb (97)\n" +
                "yihru (20)\n" +
                "krtglj (18)\n" +
                "cmfwwv (40)\n" +
                "jsaujq (1397) -> rgrcla, vqwclk, rxilrp\n" +
                "gmjxxi (97)\n" +
                "ekvmhd (49)\n" +
                "lttlp (66)\n" +
                "takbkro (200) -> ngjipr, inhfutj\n" +
                "whvpgmw (54)\n" +
                "lqaveh (97)\n" +
                "qthzk (187) -> wntmkg, pjkzokv\n" +
                "haaqbj (66)\n" +
                "vxufrto (40)\n" +
                "zseldo (181) -> hdvtd, papbxya\n" +
                "psmgm (95)\n" +
                "clwtgt (34)\n" +
                "bpwxvvw (89)\n" +
                "pmyrysb (77)\n" +
                "gjclsl (75)\n" +
                "olzys (57)\n" +
                "woqoljk (99)\n" +
                "ocodtdz (30) -> gjclsl, ogioyhi\n" +
                "nbybi (54)\n" +
                "veiaf (139) -> vlqqgb, iaftm\n" +
                "uvzpp (165) -> mxvba, jjtafg\n" +
                "qodow (63) -> oqxnfd, rpxaf, sybnvtp\n" +
                "kouye (58)\n" +
                "dlhuell (84) -> schexn, otzinx\n" +
                "nlrlj (145) -> veknoj, lfpjfv, yrlnu, ugelox\n" +
                "sambc (138) -> mnoinr, pkordz\n" +
                "bypqww (50)\n" +
                "rgkfzk (35)\n" +
                "kiatxq (1232) -> dispgy, irnjtjo, iqpoc\n" +
                "gigtu (60)\n" +
                "xzsrv (89)\n" +
                "dhafpel (636) -> vxddev, nxkpnt, zbuftv\n" +
                "bqfzqra (71)\n" +
                "rcbqqok (243) -> ofrogun, wwyuud\n" +
                "oaqkk (69)\n" +
                "dgxdydd (132) -> mudewqe, bazwto\n" +
                "vxddev (128) -> bzpjiss, qmjamoi\n" +
                "iqtyv (800) -> lvtotof, zddmrx, yzykfd, nlnphv\n" +
                "vdcmrrr (93) -> xuoyxmc, amrcopl, fcnsfy\n" +
                "jutep (86)\n" +
                "cyanr (23)\n" +
                "cxyxa (97)\n" +
                "tuzkv (153) -> iflll, tipewrj\n" +
                "cdegn (52)\n" +
                "mvijo (35)\n" +
                "xnbvupf (60) -> frlgjzf, wtorpp\n" +
                "rwopuzo (15)\n" +
                "uxfsb (76)\n" +
                "qedyqs (157) -> bjzbqzq, alfqryh\n" +
                "rwhgw (76)\n" +
                "csmjozb (79) -> sasym, wmewl, kdrhj, btvmyff, sqkfgo, jcputh\n" +
                "jbujmr (294)\n" +
                "xvjfw (8)\n" +
                "ekfwu (17)\n" +
                "ebiovn (225) -> mnufo, rokvo\n" +
                "ohcuki (197) -> alsfpfg, xsfryrh\n" +
                "zavisuv (15)\n" +
                "glwsf (85)\n" +
                "vurdlqx (196) -> acfdkr, aefjv\n" +
                "ihksnmq (95)\n" +
                "ecwpa (248) -> soyta, ytomr\n" +
                "jldhlug (234)\n" +
                "oazfz (61)\n" +
                "rdrncg (16)\n" +
                "rrrmaka (51)\n" +
                "qhgzopn (66) -> tmzef, iiiupn\n" +
                "ifetn (86)\n" +
                "plgjg (99)\n" +
                "okjds (73)\n" +
                "algkwbg (99)\n" +
                "ugmhzm (56)\n" +
                "vvnhm (135) -> ntrtfv, ihuqmbd\n" +
                "csuywzh (1788) -> wgvpotf, fwtxvo, vikip, bpzhj, bomuft, otjbn, zsotrv\n" +
                "pawpvkj (47)\n" +
                "zzvkwsb (148) -> hjfucl, gxcft\n" +
                "aivbhtz (78)\n" +
                "nyckm (23)\n" +
                "qwqpht (68)\n" +
                "kbuurtb (62)\n" +
                "ahexrp (19)\n" +
                "dlikiv (247) -> kinah, sthtydb\n" +
                "udiai (50)\n" +
                "lopnwz (91)\n" +
                "xbtvux (73)\n" +
                "gvtve (222) -> typbqmw, vdsaccd, sdlta, uisri\n" +
                "vczyhcg (8)\n" +
                "edswttn (58)\n" +
                "kqaua (89)\n" +
                "lmnuii (536) -> rlwoz, gjvmrh, ukapl, lthoz, boahhv, ylpxahm, rqonynk\n" +
                "kwlyw (193) -> hcruo, kecpcmj\n" +
                "trskdr (322) -> hdrfo, bimxf\n" +
                "clbmn (33)\n" +
                "scffzsr (48)\n" +
                "ewldimp (51)\n" +
                "qhixu (21) -> roorbg, oruhqn, psmgm\n" +
                "ypcup (94)\n" +
                "vrszijz (56)\n" +
                "vksephm (157) -> ngkax, tkerz\n" +
                "sxtto (30)\n" +
                "tkojiz (12)\n" +
                "elygt (569) -> bixtvg, xsqbapj, ocodtdz\n" +
                "vdctvf (84) -> iauxpc, cuyweja\n" +
                "rktxkyb (108) -> xjbot, flwjj\n" +
                "zckdwxe (54)\n" +
                "vfzwqfr (54) -> mphzxio, clbmn, donnc, niydqsy\n" +
                "iqpoc (260) -> zlads, jhapr\n" +
                "pojst (51)\n" +
                "ueitm (169) -> emqqf, qqstwmn\n" +
                "dgzywn (39)\n" +
                "ldcmzd (130) -> mertvs, ggoaczz\n" +
                "xtgmmc (306)\n" +
                "mjounwc (9)\n" +
                "ftbiwxy (62)\n" +
                "ogioyhi (75)\n" +
                "fkitgnx (69)\n" +
                "gvucdh (85)\n" +
                "opsrep (43)\n" +
                "olsycb (59)\n" +
                "jiizacd (49)\n" +
                "qbthgst (71)\n" +
                "nxqvwm (69)\n" +
                "rvrzp (113) -> xrqhewm, ifetn\n" +
                "pkordz (84)\n" +
                "vempqu (6)\n" +
                "ulmwqtm (230)\n" +
                "zwgsh (43)\n" +
                "srgob (561) -> plrig, djbtbrk\n" +
                "rmnkup (47)\n" +
                "btvmyff (1442) -> mrqtrkq, zjjyjj, uqkskjn\n" +
                "nrfyua (11)\n" +
                "nuozixg (1064) -> nnelc, zmzobfp, oggljxs\n" +
                "icrvj (22)\n" +
                "vksphlf (1423) -> kdykksn, wwtiby, uqddsal\n" +
                "xmnbar (58)\n" +
                "ukapl (195)\n" +
                "lijszmh (44)\n" +
                "zzonk (28)\n" +
                "jhapr (14)\n" +
                "mrqtrkq (88) -> zaxbfog, pawpvkj\n" +
                "aibtig (109) -> ggzqccl, hyxtojc\n" +
                "vuvwa (87)\n" +
                "ahysv (90)\n" +
                "mqwagy (88) -> uxlisdh, rmenjck\n" +
                "xpttnwd (95)\n" +
                "oullg (25) -> dlhuell, imrwgqw, hadddf, rktxkyb, zwtsg, wllrov\n" +
                "bwsgfa (22)\n" +
                "vmiykci (153)\n" +
                "jcgvp (18) -> mvbtomp, zatfy\n" +
                "wetluzb (33)\n" +
                "zvnzrr (37)\n" +
                "sgilmx (16)\n" +
                "geabygu (96)\n" +
                "kakvi (41)\n" +
                "fuujiy (92) -> xnfuz, urrhqwc, fmdfm\n" +
                "ppvsy (285)\n" +
                "nyuxiu (122) -> nzvqjrt, dhzsao\n" +
                "tjwynpa (75)\n" +
                "gowlaq (138) -> uwvfga, bnvlydl\n" +
                "snywwu (26) -> snqey, aodfzpi\n" +
                "cvude (41)\n" +
                "snqey (69)\n" +
                "ejqam (17)\n" +
                "pgmtcg (47)\n" +
                "rtcqml (85) -> zangrh, dspug\n" +
                "ezspaq (215) -> rehhbv, epvyxld, oguxu\n" +
                "ytabct (89) -> frfotet, zerxp\n" +
                "nxkpnt (248)\n" +
                "qubhi (107) -> lnznpq, scffzsr\n" +
                "tfotbwz (424)\n" +
                "wkgyfpp (824) -> ccbie, iesjhoq, kdffrsb\n" +
                "wjsxcmb (95)\n" +
                "ztdbvxb (53) -> zismp, dqoagdt, yxfjglq, givaxj\n" +
                "ouxuh (51)\n" +
                "xfzxrd (22) -> kakvi, mjlvx, wridnv, zeexkde\n" +
                "rekerpj (7)\n" +
                "redkli (81)\n" +
                "qdkhjb (53)\n" +
                "yituewe (95)\n" +
                "ocnkhq (10)\n" +
                "iaayhc (300) -> fwhhoz, ycrnaf, jkbks, anazjn, yhzjjgc, pocwgw\n" +
                "mjlzzq (212) -> hwycny, gmzabjk\n" +
                "rhaoo (36) -> kdzhiq, ydkhmp, dsytvn, wzezz\n" +
                "fqkzcq (293) -> gztng, oiaxzp\n" +
                "essijo (1248) -> wuqapgg, msmxf\n" +
                "ckapp (94) -> clktah, akiaxs\n" +
                "nktwwvp (159) -> qivuzn, cdegn\n" +
                "qxwdzl (50)\n" +
                "lfpjfv (48)\n" +
                "lmfclbd (14)\n" +
                "cglyptu (240) -> icrvj, epxwjhy, tpmqmg\n" +
                "dhzsao (24)\n" +
                "bckfa (16) -> ntlawn, tslujme, ccjze, woklobt\n" +
                "mivmhi (45)\n" +
                "bfjxeyo (24)\n" +
                "plrig (53)\n" +
                "ijlooi (1429) -> jcgvp, zvsgd, fzafkj\n" +
                "pyhcj (64)\n" +
                "gdvbtjk (71)\n" +
                "fxrkz (70)\n" +
                "husor (57)\n" +
                "riiaj (44) -> lvvkjx, mbxyf\n" +
                "lxmvg (4738) -> msjbv, ijoaqyv, yname\n" +
                "wntmkg (23)\n" +
                "helyy (88)\n" +
                "muxvdx (57) -> veiaf, rcbqqok, gfnmx, zezeds, ktbto, qedyqs\n" +
                "rroub (41)\n" +
                "hnwfe (89)\n" +
                "enuvuv (20)\n" +
                "wzzlsg (18)\n" +
                "hpgsb (81) -> xpptslq, jtoryw\n" +
                "woklobt (60)\n" +
                "jicyq (18)\n" +
                "lybwr (64)\n" +
                "ujgpnsy (12)\n" +
                "mbtweib (86)\n" +
                "vgzejbd (10) -> vuoqao, vwkkml, kmpfxl, snuewn, jjgjvki, fiprusz\n" +
                "vgfveov (198)\n" +
                "lvtotof (49) -> pprvv, gsckda\n" +
                "ylpxahm (33) -> jyjvpeb, tytsynv\n" +
                "glximrw (53)\n" +
                "iykjtnw (542) -> dizqtw, oiozpzq, dmwutl\n" +
                "xuoyxmc (51)\n" +
                "wpvale (18626) -> wihtv, isbdm, gxeehd\n" +
                "jruttt (28)\n" +
                "urrhqwc (84)\n" +
                "yfyaho (7)\n" +
                "klpzhup (11) -> befwz, mypula, xmnbar\n" +
                "kclmmu (49)\n" +
                "qcnstq (91)\n" +
                "sasym (13) -> vimnt, eoign, lusub, peokkb, mlhaxv\n" +
                "mgoxhns (130) -> edswttn, ioycu\n" +
                "stzzli (89)\n" +
                "ltesfzf (44) -> sufdte, vpqsjbj, oghyxz, hxxml, mnhrjdv\n" +
                "yxfjglq (58)\n" +
                "fuhbay (82)\n" +
                "gxcft (25)\n" +
                "rwamq (86)\n" +
                "qxqwmye (68)\n" +
                "ketopn (42)\n" +
                "tmsmb (84) -> pkxrm, pbbkg\n" +
                "zerxp (75)\n" +
                "zpbrw (95)\n" +
                "wuqapgg (66)\n" +
                "nmsats (82)\n" +
                "vvzctek (9)\n" +
                "cmoty (91)\n" +
                "qkkhj (88)\n" +
                "pocct (99)\n" +
                "xyfvxng (45)\n" +
                "mqnbmre (2069) -> vecnb, azhddw, muxvdx, qbodszw, yggqq\n" +
                "msjbv (918) -> nktwwvp, qijleb, ttnoqm, ulaio, furlcyu\n" +
                "mkirruz (70)\n" +
                "mubkcmk (163) -> solqvvf, ocnkhq, wntitz\n" +
                "lvzzwy (89)\n" +
                "ypiwnt (55)\n" +
                "bveilrx (306) -> pxvse, ahexrp\n" +
                "shiaqps (45)\n" +
                "mlhaxv (297) -> ctcmfv, ekvmhd\n" +
                "eiohuhm (72)\n" +
                "isqnx (122) -> azgohsw, pltzthr\n" +
                "qqstwmn (5)\n" +
                "fiwvclv (80)\n" +
                "zobti (87)\n" +
                "qbvhefh (53) -> ylazd, cyvwwa, sfkpzr, zsjlevq, zseldo\n" +
                "xqgxel (54)\n" +
                "yrlnu (48)\n" +
                "rrmlgct (19)\n" +
                "jtzdqn (178) -> lsoen, pojst\n" +
                "nffvt (37)\n" +
                "axtepsa (13)\n" +
                "ngkax (18)\n" +
                "viwez (27)\n" +
                "kdykksn (7) -> geabygu, cfiqn\n" +
                "zvlobk (419) -> mdfkbxa, wzzlsg\n" +
                "xsqbapj (164) -> xqxvktz, xvjfw\n" +
                "nzvqjrt (24)\n" +
                "gbqbg (18)\n" +
                "hskko (38)\n" +
                "bgmntpq (6)\n" +
                "zddmrx (227)\n" +
                "dgtsic (47)\n" +
                "iijfq (73)\n" +
                "qytxu (71)\n" +
                "mklcsj (54)\n" +
                "jnwdraz (63) -> aubvpzf, zpfuxux\n" +
                "hudde (1072) -> wyrfplr, rzbrbmy, ujmfmiu\n" +
                "jcoyk (18)\n" +
                "dspug (66)\n" +
                "qgbbhdv (46)\n" +
                "neddz (86)\n" +
                "boahhv (195)\n" +
                "ajjmsnw (50)\n" +
                "lusub (209) -> nrloleu, lfwpqb\n" +
                "bkgise (17)\n" +
                "xsgyar (568) -> fesce, vfteg, thhbhrm, vvnhm\n" +
                "mudewqe (49)\n" +
                "trait (91)\n" +
                "fljpye (46)\n" +
                "xobszr (61)\n" +
                "pkxrm (57)\n" +
                "qrynkpt (22) -> kswafh, oztxmy, zejcp\n" +
                "frlgjzf (68)\n" +
                "aomksx (70) -> pmyrysb, robpw\n" +
                "gjvmrh (167) -> xxtyban, mfjdb\n" +
                "atvtit (20)\n" +
                "ihuqmbd (34)\n" +
                "mfjdb (14)\n" +
                "rptcpf (33)\n" +
                "ljitswv (89)\n" +
                "zkujvlv (51)\n" +
                "ydtuje (69)\n" +
                "emazu (93)\n" +
                "sqkfgo (1451) -> ueitm, okbtg, cnzynyj\n" +
                "flmma (86) -> ygglox, ocvrlia\n" +
                "jnqgs (76)\n" +
                "ctken (72)\n" +
                "kxdbyp (20)\n" +
                "ktlkx (112) -> etyaxa, axygpr, rqsyc, axtepsa\n" +
                "hesyq (85)\n" +
                "tydtcxc (919) -> swcsd, nkclzqq, dhcopz\n" +
                "sqbxzl (12)\n" +
                "dispgy (52) -> olsycb, ynecxzo, esqvkcm, xclsj\n" +
                "djbtbrk (53)\n" +
                "svjnd (47)\n" +
                "fizbyu (78)\n" +
                "vqfiq (61) -> zdrhuz, jmzpxql\n" +
                "tqsrg (70)\n" +
                "dulrvcq (2086) -> apjeywv, vurdlqx, bwemy, ulmwqtm, qkxtwct\n" +
                "gfjeud (71)\n" +
                "xdzgwl (220) -> jicyq, prbbfe\n" +
                "jcputh (196) -> xdzgwl, rodxm, piutfin, ezmot, bckfa, zyisjsj, icsxziz\n" +
                "gbwaobo (94)\n" +
                "mlyar (44)\n" +
                "zsotrv (751) -> wudlze, hjmreq\n" +
                "chxgqe (47)\n" +
                "junva (83)\n" +
                "fmdfm (84)\n" +
                "ewwab (70)\n" +
                "hdrfo (51)\n" +
                "qijleb (111) -> qngug, voxemk\n" +
                "qmjamoi (60)\n" +
                "pyrvg (230) -> shcavm, trseebo\n" +
                "joszidy (95)\n" +
                "rxilrp (138) -> gtprqg, xqgqp\n" +
                "ptnndxj (46)\n" +
                "typbqmw (11)\n" +
                "fesce (39) -> fuhbay, jozav\n" +
                "oeixw (65)\n" +
                "gjhfseh (20)\n" +
                "zeexkde (41)\n" +
                "ynecxzo (59)\n" +
                "oqfpo (78)\n" +
                "keazynv (68)\n" +
                "gnsdn (51) -> njerlzh, rgkfzk, lhyzwtf\n" +
                "sqljeh (20)\n" +
                "dclmckh (93)\n" +
                "rqsyc (13)\n" +
                "wvwjep (70)\n" +
                "ncobxr (8)\n" +
                "builgr (78)\n" +
                "xkdjbxo (81)\n" +
                "bzpjiss (60)\n" +
                "vfomix (95)\n" +
                "wtorpp (68)\n" +
                "pruui (1276) -> glaosn, xgqxofa, ggkael\n" +
                "monhu (76)\n" +
                "piutfin (156) -> wpcng, qxwdzl\n" +
                "wrwim (10)\n" +
                "jrrubn (52)\n" +
                "vkdytw (24)\n" +
                "vdtdmy (26)\n" +
                "pbbkg (57)\n" +
                "uwviodb (208) -> bkxfso, evrtfzj\n" +
                "vfhgfb (1084) -> gnsdn, ttbgzv, pyaqqhu, riiaj\n" +
                "iordzi (223) -> cfrqn, nzuhp\n" +
                "biffdx (42)\n" +
                "bpsesr (50)\n" +
                "cglfuq (199) -> vempqu, noogeuk, bgmntpq\n" +
                "bkxfso (19)\n" +
                "oopnu (88)\n" +
                "wlavb (92)\n" +
                "gmzabjk (41)\n" +
                "ehrfv (57) -> pruui, eondv, ygypj, vksphlf\n" +
                "lpwuzn (89)\n" +
                "cnzynyj (89) -> wwzjdv, xyfvxng\n" +
                "dgmtgrv (12)\n" +
                "hpmtom (50) -> zzpwgcd, qxqwmye\n" +
                "jafrv (719) -> qhgzopn, aomksx, porttu\n" +
                "msmxf (66)\n" +
                "ldiqm (266)\n" +
                "llydxxz (37)\n" +
                "vdsaccd (11)\n" +
                "cbsdget (81) -> licrtwb, zovlqz\n" +
                "qgwhbwh (62)\n" +
                "epuqu (17)\n" +
                "loojs (43)\n" +
                "ovshy (95)\n" +
                "qhayeqe (86) -> opsrep, loojs, fvukbun\n" +
                "amrcopl (51)\n" +
                "tsncd (108) -> zygfdu, jsfqyd\n" +
                "oguxu (17)\n" +
                "skyaki (69)\n" +
                "ufxfx (25)\n" +
                "mpzyapm (19409) -> elygt, ltesfzf, dhqrk\n" +
                "lthoz (150) -> rwopuzo, uazwsu, ozaogat\n" +
                "xxtyban (14)\n" +
                "ggkael (54) -> gmjxxi, koevsvb\n" +
                "yuyhys (12)\n" +
                "qngug (76)\n" +
                "kazwz (92)\n" +
                "owysb (71)\n" +
                "eondv (25) -> uxggaix, ngfxax, ztdbvxb, jmytuxi, hkxfb, rvrzp, ppvsy\n" +
                "oyhqsok (65)\n" +
                "iflll (97)\n" +
                "xjbot (85)\n" +
                "tytsynv (81)\n" +
                "rsyxcdq (157)\n" +
                "vuoqao (102055) -> kahduw, lxmvg, vtwud, ktcffyf, ggdoqnl\n" +
                "ocvrlia (48)\n" +
                "cpuxdo (75) -> rroub, cvude\n" +
                "tpiwftj (482) -> cancxr, xhecnbf, ilcmx\n" +
                "eaoxb (2777) -> cfrbz, vmiykci, kllsasv\n" +
                "alfqryh (54)\n" +
                "gfnmx (214) -> ekfwu, ejqam, kccpv\n" +
                "daerl (14)\n" +
                "nvahhge (14)\n" +
                "rzvlc (19)\n" +
                "ktcffyf (1777) -> dhafpel, jtyljl, nmcewof, rhaoo, xsgyar, otetl, essijo\n" +
                "pntvfpd (49)\n" +
                "hkxfb (285)\n" +
                "ngfcc (87)\n" +
                "yqdaz (21)\n" +
                "qzwauo (49)\n" +
                "kdkobz (11)\n" +
                "tslbp (224) -> mvijo, qolgxnd\n" +
                "vlqqgb (63)\n" +
                "zsjlevq (175) -> bemxocu, builgr\n" +
                "xzsxx (79) -> zugkqyx, jubeqci\n" +
                "yvattv (44)\n" +
                "nhhytw (44) -> skyaki, nxqvwm\n" +
                "zmzobfp (75) -> ntxtwk, yhvdjl, xzsrv\n" +
                "sretj (240) -> wsnsqx, rekerpj, knciro, svcqds\n" +
                "awwhgzp (70)\n" +
                "adqnigs (72)\n" +
                "oipscid (85)\n" +
                "xsyqdlv (26)\n" +
                "eoign (134) -> aujeia, ngfcc, zobti\n" +
                "nfulfov (14) -> aivbhtz, exlwxxi, oqfpo\n" +
                "fqehxv (168) -> lgonp, vxufrto\n" +
                "impzr (70) -> lybwr, pyhcj\n" +
                "bnvlydl (63)\n" +
                "olzqxap (65)\n" +
                "frfotet (75)\n" +
                "ajidd (80)\n" +
                "qyvsaxn (30)\n" +
                "rlwoz (19) -> kjauagn, qkkhj\n" +
                "hysssy (12)\n" +
                "ptmsqz (81)\n" +
                "kahduw (31) -> qhotyqx, xhxek, bhakbq, ivgpv, lmnuii, frctm\n" +
                "ejdjxu (41) -> wazvn, algkwbg\n" +
                "ylfxp (99) -> heztht, mbtweib\n" +
                "isgky (80) -> kecckss, obakqyf\n" +
                "xclsj (59)\n" +
                "qhzem (47) -> fnkgp, ujipv, tuzkv\n" +
                "zaxbfog (47)\n" +
                "uekzf (1315) -> qjxikz, bptaz\n" +
                "gkjwl (50) -> pucdapo, zckdwxe, xqgxel, vcprhe\n" +
                "xqgqp (17)\n" +
                "ntrtfv (34)\n" +
                "ufust (68)\n" +
                "yvcanc (52)\n" +
                "jtqxxa (47)\n" +
                "rfumv (92)\n" +
                "qjxikz (38)\n" +
                "sybnvtp (59)\n" +
                "pugxio (62)\n" +
                "olfwppt (154) -> bwsgfa, lrplxk\n" +
                "ugelox (48)\n" +
                "oruhqn (95)\n" +
                "rlwmfp (158) -> bypqww, wuwhup\n" +
                "qnwwjwt (27)\n" +
                "hjmreq (78)\n" +
                "paykww (22)\n" +
                "aefjv (17)\n" +
                "hvpess (1924) -> vaxtfaa, wbnmb\n" +
                "dbziu (96)\n" +
                "xnfuz (84)\n" +
                "tpmqmg (22)\n" +
                "qrinzet (69)\n" +
                "ldrpjd (88)\n" +
                "pocwgw (13) -> glximrw, bhmirp, rcqkas, qdkhjb\n" +
                "sxexfai (9)\n" +
                "euhgw (208) -> xrbkzmk, xsyqdlv, vdtdmy\n" +
                "ulaio (203) -> pdddwgk, sakmm\n" +
                "vnmml (19)\n" +
                "ksncpee (28)\n" +
                "pucdapo (54)\n" +
                "ucnehpw (50)\n" +
                "btvsj (47)\n" +
                "veknoj (48)\n" +
                "papbxya (75)\n" +
                "sdzhsq (94)\n" +
                "orrfh (71)\n" +
                "gnxfwv (68)\n" +
                "grthhzv (244) -> dgmtgrv, tkojiz\n" +
                "dxcozh (35) -> phrpja, ahysv\n" +
                "vekndsc (94)\n" +
                "ujmfmiu (39) -> vrszijz, ugmhzm, sdrcc\n" +
                "jctafp (62)\n" +
                "bhmirp (53)\n" +
                "tmqlkof (28)\n" +
                "wyrfplr (109) -> qzwauo, pntvfpd\n" +
                "shcavm (18)\n" +
                "xmkegiw (28)\n" +
                "ydkhmp (290) -> cyanr, nofepy\n" +
                "ivkcc (70)\n" +
                "ujipv (183) -> gkrqba, nmsats\n" +
                "lnznpq (48)\n" +
                "xqxvktz (8)\n" +
                "wzezz (264) -> bfjxeyo, vkdytw, uwizlce\n" +
                "nvgohm (26)\n" +
                "ydqtt (158) -> oeabdth, bkgise, fjgjfpc\n" +
                "nmcewof (1182) -> plgjg, imtzl\n" +
                "bbnjml (31)\n" +
                "iweii (8) -> lvzzwy, nubqteb\n" +
                "kmpfxl (134829) -> csuywzh, ehrfv, bkfnip\n" +
                "dbkxe (34)\n" +
                "sfkpzr (76) -> lsszcka, manlcoz, oipscid\n" +
                "bbyoqzx (14)\n" +
                "uuavydd (43)\n" +
                "hjehgnc (489) -> ujqjrz, wulvcf\n" +
                "qmncyu (17) -> ofveqm, qgwhbwh, ftbiwxy\n" +
                "zzfom (210) -> jruttt, mvdkbch\n" +
                "cigew (185)\n" +
                "nozgflw (89)\n" +
                "trfjf (174) -> hskko, evbeo\n" +
                "idqhx (12)\n" +
                "noogeuk (6)\n" +
                "ccjze (60)\n" +
                "bedzc (43)\n" +
                "uymju (8) -> ectlgy, pchapba, tsncd\n" +
                "jvwvi (86)\n" +
                "xrqhewm (86)\n" +
                "ifijr (28)\n" +
                "tuzzzct (50)\n" +
                "zwrjdk (82)\n" +
                "ekvzyod (11)\n" +
                "vivco (626) -> okhisbv, biffdx, rbascuz\n" +
                "atujmm (250)\n" +
                "bdiftdg (69)\n" +
                "wqzxa (82)\n" +
                "jtoryw (76)\n" +
                "sttlowq (207) -> xmkegiw, tmqlkof\n" +
                "wqkoep (90)\n" +
                "sdloeq (14)\n" +
                "hzruk (47)\n" +
                "mgoic (36)\n" +
                "mqkqtjo (57)\n" +
                "gsxmqnw (68)\n" +
                "pexfst (44)\n" +
                "ycfbxe (254) -> tnljdhr, jfikdf\n" +
                "kenxmax (91)\n" +
                "yhvdjl (89)\n" +
                "gzpgvqq (78)\n" +
                "inglhm (94) -> qwqpht, keazynv\n" +
                "uytmyv (91)\n" +
                "wqgoxl (94)\n" +
                "yfxbu (32) -> jbujmr, mjlzzq, hcrys, mwfksx, fcaht, ycfbxe, tslbp\n" +
                "mnhrjdv (185) -> lmfclbd, sdloeq\n" +
                "gcasp (17)\n" +
                "jjgjvki (99205) -> suuppr, csmjozb, uexqjw, cckrzh, yuzzsk\n" +
                "zvqvvyp (39)\n" +
                "bgpab (1781) -> qmqpbm, rdwxvvp, vjwuuft, dlikiv, acaqfng\n" +
                "prbbfe (18)\n" +
                "gaalz (75)\n" +
                "robpw (77)\n" +
                "rcqkas (53)\n" +
                "axsimnf (403) -> yfyaho, qeyjc\n" +
                "mypula (58)\n" +
                "mnahxn (52) -> cxyxa, lqaveh\n" +
                "smqkli (81)\n" +
                "nkclzqq (44) -> bhyzi, okjds, gfsgzni\n" +
                "soyta (9)\n" +
                "cagvlf (267) -> ypcup, mbffei\n" +
                "dvuctqv (16)\n" +
                "hdvtd (75)\n" +
                "lexqf (96)\n" +
                "cuyweja (81)\n" +
                "vfteg (17) -> dclmckh, iihwb\n" +
                "fzuosl (94)\n" +
                "ipctg (80) -> zzyxzr, rqdtsp, esbdjah\n" +
                "yuzzsk (3542) -> ijlooi, yqgru, oullg, ekblpi, hudde\n" +
                "tpvhe (42) -> sretj, grthhzv, luqqu, uwqee, qssjswr, kbrwk\n" +
                "gpbdzes (96) -> dgvvo, zvnzrr\n" +
                "cmfwvem (23)\n" +
                "befwz (58)\n" +
                "mellhhn (166) -> vvzctek, hrlgs, evqbli\n" +
                "bmxolxn (20) -> bpwxvvw, sfnix, fxnap\n" +
                "rnqlzmv (88) -> tnlpmw, hrfbh\n" +
                "qeyjc (7)\n" +
                "jozav (82)\n" +
                "gjahajj (62)\n" +
                "qyfzonc (89)\n" +
                "ngjipr (24)\n" +
                "sepmxir (33) -> uuavydd, xocoiqa\n" +
                "qizpmf (98)\n" +
                "mroft (77)\n" +
                "lyeyx (61)\n" +
                "gtgovt (134) -> gqxyh, gbqbg\n" +
                "hrihd (50)\n" +
                "pygoqsv (55)\n" +
                "dxczurt (89) -> rupxxhm, lopnwz\n" +
                "mdfkbxa (18)\n" +
                "hcruo (72)\n" +
                "ytomr (9)\n" +
                "bhzfx (9)\n" +
                "mbgapsj (39)\n" +
                "omqhf (105) -> jwbdb, junva\n" +
                "wntitz (10)\n" +
                "zugkqyx (89)\n" +
                "ntxtwk (89)\n" +
                "phrpja (90)\n" +
                "ilcmx (129) -> xbtvux, agflbq\n" +
                "hhcoc (63)\n" +
                "bxggi (36)\n" +
                "obakqyf (51)\n" +
                "xrbkzmk (26)\n" +
                "sthtydb (22)\n" +
                "xvljr (21744) -> nfulfov, takbkro, gspffet, fqehxv\n" +
                "hofirm (33)\n" +
                "okhisbv (42)\n" +
                "uldgij (64)\n" +
                "sakmm (30)\n" +
                "zbuftv (62) -> glzmsn, oacnj\n" +
                "jxevsc (57) -> wvwjep, jilzdse, fxrkz, vkgfrb\n" +
                "ioycu (58)\n" +
                "ysuttai (72)\n" +
                "ttnoqm (133) -> vtopekt, naxtp\n" +
                "ereyjs (54)\n" +
                "hgksz (174) -> msuvilq, couhjsv\n" +
                "luqqu (112) -> yfaihrb, fizbyu\n" +
                "bixtvg (180)\n" +
                "kswafh (76)\n" +
                "fwide (24)\n" +
                "ghgou (12)\n" +
                "aujeia (87)\n" +
                "lgqad (75)\n" +
                "szvocp (11)\n" +
                "yivgs (36)\n" +
                "lnlkwq (216) -> nvahhge, bbyoqzx, daerl\n" +
                "qtcck (137) -> lgqad, ngtdwvu\n" +
                "wkeqlvj (51)\n" +
                "vbxzk (75)\n" +
                "uqkskjn (132) -> kbbcau, ufxfx\n" +
                "gacpvy (26)\n" +
                "ccbie (90) -> cmoty, uytmyv, dmiccse\n" +
                "suuppr (9751) -> uymju, rhpcgg, vivco\n" +
                "fqdolnu (16)\n" +
                "vcprhe (54)\n" +
                "iihwb (93)\n" +
                "swcsd (91) -> ltpmtif, jvwvi\n" +
                "nbwaei (61)\n" +
                "zdgyktc (84) -> jnqgs, uxfsb, xkzcttf\n" +
                "bimxf (51)\n" +
                "pdqzfg (70)\n" +
                "bomuft (785) -> xobszr, idpttp\n" +
                "kytha (39)\n" +
                "zyisjsj (58) -> woqoljk, pocct\n" +
                "hwycny (41)\n" +
                "ofveqm (62)\n" +
                "oqxnfd (59)\n" +
                "pnpsnjp (803) -> zpbrw, pbpva\n" +
                "ysekeoo (126) -> suawycj, gigtu\n" +
                "gneut (203)\n" +
                "zdrhuz (47)\n" +
                "qmqpbm (7) -> owysb, gdvbtjk, qytxu, wxfir\n" +
                "imrwgqw (170) -> yhncv, mklcsj\n" +
                "dymzl (72)\n" +
                "vzlzrt (55)\n" +
                "lfwpqb (93)\n" +
                "dirhtk (65) -> hrihd, udiai, bpsesr\n" +
                "donnc (33)\n" +
                "iactix (293) -> ulood, xkdjbxo\n" +
                "acaqfng (271) -> wrwim, ilohfvn\n" +
                "tuwedv (150) -> eiyiuq, ereyjs\n" +
                "mjlvx (41)\n" +
                "fwhhoz (72) -> rrrmaka, zkujvlv, fyaco\n" +
                "msuvilq (11)\n" +
                "mxvba (37)\n" +
                "smvskd (1262) -> cglfuq, rtcqml, zjnrzph\n" +
                "ggdoqnl (9436) -> hjehgnc, xnlkkx, srgob\n" +
                "aifpyc (61)\n" +
                "vwkkml (148790) -> hvpess, nuozixg, tshyvej, yfxbu, kiatxq\n" +
                "tipewrj (97)\n" +
                "pblqb (7) -> kouye, ibydam, jqdngi, tuzpls\n" +
                "oktgjb (70) -> lcbgeev, zwrjdk\n" +
                "dqoagdt (58)\n" +
                "xkzcttf (76)\n" +
                "zevrg (108) -> stzzli, kbybvzk\n" +
                "lomrivn (92)\n" +
                "grkzvkj (124) -> xemcuk, cmfwvem\n" +
                "uwvfga (63)\n" +
                "frxshon (95)\n" +
                "zzvhmse (157) -> ujgpnsy, idqhx, hysssy\n" +
                "ahsqaob (75) -> gtotarq, joszidy, frxshon, vfomix\n" +
                "jqbdh (20)\n" +
                "kvzmie (69)\n" +
                "oiaxzp (22)\n" +
                "spefs (96)\n" +
                "fxnap (89)\n" +
                "azhddw (909) -> smqimxg, mgoxhns, izgqzs\n" +
                "epssvr (57)\n" +
                "kxhvvgi (8) -> ihksnmq, wjsxcmb\n" +
                "etjwno (91)\n" +
                "tlwxovy (91)\n" +
                "capuc (91)\n" +
                "evbeo (38)\n" +
                "djvbdm (50) -> zzmczwl, whvpgmw, szqdapo, nbybi\n" +
                "mbffei (94)\n" +
                "uwqee (90) -> qyfzonc, nozgflw\n" +
                "bpzhj (251) -> hbaai, gfsnz, snywwu, ktlkx\n" +
                "dhcopz (207) -> hjbrfba, nlalji\n" +
                "jilzdse (70)\n" +
                "lgonp (40)\n" +
                "zvsgd (58) -> yzttfu, zavisuv\n" +
                "rdwxvvp (203) -> mlyar, lijszmh\n" +
                "wridnv (41)\n" +
                "ovtfd (81)\n" +
                "kttsf (35)\n" +
                "murnoa (238) -> gpbdzes, gtgovt, mqreb, grkzvkj, nyuxiu\n" +
                "otzinx (97)\n" +
                "bjjtifj (15)\n" +
                "irnjtjo (12) -> ubaxya, lomrivn, rlhmcf\n" +
                "zezeds (79) -> kbuurtb, pugxio, gjahajj\n" +
                "ofrogun (11)\n" +
                "bjzbqzq (54)\n" +
                "qolgxnd (35)\n" +
                "vdkhvyp (52) -> kfkfyx, mgiuz\n" +
                "rlhmcf (92)\n" +
                "okbtg (35) -> dymzl, eiohuhm\n" +
                "kkhlzm (96) -> wlavb, rfumv\n" +
                "dmiccse (91)\n" +
                "esqvkcm (59)\n" +
                "zzyxzr (61)\n" +
                "tegtsu (72)\n" +
                "kbrwk (124) -> tegtsu, adqnigs\n" +
                "mertvs (88)\n" +
                "awmmdn (49)\n" +
                "pknsw (74) -> lexqf, pxadg\n" +
                "fwtxvo (71) -> ibslyw, jnwdraz, ydqtt, flvrfdl\n" +
                "flwjj (85)\n" +
                "asbmk (76)\n" +
                "sdlta (11)\n" +
                "vdwfz (234) -> amtrbok, brpgc\n" +
                "exsugls (49)\n" +
                "yfaihrb (78)\n" +
                "oghyxz (213)\n" +
                "manlcoz (85)\n" +
                "mnoinr (84)\n" +
                "ibydam (58)\n" +
                "hjfucl (25)\n" +
                "lcbgeev (82)\n" +
                "ygglox (48)\n" +
                "xhxek (425) -> uwviodb, cenqs, mnahxn, ysekeoo, vdcmrrr, vdctvf\n" +
                "krtxpw (96)\n" +
                "zgxjjm (24)\n" +
                "vkhiz (86)\n" +
                "inhfutj (24)\n" +
                "qkxtwct (166) -> jfjvw, hbcpm\n" +
                "mfoismz (70)\n" +
                "voxemk (76)\n" +
                "inuci (86)\n" +
                "wllrov (200) -> nvgohm, mqsrwsz, gacpvy\n" +
                "fyaco (51)\n" +
                "ngtdwvu (75)\n" +
                "kfkfyx (94)\n" +
                "iiiupn (79)\n" +
                "gkpalaj (76) -> jjklma, ydejjeb, sttlowq, axqrke, ipctg\n" +
                "ubrrdtd (75)\n" +
                "fwskxq (31)\n" +
                "nzuhp (57)\n" +
                "npvuz (28)\n" +
                "fnkgp (65) -> vekndsc, sdzhsq, fzuosl\n" +
                "roorbg (95)\n" +
                "cfiqn (96)\n" +
                "fcnsfy (51)\n" +
                "idpttp (61)\n" +
                "vaxtfaa (83)\n" +
                "jubeqci (89)\n" +
                "uxggaix (195) -> shiaqps, xmjunhp\n" +
                "vvlimno (63)\n" +
                "txcon (87)\n" +
                "ocltuv (75)\n" +
                "kdffrsb (187) -> ldrpjd, oopnu\n" +
                "imtzl (99)\n" +
                "jvdoo (22)\n" +
                "yhzjjgc (93) -> xunvu, bebuqpx, wetluzb, hofirm\n" +
                "clktah (86)\n" +
                "givaxj (58)\n" +
                "fiprusz (88) -> bgydix, mpzyapm, xvljr, bnywvsx, snmey, batky, wpvale\n" +
                "wgvpotf (115) -> tmsmb, zzvkwsb, olfwppt, impzr\n" +
                "ohpkkhx (385) -> kttsf, ysnbr\n" +
                "eofyk (41) -> ctken, jyrzc, ysuttai\n" +
                "ubllty (91) -> qizpmf, husly\n" +
                "aqgumo (47)\n" +
                "zezbp (91)\n" +
                "mphzxio (33)\n" +
                "gfuyuz (209) -> jiizacd, awmmdn\n" +
                "rpxaf (59)\n" +
                "aewlgu (62) -> oazfz, aifpyc, oaoisa, nbwaei\n" +
                "coqek (166) -> uslhk, vczyhcg\n" +
                "kecckss (51)\n" +
                "jqlbenn (65)\n" +
                "jyrzc (72)\n" +
                "azgohsw (82)\n" +
                "qtqhwon (50)\n" +
                "furlcyu (85) -> lpwuzn, hnwfe\n" +
                "evqbli (9)\n" +
                "zwvhgce (121) -> chxgqe, hzruk\n" +
                "xsfryrh (21)\n" +
                "jjtafg (37)\n" +
                "acfdkr (17)\n" +
                "rupxxhm (91)\n" +
                "nnelc (342)\n" +
                "hdbkw (43)\n" +
                "usgpgi (182) -> ketopn, mvtkwn\n" +
                "thxqmj (81)\n" +
                "bgydix (16136) -> tpvhe, excdqtl, yjvfni, iaayhc\n" +
                "pxadg (96)\n" +
                "uiryg (2879) -> aibtig, sepmxir, ixkpaf\n" +
                "exlwxxi (78)\n" +
                "vecnb (897) -> atujmm, qrynkpt, trfjf\n" +
                "zkwnhn (329) -> oorvvpt, zzdae\n" +
                "ezmot (96) -> bykuuwe, fiwvclv\n" +
                "vrxkr (37) -> jxevsc, gtkii, nlrlj, kwlyw, fqkzcq\n" +
                "zmstcy (8)\n" +
                "axygpr (13)\n" +
                "yzose (57)\n" +
                "kproiw (93)\n" +
                "lptaikg (82)\n" +
                "cmmnjch (6) -> ewwab, awwhgzp, tqsrg, ivkcc\n" +
                "qpgphk (33) -> lyeyx, cqfsg\n" +
                "hittl (20)\n" +
                "wbnmb (83)\n" +
                "tsevkec (54) -> yvvxtg, wqkoep\n" +
                "mwfksx (216) -> mbgapsj, zvqvvyp\n" +
                "bvmhqar (224) -> epuqu, gcasp\n" +
                "oeabdth (17)\n" +
                "pchapba (70) -> kqaua, ljitswv\n" +
                "gsckda (89)\n" +
                "gtbjtpi (265) -> ovshy, xpttnwd\n" +
                "xocoiqa (43)\n" +
                "woctu (56) -> qrorhfv, axsimnf, wgbviwb\n" +
                "foxvut (77)\n" +
                "zerhdhs (150) -> xtidu, yuyhys, ghgou, sqbxzl\n" +
                "rqdtsp (61)\n" +
                "dizqtw (103) -> ieowdj, vgkhk\n" +
                "ebdva (718) -> vgfveov, zerhdhs, kxhvvgi, oqokji, lpmnwh\n" +
                "ikfzj (212) -> nrfyua, ekvzyod\n" +
                "hcrys (63) -> foxvut, oislgqy, mroft\n" +
                "vkgfrb (70)\n" +
                "bwemy (92) -> oaqkk, kvzmie\n" +
                "yname (1373) -> qhayeqe, dxcozh, dirhtk, zwvhgce\n" +
                "desuqj (91)\n" +
                "bnywvsx (19757) -> pnpsnjp, paunv, hxeqn\n" +
                "wiasj (34)\n" +
                "lhyzwtf (35)\n" +
                "gztng (22)\n" +
                "szqdapo (54)\n" +
                "flwbwcq (142) -> xekft, jctafp\n" +
                "ijoaqyv (91) -> ldcmzd, sambc, aewlgu, wrkoi, xtgmmc, cglyptu, qhixu\n" +
                "knyvyft (81)\n" +
                "ngfxax (139) -> uiilkiq, iijfq\n" +
                "atqfhm (92)\n" +
                "masvpfj (184) -> ifijr, zzonk\n" +
                "yhncv (54)\n" +
                "wwhyd (95)\n" +
                "oggljxs (314) -> awrbrc, yrysmsi\n" +
                "sdrcc (56)\n" +
                "sgqhelx (60) -> hhcoc, vvlimno\n" +
                "snmey (84) -> bgpab, xflsc, kidvt, rlurjca, uiryg, eaoxb, dulrvcq\n" +
                "qpchzkg (57)\n" +
                "mhaucon (2652) -> smvskd, wkgyfpp, fkgkcwd, jsaujq\n" +
                "brpgc (12)\n" +
                "vimnt (91) -> rwhgw, asbmk, lvarp, monhu\n" +
                "excdqtl (378) -> hcsjun, trskdr, tfotbwz\n" +
                "uxlisdh (89)\n" +
                "isbdm (1276) -> aqgumo, svjnd\n" +
                "alsfpfg (21)\n" +
                "zzpwgcd (68)\n" +
                "glaosn (86) -> ptmsqz, ivvyjos\n" +
                "fvukbun (43)\n" +
                "rokri (55)\n" +
                "qrorhfv (93) -> redkli, thxqmj, esavxwq, knyvyft\n" +
                "eziosif (33)\n" +
                "jqgfu (40)\n" +
                "nbqaqp (298) -> owxski, nyckm\n" +
                "hyxtojc (5)\n" +
                "awrbrc (14)\n" +
                "ogbov (15)\n" +
                "rbascuz (42)\n" +
                "kdzhiq (63) -> kenxmax, tlwxovy, zezbp\n" +
                "geapi (75)\n" +
                "oiozpzq (127) -> uldgij, kiawm\n" +
                "fzafkj (88)\n" +
                "zejcp (76)\n" +
                "wrkoi (124) -> capuc, wifrwut\n" +
                "dhqrk (173) -> zdgyktc, etcsuuv, uhwlk\n" +
                "jtyljl (348) -> bveilrx, nbqaqp, fuujiy\n" +
                "otetl (1340) -> patlvg, gjhfseh\n" +
                "mnufo (7)\n" +
                "cfrbz (117) -> krtglj, jcoyk\n" +
                "lsszcka (85)\n" +
                "rgdvqu (166) -> dbkxe, clwtgt\n" +
                "yjvfni (1179) -> ofnqgn, rsyxcdq, cpuxdo\n" +
                "gfsnz (14) -> ydtykm, tjwynpa\n" +
                "knciro (7)\n" +
                "sfnix (89)\n" +
                "cqfsg (61)\n" +
                "izqxal (142) -> kxdbyp, sqljeh\n" +
                "ivgpv (1040) -> ubllty, qtcck, bmxolxn\n" +
                "bazwto (49)\n" +
                "twimkx (24)\n" +
                "evrtfzj (19)\n" +
                "ofnqgn (19) -> qrinzet, fkitgnx\n" +
                "nrloleu (93)\n" +
                "ylazd (201) -> jqlbenn, oeixw\n" +
                "hrfbh (49)\n" +
                "dkexo (146) -> nffvt, llydxxz, bgtzw\n" +
                "hibjkps (106) -> cmfwwv, jqgfu\n" +
                "oacnj (93)\n" +
                "inelfwo (91)\n" +
                "vgkhk (76)\n" +
                "cckrzh (6841) -> hdinwud, dqzkic, vrxkr";

        switch(dayOfAdvent){
            case 1: Day1_InverseCaptcha.InverseCaptcha(input, "consecutive");
                break;
            case 101: Day1_InverseCaptcha.InverseCaptcha(input, "opposite")   ;
                break;
            case 2: Day2_CorruptionChecksum.CorruptionChecksum(input);
                break;
            case 4: Day4_HighEntropyPassphrases.HighEnergyPassphrase(input);
                break;
            case 5: Day5_AMazeOfTwistyTrampolinesAllAlike.MazeCount(input, "incrementAlways");
                break;
            case 105: Day5_AMazeOfTwistyTrampolinesAllAlike.MazeCount(input, "decrementOrIncrement");
                break;
            case 7: Day7_RecursiveCircus.towerBase(input);
                break;
            default: System.out.println("Error in Day Input");
                break;
        }        
        
    }
    
}
