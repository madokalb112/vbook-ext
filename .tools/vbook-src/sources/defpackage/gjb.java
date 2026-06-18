package defpackage;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Parcelable;
import android.os.StrictMode;
import androidx.glance.appwidget.action.InvisibleActionTrampolineActivity;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.mozilla.javascript.Parser;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public abstract class gjb {
    public static boolean H = false;
    public static int I = 0;
    public static p35 J = null;
    public static fjb a = null;
    public static boolean b = false;
    public static final rj1 l;
    public static final rj1 n;
    public static final rj1 p;
    public static final rj1 r;
    public static final rj1 s;
    public static final rj1 t;
    public static final Object c = new Object();
    public static final xa1 d = new xa1(null);
    public static final rj1 e = new rj1(new uj1(13), false, 1651398571);
    public static final rj1 f = new rj1(new uj1(14), false, -1205381726);
    public static final rj1 g = new rj1(new uj1(15), false, -956103325);
    public static final rj1 h = new rj1(new uj1(16), false, 1539996263);
    public static final rj1 i = new rj1(new uj1(17), false, -2144624610);
    public static final rj1 j = new rj1(new uj1(18), false, -578693135);
    public static final rj1 k = new rj1(new uj1(19), false, 1504792401);
    public static final rj1 m = new rj1(new hk1(5), false, 766434404);
    public static final rj1 o = new rj1(new ik1(0), false, 536988221);
    public static final rj1 q = new rj1(new kk1(11), false, 1411156895);
    public static final rj1 u = new rj1(new pk1(8), false, 1998149983);
    public static final rj1 v = new rj1(new nk1(29), false, 2100397327);
    public static final y89 w = y89.a;
    public static final cd1 x = cd1.e;
    public static final double[][] y = {new double[]{0.001200833568784504d, 0.002389694492170889d, 2.795742885861124E-4d}, new double[]{5.891086651375999E-4d, 0.0029785502573438758d, 3.270666104008398E-4d}, new double[]{1.0146692491640572E-4d, 5.364214359186694E-4d, 0.0032979401770712076d}};
    public static final double[][] z = {new double[]{1373.2198709594231d, -1100.4251190754821d, -7.278681089101213d}, new double[]{-271.815969077903d, 559.6580465940733d, -32.46047482791194d}, new double[]{1.9622899599665666d, -57.173814538844006d, 308.7233197812385d}};
    public static final double[] A = {0.2126d, 0.7152d, 0.0722d};
    public static final double[] B = {0.015176349177441876d, 0.045529047532325624d, 0.07588174588720938d, 0.10623444424209313d, 0.13658714259697685d, 0.16693984095186062d, 0.19729253930674434d, 0.2276452376616281d, 0.2579979360165119d, 0.28835063437139563d, 0.3188300904430532d, 0.350925934958123d, 0.3848314933096426d, 0.42057480301049466d, 0.458183274052838d, 0.4976837250274023d, 0.5391024159806381d, 0.5824650784040898d, 0.6277969426914107d, 0.6751227633498623d, 0.7244668422128921d, 0.775853049866786d, 0.829304845476233d, 0.8848452951698498d, 0.942497089126609d, 1.0022825574869039d, 1.0642236851973577d, 1.1283421258858297d, 1.1946592148522128d, 1.2631959812511864d, 1.3339731595349034d, 1.407011200216447d, 1.4823302800086415d, 1.5599503113873272d, 1.6398909516233677d, 1.7221716113234105d, 1.8068114625156377d, 1.8938294463134073d, 1.9832442801866852d, 2.075074464868551d, 2.1693382909216234d, 2.2660538449872063d, 2.36523901573795d, 2.4669114995532007d, 2.5710888059345764d, 2.6777882626779785d, 2.7870270208169257d, 2.898822059350997d, 3.0131901897720907d, 3.1301480604002863d, 3.2497121605402226d, 3.3718988244681087d, 3.4967242352587946d, 3.624204428461639d, 3.754355295633311d, 3.887192587735158d, 4.022731918402185d, 4.160988767090289d, 4.301978482107941d, 4.445716283538092d, 4.592217266055746d, 4.741496401646282d, 4.893568542229298d, 5.048448422192488d, 5.20615066083972d, 5.3666897647573375d, 5.5300801301023865d, 5.696336044816294d, 5.865471690767354d, 6.037501145825082d, 6.212438385869475d, 6.390297286737924d, 6.571091626112461d, 6.7548350853498045d, 6.941541251256611d, 7.131223617812143d, 7.323895587840543d, 7.5195704746346665d, 7.7182615035334345d, 7.919981813454504d, 8.124744458384042d, 8.332562408825165d, 8.543448553206703d, 8.757415699253682d, 8.974476575321063d, 9.194643831691977d, 9.417930041841839d, 9.644347703669503d, 9.873909240696694d, 10.106627003236781d, 10.342513269534024d, 10.58158024687427d, 10.8238400726681d, 11.069304815507364d, 11.317986476196008d, 11.569896988756009d, 11.825048221409341d, 12.083451977536606d, 12.345119996613247d, 12.610063955123938d, 12.878295467455942d, 13.149826086772048d, 13.42466730586372d, 13.702830557985108d, 13.984327217668513d, 14.269168601521828d, 14.55736596900856d, 14.848930523210871d, 15.143873411576273d, 15.44220572664832d, 15.743938506781891d, 16.04908273684337d, 16.35764934889634d, 16.66964922287304d, 16.985093187232053d, 17.30399201960269d, 17.62635644741625d, 17.95219714852476d, 18.281524751807332d, 18.614349837764564d, 18.95068293910138d, 19.290534541298456d, 19.633915083172692d, 19.98083495742689d, 20.331304511189067d, 20.685334046541502d, 21.042933821039977d, 21.404114048223256d, 21.76888489811322d, 22.137256497705877d, 22.50923893145328d, 22.884842241736916d, 23.264076429332462d, 23.6469514538663d, 24.033477234264016d, 24.42366364919083d, 24.817520537484558d, 25.21505769858089d, 25.61628489293138d, 26.021211842414342d, 26.429848230738664d, 26.842203703840827d, 27.258287870275353d, 27.678110301598522d, 28.10168053274597d, 28.529008062403893d, 28.96010235337422d, 29.39497283293396d, 29.83362889318845d, 30.276079891419332d, 30.722335150426627d, 31.172403958865512d, 31.62629557157785d, 32.08401920991837d, 32.54558406207592d, 33.010999283389665d, 33.4802739966603d, 33.953417292456834d, 34.430438229418264d, 34.911345834551085d, 35.39614910352207d, 35.88485700094671d, 36.37747846067349d, 36.87402238606382d, 37.37449765026789d, 37.87891309649659d, 38.38727753828926d, 38.89959975977785d, 39.41588851594697d, 39.93615253289054d, 40.460400508064545d, 40.98864111053629d, 41.520882981230194d, 42.05713473317016d, 42.597404951718396d, 43.141702194811224d, 43.6900349931913d, 44.24241185063697d, 44.798841244188324d, 45.35933162437017d, 45.92389141541209d, 46.49252901546552d, 47.065252796817916d, 47.64207110610409d, 48.22299226451468d, 48.808024568002054d, 49.3971762874833d, 49.9904556690408d, 50.587870934119984d, 51.189430279724725d, 51.79514187861014d, 52.40501387947288d, 53.0190544071392d, 53.637271562750364d, 54.259673423945976d, 54.88626804504493d, 55.517063457223934d, 56.15206766869424d, 56.79128866487574d, 57.43473440856916d, 58.08241284012621d, 58.734331877617365d, 59.39049941699807d, 60.05092333227251d, 60.715611475655585d, 61.38457167773311d, 62.057811747619894d, 62.7353394731159d, 63.417162620860914d, 64.10328893648692d, 64.79372614476921d, 65.48848194977529d, 66.18756403501224d, 66.89098006357258d, 67.59873767827808d, 68.31084450182222d, 69.02730813691093d, 69.74813616640164d, 70.47333615344107d, 71.20291564160104d, 71.93688215501312d, 72.67524319850172d, 73.41800625771542d, 74.16517879925733d, 74.9167682708136d, 75.67278210128072d, 76.43322770089146d, 77.1981124613393d, 77.96744375590167d, 78.74122893956174d, 79.51947534912904d, 80.30219030335869d, 81.08938110306934d, 81.88105503125999d, 82.67721935322541d, 83.4778813166706d, 84.28304815182372d, 85.09272707154808d, 85.90692527145302d, 86.72564993000343d, 87.54890820862819d, 88.3767072518277d, 89.2090541872801d, 90.04595612594655d, 90.88742016217518d, 91.73345337380438d, 92.58406282226491d, 93.43925555268066d, 94.29903859396902d, 95.16341895893969d, 96.03240364439274d, 96.9059996312159d, 97.78421388448044d, 98.6670533535366d, 99.55452497210776d};
    public static final di C = new di(21);
    public static final cd1 D = cd1.u;
    public static final cd1 E = cd1.y;
    public static final String[] F = {"input", "keygen", "object", "select", "textarea"};
    public static final Object G = new Object();

    static {
        int i2 = 1;
        l = new rj1(new dk1(i2), false, -585294538);
        int i3 = 7;
        n = new rj1(new hk1(i3), false, 1529166913);
        int i4 = 2;
        p = new rj1(new ik1(i4), false, -446463357);
        r = new rj1(new mk1(i2), false, 1437451163);
        s = new rj1(new mk1(i4), false, -525109986);
        t = new rj1(new pk1(i3), false, -1738833250);
    }

    public static final void A(String str, List list, ou6 ou6Var, kb4 kb4Var, dd4 dd4Var, int i2) {
        dd4Var.h0(165979694);
        int i3 = i2 | (dd4Var.f(str) ? 4 : 2) | (dd4Var.h(list) ? 32 : 16) | (dd4Var.h(kb4Var) ? 2048 : 1024);
        int i4 = 0;
        if (dd4Var.V(i3 & 1, (i3 & 1171) != 1170)) {
            boolean zH = ((i3 & 14) == 4) | dd4Var.h(list) | ((i3 & 7168) == 2048);
            Object objQ = dd4Var.Q();
            if (zH || objQ == vl1.a) {
                objQ = new bn3(i4, kb4Var, str, list);
                dd4Var.p0(objQ);
            }
            pu1.l(ou6Var, null, null, null, null, null, false, (kb4) objQ, dd4Var, 6, 254);
        } else {
            dd4Var.Y();
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new cn3(i2, 0, kb4Var, ou6Var, str, list);
        }
    }

    public static final void B(q5a q5aVar, pj7 pj7Var, ou6 ou6Var, kb4 kb4Var, ib4 ib4Var, kb4 kb4Var2, ib4 ib4Var2, ib4 ib4Var3, ib4 ib4Var4, dd4 dd4Var, int i2) {
        int i3;
        ou6 ou6Var2;
        ib4 ib4Var5;
        yb4 yb4Var;
        boolean z2;
        dd4 dd4Var2 = dd4Var;
        dd4Var2.h0(1933714733);
        if ((i2 & 6) == 0) {
            i3 = (dd4Var2.f(q5aVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= dd4Var2.f(pj7Var) ? 32 : 16;
        }
        int i4 = i3 | 384;
        if ((i2 & 3072) == 0) {
            i4 |= dd4Var2.h(kb4Var) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i4 |= dd4Var2.h(ib4Var) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i4 |= dd4Var2.h(kb4Var2) ? 131072 : Parser.ARGC_LIMIT;
        }
        if ((1572864 & i2) == 0) {
            i4 |= dd4Var2.h(ib4Var2) ? 1048576 : 524288;
        }
        if ((12582912 & i2) == 0) {
            i4 |= dd4Var2.h(ib4Var3) ? 8388608 : 4194304;
        }
        if ((100663296 & i2) == 0) {
            i4 |= dd4Var2.h(ib4Var4) ? 67108864 : 33554432;
        }
        if (dd4Var2.V(i4 & 1, (38347923 & i4) != 38347922)) {
            ww8 ww8VarJ = kc5.J(dd4Var2);
            ou6 ou6Var3 = lu6.a;
            ou6 ou6VarQ = kc5.Q(ou6Var3, ww8VarJ, 14);
            vf0 vf0Var = bv4.z;
            jv jvVar = pv.c;
            ie1 ie1VarA = ge1.a(jvVar, vf0Var, dd4Var2, 0);
            int iHashCode = Long.hashCode(dd4Var2.T);
            lr7 lr7VarL = dd4Var2.l();
            ou6 ou6VarL0 = s32.L0(dd4Var2, ou6VarQ);
            ml1.k.getClass();
            ib4 ib4Var6 = ll1.b;
            dd4Var2.j0();
            if (dd4Var2.S) {
                dd4Var2.k(ib4Var6);
            } else {
                dd4Var2.s0();
            }
            jm jmVar = ll1.f;
            un9.s(jmVar, dd4Var2, ie1VarA);
            jm jmVar2 = ll1.e;
            un9.s(jmVar2, dd4Var2, lr7VarL);
            Integer numValueOf = Integer.valueOf(iHashCode);
            jm jmVar3 = ll1.g;
            un9.s(jmVar3, dd4Var2, numValueOf);
            kd kdVar = ll1.h;
            un9.r(dd4Var2, kdVar);
            yb4 yb4Var2 = ll1.d;
            un9.s(yb4Var2, dd4Var2, ou6VarL0);
            un9.a(dd4Var2, tg9.h(k0(ou6Var3, pj7Var), 12.0f));
            ou6 ou6VarW = t96.w(n0(tg9.f(ou6Var3, 1.0f), 16.0f, 0.0f, 2), s00.p(dd4Var2).d);
            ie1 ie1VarA2 = ge1.a(jvVar, vf0Var, dd4Var2, 0);
            int iHashCode2 = Long.hashCode(dd4Var2.T);
            lr7 lr7VarL2 = dd4Var2.l();
            ou6 ou6VarL02 = s32.L0(dd4Var2, ou6VarW);
            dd4Var2.j0();
            if (dd4Var2.S) {
                dd4Var2.k(ib4Var6);
            } else {
                dd4Var2.s0();
            }
            un9.s(jmVar, dd4Var2, ie1VarA2);
            un9.s(jmVar2, dd4Var2, lr7VarL2);
            ky0.v(iHashCode2, dd4Var2, jmVar3, dd4Var2, kdVar);
            un9.s(yb4Var2, dd4Var2, ou6VarL02);
            ou6 ou6VarW2 = t96.w(ou6Var3, s00.p(dd4Var2).a);
            long jG = dd1.g(s00.o(dd4Var2), 1.0f);
            lp4 lp4Var = jf0.G;
            ou6 ou6VarL03 = l0(fe.L(ou6VarW2, jG, lp4Var), 16.0f);
            String strK = wn9.K((pv9) vu9.H.getValue(), dd4Var2);
            List listR = wm9.r((hv9) rv.u.getValue(), dd4Var2);
            int i5 = q5aVar.b.a;
            int i6 = i4;
            boolean z3 = (i4 & 7168) == 2048;
            Object objQ = dd4Var2.Q();
            Object obj = vl1.a;
            if (z3 || objQ == obj) {
                ib4Var5 = ib4Var6;
                objQ = new mj(26, kb4Var);
                dd4Var2.p0(objQ);
            } else {
                ib4Var5 = ib4Var6;
            }
            e11.t(strK, listR, i5, ou6VarL03, (kb4) objQ, dd4Var2, 0);
            int iOrdinal = q5aVar.b.ordinal();
            if (iOrdinal != 0) {
                if (iOrdinal == 1) {
                    ky0.z(dd4Var2, 1949140576, ou6Var3, 4.0f, dd4Var2);
                    boolean z4 = q5aVar.d;
                    long j2 = q5aVar.a;
                    boolean z5 = (i6 & 458752) == 131072;
                    Object objQ2 = dd4Var2.Q();
                    if (z5 || objQ2 == obj) {
                        objQ2 = new ir6(24, kb4Var2);
                        dd4Var2.p0(objQ2);
                    }
                    h(z4, j2, ib4Var2, (ib4) objQ2, dd4Var2, (i6 >> 9) & 7168);
                    z2 = false;
                    dd4Var2.q(false);
                } else {
                    if (iOrdinal != 2) {
                        throw j39.e(-352767873, dd4Var2, false);
                    }
                    ky0.z(dd4Var2, 1950061276, ou6Var3, 4.0f, dd4Var2);
                    boolean z6 = (i6 & 458752) == 131072;
                    Object objQ3 = dd4Var2.Q();
                    if (z6 || objQ3 == obj) {
                        objQ3 = new ir6(25, kb4Var2);
                        dd4Var2.p0(objQ3);
                    }
                    z2 = false;
                    n((ib4) objQ3, dd4Var2, 0);
                    dd4Var2.q(false);
                }
                yb4Var = yb4Var2;
            } else {
                ky0.z(dd4Var2, 1949623339, ou6Var3, 4.0f, dd4Var2);
                yb4Var = yb4Var2;
                R(q5aVar.c, q5aVar.d, q5aVar.a, ib4Var2, ib4Var, dd4Var2, ((i6 >> 9) & 7168) | (i6 & 57344));
                dd4Var2 = dd4Var2;
                z2 = false;
                dd4Var2.q(false);
            }
            xv5.z(dd4Var2, true, ou6Var3, 12.0f, dd4Var2);
            ib4 ib4Var7 = ib4Var5;
            nha.c(wn9.K((pv9) vu9.I.getValue(), dd4Var2), l0(ou6Var3, 16.0f), s00.o(dd4Var2).a, (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, (vaa) null, 0L, 0, false, 0, 0, (kb4) null, s00.q(dd4Var2).h, dd4Var, 48, 0, 131064);
            dd4Var2 = dd4Var;
            ou6 ou6VarW3 = t96.w(n0(tg9.f(ou6Var3, 1.0f), 16.0f, 0.0f, 2), s00.p(dd4Var2).d);
            ie1 ie1VarA3 = ge1.a(jvVar, vf0Var, dd4Var2, 0);
            int iHashCode3 = Long.hashCode(dd4Var2.T);
            lr7 lr7VarL3 = dd4Var2.l();
            ou6 ou6VarL04 = s32.L0(dd4Var2, ou6VarW3);
            dd4Var2.j0();
            if (dd4Var2.S) {
                dd4Var2.k(ib4Var7);
            } else {
                dd4Var2.s0();
            }
            un9.s(jmVar, dd4Var2, ie1VarA3);
            un9.s(jmVar2, dd4Var2, lr7VarL3);
            ky0.v(iHashCode3, dd4Var2, jmVar3, dd4Var2, kdVar);
            un9.s(yb4Var, dd4Var2, ou6VarL04);
            e11.v(null, wn9.K((pv9) vu9.z.getValue(), dd4Var2), wn9.K((pv9) vu9.A.getValue(), dd4Var2), tw2.g(dd4Var2, 1.0f, t96.w(ou6Var3, s00.p(dd4Var2).a), lp4Var, 16.0f), ib4Var3, dd4Var2, (i6 >> 9) & 57344, 1);
            un9.a(dd4Var2, tg9.h(ou6Var3, 4.0f));
            e11.v(null, wn9.K((pv9) vu9.v.getValue(), dd4Var2), wn9.K((pv9) vu9.w.getValue(), dd4Var2), tw2.g(dd4Var2, 1.0f, t96.w(ou6Var3, s00.p(dd4Var2).a), lp4Var, 16.0f), ib4Var4, dd4Var2, (i6 >> 12) & 57344, 1);
            dd4Var2.q(true);
            un9.a(dd4Var2, yib.B(p0(ou6Var3, 0.0f, 0.0f, 0.0f, 12.0f, 7), 14));
            dd4Var2.q(true);
            ou6Var2 = ou6Var3;
        } else {
            dd4Var2.Y();
            ou6Var2 = ou6Var;
        }
        ye8 ye8VarU = dd4Var2.u();
        if (ye8VarU != null) {
            ye8VarU.d = new fl0(q5aVar, pj7Var, ou6Var2, kb4Var, ib4Var, kb4Var2, ib4Var2, ib4Var3, ib4Var4, i2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:76:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void C(java.lang.String r37, java.lang.String r38, long r39, defpackage.a84 r41, dd4 r42, int r43, int r44) {
        /*
            Method dump skipped, instruction units count: 500
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gjb.C(java.lang.String, java.lang.String, long, a84, dd4, int, int):void");
    }

    public static final void D(final String str, final String str2, final long j2, boolean z2, final boolean z3, final long j3, final ib4 ib4Var, final rj1 rj1Var, dd4 dd4Var, final int i2) {
        int i3;
        String str3;
        ib4 ib4Var2;
        dd4 dd4Var2;
        boolean z4;
        String strK;
        final boolean z5 = z2;
        dd4Var.h0(1825492348);
        if ((i2 & 6) == 0) {
            i3 = (dd4Var.f(str) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            str3 = str2;
            i3 |= dd4Var.f(str3) ? 32 : 16;
        } else {
            str3 = str2;
        }
        if ((i2 & 384) == 0) {
            i3 |= dd4Var.e(j2) ? 256 : Token.CASE;
        }
        if ((i2 & 3072) == 0) {
            i3 |= dd4Var.g(z5) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= dd4Var.g(z3) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= dd4Var.e(j3) ? 131072 : Parser.ARGC_LIMIT;
        }
        if ((i2 & 1572864) == 0) {
            ib4Var2 = ib4Var;
            i3 |= dd4Var.h(ib4Var2) ? 1048576 : 524288;
        } else {
            ib4Var2 = ib4Var;
        }
        if ((12582912 & i2) == 0) {
            i3 |= dd4Var.h(rj1Var) ? 8388608 : 4194304;
        }
        if (dd4Var.V(i3 & 1, (4793491 & i3) != 4793490)) {
            lu6 lu6Var = lu6.a;
            ou6 ou6VarL0 = l0(fe.L(t96.w(tg9.f(lu6Var, 1.0f), s00.p(dd4Var).a), dd1.g(s00.o(dd4Var), 1.0f), jf0.G), 16.0f);
            ie1 ie1VarA = ge1.a(pv.c, bv4.z, dd4Var, 0);
            int i4 = i3;
            int iHashCode = Long.hashCode(dd4Var.T);
            lr7 lr7VarL = dd4Var.l();
            ou6 ou6VarL02 = s32.L0(dd4Var, ou6VarL0);
            ml1.k.getClass();
            um1 um1Var = ll1.b;
            dd4Var.j0();
            if (dd4Var.S) {
                dd4Var.k(um1Var);
            } else {
                dd4Var.s0();
            }
            un9.s(ll1.f, dd4Var, ie1VarA);
            un9.s(ll1.e, dd4Var, lr7VarL);
            un9.s(ll1.g, dd4Var, Integer.valueOf(iHashCode));
            un9.r(dd4Var, ll1.h);
            un9.s(ll1.d, dd4Var, ou6VarL02);
            nha.c(str, (ou6) null, 0L, (g60) null, 0L, (t74) null, a84.v, (c64) null, 0L, (jda) null, (vaa) null, 0L, 0, false, 0, 0, (kb4) null, s00.q(dd4Var).i, dd4Var, (i4 & 14) | 1572864, 0, 131006);
            dd4Var2 = dd4Var;
            un9.a(dd4Var2, tg9.h(lu6Var, 12.0f));
            C(wn9.K((pv9) vu9.G.getValue(), dd4Var2), str3, j2, a84.u, dd4Var2, (i4 & Token.ASSIGN_MOD) | 3072 | (i4 & 896), 0);
            un9.a(dd4Var2, tg9.h(lu6Var, 8.0f));
            int i5 = i4 >> 18;
            rj1Var.c(ke1.a, dd4Var2, Integer.valueOf((i5 & Token.ASSIGN_MOD) | 6));
            un9.a(dd4Var2, tg9.h(lu6Var, 8.0f));
            String strK2 = wn9.K((pv9) vu9.B.getValue(), dd4Var2);
            if (j3 > 0) {
                dd4Var2.f0(-1953337407);
                z4 = false;
                dd4Var2.q(false);
                strK = zk4.i(j3, "HH:mm dd/MM/yyyy");
            } else {
                z4 = false;
                dd4Var2.f0(-1953252994);
                strK = wn9.K((pv9) vu9.O.getValue(), dd4Var2);
                dd4Var2.q(false);
            }
            C(strK2, strK, 0L, null, dd4Var2, 0, 12);
            un9.a(dd4Var2, tg9.h(lu6Var, 16.0f));
            if (z3 && !z5) {
                z4 = true;
            }
            rj7 rj7Var = cs0.a;
            z5 = z2;
            boolean z6 = z4;
            ib4 ib4Var3 = ib4Var2;
            lc5.d(ib4Var3, tg9.f(lu6Var, 1.0f), z6, tp8.a(999.0f), cs0.a(s00.o(dd4Var2).a, s00.o(dd4Var2).b, dd1.g(s00.o(dd4Var2), 3.0f), s00.o(dd4Var2).s, dd4Var2, 0), null, null, null, jf0.G(-4426782, new a41(7, z5), dd4Var2), dd4Var2, (i5 & 14) | 805306416, 480);
            dd4Var2.q(true);
        } else {
            dd4Var2 = dd4Var;
            dd4Var2.Y();
        }
        ye8 ye8VarU = dd4Var2.u();
        if (ye8VarU != null) {
            ye8VarU.d = new yb4() { // from class: h5a
                @Override // defpackage.yb4
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    gjb.D(str, str2, j2, z5, z3, j3, ib4Var, rj1Var, (dd4) obj, qu1.x0(i2 | 1));
                    return heb.a;
                }
            };
        }
    }

    public static final void E(t27 t27Var, dd4 dd4Var, int i2) {
        List list;
        m8 m8Var;
        a07 a07Var;
        a07 a07Var2;
        t27Var.getClass();
        dd4Var.h0(384787926);
        int i3 = 2;
        int i4 = (dd4Var.f(t27Var) ? 4 : 2) | i2;
        if (dd4Var.V(i4 & 1, (i4 & 3) != 2)) {
            pj4 pj4VarA = e36.a(dd4Var);
            if (pj4VarA == null) {
                gp.j("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
            p5a p5aVar = (p5a) ((qtb) qx1.N(ug8.a(p5a.class), pj4VarA.f(), null, pj4VarA instanceof pj4 ? pj4VarA.d() : v02.b, ek5.a(dd4Var), null));
            a07 a07VarB = bx1.B(p5aVar.d, dd4Var);
            List listR = wm9.r((hv9) rv.u.getValue(), dd4Var);
            Object[] objArr = new Object[0];
            Object objQ = dd4Var.Q();
            Object obj = vl1.a;
            if (objQ == obj) {
                objQ = new i5a(0);
                dd4Var.p0(objQ);
            }
            a07 a07Var3 = (a07) ww1.b0(objArr, (ib4) objQ, dd4Var, 48);
            Object[] objArr2 = new Object[0];
            Object objQ2 = dd4Var.Q();
            if (objQ2 == obj) {
                objQ2 = new i5a(1);
                dd4Var.p0(objQ2);
            }
            a07 a07Var4 = (a07) ww1.b0(objArr2, (ib4) objQ2, dd4Var, 48);
            Object[] objArr3 = new Object[0];
            Object objQ3 = dd4Var.Q();
            if (objQ3 == obj) {
                objQ3 = new i5a(2);
                dd4Var.p0(objQ3);
            }
            a07 a07Var5 = (a07) ww1.b0(objArr3, (ib4) objQ3, dd4Var, 48);
            Object objQ4 = dd4Var.Q();
            if (objQ4 == obj) {
                objQ4 = dk9.x((Object) null);
                dd4Var.p0(objQ4);
            }
            a07 a07Var6 = (a07) objQ4;
            Object objQ5 = dd4Var.Q();
            if (objQ5 == obj) {
                objQ5 = lc5.Z(dd4Var);
                dd4Var.p0(objQ5);
            }
            vx1 vx1Var = (vx1) objQ5;
            m8 m8Var2 = (m8) dd4Var.j(a9.a);
            pp1 pp1Var = p5aVar.e;
            boolean zF = dd4Var.f(m8Var2) | dd4Var.f(a07Var3) | dd4Var.f(a07Var4) | dd4Var.h(listR);
            Object objQ6 = dd4Var.Q();
            if (zF || objQ6 == obj) {
                list = listR;
                objQ6 = new ip8(m8Var2, list, a07Var3, a07Var4, null);
                m8Var = m8Var2;
                a07Var = a07Var3;
                a07Var2 = a07Var4;
                dd4Var.p0(objQ6);
            } else {
                list = listR;
                a07Var = a07Var3;
                a07Var2 = a07Var4;
                m8Var = m8Var2;
            }
            wx1.e(pp1Var, null, (zb4) objQ6, dd4Var, 0);
            ms7 ms7Var = new ms7(gc1.Y("zip"));
            boolean zF2 = dd4Var.f(a07Var2);
            Object objQ7 = dd4Var.Q();
            if (zF2 || objQ7 == obj) {
                objQ7 = new rl0(a07Var6, a07Var2, 28);
                dd4Var.p0(objQ7);
            }
            a07 a07Var7 = a07Var;
            a07 a07Var8 = a07Var2;
            gx1.p(wn9.K((pv9) vu9.p.getValue(), dd4Var), tg9.c, false, jf0.G(846433106, new oe9(t27Var, 5), dd4Var), null, jf0.G(1945762464, new oq2(p5aVar, list, vx1Var, m8Var, e11.c0(ms7Var, (kb4) objQ7, dd4Var, 8), a07Var, a07VarB), dd4Var), dd4Var, 199728, 20);
            boolean zBooleanValue = ((Boolean) a07Var7.getValue()).booleanValue();
            q5a q5aVar = (q5a) a07VarB.getValue();
            boolean zF3 = dd4Var.f(a07Var7);
            Object objQ8 = dd4Var.Q();
            if (zF3 || objQ8 == obj) {
                objQ8 = new aq9(a07Var7, 6);
                dd4Var.p0(objQ8);
            }
            kb4 kb4Var = (kb4) objQ8;
            boolean zF4 = dd4Var.f(p5aVar);
            Object objQ9 = dd4Var.Q();
            if (zF4 || objQ9 == obj) {
                objQ9 = new ci4(p5aVar, i3);
                dd4Var.p0(objQ9);
            }
            lw1.k(zBooleanValue, q5aVar, kb4Var, (bc4) objQ9, dd4Var, 0);
            boolean zBooleanValue2 = ((Boolean) a07Var8.getValue()).booleanValue();
            boolean zF5 = dd4Var.f((bi5) a07Var6.getValue());
            Object objQ10 = dd4Var.Q();
            if (zF5 || objQ10 == obj) {
                bi5 bi5Var = (bi5) a07Var6.getValue();
                String name = bi5Var != null ? bi5Var.getName() : null;
                objQ10 = name == null ? "" : name;
                dd4Var.p0(objQ10);
            }
            String str = (String) objQ10;
            q5a q5aVar2 = (q5a) a07VarB.getValue();
            boolean zF6 = dd4Var.f(a07Var8);
            Object objQ11 = dd4Var.Q();
            if (zF6 || objQ11 == obj) {
                objQ11 = new aq9(a07Var8, 7);
                dd4Var.p0(objQ11);
            }
            kb4 kb4Var2 = (kb4) objQ11;
            boolean zF7 = dd4Var.f(p5aVar);
            Object objQ12 = dd4Var.Q();
            if (zF7 || objQ12 == obj) {
                objQ12 = new k49(a07Var6, p5aVar, 5);
                dd4Var.p0(objQ12);
            }
            ww1.n(zBooleanValue2, str, q5aVar2, kb4Var2, (kb4) objQ12, dd4Var, 0);
            boolean zBooleanValue3 = ((Boolean) a07Var5.getValue()).booleanValue();
            vvb vvbVar = ((q5a) a07VarB.getValue()).c;
            boolean z2 = ((q5a) a07VarB.getValue()).e;
            boolean zF8 = dd4Var.f(a07Var5);
            Object objQ13 = dd4Var.Q();
            if (zF8 || objQ13 == obj) {
                objQ13 = new aq9(a07Var5, 5);
                dd4Var.p0(objQ13);
            }
            kb4 kb4Var3 = (kb4) objQ13;
            boolean zF9 = dd4Var.f(p5aVar);
            Object objQ14 = dd4Var.Q();
            if (zF9 || objQ14 == obj) {
                s49 s49Var = new s49(1, p5aVar, p5a.class, "updateWebDavSyncInfo", "updateWebDavSyncInfo(Lcom/reader/data/sync/model/WebDavSyncInfo;)V", 0, 13);
                dd4Var.p0(s49Var);
                objQ14 = s49Var;
            }
            kb4 kb4Var4 = (kb4) ((ei5) objQ14);
            boolean zF10 = dd4Var.f(p5aVar);
            Object objQ15 = dd4Var.Q();
            if (zF10 || objQ15 == obj) {
                s49 s49Var2 = new s49(1, p5aVar, p5a.class, "testWebDavConnection", "testWebDavConnection(Lcom/reader/data/sync/model/WebDavSyncInfo;)V", 0, 14);
                dd4Var.p0(s49Var2);
                objQ15 = s49Var2;
            }
            j(zBooleanValue3, vvbVar, z2, kb4Var3, kb4Var4, (kb4) ((ei5) objQ15), dd4Var, 0);
        } else {
            dd4Var.Y();
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new oe9(i2, 4, t27Var);
        }
    }

    public static final void F(final float f2, final int i2, ou6 ou6Var, final kb4 kb4Var, final kb4 kb4Var2, dd4 dd4Var, int i3) {
        dd4Var.h0(-1000092041);
        int i4 = (dd4Var.c(f2) ? 4 : 2) | i3 | (dd4Var.d(i2) ? 32 : 16) | (dd4Var.h(kb4Var) ? 2048 : 1024) | (dd4Var.h(kb4Var2) ? 16384 : 8192);
        if (dd4Var.V(i4 & 1, (i4 & 9363) != 9362)) {
            boolean z2 = ((i4 & 7168) == 2048) | ((i4 & 57344) == 16384);
            Object objQ = dd4Var.Q();
            if (z2 || objQ == vl1.a) {
                objQ = new vf6(21, kb4Var, kb4Var2);
                dd4Var.p0(objQ);
            }
            i(ou6Var, (ib4) objQ, jf0.G(711923369, new zb4() { // from class: eq6
                @Override // defpackage.zb4
                public final Object c(Object obj, Object obj2, Object obj3) {
                    boolean z3;
                    lp4 lp4Var = jf0.G;
                    dd4 dd4Var2 = (dd4) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    ((ke1) obj).getClass();
                    if (dd4Var2.V(iIntValue & 1, (iIntValue & 17) != 16)) {
                        String strK = wn9.K((pv9) zu9.I.getValue(), dd4Var2);
                        lu6 lu6Var = lu6.a;
                        ou6 ou6VarF = tg9.f(lu6Var, 1.0f);
                        pk1 pk1Var = new pk1(29);
                        kb4 kb4Var3 = kb4Var;
                        boolean zF = dd4Var2.f(kb4Var3);
                        Object objQ2 = dd4Var2.Q();
                        Object obj4 = vl1.a;
                        if (zF || objQ2 == obj4) {
                            objQ2 = new mj(17, kb4Var3);
                            dd4Var2.p0(objQ2);
                        }
                        gjb.z(f2, strK, pk1Var, 0.0f, 5.0f, 0.1f, ou6VarF, (kb4) objQ2, dd4Var2, 1797120);
                        un9.a(dd4Var2, tg9.h(lu6Var, 8.0f));
                        wf0 wf0Var = bv4.x;
                        iv ivVar = pv.a;
                        eq8 eq8VarA = dq8.a(ivVar, wf0Var, dd4Var2, 48);
                        int iHashCode = Long.hashCode(dd4Var2.T);
                        lr7 lr7VarL = dd4Var2.l();
                        ou6 ou6VarL0 = s32.L0(dd4Var2, lu6Var);
                        ml1.k.getClass();
                        um1 um1Var = ll1.b;
                        dd4Var2.j0();
                        if (dd4Var2.S) {
                            dd4Var2.k(um1Var);
                        } else {
                            dd4Var2.s0();
                        }
                        jm jmVar = ll1.f;
                        un9.s(jmVar, dd4Var2, eq8VarA);
                        jm jmVar2 = ll1.e;
                        un9.s(jmVar2, dd4Var2, lr7VarL);
                        Integer numValueOf = Integer.valueOf(iHashCode);
                        jm jmVar3 = ll1.g;
                        un9.s(jmVar3, dd4Var2, numValueOf);
                        kd kdVar = ll1.h;
                        un9.r(dd4Var2, kdVar);
                        jm jmVar4 = ll1.d;
                        un9.s(jmVar4, dd4Var2, ou6VarL0);
                        String strK2 = wn9.K((pv9) zu9.G.getValue(), dd4Var2);
                        ur9 ur9Var = s96.a;
                        nha.c(strK2, new bp5(1.0f, true), ((q96) dd4Var2.j(ur9Var)).a.q, (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, new vaa(5), 0L, 0, false, 0, 0, (kb4) null, ((q96) dd4Var2.j(ur9Var)).b.j, dd4Var2, 0, 0, 130040);
                        Object objQ3 = dd4Var2.Q();
                        Object obj5 = objQ3;
                        if (objQ3 == obj4) {
                            m53[] m53VarArr = {(m53) a53.e0.getValue(), (m53) a53.f0.getValue(), (m53) a53.c0.getValue(), (m53) a53.d0.getValue()};
                            dd4Var2.p0(m53VarArr);
                            obj5 = m53VarArr;
                        }
                        m53[] m53VarArr2 = (m53[]) obj5;
                        ou6 ou6VarL = fe.L(t96.w(lu6Var, ((q96) dd4Var2.j(ur9Var)).c.b), lc1.c(0.2f, ((q96) dd4Var2.j(ur9Var)).a.a), lp4Var);
                        eq8 eq8VarA2 = dq8.a(ivVar, bv4.w, dd4Var2, 0);
                        int iHashCode2 = Long.hashCode(dd4Var2.T);
                        lr7 lr7VarL2 = dd4Var2.l();
                        ou6 ou6VarL02 = s32.L0(dd4Var2, ou6VarL);
                        dd4Var2.j0();
                        if (dd4Var2.S) {
                            dd4Var2.k(um1Var);
                        } else {
                            dd4Var2.s0();
                        }
                        un9.s(jmVar, dd4Var2, eq8VarA2);
                        un9.s(jmVar2, dd4Var2, lr7VarL2);
                        ky0.v(iHashCode2, dd4Var2, jmVar3, dd4Var2, kdVar);
                        un9.s(jmVar4, dd4Var2, ou6VarL02);
                        dd4Var2.f0(1760668621);
                        int length = m53VarArr2.length;
                        int i5 = 0;
                        int i6 = 0;
                        while (i6 < length) {
                            m53 m53Var = m53VarArr2[i6];
                            int i7 = i5 + 1;
                            boolean z4 = i5 == i2;
                            p35 p35VarC = i25.c(m53Var, dd4Var2, 0);
                            ur9 ur9Var2 = s96.a;
                            long j2 = ((q96) dd4Var2.j(ur9Var2)).a.q;
                            int i8 = length;
                            ou6 ou6VarO = tg9.o(lu6Var, 48.0f, 32.0f);
                            kb4 kb4Var4 = kb4Var2;
                            boolean zF2 = dd4Var2.f(kb4Var4) | dd4Var2.d(i5);
                            Object objQ4 = dd4Var2.Q();
                            if (zF2 || objQ4 == obj4) {
                                z3 = z4;
                                objQ4 = new bk0(kb4Var4, i5, 9);
                                dd4Var2.p0(objQ4);
                            } else {
                                z3 = z4;
                            }
                            mx4.a(p35VarC, (String) null, gjb.l0(fe.L(fw.J(null, (ib4) objQ4, ou6VarO, false, 15), lc1.c(z3 ? 0.5f : 0.0f, ((q96) dd4Var2.j(ur9Var2)).a.a), lp4Var), 4.0f), j2, dd4Var2, 48, 0);
                            i6++;
                            i5 = i7;
                            length = i8;
                        }
                        dd4Var2.q(false);
                        dd4Var2.q(true);
                        un9.a(dd4Var2, tg9.r(lu6Var, 4.0f));
                        dd4Var2.q(true);
                        un9.a(dd4Var2, tg9.h(lu6Var, 12.0f));
                    } else {
                        dd4Var2.Y();
                    }
                    return heb.a;
                }
            }, dd4Var), dd4Var, 390);
        } else {
            dd4Var.Y();
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new fq6(f2, i2, ou6Var, kb4Var, kb4Var2, i3);
        }
    }

    public static final void G(long j2, ib4 ib4Var, dd4 dd4Var, int i2) {
        long j3;
        dd4Var.h0(518454167);
        int i3 = (dd4Var.e(j2) ? 4 : 2) | i2;
        if (dd4Var.V(i3 & 1, (i3 & 19) != 18)) {
            lu6 lu6Var = lu6.a;
            ou6 ou6VarN = tg9.n(lu6Var, 32.0f);
            ha6 ha6VarD = pn0.d(bv4.b, false);
            int iHashCode = Long.hashCode(dd4Var.T);
            lr7 lr7VarL = dd4Var.l();
            ou6 ou6VarL0 = s32.L0(dd4Var, ou6VarN);
            ml1.k.getClass();
            um1 um1Var = ll1.b;
            dd4Var.j0();
            if (dd4Var.S) {
                dd4Var.k(um1Var);
            } else {
                dd4Var.s0();
            }
            un9.s(ll1.f, dd4Var, ha6VarD);
            un9.s(ll1.e, dd4Var, lr7VarL);
            un9.s(ll1.g, dd4Var, Integer.valueOf(iHashCode));
            un9.r(dd4Var, ll1.h);
            un9.s(ll1.d, dd4Var, ou6VarL0);
            p35 p35VarC = i25.c((m53) a53.A.getValue(), dd4Var, 0);
            ur9 ur9Var = s96.a;
            long j4 = ((q96) dd4Var.j(ur9Var)).a.q;
            xf0 xf0Var = bv4.f;
            zn0 zn0Var = zn0.a;
            ou6 ou6VarW = t96.w(tg9.n(zn0Var.a(lu6Var, xf0Var), 32.0f), tp8.a);
            Object objQ = dd4Var.Q();
            if (objQ == vl1.a) {
                objQ = new hpa(13, ib4Var);
                dd4Var.p0(objQ);
            }
            mx4.a(p35VarC, (String) null, l0(fw.J(null, (ib4) objQ, ou6VarW, false, 15), 6.0f), j4, dd4Var, 48, 0);
            if (j2 == 16) {
                dd4Var.f0(2048976450);
                long j5 = ((q96) dd4Var.j(ur9Var)).a.q;
                dd4Var.q(false);
                j3 = j5;
            } else {
                dd4Var.f0(2049047936);
                dd4Var.q(false);
                j3 = j2;
            }
            y86.c(2.0f, 48, 0, j3, dd4Var, p0(n0(zn0Var.a(lu6Var, bv4.u), 6.0f, 0.0f, 2), 0.0f, 0.0f, 0.0f, 4.0f, 7));
            dd4Var.q(true);
        } else {
            dd4Var.Y();
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new go6(j2, ib4Var, i2);
        }
    }

    public static final void H(final yba ybaVar, ou6 ou6Var, final kb4 kb4Var, final kb4 kb4Var2, final kb4 kb4Var3, final kb4 kb4Var4, final kb4 kb4Var5, final kb4 kb4Var6, final ib4 ib4Var, final ib4 ib4Var2, final kb4 kb4Var7, final kb4 kb4Var8, final kb4 kb4Var9, final kb4 kb4Var10, final kb4 kb4Var11, final ac4 ac4Var, final kb4 kb4Var12, dd4 dd4Var, int i2) {
        int i3;
        dd4 dd4Var2;
        dd4Var.h0(828734336);
        int i4 = i2 | (dd4Var.f(ybaVar) ? 4 : 2);
        if ((i2 & 48) == 0) {
            i4 |= dd4Var.f(ou6Var) ? 32 : 16;
        }
        int i5 = i4 | (dd4Var.h(kb4Var) ? 256 : Token.CASE) | (dd4Var.h(kb4Var2) ? 2048 : 1024) | (dd4Var.h(kb4Var3) ? 16384 : 8192) | (dd4Var.h(kb4Var4) ? 131072 : 65536) | (dd4Var.h(kb4Var5) ? 1048576 : 524288) | (dd4Var.h(kb4Var6) ? 8388608 : 4194304) | (dd4Var.h(ib4Var) ? 67108864 : 33554432) | (dd4Var.h(ib4Var2) ? 536870912 : 268435456);
        int i6 = (dd4Var.h(kb4Var7) ? (char) 4 : (char) 2) | (dd4Var.h(kb4Var8) ? ' ' : (char) 16) | (dd4Var.h(kb4Var9) ? 256 : Token.CASE) | (dd4Var.h(kb4Var10) ? 2048 : 1024) | (dd4Var.h(kb4Var11) ? (char) 16384 : (char) 8192) | (dd4Var.h(ac4Var) ? (char) 0 : (char) 0) | (dd4Var.h(kb4Var12) ? (char) 0 : (char) 0);
        if (dd4Var.V(i5 & 1, ((i5 & 306783379) == 306783378 && (599187 & i6) == 599186) ? false : true)) {
            List list = ybaVar.b;
            List list2 = ybaVar.c;
            boolean zF = dd4Var.f(list) | dd4Var.f(list2);
            Object objQ = dd4Var.Q();
            Object obj = vl1.a;
            if (zF || objQ == obj) {
                objQ = fc1.I0(fc1.I0(gc1.Y(new zd1("", "", "", "")), ybaVar.b), list2);
                dd4Var.p0(objQ);
            }
            final List list3 = (List) objQ;
            final boolean zB = ((c73) dd4Var.j(b73.a)).b();
            boolean zG = ((i5 & 3670016) == 1048576) | ((i5 & 14) == 4) | ((i5 & 896) == 256) | ((i5 & 7168) == 2048) | ((i5 & 57344) == 16384) | dd4Var.g(zB) | dd4Var.h(list3) | ((1879048192 & i5) == 536870912) | ((i5 & 458752) == 131072) | ((234881024 & i5) == 67108864) | ((29360128 & i5) == 8388608) | ((i6 & 14) == 4) | ((i6 & Token.ASSIGN_MOD) == 32) | ((i6 & 896) == 256) | ((i6 & 7168) == 2048) | ((i6 & 57344) == 16384) | ((i6 & 458752) == 131072) | ((i6 & 3670016) == 1048576);
            Object objQ2 = dd4Var.Q();
            if (zG || objQ2 == obj) {
                i3 = i5;
                kb4 kb4Var13 = new kb4() { // from class: nq6
                    @Override // defpackage.kb4
                    public final Object invoke(Object obj2) {
                        at5 at5Var = (at5) obj2;
                        at5Var.getClass();
                        final int i7 = 1;
                        final yba ybaVar2 = ybaVar;
                        final kb4 kb4Var14 = kb4Var;
                        final kb4 kb4Var15 = kb4Var2;
                        final kb4 kb4Var16 = kb4Var3;
                        zb4 zb4Var = new zb4() { // from class: vp6
                            @Override // defpackage.zb4
                            public final Object c(Object obj3, Object obj4, Object obj5) {
                                int i8 = i7;
                                heb hebVar = heb.a;
                                lu6 lu6Var = lu6.a;
                                yba ybaVar3 = ybaVar2;
                                switch (i8) {
                                    case 0:
                                        dd4 dd4Var3 = (dd4) obj4;
                                        int iIntValue = ((Integer) obj5).intValue();
                                        ((dr5) obj3).getClass();
                                        if (!dd4Var3.V(iIntValue & 1, (iIntValue & 17) != 16)) {
                                            dd4Var3.Y();
                                        } else {
                                            gjb.I(ybaVar3.m, ybaVar3.k, ybaVar3.l, tg9.f(lu6Var, 1.0f), kb4Var14, kb4Var15, kb4Var16, dd4Var3, 3072);
                                        }
                                        break;
                                    default:
                                        dd4 dd4Var4 = (dd4) obj4;
                                        int iIntValue2 = ((Integer) obj5).intValue();
                                        ((dr5) obj3).getClass();
                                        if (!dd4Var4.V(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                            dd4Var4.Y();
                                        } else {
                                            gjb.d(ybaVar3.q, ybaVar3.p, ybaVar3.s, gjb.m0(tg9.f(lu6Var, 1.0f), 12.0f, 8.0f), kb4Var14, kb4Var15, kb4Var16, dd4Var4, 0);
                                        }
                                        break;
                                }
                                return hebVar;
                            }
                        };
                        final int i8 = 1;
                        at5.b0(at5Var, (String) null, new rj1(zb4Var, true, 537031381), 3);
                        if (!zB) {
                            at5.b0(at5Var, (String) null, new rj1(new hu2(ybaVar2, list3, kb4Var5, ib4Var2), true, -633781072), 3);
                        }
                        at5.b0(at5Var, (String) null, new rj1(new c41(25, ybaVar2, kb4Var4, ib4Var), true, -761908084), 3);
                        final int i9 = 0;
                        final kb4 kb4Var17 = kb4Var6;
                        at5.b0(at5Var, (String) null, new rj1(new zb4() { // from class: up6
                            @Override // defpackage.zb4
                            public final Object c(Object obj3, Object obj4, Object obj5) {
                                int i10 = i9;
                                heb hebVar = heb.a;
                                lu6 lu6Var = lu6.a;
                                kb4 kb4Var18 = kb4Var17;
                                yba ybaVar3 = ybaVar2;
                                dr5 dr5Var = (dr5) obj3;
                                dd4 dd4Var3 = (dd4) obj4;
                                int iIntValue = ((Integer) obj5).intValue();
                                switch (i10) {
                                    case 0:
                                        dr5Var.getClass();
                                        if (!dd4Var3.V(iIntValue & 1, (iIntValue & 17) != 16)) {
                                            dd4Var3.Y();
                                        } else {
                                            gjb.y(ybaVar3.t, 0, kb4Var18, dd4Var3, gjb.m0(tg9.f(lu6Var, 1.0f), 12.0f, 8.0f));
                                        }
                                        break;
                                    default:
                                        dr5Var.getClass();
                                        if (!dd4Var3.V(iIntValue & 1, (iIntValue & 17) != 16)) {
                                            dd4Var3.Y();
                                        } else {
                                            gjb.P(ybaVar3.u, 48, kb4Var18, dd4Var3, tg9.f(lu6Var, 1.0f));
                                        }
                                        break;
                                }
                                return hebVar;
                            }
                        }, true, -900693491), 3);
                        at5.b0(at5Var, (String) null, new rj1(new c41(26, ybaVar2, kb4Var7, kb4Var8), true, -1039478898), 3);
                        final int i10 = 0;
                        final kb4 kb4Var18 = kb4Var9;
                        final kb4 kb4Var19 = kb4Var10;
                        final kb4 kb4Var20 = kb4Var11;
                        at5.b0(at5Var, (String) null, new rj1(new zb4() { // from class: vp6
                            @Override // defpackage.zb4
                            public final Object c(Object obj3, Object obj4, Object obj5) {
                                int i82 = i10;
                                heb hebVar = heb.a;
                                lu6 lu6Var = lu6.a;
                                yba ybaVar3 = ybaVar2;
                                switch (i82) {
                                    case 0:
                                        dd4 dd4Var3 = (dd4) obj4;
                                        int iIntValue = ((Integer) obj5).intValue();
                                        ((dr5) obj3).getClass();
                                        if (!dd4Var3.V(iIntValue & 1, (iIntValue & 17) != 16)) {
                                            dd4Var3.Y();
                                        } else {
                                            gjb.I(ybaVar3.m, ybaVar3.k, ybaVar3.l, tg9.f(lu6Var, 1.0f), kb4Var18, kb4Var19, kb4Var20, dd4Var3, 3072);
                                        }
                                        break;
                                    default:
                                        dd4 dd4Var4 = (dd4) obj4;
                                        int iIntValue2 = ((Integer) obj5).intValue();
                                        ((dr5) obj3).getClass();
                                        if (!dd4Var4.V(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                            dd4Var4.Y();
                                        } else {
                                            gjb.d(ybaVar3.q, ybaVar3.p, ybaVar3.s, gjb.m0(tg9.f(lu6Var, 1.0f), 12.0f, 8.0f), kb4Var18, kb4Var19, kb4Var20, dd4Var4, 0);
                                        }
                                        break;
                                }
                                return hebVar;
                            }
                        }, true, -1178264305), 3);
                        at5.b0(at5Var, (String) null, new rj1(new qz0(21, ybaVar2, ac4Var), true, -1317049712), 3);
                        final kb4 kb4Var21 = kb4Var12;
                        at5.b0(at5Var, (String) null, new rj1(new zb4() { // from class: up6
                            @Override // defpackage.zb4
                            public final Object c(Object obj3, Object obj4, Object obj5) {
                                int i102 = i8;
                                heb hebVar = heb.a;
                                lu6 lu6Var = lu6.a;
                                kb4 kb4Var182 = kb4Var21;
                                yba ybaVar3 = ybaVar2;
                                dr5 dr5Var = (dr5) obj3;
                                dd4 dd4Var3 = (dd4) obj4;
                                int iIntValue = ((Integer) obj5).intValue();
                                switch (i102) {
                                    case 0:
                                        dr5Var.getClass();
                                        if (!dd4Var3.V(iIntValue & 1, (iIntValue & 17) != 16)) {
                                            dd4Var3.Y();
                                        } else {
                                            gjb.y(ybaVar3.t, 0, kb4Var182, dd4Var3, gjb.m0(tg9.f(lu6Var, 1.0f), 12.0f, 8.0f));
                                        }
                                        break;
                                    default:
                                        dr5Var.getClass();
                                        if (!dd4Var3.V(iIntValue & 1, (iIntValue & 17) != 16)) {
                                            dd4Var3.Y();
                                        } else {
                                            gjb.P(ybaVar3.u, 48, kb4Var182, dd4Var3, tg9.f(lu6Var, 1.0f));
                                        }
                                        break;
                                }
                                return hebVar;
                            }
                        }, true, -1455835119), 3);
                        return heb.a;
                    }
                };
                dd4Var2 = dd4Var;
                dd4Var2.p0(kb4Var13);
                objQ2 = kb4Var13;
            } else {
                dd4Var2 = dd4Var;
                i3 = i5;
            }
            rw1.j(ou6Var, null, null, false, null, null, null, false, null, (kb4) objQ2, dd4Var2, (i3 >> 3) & 14, 510);
        } else {
            dd4Var.Y();
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new oq6(ybaVar, ou6Var, kb4Var, kb4Var2, kb4Var3, kb4Var4, kb4Var5, kb4Var6, ib4Var, ib4Var2, kb4Var7, kb4Var8, kb4Var9, kb4Var10, kb4Var11, ac4Var, kb4Var12, i2);
        }
    }

    public static final void I(final float f2, final float f3, final float f4, ou6 ou6Var, final kb4 kb4Var, final kb4 kb4Var2, final kb4 kb4Var3, dd4 dd4Var, final int i2) {
        final ou6 ou6Var2;
        dd4Var.h0(-575732987);
        int i3 = i2 | (dd4Var.c(f2) ? 4 : 2) | (dd4Var.c(f3) ? 32 : 16) | (dd4Var.c(f4) ? 256 : Token.CASE) | (dd4Var.h(kb4Var) ? 16384 : 8192) | (dd4Var.h(kb4Var2) ? 131072 : Parser.ARGC_LIMIT) | (dd4Var.h(kb4Var3) ? 1048576 : 524288);
        if (dd4Var.V(i3 & 1, (599187 & i3) != 599186)) {
            boolean z2 = ((57344 & i3) == 16384) | ((458752 & i3) == 131072) | ((i3 & 3670016) == 1048576);
            Object objQ = dd4Var.Q();
            if (z2 || objQ == vl1.a) {
                objQ = new ma0(20, kb4Var, kb4Var2, kb4Var3);
                dd4Var.p0(objQ);
            }
            ou6Var2 = ou6Var;
            i(ou6Var2, (ib4) objQ, jf0.G(1260797495, new zb4() { // from class: zp6
                @Override // defpackage.zb4
                public final Object c(Object obj, Object obj2, Object obj3) {
                    dd4 dd4Var2 = (dd4) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    ((ke1) obj).getClass();
                    if (dd4Var2.V(iIntValue & 1, (iIntValue & 17) != 16)) {
                        String strK = wn9.K((pv9) iu9.i0.getValue(), dd4Var2);
                        lu6 lu6Var = lu6.a;
                        ou6 ou6VarF = tg9.f(lu6Var, 1.0f);
                        pk1 pk1Var = new pk1(26);
                        kb4 kb4Var4 = kb4Var;
                        boolean zF = dd4Var2.f(kb4Var4);
                        Object objQ2 = dd4Var2.Q();
                        fu6 fu6Var = vl1.a;
                        if (zF || objQ2 == fu6Var) {
                            objQ2 = new mj(14, kb4Var4);
                            dd4Var2.p0(objQ2);
                        }
                        gjb.z(f2, strK, pk1Var, 0.0f, 1.0f, 0.01f, ou6VarF, (kb4) objQ2, dd4Var2, 1797120);
                        String strK2 = wn9.K((pv9) iu9.j0.getValue(), dd4Var2);
                        ou6 ou6VarF2 = tg9.f(lu6Var, 1.0f);
                        pk1 pk1Var2 = new pk1(27);
                        kb4 kb4Var5 = kb4Var2;
                        boolean zF2 = dd4Var2.f(kb4Var5);
                        Object objQ3 = dd4Var2.Q();
                        if (zF2 || objQ3 == fu6Var) {
                            objQ3 = new mj(15, kb4Var5);
                            dd4Var2.p0(objQ3);
                        }
                        gjb.z(f3, strK2, pk1Var2, 0.5f, 3.0f, 0.05f, ou6VarF2, (kb4) objQ3, dd4Var2, 1797120);
                        String strK3 = wn9.K((pv9) mu9.A.getValue(), dd4Var2);
                        ou6 ou6VarF3 = tg9.f(lu6Var, 1.0f);
                        pk1 pk1Var3 = new pk1(28);
                        kb4 kb4Var6 = kb4Var3;
                        boolean zF3 = dd4Var2.f(kb4Var6);
                        Object objQ4 = dd4Var2.Q();
                        if (zF3 || objQ4 == fu6Var) {
                            objQ4 = new mj(16, kb4Var6);
                            dd4Var2.p0(objQ4);
                        }
                        gjb.z(f4, strK3, pk1Var3, 0.0f, 3.0f, 0.05f, ou6VarF3, (kb4) objQ4, dd4Var2, 1797120);
                    } else {
                        dd4Var2.Y();
                    }
                    return heb.a;
                }
            }, dd4Var), dd4Var, 390);
        } else {
            ou6Var2 = ou6Var;
            dd4Var.Y();
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new yb4(f2, f3, f4, ou6Var2, kb4Var, kb4Var2, kb4Var3, i2) { // from class: aq6
                public final /* synthetic */ float a;
                public final /* synthetic */ float b;
                public final /* synthetic */ float c;
                public final /* synthetic */ ou6 d;
                public final /* synthetic */ kb4 e;
                public final /* synthetic */ kb4 f;
                public final /* synthetic */ kb4 s;

                @Override // defpackage.yb4
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iX0 = qu1.x0(3073);
                    gjb.I(this.a, this.b, this.c, this.d, this.e, this.f, this.s, (dd4) obj, iX0);
                    return heb.a;
                }
            };
        }
    }

    public static final void J(String str, List list, ou6 ou6Var, kb4 kb4Var, ib4 ib4Var, dd4 dd4Var, int i2) {
        dd4 dd4Var2 = dd4Var;
        lp4 lp4Var = jf0.G;
        dd4Var2.h0(1161018819);
        int i3 = i2 | (dd4Var2.f(str) ? 4 : 2) | (dd4Var2.h(list) ? 32 : 16) | (dd4Var2.f(ou6Var) ? 256 : Token.CASE) | (dd4Var2.h(kb4Var) ? 2048 : 1024) | (dd4Var2.h(ib4Var) ? 16384 : 8192);
        if (dd4Var2.V(i3 & 1, (i3 & 9363) != 9362)) {
            eq8 eq8VarA = dq8.a(pv.a, bv4.x, dd4Var2, 48);
            int iHashCode = Long.hashCode(dd4Var2.T);
            lr7 lr7VarL = dd4Var2.l();
            ou6 ou6VarL0 = s32.L0(dd4Var2, ou6Var);
            ml1.k.getClass();
            um1 um1Var = ll1.b;
            dd4Var2.j0();
            if (dd4Var2.S) {
                dd4Var2.k(um1Var);
            } else {
                dd4Var2.s0();
            }
            un9.s(ll1.f, dd4Var2, eq8VarA);
            un9.s(ll1.e, dd4Var2, lr7VarL);
            un9.s(ll1.g, dd4Var2, Integer.valueOf(iHashCode));
            un9.r(dd4Var2, ll1.h);
            un9.s(ll1.d, dd4Var2, ou6VarL0);
            p35 p35VarC = i25.c((m53) f53.R.getValue(), dd4Var2, 0);
            ur9 ur9Var = s96.a;
            long j2 = ((q96) dd4Var2.j(ur9Var)).a.q;
            lu6 lu6Var = lu6.a;
            mx4.a(p35VarC, (String) null, l0(fe.L(t96.w(tg9.n(lu6Var, 40.0f), tp8.a), lc1.c(0.2f, ((q96) dd4Var2.j(ur9Var)).a.a), lp4Var), 8.0f), j2, dd4Var2, 48, 0);
            int i4 = i3 & 14;
            boolean z2 = i4 == 4;
            Object objQ = dd4Var2.Q();
            Object obj = vl1.a;
            if (z2 || objQ == obj) {
                Iterator it = list.iterator();
                int i5 = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i5 = -1;
                        break;
                    } else if (lc5.Q(((zd1) it.next()).a, str)) {
                        break;
                    } else {
                        i5++;
                    }
                }
                objQ = Integer.valueOf(i5);
                dd4Var2.p0(objQ);
            }
            int iIntValue = ((Number) objQ).intValue();
            ou6 ou6VarF = xv5.f(1.0f, n0(lu6Var, 12.0f, 0.0f, 2), true);
            mv mvVar = new mv(8.0f, true, new gp(5));
            boolean zH = (i4 == 4) | dd4Var2.h(list) | ((i3 & 7168) == 2048);
            Object objQ2 = dd4Var2.Q();
            if (zH || objQ2 == obj) {
                objQ2 = new bn3(2, kb4Var, str, list);
                dd4Var2.p0(objQ2);
            }
            mt5.a(ou6VarF, iIntValue, null, null, mvVar, null, null, false, (kb4) objQ2, dd4Var, 196608, 476);
            dd4Var2 = dd4Var;
            p35 p35VarC2 = i25.c((m53) a53.q.getValue(), dd4Var2, 0);
            ur9 ur9Var2 = s96.a;
            long j3 = ((q96) dd4Var2.j(ur9Var2)).a.q;
            ou6 ou6VarL = fe.L(t96.w(tg9.n(lu6Var, 40.0f), tp8.a), lc1.c(0.2f, ((q96) dd4Var2.j(ur9Var2)).a.a), lp4Var);
            boolean z3 = (i3 & 57344) == 16384;
            Object objQ3 = dd4Var2.Q();
            if (z3 || objQ3 == obj) {
                objQ3 = new pm6(22, ib4Var);
                dd4Var2.p0(objQ3);
            }
            mx4.a(p35VarC2, (String) null, l0(fw.J(null, (ib4) objQ3, ou6VarL, false, 15), 8.0f), j3, dd4Var2, 48, 0);
            dd4Var2.q(true);
        } else {
            dd4Var2.Y();
        }
        ye8 ye8VarU = dd4Var2.u();
        if (ye8VarU != null) {
            ye8VarU.d = new uj0(str, list, ou6Var, kb4Var, ib4Var, i2, 17);
        }
    }

    public static final void K(xq2 xq2Var, List list, boolean z2, ou6 ou6Var, kb4 kb4Var, dd4 dd4Var, int i2) {
        ou6 ou6Var2;
        dd4 dd4Var2 = dd4Var;
        xq2Var.getClass();
        list.getClass();
        dd4Var2.h0(780936322);
        int i3 = i2 | (dd4Var2.h(xq2Var) ? 4 : 2) | (dd4Var2.h(list) ? 32 : 16) | (dd4Var2.g(z2) ? 256 : Token.CASE) | 3072;
        if (dd4Var2.V(i3 & 1, (i3 & 9363) != 9362)) {
            Object objQ = dd4Var2.Q();
            Object obj = vl1.a;
            if (objQ == obj) {
                objQ = dk9.x(Boolean.FALSE);
                dd4Var2.p0(objQ);
            }
            a07 a07Var = (a07) objQ;
            ou6 ou6Var3 = lu6.a;
            ou6 ou6VarF = tg9.f(ou6Var3, 1.0f);
            ur9 ur9Var = s96.a;
            ou6 ou6VarM0 = m0(fe.L(t96.w(ou6VarF, ((q96) dd4Var2.j(ur9Var)).c.d), dd1.g(((q96) dd4Var2.j(ur9Var)).a, 2.0f), jf0.G), 12.0f, 9.0f);
            eq8 eq8VarA = dq8.a(pv.a, bv4.x, dd4Var2, 48);
            int iHashCode = Long.hashCode(dd4Var2.T);
            lr7 lr7VarL = dd4Var2.l();
            ou6 ou6VarL0 = s32.L0(dd4Var2, ou6VarM0);
            ml1.k.getClass();
            um1 um1Var = ll1.b;
            dd4Var2.j0();
            if (dd4Var2.S) {
                dd4Var2.k(um1Var);
            } else {
                dd4Var2.s0();
            }
            un9.s(ll1.f, dd4Var2, eq8VarA);
            un9.s(ll1.e, dd4Var2, lr7VarL);
            un9.s(ll1.g, dd4Var2, Integer.valueOf(iHashCode));
            un9.r(dd4Var2, ll1.h);
            un9.s(ll1.d, dd4Var2, ou6VarL0);
            List listS0 = fc1.S0(list, 3);
            ArrayList arrayList = new ArrayList(gc1.M(listS0, 10));
            Iterator it = listS0.iterator();
            while (it.hasNext()) {
                arrayList.add(((bp2) it.next()).c);
            }
            v(arrayList, null, dd4Var2, 0);
            un9.a(dd4Var2, tg9.r(ou6Var3, 10.0f));
            String strL = wn9.L((pv9) zt9.L.getValue(), new Object[]{Integer.valueOf(xq2Var.k)}, dd4Var2);
            ur9 ur9Var2 = s96.a;
            nha.c(strL, (ou6) null, ((q96) dd4Var2.j(ur9Var2)).a.s, (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, (vaa) null, 0L, 0, false, 0, 0, (kb4) null, ((q96) dd4Var2.j(ur9Var2)).b.m, dd4Var, 0, 0, 131066);
            dd4Var2 = dd4Var;
            un9.a(dd4Var2, new bp5(1.0f, true));
            ha6 ha6VarD = pn0.d(bv4.b, false);
            int iHashCode2 = Long.hashCode(dd4Var2.T);
            lr7 lr7VarL2 = dd4Var2.l();
            ou6 ou6VarL02 = s32.L0(dd4Var2, ou6Var3);
            ml1.k.getClass();
            um1 um1Var2 = ll1.b;
            dd4Var2.j0();
            if (dd4Var2.S) {
                dd4Var2.k(um1Var2);
            } else {
                dd4Var2.s0();
            }
            un9.s(ll1.f, dd4Var2, ha6VarD);
            un9.s(ll1.e, dd4Var2, lr7VarL2);
            un9.s(ll1.g, dd4Var2, Integer.valueOf(iHashCode2));
            un9.r(dd4Var2, ll1.h);
            un9.s(ll1.d, dd4Var2, ou6VarL02);
            String strK = wn9.K(z2 ? (pv9) zt9.N.getValue() : (pv9) zt9.O.getValue(), dd4Var2);
            Object objQ2 = dd4Var2.Q();
            if (objQ2 == obj) {
                objQ2 = new gpa(a07Var, 5);
                dd4Var2.p0(objQ2);
            }
            zk9.f(strK, false, fw.J(null, (ib4) objQ2, ou6Var3, false, 15), dd4Var2, 48, 0);
            boolean zBooleanValue = ((Boolean) a07Var.getValue()).booleanValue();
            Object objQ3 = dd4Var2.Q();
            if (objQ3 == obj) {
                objQ3 = new gpa(a07Var, 6);
                dd4Var2.p0(objQ3);
            }
            gx1.a(zBooleanValue, null, 0L, null, 0.0f, null, (ib4) objQ3, jf0.G(1278567652, new n79(z2, kb4Var, a07Var, 5), dd4Var2), dd4Var2, 14155776, 62);
            dd4Var2.q(true);
            dd4Var2.q(true);
            ou6Var2 = ou6Var3;
        } else {
            dd4Var2.Y();
            ou6Var2 = ou6Var;
        }
        ye8 ye8VarU = dd4Var2.u();
        if (ye8VarU != null) {
            ye8VarU.d = new z41(xq2Var, list, z2, ou6Var2, kb4Var, i2, 12);
        }
    }

    public static final void L(dd4 dd4Var, int i2) {
        dd4Var.h0(612025650);
        if (dd4Var.V(i2 & 1, i2 != 0)) {
            pn0.a(fe.L(tg9.r(tg9.h(lu6.a, 24.0f), 1.0f), ah1.l(4281940797L), jf0.G), dd4Var, 6);
        } else {
            dd4Var.Y();
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new vw8(i2);
        }
    }

    public static final void M(xq2 xq2Var, ib4 ib4Var, ou6 ou6Var, kb4 kb4Var, kb4 kb4Var2, yb4 yb4Var, dd4 dd4Var, int i2) {
        ou6 ou6Var2;
        int i3;
        ou6 ou6Var3;
        dd4 dd4Var2 = dd4Var;
        xq2Var.getClass();
        ib4Var.getClass();
        dd4Var2.h0(-1647048978);
        int i4 = i2 | (dd4Var2.h(xq2Var) ? 4 : 2) | (dd4Var2.h(ib4Var) ? 32 : 16) | 384 | (dd4Var2.h(kb4Var) ? 2048 : 1024) | (dd4Var2.h(kb4Var2) ? 16384 : 8192) | (dd4Var2.h(yb4Var) ? 131072 : Parser.ARGC_LIMIT);
        if (dd4Var2.V(i4 & 1, (74899 & i4) != 74898)) {
            int i5 = xq2Var.f;
            ou6 ou6Var4 = lu6.a;
            if (i5 == 2 || lc5.Q(fc1.P0(xq2Var.n), jo2.a)) {
                dd4Var2.f0(-1529367884);
                zk9.b(6, 0, dd4Var2, ou6Var4);
                dd4Var2.q(false);
                ye8 ye8VarU = dd4Var2.u();
                if (ye8VarU != null) {
                    ye8VarU.d = new uj0(xq2Var, ib4Var, kb4Var, kb4Var2, yb4Var, i2);
                    return;
                }
                return;
            }
            dd4Var2.f0(-1529306380);
            dd4Var2.q(false);
            ou6 ou6VarF = tg9.f(ou6Var4, 1.0f);
            ur9 ur9Var = s96.a;
            ou6 ou6VarL0 = l0(fe.L(t96.w(ou6VarF, ((q96) dd4Var2.j(ur9Var)).c.d), dd1.g(((q96) dd4Var2.j(ur9Var)).a, 2.0f), jf0.G), 12.0f);
            ie1 ie1VarA = ge1.a(pv.c, bv4.z, dd4Var2, 0);
            int iHashCode = Long.hashCode(dd4Var2.T);
            lr7 lr7VarL = dd4Var2.l();
            ou6 ou6VarL02 = s32.L0(dd4Var2, ou6VarL0);
            ml1.k.getClass();
            um1 um1Var = ll1.b;
            dd4Var2.j0();
            if (dd4Var2.S) {
                dd4Var2.k(um1Var);
            } else {
                dd4Var2.s0();
            }
            un9.s(ll1.f, dd4Var2, ie1VarA);
            un9.s(ll1.e, dd4Var2, lr7VarL);
            un9.s(ll1.g, dd4Var2, Integer.valueOf(iHashCode));
            un9.r(dd4Var2, ll1.h);
            un9.s(ll1.d, dd4Var2, ou6VarL02);
            sgb sgbVar = xq2Var.e;
            a(sgbVar, xq2Var.m, true, null, sgbVar.c, dd4Var2, 392);
            un9.a(dd4Var2, tg9.h(ou6Var4, 16.0f));
            if (xq2Var.c == 3 || xq2Var.b.length() <= 0) {
                i3 = i4;
                ou6Var3 = ou6Var4;
                dd4Var2.f0(-755921526);
                dd4Var2.q(false);
            } else {
                dd4Var2.f0(-756195411);
                i3 = i4;
                ou6Var3 = ou6Var4;
                nha.c(xq2Var.b, (ou6) null, 0L, (g60) null, 0L, (t74) null, a84.v, (c64) null, 0L, (jda) null, (vaa) null, wn9.t(1.15d), 0, false, 0, 0, (kb4) null, ((q96) dd4Var2.j(ur9Var)).b.f, dd4Var, 1572864, 48, 128958);
                dd4Var2 = dd4Var;
                xv5.A(ou6Var3, 12.0f, dd4Var2, false);
            }
            zk9.c(xq2Var.n, false, null, kb4Var, kb4Var2, yb4Var, dd4Var2, i3 & 523264, 6);
            un9.a(dd4Var2, tg9.h(ou6Var3, 16.0f));
            dk9.a(xq2Var.i, xq2Var.h, ib4Var, (ou6) null, false, (ib4) null, dd4Var2, ((i3 << 3) & 896) | 196608);
            dd4Var2.q(true);
            ou6Var2 = ou6Var3;
        } else {
            dd4Var2.Y();
            ou6Var2 = ou6Var;
        }
        ye8 ye8VarU2 = dd4Var2.u();
        if (ye8VarU2 != null) {
            ye8VarU2.d = new uq6(xq2Var, ib4Var, ou6Var2, kb4Var, kb4Var2, yb4Var, i2);
        }
    }

    public static final void N(final String str, final String str2, final x31 x31Var, final mn8 mn8Var, final cp2 cp2Var, final List list, ou6 ou6Var, final String str3, final boolean z2, final boolean z3, final ib4 ib4Var, final ib4 ib4Var2, final ib4 ib4Var3, final kb4 kb4Var, final kb4 kb4Var2, final kb4 kb4Var3, final ib4 ib4Var4, final ib4 ib4Var5, dd4 dd4Var, final int i2) {
        final ou6 ou6Var2;
        String str4;
        p35 p35Var;
        float f2;
        ib4 ib4Var6;
        dd4 dd4Var2 = dd4Var;
        x31Var.getClass();
        mn8Var.getClass();
        fo8 fo8Var = mn8Var.a;
        list.getClass();
        dd4Var2.h0(1899033723);
        int i3 = i2 | (dd4Var2.f(str) ? 4 : 2) | (dd4Var2.f(str2) ? 32 : 16);
        boolean zF = dd4Var2.f(x31Var);
        int i4 = Token.CASE;
        int i5 = i3 | (zF ? 256 : 128) | (dd4Var2.f(mn8Var) ? 2048 : 1024) | (dd4Var2.h(cp2Var) ? 16384 : 8192);
        boolean zH = dd4Var2.h(list);
        int i6 = Parser.ARGC_LIMIT;
        int i7 = i5 | (zH ? 131072 : 65536) | 1572864 | (dd4Var2.f(str3) ? 8388608 : 4194304) | (dd4Var2.g(z2) ? 67108864 : 33554432) | (dd4Var2.g(z3) ? 536870912 : 268435456);
        int i8 = (dd4Var2.h(ib4Var) ? 4 : 2) | (dd4Var2.h(ib4Var2) ? 32 : 16);
        if (dd4Var2.h(ib4Var3)) {
            i4 = 256;
        }
        int i9 = i8 | i4 | (dd4Var2.h(kb4Var) ? 2048 : 1024) | (dd4Var2.h(kb4Var2) ? 16384 : 8192);
        if (dd4Var2.h(kb4Var3)) {
            i6 = 131072;
        }
        int i10 = i9 | i6 | (dd4Var2.h(ib4Var4) ? 1048576 : 524288) | (dd4Var2.h(ib4Var5) ? 8388608 : 4194304);
        if (dd4Var2.V(i7 & 1, ((i7 & 306783379) == 306783378 && (i10 & 4793491) == 4793490) ? false : true)) {
            if (str3 == null) {
                dd4Var2.f0(-389671151);
                String strK = wn9.K((pv9) zt9.M.getValue(), dd4Var2);
                dd4Var2.q(false);
                str4 = strK;
            } else {
                dd4Var2.f0(-389671399);
                dd4Var2.q(false);
                str4 = str3;
            }
            Object objQ = dd4Var2.Q();
            Object obj = vl1.a;
            if (objQ == obj) {
                objQ = ky0.f(dd4Var2);
            }
            z44 z44Var = (z44) objQ;
            uk9 uk9Var = (uk9) dd4Var2.j(xm1.q);
            boolean z4 = ((bw9.a0(fo8Var.e()) && list.isEmpty()) || z3) ? false : true;
            uw1 uw1Var = s00.p(dd4Var2).e;
            boolean zF2 = dd4Var2.f(uk9Var);
            Object objQ2 = dd4Var2.Q();
            jt1 jt1Var = null;
            if (zF2 || objQ2 == obj) {
                objQ2 = new gl6(z44Var, uk9Var, jt1Var, 2);
                dd4Var2.p0(objQ2);
            }
            lc5.u((yb4) objQ2, dd4Var2, heb.a);
            ou6 ou6Var3 = lu6.a;
            ou6 ou6VarW = t96.w(yn2.y(dd4Var2, y86.d0(ou6Var3, 10.0f, uw1Var, 28)), uw1Var);
            long jC = lc1.c(0.98f, s00.o(dd4Var2).p);
            lp4 lp4Var = jf0.G;
            ou6 ou6VarM0 = m0(fw.G(fe.L(ou6VarW, jC, lp4Var), 1.0f, lc1.c(0.08f, s00.o(dd4Var2).a), uw1Var), 12.0f, 10.0f);
            vf0 vf0Var = bv4.z;
            jv jvVar = pv.c;
            ie1 ie1VarA = ge1.a(jvVar, vf0Var, dd4Var2, 0);
            int iHashCode = Long.hashCode(dd4Var2.T);
            lr7 lr7VarL = dd4Var2.l();
            ou6 ou6VarL0 = s32.L0(dd4Var2, ou6VarM0);
            ml1.k.getClass();
            ib4 ib4Var7 = ll1.b;
            dd4Var2.j0();
            if (dd4Var2.S) {
                dd4Var2.k(ib4Var7);
            } else {
                dd4Var2.s0();
            }
            jm jmVar = ll1.f;
            un9.s(jmVar, dd4Var2, ie1VarA);
            jm jmVar2 = ll1.e;
            un9.s(jmVar2, dd4Var2, lr7VarL);
            Integer numValueOf = Integer.valueOf(iHashCode);
            jm jmVar3 = ll1.g;
            un9.s(jmVar3, dd4Var2, numValueOf);
            kd kdVar = ll1.h;
            un9.r(dd4Var2, kdVar);
            jm jmVar4 = ll1.d;
            un9.s(jmVar4, dd4Var2, ou6VarL0);
            ou6 ou6VarF = tg9.f(ou6Var3, 1.0f);
            wf0 wf0Var = bv4.x;
            iv ivVar = pv.a;
            eq8 eq8VarA = dq8.a(ivVar, wf0Var, dd4Var2, 48);
            int iHashCode2 = Long.hashCode(dd4Var2.T);
            lr7 lr7VarL2 = dd4Var2.l();
            ou6 ou6VarL02 = s32.L0(dd4Var2, ou6VarF);
            dd4Var2.j0();
            if (dd4Var2.S) {
                dd4Var2.k(ib4Var7);
            } else {
                dd4Var2.s0();
            }
            un9.s(jmVar, dd4Var2, eq8VarA);
            un9.s(jmVar2, dd4Var2, lr7VarL2);
            ky0.v(iHashCode2, dd4Var2, jmVar3, dd4Var2, kdVar);
            un9.s(jmVar4, dd4Var2, ou6VarL02);
            sg9.a(str, str2, tg9.n(ou6Var3, 34.0f), (ib4) null, dd4Var2, (i7 & 14) | 384 | (i7 & Token.ASSIGN_MOD), 8);
            un9.a(dd4Var2, tg9.r(ou6Var3, 10.0f));
            if (1.0f <= 0.0d) {
                o75.a("invalid weight; must be greater than zero");
            }
            bp5 bp5Var = new bp5(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
            ie1 ie1VarA2 = ge1.a(jvVar, vf0Var, dd4Var2, 0);
            int iHashCode3 = Long.hashCode(dd4Var2.T);
            lr7 lr7VarL3 = dd4Var2.l();
            ou6 ou6VarL03 = s32.L0(dd4Var2, bp5Var);
            dd4Var2.j0();
            if (dd4Var2.S) {
                dd4Var2.k(ib4Var7);
            } else {
                dd4Var2.s0();
            }
            un9.s(jmVar, dd4Var2, ie1VarA2);
            un9.s(jmVar2, dd4Var2, lr7VarL3);
            ky0.v(iHashCode3, dd4Var2, jmVar3, dd4Var2, kdVar);
            un9.s(jmVar4, dd4Var2, ou6VarL03);
            nha.c(str2, (ou6) null, 0L, (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, (vaa) null, 0L, 2, false, 1, 0, (kb4) null, s00.q(dd4Var2).i, dd4Var2, (i7 >> 3) & 14, 24960, 110590);
            String str5 = str4;
            nha.c(str5, (ou6) null, s00.o(dd4Var).s, (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, (vaa) null, 0L, 0, false, 0, 0, (kb4) null, s00.q(dd4Var).l, dd4Var, 0, 0, 131066);
            dd4Var2 = dd4Var;
            dd4Var2.q(true);
            p35 p35VarC = i25.c((m53) f53.s.getValue(), dd4Var2, 0);
            long j2 = s00.o(dd4Var2).s;
            ou6 ou6VarN = tg9.n(ou6Var3, 34.0f);
            rp8 rp8Var = tp8.a;
            ou6 ou6VarW2 = t96.w(ou6VarN, rp8Var);
            boolean z5 = (i10 & 14) == 4;
            Object objQ3 = dd4Var2.Q();
            if (z5 || objQ3 == obj) {
                objQ3 = new hpa(8, ib4Var);
                dd4Var2.p0(objQ3);
            }
            mx4.a(p35VarC, (String) null, l0(fw.J(null, (ib4) objQ3, ou6VarW2, false, 15), 7.0f), j2, dd4Var2, 48, 0);
            un9.a(dd4Var2, tg9.r(ou6Var3, 4.0f));
            p35 p35VarC2 = i25.c(z2 ? (m53) f53.e.getValue() : (m53) f53.d.getValue(), dd4Var2, 0);
            long j3 = s00.o(dd4Var2).s;
            ou6 ou6VarW3 = t96.w(tg9.n(ou6Var3, 34.0f), rp8Var);
            boolean z6 = (i10 & Token.ASSIGN_MOD) == 32;
            Object objQ4 = dd4Var2.Q();
            if (z6 || objQ4 == obj) {
                p35Var = p35VarC2;
                objQ4 = new hpa(9, ib4Var2);
                dd4Var2.p0(objQ4);
            } else {
                p35Var = p35VarC2;
            }
            mx4.a(p35Var, (String) null, l0(fw.J(null, (ib4) objQ4, ou6VarW3, false, 15), 7.0f), j3, dd4Var2, 48, 0);
            dd4Var2.q(true);
            if (cp2Var != null) {
                f2 = 10.0f;
                ky0.z(dd4Var2, -284768587, ou6Var3, 10.0f, dd4Var2);
                w(cp2Var, ib4Var3, null, dd4Var2, 8 | ((i7 >> 12) & 14) | ((i10 >> 3) & Token.ASSIGN_MOD));
                dd4Var2.q(false);
            } else {
                f2 = 10.0f;
                dd4Var2.f0(-284587919);
                dd4Var2.q(false);
            }
            ou6 ou6VarE = p0(tg9.f(ou6Var3, 1.0f), 0.0f, f2, 0.0f, 0.0f, 13).e(z2 ? new bp5(1.0f, true) : ou6Var3);
            eq8 eq8VarA2 = dq8.a(ivVar, bv4.y, dd4Var2, 48);
            int iHashCode4 = Long.hashCode(dd4Var2.T);
            lr7 lr7VarL4 = dd4Var2.l();
            ou6 ou6VarL04 = s32.L0(dd4Var2, ou6VarE);
            dd4Var2.j0();
            if (dd4Var2.S) {
                ib4Var6 = ib4Var7;
                dd4Var2.k(ib4Var6);
            } else {
                ib4Var6 = ib4Var7;
                dd4Var2.s0();
            }
            un9.s(jmVar, dd4Var2, eq8VarA2);
            un9.s(jmVar2, dd4Var2, lr7VarL4);
            ky0.v(iHashCode4, dd4Var2, jmVar3, dd4Var2, kdVar);
            un9.s(jmVar4, dd4Var2, ou6VarL04);
            if (1.0f <= 0.0d) {
                o75.a("invalid weight; must be greater than zero");
            }
            ou6 ou6VarM02 = m0(ky0.h(dd4Var2, 4.0f, t96.w(new bp5(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true).e(z2 ? tg9.c(ou6Var3, 1.0f) : ou6Var3), tp8.a(20.0f)), lp4Var), 16.0f, 12.0f);
            xf0 xf0Var = bv4.b;
            ha6 ha6VarD = pn0.d(xf0Var, false);
            int iHashCode5 = Long.hashCode(dd4Var2.T);
            lr7 lr7VarL5 = dd4Var2.l();
            ou6 ou6VarL05 = s32.L0(dd4Var2, ou6VarM02);
            dd4Var2.j0();
            if (dd4Var2.S) {
                dd4Var2.k(ib4Var6);
            } else {
                dd4Var2.s0();
            }
            un9.s(jmVar, dd4Var2, ha6VarD);
            un9.s(jmVar2, dd4Var2, lr7VarL5);
            ky0.v(iHashCode5, dd4Var2, jmVar3, dd4Var2, kdVar);
            un9.s(jmVar4, dd4Var2, ou6VarL05);
            ou6 ou6VarE2 = jv3.B(tg9.f(zn0.a.a(ou6Var3, xf0Var), 1.0f), z44Var).e(z2 ? tg9.c : tg9.i(ou6Var3, 80.0f, 180.0f));
            rj7 rj7Var = new rj7(0.0f, 0.0f, 0.0f, 0.0f);
            uka ukaVarA = uka.a(s00.q(dd4Var2).j, s00.o(dd4Var2).q, 0L, (a84) null, (c64) null, 0L, 0L, (iy5) null, 16777214);
            rt8 rt8Var = fo8.x;
            qu1.l(fo8Var, ou6VarE2, false, ukaVarA, null, null, 0, 0, 0, null, null, null, rj7Var, dd4Var2, 8);
            if (fo8Var.e().b.length() == 0) {
                dd4Var2.f0(-197740506);
                nha.c(str5, (ou6) null, lc1.c(0.7f, s00.o(dd4Var2).s), (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, (vaa) null, 0L, 0, false, 0, 0, (kb4) null, s00.q(dd4Var2).j, dd4Var2, 0, 0, 131066);
                dd4Var2.q(false);
            } else {
                dd4Var2.f0(-197497776);
                dd4Var2.q(false);
            }
            un9.a(dd4Var2, xv5.g(dd4Var2, true, true, ou6Var3, 10.0f));
            ou6 ou6VarF2 = tg9.f(ou6Var3, 1.0f);
            boolean zF3 = dd4Var2.f(uk9Var);
            Object objQ5 = dd4Var2.Q();
            if (zF3 || objQ5 == obj) {
                objQ5 = new nga(6, z44Var, uk9Var);
                dd4Var2.p0(objQ5);
            }
            int i11 = i7 >> 6;
            int i12 = i10 << 9;
            O(x31Var, mn8Var, list, ou6VarF2, z4, z3, kb4Var, kb4Var2, (ib4) objQ5, kb4Var3, ib4Var4, ib4Var5, dd4Var2, (i11 & Token.ASSIGN_MOD) | (i11 & 14) | 3072 | ((i7 >> 9) & 896) | (458752 & (i7 >> 12)) | (3670016 & i12) | (i12 & 29360128) | ((i10 << 12) & 1879048192), (i10 >> 18) & Token.ELSE);
            dd4Var2.q(true);
            ou6Var2 = ou6Var3;
        } else {
            dd4Var2.Y();
            ou6Var2 = ou6Var;
        }
        ye8 ye8VarU = dd4Var2.u();
        if (ye8VarU != null) {
            ye8VarU.d = new yb4(str, str2, x31Var, mn8Var, cp2Var, list, ou6Var2, str3, z2, z3, ib4Var, ib4Var2, ib4Var3, kb4Var, kb4Var2, kb4Var3, ib4Var4, ib4Var5, i2) { // from class: i0b
                public final /* synthetic */ kb4 A;
                public final /* synthetic */ kb4 B;
                public final /* synthetic */ ib4 C;
                public final /* synthetic */ ib4 D;
                public final /* synthetic */ String a;
                public final /* synthetic */ String b;
                public final /* synthetic */ x31 c;
                public final /* synthetic */ mn8 d;
                public final /* synthetic */ cp2 e;
                public final /* synthetic */ List f;
                public final /* synthetic */ ou6 s;
                public final /* synthetic */ String t;
                public final /* synthetic */ boolean u;
                public final /* synthetic */ boolean v;
                public final /* synthetic */ ib4 w;
                public final /* synthetic */ ib4 x;
                public final /* synthetic */ ib4 y;
                public final /* synthetic */ kb4 z;

                @Override // defpackage.yb4
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int iX0 = qu1.x0(32769);
                    gjb.N(this.a, this.b, this.c, this.d, this.e, this.f, this.s, this.t, this.u, this.v, this.w, this.x, this.y, this.z, this.A, this.B, this.C, this.D, (dd4) obj2, iX0);
                    return heb.a;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:183:0x0427  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0478  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void O(defpackage.x31 r42, defpackage.mn8 r43, final java.util.List r44, final ou6 r45, final boolean r46, final boolean r47, final defpackage.kb4 r48, final defpackage.kb4 r49, final defpackage.ib4 r50, final defpackage.kb4 r51, final defpackage.ib4 r52, final defpackage.ib4 r53, dd4 r54, final int r55, final int r56) {
        /*
            Method dump skipped, instruction units count: 2918
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gjb.O(x31, mn8, java.util.List, ou6, boolean, boolean, kb4, kb4, ib4, kb4, ib4, ib4, dd4, int, int):void");
    }

    public static final void P(int i2, int i3, kb4 kb4Var, dd4 dd4Var, ou6 ou6Var) {
        ou6 ou6Var2;
        dd4Var.h0(187451454);
        int i4 = (dd4Var.d(i2) ? 4 : 2) | i3 | (dd4Var.h(kb4Var) ? 256 : Token.CASE);
        if (dd4Var.V(i4 & 1, (i4 & Token.EXPR_VOID) != 146)) {
            ou6Var2 = ou6Var;
            ou6 ou6VarL0 = l0(ou6Var2, 12.0f);
            ie1 ie1VarA = ge1.a(pv.c, bv4.z, dd4Var, 0);
            int iHashCode = Long.hashCode(dd4Var.T);
            lr7 lr7VarL = dd4Var.l();
            ou6 ou6VarL02 = s32.L0(dd4Var, ou6VarL0);
            ml1.k.getClass();
            um1 um1Var = ll1.b;
            dd4Var.j0();
            if (dd4Var.S) {
                dd4Var.k(um1Var);
            } else {
                dd4Var.s0();
            }
            un9.s(ll1.f, dd4Var, ie1VarA);
            un9.s(ll1.e, dd4Var, lr7VarL);
            un9.s(ll1.g, dd4Var, Integer.valueOf(iHashCode));
            un9.r(dd4Var, ll1.h);
            un9.s(ll1.d, dd4Var, ou6VarL02);
            e(wn9.K((pv9) ev9.Q.getValue(), dd4Var), gc1.Z(wn9.K((pv9) vt9.H.getValue(), dd4Var), wn9.K((pv9) mu9.v.getValue(), dd4Var), wn9.K((pv9) mu9.s.getValue(), dd4Var)), i2, false, null, kb4Var, dd4Var, ((i4 << 6) & 896) | ((i4 << 9) & 458752));
            xv5.A(lu6.a, 12.0f, dd4Var, true);
        } else {
            ou6Var2 = ou6Var;
            dd4Var.Y();
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new jy0(i2, ou6Var2, kb4Var, i3, 3);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v11 */
    /* JADX WARN: Type inference failed for: r15v6 */
    /* JADX WARN: Type inference failed for: r15v7, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r24v0 */
    public static final void Q(final float f2, final float f3, final float f4, final float f5, final ou6 ou6Var, final kb4 kb4Var, final ib4 ib4Var, dd4 dd4Var, final int i2) {
        float f6;
        int i3;
        float f7;
        int i4;
        int i5;
        fu6 fu6Var;
        n58 n58Var;
        ?? r15;
        n58 n58Var2;
        int i6;
        String str;
        dd4 dd4Var2 = dd4Var;
        dd4Var2.h0(-1811668835);
        if ((i2 & 6) == 0) {
            f6 = f2;
            i3 = (dd4Var2.c(f6) ? 4 : 2) | i2;
        } else {
            f6 = f2;
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= dd4Var2.c(f3) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= dd4Var2.c(f4) ? 256 : Token.CASE;
        }
        if ((i2 & 3072) == 0) {
            f7 = f5;
            i3 |= dd4Var2.c(f7) ? 2048 : 1024;
        } else {
            f7 = f5;
        }
        if ((i2 & 24576) == 0) {
            i3 |= dd4Var2.f(ou6Var) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= dd4Var2.h(kb4Var) ? 131072 : Parser.ARGC_LIMIT;
        }
        if ((1572864 & i2) == 0) {
            i3 |= dd4Var2.h(ib4Var) ? 1048576 : 524288;
        }
        if (dd4Var2.V(i3 & 1, (i3 & 599187) != 599186)) {
            int i7 = i3 >> 12;
            eq8 eq8VarA = dq8.a(pv.a, bv4.x, dd4Var2, 48);
            int iHashCode = Long.hashCode(dd4Var2.T);
            lr7 lr7VarL = dd4Var2.l();
            ou6 ou6VarL0 = s32.L0(dd4Var2, ou6Var);
            ml1.k.getClass();
            um1 um1Var = ll1.b;
            dd4Var2.j0();
            if (dd4Var2.S) {
                dd4Var2.k(um1Var);
            } else {
                dd4Var2.s0();
            }
            un9.s(ll1.f, dd4Var2, eq8VarA);
            un9.s(ll1.e, dd4Var2, lr7VarL);
            un9.s(ll1.g, dd4Var2, Integer.valueOf(iHashCode));
            un9.r(dd4Var2, ll1.h);
            un9.s(ll1.d, dd4Var2, ou6VarL0);
            bp5 bp5Var = new bp5(1.0f, true);
            vh9 vh9Var = vh9.a;
            n58 n58Var3 = s96.a;
            int i8 = i3 & 14;
            yb0.u(f6, kb4Var, bp5Var, false, ib4Var, vh9.d(0L, 0L, lc1.c(0.2f, ((q96) dd4Var2.j(n58Var3)).a.a), dd4Var, 1015), null, 0, null, null, new bb1(f3, f4), dd4Var, (i7 & Token.ASSIGN_MOD) | i8 | (57344 & (i3 >> 6)), 0, 968);
            dd4Var2 = dd4Var;
            lu6 lu6Var = lu6.a;
            un9.a(dd4Var2, tg9.r(lu6Var, 8.0f));
            ou6 ou6VarN = tg9.n(lu6Var, 24.0f);
            rp8 rp8Var = tp8.a;
            ou6 ou6VarW = t96.w(ou6VarN, rp8Var);
            int i9 = i3 & 458752;
            boolean z2 = (i9 == 131072) | (i8 == 4);
            int i10 = i3 & 7168;
            int i11 = i3 & 3670016;
            boolean z3 = z2 | (i10 == 2048) | ((i3 & Token.ASSIGN_MOD) == 32) | (i11 == 1048576);
            Object objQ = dd4Var2.Q();
            fu6 fu6Var2 = vl1.a;
            if (z3 || objQ == fu6Var2) {
                i4 = i8;
                i5 = i3;
                fu6Var = fu6Var2;
                n58Var = n58Var3;
                r15 = 0;
                kq6 kq6Var = new kq6(kb4Var, f2, f7, f3, ib4Var, 0);
                dd4Var2.p0(kq6Var);
                objQ = kq6Var;
            } else {
                i4 = i8;
                i5 = i3;
                fu6Var = fu6Var2;
                n58Var = n58Var3;
                r15 = 0;
            }
            n58 n58Var4 = n58Var;
            fu6 fu6Var3 = fu6Var;
            mx4.a(i25.c((m53) f53.c0.getValue(), dd4Var2, r15), (String) null, fw.J(null, (ib4) objQ, ou6VarW, r15, 15), ((q96) dd4Var2.j(n58Var)).a.q, dd4Var2, 48, 0);
            un9.a(dd4Var2, tg9.r(lu6Var, 8.0f));
            ou6 ou6VarW2 = t96.w(tg9.n(lu6Var, 24.0f), rp8Var);
            boolean z4 = (i9 == 131072) | (i4 == 4) | (i10 == 2048) | ((i5 & 896) == 256) | (i11 == 1048576);
            Object objQ2 = dd4Var2.Q();
            if (z4 || objQ2 == fu6Var3) {
                n58Var2 = n58Var4;
                i6 = 15;
                str = null;
                kq6 kq6Var2 = new kq6(kb4Var, f2, f5, f4, ib4Var, 1);
                dd4Var2.p0(kq6Var2);
                objQ2 = kq6Var2;
            } else {
                n58Var2 = n58Var4;
                i6 = 15;
                str = null;
            }
            mx4.a(i25.c((m53) a53.a.getValue(), dd4Var2, 0), (String) null, fw.J(str, (ib4) objQ2, ou6VarW2, false, i6), ((q96) dd4Var2.j(n58Var2)).a.q, dd4Var2, 48, 0);
            dd4Var2.q(true);
        } else {
            dd4Var2.Y();
        }
        ye8 ye8VarU = dd4Var2.u();
        if (ye8VarU != null) {
            ye8VarU.d = new yb4() { // from class: mq6
                @Override // defpackage.yb4
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    gjb.Q(f2, f3, f4, f5, ou6Var, kb4Var, ib4Var, (dd4) obj, qu1.x0(i2 | 1));
                    return heb.a;
                }
            };
        }
    }

    public static final void R(vvb vvbVar, boolean z2, long j2, ib4 ib4Var, ib4 ib4Var2, dd4 dd4Var, int i2) {
        int i3;
        String strK;
        long j3;
        dd4Var.h0(325810910);
        if ((i2 & 6) == 0) {
            i3 = ((i2 & 8) == 0 ? dd4Var.f(vvbVar) : dd4Var.h(vvbVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= dd4Var.g(z2) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= dd4Var.e(j2) ? 256 : Token.CASE;
        }
        if ((i2 & 3072) == 0) {
            i3 |= dd4Var.h(ib4Var) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= dd4Var.h(ib4Var2) ? 16384 : 8192;
        }
        if (dd4Var.V(i3 & 1, (i3 & 9363) != 9362)) {
            if (vvbVar != null) {
                dd4Var.f0(-393029921);
                strK = wn9.K((pv9) vu9.V.getValue(), dd4Var);
                dd4Var.q(false);
            } else {
                dd4Var.f0(-392955242);
                strK = wn9.K((pv9) vu9.M.getValue(), dd4Var);
                dd4Var.q(false);
            }
            if (vvbVar != null) {
                dd4Var.f0(-392836853);
                j3 = ((q96) dd4Var.j(s96.a)).a.a;
                dd4Var.q(false);
            } else {
                dd4Var.f0(-392774419);
                j3 = ((q96) dd4Var.j(s96.a)).a.w;
                dd4Var.q(false);
            }
            int i4 = ((i3 << 6) & 7168) | 12582918;
            int i5 = i3 << 9;
            D("WebDAV", strK, j3, z2, vvbVar != null, j2, ib4Var, jf0.G(-1450782306, new qz0(28, ib4Var2, vvbVar), dd4Var), dd4Var, i4 | (458752 & i5) | (i5 & 3670016));
        } else {
            dd4Var.Y();
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new g5a(vvbVar, z2, j2, ib4Var, ib4Var2, i2);
        }
    }

    public static final boolean S(uka ukaVar) {
        iu7 iu7Var;
        yu7 yu7Var = ukaVar.c;
        vb3 vb3Var = (yu7Var == null || (iu7Var = yu7Var.b) == null) ? null : new vb3(iu7Var.b);
        boolean z2 = false;
        if (vb3Var != null && vb3Var.a == 1) {
            z2 = true;
        }
        return !z2;
    }

    public static Intent T(Intent intent, o5b o5bVar, int i2) {
        Intent intent2 = new Intent(o5bVar.a, (Class<?>) InvisibleActionTrampolineActivity.class);
        intent2.setData(a0(o5bVar, i2, 2, ""));
        intent2.putExtra("ACTION_TYPE", "BROADCAST");
        intent2.putExtra("ACTION_INTENT", intent);
        return intent2;
    }

    public static boolean U(double d2, double d3, double d4) {
        return ((d3 - d2) + 25.132741228718345d) % 6.283185307179586d < ((d4 - d2) + 25.132741228718345d) % 6.283185307179586d;
    }

    public static final float V(pj7 pj7Var, zm5 zm5Var) {
        return zm5Var == zm5.a ? pj7Var.c(zm5Var) : pj7Var.b(zm5Var);
    }

    public static final float W(pj7 pj7Var, zm5 zm5Var) {
        return zm5Var == zm5.a ? pj7Var.b(zm5Var) : pj7Var.c(zm5Var);
    }

    public static void X(int i2) {
        if (2 > i2 || i2 >= 37) {
            j31.i(xv5.u(i2, "radix ", " was not in valid range "), new ha5(2, 36, 1));
        }
    }

    public static double Y(double d2) {
        double dPow = Math.pow(Math.abs(d2), 0.42d);
        return ((((double) (d2 < 0.0d ? -1 : d2 == 0.0d ? 0 : 1)) * 400.0d) * dPow) / (dPow + 27.13d);
    }

    public static Object Z(int i2) {
        if (i2 >= 2 && i2 <= 1073741824 && Integer.highestOneBit(i2) == i2) {
            return i2 <= 256 ? new byte[i2] : i2 <= 65536 ? new short[i2] : new int[i2];
        }
        gp.l(dx1.f(i2, "must be power of 2 between 2^1 and 2^30: "));
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0055  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(defpackage.sgb r30, long r31, boolean r33, ou6 r34, java.lang.String r35, dd4 r36, int r37) {
        /*
            Method dump skipped, instruction units count: 781
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gjb.a(sgb, long, boolean, ou6, java.lang.String, dd4, int):void");
    }

    public static final Uri a0(o5b o5bVar, int i2, int i3, String str) {
        String str2;
        Uri.Builder builder = new Uri.Builder();
        builder.scheme("glance-action");
        if (i3 == 1) {
            str2 = "ACTIVITY";
        } else if (i3 == 2) {
            str2 = "BROADCAST";
        } else if (i3 == 3) {
            str2 = "SERVICE";
        } else if (i3 == 4) {
            str2 = "FOREGROUND_SERVICE";
        } else {
            if (i3 != 5) {
                throw null;
            }
            str2 = "CALLBACK";
        }
        builder.path(str2);
        builder.appendQueryParameter("appWidgetId", String.valueOf(o5bVar.b));
        builder.appendQueryParameter("viewId", String.valueOf(i2));
        builder.appendQueryParameter("viewSize", a23.c(o5bVar.j));
        builder.appendQueryParameter("extraData", str);
        if (o5bVar.f) {
            builder.appendQueryParameter("lazyCollection", String.valueOf(o5bVar.k));
            builder.appendQueryParameter("lazeViewItem", String.valueOf(-1));
        }
        return builder.build();
    }

    public static final void b(rj1 rj1Var, dd4 dd4Var, int i2) {
        dd4Var.h0(1590339738);
        int i3 = 0;
        int i4 = 1;
        if (dd4Var.V(i2 & 1, (i2 & 3) != 2)) {
            Object objQ = dd4Var.Q();
            if (objQ == vl1.a) {
                objQ = new nm5();
                dd4Var.p0(objQ);
            }
            jv3.e(sb0.a.a((nm5) objQ), jf0.G(1050880986, new tb0(rj1Var, i3), dd4Var), dd4Var, 56);
        } else {
            dd4Var.Y();
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new tb0(i2, i4, rj1Var);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b0(android.content.Context r9, b15 r10, a25 r11, defpackage.kt1 r12) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 609
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gjb.b0(android.content.Context, b15, a25, kt1):java.lang.Object");
    }

    public static final void c(final long j2, final long j3, final ib4 ib4Var, dd4 dd4Var, final int i2) {
        long j4;
        long j5;
        dd4Var.h0(736940493);
        int i3 = (dd4Var.e(j2) ? 4 : 2) | i2 | (dd4Var.e(j3) ? 32 : 16);
        if (dd4Var.V(i3 & 1, (i3 & Token.EXPR_VOID) != 146)) {
            ou6 ou6VarN = tg9.n(lu6.a, 32.0f);
            rp8 rp8Var = tp8.a;
            ou6 ou6VarW = t96.w(ou6VarN, rp8Var);
            Object objQ = dd4Var.Q();
            if (objQ == vl1.a) {
                objQ = new hpa(14, ib4Var);
                dd4Var.p0(objQ);
            }
            ou6 ou6VarL0 = l0(fw.J(null, (ib4) objQ, ou6VarW, false, 15), 6.0f);
            if (j2 == 16) {
                dd4Var.f0(-1678223798);
                j4 = ((q96) dd4Var.j(s96.a)).a.q;
                dd4Var.q(false);
            } else {
                dd4Var.f0(-1678144252);
                dd4Var.q(false);
                j4 = j2;
            }
            ou6 ou6VarG = fw.G(ou6VarL0, 2.0f, j4, rp8Var);
            if (j3 == 16) {
                dd4Var.f0(-1677958996);
                j5 = ((q96) dd4Var.j(s96.a)).a.p;
                dd4Var.q(false);
            } else {
                dd4Var.f0(-1677881186);
                dd4Var.q(false);
                j5 = j3;
            }
            pn0.a(fe.L(ou6VarG, j5, rp8Var), dd4Var, 0);
        } else {
            dd4Var.Y();
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new yb4(j2, j3, ib4Var, i2) { // from class: m0b
                public final /* synthetic */ long a;
                public final /* synthetic */ long b;
                public final /* synthetic */ ib4 c;

                @Override // defpackage.yb4
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iX0 = qu1.x0(385);
                    gjb.c(this.a, this.b, this.c, (dd4) obj, iX0);
                    return heb.a;
                }
            };
        }
    }

    public static final boolean c0(char c2, char c3, boolean z2) {
        if (c2 == c3) {
            return true;
        }
        if (!z2) {
            return false;
        }
        char upperCase = Character.toUpperCase(c2);
        char upperCase2 = Character.toUpperCase(c3);
        return upperCase == upperCase2 || Character.toLowerCase(upperCase) == Character.toLowerCase(upperCase2);
    }

    public static final void d(final float f2, final boolean z2, final boolean z3, final ou6 ou6Var, final kb4 kb4Var, final kb4 kb4Var2, final kb4 kb4Var3, dd4 dd4Var, final int i2) {
        dd4 dd4Var2 = dd4Var;
        dd4Var2.h0(-216519884);
        int i3 = i2 | (dd4Var2.c(f2) ? 4 : 2) | (dd4Var2.g(z2) ? 32 : 16) | (dd4Var2.g(z3) ? 256 : Token.CASE) | (dd4Var2.f(ou6Var) ? 2048 : 1024) | (dd4Var2.h(kb4Var) ? 16384 : 8192) | (dd4Var2.h(kb4Var2) ? 131072 : Parser.ARGC_LIMIT) | (dd4Var2.h(kb4Var3) ? 1048576 : 524288);
        if (dd4Var2.V(i3 & 1, (599187 & i3) != 599186)) {
            eq8 eq8VarA = dq8.a(pv.a, bv4.x, dd4Var2, 48);
            int iHashCode = Long.hashCode(dd4Var2.T);
            lr7 lr7VarL = dd4Var2.l();
            ou6 ou6VarL0 = s32.L0(dd4Var2, ou6Var);
            ml1.k.getClass();
            um1 um1Var = ll1.b;
            dd4Var2.j0();
            if (dd4Var2.S) {
                dd4Var2.k(um1Var);
            } else {
                dd4Var2.s0();
            }
            un9.s(ll1.f, dd4Var2, eq8VarA);
            un9.s(ll1.e, dd4Var2, lr7VarL);
            un9.s(ll1.g, dd4Var2, Integer.valueOf(iHashCode));
            un9.r(dd4Var2, ll1.h);
            un9.s(ll1.d, dd4Var2, ou6VarL0);
            p35 p35VarC = i25.c(z2 ? (m53) a53.p.getValue() : (m53) a53.o.getValue(), dd4Var2, 0);
            lu6 lu6Var = lu6.a;
            ou6 ou6VarN = tg9.n(lu6Var, 40.0f);
            rp8 rp8Var = tp8.a;
            ou6 ou6VarW = t96.w(ou6VarN, rp8Var);
            boolean z4 = (458752 & i3) == 131072;
            int i4 = i3 & Token.ASSIGN_MOD;
            boolean z5 = z4 | (i4 == 32);
            Object objQ = dd4Var2.Q();
            Object obj = vl1.a;
            if (z5 || objQ == obj) {
                objQ = new ck0(11, kb4Var2, z2);
                dd4Var2.p0(objQ);
            }
            ou6 ou6VarJ = fw.J(null, (ib4) objQ, ou6VarW, false, 15);
            ur9 ur9Var = s96.a;
            long jC = lc1.c(z2 ? 0.6f : 0.2f, ((q96) dd4Var2.j(ur9Var)).a.a);
            lp4 lp4Var = jf0.G;
            mx4.a(p35VarC, (String) null, l0(fe.L(ou6VarJ, jC, lp4Var), 8.0f), ((q96) dd4Var2.j(ur9Var)).a.q, dd4Var2, 48, 0);
            xi xiVar = (xi) dd4Var2.j(gv8.a);
            boolean z6 = (i3 & 14) == 4;
            Object objQ2 = dd4Var2.Q();
            if (z6 || objQ2 == obj) {
                objQ2 = dk9.x(Float.valueOf(f2));
                dd4Var2.p0(objQ2);
            }
            a07 a07Var = (a07) objQ2;
            float fFloatValue = ((Number) a07Var.getValue()).floatValue();
            bb1 bb1Var = new bb1(0.1f, 1.0f);
            long j2 = ((q96) dd4Var2.j(ur9Var)).a.a;
            ou6 ou6VarF = xv5.f(1.0f, n0(lu6Var, 12.0f, 0.0f, 2), true);
            rj1 rj1VarG = jf0.G(-1173686342, new kq2(a07Var, 12), dd4Var2);
            boolean zF = (i4 == 32) | ((i3 & 57344) == 16384) | dd4Var2.f(a07Var);
            Object objQ3 = dd4Var2.Q();
            if (zF || objQ3 == obj) {
                objQ3 = new zi6(z2, kb4Var, a07Var, 2);
                dd4Var2.p0(objQ3);
            }
            ib4 ib4Var = (ib4) objQ3;
            boolean zF2 = (i4 == 32) | dd4Var2.f(a07Var) | dd4Var2.h(xiVar);
            Object objQ4 = dd4Var2.Q();
            if (zF2 || objQ4 == obj) {
                objQ4 = new gb0(z2, xiVar, a07Var, 1);
                dd4Var2.p0(objQ4);
            }
            yb0.g(fFloatValue, bb1Var, false, rj1VarG, 0.0f, 0.0f, j2, ou6VarF, ib4Var, (kb4) objQ4, dd4Var, 3072);
            dd4Var2 = dd4Var;
            p35 p35VarC2 = i25.c(z3 ? (m53) h53.s.getValue() : (m53) h53.r.getValue(), dd4Var2, 0);
            ou6 ou6VarW2 = t96.w(tg9.n(lu6Var, 40.0f), rp8Var);
            boolean z7 = ((i3 & 896) == 256) | ((3670016 & i3) == 1048576);
            Object objQ5 = dd4Var2.Q();
            if (z7 || objQ5 == obj) {
                objQ5 = new ck0(12, kb4Var3, z3);
                dd4Var2.p0(objQ5);
            }
            mx4.a(p35VarC2, (String) null, l0(fe.L(fw.J(null, (ib4) objQ5, ou6VarW2, false, 15), lc1.c(0.2f, ((q96) dd4Var2.j(ur9Var)).a.a), lp4Var), 8.0f), ((q96) dd4Var2.j(ur9Var)).a.q, dd4Var2, 48, 0);
            dd4Var2.q(true);
        } else {
            dd4Var2.Y();
        }
        ye8 ye8VarU = dd4Var2.u();
        if (ye8VarU != null) {
            ye8VarU.d = new yb4(f2, z2, z3, ou6Var, kb4Var, kb4Var2, kb4Var3, i2) { // from class: xp6
                public final /* synthetic */ float a;
                public final /* synthetic */ boolean b;
                public final /* synthetic */ boolean c;
                public final /* synthetic */ ou6 d;
                public final /* synthetic */ kb4 e;
                public final /* synthetic */ kb4 f;
                public final /* synthetic */ kb4 s;

                @Override // defpackage.yb4
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int iX0 = qu1.x0(1);
                    gjb.d(this.a, this.b, this.c, this.d, this.e, this.f, this.s, (dd4) obj2, iX0);
                    return heb.a;
                }
            };
        }
    }

    public static final a91 d0(m39 m39Var) {
        m39Var.getClass();
        if (m39Var instanceof is1) {
            return ((is1) m39Var).b;
        }
        if (m39Var instanceof n39) {
            return d0(((n39) m39Var).a);
        }
        return null;
    }

    public static final void e(String str, List list, int i2, boolean z2, ou6 ou6Var, kb4 kb4Var, dd4 dd4Var, int i3) {
        int i4;
        boolean z3;
        ou6 ou6Var2;
        a07 a07Var;
        dd4 dd4Var2 = dd4Var;
        dd4Var2.h0(-1036335162);
        if ((i3 & 6) == 0) {
            i4 = (dd4Var2.f(str) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= dd4Var2.h(list) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i4 |= dd4Var2.d(i2) ? 256 : Token.CASE;
        }
        int i5 = i4 | 27648;
        if ((196608 & i3) == 0) {
            i5 |= dd4Var2.h(kb4Var) ? 131072 : Parser.ARGC_LIMIT;
        }
        if (dd4Var2.V(i5 & 1, (74899 & i5) != 74898)) {
            Object objQ = dd4Var2.Q();
            fu6 fu6Var = vl1.a;
            if (objQ == fu6Var) {
                objQ = dk9.x(Boolean.FALSE);
                dd4Var2.p0(objQ);
            }
            a07 a07Var2 = (a07) objQ;
            ou6 ou6Var3 = lu6.a;
            ou6 ou6VarI = yb0.I(ou6Var3, 1.0f);
            Object objQ2 = dd4Var2.Q();
            if (objQ2 == fu6Var) {
                objQ2 = new bq6(a07Var2, 1);
                dd4Var2.p0(objQ2);
            }
            ou6 ou6VarE = yn2.V(1, (ib4) objQ2, dd4Var2, ou6VarI, false).e(ou6Var3);
            ha6 ha6VarD = pn0.d(bv4.b, false);
            int i6 = i5;
            int iHashCode = Long.hashCode(dd4Var2.T);
            lr7 lr7VarL = dd4Var2.l();
            ou6 ou6VarL0 = s32.L0(dd4Var2, ou6VarE);
            ml1.k.getClass();
            um1 um1Var = ll1.b;
            dd4Var2.j0();
            if (dd4Var2.S) {
                dd4Var2.k(um1Var);
            } else {
                dd4Var2.s0();
            }
            jm jmVar = ll1.f;
            un9.s(jmVar, dd4Var2, ha6VarD);
            jm jmVar2 = ll1.e;
            un9.s(jmVar2, dd4Var2, lr7VarL);
            Integer numValueOf = Integer.valueOf(iHashCode);
            jm jmVar3 = ll1.g;
            un9.s(jmVar3, dd4Var2, numValueOf);
            kd kdVar = ll1.h;
            un9.r(dd4Var2, kdVar);
            jm jmVar4 = ll1.d;
            un9.s(jmVar4, dd4Var2, ou6VarL0);
            eq8 eq8VarA = dq8.a(pv.a, bv4.x, dd4Var2, 48);
            int iHashCode2 = Long.hashCode(dd4Var2.T);
            lr7 lr7VarL2 = dd4Var2.l();
            ou6 ou6VarL02 = s32.L0(dd4Var2, ou6Var3);
            dd4Var2.j0();
            if (dd4Var2.S) {
                dd4Var2.k(um1Var);
            } else {
                dd4Var2.s0();
            }
            un9.s(jmVar, dd4Var2, eq8VarA);
            un9.s(jmVar2, dd4Var2, lr7VarL2);
            ky0.v(iHashCode2, dd4Var2, jmVar3, dd4Var2, kdVar);
            un9.s(jmVar4, dd4Var2, ou6VarL02);
            ur9 ur9Var = s96.a;
            nha.c(str, new bp5(1.0f, true), 0L, (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, new vaa(5), 0L, 2, false, 1, 0, (kb4) null, ((q96) dd4Var2.j(ur9Var)).b.j, dd4Var, i6 & 14, 24960, 109564);
            un9.a(dd4Var, tg9.r(ou6Var3, 8.0f));
            nha.c((String) list.get(i2), (ou6) null, 0L, (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, (vaa) null, 0L, 0, false, 0, 0, (kb4) null, ((q96) dd4Var.j(ur9Var)).b.k, dd4Var, 0, 0, 131070);
            mx4.a(i25.c((m53) f53.t.getValue(), dd4Var, 0), (String) null, tg9.n(ou6Var3, 24.0f), 0L, dd4Var, 432, 8);
            dd4Var.q(true);
            boolean zBooleanValue = ((Boolean) a07Var2.getValue()).booleanValue();
            Object objQ3 = dd4Var.Q();
            if (objQ3 == fu6Var) {
                a07Var = a07Var2;
                objQ3 = new bq6(a07Var, 2);
                dd4Var.p0(objQ3);
            } else {
                a07Var = a07Var2;
            }
            rj1 rj1VarG = jf0.G(115016844, new hq6(list, i2, kb4Var, a07Var, 0), dd4Var);
            dd4Var2 = dd4Var;
            gx1.a(zBooleanValue, null, 0L, ou6Var3, 0.0f, null, (ib4) objQ3, rj1VarG, dd4Var2, 14158848, 54);
            dd4Var2.q(true);
            z3 = true;
            ou6Var2 = ou6Var3;
        } else {
            dd4Var2.Y();
            z3 = z2;
            ou6Var2 = ou6Var;
        }
        ye8 ye8VarU = dd4Var2.u();
        if (ye8VarU != null) {
            ye8VarU.d = new w71(str, list, i2, z3, ou6Var2, kb4Var, i3);
        }
    }

    public static double e0(double[] dArr) {
        double d2 = dArr[0];
        double[][] dArr2 = y;
        double[] dArr3 = dArr2[0];
        double d3 = dArr3[0] * d2;
        double d4 = dArr[1];
        double d5 = (dArr3[1] * d4) + d3;
        double d6 = dArr[2];
        double d7 = (dArr3[2] * d6) + d5;
        double[] dArr4 = dArr2[1];
        double d8 = (dArr4[2] * d6) + (dArr4[1] * d4) + (dArr4[0] * d2);
        double[] dArr5 = dArr2[2];
        double d9 = (d6 * dArr5[2]) + (d4 * dArr5[1]) + (d2 * dArr5[0]);
        double dY = Y(d7);
        double dY2 = Y(d8);
        double dY3 = Y(d9);
        return Math.atan2(tw2.a(dY3, 2.0d, dY + dY2, 9.0d), ((((-12.0d) * dY2) + (dY * 11.0d)) + dY3) / 11.0d);
    }

    public static final void f(String str, t27 t27Var, dd4 dd4Var, int i2) {
        str.getClass();
        t27Var.getClass();
        dd4Var.h0(-918582581);
        int i3 = 4;
        int i4 = (dd4Var.f(str) ? 4 : 2) | i2 | (dd4Var.f(t27Var) ? 32 : 16);
        int i5 = 0;
        final boolean z2 = true;
        if (dd4Var.V(i4 & 1, (i4 & 19) != 18)) {
            k0c k0cVar = (k0c) dd4Var.j(xzb.a);
            boolean z3 = (i4 & 14) == 4;
            Object objQ = dd4Var.Q();
            Object obj = vl1.a;
            if (z3 || objQ == obj) {
                objQ = new wj0(str, 23);
                dd4Var.p0(objQ);
            }
            ib4 ib4Var = (ib4) objQ;
            pj4 pj4VarA = e36.a(dd4Var);
            if (pj4VarA == null) {
                gp.j("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
            final en3 en3Var = (en3) ((qtb) qx1.N(ug8.a(en3.class), pj4VarA.f(), null, pj4VarA instanceof pj4 ? pj4VarA.d() : v02.b, ek5.a(dd4Var), ib4Var));
            final a07 a07VarB = bx1.B(en3Var.e, dd4Var);
            if (k0cVar != k0c.a && k0cVar != k0c.b) {
                z2 = false;
            }
            Object[] objArr = new Object[0];
            Object objQ2 = dd4Var.Q();
            if (objQ2 == obj) {
                objQ2 = new tl3(i3);
                dd4Var.p0(objQ2);
            }
            final a07 a07Var = (a07) ww1.b0(objArr, (ib4) objQ2, dd4Var, 48);
            gx1.p(((dn3) a07VarB.getValue()).a, tg9.c, true, jf0.G(768980431, new q41(t27Var, 22), dd4Var), jf0.G(635770950, new zm3(z2, a07Var, i5), dd4Var), jf0.G(-1510679359, new ac4() { // from class: an3
                @Override // defpackage.ac4
                public final Object g(Object obj2, Object obj3, Object obj4, Object obj5) {
                    pj7 pj7Var = (pj7) obj3;
                    dd4 dd4Var2 = (dd4) obj4;
                    int iIntValue = ((Integer) obj5).intValue();
                    ((yn0) obj2).getClass();
                    pj7Var.getClass();
                    if ((iIntValue & 48) == 0) {
                        iIntValue |= dd4Var2.f(pj7Var) ? 32 : 16;
                    }
                    if (dd4Var2.V(iIntValue & 1, (iIntValue & Token.TARGET) != 144)) {
                        Object objQ3 = dd4Var2.Q();
                        Object obj6 = vl1.a;
                        if (objQ3 == obj6) {
                            objQ3 = new hb1(0);
                            dd4Var2.p0(objQ3);
                        }
                        hb1 hb1Var = (hb1) objQ3;
                        a07 a07Var2 = a07VarB;
                        String str2 = ((dn3) a07Var2.getValue()).a;
                        boolean zF = dd4Var2.f(a07Var2) | dd4Var2.f(hb1Var);
                        Object objQ4 = dd4Var2.Q();
                        if (zF || objQ4 == obj6) {
                            objQ4 = new pg(hb1Var, a07Var2, null, 10);
                            dd4Var2.p0(objQ4);
                        }
                        lc5.u((yb4) objQ4, dd4Var2, str2);
                        eq8 eq8VarA = dq8.a(pv.a, bv4.w, dd4Var2, 0);
                        int iHashCode = Long.hashCode(dd4Var2.T);
                        lr7 lr7VarL = dd4Var2.l();
                        ou6 ou6VarL0 = s32.L0(dd4Var2, lu6.a);
                        ml1.k.getClass();
                        um1 um1Var = ll1.b;
                        dd4Var2.j0();
                        if (dd4Var2.S) {
                            dd4Var2.k(um1Var);
                        } else {
                            dd4Var2.s0();
                        }
                        un9.s(ll1.f, dd4Var2, eq8VarA);
                        un9.s(ll1.e, dd4Var2, lr7VarL);
                        un9.s(ll1.g, dd4Var2, Integer.valueOf(iHashCode));
                        un9.r(dd4Var2, ll1.h);
                        un9.s(ll1.d, dd4Var2, ou6VarL0);
                        Object objQ5 = dd4Var2.Q();
                        if (objQ5 == obj6) {
                            objQ5 = new w83(y83.b, 510);
                            dd4Var2.p0(objQ5);
                        }
                        px3 px3Var = tg9.c;
                        md2.g(hb1Var, (w83) objQ5, gjb.k0(px3Var, pj7Var), dd4Var2, 0);
                        boolean z4 = z2;
                        en3 en3Var2 = en3Var;
                        if (z4) {
                            dd4Var2.f0(923798021);
                            dd4Var2.q(false);
                        } else {
                            dd4Var2.f0(923441490);
                            String str3 = ((dn3) a07Var2.getValue()).a;
                            List list = ((dn3) a07Var2.getValue()).b;
                            boolean zF2 = dd4Var2.f(en3Var2);
                            Object objQ6 = dd4Var2.Q();
                            if (zF2 || objQ6 == obj6) {
                                objQ6 = new rx2(en3Var2, 8);
                                dd4Var2.p0(objQ6);
                            }
                            gjb.A(str3, list, px3Var, (kb4) objQ6, dd4Var2, 384);
                            dd4Var2.q(false);
                        }
                        dd4Var2.q(true);
                        if (z4) {
                            dd4Var2.f0(-1980323894);
                            a07 a07Var3 = a07Var;
                            boolean zBooleanValue = ((Boolean) a07Var3.getValue()).booleanValue();
                            boolean zF3 = dd4Var2.f(a07Var3);
                            Object objQ7 = dd4Var2.Q();
                            if (zF3 || objQ7 == obj6) {
                                objQ7 = new wf3(a07Var3, 12);
                                dd4Var2.p0(objQ7);
                            }
                            fw.r(zBooleanValue, (kb4) objQ7, null, true, 0L, 0L, 0.0f, 0L, 360.0f, jf0.G(-662452811, new mt(1, (Object) en3Var2, (Object) a07Var3, (Object) a07Var2, false), dd4Var2), dd4Var2, 905972736, 244);
                            dd4Var2.q(false);
                        } else {
                            dd4Var2.f0(-1979707583);
                            dd4Var2.q(false);
                        }
                    } else {
                        dd4Var2.Y();
                    }
                    return heb.a;
                }
            }, dd4Var), dd4Var, 224688, 0);
        } else {
            dd4Var.Y();
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new yj0(str, t27Var, i2, 7);
        }
    }

    public static double f0(double d2) {
        double dAbs = Math.abs(d2);
        return Math.pow(Math.max(0.0d, (27.13d * dAbs) / (400.0d - dAbs)), 2.380952380952381d) * ((double) (d2 < 0.0d ? -1 : d2 == 0.0d ? 0 : 1));
    }

    public static final void g(float f2, String str, ou6 ou6Var, kb4 kb4Var, ib4 ib4Var, dd4 dd4Var, int i2) {
        String str2;
        boolean z2;
        Object obj;
        float f3 = f2;
        dd4 dd4Var2 = dd4Var;
        dd4Var2.h0(-672716385);
        int i3 = i2 | (dd4Var2.c(f3) ? 4 : 2) | (dd4Var2.f(str) ? 32 : 16) | (dd4Var2.f(ou6Var) ? 256 : Token.CASE) | (dd4Var2.h(kb4Var) ? 2048 : 1024) | (dd4Var2.h(ib4Var) ? 16384 : 8192);
        if (dd4Var2.V(i3 & 1, (i3 & 9363) != 9362)) {
            wf0 wf0Var = bv4.x;
            iv ivVar = pv.a;
            eq8 eq8VarA = dq8.a(ivVar, wf0Var, dd4Var2, 48);
            int iHashCode = Long.hashCode(dd4Var2.T);
            lr7 lr7VarL = dd4Var2.l();
            ou6 ou6VarL0 = s32.L0(dd4Var2, ou6Var);
            ml1.k.getClass();
            um1 um1Var = ll1.b;
            dd4Var2.j0();
            if (dd4Var2.S) {
                dd4Var2.k(um1Var);
            } else {
                dd4Var2.s0();
            }
            jm jmVar = ll1.f;
            un9.s(jmVar, dd4Var2, eq8VarA);
            jm jmVar2 = ll1.e;
            un9.s(jmVar2, dd4Var2, lr7VarL);
            Integer numValueOf = Integer.valueOf(iHashCode);
            jm jmVar3 = ll1.g;
            un9.s(jmVar3, dd4Var2, numValueOf);
            kd kdVar = ll1.h;
            un9.r(dd4Var2, kdVar);
            jm jmVar4 = ll1.d;
            un9.s(jmVar4, dd4Var2, ou6VarL0);
            p35 p35VarC = i25.c((m53) a53.l0.getValue(), dd4Var2, 0);
            long j2 = s00.o(dd4Var2).q;
            lu6 lu6Var = lu6.a;
            ou6 ou6VarN = tg9.n(lu6Var, 40.0f);
            rp8 rp8Var = tp8.a;
            ou6 ou6VarW = t96.w(ou6VarN, rp8Var);
            long jC = lc1.c(0.2f, s00.o(dd4Var2).a);
            lp4 lp4Var = jf0.G;
            mx4.a(p35VarC, (String) null, l0(fe.L(ou6VarW, jC, lp4Var), 8.0f), j2, dd4Var2, 48, 0);
            ou6 ou6VarN0 = n0(lu6Var, 12.0f, 0.0f, 2);
            eq8 eq8VarA2 = dq8.a(ivVar, wf0Var, dd4Var2, 48);
            int iHashCode2 = Long.hashCode(dd4Var2.T);
            lr7 lr7VarL2 = dd4Var2.l();
            ou6 ou6VarL02 = s32.L0(dd4Var2, ou6VarN0);
            dd4Var2.j0();
            if (dd4Var2.S) {
                dd4Var2.k(um1Var);
            } else {
                dd4Var2.s0();
            }
            un9.s(jmVar, dd4Var2, eq8VarA2);
            un9.s(jmVar2, dd4Var2, lr7VarL2);
            ky0.v(iHashCode2, dd4Var2, jmVar3, dd4Var2, kdVar);
            un9.s(jmVar4, dd4Var2, ou6VarL02);
            p35 p35VarC2 = i25.c((m53) h53.i.getValue(), dd4Var2, 0);
            long j3 = s00.o(dd4Var2).q;
            ou6 ou6VarW2 = t96.w(tg9.o(lu6Var, 48.0f, 36.0f), rp8Var);
            int i4 = i3 & 14;
            int i5 = i3 & 7168;
            boolean z3 = (i4 == 4) | (i5 == 2048);
            Object objQ = dd4Var2.Q();
            Object obj2 = vl1.a;
            if (z3 || objQ == obj2) {
                z2 = false;
                obj = obj2;
                objQ = new yp6(f2, kb4Var, 0);
                dd4Var2.p0(objQ);
            } else {
                z2 = false;
                obj = obj2;
            }
            Object obj3 = obj;
            mx4.a(p35VarC2, (String) null, l0(fe.L(fw.G(fw.J(null, (ib4) objQ, ou6VarW2, z2, 15), 1.0f, lc1.c(0.3f, s00.o(dd4Var2).a), rp8Var), lc1.c(0.1f, s00.o(dd4Var2).a), lp4Var), 8.0f), j3, dd4Var2, 48, 0);
            boolean z4 = i4 == 4;
            Object objQ2 = dd4Var2.Q();
            if (z4 || objQ2 == obj3) {
                objQ2 = tn9.i("%.1f", new Object[]{Float.valueOf(16.0f * f2)});
                dd4Var2.p0(objQ2);
            }
            f3 = f2;
            nha.c((String) objQ2, tg9.s(lu6Var, 60.0f, 80.0f), s00.o(dd4Var2).q, (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, new vaa(3), 0L, 0, false, 0, 0, (kb4) null, s00.q(dd4Var2).j, dd4Var, 48, 0, 130040);
            p35 p35VarC3 = i25.c((m53) h53.j.getValue(), dd4Var, 0);
            long j4 = s00.o(dd4Var).q;
            ou6 ou6VarW3 = t96.w(tg9.o(lu6Var, 44.0f, 36.0f), rp8Var);
            boolean z5 = (i5 == 2048) | (i4 == 4);
            Object objQ3 = dd4Var.Q();
            if (z5 || objQ3 == obj3) {
                objQ3 = new yp6(f3, kb4Var, 1);
                dd4Var.p0(objQ3);
            }
            mx4.a(p35VarC3, (String) null, l0(fe.L(fw.G(fw.J(null, (ib4) objQ3, ou6VarW3, false, 15), 1.0f, lc1.c(0.3f, s00.o(dd4Var).a), rp8Var), lc1.c(0.1f, s00.o(dd4Var).a), lp4Var), 8.0f), j4, dd4Var, 48, 0);
            ky0.A(dd4Var, true, lu6Var, 6.0f, dd4Var);
            if (1.0f <= 0.0d) {
                o75.a("invalid weight; must be greater than zero");
            }
            ou6 ou6VarW4 = t96.w(tg9.h(new bp5(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), 36.0f), rp8Var);
            boolean z6 = (i3 & 57344) == 16384;
            Object objQ4 = dd4Var.Q();
            if (z6 || objQ4 == obj3) {
                objQ4 = new pm6(23, ib4Var);
                dd4Var.p0(objQ4);
            }
            ou6 ou6VarN02 = n0(fe.L(fw.G(fw.J(null, (ib4) objQ4, ou6VarW4, false, 15), 1.0f, lc1.c(0.3f, s00.o(dd4Var).a), rp8Var), lc1.c(0.1f, s00.o(dd4Var).a), lp4Var), 8.0f, 0.0f, 2);
            eq8 eq8VarA3 = dq8.a(ivVar, wf0Var, dd4Var, 48);
            int iHashCode3 = Long.hashCode(dd4Var.T);
            lr7 lr7VarL3 = dd4Var.l();
            ou6 ou6VarL03 = s32.L0(dd4Var, ou6VarN02);
            dd4Var.j0();
            if (dd4Var.S) {
                dd4Var.k(um1Var);
            } else {
                dd4Var.s0();
            }
            un9.s(jmVar, dd4Var, eq8VarA3);
            un9.s(jmVar2, dd4Var, lr7VarL3);
            ky0.v(iHashCode3, dd4Var, jmVar3, dd4Var, kdVar);
            un9.s(jmVar4, dd4Var, ou6VarL03);
            boolean z7 = (i3 & Token.ASSIGN_MOD) == 32;
            Object objQ5 = dd4Var.Q();
            if (z7 || objQ5 == obj3) {
                str2 = str;
                objQ5 = bw9.y0(bw9.u0(str2, "/", str2), ".");
                dd4Var.p0(objQ5);
            } else {
                str2 = str;
            }
            String strK = (String) objQ5;
            dd4Var.f0(-1222659567);
            if (strK.length() == 0) {
                strK = wn9.K((pv9) zu9.C.getValue(), dd4Var);
            }
            String str3 = strK;
            dd4Var.q(false);
            long jX = wn9.x(18);
            c64 c64VarR0 = qu1.r0(str2, dd4Var, (i3 >> 3) & 14);
            long j5 = s00.o(dd4Var).q;
            float f4 = Float.MAX_VALUE;
            if (1.0f <= 0.0d) {
                o75.a("invalid weight; must be greater than zero");
            }
            if (1.0f <= Float.MAX_VALUE) {
                f4 = 1.0f;
            }
            nha.c(str3, kf0.v(new bp5(f4, true)), j5, (g60) null, jX, (t74) null, (a84) null, c64VarR0, 0L, (jda) null, new vaa(3), 0L, 0, false, 0, 0, (kb4) null, (uka) null, dd4Var, 24576, 0, 260968);
            dd4Var2 = dd4Var;
            mx4.a(i25.c((m53) f53.t.getValue(), dd4Var2, 0), (String) null, tg9.n(lu6Var, 24.0f), s00.o(dd4Var2).q, dd4Var2, 432, 0);
            dd4Var2.q(true);
            dd4Var2.q(true);
        } else {
            str2 = str;
            dd4Var2.Y();
        }
        ye8 ye8VarU = dd4Var2.u();
        if (ye8VarU != null) {
            ye8VarU.d = new lp6(f3, str2, ou6Var, kb4Var, ib4Var, i2);
        }
    }

    public static boolean g0(double d2) {
        return 0.0d <= d2 && d2 <= 100.0d;
    }

    public static final void h(boolean z2, long j2, ib4 ib4Var, ib4 ib4Var2, dd4 dd4Var, int i2) {
        int i3;
        dd4Var.h0(-110769508);
        if ((i2 & 6) == 0) {
            i3 = ((i2 & 8) == 0 ? dd4Var.f((Object) null) : dd4Var.h((Object) null) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= dd4Var.g(z2) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= dd4Var.e(j2) ? 256 : Token.CASE;
        }
        if ((i2 & 3072) == 0) {
            i3 |= dd4Var.h(ib4Var) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= dd4Var.h(ib4Var2) ? 16384 : 8192;
        }
        if (dd4Var.V(i3 & 1, (i3 & 9363) != 9362)) {
            dd4Var.f0(-1399203719);
            String strK = wn9.K((pv9) vu9.W.getValue(), dd4Var);
            dd4Var.q(false);
            dd4Var.f0(-1399023857);
            long j3 = ((q96) dd4Var.j(s96.a)).a.w;
            dd4Var.q(false);
            int i4 = ((i3 << 6) & 7168) | 12582918;
            int i5 = i3 << 9;
            D("Google Drive", strK, j3, z2, false, j2, ib4Var, jf0.G(1767092572, new oa3(7, ib4Var2), dd4Var), dd4Var, i4 | (458752 & i5) | (i5 & 3670016));
        } else {
            dd4Var.Y();
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new us6(z2, j2, ib4Var, ib4Var2, i2);
        }
    }

    public static boolean h0(char c2) {
        return Character.isWhitespace(c2) || Character.isSpaceChar(c2);
    }

    public static final void i(ou6 ou6Var, ib4 ib4Var, rj1 rj1Var, dd4 dd4Var, int i2) {
        int i3;
        dd4 dd4Var2 = dd4Var;
        dd4Var2.h0(1463316167);
        if ((i2 & 6) == 0) {
            i3 = (dd4Var2.f(ou6Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= dd4Var2.h(ib4Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= dd4Var2.h(rj1Var) ? 256 : Token.CASE;
        }
        if (dd4Var2.V(i3 & 1, (i3 & Token.EXPR_VOID) != 146)) {
            int i4 = i3 >> 3;
            a07 a07VarA = dk9.A(ib4Var, dd4Var2);
            ou6 ou6VarL0 = l0(ou6Var, 12.0f);
            ie1 ie1VarA = ge1.a(pv.c, bv4.z, dd4Var2, 0);
            int iHashCode = Long.hashCode(dd4Var2.T);
            lr7 lr7VarL = dd4Var2.l();
            ou6 ou6VarL02 = s32.L0(dd4Var2, ou6VarL0);
            ml1.k.getClass();
            um1 um1Var = ll1.b;
            dd4Var2.j0();
            if (dd4Var2.S) {
                dd4Var2.k(um1Var);
            } else {
                dd4Var2.s0();
            }
            jm jmVar = ll1.f;
            un9.s(jmVar, dd4Var2, ie1VarA);
            jm jmVar2 = ll1.e;
            un9.s(jmVar2, dd4Var2, lr7VarL);
            Integer numValueOf = Integer.valueOf(iHashCode);
            jm jmVar3 = ll1.g;
            un9.s(jmVar3, dd4Var2, numValueOf);
            kd kdVar = ll1.h;
            un9.r(dd4Var2, kdVar);
            jm jmVar4 = ll1.d;
            un9.s(jmVar4, dd4Var2, ou6VarL02);
            Object objValueOf = Integer.valueOf((i4 & Token.ASSIGN_MOD) | 6);
            ke1 ke1Var = ke1.a;
            rj1Var.c(ke1Var, dd4Var2, objValueOf);
            vf0 vf0Var = bv4.B;
            lu6 lu6Var = lu6.a;
            ou6 ou6VarA = ke1Var.a(lu6Var, vf0Var);
            boolean zF = dd4Var2.f(a07VarA);
            Object objQ = dd4Var2.Q();
            if (zF || objQ == vl1.a) {
                objQ = new bq6(a07VarA, 3);
                dd4Var2.p0(objQ);
            }
            ou6 ou6VarJ = fw.J(null, (ib4) objQ, ou6VarA, false, 15);
            eq8 eq8VarA = dq8.a(pv.b, bv4.x, dd4Var2, 54);
            int iHashCode2 = Long.hashCode(dd4Var2.T);
            lr7 lr7VarL2 = dd4Var2.l();
            ou6 ou6VarL03 = s32.L0(dd4Var2, ou6VarJ);
            dd4Var2.j0();
            if (dd4Var2.S) {
                dd4Var2.k(um1Var);
            } else {
                dd4Var2.s0();
            }
            un9.s(jmVar, dd4Var2, eq8VarA);
            un9.s(jmVar2, dd4Var2, lr7VarL2);
            ky0.v(iHashCode2, dd4Var2, jmVar3, dd4Var2, kdVar);
            un9.s(jmVar4, dd4Var2, ou6VarL03);
            String strK = wn9.K((pv9) mu9.R.getValue(), dd4Var2);
            ur9 ur9Var = s96.a;
            nha.c(strK, (ou6) null, ((q96) dd4Var2.j(ur9Var)).a.q, (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, (vaa) null, 0L, 0, false, 0, 0, (kb4) null, ((q96) dd4Var2.j(ur9Var)).b.k, dd4Var, 0, 0, 131066);
            dd4Var2 = dd4Var;
            un9.a(dd4Var2, tg9.r(lu6Var, 8.0f));
            mx4.a(i25.c((m53) f53.a0.getValue(), dd4Var2, 0), (String) null, tg9.n(lu6Var, 18.0f), ((q96) dd4Var2.j(ur9Var)).a.q, dd4Var2, 432, 0);
            dd4Var2.q(true);
            dd4Var2.q(true);
        } else {
            dd4Var2.Y();
        }
        ye8 ye8VarU = dd4Var2.u();
        if (ye8VarU != null) {
            ye8VarU.d = new yi(ou6Var, ib4Var, rj1Var, i2, 15);
        }
    }

    public static final void i0(Activity activity, Intent intent) {
        StrictMode.VmPolicy vmPolicyBuild;
        Parcelable parcelableExtra = intent.getParcelableExtra("ACTION_INTENT");
        if (parcelableExtra == null) {
            gp.l("List adapter activity trampoline invoked without specifying target intent.");
            return;
        }
        Intent intent2 = (Intent) parcelableExtra;
        if (intent.hasExtra("android.widget.extra.CHECKED")) {
            intent2.putExtra("android.widget.extra.CHECKED", intent.getBooleanExtra("android.widget.extra.CHECKED", false));
        }
        String stringExtra = intent.getStringExtra("ACTION_TYPE");
        if (stringExtra == null) {
            gp.l("List adapter activity trampoline invoked without trampoline type");
            return;
        }
        a5 a5Var = new a5(stringExtra, activity, intent2, intent.getBundleExtra("ACTIVITY_OPTIONS"), 0);
        StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
        if (Build.VERSION.SDK_INT >= 31) {
            vmPolicyBuild = rt9.a.a(new StrictMode.VmPolicy.Builder(vmPolicy)).build();
        } else {
            vmPolicyBuild = new StrictMode.VmPolicy.Builder().build();
        }
        StrictMode.setVmPolicy(vmPolicyBuild);
        a5Var.invoke();
        StrictMode.setVmPolicy(vmPolicy);
        activity.finish();
    }

    public static final void j(boolean z2, vvb vvbVar, boolean z3, kb4 kb4Var, kb4 kb4Var2, kb4 kb4Var3, dd4 dd4Var, int i2) {
        a07 a07Var;
        Boolean bool;
        int i3;
        int i4;
        vvb vvbVar2;
        z44 z44Var;
        dd4Var.h0(-571155916);
        int i5 = i2 | (dd4Var.g(z2) ? 4 : 2) | (dd4Var.f(vvbVar) ? 32 : 16) | (dd4Var.g(z3) ? 256 : Token.CASE) | (dd4Var.h(kb4Var) ? 2048 : 1024) | (dd4Var.h(kb4Var2) ? 16384 : 8192) | (dd4Var.h(kb4Var3) ? 131072 : Parser.ARGC_LIMIT);
        if (dd4Var.V(i5 & 1, (74899 & i5) != 74898)) {
            Object[] objArr = new Object[0];
            Object objQ = dd4Var.Q();
            fu6 fu6Var = vl1.a;
            if (objQ == fu6Var) {
                objQ = new dv9(27);
                dd4Var.p0(objQ);
            }
            a07 a07Var2 = (a07) ww1.b0(objArr, (ib4) objQ, dd4Var, 48);
            Object[] objArr2 = new Object[0];
            Object objQ2 = dd4Var.Q();
            if (objQ2 == fu6Var) {
                objQ2 = new dv9(28);
                dd4Var.p0(objQ2);
            }
            a07 a07Var3 = (a07) ww1.b0(objArr2, (ib4) objQ2, dd4Var, 48);
            Object[] objArr3 = new Object[0];
            Object objQ3 = dd4Var.Q();
            if (objQ3 == fu6Var) {
                objQ3 = new dv9(29);
                dd4Var.p0(objQ3);
            }
            a07 a07Var4 = (a07) ww1.b0(objArr3, (ib4) objQ3, dd4Var, 48);
            Object[] objArr4 = new Object[0];
            Object objQ4 = dd4Var.Q();
            if (objQ4 == fu6Var) {
                objQ4 = new i5a(3);
                dd4Var.p0(objQ4);
            }
            a07 a07Var5 = (a07) ww1.b0(objArr4, (ib4) objQ4, dd4Var, 48);
            Object objQ5 = dd4Var.Q();
            if (objQ5 == fu6Var) {
                objQ5 = ky0.f(dd4Var);
            }
            z44 z44Var2 = (z44) objQ5;
            boolean z4 = (bw9.a0((String) a07Var2.getValue()) || bw9.a0((String) a07Var3.getValue()) || bw9.a0((String) a07Var4.getValue())) ? false : true;
            Boolean boolValueOf = Boolean.valueOf(z2);
            int i6 = i5 & 14;
            boolean zF = (i6 == 4) | dd4Var.f(a07Var2) | ((i5 & Token.ASSIGN_MOD) == 32) | dd4Var.f(a07Var3) | dd4Var.f(a07Var4) | dd4Var.f(a07Var5);
            Object objQ6 = dd4Var.Q();
            if (zF || objQ6 == fu6Var) {
                a07Var = a07Var4;
                bool = boolValueOf;
                i3 = i6;
                i4 = 27;
                k5a k5aVar = new k5a(z2, vvbVar, z44Var2, a07Var2, a07Var3, a07Var, a07Var5, null);
                vvbVar2 = vvbVar;
                z44Var = z44Var2;
                dd4Var.p0(k5aVar);
                objQ6 = k5aVar;
            } else {
                vvbVar2 = vvbVar;
                a07Var = a07Var4;
                z44Var = z44Var2;
                bool = boolValueOf;
                i3 = i6;
                i4 = 27;
            }
            lc5.v(bool, vvbVar2, (yb4) objQ6, dd4Var);
            z8.d(z2, kb4Var, jf0.G(-94063992, new j41(z4, z3, kb4Var3, a07Var2, a07Var3, a07Var, a07Var5, kb4Var2, kb4Var), dd4Var), null, yib.E(lu6.a, 14), jf0.G(-1268658485, new gs6(kb4Var, i4, (byte) 0), dd4Var), lc5.F, null, 0L, 0L, 0.0f, false, false, jf0.G(-967949088, new uj0(z44Var, a07Var2, a07Var3, a07Var, a07Var5, 22), dd4Var), dd4Var, i3 | 1769856 | ((i5 >> 6) & Token.ASSIGN_MOD), 8072);
        } else {
            dd4Var.Y();
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new sp0(z2, vvbVar, z3, kb4Var, kb4Var2, kb4Var3, i2);
        }
    }

    public static int j0(int i2, int i3, int i4) {
        return (i2 & (~i4)) | (i3 & i4);
    }

    public static final void k(boolean z2, yba ybaVar, kb4 kb4Var, kb4 kb4Var2, kb4 kb4Var3, kb4 kb4Var4, kb4 kb4Var5, kb4 kb4Var6, kb4 kb4Var7, ib4 ib4Var, ib4 ib4Var2, kb4 kb4Var8, kb4 kb4Var9, kb4 kb4Var10, kb4 kb4Var11, kb4 kb4Var12, ac4 ac4Var, kb4 kb4Var13, dd4 dd4Var, int i2) {
        int i3;
        yba ybaVar2;
        kb4 kb4Var14;
        kb4 kb4Var15;
        kb4 kb4Var16;
        dd4 dd4Var2 = dd4Var;
        ybaVar.getClass();
        kb4Var.getClass();
        kb4Var2.getClass();
        kb4Var3.getClass();
        kb4Var4.getClass();
        kb4Var5.getClass();
        kb4Var6.getClass();
        kb4Var7.getClass();
        ib4Var.getClass();
        ib4Var2.getClass();
        kb4Var8.getClass();
        kb4Var9.getClass();
        kb4Var10.getClass();
        kb4Var11.getClass();
        kb4Var12.getClass();
        ac4Var.getClass();
        kb4Var13.getClass();
        dd4Var2.h0(627359452);
        if ((i2 & 6) == 0) {
            i3 = (dd4Var2.g(z2) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            ybaVar2 = ybaVar;
            i3 |= dd4Var2.f(ybaVar2) ? 32 : 16;
        } else {
            ybaVar2 = ybaVar;
        }
        if ((i2 & 384) == 0) {
            kb4Var14 = kb4Var;
            i3 |= dd4Var2.h(kb4Var14) ? 256 : Token.CASE;
        } else {
            kb4Var14 = kb4Var;
        }
        if ((i2 & 3072) == 0) {
            kb4Var15 = kb4Var2;
            i3 |= dd4Var2.h(kb4Var15) ? 2048 : 1024;
        } else {
            kb4Var15 = kb4Var2;
        }
        if ((i2 & 24576) == 0) {
            kb4Var16 = kb4Var3;
            i3 |= dd4Var2.h(kb4Var16) ? 16384 : 8192;
        } else {
            kb4Var16 = kb4Var3;
        }
        if ((i2 & 196608) == 0) {
            i3 |= dd4Var2.h(kb4Var4) ? 131072 : 65536;
        }
        if ((i2 & 1572864) == 0) {
            i3 |= dd4Var2.h(kb4Var5) ? 1048576 : 524288;
        }
        if ((i2 & 12582912) == 0) {
            i3 |= dd4Var2.h(kb4Var6) ? 8388608 : 4194304;
        }
        if ((i2 & 100663296) == 0) {
            i3 |= dd4Var2.h(kb4Var7) ? 67108864 : 33554432;
        }
        if ((i2 & 805306368) == 0) {
            i3 |= dd4Var2.h(ib4Var) ? 536870912 : 268435456;
        }
        if (!dd4Var2.V(i3 & 1, ((i3 & 306783379) == 306783378 && (((((((((dd4Var2.h(ib4Var2) ? (char) 4 : (char) 2) | (dd4Var2.h(kb4Var8) ? ' ' : (char) 16)) | (dd4Var2.h(kb4Var9) ? 256 : Token.CASE)) | (dd4Var2.h(kb4Var10) ? 2048 : 1024)) | (dd4Var2.h(kb4Var11) ? (char) 16384 : (char) 8192)) | (dd4Var2.h(kb4Var12) ? (char) 0 : (char) 0)) | (dd4Var2.h(ac4Var) ? (char) 0 : (char) 0)) | (dd4Var2.h(kb4Var13) ? (char) 0 : (char) 0)) & 4793491) == 4793490) ? false : true)) {
            dd4Var2.Y();
        } else if (xzb.a(dd4Var2)) {
            dd4Var2.f0(-2031425613);
            l(z2, ybaVar2, kb4Var14, kb4Var15, kb4Var16, kb4Var4, kb4Var5, kb4Var6, kb4Var7, ib4Var, ib4Var2, kb4Var8, kb4Var9, kb4Var10, kb4Var11, kb4Var12, ac4Var, kb4Var13, dd4Var2, i3 & 2147483646);
            dd4Var2 = dd4Var2;
            dd4Var2.q(false);
        } else {
            dd4Var2.f0(-2030448648);
            m(z2, ybaVar, kb4Var, kb4Var2, kb4Var3, kb4Var4, kb4Var5, kb4Var6, kb4Var7, ib4Var, ib4Var2, kb4Var8, kb4Var9, kb4Var10, kb4Var11, kb4Var12, ac4Var, kb4Var13, dd4Var2, i3 & 2147483646);
            dd4Var2 = dd4Var2;
            dd4Var2.q(false);
        }
        ye8 ye8VarU = dd4Var2.u();
        if (ye8VarU != null) {
            ye8VarU.d = new tp6(z2, ybaVar, kb4Var, kb4Var2, kb4Var3, kb4Var4, kb4Var5, kb4Var6, kb4Var7, ib4Var, ib4Var2, kb4Var8, kb4Var9, kb4Var10, kb4Var11, kb4Var12, ac4Var, kb4Var13, i2, 0);
        }
    }

    public static final ou6 k0(ou6 ou6Var, pj7 pj7Var) {
        return ou6Var.e(new qj7(pj7Var, new zs5(pj7Var, 25)));
    }

    public static final void l(final boolean z2, final yba ybaVar, kb4 kb4Var, kb4 kb4Var2, kb4 kb4Var3, final kb4 kb4Var4, final kb4 kb4Var5, final kb4 kb4Var6, final kb4 kb4Var7, final ib4 ib4Var, final ib4 ib4Var2, final kb4 kb4Var8, final kb4 kb4Var9, final kb4 kb4Var10, final kb4 kb4Var11, final kb4 kb4Var12, final ac4 ac4Var, final kb4 kb4Var13, dd4 dd4Var, int i2) {
        int i3;
        kb4 kb4Var14;
        kb4 kb4Var15;
        kb4 kb4Var16;
        dd4Var.h0(2062921380);
        if ((i2 & 6) == 0) {
            i3 = (dd4Var.g(z2) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= dd4Var.f(ybaVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            kb4Var14 = kb4Var;
            i3 |= dd4Var.h(kb4Var14) ? 256 : Token.CASE;
        } else {
            kb4Var14 = kb4Var;
        }
        if ((i2 & 3072) == 0) {
            kb4Var15 = kb4Var2;
            i3 |= dd4Var.h(kb4Var15) ? 2048 : 1024;
        } else {
            kb4Var15 = kb4Var2;
        }
        if ((i2 & 24576) == 0) {
            kb4Var16 = kb4Var3;
            i3 |= dd4Var.h(kb4Var16) ? 16384 : 8192;
        } else {
            kb4Var16 = kb4Var3;
        }
        if ((i2 & 196608) == 0) {
            i3 |= dd4Var.h(kb4Var4) ? 131072 : 65536;
        }
        if ((i2 & 1572864) == 0) {
            i3 |= dd4Var.h(kb4Var5) ? 1048576 : 524288;
        }
        if ((i2 & 12582912) == 0) {
            i3 |= dd4Var.h(kb4Var6) ? 8388608 : 4194304;
        }
        if ((i2 & 100663296) == 0) {
            i3 |= dd4Var.h(kb4Var7) ? 67108864 : 33554432;
        }
        if ((i2 & 805306368) == 0) {
            i3 |= dd4Var.h(ib4Var) ? 536870912 : 268435456;
        }
        int i4 = i3;
        if (dd4Var.V(i4 & 1, ((i4 & 306783379) == 306783378 && (((((((((dd4Var.h(ib4Var2) ? (char) 4 : (char) 2) | (dd4Var.h(kb4Var8) ? ' ' : (char) 16)) | (dd4Var.h(kb4Var9) ? 256 : Token.CASE)) | (dd4Var.h(kb4Var10) ? 2048 : 1024)) | (dd4Var.h(kb4Var11) ? (char) 16384 : (char) 8192)) | (dd4Var.h(kb4Var12) ? (char) 0 : (char) 0)) | (dd4Var.h(ac4Var) ? (char) 0 : (char) 0)) | (dd4Var.h(kb4Var13) ? (char) 0 : (char) 0)) & 4793491) == 4793490) ? false : true)) {
            final kb4 kb4Var17 = kb4Var15;
            final kb4 kb4Var18 = kb4Var16;
            final kb4 kb4Var19 = kb4Var14;
            sdc.e(tg9.c, null, jf0.G(-1561721734, new zb4() { // from class: gq6
                @Override // defpackage.zb4
                public final Object c(Object obj, Object obj2, Object obj3) {
                    co0 co0Var = (co0) obj;
                    dd4 dd4Var2 = (dd4) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    co0Var.getClass();
                    if ((iIntValue & 6) == 0) {
                        iIntValue |= dd4Var2.f(co0Var) ? 4 : 2;
                    }
                    if (dd4Var2.V(iIntValue & 1, (iIntValue & 19) != 18)) {
                        ou6 ou6VarH = tg9.h(lu6.a, co0Var.c() * 0.6f);
                        long j2 = ((q96) dd4Var2.j(s96.a)).a.p;
                        Object objQ = dd4Var2.Q();
                        if (objQ == vl1.a) {
                            objQ = new zm6(18);
                            dd4Var2.p0(objQ);
                        }
                        kb4 kb4Var20 = (kb4) objQ;
                        final yba ybaVar2 = ybaVar;
                        final kb4 kb4Var21 = kb4Var17;
                        final kb4 kb4Var22 = kb4Var18;
                        final kb4 kb4Var23 = kb4Var4;
                        final kb4 kb4Var24 = kb4Var5;
                        final kb4 kb4Var25 = kb4Var6;
                        final kb4 kb4Var26 = kb4Var7;
                        final ib4 ib4Var3 = ib4Var;
                        final ib4 ib4Var4 = ib4Var2;
                        final kb4 kb4Var27 = kb4Var8;
                        final kb4 kb4Var28 = kb4Var9;
                        final kb4 kb4Var29 = kb4Var10;
                        final kb4 kb4Var30 = kb4Var11;
                        final kb4 kb4Var31 = kb4Var12;
                        final ac4 ac4Var2 = ac4Var;
                        final kb4 kb4Var32 = kb4Var13;
                        fw.q(z2, kb4Var19, ou6VarH, false, kb4Var20, null, j2, 0L, 0.0f, 0L, null, jf0.G(-1568607786, new zb4() { // from class: lq6
                            @Override // defpackage.zb4
                            public final Object c(Object obj4, Object obj5, Object obj6) {
                                dd4 dd4Var3 = (dd4) obj5;
                                int iIntValue2 = ((Integer) obj6).intValue();
                                ((ke1) obj4).getClass();
                                if (dd4Var3.V(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                    gjb.H(ybaVar2, yib.E(tg9.c, 14), kb4Var21, kb4Var22, kb4Var23, kb4Var24, kb4Var25, kb4Var26, ib4Var3, ib4Var4, kb4Var27, kb4Var28, kb4Var29, kb4Var30, kb4Var31, ac4Var2, kb4Var32, dd4Var3, 0);
                                } else {
                                    dd4Var3.Y();
                                }
                                return heb.a;
                            }
                        }, dd4Var2), dd4Var2, 27648, 48, 1952);
                    } else {
                        dd4Var2.Y();
                    }
                    return heb.a;
                }
            }, dd4Var), dd4Var, 3078, 6);
        } else {
            dd4Var.Y();
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new tp6(z2, ybaVar, kb4Var, kb4Var2, kb4Var3, kb4Var4, kb4Var5, kb4Var6, kb4Var7, ib4Var, ib4Var2, kb4Var8, kb4Var9, kb4Var10, kb4Var11, kb4Var12, ac4Var, kb4Var13, i2, 2);
        }
    }

    public static final ou6 l0(ou6 ou6Var, float f2) {
        return ou6Var.e(new lj7(f2, f2, f2, f2, new fa(3, f2)));
    }

    public static final void m(boolean z2, final yba ybaVar, kb4 kb4Var, kb4 kb4Var2, final kb4 kb4Var3, final kb4 kb4Var4, final kb4 kb4Var5, final kb4 kb4Var6, final kb4 kb4Var7, final ib4 ib4Var, final ib4 ib4Var2, final kb4 kb4Var8, final kb4 kb4Var9, final kb4 kb4Var10, final kb4 kb4Var11, final kb4 kb4Var12, final ac4 ac4Var, final kb4 kb4Var13, dd4 dd4Var, int i2) {
        int i3;
        kb4 kb4Var14;
        dd4Var.h0(1563383787);
        if ((i2 & 6) == 0) {
            i3 = (dd4Var.g(z2) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= dd4Var.f(ybaVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= dd4Var.h(kb4Var) ? 256 : Token.CASE;
        }
        if ((i2 & 3072) == 0) {
            kb4Var14 = kb4Var2;
            i3 |= dd4Var.h(kb4Var14) ? 2048 : 1024;
        } else {
            kb4Var14 = kb4Var2;
        }
        if ((i2 & 24576) == 0) {
            i3 |= dd4Var.h(kb4Var3) ? 16384 : 8192;
        }
        if ((i2 & 196608) == 0) {
            i3 |= dd4Var.h(kb4Var4) ? 131072 : 65536;
        }
        if ((i2 & 1572864) == 0) {
            i3 |= dd4Var.h(kb4Var5) ? 1048576 : 524288;
        }
        if ((i2 & 12582912) == 0) {
            i3 |= dd4Var.h(kb4Var6) ? 8388608 : 4194304;
        }
        if ((i2 & 100663296) == 0) {
            i3 |= dd4Var.h(kb4Var7) ? 67108864 : 33554432;
        }
        if ((i2 & 805306368) == 0) {
            i3 |= dd4Var.h(ib4Var) ? 536870912 : 268435456;
        }
        if (dd4Var.V(i3 & 1, ((i3 & 306783379) == 306783378 && (((((((((dd4Var.h(ib4Var2) ? (char) 4 : (char) 2) | (dd4Var.h(kb4Var8) ? ' ' : (char) 16)) | (dd4Var.h(kb4Var9) ? 256 : Token.CASE)) | (dd4Var.h(kb4Var10) ? 2048 : 1024)) | (dd4Var.h(kb4Var11) ? (char) 16384 : (char) 8192)) | (dd4Var.h(kb4Var12) ? (char) 0 : (char) 0)) | (dd4Var.h(ac4Var) ? (char) 0 : (char) 0)) | (dd4Var.h(kb4Var13) ? (char) 0 : (char) 0)) & 4793491) == 4793490) ? false : true)) {
            final kb4 kb4Var15 = kb4Var14;
            fw.r(z2, kb4Var, null, true, 0L, 0L, 0.0f, 0L, 0.0f, jf0.G(-1257851750, new yb4() { // from class: wp6
                @Override // defpackage.yb4
                public final Object invoke(Object obj, Object obj2) {
                    dd4 dd4Var2 = (dd4) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (dd4Var2.V(iIntValue & 1, (iIntValue & 3) != 2)) {
                        px3 px3Var = tg9.c;
                        ou6 ou6VarE = yib.E(gjb.n0(px3Var, 8.0f, 0.0f, 2), 13);
                        ie1 ie1VarA = ge1.a(pv.c, bv4.z, dd4Var2, 0);
                        int iHashCode = Long.hashCode(dd4Var2.T);
                        lr7 lr7VarL = dd4Var2.l();
                        ou6 ou6VarL0 = s32.L0(dd4Var2, ou6VarE);
                        ml1.k.getClass();
                        um1 um1Var = ll1.b;
                        dd4Var2.j0();
                        if (dd4Var2.S) {
                            dd4Var2.k(um1Var);
                        } else {
                            dd4Var2.s0();
                        }
                        un9.s(ll1.f, dd4Var2, ie1VarA);
                        un9.s(ll1.e, dd4Var2, lr7VarL);
                        un9.s(ll1.g, dd4Var2, Integer.valueOf(iHashCode));
                        un9.r(dd4Var2, ll1.h);
                        un9.s(ll1.d, dd4Var2, ou6VarL0);
                        nha.c(wn9.K((pv9) mu9.o0.getValue(), dd4Var2), gjb.l0(lu6.a, 12.0f), 0L, (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, (vaa) null, 0L, 0, false, 0, 0, (kb4) null, ((q96) dd4Var2.j(s96.a)).b.f, dd4Var2, 48, 0, 131068);
                        gjb.H(ybaVar, px3Var, kb4Var15, kb4Var3, kb4Var4, kb4Var5, kb4Var6, kb4Var7, ib4Var, ib4Var2, kb4Var8, kb4Var9, kb4Var10, kb4Var11, kb4Var12, ac4Var, kb4Var13, dd4Var2, 48);
                        dd4Var2.q(true);
                    } else {
                        dd4Var2.Y();
                    }
                    return heb.a;
                }
            }, dd4Var), dd4Var, (i3 & 14) | 805309440 | ((i3 >> 3) & Token.ASSIGN_MOD), 500);
        } else {
            dd4Var.Y();
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new tp6(z2, ybaVar, kb4Var, kb4Var2, kb4Var3, kb4Var4, kb4Var5, kb4Var6, kb4Var7, ib4Var, ib4Var2, kb4Var8, kb4Var9, kb4Var10, kb4Var11, kb4Var12, ac4Var, kb4Var13, i2, 1);
        }
    }

    public static final ou6 m0(ou6 ou6Var, float f2, float f3) {
        return ou6Var.e(new lj7(f2, f3, f2, f3, new ga(f2, f3, 1)));
    }

    public static final void n(ib4 ib4Var, dd4 dd4Var, int i2) {
        dd4Var.h0(-893388703);
        int i3 = (dd4Var.h(ib4Var) ? 4 : 2) | i2;
        int i4 = 1;
        if (dd4Var.V(i3 & 1, (i3 & 3) != 2)) {
            String strK = wn9.K((pv9) vu9.N.getValue(), dd4Var);
            long j2 = ((q96) dd4Var.j(s96.a)).a.w;
            Object objQ = dd4Var.Q();
            if (objQ == vl1.a) {
                objQ = new dh1(i4);
                dd4Var.p0(objQ);
            }
            D("OneDrive", strK, j2, false, false, 0L, (ib4) objQ, jf0.G(1444917025, new oa3(8, ib4Var), dd4Var), dd4Var, 14380038);
        } else {
            dd4Var.Y();
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new lo(ib4Var, i2, 6);
        }
    }

    public static ou6 n0(ou6 ou6Var, float f2, float f3, int i2) {
        if ((i2 & 1) != 0) {
            f2 = 0.0f;
        }
        if ((i2 & 2) != 0) {
            f3 = 0.0f;
        }
        return m0(ou6Var, f2, f3);
    }

    public static rj7 o(int i2, float f2) {
        if ((i2 & 1) != 0) {
            f2 = 0.0f;
        }
        float f3 = (i2 & 2) == 0 ? 20.0f : 0.0f;
        return new rj7(f2, f3, f2, f3);
    }

    public static final ou6 o0(ou6 ou6Var, final float f2, final float f3, final float f4, final float f5) {
        return ou6Var.e(new lj7(f2, f3, f4, f5, new kb4() { // from class: mj7
            @Override // defpackage.kb4
            public final Object invoke(Object obj) {
                e95 e95Var = (e95) obj;
                e95Var.getClass();
                jc1 jc1Var = e95Var.b;
                jc1Var.c(new x13(f2), "start");
                jc1Var.c(new x13(f3), "top");
                jc1Var.c(new x13(f4), "end");
                jc1Var.c(new x13(f5), "bottom");
                return heb.a;
            }
        }));
    }

    public static final rj7 p(float f2, float f3, float f4, float f5) {
        return new rj7(f2, f3, f4, f5);
    }

    public static ou6 p0(ou6 ou6Var, float f2, float f3, float f4, float f5, int i2) {
        if ((i2 & 1) != 0) {
            f2 = 0.0f;
        }
        if ((i2 & 2) != 0) {
            f3 = 0.0f;
        }
        if ((i2 & 4) != 0) {
            f4 = 0.0f;
        }
        if ((i2 & 8) != 0) {
            f5 = 0.0f;
        }
        return o0(ou6Var, f2, f3, f4, f5);
    }

    public static rj7 q(float f2, float f3, float f4, float f5, int i2) {
        if ((i2 & 1) != 0) {
            f2 = 0.0f;
        }
        if ((i2 & 2) != 0) {
            f3 = 0.0f;
        }
        if ((i2 & 4) != 0) {
            f4 = 0.0f;
        }
        if ((i2 & 8) != 0) {
            f5 = 0.0f;
        }
        return new rj7(f2, f3, f4, f5);
    }

    public static final void q0(jl9 jl9Var, kb4 kb4Var) {
        jl9Var.getClass();
        kb4Var.getClass();
        wq0 wq0VarB = jl9Var.b();
        if (wq0VarB.k()) {
            gp.l("Buffer is empty");
            return;
        }
        nz8 nz8Var = wq0VarB.a;
        nz8Var.getClass();
        byte[] bArr = nz8Var.a;
        int i2 = nz8Var.b;
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr, i2, nz8Var.c - i2);
        byteBufferWrap.getClass();
        kb4Var.invoke(byteBufferWrap);
        int iPosition = byteBufferWrap.position() - i2;
        if (iPosition != 0) {
            if (iPosition < 0) {
                gp.j("Returned negative read bytes count");
            } else if (iPosition <= nz8Var.b()) {
                wq0VarB.skip(iPosition);
            } else {
                gp.j("Returned too many bytes");
            }
        }
    }

    public static final void r(int i2, final int i3, final int i4, final int i5, ou6 ou6Var, ac4 ac4Var, dd4 dd4Var, int i6) {
        ou6 ou6Var2;
        dd4Var.h0(586218747);
        int i7 = i6 | (dd4Var.d(i2) ? 4 : 2) | (dd4Var.d(i3) ? 32 : 16) | (dd4Var.d(i4) ? 256 : Token.CASE) | (dd4Var.d(i5) ? 2048 : 1024) | (dd4Var.h(ac4Var) ? 131072 : Parser.ARGC_LIMIT);
        if (dd4Var.V(i7 & 1, (74899 & i7) != 74898)) {
            final a07 a07VarA = dk9.A(ac4Var, dd4Var);
            final a07 a07VarA2 = dk9.A(Integer.valueOf(i2), dd4Var);
            final a07 a07VarA3 = dk9.A(Integer.valueOf(i3), dd4Var);
            final a07 a07VarA4 = dk9.A(Integer.valueOf(i4), dd4Var);
            final a07 a07VarA5 = dk9.A(Integer.valueOf(i5), dd4Var);
            boolean zF = dd4Var.f(a07VarA);
            Object objQ = dd4Var.Q();
            if (zF || objQ == vl1.a) {
                objQ = new bq6(a07VarA, 0);
                dd4Var.p0(objQ);
            }
            ou6Var2 = ou6Var;
            i(ou6Var2, (ib4) objQ, jf0.G(504099337, new zb4() { // from class: cq6
                /* JADX WARN: Removed duplicated region for block: B:25:0x0158  */
                /* JADX WARN: Removed duplicated region for block: B:31:0x01c2  */
                @Override // defpackage.zb4
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object c(java.lang.Object r29, java.lang.Object r30, java.lang.Object r31) {
                    /*
                        Method dump skipped, instruction units count: 489
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: defpackage.cq6.c(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
                }
            }, dd4Var), dd4Var, 390);
        } else {
            ou6Var2 = ou6Var;
            dd4Var.Y();
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new dq6(i2, i3, i4, i5, ou6Var2, ac4Var, i6);
        }
    }

    public static int r0(Object obj, Object obj2, int i2, Object obj3, int[] iArr, Object[] objArr, Object[] objArr2) {
        int i3;
        int i4;
        int iJ0 = ww1.j0(obj);
        int i5 = iJ0 & i2;
        int iT0 = t0(i5, obj3);
        if (iT0 != 0) {
            int i6 = ~i2;
            int i7 = iJ0 & i6;
            int i8 = -1;
            while (true) {
                i3 = iT0 - 1;
                i4 = iArr[i3];
                if ((i4 & i6) == i7 && yn2.z(obj, objArr[i3]) && (objArr2 == null || yn2.z(obj2, objArr2[i3]))) {
                    break;
                }
                int i9 = i4 & i2;
                if (i9 == 0) {
                    break;
                }
                i8 = i3;
                iT0 = i9;
            }
            int i10 = i4 & i2;
            if (i8 == -1) {
                u0(i5, obj3, i10);
                return i3;
            }
            iArr[i8] = j0(iArr[i8], i10, i2);
            return i3;
        }
        return -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void s(defpackage.cp2 r25, ou6 r26, dd4 r27, int r28) {
        /*
            Method dump skipped, instruction units count: 595
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gjb.s(cp2, ou6, dd4, int):void");
    }

    public static final long s0(float f2, long j2) {
        float fMax = Math.max(0.0f, Float.intBitsToFloat((int) (j2 >> 32)) - f2);
        float fMax2 = Math.max(0.0f, Float.intBitsToFloat((int) (j2 & 4294967295L)) - f2);
        return (((long) Float.floatToRawIntBits(fMax)) << 32) | (((long) Float.floatToRawIntBits(fMax2)) & 4294967295L);
    }

    public static final void t(final String str, final String str2, final x31 x31Var, final mn8 mn8Var, final boolean z2, final boolean z3, final cp2 cp2Var, final List list, final ou6 ou6Var, String str3, boolean z4, final kb4 kb4Var, final ib4 ib4Var, final ib4 ib4Var2, final kb4 kb4Var2, final kb4 kb4Var3, final kb4 kb4Var4, ib4 ib4Var3, final ib4 ib4Var4, dd4 dd4Var, final int i2, final int i3, final int i4) {
        String str4;
        int i5;
        x31 x31Var2;
        mn8 mn8Var2;
        boolean z5;
        String str5;
        boolean z6;
        int i6;
        final ib4 ib4Var5;
        final String str6;
        final ib4 ib4Var6;
        String strK;
        x31Var.getClass();
        mn8Var.getClass();
        list.getClass();
        dd4Var.h0(-1642540387);
        if ((i2 & 6) == 0) {
            str4 = str;
            i5 = (dd4Var.f(str4) ? 4 : 2) | i2;
        } else {
            str4 = str;
            i5 = i2;
        }
        if ((i2 & 48) == 0) {
            i5 |= dd4Var.f(str2) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            x31Var2 = x31Var;
            i5 |= dd4Var.f(x31Var2) ? 256 : Token.CASE;
        } else {
            x31Var2 = x31Var;
        }
        if ((i2 & 3072) == 0) {
            mn8Var2 = mn8Var;
            i5 |= dd4Var.f(mn8Var2) ? 2048 : 1024;
        } else {
            mn8Var2 = mn8Var;
        }
        if ((i2 & 24576) == 0) {
            z5 = z2;
            i5 |= dd4Var.g(z5) ? 16384 : 8192;
        } else {
            z5 = z2;
        }
        int i7 = i2 & 196608;
        int i8 = Parser.ARGC_LIMIT;
        if (i7 == 0) {
            i5 |= dd4Var.g(z3) ? 131072 : 65536;
        }
        if ((i2 & 1572864) == 0) {
            i5 |= (i2 & 2097152) == 0 ? dd4Var.f(cp2Var) : dd4Var.h(cp2Var) ? 1048576 : 524288;
        }
        if ((i2 & 12582912) == 0) {
            i5 |= dd4Var.h(list) ? 8388608 : 4194304;
        }
        if ((i2 & 100663296) == 0) {
            i5 |= dd4Var.f(ou6Var) ? 67108864 : 33554432;
        }
        int i9 = i4 & 512;
        if (i9 != 0) {
            i5 |= 805306368;
            str5 = str3;
        } else {
            str5 = str3;
            if ((i2 & 805306368) == 0) {
                i5 |= dd4Var.f(str5) ? 536870912 : 268435456;
            }
        }
        int i10 = i5;
        int i11 = i4 & 1024;
        if (i11 != 0) {
            i6 = i3 | 6;
            z6 = z4;
        } else {
            z6 = z4;
            if ((i3 & 6) == 0) {
                i6 = i3 | (dd4Var.g(z6) ? 4 : 2);
            } else {
                i6 = i3;
            }
        }
        if ((i3 & 48) == 0) {
            i6 |= dd4Var.h(kb4Var) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i6 |= dd4Var.h(ib4Var) ? 256 : Token.CASE;
        }
        if ((i3 & 3072) == 0) {
            i6 |= dd4Var.h(ib4Var2) ? 2048 : 1024;
        }
        if ((i3 & 24576) == 0) {
            i6 |= dd4Var.h(kb4Var2) ? 16384 : 8192;
        }
        if ((i3 & 196608) == 0) {
            if (dd4Var.h(kb4Var3)) {
                i8 = 131072;
            }
            i6 |= i8;
        }
        if ((i3 & 1572864) == 0) {
            i6 |= dd4Var.h(kb4Var4) ? 1048576 : 524288;
        }
        int i12 = i4 & 131072;
        if (i12 != 0) {
            i6 |= 12582912;
        } else if ((i3 & 12582912) == 0) {
            i6 |= dd4Var.h(ib4Var3) ? 8388608 : 4194304;
        }
        if ((i3 & 100663296) == 0) {
            i6 |= dd4Var.h(ib4Var4) ? 67108864 : 33554432;
        }
        if (dd4Var.V(i10 & 1, ((i10 & 306783379) == 306783378 && (i6 & 38347923) == 38347922) ? false : true)) {
            String str7 = i9 != 0 ? null : str5;
            final boolean z7 = i11 != 0 ? false : z6;
            Object obj = vl1.a;
            if (i12 != 0) {
                Object objQ = dd4Var.Q();
                if (objQ == obj) {
                    objQ = new dh1(1);
                    dd4Var.p0(objQ);
                }
                ib4Var6 = (ib4) objQ;
            } else {
                ib4Var6 = ib4Var3;
            }
            if (str7 == null) {
                dd4Var.f0(2066675443);
                strK = wn9.K((pv9) zt9.M.getValue(), dd4Var);
                dd4Var.q(false);
            } else {
                dd4Var.f0(2066675195);
                dd4Var.q(false);
                strK = str7;
            }
            Boolean boolValueOf = Boolean.valueOf(z5);
            Object objQ2 = dd4Var.Q();
            if (objQ2 == obj) {
                objQ2 = new uha(22);
                dd4Var.p0(objQ2);
            }
            kb4 kb4Var5 = (kb4) objQ2;
            final String str8 = str4;
            final x31 x31Var3 = x31Var2;
            final mn8 mn8Var3 = mn8Var2;
            final String str9 = strK;
            z6 = z7;
            t96.b(boolValueOf, ou6Var, kb4Var5, null, "reply_composer_state", null, jf0.G(926161440, new ac4() { // from class: j0b
                @Override // defpackage.ac4
                public final Object g(Object obj2, Object obj3, Object obj4, Object obj5) {
                    boolean zBooleanValue = ((Boolean) obj3).booleanValue();
                    dd4 dd4Var2 = (dd4) obj4;
                    ((Integer) obj5).getClass();
                    ((in) obj2).getClass();
                    String str10 = str8;
                    String str11 = str2;
                    String str12 = str9;
                    kb4 kb4Var6 = kb4Var;
                    Object obj6 = vl1.a;
                    if (zBooleanValue) {
                        dd4Var2.f0(407998011);
                        boolean zF = dd4Var2.f(kb4Var6);
                        Object objQ3 = dd4Var2.Q();
                        if (zF || objQ3 == obj6) {
                            objQ3 = new ir6(29, kb4Var6);
                            dd4Var2.p0(objQ3);
                        }
                        gjb.N(str10, str11, x31Var3, mn8Var3, cp2Var, list, null, str12, z3, z7, (ib4) objQ3, ib4Var, ib4Var2, kb4Var2, kb4Var3, kb4Var4, ib4Var6, ib4Var4, dd4Var2, 32768);
                        dd4Var2.q(false);
                    } else {
                        dd4Var2.f0(405664455);
                        lu6 lu6Var = lu6.a;
                        ou6 ou6VarE = yib.E(lu6Var, 14);
                        rp8 rp8Var = tp8.a;
                        ou6 ou6VarW = t96.w(y86.d0(ou6VarE, 10.0f, rp8Var, 28), rp8Var);
                        long jC = lc1.c(0.98f, s00.o(dd4Var2).p);
                        lp4 lp4Var = jf0.G;
                        ou6 ou6VarM0 = gjb.m0(fw.G(fe.L(ou6VarW, jC, lp4Var), 1.0f, lc1.c(0.08f, s00.o(dd4Var2).a), rp8Var), 12.0f, 10.0f);
                        wf0 wf0Var = bv4.x;
                        iv ivVar = pv.a;
                        eq8 eq8VarA = dq8.a(ivVar, wf0Var, dd4Var2, 48);
                        int iHashCode = Long.hashCode(dd4Var2.T);
                        lr7 lr7VarL = dd4Var2.l();
                        ou6 ou6VarL0 = s32.L0(dd4Var2, ou6VarM0);
                        ml1.k.getClass();
                        um1 um1Var = ll1.b;
                        dd4Var2.j0();
                        if (dd4Var2.S) {
                            dd4Var2.k(um1Var);
                        } else {
                            dd4Var2.s0();
                        }
                        jm jmVar = ll1.f;
                        un9.s(jmVar, dd4Var2, eq8VarA);
                        jm jmVar2 = ll1.e;
                        un9.s(jmVar2, dd4Var2, lr7VarL);
                        Integer numValueOf = Integer.valueOf(iHashCode);
                        jm jmVar3 = ll1.g;
                        un9.s(jmVar3, dd4Var2, numValueOf);
                        kd kdVar = ll1.h;
                        un9.r(dd4Var2, kdVar);
                        jm jmVar4 = ll1.d;
                        un9.s(jmVar4, dd4Var2, ou6VarL0);
                        sg9.a(str10, str11, tg9.n(lu6Var, 34.0f), (ib4) null, dd4Var2, 384, 8);
                        ou6 ou6VarL = fe.L(t96.w(j39.f(lu6Var, 10.0f, dd4Var2, 1.0f, true), rp8Var), lc1.c(0.06f, s00.o(dd4Var2).a), lp4Var);
                        boolean zF2 = dd4Var2.f(kb4Var6);
                        Object objQ4 = dd4Var2.Q();
                        if (zF2 || objQ4 == obj6) {
                            objQ4 = new ir6(27, kb4Var6);
                            dd4Var2.p0(objQ4);
                        }
                        ou6 ou6VarM02 = gjb.m0(fw.J(null, (ib4) objQ4, ou6VarL, false, 15), 16.0f, 12.0f);
                        eq8 eq8VarA2 = dq8.a(ivVar, wf0Var, dd4Var2, 48);
                        int iHashCode2 = Long.hashCode(dd4Var2.T);
                        lr7 lr7VarL2 = dd4Var2.l();
                        ou6 ou6VarL02 = s32.L0(dd4Var2, ou6VarM02);
                        dd4Var2.j0();
                        if (dd4Var2.S) {
                            dd4Var2.k(um1Var);
                        } else {
                            dd4Var2.s0();
                        }
                        un9.s(jmVar, dd4Var2, eq8VarA2);
                        un9.s(jmVar2, dd4Var2, lr7VarL2);
                        ky0.v(iHashCode2, dd4Var2, jmVar3, dd4Var2, kdVar);
                        un9.s(jmVar4, dd4Var2, ou6VarL02);
                        nha.c(str12, (ou6) null, s00.o(dd4Var2).s, (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, (vaa) null, 0L, 0, false, 1, 0, (kb4) null, s00.q(dd4Var2).k, dd4Var2, 0, 24576, 114682);
                        ky0.A(dd4Var2, true, lu6Var, 10.0f, dd4Var2);
                        p35 p35VarC = i25.c((m53) f53.k0.getValue(), dd4Var2, 0);
                        long j2 = s00.o(dd4Var2).b;
                        ou6 ou6VarE2 = tg9.n(lu6Var, 40.0f).e(new hmb(bv4.y));
                        g83 g83Var = o96.a;
                        ou6 ou6VarI0 = sw1.i0(t96.w(ou6VarE2, rw1.k0(g83.r(), dd4Var2)), -35.0f);
                        boolean zF3 = dd4Var2.f(kb4Var6);
                        Object objQ5 = dd4Var2.Q();
                        if (zF3 || objQ5 == obj6) {
                            objQ5 = new ir6(28, kb4Var6);
                            dd4Var2.p0(objQ5);
                        }
                        mx4.a(p35VarC, (String) null, gjb.p0(fe.L(fw.J(null, (ib4) objQ5, ou6VarI0, false, 15), s00.o(dd4Var2).a, lp4Var), 6.0f, 0.0f, 2.0f, 0.0f, 10), j2, dd4Var2, 48, 0);
                        dd4Var2.q(true);
                        dd4Var2.q(false);
                    }
                    return heb.a;
                }
            }, dd4Var), dd4Var, ((i10 >> 12) & 14) | 1597824 | ((i10 >> 21) & Token.ASSIGN_MOD), 40);
            str6 = str7;
            ib4Var5 = ib4Var6;
        } else {
            dd4Var.Y();
            ib4Var5 = ib4Var3;
            str6 = str5;
        }
        final boolean z8 = z6;
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new yb4() { // from class: h0b
                @Override // defpackage.yb4
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int iX0 = qu1.x0(i2 | 1);
                    int iX02 = qu1.x0(i3);
                    gjb.t(str, str2, x31Var, mn8Var, z2, z3, cp2Var, list, ou6Var, str6, z8, kb4Var, ib4Var, ib4Var2, kb4Var2, kb4Var3, kb4Var4, ib4Var5, ib4Var4, (dd4) obj2, iX0, iX02, i4);
                    return heb.a;
                }
            };
        }
    }

    public static int t0(int i2, Object obj) {
        return obj instanceof byte[] ? ((byte[]) obj)[i2] & 255 : obj instanceof short[] ? ((short[]) obj)[i2] & 65535 : ((int[]) obj)[i2];
    }

    public static final void u(bp2 bp2Var, ib4 ib4Var, ou6 ou6Var, String str, int i2, kb4 kb4Var, yb4 yb4Var, kb4 kb4Var2, ib4 ib4Var2, dd4 dd4Var, int i3) {
        ou6 ou6Var2;
        boolean z2;
        boolean z3;
        boolean z4;
        dd4 dd4Var2 = dd4Var;
        bp2Var.getClass();
        long j2 = bp2Var.i;
        sgb sgbVar = bp2Var.c;
        List list = bp2Var.j;
        ib4Var.getClass();
        dd4Var2.h0(210677021);
        int i4 = i3 | (dd4Var2.h(bp2Var) ? 4 : 2) | (dd4Var2.h(ib4Var) ? 32 : 16) | 384 | (dd4Var2.f(str) ? 2048 : 1024) | (dd4Var2.d(i2) ? 16384 : 8192) | (dd4Var2.h(kb4Var) ? 131072 : Parser.ARGC_LIMIT) | (dd4Var2.h(yb4Var) ? 1048576 : 524288) | (dd4Var2.h(ib4Var2) ? 67108864 : 33554432);
        if (dd4Var2.V(i4 & 1, (38347923 & i4) != 38347922)) {
            int i5 = bp2Var.d;
            ou6 ou6Var3 = lu6.a;
            if (i5 == 2 || lc5.Q(fc1.P0(list), jo2.a)) {
                dd4Var2.f0(1332375429);
                zk9.b(6, 0, dd4Var2, ou6Var3);
                dd4Var2.q(false);
                ye8 ye8VarU = dd4Var2.u();
                if (ye8VarU != null) {
                    ye8VarU.d = new pj1(bp2Var, ib4Var, str, i2, kb4Var, yb4Var, kb4Var2, ib4Var2, i3);
                    return;
                }
                return;
            }
            dd4Var2.f0(1332436933);
            dd4Var2.q(false);
            boolean zE = dd4Var2.e(bp2Var.a) | ((i4 & 7168) == 2048) | ((i4 & 57344) == 16384);
            Object objQ = dd4Var2.Q();
            Object obj = vl1.a;
            if (zE || objQ == obj) {
                boolean z5 = i2 == 3;
                objQ = Boolean.valueOf((lc5.Q(sgbVar.a, str) || z5) && (z5 || r95.a.k().c() - j2 < 720000));
                dd4Var2.p0(objQ);
            }
            boolean zBooleanValue = ((Boolean) objQ).booleanValue();
            ou6 ou6VarF = tg9.f(ou6Var3, 1.0f);
            ur9 ur9Var = s96.a;
            ou6 ou6VarL0 = l0(fe.L(t96.w(ou6VarF, ((q96) dd4Var2.j(ur9Var)).c.d), dd1.g(((q96) dd4Var2.j(ur9Var)).a, 2.0f), jf0.G), 12.0f);
            ie1 ie1VarA = ge1.a(pv.c, bv4.z, dd4Var2, 0);
            int iHashCode = Long.hashCode(dd4Var2.T);
            lr7 lr7VarL = dd4Var2.l();
            ou6 ou6VarL02 = s32.L0(dd4Var2, ou6VarL0);
            ml1.k.getClass();
            um1 um1Var = ll1.b;
            dd4Var2.j0();
            if (dd4Var2.S) {
                dd4Var2.k(um1Var);
            } else {
                dd4Var2.s0();
            }
            un9.s(ll1.f, dd4Var2, ie1VarA);
            un9.s(ll1.e, dd4Var2, lr7VarL);
            un9.s(ll1.g, dd4Var2, Integer.valueOf(iHashCode));
            un9.r(dd4Var2, ll1.h);
            un9.s(ll1.d, dd4Var2, ou6VarL02);
            a(sgbVar, bp2Var.i, false, null, sgbVar.c, dd4Var2, 392);
            cp2 cp2Var = bp2Var.e;
            if (cp2Var != null) {
                ky0.z(dd4Var2, 1225895445, ou6Var3, 12.0f, dd4Var2);
                s(cp2Var, null, dd4Var2, 8);
                z2 = false;
                dd4Var2.q(false);
            } else {
                z2 = false;
                dd4Var2.f0(1225993467);
                dd4Var2.q(false);
            }
            if (list.isEmpty()) {
                z3 = z2;
                z4 = true;
                dd4Var2.f0(1226297019);
                dd4Var2.q(z3);
            } else {
                ky0.z(dd4Var2, 1226041393, ou6Var3, 10.0f, dd4Var2);
                int i6 = i4 >> 3;
                z3 = z2;
                z4 = true;
                zk9.c(list, true, null, null, kb4Var, yb4Var, dd4Var2, (i6 & 57344) | 48 | (i6 & 458752), 12);
                dd4Var2.q(z3);
            }
            un9.a(dd4Var2, tg9.h(ou6Var3, 12.0f));
            boolean z6 = bp2Var.g;
            int i7 = bp2Var.f;
            long j3 = bp2Var.h;
            Long lValueOf = j3 > j2 ? Long.valueOf(j3) : null;
            boolean z7 = ((i4 & 14) == 4 || dd4Var2.h(bp2Var)) ? z4 : z3;
            Object objQ2 = dd4Var2.Q();
            if (z7 || objQ2 == obj) {
                objQ2 = new nga(5, kb4Var2, bp2Var);
                dd4Var2.p0(objQ2);
            }
            dk9.b(z6, i7, ib4Var, (ou6) null, lValueOf, zBooleanValue, (ib4) objQ2, ib4Var2, dd4Var2, ((i4 << 3) & 896) | (29360128 & (i4 >> 3)));
            dd4Var2 = dd4Var2;
            dd4Var2.q(z4);
            ou6Var2 = ou6Var3;
        } else {
            dd4Var2.Y();
            ou6Var2 = ou6Var;
        }
        ye8 ye8VarU2 = dd4Var2.u();
        if (ye8VarU2 != null) {
            ye8VarU2.d = new xb1(bp2Var, ib4Var, ou6Var2, str, i2, kb4Var, yb4Var, kb4Var2, ib4Var2, i3);
        }
    }

    public static void u0(int i2, Object obj, int i3) {
        if (obj instanceof byte[]) {
            ((byte[]) obj)[i2] = (byte) i3;
        } else if (obj instanceof short[]) {
            ((short[]) obj)[i2] = (short) i3;
        } else {
            ((int[]) obj)[i2] = i3;
        }
    }

    public static final void v(ArrayList arrayList, ou6 ou6Var, dd4 dd4Var, int i2) {
        ou6 ou6Var2;
        dd4Var.h0(1442134145);
        int i3 = (dd4Var.h(arrayList) ? 4 : 2) | i2 | 48;
        if (dd4Var.V(i3 & 1, (i3 & 19) != 18)) {
            float size = (arrayList.size() * 18) + 18;
            ou6Var2 = lu6.a;
            ou6 ou6VarR = tg9.r(ou6Var2, size);
            ha6 ha6VarD = pn0.d(bv4.b, false);
            int iHashCode = Long.hashCode(dd4Var.T);
            lr7 lr7VarL = dd4Var.l();
            ou6 ou6VarL0 = s32.L0(dd4Var, ou6VarR);
            ml1.k.getClass();
            um1 um1Var = ll1.b;
            dd4Var.j0();
            if (dd4Var.S) {
                dd4Var.k(um1Var);
            } else {
                dd4Var.s0();
            }
            un9.s(ll1.f, dd4Var, ha6VarD);
            un9.s(ll1.e, dd4Var, lr7VarL);
            un9.s(ll1.g, dd4Var, Integer.valueOf(iHashCode));
            un9.r(dd4Var, ll1.h);
            un9.s(ll1.d, dd4Var, ou6VarL0);
            dd4Var.f0(1633253415);
            int size2 = arrayList.size();
            int i4 = 0;
            int i5 = 0;
            while (i5 < size2) {
                Object obj = arrayList.get(i5);
                int i6 = i5 + 1;
                int i7 = i4 + 1;
                if (i4 < 0) {
                    gc1.i0();
                    throw null;
                }
                sgb sgbVar = (sgb) obj;
                sg9.a(sgbVar.c, sgbVar.b, fw.G(tg9.n(p0(ou6Var2, i4 * 16, 0.0f, 0.0f, 0.0f, 14), 28.0f), 2.0f, ((q96) dd4Var.j(s96.a)).a.p, tp8.a), (ib4) null, dd4Var, 0, 8);
                size2 = size2;
                i5 = i6;
                i4 = i7;
            }
            dd4Var.q(false);
            dd4Var.q(true);
        } else {
            dd4Var.Y();
            ou6Var2 = ou6Var;
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new b18(arrayList, ou6Var2, i2, 19);
        }
    }

    public static double v0(double d2) {
        double d3 = d2 / 100.0d;
        return (d3 <= 0.0031308d ? d3 * 12.92d : (Math.pow(d3, 0.4166666666666667d) * 1.055d) - 0.055d) * 255.0d;
    }

    public static final void w(cp2 cp2Var, ib4 ib4Var, ou6 ou6Var, dd4 dd4Var, int i2) {
        int i3;
        ib4 ib4Var2;
        ou6 ou6Var2;
        dd4 dd4Var2 = dd4Var;
        dd4Var2.h0(-1105899667);
        if ((i2 & 6) == 0) {
            i3 = i2 | ((i2 & 8) == 0 ? dd4Var2.f(cp2Var) : dd4Var2.h(cp2Var) ? 4 : 2);
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= dd4Var2.h(ib4Var) ? 32 : 16;
        }
        int i4 = i3 | 384;
        if (dd4Var2.V(i4 & 1, (i4 & Token.EXPR_VOID) != 146)) {
            eyb eybVarH = oh9.h(dd4Var2);
            sgb sgbVar = cp2Var.a;
            boolean zF = dd4Var2.f(sgbVar.f);
            Object objQ = dd4Var2.Q();
            fu6 fu6Var = vl1.a;
            Object obj = objQ;
            if (zF || objQ == fu6Var) {
                List list = sgbVar.f;
                ArrayList arrayList = new ArrayList(gc1.M(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(new lc1(kf0.H((String) it.next())));
                }
                dd4Var2.p0(arrayList);
                obj = arrayList;
            }
            List listY = (List) obj;
            ou6 ou6Var3 = lu6.a;
            ou6 ou6VarW = t96.w(tg9.f(ou6Var3, 1.0f), s00.p(dd4Var2).d);
            long jG = dd1.g(s00.o(dd4Var2), 7.0f);
            lp4 lp4Var = jf0.G;
            ou6 ou6VarL0 = l0(jv3.G(fe.L(ou6VarW, jG, lp4Var), fc5.a), 12.0f);
            wf0 wf0Var = bv4.x;
            iv ivVar = pv.a;
            eq8 eq8VarA = dq8.a(ivVar, wf0Var, dd4Var2, 48);
            int iHashCode = Long.hashCode(dd4Var2.T);
            lr7 lr7VarL = dd4Var2.l();
            ou6 ou6VarL02 = s32.L0(dd4Var2, ou6VarL0);
            ml1.k.getClass();
            um1 um1Var = ll1.b;
            dd4Var2.j0();
            if (dd4Var2.S) {
                dd4Var2.k(um1Var);
            } else {
                dd4Var2.s0();
            }
            jm jmVar = ll1.f;
            un9.s(jmVar, dd4Var2, eq8VarA);
            jm jmVar2 = ll1.e;
            un9.s(jmVar2, dd4Var2, lr7VarL);
            Integer numValueOf = Integer.valueOf(iHashCode);
            jm jmVar3 = ll1.g;
            un9.s(jmVar3, dd4Var2, numValueOf);
            kd kdVar = ll1.h;
            un9.r(dd4Var2, kdVar);
            jm jmVar4 = ll1.d;
            un9.s(jmVar4, dd4Var2, ou6VarL02);
            ou6 ou6VarC = tg9.c(tg9.r(ou6Var3, 3.0f), 1.0f);
            rp8 rp8Var = tp8.a;
            pn0.a(fe.L(t96.w(ou6VarC, rp8Var), lc1.c(0.32f, s00.o(dd4Var2).a), lp4Var), dd4Var2, 0);
            bp5 bp5VarF = j39.f(ou6Var3, 10.0f, dd4Var2, 1.0f, true);
            ie1 ie1VarA = ge1.a(pv.c, bv4.z, dd4Var2, 0);
            int iHashCode2 = Long.hashCode(dd4Var2.T);
            lr7 lr7VarL2 = dd4Var2.l();
            ou6 ou6VarL03 = s32.L0(dd4Var2, bp5VarF);
            dd4Var2.j0();
            if (dd4Var2.S) {
                dd4Var2.k(um1Var);
            } else {
                dd4Var2.s0();
            }
            un9.s(jmVar, dd4Var2, ie1VarA);
            un9.s(jmVar2, dd4Var2, lr7VarL2);
            ky0.v(iHashCode2, dd4Var2, jmVar3, dd4Var2, kdVar);
            un9.s(jmVar4, dd4Var2, ou6VarL03);
            eq8 eq8VarA2 = dq8.a(ivVar, wf0Var, dd4Var2, 48);
            int iHashCode3 = Long.hashCode(dd4Var2.T);
            lr7 lr7VarL3 = dd4Var2.l();
            ou6 ou6VarL04 = s32.L0(dd4Var2, ou6Var3);
            dd4Var2.j0();
            if (dd4Var2.S) {
                dd4Var2.k(um1Var);
            } else {
                dd4Var2.s0();
            }
            un9.s(jmVar, dd4Var2, eq8VarA2);
            un9.s(jmVar2, dd4Var2, lr7VarL3);
            ky0.v(iHashCode3, dd4Var2, jmVar3, dd4Var2, kdVar);
            un9.s(jmVar4, dd4Var2, ou6VarL04);
            sg9.a(sgbVar.c, sgbVar.b, tg9.n(ou6Var3, 20.0f), (ib4) null, dd4Var2, 384, 8);
            un9.a(dd4Var2, tg9.r(ou6Var3, 8.0f));
            String str = sgbVar.b;
            dd4Var2.f0(1988870340);
            if (listY.isEmpty()) {
                listY = gc1.Y(new lc1(s00.o(dd4Var2).a));
            }
            dd4Var2.q(false);
            i12.c(str, (ou6) null, listY, 0L, 0L, (vaa) null, 0L, 0, false, 1, 0, s00.q(dd4Var2).m, dd4Var, 0, 3072, 57338);
            dd4Var2 = dd4Var;
            xv5.z(dd4Var2, true, ou6Var3, 6.0f, dd4Var2);
            i12.e(cp2Var.b, false, uka.a(s00.q(dd4Var2).k, lc1.c(0.84f, s00.o(dd4Var2).q), 0L, (a84) null, (c64) null, 0L, spa.c, (iy5) null, 16646142), 0, 0, 2, 2, tg9.f(ou6Var3, 1.0f), eybVarH.a * 0.65f, (kb4) null, (kb4) null, (yb4) null, dd4Var2, 14352384, 3610);
            ky0.A(dd4Var2, true, ou6Var3, 8.0f, dd4Var2);
            p35 p35VarC = i25.c((m53) a53.w.getValue(), dd4Var2, 0);
            long j2 = s00.o(dd4Var2).s;
            ou6 ou6VarW2 = t96.w(tg9.n(ou6Var3, 28.0f), rp8Var);
            boolean z2 = (i4 & Token.ASSIGN_MOD) == 32;
            Object objQ2 = dd4Var2.Q();
            if (z2 || objQ2 == fu6Var) {
                ib4Var2 = ib4Var;
                objQ2 = new hpa(11, ib4Var2);
                dd4Var2.p0(objQ2);
            } else {
                ib4Var2 = ib4Var;
            }
            mx4.a(p35VarC, (String) null, l0(fw.J(null, (ib4) objQ2, ou6VarW2, false, 15), 6.0f), j2, dd4Var2, 48, 0);
            dd4Var2.q(true);
            ou6Var2 = ou6Var3;
        } else {
            ib4Var2 = ib4Var;
            dd4Var2.Y();
            ou6Var2 = ou6Var;
        }
        ye8 ye8VarU = dd4Var2.u();
        if (ye8VarU != null) {
            ye8VarU.d = new yi(cp2Var, ib4Var2, ou6Var2, i2, 23);
        }
    }

    public static final List w0(int i2, int i3, ArrayList arrayList, List list) {
        if (arrayList.isEmpty()) {
            return lc3.a;
        }
        ArrayList arrayList2 = new ArrayList(list);
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            es5 es5Var = (es5) arrayList.get(i4);
            int index = es5Var.getIndex();
            if (i2 <= index && index <= i3) {
                arrayList2.add(es5Var);
            }
        }
        ic1.m0(C, arrayList2);
        return arrayList2;
    }

    public static final void x(p35 p35Var, boolean z2, ib4 ib4Var, dd4 dd4Var, int i2, int i3) {
        int i4;
        boolean z3;
        long jC;
        dd4Var.h0(-1524519770);
        int i5 = i2 | (dd4Var.f(p35Var) ? 4 : 2);
        int i6 = i3 & 2;
        if (i6 != 0) {
            i4 = i5 | 48;
        } else {
            i4 = i5 | (dd4Var.g(z2) ? 32 : 16);
        }
        int i7 = i4 | (dd4Var.h(ib4Var) ? 256 : Token.CASE);
        if (dd4Var.V(i7 & 1, (i7 & Token.EXPR_VOID) != 146)) {
            z3 = i6 != 0 ? false : z2;
            rp8 rp8Var = tp8.a;
            lu6 lu6Var = lu6.a;
            ou6 ou6VarW = t96.w(lu6Var, rp8Var);
            boolean z4 = (i7 & 896) == 256;
            Object objQ = dd4Var.Q();
            if (z4 || objQ == vl1.a) {
                objQ = new hpa(12, ib4Var);
                dd4Var.p0(objQ);
            }
            ou6 ou6VarJ = fw.J(null, (ib4) objQ, ou6VarW, false, 15);
            ha6 ha6VarD = pn0.d(bv4.f, false);
            int iHashCode = Long.hashCode(dd4Var.T);
            lr7 lr7VarL = dd4Var.l();
            ou6 ou6VarL0 = s32.L0(dd4Var, ou6VarJ);
            ml1.k.getClass();
            um1 um1Var = ll1.b;
            dd4Var.j0();
            if (dd4Var.S) {
                dd4Var.k(um1Var);
            } else {
                dd4Var.s0();
            }
            un9.s(ll1.f, dd4Var, ha6VarD);
            un9.s(ll1.e, dd4Var, lr7VarL);
            un9.s(ll1.g, dd4Var, Integer.valueOf(iHashCode));
            un9.r(dd4Var, ll1.h);
            un9.s(ll1.d, dd4Var, ou6VarL0);
            ur9 ur9Var = s96.a;
            long j2 = ((q96) dd4Var.j(ur9Var)).a.q;
            ou6 ou6VarL02 = l0(t96.w(tg9.n(lu6Var, 32.0f), rp8Var), 2.0f);
            if (z3) {
                dd4Var.f0(-650488674);
                jC = lc1.c(0.3f, ((q96) dd4Var.j(ur9Var)).a.a);
                dd4Var.q(false);
            } else {
                dd4Var.f0(-650384607);
                dd4Var.q(false);
                jC = lc1.i;
            }
            mx4.a(p35Var, (String) null, l0(fe.L(ou6VarL02, jC, rp8Var), 3.0f), j2, dd4Var, (i7 & 14) | 48, 0);
            dd4Var.q(true);
        } else {
            dd4Var.Y();
            z3 = z2;
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new uu1(p35Var, z3, ib4Var, i2, i3);
        }
    }

    public static final void y(int i2, int i3, kb4 kb4Var, dd4 dd4Var, ou6 ou6Var) {
        dd4 dd4Var2 = dd4Var;
        dd4Var2.h0(1951008997);
        int i4 = i3 | (dd4Var2.d(i2) ? 4 : 2) | (dd4Var.f(ou6Var) ? 32 : 16) | (dd4Var2.h(kb4Var) ? 256 : Token.CASE);
        if (dd4Var2.V(i4 & 1, (i4 & Token.EXPR_VOID) != 146)) {
            eq8 eq8VarA = dq8.a(pv.a, bv4.x, dd4Var2, 48);
            int iHashCode = Long.hashCode(dd4Var2.T);
            lr7 lr7VarL = dd4Var2.l();
            ou6 ou6VarL0 = s32.L0(dd4Var, ou6Var);
            ml1.k.getClass();
            um1 um1Var = ll1.b;
            dd4Var2.j0();
            if (dd4Var2.S) {
                dd4Var2.k(um1Var);
            } else {
                dd4Var2.s0();
            }
            un9.s(ll1.f, dd4Var2, eq8VarA);
            un9.s(ll1.e, dd4Var2, lr7VarL);
            un9.s(ll1.g, dd4Var2, Integer.valueOf(iHashCode));
            un9.r(dd4Var2, ll1.h);
            un9.s(ll1.d, dd4Var2, ou6VarL0);
            p35 p35VarC = i25.c((m53) h53.g.getValue(), dd4Var2, 0);
            ur9 ur9Var = s96.a;
            long j2 = ((q96) dd4Var2.j(ur9Var)).a.q;
            lu6 lu6Var = lu6.a;
            mx4.a(p35VarC, (String) null, l0(fe.L(t96.w(tg9.n(lu6Var, 40.0f), tp8.a), lc1.c(0.2f, ((q96) dd4Var2.j(ur9Var)).a.a), jf0.G), 8.0f), j2, dd4Var2, 48, 0);
            un9.a(dd4Var2, tg9.r(lu6Var, 12.0f));
            List listR = wm9.r((hv9) rv.z.getValue(), dd4Var2);
            ou6 ou6VarF = tg9.f(lu6Var, 1.0f);
            mv mvVar = new mv(8.0f, true, new gp(5));
            boolean zH = dd4Var2.h(listR) | ((i4 & 14) == 4) | ((i4 & 896) == 256);
            Object objQ = dd4Var2.Q();
            if (zH || objQ == vl1.a) {
                objQ = new ja2(listR, i2, kb4Var, 2);
                dd4Var2.p0(objQ);
            }
            mt5.a(ou6VarF, i2, null, null, mvVar, null, null, false, (kb4) objQ, dd4Var, ((i4 << 3) & Token.ASSIGN_MOD) | 196614, 476);
            dd4Var2 = dd4Var;
            dd4Var2.q(true);
        } else {
            dd4Var2.Y();
        }
        ye8 ye8VarU = dd4Var2.u();
        if (ye8VarU != null) {
            ye8VarU.d = new jy0(i2, ou6Var, kb4Var, i3, 4);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01eb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void z(final float r42, final java.lang.String r43, final defpackage.zb4 r44, final float r45, final float r46, final float r47, final ou6 r48, final defpackage.kb4 r49, dd4 r50, final int r51) {
        /*
            Method dump skipped, instruction units count: 554
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gjb.z(float, java.lang.String, zb4, float, float, float, ou6, kb4, dd4, int):void");
    }
}
