package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Paint;
import android.view.KeyEvent;
import android.view.Window;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import org.mozilla.javascript.Parser;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public abstract class fw {
    public static final cd1 A;
    public static final cd1 B;
    public static final cd1 C;
    public static final cd1 D;
    public static final cd1 E;
    public static final cd1 F;
    public static final cd1 G;
    public static final cd1 H;
    public static final cd1 I;
    public static final cd1 J;
    public static final cd1 K;
    public static final cd1 L;
    public static final cd1 M;
    public static final cd1 N;
    public static final cd1 O;
    public static final cd1 P;
    public static final cd1 Q;
    public static final cd1 R;
    public static final cd1 S;
    public static final cd1 T;
    public static final cd1 U;
    public static final cd1 V;
    public static final cd1 W;
    public static final cd1 X;
    public static final cd1 Y;
    public static final byte[] Z;
    public static final rj1 a;
    public static final cu3 a0;
    public static final rj1 b;
    public static final cu3 b0;
    public static final cu3 c0;
    public static final rj1 d;
    public static final cu3 d0;
    public static final rj1 e;
    public static final rj1 f;
    public static final rj1 g;
    public static final rj1 i;
    public static final rj1 o;
    public static final cd1 v;
    public static final y89 w;
    public static final cd1 x;
    public static final cd1 y;
    public static final cd1 z;
    public static final rj1 c = new rj1(new ck1(3), false, -429899989);
    public static final rj1 h = new rj1(new dk1(29), false, -499081522);
    public static final rj1 j = new rj1(new kk1(9), false, 124138812);
    public static final rj1 k = new rj1(new jk1(13), false, -2039922496);
    public static final rj1 l = new rj1(new kk1(10), false, 1532857825);
    public static final rj1 m = new rj1(new bk1(1), false, -356642060);
    public static final rj1 n = new rj1(new vj1(20), false, 964371439);
    public static final ybb p = ybb.b;
    public static final double[][] q = {new double[]{0.001200833568784504d, 0.002389694492170889d, 2.795742885861124E-4d}, new double[]{5.891086651375999E-4d, 0.0029785502573438758d, 3.270666104008398E-4d}, new double[]{1.0146692491640572E-4d, 5.364214359186694E-4d, 0.0032979401770712076d}};
    public static final double[][] r = {new double[]{1373.2198709594231d, -1100.4251190754821d, -7.278681089101213d}, new double[]{-271.815969077903d, 559.6580465940733d, -32.46047482791194d}, new double[]{1.9622899599665666d, -57.173814538844006d, 308.7233197812385d}};
    public static final double[] s = {0.2126d, 0.7152d, 0.0722d};
    public static final double[] t = {0.015176349177441876d, 0.045529047532325624d, 0.07588174588720938d, 0.10623444424209313d, 0.13658714259697685d, 0.16693984095186062d, 0.19729253930674434d, 0.2276452376616281d, 0.2579979360165119d, 0.28835063437139563d, 0.3188300904430532d, 0.350925934958123d, 0.3848314933096426d, 0.42057480301049466d, 0.458183274052838d, 0.4976837250274023d, 0.5391024159806381d, 0.5824650784040898d, 0.6277969426914107d, 0.6751227633498623d, 0.7244668422128921d, 0.775853049866786d, 0.829304845476233d, 0.8848452951698498d, 0.942497089126609d, 1.0022825574869039d, 1.0642236851973577d, 1.1283421258858297d, 1.1946592148522128d, 1.2631959812511864d, 1.3339731595349034d, 1.407011200216447d, 1.4823302800086415d, 1.5599503113873272d, 1.6398909516233677d, 1.7221716113234105d, 1.8068114625156377d, 1.8938294463134073d, 1.9832442801866852d, 2.075074464868551d, 2.1693382909216234d, 2.2660538449872063d, 2.36523901573795d, 2.4669114995532007d, 2.5710888059345764d, 2.6777882626779785d, 2.7870270208169257d, 2.898822059350997d, 3.0131901897720907d, 3.1301480604002863d, 3.2497121605402226d, 3.3718988244681087d, 3.4967242352587946d, 3.624204428461639d, 3.754355295633311d, 3.887192587735158d, 4.022731918402185d, 4.160988767090289d, 4.301978482107941d, 4.445716283538092d, 4.592217266055746d, 4.741496401646282d, 4.893568542229298d, 5.048448422192488d, 5.20615066083972d, 5.3666897647573375d, 5.5300801301023865d, 5.696336044816294d, 5.865471690767354d, 6.037501145825082d, 6.212438385869475d, 6.390297286737924d, 6.571091626112461d, 6.7548350853498045d, 6.941541251256611d, 7.131223617812143d, 7.323895587840543d, 7.5195704746346665d, 7.7182615035334345d, 7.919981813454504d, 8.124744458384042d, 8.332562408825165d, 8.543448553206703d, 8.757415699253682d, 8.974476575321063d, 9.194643831691977d, 9.417930041841839d, 9.644347703669503d, 9.873909240696694d, 10.106627003236781d, 10.342513269534024d, 10.58158024687427d, 10.8238400726681d, 11.069304815507364d, 11.317986476196008d, 11.569896988756009d, 11.825048221409341d, 12.083451977536606d, 12.345119996613247d, 12.610063955123938d, 12.878295467455942d, 13.149826086772048d, 13.42466730586372d, 13.702830557985108d, 13.984327217668513d, 14.269168601521828d, 14.55736596900856d, 14.848930523210871d, 15.143873411576273d, 15.44220572664832d, 15.743938506781891d, 16.04908273684337d, 16.35764934889634d, 16.66964922287304d, 16.985093187232053d, 17.30399201960269d, 17.62635644741625d, 17.95219714852476d, 18.281524751807332d, 18.614349837764564d, 18.95068293910138d, 19.290534541298456d, 19.633915083172692d, 19.98083495742689d, 20.331304511189067d, 20.685334046541502d, 21.042933821039977d, 21.404114048223256d, 21.76888489811322d, 22.137256497705877d, 22.50923893145328d, 22.884842241736916d, 23.264076429332462d, 23.6469514538663d, 24.033477234264016d, 24.42366364919083d, 24.817520537484558d, 25.21505769858089d, 25.61628489293138d, 26.021211842414342d, 26.429848230738664d, 26.842203703840827d, 27.258287870275353d, 27.678110301598522d, 28.10168053274597d, 28.529008062403893d, 28.96010235337422d, 29.39497283293396d, 29.83362889318845d, 30.276079891419332d, 30.722335150426627d, 31.172403958865512d, 31.62629557157785d, 32.08401920991837d, 32.54558406207592d, 33.010999283389665d, 33.4802739966603d, 33.953417292456834d, 34.430438229418264d, 34.911345834551085d, 35.39614910352207d, 35.88485700094671d, 36.37747846067349d, 36.87402238606382d, 37.37449765026789d, 37.87891309649659d, 38.38727753828926d, 38.89959975977785d, 39.41588851594697d, 39.93615253289054d, 40.460400508064545d, 40.98864111053629d, 41.520882981230194d, 42.05713473317016d, 42.597404951718396d, 43.141702194811224d, 43.6900349931913d, 44.24241185063697d, 44.798841244188324d, 45.35933162437017d, 45.92389141541209d, 46.49252901546552d, 47.065252796817916d, 47.64207110610409d, 48.22299226451468d, 48.808024568002054d, 49.3971762874833d, 49.9904556690408d, 50.587870934119984d, 51.189430279724725d, 51.79514187861014d, 52.40501387947288d, 53.0190544071392d, 53.637271562750364d, 54.259673423945976d, 54.88626804504493d, 55.517063457223934d, 56.15206766869424d, 56.79128866487574d, 57.43473440856916d, 58.08241284012621d, 58.734331877617365d, 59.39049941699807d, 60.05092333227251d, 60.715611475655585d, 61.38457167773311d, 62.057811747619894d, 62.7353394731159d, 63.417162620860914d, 64.10328893648692d, 64.79372614476921d, 65.48848194977529d, 66.18756403501224d, 66.89098006357258d, 67.59873767827808d, 68.31084450182222d, 69.02730813691093d, 69.74813616640164d, 70.47333615344107d, 71.20291564160104d, 71.93688215501312d, 72.67524319850172d, 73.41800625771542d, 74.16517879925733d, 74.9167682708136d, 75.67278210128072d, 76.43322770089146d, 77.1981124613393d, 77.96744375590167d, 78.74122893956174d, 79.51947534912904d, 80.30219030335869d, 81.08938110306934d, 81.88105503125999d, 82.67721935322541d, 83.4778813166706d, 84.28304815182372d, 85.09272707154808d, 85.90692527145302d, 86.72564993000343d, 87.54890820862819d, 88.3767072518277d, 89.2090541872801d, 90.04595612594655d, 90.88742016217518d, 91.73345337380438d, 92.58406282226491d, 93.43925555268066d, 94.29903859396902d, 95.16341895893969d, 96.03240364439274d, 96.9059996312159d, 97.78421388448044d, 98.6670533535366d, 99.55452497210776d};
    public static final sr5[] u = new sr5[0];

    static {
        int i2 = 0;
        a = new rj1(new zj1(i2), false, 636288403);
        int i3 = 1;
        b = new rj1(new zj1(i3), false, -1357803046);
        int i4 = 4;
        d = new rj1(new ck1(i4), false, 1281378378);
        e = new rj1(new dk1(i2), false, 692659866);
        f = new rj1(new hk1(i4), false, 955368245);
        int i5 = 6;
        g = new rj1(new hk1(i5), false, -498098222);
        i = new rj1(new ik1(i3), false, -703242860);
        o = new rj1(new pk1(i5), false, 112151054);
        cd1 cd1Var = cd1.u;
        v = cd1Var;
        w = y89.b;
        cd1 cd1Var2 = cd1.e;
        x = cd1Var2;
        y = cd1Var2;
        z = cd1Var2;
        A = cd1Var2;
        B = cd1Var2;
        C = cd1Var2;
        cd1 cd1Var3 = cd1.a;
        D = cd1Var3;
        E = cd1Var2;
        F = cd1Var3;
        cd1 cd1Var4 = cd1.f;
        G = cd1Var4;
        H = cd1Var3;
        I = cd1Var3;
        J = cd1Var3;
        K = cd1Var2;
        L = cd1Var;
        M = cd1Var4;
        N = cd1Var;
        O = cd1Var4;
        P = cd1Var4;
        Q = cd1Var2;
        R = cd1Var4;
        S = cd1Var4;
        T = cd1Var4;
        U = cd1Var4;
        V = cd1Var4;
        W = cd1.s;
        X = cd1Var4;
        Y = cd1Var4;
        Z = new byte[0];
        a0 = new cu3("is_user_verifying_platform_authenticator_available_for_credential", 1L);
        b0 = new cu3("is_user_verifying_platform_authenticator_available", 1L);
        c0 = new cu3("privileged_api_list_credentials", 2L);
        d0 = new cu3("get_browser_hybrid_client_sign_pending_intent", 1L);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.util.ArrayList, java.util.List] */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v2, types: [i96] */
    /* JADX WARN: Type inference failed for: r8v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r8v4 */
    public static final zy5 A(String str, List list, boolean z2) {
        ?? arrayList;
        if (list == null) {
            return null;
        }
        String string = bw9.B0(str).toString();
        boolean z3 = string.length() > 0;
        zy5 zy5VarN = gc1.N();
        if (z2) {
            list = new i96(list);
        }
        for (vq2 vq2Var : list) {
            List list2 = vq2Var.b;
            boolean z4 = vq2Var.d;
            boolean z5 = z2 != z4;
            if (!z3 && !z5) {
                arrayList = list2;
            } else if (z3 || !z5) {
                arrayList = new ArrayList();
                for (Object obj : list2) {
                    if (bw9.O(((qo2) obj).b, string, true)) {
                        arrayList.add(obj);
                    }
                }
                if (!arrayList.isEmpty()) {
                    if (z5) {
                        arrayList = new i96((List) arrayList);
                    }
                }
            } else {
                arrayList = new i96(list2);
            }
            if (!arrayList.isEmpty()) {
                if (arrayList != list2 || z5) {
                    zy5VarN.add(new vq2(vq2Var.a, arrayList, vq2Var.c, z4));
                } else {
                    zy5VarN.add(vq2Var);
                }
            }
        }
        return gc1.J(zy5VarN);
    }

    public static int A0(int[] iArr) {
        if (iArr.length == 0) {
            mn5.m();
            return 0;
        }
        int i2 = iArr[0];
        int i3 = 1;
        int length = iArr.length - 1;
        if (1 <= length) {
            while (true) {
                int i4 = iArr[i3];
                if (i2 < i4) {
                    i2 = i4;
                }
                if (i3 == length) {
                    break;
                }
                i3++;
            }
        }
        return i2;
    }

    /* JADX WARN: Path cross not found for [B:20:0x0062, B:33:0x009f], limit reached: 57 */
    /* JADX WARN: Path cross not found for [B:25:0x0078, B:33:0x009f], limit reached: 57 */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:47:0x0119 -> B:48:0x0120). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object B(android.content.Context r19, b15 r20, defpackage.ac1 r21, java.lang.Object r22, ox r23, a07 r24, defpackage.kt1 r25) {
        /*
            Method dump skipped, instruction units count: 348
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fw.B(android.content.Context, b15, ac1, java.lang.Object, ox, a07, kt1):java.lang.Object");
    }

    public static final py6 B0(z4... z4VarArr) {
        ArrayList arrayList = new ArrayList(z4VarArr.length);
        if (z4VarArr.length <= 0) {
            xl7[] xl7VarArr = (xl7[]) arrayList.toArray(new xl7[0]);
            return new py6(y86.S((xl7[]) Arrays.copyOf(xl7VarArr, xl7VarArr.length)));
        }
        z4 z4Var = z4VarArr[0];
        throw null;
    }

    public static boolean C(double d2, double d3, double d4) {
        return ((d3 - d2) + 25.132741228718345d) % 6.283185307179586d < ((d4 - d2) + 25.132741228718345d) % 6.283185307179586d;
    }

    public static final List C0(String str) {
        aq4 aq4Var = aq4.a;
        bp bpVarG = aq4.g(aq4.d(str));
        zo zoVar = new zo();
        String str2 = bpVarG.b;
        zoVar.f(str2);
        for (ap apVar : bpVarG.c()) {
            zoVar.c((vn9) apVar.a, apVar.b, apVar.c);
        }
        for (ap apVar2 : bpVarG.d(0, zoVar.a.length())) {
            zoVar.a(apVar2.d, apVar2.b, apVar2.c, (String) apVar2.a);
        }
        yd4 yd4Var = new yd4(yg8.a(new yg8("(https?:\\/\\/(?:www\\.|(?!www))[a-zA-Z0-9\\u00A0-\\uD7FF\\uF900-\\uFDCF\\uFDF0-\\uFFEF][a-zA-Z0-9-\\u00A0-\\uD7FF\\uF900-\\uFDCF\\uFDF0-\\uFFEF]+[a-zA-Z0-9\\u00A0-\\uD7FF\\uF900-\\uFDCF\\uFDF0-\\uFFEF]\\.[^\\s]{2,}|www\\.[a-zA-Z0-9\\u00A0-\\uD7FF\\uF900-\\uFDCF\\uFDF0-\\uFFEF][a-zA-Z0-9-\\u00A0-\\uD7FF\\uF900-\\uFDCF\\uFDF0-\\uFFEF]+[a-zA-Z0-9\\u00A0-\\uD7FF\\uF900-\\uFDCF\\uFDF0-\\uFFEF]\\.[^\\s]{2,}|https?:\\/\\/(?:www\\.|(?!www))[a-zA-Z0-9\\u00A0-\\uD7FF\\uF900-\\uFDCF\\uFDF0-\\uFFEF]+\\.[^\\s]{2,}|www\\.[a-zA-Z0-9\\u00A0-\\uD7FF\\uF900-\\uFDCF\\uFDF0-\\uFFEF]+\\.[^\\s]{2,})"), str2));
        while (yd4Var.hasNext()) {
            k96 k96Var = (k96) yd4Var.next();
            String strGroup = k96Var.a.group();
            strGroup.getClass();
            zoVar.a("androidx.compose.foundation.text.linkContent", k96Var.b().a, k96Var.b().b + 1, strGroup);
            zoVar.c(new vn9(0L, 0L, (a84) null, (t74) null, (u74) null, (c64) null, (String) null, 0L, (ge0) null, (aha) null, (h36) null, 0L, jda.c, (o89) null, 61439), k96Var.b().a, k96Var.b().b + 1);
        }
        bp bpVarL = zoVar.l();
        return bw9.a0(bpVarL) ? lc3.a : gc1.Y(new oo2(bpVarL));
    }

    public static Collection D(Object obj) {
        if ((obj instanceof fi5) && !(obj instanceof gi5)) {
            G0(obj, "kotlin.collections.MutableCollection");
            throw null;
        }
        try {
            return (Collection) obj;
        } catch (ClassCastException e2) {
            lc5.f0(e2, fw.class.getName());
            throw e2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object D0(defpackage.ut0 r6, java.nio.ByteBuffer r7, defpackage.kt1 r8) throws java.io.EOFException {
        /*
            Method dump skipped, instruction units count: 206
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fw.D0(ut0, java.nio.ByteBuffer, kt1):java.lang.Object");
    }

    public static Map E(Object obj) {
        if ((obj instanceof fi5) && !(obj instanceof ji5)) {
            G0(obj, "kotlin.collections.MutableMap");
            throw null;
        }
        try {
            return (Map) obj;
        } catch (ClassCastException e2) {
            lc5.f0(e2, fw.class.getName());
            throw e2;
        }
    }

    public static final long E0(float f2, long j2) {
        float fMax = Math.max(0.0f, Float.intBitsToFloat((int) (j2 >> 32)) - f2);
        float fMax2 = Math.max(0.0f, Float.intBitsToFloat((int) (j2 & 4294967295L)) - f2);
        return (((long) Float.floatToRawIntBits(fMax)) << 32) | (((long) Float.floatToRawIntBits(fMax2)) & 4294967295L);
    }

    public static void F(int i2, Object obj) {
        if (obj == null || v0(i2, obj)) {
            return;
        }
        G0(obj, "kotlin.jvm.functions.Function" + i2);
        throw null;
    }

    public static char F0(char[] cArr) {
        int length = cArr.length;
        if (length == 0) {
            so9.n("Array is empty.");
            return (char) 0;
        }
        if (length == 1) {
            return cArr[0];
        }
        gp.l("Array has more than one element.");
        return (char) 0;
    }

    public static final ou6 G(ou6 ou6Var, float f2, long j2, t89 t89Var) {
        return ou6Var.e(new vm0(f2, new xk9(j2), t89Var));
    }

    public static void G0(Object obj, String str) {
        ClassCastException classCastException = new ClassCastException(dx1.h(obj == null ? "null" : obj.getClass().getName(), " cannot be cast to ", str));
        lc5.f0(classCastException, fw.class.getName());
        throw classCastException;
    }

    public static double H(double d2) {
        double dPow = Math.pow(Math.abs(d2), 0.42d);
        return ((((double) (d2 < 0.0d ? -1 : d2 == 0.0d ? 0 : 1)) * 400.0d) * dPow) / (dPow + 27.13d);
    }

    public static final void H0(Object[] objArr, HashSet hashSet) {
        objArr.getClass();
        for (Object obj : objArr) {
            hashSet.add(obj);
        }
    }

    public static ou6 I(ou6 ou6Var, yy6 yy6Var, to8 to8Var, boolean z2, uo8 uo8Var, ib4 ib4Var, int i2) {
        n91 n91VarE;
        if ((i2 & 4) != 0) {
            z2 = true;
        }
        boolean z3 = z2;
        if ((i2 & 16) != 0) {
            uo8Var = null;
        }
        uo8 uo8Var2 = uo8Var;
        if (to8Var != null) {
            n91VarE = new n91(yy6Var, to8Var, false, z3, (String) null, uo8Var2, ib4Var);
        } else if (to8Var == null) {
            n91VarE = new n91(yy6Var, (n65) null, false, z3, (String) null, uo8Var2, ib4Var);
        } else {
            lu6 lu6Var = lu6.a;
            n91VarE = yy6Var != null ? k65.a(lu6Var, yy6Var, to8Var).e(new n91(yy6Var, (n65) null, false, z3, (String) null, uo8Var2, ib4Var)) : s32.X(lu6Var, new o91(to8Var, z3, uo8Var2, ib4Var));
        }
        return ou6Var.e(n91VarE);
    }

    public static final bp2 I0(pz7 pz7Var, int i2) {
        cp2 cp2Var;
        pz7Var.getClass();
        int i3 = pz7Var.f;
        long j2 = pz7Var.a;
        int i4 = pz7Var.b;
        hhb hhbVar = pz7Var.c;
        sgb sgbVarM = oh9.m(hhbVar);
        int i5 = pz7Var.f;
        pz7 pz7Var2 = pz7Var.e;
        if (pz7Var2 != null) {
            cp2Var = new cp2(oh9.m(pz7Var2.c), c0(pz7Var2.d), pz7Var2.f == 2);
        } else {
            cp2Var = null;
        }
        int i6 = pz7Var.k;
        boolean z2 = pz7Var.j;
        cp2 cp2Var2 = cp2Var;
        long j3 = pz7Var.h;
        long j4 = pz7Var.i;
        String str = pz7Var.d;
        return new bp2(j2, i4, sgbVarM, i5, cp2Var2, i6, z2, j3, j4, i3 == 2 ? gc1.Y(jo2.a) : (i2 == 3 && (i3 == 4 || i3 == 5)) ? gc1.Y(new mo2(oh9.m(hhbVar), i3, c0(str).b)) : C0(str));
    }

    public static ou6 J(String str, ib4 ib4Var, ou6 ou6Var, boolean z2, int i2) {
        if ((i2 & 1) != 0) {
            z2 = true;
        }
        boolean z3 = z2;
        if ((i2 & 2) != 0) {
            str = null;
        }
        return ou6Var.e(new n91((yy6) null, (n65) null, true, z3, str, (uo8) null, ib4Var));
    }

    public static List J0(byte[] bArr) {
        bArr.getClass();
        int length = bArr.length;
        if (length == 0) {
            return lc3.a;
        }
        if (length == 1) {
            return gc1.Y(Byte.valueOf(bArr[0]));
        }
        ArrayList arrayList = new ArrayList(bArr.length);
        for (byte b2 : bArr) {
            arrayList.add(Byte.valueOf(b2));
        }
        return arrayList;
    }

    public static final int K(CharSequence charSequence, int i2) {
        int i3;
        charSequence.getClass();
        if (i2 < 0 || i2 >= charSequence.length()) {
            mn5.o();
            return 0;
        }
        char cCharAt = charSequence.charAt(i2);
        if (Character.isHighSurrogate(cCharAt) && (i3 = i2 + 1) < charSequence.length()) {
            if (Character.isLowSurrogate(charSequence.charAt(i3))) {
                return ((cCharAt << '\n') + r2) - 56613888;
            }
        }
        return cCharAt;
    }

    public static List K0(double[] dArr) {
        dArr.getClass();
        int length = dArr.length;
        if (length == 0) {
            return lc3.a;
        }
        if (length == 1) {
            return gc1.Y(Double.valueOf(dArr[0]));
        }
        ArrayList arrayList = new ArrayList(dArr.length);
        for (double d2 : dArr) {
            arrayList.add(Double.valueOf(d2));
        }
        return arrayList;
    }

    public static ou6 L(ou6 ou6Var, yy6 yy6Var, ib4 ib4Var, ib4 ib4Var2, int i2) {
        if ((i2 & 64) != 0) {
            ib4Var = null;
        }
        return ou6Var.e(new ne1(ib4Var2, ib4Var, (ib4) null, yy6Var, false, true));
    }

    public static List L0(float[] fArr) {
        fArr.getClass();
        int length = fArr.length;
        if (length == 0) {
            return lc3.a;
        }
        if (length == 1) {
            return gc1.Y(Float.valueOf(fArr[0]));
        }
        ArrayList arrayList = new ArrayList(fArr.length);
        for (float f2 : fArr) {
            arrayList.add(Float.valueOf(f2));
        }
        return arrayList;
    }

    public static ou6 M(ou6 ou6Var, ib4 ib4Var, ib4 ib4Var2) {
        return ou6Var.e(new ne1(ib4Var2, ib4Var, (ib4) null, (yy6) null, true, true));
    }

    public static List M0(int[] iArr) {
        iArr.getClass();
        int length = iArr.length;
        if (length == 0) {
            return lc3.a;
        }
        if (length == 1) {
            return gc1.Y(Integer.valueOf(iArr[0]));
        }
        ArrayList arrayList = new ArrayList(iArr.length);
        for (int i2 : iArr) {
            arrayList.add(Integer.valueOf(i2));
        }
        return arrayList;
    }

    public static boolean N(int i2, int[] iArr) {
        iArr.getClass();
        int length = iArr.length;
        int i3 = 0;
        while (true) {
            if (i3 >= length) {
                i3 = -1;
                break;
            }
            if (i2 == iArr[i3]) {
                break;
            }
            i3++;
        }
        return i3 >= 0;
    }

    public static List N0(long[] jArr) {
        jArr.getClass();
        int length = jArr.length;
        if (length == 0) {
            return lc3.a;
        }
        if (length == 1) {
            return gc1.Y(Long.valueOf(jArr[0]));
        }
        ArrayList arrayList = new ArrayList(jArr.length);
        for (long j2 : jArr) {
            arrayList.add(Long.valueOf(j2));
        }
        return arrayList;
    }

    public static boolean O(Object obj, Object[] objArr) {
        objArr.getClass();
        return r0(obj, objArr) >= 0;
    }

    public static List O0(Object[] objArr) {
        objArr.getClass();
        int length = objArr.length;
        if (length == 0) {
            return lc3.a;
        }
        if (length == 1) {
            return gc1.Y(objArr[0]);
        }
        List listAsList = Arrays.asList(Arrays.copyOf(objArr, objArr.length));
        listAsList.getClass();
        return listAsList;
    }

    public static boolean P(Object[] objArr, Object[] objArr2) {
        if (objArr == objArr2) {
            return true;
        }
        if (objArr.length == objArr2.length) {
            int length = objArr.length;
            for (int i2 = 0; i2 < length; i2++) {
                Object obj = objArr[i2];
                Object obj2 = objArr2[i2];
                if (obj != obj2) {
                    if (obj != null && obj2 != null) {
                        if ((obj instanceof Object[]) && (obj2 instanceof Object[])) {
                            if (!P((Object[]) obj, (Object[]) obj2)) {
                            }
                        } else if ((obj instanceof byte[]) && (obj2 instanceof byte[])) {
                            if (!Arrays.equals((byte[]) obj, (byte[]) obj2)) {
                            }
                        } else if ((obj instanceof short[]) && (obj2 instanceof short[])) {
                            if (!Arrays.equals((short[]) obj, (short[]) obj2)) {
                            }
                        } else if ((obj instanceof int[]) && (obj2 instanceof int[])) {
                            if (!Arrays.equals((int[]) obj, (int[]) obj2)) {
                            }
                        } else if ((obj instanceof long[]) && (obj2 instanceof long[])) {
                            if (!Arrays.equals((long[]) obj, (long[]) obj2)) {
                            }
                        } else if ((obj instanceof float[]) && (obj2 instanceof float[])) {
                            if (!Arrays.equals((float[]) obj, (float[]) obj2)) {
                            }
                        } else if ((obj instanceof double[]) && (obj2 instanceof double[])) {
                            if (!Arrays.equals((double[]) obj, (double[]) obj2)) {
                            }
                        } else if ((obj instanceof char[]) && (obj2 instanceof char[])) {
                            if (!Arrays.equals((char[]) obj, (char[]) obj2)) {
                            }
                        } else if ((obj instanceof boolean[]) && (obj2 instanceof boolean[])) {
                            if (!Arrays.equals((boolean[]) obj, (boolean[]) obj2)) {
                            }
                        } else if ((obj instanceof dcb) && (obj2 instanceof dcb)) {
                            if (!Arrays.equals(((dcb) obj).a, ((dcb) obj2).a)) {
                            }
                        } else if ((obj instanceof vcb) && (obj2 instanceof vcb)) {
                            if (!Arrays.equals(((vcb) obj).a, ((vcb) obj2).a)) {
                            }
                        } else if ((obj instanceof icb) && (obj2 instanceof icb)) {
                            if (!Arrays.equals(((icb) obj).a, ((icb) obj2).a)) {
                            }
                        } else if ((obj instanceof ncb) && (obj2 instanceof ncb)) {
                            if (!Arrays.equals(((ncb) obj).a, ((ncb) obj2).a)) {
                            }
                        } else if (!obj.equals(obj2)) {
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }

    public static List P0(short[] sArr) {
        sArr.getClass();
        int length = sArr.length;
        if (length == 0) {
            return lc3.a;
        }
        if (length == 1) {
            return gc1.Y(Short.valueOf(sArr[0]));
        }
        ArrayList arrayList = new ArrayList(sArr.length);
        for (short s2 : sArr) {
            arrayList.add(Short.valueOf(s2));
        }
        return arrayList;
    }

    public static void Q(int i2, int i3, int i4, int[] iArr, int[] iArr2) {
        iArr.getClass();
        iArr2.getClass();
        System.arraycopy(iArr, i3, iArr2, i2, i4 - i3);
    }

    public static Set Q0(Object[] objArr) {
        objArr.getClass();
        int length = objArr.length;
        if (length == 0) {
            return sc3.a;
        }
        if (length == 1) {
            return e11.d0(objArr[0]);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(y86.O(objArr.length));
        H0(objArr, linkedHashSet);
        return linkedHashSet;
    }

    public static void R(byte[] bArr, int i2, byte[] bArr2, int i3, int i4) {
        bArr.getClass();
        bArr2.getClass();
        System.arraycopy(bArr, i3, bArr2, i2, i4 - i3);
    }

    public static final ou6 R0(boolean z2, yy6 yy6Var, boolean z3, uo8 uo8Var, kb4 kb4Var) {
        return hh6.b.e(new zva(z2, yy6Var, z3, uo8Var, kb4Var));
    }

    public static void S(char[] cArr, char[] cArr2, int i2, int i3, int i4) {
        cArr.getClass();
        cArr2.getClass();
        System.arraycopy(cArr, i3, cArr2, i2, i4 - i3);
    }

    public static final ou6 S0(dwa dwaVar, to8 to8Var, boolean z2, uo8 uo8Var, ib4 ib4Var) {
        if (to8Var != null) {
            return new r6b(dwaVar, (yy6) null, to8Var, z2, uo8Var, ib4Var);
        }
        if (to8Var == null) {
            return new r6b(dwaVar, (yy6) null, (n65) null, z2, uo8Var, ib4Var);
        }
        return s32.X(lu6.a, new awa(to8Var, dwaVar, z2, uo8Var, ib4Var));
    }

    public static void T(long[] jArr, long[] jArr2, int i2, int i3, int i4) {
        jArr.getClass();
        jArr2.getClass();
        System.arraycopy(jArr, i3, jArr2, i2, i4 - i3);
    }

    public static double T0(double d2) {
        double d3 = d2 / 100.0d;
        return (d3 <= 0.0031308d ? d3 * 12.92d : (Math.pow(d3, 0.4166666666666667d) * 1.055d) - 0.055d) * 255.0d;
    }

    public static void U(Object[] objArr, int i2, Object[] objArr2, int i3, int i4) {
        objArr.getClass();
        objArr2.getClass();
        System.arraycopy(objArr, i3, objArr2, i2, i4 - i3);
    }

    public static /* synthetic */ void V(int i2, int i3, int i4, int[] iArr, int[] iArr2) {
        if ((i4 & 2) != 0) {
            i2 = 0;
        }
        if ((i4 & 8) != 0) {
            i3 = iArr.length;
        }
        Q(i2, 0, i3, iArr, iArr2);
    }

    public static /* synthetic */ void W(byte[] bArr, byte[] bArr2, int i2, int i3, int i4, int i5) {
        if ((i5 & 2) != 0) {
            i2 = 0;
        }
        if ((i5 & 4) != 0) {
            i3 = 0;
        }
        if ((i5 & 8) != 0) {
            i4 = bArr.length;
        }
        R(bArr, i2, bArr2, i3, i4);
    }

    public static /* synthetic */ void X(Object[] objArr, int i2, Object[] objArr2, int i3, int i4) {
        if ((i4 & 4) != 0) {
            i2 = 0;
        }
        if ((i4 & 8) != 0) {
            i3 = objArr.length;
        }
        U(objArr, 0, objArr2, i2, i3);
    }

    public static byte[] Y(byte[] bArr, int i2, int i3) {
        bArr.getClass();
        a0(i3, bArr.length);
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, i2, i3);
        bArrCopyOfRange.getClass();
        return bArrCopyOfRange;
    }

    public static Object[] Z(Object[] objArr, int i2, int i3) {
        objArr.getClass();
        a0(i3, objArr.length);
        Object[] objArrCopyOfRange = Arrays.copyOfRange(objArr, i2, i3);
        objArrCopyOfRange.getClass();
        return objArrCopyOfRange;
    }

    public static final void a(dd4 dd4Var, int i2) {
        dd4Var.h0(1112542526);
        int i3 = i2 | 6;
        int i4 = 0;
        if (dd4Var.V(i3 & 1, (i3 & 3) != 2)) {
            pj4 pj4VarA = e36.a(dd4Var);
            if (pj4VarA == null) {
                gp.j("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
            zt ztVar = (zt) ((qtb) qx1.N(ug8.a(zt.class), pj4VarA.f(), null, pj4VarA instanceof pj4 ? pj4VarA.d() : v02.b, ek5.a(dd4Var), null));
            a07 a07VarB = bx1.B(ztVar.t, dd4Var);
            a07 a07VarB2 = bx1.B(ztVar.u, dd4Var);
            float f2 = oh9.h(dd4Var).a;
            if (x13.b(f2, 0.0f) < 0) {
                gp.l("Dp value cannot be negative");
                return;
            }
            k0c k0cVar = x13.b(f2, 600.0f) < 0 ? k0c.a : x13.b(f2, 960.0f) < 0 ? k0c.b : x13.b(f2, 1024.0f) < 0 ? k0c.c : x13.b(f2, 1366.0f) < 0 ? k0c.d : k0c.e;
            Object objJ = dd4Var.j(o16.a);
            zi1 zi1Var = objJ instanceof zi1 ? (zi1) objJ : null;
            if (zi1Var == null) {
                gp.j("No ComponentActivity provided of composables.");
                return;
            }
            Object objQ = dd4Var.Q();
            Object obj = vl1.a;
            if (objQ == obj) {
                objQ = dk9.x(n6a.a);
                dd4Var.p0(objQ);
            }
            a07 a07Var = (a07) objQ;
            if (((m6a) a07Var.getValue()).a == null) {
                dd4Var.f0(-1723099833);
                Window window = zi1Var.getWindow();
                window.getClass();
                vj vjVar = new vj(window);
                boolean zH = dd4Var.h(zi1Var) | dd4Var.h(vjVar);
                Object objQ2 = dd4Var.Q();
                if (zH || objQ2 == obj) {
                    objQ2 = new e67(21, zi1Var, vjVar);
                    dd4Var.p0(objQ2);
                }
                lc5.H((ib4) objQ2, dd4Var);
                a07Var.setValue(new m6a(vjVar));
                dd4Var.q(false);
            } else {
                dd4Var.f0(-1722578010);
                dd4Var.q(false);
            }
            m6a m6aVar = (m6a) a07Var.getValue();
            p58 p58VarA = utb.b.a(e36.a(dd4Var));
            p58 p58VarA2 = xzb.a.a(k0cVar);
            p58 p58VarA3 = b73.b.a(m6aVar);
            ur9 ur9Var = xm1.o;
            List listP0 = bw9.p0(((tt) a07VarB.getValue()).b, new String[]{","});
            ArrayList arrayList = new ArrayList(listP0.size());
            int size = listP0.size();
            for (int i5 = 0; i5 < size; i5++) {
                arrayList.add(bw9.B0((String) listP0.get(i5)).toString());
            }
            ArrayList arrayList2 = new ArrayList(arrayList.size());
            int size2 = arrayList.size();
            for (int i6 = 0; i6 < size2; i6++) {
                arrayList2.add(new g36((String) arrayList.get(i6)));
            }
            jv3.f(new p58[]{p58VarA, p58VarA2, p58VarA3, ur9Var.a(new h36(arrayList2))}, jf0.G(918581374, new lt(i4, a07VarB, a07VarB2), dd4Var), dd4Var, 56);
        } else {
            dd4Var.Y();
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new k7(i2, 3);
        }
    }

    public static final void a0(int i2, int i3) {
        if (i2 <= i3) {
            return;
        }
        k27.m(xv5.j(i2, i3, "toIndex (", ") is greater than size (", ")."));
    }

    public static final void b(dsa dsaVar, c73 c73Var, dd4 dd4Var, int i2) {
        dd4Var.h0(1388595848);
        int i3 = 4;
        int i4 = (dd4Var.f(dsaVar) ? 4 : 2) | i2 | (dd4Var.f(c73Var) ? 32 : 16);
        if (dd4Var.V(i4 & 1, (i4 & 19) != 18)) {
            ev8 ev8VarA = ek5.a(dd4Var);
            boolean zF = dd4Var.f((Object) null) | dd4Var.f(ev8VarA);
            Object objQ = dd4Var.Q();
            fu6 fu6Var = vl1.a;
            if (zF || objQ == fu6Var) {
                objQ = ev8VarA.d(ug8.a(b15.class), null);
                dd4Var.p0(objQ);
            }
            b15 b15Var = (b15) objQ;
            ur9 ur9Var = z14.a;
            Object objQ2 = dd4Var.Q();
            Object obj = objQ2;
            if (objQ2 == fu6Var) {
                u14 u14Var = new u14();
                u14Var.a = new hk9();
                dd4Var.p0(u14Var);
                obj = u14Var;
            }
            u14 u14Var2 = (u14) obj;
            e37[] e37VarArr = {s76.INSTANCE};
            Object[] objArr = new Object[0];
            me3 me3Var = new me3(new f37(), 1);
            boolean zH = dd4Var.h(e37VarArr);
            Object objQ3 = dd4Var.Q();
            if (zH || objQ3 == fu6Var) {
                objQ3 = new wn6(e37VarArr, 19);
                dd4Var.p0(objQ3);
            }
            zs8 zs8Var = zs8.c;
            u27 u27Var = (u27) ww1.c0(Arrays.copyOf(objArr, 0), new rt8(new b18(i3, me3Var, zs8Var), new q57(28, me3Var, zs8Var)), (ib4) objQ3, dd4Var, 384);
            boolean zF2 = dd4Var.f(u27Var);
            Object objQ4 = dd4Var.Q();
            if (zF2 || objQ4 == fu6Var) {
                objQ4 = new t27(u27Var);
                dd4Var.p0(objQ4);
            }
            t27 t27Var = (t27) objQ4;
            Object objQ5 = dd4Var.Q();
            if (objQ5 == fu6Var) {
                objQ5 = new uf2();
                dd4Var.p0(objQ5);
            }
            uf2 uf2Var = (uf2) objQ5;
            Context baseContext = (Context) dd4Var.j(he.b);
            Object objQ6 = dd4Var.Q();
            if (objQ6 == fu6Var) {
                while (baseContext instanceof ContextWrapper) {
                    if (baseContext instanceof Activity) {
                        objQ6 = new xi((Activity) baseContext);
                        dd4Var.p0(objQ6);
                    } else {
                        baseContext = ((ContextWrapper) baseContext).getBaseContext();
                        baseContext.getClass();
                    }
                }
                gp.j("Permissions should be called in the context of an Activity");
                return;
            }
            xi xiVar = (xi) objQ6;
            ur9 ur9Var2 = zma.a;
            Object objQ7 = dd4Var.Q();
            if (objQ7 == fu6Var) {
                objQ7 = new rla();
                dd4Var.p0(objQ7);
            }
            rla rlaVar = (rla) objQ7;
            vp9 vp9Var = vp9.e;
            Object objQ8 = dd4Var.Q();
            if (objQ8 == fu6Var) {
                objQ8 = lc5.Z(dd4Var);
                dd4Var.p0(objQ8);
            }
            vx1 vx1Var = (vx1) objQ8;
            Object objQ9 = dd4Var.Q();
            if (objQ9 == fu6Var) {
                objQ9 = new cq9(vx1Var, vp9Var);
                dd4Var.p0(objQ9);
            }
            cq9 cq9Var = (cq9) objQ9;
            boolean zF3 = dd4Var.f(cq9Var);
            Object objQ10 = dd4Var.Q();
            if (zF3 || objQ10 == fu6Var) {
                objQ10 = new m8(cq9Var);
                dd4Var.p0(objQ10);
            }
            m8 m8Var = (m8) objQ10;
            Object objQ11 = dd4Var.Q();
            if (objQ11 == fu6Var) {
                objQ11 = lc5.Z(dd4Var);
                dd4Var.p0(objQ11);
            }
            vx1 vx1Var2 = (vx1) objQ11;
            Object objQ12 = dd4Var.Q();
            if (objQ12 == fu6Var) {
                objQ12 = new fq9(vx1Var2);
                dd4Var.p0(objQ12);
            }
            fq9 fq9Var = (fq9) objQ12;
            boolean zF4 = dd4Var.f(fq9Var);
            Object objQ13 = dd4Var.Q();
            if (zF4 || objQ13 == fu6Var) {
                objQ13 = new lva(fq9Var);
                dd4Var.p0(objQ13);
            }
            jv3.f(new p58[]{z14.a.a(u14Var2), w05.a.a(b15Var), gv8.a.a(xiVar), oq1.a.a(new lc1(((q96) dd4Var.j(s96.a)).a.q)), zma.a.a(rlaVar), mb0.a.a(uf2Var), a9.a.a(m8Var), nva.a.a((lva) objQ13)}, jf0.G(-1324421688, new bpb(dsaVar, uf2Var, c73Var, t27Var, rlaVar, u14Var2, cq9Var, fq9Var), dd4Var), dd4Var, 56);
        } else {
            dd4Var.Y();
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new il6(dsaVar, c73Var, i2, 5);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x00db -> B:46:0x00df). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b0(defpackage.ut0 r7, java.nio.channels.WritableByteChannel r8, long r9, defpackage.kt1 r11) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 265
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fw.b0(ut0, java.nio.channels.WritableByteChannel, long, kt1):java.lang.Object");
    }

    public static final void c(boolean z2, xr xrVar, String str, float f2, ou6 ou6Var, dd4 dd4Var, int i2) {
        ou6 ou6Var2;
        String str2;
        float f3;
        dd4 dd4Var2;
        ye8 ye8VarU;
        pt ptVar;
        ou6 ou6Var3;
        dd4Var.h0(-1359731369);
        int i3 = i2 | (dd4Var.g(z2) ? 4 : 2) | (dd4Var.d(xrVar.ordinal()) ? 32 : 16) | (dd4Var.f(str) ? 256 : Token.CASE) | (dd4Var.c(f2) ? 2048 : 1024);
        if (!dd4Var.V(i3 & 1, (i3 & 9363) != 9362)) {
            ou6Var2 = ou6Var;
            str2 = str;
            f3 = f2;
            dd4Var2 = dd4Var;
            dd4Var2.Y();
        } else if (!z2) {
            str2 = str;
            f3 = f2;
            switch (xrVar.ordinal()) {
                case 1:
                    ou6Var2 = ou6Var;
                    dd4Var2 = dd4Var;
                    dd4Var2.f0(-1920377647);
                    if (bw9.a0(str2)) {
                        dd4Var2.f0(-1920055061);
                        dd4Var2.q(false);
                    } else {
                        dd4Var2.f0(-1920331829);
                        w05.a(new nl8(str2), ra1.d, false, null, null, yb0.I(ou6Var2, wx1.P(f3, 0.0f, 1.0f)), null, dd4Var, 48, 444);
                        dd4Var2 = dd4Var;
                        dd4Var2.q(false);
                    }
                    dd4Var2.q(false);
                    break;
                case 2:
                    ou6Var2 = ou6Var;
                    dd4Var2 = dd4Var;
                    dd4Var2.f0(-1031767107);
                    m79.d(0.0f, 6, dd4Var2, ou6Var2, false);
                    dd4Var2.q(false);
                    break;
                case 3:
                    dd4Var2 = dd4Var;
                    dd4Var2.f0(-1031764870);
                    m79.m(ou6Var, false, 0.0f, dd4Var2, 6, 6);
                    ou6Var2 = ou6Var;
                    dd4Var2.q(false);
                    break;
                case 4:
                    dd4Var2 = dd4Var;
                    dd4Var2.f0(-1031762712);
                    fz1.t(tg9.c, false, 0.0f, dd4Var2, 6, 6);
                    dd4Var2.q(false);
                    ou6Var2 = ou6Var;
                    break;
                case 5:
                    dd4Var2 = dd4Var;
                    dd4Var2.f0(-1031759969);
                    fe.x(ou6Var, false, 0.0f, dd4Var2, 6, 6);
                    dd4Var2.q(false);
                    ou6Var2 = ou6Var;
                    break;
                case 6:
                    ou6Var3 = ou6Var;
                    dd4Var2 = dd4Var;
                    dd4Var2.f0(-1031757637);
                    kf0.q(0.0f, 6, dd4Var2, ou6Var3, false);
                    dd4Var2.q(false);
                    ou6Var2 = ou6Var3;
                    break;
                case 7:
                    dd4Var2 = dd4Var;
                    dd4Var2.f0(-1031755396);
                    ou6Var3 = ou6Var;
                    x(ou6Var3, false, 0.0f, dd4Var2, 6, 6);
                    dd4Var2.q(false);
                    ou6Var2 = ou6Var3;
                    break;
                case 8:
                    dd4Var2 = dd4Var;
                    dd4Var2.f0(-1031753190);
                    jv3.l(ou6Var, false, 0.0f, dd4Var2, 6, 6);
                    dd4Var2.q(false);
                    ou6Var2 = ou6Var;
                    break;
                case 9:
                    dd4Var.f0(-1031751013);
                    dd4Var2 = dd4Var;
                    lc5.I(ou6Var, false, 0.0f, dd4Var2, 6, 6);
                    dd4Var2.q(false);
                    ou6Var2 = ou6Var;
                    break;
                default:
                    dd4Var.f0(-1919457815);
                    dd4Var.q(false);
                    ou6Var2 = ou6Var;
                    dd4Var2 = dd4Var;
                    break;
            }
        } else {
            ye8VarU = dd4Var.u();
            if (ye8VarU != null) {
                ptVar = new pt(z2, xrVar, str, f2, ou6Var, i2, 0);
                ye8VarU.d = ptVar;
            }
            return;
        }
        ye8VarU = dd4Var2.u();
        if (ye8VarU != null) {
            ptVar = new pt(z2, xrVar, str2, f3, ou6Var2, i2, 1);
            ye8VarU.d = ptVar;
        }
    }

    public static final bp c0(String str) {
        zo zoVar = new zo();
        List listC0 = C0(str);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listC0) {
            if (obj instanceof oo2) {
                arrayList.add(obj);
            }
        }
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj2 = arrayList.get(i2);
            i2++;
            zoVar.d(((oo2) obj2).a);
        }
        return zoVar.l();
    }

    public static final void d(tx txVar, ou6 ou6Var, kb4 kb4Var, kb4 kb4Var2, f9 f9Var, sr1 sr1Var, ac1 ac1Var, cw8 cw8Var, dd4 dd4Var, int i2, int i3) {
        int i4;
        a25 a25Var;
        kb4 kb4Var3;
        o7c o7cVar;
        float f2;
        a25 a25Var2;
        boolean z2;
        dd4 dd4Var2;
        b15 b15Var = txVar.c;
        bz9 bz9Var = ac1Var.b;
        dd4Var.h0(2116747689);
        int i5 = i2 | (dd4Var.f(txVar) ? 4 : 2) | (dd4Var.h(kb4Var) ? 2048 : 1024) | (dd4Var.h(kb4Var2) ? 16384 : 8192) | (dd4Var.f(f9Var) ? 131072 : Parser.ARGC_LIMIT) | (dd4Var.c(1.0f) ? 8388608 : 4194304) | (dd4Var.f((Object) null) ? 67108864 : 33554432) | (dd4Var.d(1) ? 536870912 : 268435456);
        if ((i3 & 6) == 0) {
            i4 = i3 | (dd4Var.f(ac1Var) ? 4 : 2);
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= dd4Var.f(cw8Var) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i4 |= dd4Var.h((Object) null) ? 256 : Token.CASE;
        }
        if ((i3 & 3072) == 0) {
            i4 |= dd4Var.h((Object) null) ? 2048 : 1024;
        }
        if ((i5 & 306783379) == 306783378 && (i4 & 1171) == 1170 && dd4Var.F()) {
            dd4Var.Y();
            dd4Var2 = dd4Var;
        } else {
            o7c o7cVar2 = ac1Var.a;
            o7cVar2.j(sr1Var);
            o7cVar2.h(f9Var);
            o7cVar2.l((zm5) dd4Var.j(xm1.n));
            boolean zF = dd4Var.f(b15Var);
            Object objQ = dd4Var.Q();
            Object obj = vl1.a;
            if (zF || objQ == obj) {
                objQ = new wb1(b15Var);
                dd4Var.p0(objQ);
            }
            bz9Var.d((wb1) objQ);
            Object objQ2 = dd4Var.Q();
            if (objQ2 == obj) {
                objQ2 = dk9.x((Object) null);
                dd4Var.p0(objQ2);
            }
            a07 a07Var = (a07) objQ2;
            ou6Var.getClass();
            ou6 ou6VarE = (o7cVar2.B.h() & 16) == 0 ? ou6Var.e(new dw6(o7cVar2)) : ou6Var;
            int i6 = i4;
            ha6 ha6VarD = pn0.d(bv4.b, false);
            int iT = fe.T(dd4Var);
            lr7 lr7VarL = dd4Var.l();
            ou6 ou6VarL0 = s32.L0(dd4Var, ou6VarE);
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
            jm jmVar = ll1.g;
            if (dd4Var.S || !lc5.Q(dd4Var.Q(), Integer.valueOf(iT))) {
                dd4Var.p0(Integer.valueOf(iT));
                dd4Var.b(Integer.valueOf(iT), jmVar);
            }
            un9.s(ll1.d, dd4Var, ou6VarL0);
            ur9 ur9Var = he.b;
            Context context = (Context) dd4Var.j(ur9Var);
            Object objQ3 = dd4Var.Q();
            if (objQ3 == obj) {
                objQ3 = lc5.Z(dd4Var);
                dd4Var.p0(objQ3);
            }
            vx1 vx1Var = (vx1) objQ3;
            Object obj2 = txVar.a;
            dd4Var.f0(-2017296513);
            if (obj2 instanceof a25) {
                dd4Var.f0(-1930960060);
                a25Var = (a25) obj2;
                if (a25Var.s.i != null) {
                    dd4Var.f0(-1930920008);
                    dd4Var.q(false);
                    dd4Var.q(false);
                    dd4Var.q(false);
                } else {
                    dd4Var.f0(-1930871834);
                    zg9 zg9VarQ = ah1.Q(sr1Var, dd4Var);
                    boolean zF2 = dd4Var.f(a25Var) | dd4Var.f(zg9VarQ);
                    Object objQ4 = dd4Var.Q();
                    if (zF2 || objQ4 == obj) {
                        w15 w15VarA = a25.a(a25Var);
                        w15VarA.n = zg9VarQ;
                        objQ4 = w15VarA.a();
                        dd4Var.p0(objQ4);
                    }
                    a25Var = (a25) objQ4;
                    tw2.x(dd4Var, false, false, false);
                }
            } else {
                dd4Var.f0(-1930613666);
                Context context2 = (Context) dd4Var.j(ur9Var);
                zg9 zg9VarQ2 = ah1.Q(sr1Var, dd4Var);
                boolean zF3 = dd4Var.f(context2) | dd4Var.f(obj2) | dd4Var.f(zg9VarQ2);
                Object objQ5 = dd4Var.Q();
                if (zF3 || objQ5 == obj) {
                    w15 w15Var = new w15(context2);
                    w15Var.c = obj2;
                    w15Var.n = zg9VarQ2;
                    objQ5 = w15Var.a();
                    dd4Var.p0(objQ5);
                }
                a25Var = (a25) objQ5;
                dd4Var.q(false);
                dd4Var.q(false);
            }
            a25 a25Var3 = a25Var;
            boolean zH = dd4Var.h(vx1Var) | dd4Var.h(context) | ((i5 & 14) == 4) | ((i6 & 14) == 4) | ((i5 & 57344) == 16384);
            Object objQ6 = dd4Var.Q();
            if (zH || objQ6 == obj) {
                kb4Var3 = null;
                o7cVar = o7cVar2;
                f2 = 1.0f;
                a25Var2 = a25Var3;
                z2 = true;
                pm0 pm0Var = new pm0(vx1Var, kb4Var2, context, txVar, ac1Var, a07Var, 2);
                dd4Var.p0(pm0Var);
                objQ6 = pm0Var;
            } else {
                kb4Var3 = null;
                o7cVar = o7cVar2;
                f2 = 1.0f;
                a25Var2 = a25Var3;
                z2 = true;
            }
            int i7 = i5 >> 6;
            a25 a25Var4 = a25Var2;
            px pxVarG0 = fe.g0(a25Var4, b15Var, kb4Var, (kb4) objQ6, sr1Var, dd4Var, 0);
            zn0 zn0Var = zn0.a;
            ou6 ou6VarB = zn0Var.b();
            zg9 zg9Var = a25Var4.s.i;
            if (zg9Var != null && (zg9Var instanceof xp1)) {
                ou6VarB = m79.J(ou6VarB, new f0(zg9Var, 17));
            }
            ou6VarB.getClass();
            ou6 ou6VarE2 = ou6VarB.e(new r6c(o7cVar, z2, kb4Var3, kb4Var3));
            ou6VarE2.getClass();
            p7c.a(pxVarG0, xg9.q(ou6VarE2, o7cVar, false), f9Var, sr1Var, f2, false, true, dd4Var, (i7 & 7168) | 113270832 | (458752 & i7) | (3670016 & i7));
            dd4Var2 = dd4Var;
            ou6 ou6VarQ = xg9.q(zn0Var.b(), o7cVar, z2);
            ou6VarQ.getClass();
            bz9Var.getClass();
            pn0.a(ou6VarQ.e(new qy9(o7cVar, bz9Var)), dd4Var2, 0);
            if (cw8Var != null) {
                dd4Var2.f0(750618999);
                pn0.a(zn0Var.b().e(new c6c(o7cVar, cw8Var)), dd4Var2, 0);
                dd4Var2.q(false);
            } else {
                dd4Var2.f0(750784291);
                dd4Var2.q(false);
            }
            dd4Var2.q(z2);
        }
        ye8 ye8VarU = dd4Var2.u();
        if (ye8VarU != null) {
            ye8VarU.d = new xb1(txVar, ou6Var, kb4Var, kb4Var2, f9Var, sr1Var, ac1Var, cw8Var, i2, i3);
        }
    }

    public static void d0(int i2, int i3, Object obj, Object[] objArr) {
        objArr.getClass();
        Arrays.fill(objArr, i2, i3, obj);
    }

    public static final oe e(String str) {
        return new oe(e11.d0(str));
    }

    public static void e0(int i2, int i3, int i4, int[] iArr) {
        if ((i4 & 4) != 0) {
            i3 = iArr.length;
        }
        iArr.getClass();
        Arrays.fill(iArr, 0, i3, i2);
    }

    public static final void f(final wq2 wq2Var, final pj7 pj7Var, final kb4 kb4Var, final yb4 yb4Var, final yb4 yb4Var2, final kb4 kb4Var2, final ib4 ib4Var, final ib4 ib4Var2, final ib4 ib4Var3, final kb4 kb4Var3, final kb4 kb4Var4, dd4 dd4Var, final int i2, final int i3) {
        int i4;
        int i5;
        int i6;
        ou6 ou6Var;
        List list;
        Object obj;
        a07 a07Var;
        wq5 wq5Var;
        int i7;
        Boolean bool;
        g78 g78Var;
        boolean z2;
        dd4Var.h0(800650478);
        if ((i2 & 6) == 0) {
            i4 = (dd4Var.f(wq2Var) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= dd4Var.f(pj7Var) ? 32 : 16;
        }
        int i8 = i2 & 384;
        ou6 ou6Var2 = lu6.a;
        if (i8 == 0) {
            i4 |= dd4Var.f(ou6Var2) ? 256 : Token.CASE;
        }
        if ((i2 & 3072) == 0) {
            i4 |= dd4Var.h(kb4Var) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i4 |= dd4Var.h(yb4Var) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i4 |= dd4Var.h(yb4Var2) ? 131072 : Parser.ARGC_LIMIT;
        }
        if ((1572864 & i2) == 0) {
            i4 |= dd4Var.h(kb4Var2) ? 1048576 : 524288;
        }
        if ((12582912 & i2) == 0) {
            i4 |= dd4Var.h(ib4Var) ? 8388608 : 4194304;
        }
        if ((100663296 & i2) == 0) {
            i4 |= dd4Var.h(ib4Var2) ? 67108864 : 33554432;
        }
        if ((i2 & 805306368) == 0) {
            i4 |= dd4Var.h(ib4Var3) ? 536870912 : 268435456;
        }
        if ((i3 & 6) == 0) {
            i5 = i3 | (dd4Var.h(kb4Var3) ? 4 : 2);
        } else {
            i5 = i3;
        }
        if ((i3 & 48) == 0) {
            i5 |= dd4Var.h(kb4Var4) ? 32 : 16;
        }
        int i9 = i5;
        if (dd4Var.V(i4 & 1, ((306783379 & i4) == 306783378 && (i9 & 19) == 18) ? false : true)) {
            g78 g78VarB = z68.b(dd4Var);
            wq5 wq5VarA = yq5.a(dd4Var);
            Object[] objArr = new Object[0];
            Object objQ = dd4Var.Q();
            Object obj2 = vl1.a;
            if (objQ == obj2) {
                objQ = new dh1(22);
                dd4Var.p0(objQ);
            }
            a07 a07Var2 = (a07) ww1.b0(objArr, (ib4) objQ, dd4Var, 48);
            Object[] objArr2 = new Object[0];
            Object objQ2 = dd4Var.Q();
            if (objQ2 == obj2) {
                i6 = i4;
                objQ2 = new dh1(23);
                dd4Var.p0(objQ2);
            } else {
                i6 = i4;
            }
            final a07 a07VarA0 = ww1.a0(objArr2, (ib4) objQ2, dd4Var, 384);
            Object objQ3 = dd4Var.Q();
            jt1 jt1Var = null;
            if (objQ3 == obj2) {
                objQ3 = dk9.x((Object) null);
                dd4Var.p0(objQ3);
            }
            final a07 a07Var3 = (a07) objQ3;
            List list2 = wq2Var.d;
            Boolean bool2 = (Boolean) a07Var2.getValue();
            bool2.getClass();
            boolean zF = dd4Var.f(a07VarA0) | ((i6 & 14) == 4) | dd4Var.f(a07Var2);
            Object objQ4 = dd4Var.Q();
            if (zF || objQ4 == obj2) {
                ou6Var = ou6Var2;
                list = list2;
                obj = obj2;
                a07Var = a07Var2;
                wq5Var = wq5VarA;
                i7 = i6;
                bool = bool2;
                g78Var = g78VarB;
                z2 = false;
                qq2 qq2Var = new qq2(a07VarA0, wq2Var, a07Var, a07Var3, null, 0);
                dd4Var.p0(qq2Var);
                objQ4 = qq2Var;
            } else {
                ou6Var = ou6Var2;
                list = list2;
                bool = bool2;
                obj = obj2;
                a07Var = a07Var2;
                wq5Var = wq5VarA;
                i7 = i6;
                g78Var = g78VarB;
                z2 = false;
            }
            lc5.v(list, bool, (yb4) objQ4, dd4Var);
            final a07 a07Var4 = a07Var;
            final ho2 ho2Var = wq2Var.i;
            ho2Var.getClass();
            float fK0 = ((pn2) dd4Var.j(xm1.h)).k0(200.0f);
            boolean zF2 = dd4Var.f(wq5Var) | dd4Var.c(fK0);
            if ((i9 & 14) == 4) {
                z2 = true;
            }
            boolean z3 = zF2 | z2;
            Object objQ5 = dd4Var.Q();
            if (z3 || objQ5 == obj) {
                objQ5 = new sq2(kb4Var3, wq5Var, fK0, jt1Var, 0);
                dd4Var.p0(objQ5);
            }
            lc5.u((yb4) objQ5, dd4Var, wq5Var);
            Object objQ6 = dd4Var.Q();
            if (objQ6 == obj) {
                objQ6 = new mk9();
                dd4Var.p0(objQ6);
            }
            final mk9 mk9Var = (mk9) objQ6;
            boolean z4 = wq2Var.a;
            rj1 rj1VarG = jf0.G(48016391, new vp2(g78Var, wq2Var, pj7Var, 1), dd4Var);
            final wq5 wq5Var2 = wq5Var;
            rj1 rj1VarG2 = jf0.G(-1466686646, new zb4() { // from class: xp2
                @Override // defpackage.zb4
                public final Object c(Object obj3, Object obj4, Object obj5) {
                    dd4 dd4Var2 = (dd4) obj4;
                    int iIntValue = ((Integer) obj5).intValue();
                    ((yn0) obj3).getClass();
                    if (dd4Var2.V(iIntValue & 1, (iIntValue & 17) != 16)) {
                        ha6 ha6VarD = pn0.d(bv4.b, false);
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
                        un9.s(ll1.f, dd4Var2, ha6VarD);
                        un9.s(ll1.e, dd4Var2, lr7VarL);
                        un9.s(ll1.g, dd4Var2, Integer.valueOf(iHashCode));
                        un9.r(dd4Var2, ll1.h);
                        un9.s(ll1.d, dd4Var2, ou6VarL0);
                        szb szbVarW = yib.w(yib.e(dd4Var2, 14), gjb.q(0.0f, 0.0f, 0.0f, 120.0f, 7));
                        yh4 yh4Var = new yh4(160.0f);
                        px3 px3Var = tg9.c;
                        szb szbVarW2 = yib.w(szbVarW, gjb.q(0.0f, 0.0f, 4.0f, 0.0f, 11));
                        final pj7 pj7Var2 = pj7Var;
                        szb szbVarW3 = yib.w(szbVarW2, pj7Var2);
                        final ho2 ho2Var2 = ho2Var;
                        boolean zH = dd4Var2.h(ho2Var2);
                        final wq2 wq2Var2 = wq2Var;
                        boolean zF3 = zH | dd4Var2.f(wq2Var2) | dd4Var2.f(pj7Var2);
                        final kb4 kb4Var5 = kb4Var4;
                        boolean zF4 = zF3 | dd4Var2.f(kb4Var5);
                        final yb4 yb4Var3 = yb4Var;
                        boolean zF5 = zF4 | dd4Var2.f(yb4Var3);
                        final kb4 kb4Var6 = kb4Var;
                        boolean zF6 = zF5 | dd4Var2.f(kb4Var6);
                        final yb4 yb4Var4 = yb4Var2;
                        boolean zF7 = zF6 | dd4Var2.f(yb4Var4);
                        final a07 a07Var5 = a07VarA0;
                        boolean zF8 = zF7 | dd4Var2.f(a07Var5);
                        final a07 a07Var6 = a07Var4;
                        boolean zF9 = zF8 | dd4Var2.f(a07Var6);
                        final ib4 ib4Var4 = ib4Var2;
                        boolean zF10 = zF9 | dd4Var2.f(ib4Var4);
                        final kb4 kb4Var7 = kb4Var2;
                        boolean zF11 = zF10 | dd4Var2.f(kb4Var7);
                        final ib4 ib4Var5 = ib4Var;
                        boolean zF12 = zF11 | dd4Var2.f(ib4Var5);
                        Object objQ7 = dd4Var2.Q();
                        if (zF12 || objQ7 == vl1.a) {
                            final mk9 mk9Var2 = mk9Var;
                            final a07 a07Var7 = a07Var3;
                            kb4 kb4Var8 = new kb4() { // from class: cq2
                                @Override // defpackage.kb4
                                public final Object invoke(Object obj6) {
                                    aq5 aq5Var = (aq5) obj6;
                                    aq5Var.getClass();
                                    oc2 oc2Var = new oc2(24);
                                    ho2 ho2Var3 = ho2Var2;
                                    wq2 wq2Var3 = wq2Var2;
                                    int i10 = 1;
                                    aq5.b0(aq5Var, "header", oc2Var, new rj1(new dq2(ho2Var3, wq2Var3, pj7Var2, kb4Var5, 0), true, 1911624076), 4);
                                    List list3 = ho2Var3.p;
                                    List list4 = ho2Var3.s;
                                    List list5 = ho2Var3.q;
                                    List list6 = ho2Var3.r;
                                    boolean zIsEmpty = list3.isEmpty();
                                    yb4 yb4Var5 = yb4Var3;
                                    if (!zIsEmpty) {
                                        lx1.h0(aq5Var, ho2Var3.p, yb4Var5);
                                    }
                                    int i11 = 0;
                                    if (ho2Var3.f.length() > 0) {
                                        aq5.b0(aq5Var, "info", new oc2(25), new rj1(new eq2(ho2Var3, i11), true, 2079790814), 4);
                                    }
                                    if (ho2Var3.g.length() > 0) {
                                        aq5.b0(aq5Var, "introduction", new oc2(26), new rj1(new eq2(ho2Var3, i10), true, -1976310049), 4);
                                    }
                                    if (!list6.isEmpty()) {
                                        aq5Var.c0(list6.size(), (kb4) null, new bq0(3, new kx1(9, (byte) 0), list6), new g7(16, list6), new rj1(new uq2(0, list6), true, -1117249557));
                                    }
                                    if (!list5.isEmpty()) {
                                        String str = wq2Var3.b;
                                        str.getClass();
                                        hn9.t(aq5Var, str, list5, kb4Var6, yb4Var5);
                                    }
                                    if (!list4.isEmpty()) {
                                        String str2 = wq2Var3.b;
                                        str2.getClass();
                                        ql9.D(aq5Var, str2, list4, new dh1(1), yb4Var4);
                                    }
                                    aq5.b0(aq5Var, (Object) null, new oc2(27), t1c.h, 5);
                                    a07 a07Var8 = a07Var5;
                                    wga wgaVar = (wga) a07Var8.getValue();
                                    int i12 = wq2Var3.e;
                                    int i13 = wq2Var3.i.k;
                                    List list7 = (List) a07Var7.getValue();
                                    a07 a07Var9 = a07Var6;
                                    boolean zBooleanValue = ((Boolean) a07Var9.getValue()).booleanValue();
                                    boolean z5 = wq2Var3.f;
                                    boolean z6 = wq2Var3.g;
                                    mk9 mk9Var3 = mk9Var2;
                                    wn9.M(aq5Var, wgaVar, i12, i13, zBooleanValue, z5, list7, mk9Var3, z6, new zp2(mk9Var3, 1), ib4Var4, new r02(a07Var9, 7), kb4Var7, ib4Var5, new r02(a07Var8, 8));
                                    return heb.a;
                                }
                            };
                            dd4Var2.p0(kb4Var8);
                            objQ7 = kb4Var8;
                        }
                        gx1.i(yh4Var, px3Var, wq5Var2, szbVarW, null, null, null, false, 0L, 0L, szbVarW3, 0.0f, (kb4) objQ7, dd4Var2, 48, 0, 6128);
                        dd4Var2.q(true);
                    } else {
                        dd4Var2.Y();
                    }
                    return heb.a;
                }
            }, dd4Var);
            int i10 = i7;
            z68.a(z4, ib4Var3, ou6Var, g78Var, (f9) null, rj1VarG, false, 0.0f, rj1VarG2, dd4Var, ((i10 >> 24) & Token.ASSIGN_MOD) | 100859904 | (i10 & 896));
        } else {
            dd4Var.Y();
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new yb4() { // from class: yp2
                @Override // defpackage.yb4
                public final Object invoke(Object obj3, Object obj4) {
                    ((Integer) obj4).getClass();
                    int iX0 = qu1.x0(i2 | 1);
                    int iX02 = qu1.x0(i3);
                    fw.f(wq2Var, pj7Var, kb4Var, yb4Var, yb4Var2, kb4Var2, ib4Var, ib4Var2, ib4Var3, kb4Var3, kb4Var4, (dd4) obj3, iX0, iX02);
                    return heb.a;
                }
            };
        }
    }

    public static void f0(byte[] bArr, byte b2) {
        int length = bArr.length;
        bArr.getClass();
        Arrays.fill(bArr, 0, length, b2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void g(wq2 wq2Var, pj7 pj7Var, ou6 ou6Var, ib4 ib4Var, ib4 ib4Var2, kb4 kb4Var, yb4 yb4Var, yb4 yb4Var2, ib4 ib4Var3, kb4 kb4Var2, ib4 ib4Var4, ib4 ib4Var5, ib4 ib4Var6, kb4 kb4Var3, kb4 kb4Var4, dd4 dd4Var, int i2) {
        int i3;
        pj7 pj7Var2;
        kb4 kb4Var5;
        wq2 wq2Var2;
        ib4 ib4Var7;
        yb4 yb4Var3;
        yb4 yb4Var4;
        jm jmVar;
        yb4 yb4Var5;
        ib4 ib4Var8;
        int i4;
        ou6 ou6Var2;
        ib4 ib4Var9 = ib4Var3;
        dd4 dd4Var2 = dd4Var;
        dd4Var2.h0(-25182183);
        if ((i2 & 6) == 0) {
            i3 = (dd4Var2.f(wq2Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            pj7Var2 = pj7Var;
            i3 |= dd4Var2.f(pj7Var2) ? 32 : 16;
        } else {
            pj7Var2 = pj7Var;
        }
        if ((i2 & 384) == 0) {
            i3 |= dd4Var2.f(ou6Var) ? 256 : Token.CASE;
        }
        if ((i2 & 3072) == 0) {
            i3 |= dd4Var2.h(ib4Var) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= dd4Var2.h(ib4Var2) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            kb4Var5 = kb4Var;
            i3 |= dd4Var2.h(kb4Var5) ? 131072 : Parser.ARGC_LIMIT;
        } else {
            kb4Var5 = kb4Var;
        }
        if ((i2 & 1572864) == 0) {
            i3 |= dd4Var2.h(yb4Var) ? 1048576 : 524288;
        }
        if ((i2 & 12582912) == 0) {
            i3 |= dd4Var2.h(yb4Var2) ? 8388608 : 4194304;
        }
        if ((i2 & 100663296) == 0) {
            i3 |= dd4Var2.h(ib4Var9) ? 67108864 : 33554432;
        }
        if ((i2 & 805306368) == 0) {
            i3 |= dd4Var2.h(kb4Var2) ? 536870912 : 268435456;
        }
        int i5 = i3;
        int i6 = 3072 | (dd4Var2.h(ib4Var4) ? 4 : 2) | (dd4Var2.h(ib4Var5) ? 32 : 16) | (dd4Var2.h(ib4Var6) ? 256 : Token.CASE) | (dd4Var2.h(kb4Var4) ? 16384 : 8192);
        if (dd4Var2.V(i5 & 1, ((i5 & 306783379) == 306783378 && (i6 & 9363) == 9362) ? false : true)) {
            int i7 = i5 >> 6;
            ha6 ha6VarD = pn0.d(bv4.b, false);
            int iHashCode = Long.hashCode(dd4Var2.T);
            lr7 lr7VarL = dd4Var2.l();
            ou6 ou6VarL0 = s32.L0(dd4Var2, ou6Var);
            ml1.k.getClass();
            ib4 ib4Var10 = ll1.b;
            dd4Var2.j0();
            if (dd4Var2.S) {
                dd4Var2.k(ib4Var10);
            } else {
                dd4Var2.s0();
            }
            yb4 yb4Var6 = ll1.f;
            un9.s(yb4Var6, dd4Var2, ha6VarD);
            yb4 yb4Var7 = ll1.e;
            un9.s(yb4Var7, dd4Var2, lr7VarL);
            Integer numValueOf = Integer.valueOf(iHashCode);
            jm jmVar2 = ll1.g;
            un9.s(jmVar2, dd4Var2, numValueOf);
            kd kdVar = ll1.h;
            un9.r(dd4Var2, kdVar);
            yb4 yb4Var8 = ll1.d;
            un9.s(yb4Var8, dd4Var2, ou6VarL0);
            boolean zA = xzb.a(dd4Var2);
            ou6 ou6Var3 = lu6.a;
            if (zA) {
                dd4Var2.f0(602010292);
                int i8 = i6 << 21;
                yb4Var4 = yb4Var8;
                yb4Var3 = yb4Var7;
                f(wq2Var, pj7Var2, kb4Var5, yb4Var, yb4Var2, kb4Var2, ib4Var4, ib4Var5, ib4Var6, kb4Var3, kb4Var4, dd4Var2, (i7 & 458752) | (i7 & 7168) | (i5 & 14) | 384 | (i5 & Token.ASSIGN_MOD) | (i7 & 57344) | ((i5 >> 9) & 3670016) | (i8 & 29360128) | (i8 & 234881024) | (i8 & 1879048192), (i6 >> 9) & Token.ELSE);
                dd4Var2 = dd4Var2;
                dd4Var2.q(false);
                wq2Var2 = wq2Var;
                jmVar = jmVar2;
                yb4Var5 = yb4Var6;
                ib4Var8 = ib4Var10;
                ou6Var2 = ou6Var3;
                i4 = 0;
            } else {
                yb4Var3 = yb4Var7;
                yb4Var4 = yb4Var8;
                dd4Var2.f0(602614420);
                int i9 = i6 << 21;
                jmVar = jmVar2;
                yb4Var5 = yb4Var6;
                ib4Var8 = ib4Var10;
                i4 = 0;
                i(wq2Var, pj7Var, ou6Var3, kb4Var, yb4Var, yb4Var2, kb4Var2, ib4Var4, ib4Var5, ib4Var6, kb4Var3, kb4Var4, dd4Var2, (i7 & 458752) | (i5 & 14) | 384 | (i5 & Token.ASSIGN_MOD) | (i7 & 7168) | (i7 & 57344) | ((i5 >> 9) & 3670016) | (i9 & 29360128) | (i9 & 234881024) | (i9 & 1879048192), (i6 >> 9) & Token.ELSE);
                wq2Var2 = wq2Var;
                ou6Var2 = ou6Var3;
                dd4Var2 = dd4Var2;
                dd4Var2.q(false);
            }
            List list = wq2Var2.d;
            int i10 = (list == null || !list.isEmpty()) ? i4 : 1;
            ou6 ou6VarB = yib.B(zn0.a.a(ou6Var2, bv4.v), 14);
            ie1 ie1VarA = ge1.a(pv.c, bv4.z, dd4Var2, i4);
            int iHashCode2 = Long.hashCode(dd4Var2.T);
            lr7 lr7VarL2 = dd4Var2.l();
            ou6 ou6VarL02 = s32.L0(dd4Var2, ou6VarB);
            dd4Var2.j0();
            if (dd4Var2.S) {
                dd4Var2.k(ib4Var8);
            } else {
                dd4Var2.s0();
            }
            un9.s(yb4Var5, dd4Var2, ie1VarA);
            un9.s(yb4Var3, dd4Var2, lr7VarL2);
            ky0.v(iHashCode2, dd4Var2, jmVar, dd4Var2, kdVar);
            un9.s(yb4Var4, dd4Var2, ou6VarL02);
            int i11 = i10;
            kf0.e((list == null || list.isEmpty() || wq2Var2.l) ? i4 : 1, gjb.m0(ou6Var2, 12.0f, 6.0f), wd3.f((p9b) null, 0.0f, 0L, 7), wd3.h(0.0f, 0L, 7), (String) null, jf0.G(-1788922939, new oa3(3, ib4Var), dd4Var2), dd4Var2, 1600902, 16);
            ib4Var7 = ib4Var2;
            kf0.e((list == null || list.isEmpty() || !wq2Var2.m) ? false : true, gjb.m0(ou6Var2, 12.0f, 6.0f), wd3.f((p9b) null, 0.0f, 0L, 7), wd3.h(0.0f, 0L, 7), (String) null, jf0.G(-1069335634, new oa3(4, ib4Var7), dd4Var2), dd4Var2, 1600902, 16);
            if (i11 == 0) {
                dd4Var2.f0(-1286032075);
                ib4Var9 = ib4Var3;
                u(((i5 >> 18) & 896) | 48, ib4Var9, dd4Var2, gjb.m0(ou6Var2, 12.0f, 6.0f), list == null);
                dd4Var2.q(false);
            } else {
                ib4Var9 = ib4Var3;
                dd4Var2.f0(-1285801435);
                dd4Var2.q(false);
            }
            dd4Var2.q(true);
            dd4Var2.q(true);
        } else {
            wq2Var2 = wq2Var;
            ib4Var7 = ib4Var2;
            dd4Var2.Y();
        }
        ye8 ye8VarU = dd4Var2.u();
        if (ye8VarU != null) {
            ye8VarU.d = new up2(wq2Var2, pj7Var, ou6Var, ib4Var, ib4Var7, kb4Var, yb4Var, yb4Var2, ib4Var9, kb4Var2, ib4Var4, ib4Var5, ib4Var6, kb4Var3, kb4Var4, i2);
        }
    }

    public static void g0(long[] jArr, long j2) {
        int length = jArr.length;
        jArr.getClass();
        Arrays.fill(jArr, 0, length, j2);
    }

    public static final void h(int i2, ib4 ib4Var, ib4 ib4Var2, dd4 dd4Var, ou6 ou6Var, String str) {
        dd4 dd4Var2 = dd4Var;
        dd4Var2.h0(948321846);
        int i3 = i2 | (dd4Var.f(ou6Var) ? 4 : 2) | (dd4Var2.f(str) ? 32 : 16) | (dd4Var2.h(ib4Var) ? 256 : Token.CASE) | (dd4Var2.h(ib4Var2) ? 2048 : 1024);
        if (dd4Var2.V(i3 & 1, (i3 & 1171) != 1170)) {
            ie1 ie1VarA = ge1.a(pv.e, bv4.A, dd4Var2, 54);
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
            un9.s(ll1.f, dd4Var2, ie1VarA);
            un9.s(ll1.e, dd4Var2, lr7VarL);
            un9.s(ll1.g, dd4Var2, Integer.valueOf(iHashCode));
            un9.r(dd4Var2, ll1.h);
            un9.s(ll1.d, dd4Var2, ou6VarL0);
            dd4Var2.f0(1173459173);
            String strK = bw9.a0(str) ? wn9.K((pv9) eu9.E.getValue(), dd4Var2) : str;
            dd4Var2.q(false);
            nha.c(strK, (ou6) null, 0L, (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, new vaa(3), 0L, 0, false, 0, 0, (kb4) null, ((q96) dd4Var2.j(s96.a)).b.f, dd4Var, 0, 0, 130046);
            dd4Var2 = dd4Var;
            lu6 lu6Var = lu6.a;
            un9.a(dd4Var2, tg9.h(lu6Var, 24.0f));
            kc5.n(i25.c((m53) f53.d0.getValue(), dd4Var2, 0), wn9.K((pv9) mu9.Q.getValue(), dd4Var2), false, null, null, null, null, null, ib4Var, dd4Var2, (i3 << 18) & 234881024, 252);
            un9.a(dd4Var2, tg9.h(lu6Var, 12.0f));
            kc5.n(i25.c((m53) f53.C.getValue(), dd4Var2, 0), wn9.K((pv9) mu9.z.getValue(), dd4Var2), false, null, null, null, null, null, ib4Var2, dd4Var2, (i3 << 15) & 234881024, 252);
            dd4Var2.q(true);
        } else {
            dd4Var2.Y();
        }
        ye8 ye8VarU = dd4Var2.u();
        if (ye8VarU != null) {
            ye8VarU.d = new xf1(ou6Var, str, ib4Var, ib4Var2, i2);
        }
    }

    public static final void i(final wq2 wq2Var, final pj7 pj7Var, final ou6 ou6Var, final kb4 kb4Var, final yb4 yb4Var, final yb4 yb4Var2, final kb4 kb4Var2, final ib4 ib4Var, final ib4 ib4Var2, final ib4 ib4Var3, final kb4 kb4Var3, final kb4 kb4Var4, dd4 dd4Var, final int i2, final int i3) {
        int i4;
        int i5;
        a07 a07Var;
        Object obj;
        Boolean bool;
        int i6;
        wq5 wq5Var;
        a07 a07Var2;
        a07 a07Var3;
        wq2 wq2Var2 = wq2Var;
        dd4 dd4Var2 = dd4Var;
        dd4Var2.h0(1998387926);
        if ((i2 & 6) == 0) {
            i4 = (dd4Var2.f(wq2Var2) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= dd4Var2.f(pj7Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= dd4Var2.f(ou6Var) ? 256 : Token.CASE;
        }
        if ((i2 & 3072) == 0) {
            i4 |= dd4Var2.h(kb4Var) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i4 |= dd4Var2.h(yb4Var) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i4 |= dd4Var2.h(yb4Var2) ? 131072 : Parser.ARGC_LIMIT;
        }
        if ((1572864 & i2) == 0) {
            i4 |= dd4Var2.h(kb4Var2) ? 1048576 : 524288;
        }
        if ((12582912 & i2) == 0) {
            i4 |= dd4Var2.h(ib4Var) ? 8388608 : 4194304;
        }
        if ((i2 & 100663296) == 0) {
            i4 |= dd4Var2.h(ib4Var2) ? 67108864 : 33554432;
        }
        if ((i2 & 805306368) == 0) {
            i4 |= dd4Var2.h(ib4Var3) ? 536870912 : 268435456;
        }
        int i7 = i4;
        if ((i3 & 6) == 0) {
            i5 = i3 | (dd4Var2.h(kb4Var3) ? 4 : 2);
        } else {
            i5 = i3;
        }
        if ((i3 & 48) == 0) {
            i5 |= dd4Var2.h(kb4Var4) ? 32 : 16;
        }
        int i8 = i5;
        if (dd4Var2.V(i7 & 1, ((i7 & 306783379) == 306783378 && (i8 & 19) == 18) ? false : true)) {
            g78 g78VarB = z68.b(dd4Var2);
            wq5 wq5VarA = yq5.a(dd4Var2);
            Object[] objArr = new Object[0];
            Object objQ = dd4Var2.Q();
            Object obj2 = vl1.a;
            if (objQ == obj2) {
                objQ = new dh1(20);
                dd4Var2.p0(objQ);
            }
            a07 a07Var4 = (a07) ww1.b0(objArr, (ib4) objQ, dd4Var2, 48);
            Object[] objArr2 = new Object[0];
            Object objQ2 = dd4Var2.Q();
            if (objQ2 == obj2) {
                objQ2 = new dh1(21);
                dd4Var2.p0(objQ2);
            }
            a07 a07VarA0 = ww1.a0(objArr2, (ib4) objQ2, dd4Var2, 384);
            Object objQ3 = dd4Var2.Q();
            jt1 jt1Var = null;
            if (objQ3 == obj2) {
                objQ3 = dk9.x((Object) null);
                dd4Var2.p0(objQ3);
            }
            a07 a07Var5 = (a07) objQ3;
            List list = wq2Var2.d;
            Boolean bool2 = (Boolean) a07Var4.getValue();
            bool2.getClass();
            int i9 = i7 & 14;
            boolean zF = dd4Var2.f(a07VarA0) | (i9 == 4) | dd4Var2.f(a07Var4);
            Object objQ4 = dd4Var2.Q();
            if (zF || objQ4 == obj2) {
                a07Var = a07Var4;
                obj = obj2;
                bool = bool2;
                i6 = i9;
                wq5Var = wq5VarA;
                objQ4 = new qq2(a07VarA0, wq2Var2, a07Var, a07Var5, null, 1);
                a07Var2 = a07VarA0;
                wq2Var2 = wq2Var2;
                a07Var3 = a07Var5;
                dd4Var2.p0(objQ4);
            } else {
                a07Var = a07Var4;
                obj = obj2;
                i6 = i9;
                a07Var3 = a07Var5;
                bool = bool2;
                wq5Var = wq5VarA;
                a07Var2 = a07VarA0;
            }
            lc5.v(list, bool, (yb4) objQ4, dd4Var2);
            ho2 ho2Var = wq2Var2.i;
            ho2Var.getClass();
            float fK0 = ((pn2) dd4Var2.j(xm1.h)).k0(200.0f);
            boolean zF2 = dd4Var2.f(wq5Var) | dd4Var2.c(fK0) | ((i8 & 14) == 4);
            Object objQ5 = dd4Var2.Q();
            if (zF2 || objQ5 == obj) {
                objQ5 = new sq2(kb4Var3, wq5Var, fK0, jt1Var, 1);
                dd4Var2.p0(objQ5);
            }
            lc5.u((yb4) objQ5, dd4Var2, wq5Var);
            Object objQ6 = dd4Var2.Q();
            if (objQ6 == obj) {
                objQ6 = new mk9();
                dd4Var2.p0(objQ6);
            }
            mk9 mk9Var = (mk9) objQ6;
            eq8 eq8VarA = dq8.a(pv.a, bv4.w, dd4Var2, 0);
            a07 a07Var6 = a07Var;
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
            rj7 rj7VarQ = gjb.q(0.0f, 0.0f, 0.0f, 120.0f, 7);
            if (1.0f <= 0.0d) {
                o75.a("invalid weight; must be greater than zero");
            }
            a07 a07Var7 = a07Var2;
            Object obj3 = obj;
            z68.a(wq2Var2.a, ib4Var3, new bp5(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), g78VarB, (f9) null, jf0.G(-847727213, new vp2(g78VarB, wq2Var2, pj7Var, 0), dd4Var2), false, 0.0f, jf0.G(-1850740842, new u97(rj7VarQ, pj7Var, wq5Var, ho2Var, wq2Var, kb4Var4, yb4Var, kb4Var, yb4Var2), dd4Var2), dd4Var2, ((i7 >> 24) & Token.ASSIGN_MOD) | 100859904);
            wq5 wq5VarA2 = yq5.a(dd4Var2);
            if (1.0f <= 0.0d) {
                o75.a("invalid weight; must be greater than zero");
            }
            bp5 bp5Var = new bp5(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
            yh4 yh4Var = new yh4(160.0f);
            szb szbVarW = yib.w(yib.w(rj7VarQ, yib.d(12, dd4Var2, false)), pj7Var);
            szb szbVarW2 = yib.w(yib.w(yib.w(rj7VarQ, yib.d(12, dd4Var2, false)), gjb.q(0.0f, 0.0f, 4.0f, 0.0f, 11)), pj7Var);
            boolean zF3 = dd4Var2.f(a07Var7) | (i6 == 4) | dd4Var2.f(a07Var6) | ((i7 & 234881024) == 67108864) | ((i7 & 3670016) == 1048576) | ((i7 & 29360128) == 8388608);
            Object objQ7 = dd4Var2.Q();
            if (zF3 || objQ7 == obj3) {
                j71 j71Var = new j71(wq2Var, mk9Var, ib4Var2, kb4Var2, ib4Var, a07Var7, a07Var3, a07Var6, 1);
                dd4Var2.p0(j71Var);
                objQ7 = j71Var;
            }
            gx1.i(yh4Var, bp5Var, wq5VarA2, szbVarW, null, null, null, false, 0L, 0L, szbVarW2, 0.0f, (kb4) objQ7, dd4Var, 0, 0, 6128);
            dd4Var2 = dd4Var;
            dd4Var2.q(true);
        } else {
            dd4Var2.Y();
        }
        ye8 ye8VarU = dd4Var2.u();
        if (ye8VarU != null) {
            ye8VarU.d = new yb4() { // from class: wp2
                @Override // defpackage.yb4
                public final Object invoke(Object obj4, Object obj5) {
                    ((Integer) obj5).getClass();
                    int iX0 = qu1.x0(i2 | 1);
                    int iX02 = qu1.x0(i3);
                    fw.i(wq2Var, pj7Var, ou6Var, kb4Var, yb4Var, yb4Var2, kb4Var2, ib4Var, ib4Var2, ib4Var3, kb4Var3, kb4Var4, (dd4) obj4, iX0, iX02);
                    return heb.a;
                }
            };
        }
    }

    public static ArrayList i0(Object[] objArr) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : objArr) {
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static final void j(String str, String str2, String str3, String str4, boolean z2, String str5, String str6, pj7 pj7Var, ou6 ou6Var, ib4 ib4Var, dd4 dd4Var, int i2) {
        dd4 dd4Var2;
        ib4 ib4Var2;
        String str7 = str5;
        ib4 ib4Var3 = ib4Var;
        dd4Var.h0(-21612781);
        int i3 = i2 | (dd4Var.f(str) ? 4 : 2) | (dd4Var.f(str2) ? 32 : 16) | (dd4Var.f(str3) ? 256 : Token.CASE) | (dd4Var.f(str4) ? 2048 : 1024) | (dd4Var.g(z2) ? 16384 : 8192) | (dd4Var.f(str7) ? 131072 : Parser.ARGC_LIMIT) | (dd4Var.f(str6) ? 1048576 : 524288) | (dd4Var.f(pj7Var) ? 8388608 : 4194304) | (dd4Var.h(ib4Var3) ? 536870912 : 268435456);
        if (dd4Var.V(i3 & 1, (306783379 & i3) != 306783378)) {
            xf0 xf0Var = bv4.b;
            ha6 ha6VarD = pn0.d(xf0Var, false);
            int iHashCode = Long.hashCode(dd4Var.T);
            lr7 lr7VarL = dd4Var.l();
            ou6 ou6VarL0 = s32.L0(dd4Var, ou6Var);
            ml1.k.getClass();
            ib4 ib4Var4 = ll1.b;
            dd4Var.j0();
            if (dd4Var.S) {
                dd4Var.k(ib4Var4);
            } else {
                dd4Var.s0();
            }
            jm jmVar = ll1.f;
            un9.s(jmVar, dd4Var, ha6VarD);
            jm jmVar2 = ll1.e;
            un9.s(jmVar2, dd4Var, lr7VarL);
            Integer numValueOf = Integer.valueOf(iHashCode);
            jm jmVar3 = ll1.g;
            un9.s(jmVar3, dd4Var, numValueOf);
            kd kdVar = ll1.h;
            un9.r(dd4Var, kdVar);
            jm jmVar4 = ll1.d;
            un9.s(jmVar4, dd4Var, ou6VarL0);
            qr1 qr1Var = ra1.d;
            zn0 zn0Var = zn0.a;
            ou6 ou6VarB = zn0Var.b();
            if (x13.b(12.0f, 0.0f) > 0) {
                x13.b(12.0f, 0.0f);
            }
            ou6 ou6VarW = kl8.W(ou6VarB, new yh0(0, true));
            int i4 = i3 & 14;
            int i5 = i3 >> 3;
            int i6 = i4 | 3072 | (i5 & Token.ASSIGN_MOD) | (i5 & 896);
            w05.d(str, str3, str4, qr1Var, ou6VarW, dd4Var, i6);
            pn0.a(fe.K(zn0Var.b(), js8.y(new xl7[]{new xl7(Float.valueOf(0.0f), new lc1(lc1.c(0.08f, s00.o(dd4Var).p))), new xl7(Float.valueOf(0.45f), new lc1(lc1.c(0.28f, s00.o(dd4Var).p))), new xl7(Float.valueOf(1.0f), new lc1(s00.o(dd4Var).p))})), dd4Var, 0);
            lu6 lu6Var = lu6.a;
            ou6 ou6VarA = zn0Var.a(tg9.t(tg9.f(gjb.o0(gjb.k0(lu6Var, pj7Var), 24.0f, 12.0f, 24.0f, 16.0f), 1.0f), 0.0f, 720.0f, 1), bv4.c);
            ie1 ie1VarA = ge1.a(pv.c, bv4.A, dd4Var, 48);
            int iHashCode2 = Long.hashCode(dd4Var.T);
            lr7 lr7VarL2 = dd4Var.l();
            ou6 ou6VarL02 = s32.L0(dd4Var, ou6VarA);
            dd4Var.j0();
            if (dd4Var.S) {
                ib4Var2 = ib4Var4;
                dd4Var.k(ib4Var2);
            } else {
                ib4Var2 = ib4Var4;
                dd4Var.s0();
            }
            un9.s(jmVar, dd4Var, ie1VarA);
            un9.s(jmVar2, dd4Var, lr7VarL2);
            ky0.v(iHashCode2, dd4Var, jmVar3, dd4Var, kdVar);
            un9.s(jmVar4, dd4Var, ou6VarL02);
            ou6 ou6VarE0 = sdc.e0(0.6666667f, tg9.r(lu6Var, 156.0f), false);
            ha6 ha6VarD2 = pn0.d(xf0Var, false);
            int iHashCode3 = Long.hashCode(dd4Var.T);
            lr7 lr7VarL3 = dd4Var.l();
            ou6 ou6VarL03 = s32.L0(dd4Var, ou6VarE0);
            dd4Var.j0();
            if (dd4Var.S) {
                dd4Var.k(ib4Var2);
            } else {
                dd4Var.s0();
            }
            un9.s(jmVar, dd4Var, ha6VarD2);
            un9.s(jmVar2, dd4Var, lr7VarL3);
            ky0.v(iHashCode3, dd4Var, jmVar3, dd4Var, kdVar);
            un9.s(jmVar4, dd4Var, ou6VarL03);
            ib4 ib4Var5 = ib4Var2;
            w05.d(str, str3, str4, qr1Var, t96.w(tg9.c, s00.p(dd4Var).d), dd4Var, i6);
            xv5.z(dd4Var, true, lu6Var, 16.0f, dd4Var);
            uka ukaVar = s00.q(dd4Var).e;
            nha.c(str, tg9.f(lu6Var, 1.0f), 0L, new g60(wn9.x(20), wn9.x(32), wn9.w(0.25d)), wn9.x(32), (t74) null, (a84) null, (c64) null, 0L, (jda) null, new vaa(3), wn9.t(1.2d), 0, false, 3, 0, (kb4) null, ukaVar, dd4Var, i4 | 24624, 24624, 111588);
            dd4 dd4Var3 = dd4Var;
            un9.a(dd4Var3, tg9.h(lu6Var, 10.0f));
            if (str2.length() > 0) {
                dd4Var3.f0(-2089587302);
                k(str2, null, 0L, 0L, t1c.i, dd4Var3, (i5 & 14) | 24576, 14);
                dd4Var3 = dd4Var3;
                dd4Var3.q(false);
            } else {
                dd4Var3.f0(-2089132749);
                dd4Var3.q(false);
            }
            ou6 ou6VarH = xv5.h(lu6Var, 10.0f, dd4Var3, lu6Var, 1.0f);
            eq8 eq8VarA = dq8.a(pv.e, bv4.x, dd4Var3, 54);
            int iHashCode4 = Long.hashCode(dd4Var3.T);
            lr7 lr7VarL4 = dd4Var3.l();
            ou6 ou6VarL04 = s32.L0(dd4Var3, ou6VarH);
            dd4Var3.j0();
            if (dd4Var3.S) {
                dd4Var3.k(ib4Var5);
            } else {
                dd4Var3.s0();
            }
            un9.s(jmVar, dd4Var3, eq8VarA);
            un9.s(jmVar2, dd4Var3, lr7VarL4);
            ky0.v(iHashCode4, dd4Var3, jmVar3, dd4Var3, kdVar);
            ib4Var3 = ib4Var;
            str7 = str5;
            dd4 dd4Var4 = dd4Var3;
            k(str6, yn2.V(1, ib4Var3, dd4Var3, ky0.g(dd4Var3, ou6VarL04, jmVar4, 1.0f, false), false), 0L, 0L, jf0.G(1821217865, new z31(str7, 5), dd4Var3), dd4Var4, ((i3 >> 18) & 14) | 24576, 12);
            dd4Var2 = dd4Var4;
            if (z2) {
                xv5.y(dd4Var2, 398041660, lu6Var, 8.0f, dd4Var2);
                String upperCase = wn9.K((pv9) mu9.w.getValue(), dd4Var2).toUpperCase(Locale.ROOT);
                upperCase.getClass();
                k(upperCase, null, s00.o(dd4Var2).a, s00.o(dd4Var2).b, null, dd4Var2, 0, 18);
                dd4Var2 = dd4Var2;
                dd4Var2.q(false);
            } else {
                dd4Var2.f0(398398191);
                dd4Var2.q(false);
            }
            tw2.x(dd4Var2, true, true, true);
        } else {
            dd4Var2 = dd4Var;
            dd4Var2.Y();
        }
        ye8 ye8VarU = dd4Var2.u();
        if (ye8VarU != null) {
            ye8VarU.d = new f41(str, str2, str3, str4, z2, str7, str6, pj7Var, ou6Var, ib4Var3, i2);
        }
    }

    public static Object j0(Object[] objArr) {
        objArr.getClass();
        if (objArr.length != 0) {
            return objArr[0];
        }
        so9.n("Array is empty.");
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:96:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void k(final java.lang.String r32, ou6 r33, long r34, long r36, defpackage.yb4 r38, dd4 r39, final int r40, final int r41) {
        /*
            Method dump skipped, instruction units count: 546
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fw.k(java.lang.String, ou6, long, long, yb4, dd4, int, int):void");
    }

    public static Object k0(Object[] objArr) {
        objArr.getClass();
        if (objArr.length == 0) {
            return null;
        }
        return objArr[0];
    }

    public static final void l(boolean z2, ib4 ib4Var, ib4 ib4Var2, ib4 ib4Var3, ib4 ib4Var4, dd4 dd4Var, int i2) {
        dd4Var.h0(924017018);
        int i3 = i2 | (dd4Var.g(z2) ? 4 : 2) | (dd4Var.h(ib4Var) ? 32 : 16) | (dd4Var.h(ib4Var3) ? 2048 : 1024) | (dd4Var.h(ib4Var4) ? 16384 : 8192);
        int i4 = 0;
        if (dd4Var.V(i3 & 1, (i3 & 9363) != 9362)) {
            gx1.a(z2, null, 0L, null, 0.0f, new rj7(12.0f, 12.0f, 12.0f, 12.0f), ib4Var4, jf0.G(-1865974394, new sp2(ib4Var2, ib4Var, ib4Var3, i4), dd4Var), dd4Var, (i3 & 14) | 12779520 | ((i3 << 6) & 3670016), 30);
        } else {
            dd4Var.Y();
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new tp2(z2, ib4Var, ib4Var2, ib4Var3, ib4Var4, i2, 0);
        }
    }

    public static final String[] l0(bs1 bs1Var) {
        bs1Var.getClass();
        return (String[]) ((oe) bs1Var).b.toArray(new String[0]);
    }

    public static final void m(String str, String str2, t27 t27Var, dd4 dd4Var, int i2) {
        dd4 dd4Var2;
        t27 t27Var2;
        boolean z2;
        str.getClass();
        t27Var.getClass();
        dd4Var.h0(-1431274574);
        int i3 = i2 | (dd4Var.f(str) ? 4 : 2) | (dd4Var.f(str2) ? 32 : 16) | (dd4Var.f(t27Var) ? 256 : Token.CASE);
        int i4 = 1;
        int i5 = 0;
        if (dd4Var.V(i3 & 1, (i3 & Token.EXPR_VOID) != 146)) {
            boolean z3 = ((i3 & 14) == 4) | ((i3 & Token.ASSIGN_MOD) == 32);
            Object objQ = dd4Var.Q();
            Object obj = vl1.a;
            if (z3 || objQ == obj) {
                objQ = new lq2(str, str2, i5);
                dd4Var.p0(objQ);
            }
            ib4 ib4Var = (ib4) objQ;
            pj4 pj4VarA = e36.a(dd4Var);
            if (pj4VarA == null) {
                gp.j("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
            ry6 ry6VarD = pj4VarA instanceof pj4 ? pj4VarA.d() : v02.b;
            ev8 ev8VarA = ek5.a(dd4Var);
            a91 a91VarA = ug8.a(ir2.class);
            ir2 ir2Var = (ir2) ((qtb) qx1.N(a91VarA, pj4VarA.f(), dx1.h(a91VarA.f(), "-", str), ry6VarD, ev8VarA, ib4Var));
            a07 a07VarB = bx1.B(ir2Var.O, dd4Var);
            a07 a07VarB2 = bx1.B(ir2Var.d, dd4Var);
            boolean zF = dd4Var.f(ir2Var);
            Object objQ2 = dd4Var.Q();
            if (zF || objQ2 == obj) {
                objQ2 = new qp2(ir2Var, i4);
                dd4Var.p0(objQ2);
            }
            jt1 jt1Var = null;
            lx1.g(ir2Var, null, (kb4) objQ2, dd4Var, 0);
            m8 m8Var = (m8) dd4Var.j(a9.a);
            pp1 pp1Var = ir2Var.P;
            int i6 = i3 & 896;
            boolean zF2 = (i6 == 256) | dd4Var.f(m8Var);
            Object objQ3 = dd4Var.Q();
            if (zF2 || objQ3 == obj) {
                objQ3 = new q51(t27Var, m8Var, jt1Var, i4);
                dd4Var.p0(objQ3);
            }
            wx1.e(pp1Var, null, (zb4) objQ3, dd4Var, 0);
            Object[] objArr = new Object[0];
            Object objQ4 = dd4Var.Q();
            if (objQ4 == obj) {
                objQ4 = new dh1(25);
                dd4Var.p0(objQ4);
            }
            a07 a07Var = (a07) ww1.b0(objArr, (ib4) objQ4, dd4Var, 48);
            Object[] objArr2 = new Object[0];
            Object objQ5 = dd4Var.Q();
            if (objQ5 == obj) {
                objQ5 = new dh1(26);
                dd4Var.p0(objQ5);
            }
            a07 a07Var2 = (a07) ww1.b0(objArr2, (ib4) objQ5, dd4Var, 48);
            Object[] objArr3 = new Object[0];
            Object objQ6 = dd4Var.Q();
            if (objQ6 == obj) {
                objQ6 = new dh1(27);
                dd4Var.p0(objQ6);
            }
            a07 a07Var3 = (a07) ww1.b0(objArr3, (ib4) objQ6, dd4Var, 48);
            Object[] objArr4 = new Object[0];
            Object objQ7 = dd4Var.Q();
            if (objQ7 == obj) {
                objQ7 = new dh1(28);
                dd4Var.p0(objQ7);
            }
            a07 a07Var4 = (a07) ww1.b0(objArr4, (ib4) objQ7, dd4Var, 48);
            Object objQ8 = dd4Var.Q();
            if (objQ8 == obj) {
                objQ8 = dk9.x(Float.valueOf(0.0f));
                dd4Var.p0(objQ8);
            }
            gx1.r(null, null, jf0.G(893394755, new q41(t27Var, 13), dd4Var), jf0.G(509143226, new sz0(a07Var4, a07VarB, a07VarB2, (Object) a07Var, (Object) t27Var, 5), dd4Var), jf0.G(308697141, new oq2(ir2Var, t27Var, str, a07Var3, a07Var2, a07VarB, (a07) objQ8), dd4Var), dd4Var, 224256, 7);
            if (((wq2) a07VarB.getValue()).i != null) {
                dd4Var.f0(1340982224);
                boolean zBooleanValue = ((Boolean) a07Var2.getValue()).booleanValue();
                ho2 ho2Var = ((wq2) a07VarB.getValue()).i;
                String str3 = ho2Var != null ? ho2Var.b : null;
                if (str3 == null) {
                    str3 = "";
                }
                boolean z4 = ((wq2) a07VarB.getValue()).l;
                ho2 ho2Var2 = ((wq2) a07VarB.getValue()).i;
                boolean z5 = ho2Var2 != null ? ho2Var2.m : false;
                ho2 ho2Var3 = ((wq2) a07VarB.getValue()).i;
                int i7 = ho2Var3 != null ? ho2Var3.k : 0;
                boolean zF3 = dd4Var.f(a07Var2);
                Object objQ9 = dd4Var.Q();
                if (zF3 || objQ9 == obj) {
                    objQ9 = new r02(a07Var2, 3);
                    dd4Var.p0(objQ9);
                }
                kb4 kb4Var = (kb4) objQ9;
                boolean zF4 = dd4Var.f(ir2Var) | dd4Var.f(a07Var2);
                Object objQ10 = dd4Var.Q();
                if (zF4 || objQ10 == obj) {
                    objQ10 = new mq2(0, ir2Var, a07Var2);
                    dd4Var.p0(objQ10);
                }
                t27Var2 = t27Var;
                sw1.i(zBooleanValue, str3, z4, z5, i7, kb4Var, (cc4) objQ10, dd4Var, 0, 0);
                dd4Var2 = dd4Var;
                boolean zBooleanValue2 = ((Boolean) a07Var3.getValue()).booleanValue();
                ho2 ho2Var4 = ((wq2) a07VarB.getValue()).i;
                String str4 = ho2Var4 != null ? ho2Var4.b : null;
                String str5 = str4 == null ? "" : str4;
                ho2 ho2Var5 = ((wq2) a07VarB.getValue()).i;
                boolean z6 = ho2Var5 != null ? ho2Var5.m : false;
                ho2 ho2Var6 = ((wq2) a07VarB.getValue()).i;
                int i8 = ho2Var6 != null ? ho2Var6.k : 0;
                boolean zF5 = dd4Var2.f(a07Var3);
                Object objQ11 = dd4Var2.Q();
                if (zF5 || objQ11 == obj) {
                    objQ11 = new r02(a07Var3, 9);
                    dd4Var2.p0(objQ11);
                }
                kb4 kb4Var2 = (kb4) objQ11;
                boolean zF6 = dd4Var2.f(ir2Var);
                Object objQ12 = dd4Var2.Q();
                if (zF6 || objQ12 == obj) {
                    objQ12 = new ah(ir2Var, 11);
                    dd4Var2.p0(objQ12);
                }
                tw1.h(str5, z6, i8, zBooleanValue2, kb4Var2, (yb4) objQ12, dd4Var2, 0, 0);
                if (((wq2) a07VarB.getValue()).b != null) {
                    dd4Var2.f0(1342189054);
                    boolean zBooleanValue3 = ((Boolean) a07Var4.getValue()).booleanValue();
                    String str6 = ((wq2) a07VarB.getValue()).b;
                    str6.getClass();
                    boolean zF7 = dd4Var2.f(a07Var4);
                    Object objQ13 = dd4Var2.Q();
                    if (zF7 || objQ13 == obj) {
                        objQ13 = new r02(a07Var4, 10);
                        dd4Var2.p0(objQ13);
                    }
                    kb4 kb4Var3 = (kb4) objQ13;
                    boolean zF8 = dd4Var2.f(a07Var4) | (i6 == 256);
                    Object objQ14 = dd4Var2.Q();
                    if (zF8 || objQ14 == obj) {
                        objQ14 = new xj0(t27Var2, a07Var4, 7);
                        dd4Var2.p0(objQ14);
                    }
                    wn9.c(zBooleanValue3, null, str6, kb4Var3, (ib4) objQ14, dd4Var2, 0);
                    z2 = false;
                    dd4Var2.q(false);
                } else {
                    z2 = false;
                    dd4Var2.f0(1342575376);
                    dd4Var2.q(false);
                }
                dd4Var2.q(z2);
            } else {
                t27Var2 = t27Var;
                dd4Var2 = dd4Var;
                dd4Var2.f0(1342581328);
                dd4Var2.q(false);
            }
        } else {
            dd4Var2 = dd4Var;
            t27Var2 = t27Var;
            dd4Var2.Y();
        }
        ye8 ye8VarU = dd4Var2.u();
        if (ye8VarU != null) {
            ye8VarU.d = new nq2(str, str2, t27Var2, i2, 0);
        }
    }

    public static ha5 m0(int[] iArr) {
        return new ha5(0, iArr.length - 1, 1);
    }

    public static final void n(ou6 ou6Var, rj1 rj1Var, dd4 dd4Var, int i2) {
        dd4Var.h0(-1540139328);
        int i3 = 1;
        if (dd4Var.V(i2 & 1, (i2 & 19) != 18)) {
            lx1.b(gjb.n0(tg9.f(ou6Var, 1.0f), 16.0f, 0.0f, 2), null, rj1Var, dd4Var, 384);
        } else {
            dd4Var.Y();
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new vu1(ou6Var, rj1Var, i2, i3);
        }
    }

    public static int n0(long[] jArr) {
        jArr.getClass();
        return jArr.length - 1;
    }

    public static final void o(String str, ou6 ou6Var, dd4 dd4Var, int i2) {
        dd4 dd4Var2 = dd4Var;
        dd4Var2.h0(-93941538);
        int i3 = 4;
        int i4 = i2 | (dd4Var2.f(str) ? 4 : 2);
        if (dd4Var2.V(i4 & 1, (i4 & 19) != 18)) {
            ie1 ie1VarA = ge1.a(pv.c, bv4.z, dd4Var2, 0);
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
            un9.s(ll1.f, dd4Var2, ie1VarA);
            un9.s(ll1.e, dd4Var2, lr7VarL);
            un9.s(ll1.g, dd4Var2, Integer.valueOf(iHashCode));
            un9.r(dd4Var2, ll1.h);
            un9.s(ll1.d, dd4Var2, ou6VarL0);
            String strK = wn9.K((pv9) iu9.I.getValue(), dd4Var2);
            ur9 ur9Var = s96.a;
            nha.c(strK, (ou6) null, ((q96) dd4Var2.j(ur9Var)).a.a, (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, (vaa) null, 0L, 0, false, 0, 0, (kb4) null, ((q96) dd4Var2.j(ur9Var)).b.g, dd4Var, 0, 0, 131066);
            dd4Var2 = dd4Var;
            un9.a(dd4Var2, tg9.h(lu6.a, 16.0f));
            tu1.l(null, jf0.G(-174089609, new z31(str, i3), dd4Var2), dd4Var2, 48);
            dd4Var2.q(true);
        } else {
            dd4Var2.Y();
        }
        ye8 ye8VarU = dd4Var2.u();
        if (ye8VarU != null) {
            ye8VarU.d = new b7(str, ou6Var, i2, 2);
        }
    }

    public static final Paint o0(k2b k2bVar) {
        if (k2bVar == null) {
            p75.a("Extracting native reference is only supported from androidx.compose.ui.graphics.AndroidPaint instances but received " + ug8.a(k2bVar.getClass()).f());
        }
        return (Paint) k2bVar.b;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:39:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void p(int r33, int r34, int r35, dd4 r36, ou6 r37, java.lang.String r38) {
        /*
            Method dump skipped, instruction units count: 350
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fw.p(int, int, int, dd4, ou6, java.lang.String):void");
    }

    public static Object p0(int i2, Object[] objArr) {
        objArr.getClass();
        if (i2 < 0 || i2 >= objArr.length) {
            return null;
        }
        return objArr[i2];
    }

    /* JADX WARN: Removed duplicated region for block: B:139:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x02da  */
    /* JADX WARN: Removed duplicated region for block: B:144:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00df  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void q(final boolean r28, final defpackage.kb4 r29, ou6 r30, boolean r31, defpackage.kb4 r32, t89 r33, long r34, long r36, float r38, long r39, defpackage.yb4 r41, final defpackage.rj1 r42, dd4 r43, final int r44, final int r45, final int r46) {
        /*
            Method dump skipped, instruction units count: 757
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fw.q(boolean, kb4, ou6, boolean, kb4, t89, long, long, float, long, yb4, rj1, dd4, int, int, int):void");
    }

    public static double q0(double[] dArr) {
        dArr.getClass();
        double[] dArrI = vw1.I(dArr, q);
        double dH = H(dArrI[0]);
        double dH2 = H(dArrI[1]);
        double dH3 = H(dArrI[2]);
        return Math.atan2(tw2.a(dH3, 2.0d, dH + dH2, 9.0d), ((((-12.0d) * dH2) + (dH * 11.0d)) + dH3) / 11.0d);
    }

    /* JADX WARN: Removed duplicated region for block: B:123:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:128:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00c4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void r(final boolean r25, final defpackage.kb4 r26, ou6 r27, boolean r28, long r29, long r31, float r33, long r34, float r36, final defpackage.rj1 r37, dd4 r38, final int r39, final int r40) {
        /*
            Method dump skipped, instruction units count: 632
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fw.r(boolean, kb4, ou6, boolean, long, long, float, long, float, rj1, dd4, int, int):void");
    }

    public static int r0(Object obj, Object[] objArr) {
        objArr.getClass();
        int i2 = 0;
        if (obj == null) {
            int length = objArr.length;
            while (i2 < length) {
                if (objArr[i2] == null) {
                    return i2;
                }
                i2++;
            }
            return -1;
        }
        int length2 = objArr.length;
        while (i2 < length2) {
            if (obj.equals(objArr[i2])) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    public static final k2b s() {
        return new k2b(new Paint(7));
    }

    public static double s0(double d2) {
        double dAbs = Math.abs(d2);
        return Math.pow(Math.max(0.0d, (27.13d * dAbs) / (400.0d - dAbs)), 2.380952380952381d) * ((double) (d2 < 0.0d ? -1 : d2 == 0.0d ? 0 : 1));
    }

    public static final void t(final int i2, int i3, long j2, long j3, zb4 zb4Var, dd4 dd4Var, ou6 ou6Var) {
        int i4;
        long j4;
        long j5;
        int i5;
        final long j6;
        final long jC;
        dd4Var.h0(-849216856);
        if ((i3 & 6) == 0) {
            i4 = (dd4Var.d(i2) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= 16;
        }
        if ((i3 & 384) == 0) {
            i4 |= Token.CASE;
        }
        if ((i3 & 3072) == 0) {
            i4 |= dd4Var.h(zb4Var) ? 2048 : 1024;
        }
        if ((i3 & 24576) == 0) {
            i4 |= dd4Var.f(ou6Var) ? 16384 : 8192;
        }
        if (dd4Var.V(i4 & 1, (i4 & 9363) != 9362)) {
            dd4Var.a0();
            if ((i3 & 1) == 0 || dd4Var.C()) {
                ur9 ur9Var = s96.a;
                i5 = i4 & (-1009);
                j6 = ((q96) dd4Var.j(ur9Var)).a.a;
                jC = lc1.c(0.2f, ((q96) dd4Var.j(ur9Var)).a.a);
            } else {
                dd4Var.Y();
                i5 = i4 & (-1009);
                j6 = j2;
                jC = j3;
            }
            dd4Var.r();
            ha6 ha6VarD = pn0.d(bv4.b, false);
            int iHashCode = Long.hashCode(dd4Var.T);
            lr7 lr7VarL = dd4Var.l();
            ou6 ou6VarL0 = s32.L0(dd4Var, ou6Var);
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
            px3 px3Var = tg9.c;
            boolean zE = dd4Var.e(jC) | dd4Var.e(j6) | ((i5 & 14) == 4);
            Object objQ = dd4Var.Q();
            if (zE || objQ == vl1.a) {
                kb4 kb4Var = new kb4() { // from class: y38
                    @Override // defpackage.kb4
                    public final Object invoke(Object obj) {
                        r43 r43Var = (r43) obj;
                        r43Var.getClass();
                        r43.J(r43Var, jC, 0L, r43Var.f(), 0.0f, (jw9) null, Token.FUNCTION);
                        long jF = r43Var.f();
                        r43.J(r43Var, j6, 0L, (((long) Float.floatToRawIntBits((Float.intBitsToFloat((int) (r43Var.f() >> 32)) * i2) / 100.0f)) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (jF & 4294967295L)))) & 4294967295L), 0.0f, (jw9) null, Token.FUNCTION);
                        return heb.a;
                    }
                };
                dd4Var.p0(kb4Var);
                objQ = kb4Var;
            }
            s32.F(px3Var, (kb4) objQ, dd4Var, 6);
            zb4Var.c(zn0.a, dd4Var, Integer.valueOf(((i5 >> 6) & Token.ASSIGN_MOD) | 6));
            dd4Var.q(true);
            j5 = jC;
            j4 = j6;
        } else {
            dd4Var.Y();
            j4 = j2;
            j5 = j3;
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new kc0(i2, j4, j5, zb4Var, ou6Var, i3);
        }
    }

    public static boolean t0(double d2) {
        return 0.0d <= d2 && d2 <= 100.0d;
    }

    public static final void u(int i2, ib4 ib4Var, dd4 dd4Var, ou6 ou6Var, boolean z2) {
        int i3;
        dd4Var.h0(746248112);
        int i4 = 2;
        if ((i2 & 6) == 0) {
            i3 = (dd4Var.g(z2) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= dd4Var.f(ou6Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= dd4Var.h(ib4Var) ? 256 : Token.CASE;
        }
        byte b2 = 0;
        int i5 = 1;
        if (dd4Var.V(i3 & 1, (i3 & Token.EXPR_VOID) != 146)) {
            boolean z3 = ((i3 & 14) == 4) | ((i3 & 896) == 256);
            Object objQ = dd4Var.Q();
            if (z3 || objQ == vl1.a) {
                objQ = new at1(z2, ib4Var, i5);
                dd4Var.p0(objQ);
            }
            ww1.g((ib4) objQ, ou6Var, null, 0L, 0L, null, jf0.G(873142450, new e41(z2, i4, b2), dd4Var), dd4Var, (i3 & Token.ASSIGN_MOD) | 12582912, Token.IMPORT);
        } else {
            dd4Var.Y();
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new fj(z2, ou6Var, ib4Var, i2, 3);
        }
    }

    public static final boolean u0(KeyEvent keyEvent) {
        long jC = vw1.C(keyEvent);
        int i2 = aj5.R;
        return aj5.a(jC, aj5.h) || aj5.a(jC, aj5.t) || aj5.a(jC, aj5.G) || aj5.a(jC, aj5.s);
    }

    public static final void v(fn8 fn8Var, ou6 ou6Var, dd4 dd4Var, int i2) {
        dd4Var.h0(74804898);
        int i3 = i2 & 1;
        if (!dd4Var.V(i3, i3 != 0)) {
            dd4Var.Y();
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new il6(fn8Var, ou6Var, i2, 20);
        }
    }

    public static boolean v0(int i2, Object obj) {
        if (obj instanceof ub4) {
            if ((obj instanceof ic4 ? ((ic4) obj).getArity() : obj instanceof ib4 ? 0 : obj instanceof kb4 ? 1 : obj instanceof yb4 ? 2 : obj instanceof zb4 ? 3 : obj instanceof ac4 ? 4 : obj instanceof bc4 ? 5 : obj instanceof cc4 ? 6 : obj instanceof dc4 ? 7 : obj instanceof ec4 ? 8 : obj instanceof fc4 ? 9 : obj instanceof jb4 ? 10 : obj instanceof lb4 ? 11 : obj instanceof mb4 ? 12 : obj instanceof nb4 ? 13 : obj instanceof ob4 ? 14 : obj instanceof pb4 ? 15 : obj instanceof qb4 ? 16 : obj instanceof rb4 ? 17 : obj instanceof sb4 ? 18 : obj instanceof tb4 ? 19 : obj instanceof vb4 ? 20 : obj instanceof wb4 ? 21 : -1) == i2) {
                return true;
            }
        }
        return false;
    }

    public static final void w(long j2, ib4 ib4Var, boolean z2, dd4 dd4Var, int i2) {
        dd4Var.h0(-432413022);
        int i3 = 4;
        int i4 = i2 | (dd4Var.e(j2) ? 4 : 2) | (dd4Var.h(ib4Var) ? 32 : 16) | (dd4Var.g(z2) ? 256 : Token.CASE);
        if (!dd4Var.V(i4 & 1, (i4 & Token.EXPR_VOID) != 146)) {
            dd4Var.Y();
        } else if (j2 != 16) {
            dd4Var.f0(-1409282350);
            br9 br9VarB = an.b(z2 ? 1.0f : 0.0f, new p9b(0, (a83) null, 7), (String) null, dd4Var, 48, 28);
            ou6 ou6VarB = lu6.a;
            Object obj = vl1.a;
            if (z2) {
                dd4Var.f0(-1409110486);
                boolean z3 = (i4 & Token.ASSIGN_MOD) == 32;
                Object objQ = dd4Var.Q();
                if (z3 || objQ == obj) {
                    objQ = new s50(i3, ib4Var);
                    dd4Var.p0(objQ);
                }
                ou6 ou6VarB2 = r1a.b(ou6VarB, ib4Var, (PointerInputEventHandler) objQ);
                Object objQ2 = dd4Var.Q();
                if (objQ2 == obj) {
                    objQ2 = new zm6(15);
                    dd4Var.p0(objQ2);
                }
                ou6VarB = a29.b(ou6VarB2, (kb4) objQ2);
                dd4Var.q(false);
            } else {
                dd4Var.f0(-1408867136);
                dd4Var.q(false);
            }
            ou6 ou6VarE = tg9.c.e(ou6VarB);
            boolean zF = dd4Var.f(br9VarB) | ((i4 & 14) == 4);
            Object objQ3 = dd4Var.Q();
            if (zF || objQ3 == obj) {
                objQ3 = new mo6(j2, br9VarB, 0);
                dd4Var.p0(objQ3);
            }
            s32.F(ou6VarE, (kb4) objQ3, dd4Var, 0);
            dd4Var.q(false);
        } else {
            dd4Var.f0(-1408653856);
            dd4Var.q(false);
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new no6(j2, ib4Var, z2, i2);
        }
    }

    public static boolean w0(Object obj) {
        if (obj instanceof Map.Entry) {
            return !(obj instanceof fi5) || (obj instanceof ii5);
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x03ac  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x03b7  */
    /* JADX WARN: Removed duplicated region for block: B:82:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void x(ou6 r98, boolean r99, float r100, dd4 r101, int r102, int r103) {
        /*
            Method dump skipped, instruction units count: 964
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fw.x(ou6, boolean, float, dd4, int, int):void");
    }

    public static String x0(Object[] objArr, String str, String str2, String str3, u3c u3cVar, int i2) {
        if ((i2 & 1) != 0) {
            str = ", ";
        }
        if ((i2 & 2) != 0) {
            str2 = "";
        }
        if ((i2 & 4) != 0) {
            str3 = "";
        }
        if ((i2 & 32) != 0) {
            u3cVar = null;
        }
        objArr.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) str2);
        int i3 = 0;
        for (Object obj : objArr) {
            i3++;
            if (i3 > 1) {
                sb.append((CharSequence) str);
            }
            xg9.d(sb, obj, u3cVar);
        }
        sb.append((CharSequence) str3);
        return sb.toString();
    }

    public static final void y(ou6 ou6Var, dd4 dd4Var, int i2) {
        dd4Var.h0(76332761);
        if (dd4Var.V(i2 & 1, (i2 & 3) != 2)) {
            ou6 ou6VarL = fe.L(ou6Var, ww1.R(dd4Var) ? lc1.b : lc1.e, jf0.G);
            ha6 ha6VarD = pn0.d(bv4.b, false);
            int iHashCode = Long.hashCode(dd4Var.T);
            lr7 lr7VarL = dd4Var.l();
            ou6 ou6VarL0 = s32.L0(dd4Var, ou6VarL);
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
            i12.g(i25.b((m53) f53.z.getValue(), dd4Var), "", tg9.n(t96.w(zn0.a.a(lu6.a, bv4.f), tp8.a), 160.0f), (f9) null, ra1.d, 0.0f, (qc1) null, dd4Var, 24632, Token.ASSIGN_LOGICAL_AND);
            dd4Var.q(true);
        } else {
            dd4Var.Y();
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new ot(ou6Var, i2, 0);
        }
    }

    public static Object y0(Object[] objArr) {
        if (objArr.length != 0) {
            return objArr[objArr.length - 1];
        }
        so9.n("Array is empty.");
        return null;
    }

    public static final void z(boolean z2, ib4 ib4Var, dd4 dd4Var, int i2) {
        int i3;
        ib4Var.getClass();
        dd4Var.h0(-1462233880);
        if ((i2 & 6) == 0) {
            i3 = (dd4Var.g(z2) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= dd4Var.h(ib4Var) ? 32 : 16;
        }
        int i4 = 1;
        if (dd4Var.V(i3 & 1, (i3 & 19) != 18)) {
            m79.b(z2, ib4Var, dd4Var, i3 & Token.ELSE);
        } else {
            dd4Var.Y();
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new jb0(z2, ib4Var, i2, i4);
        }
    }

    public static Float z0(float[] fArr) {
        fArr.getClass();
        if (fArr.length == 0) {
            return null;
        }
        return Float.valueOf(fArr[fArr.length - 1]);
    }
}
