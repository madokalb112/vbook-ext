package defpackage;

import android.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.chromium.support_lib_boundary.StaticsBoundaryInterface;
import org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class js8 implements vwb, t91, mb8, lv, ix1, en4, nw3, ob7 {
    public static final /* synthetic */ js8 b = new js8(1);
    public static final js8 c = new js8(3);
    public static final js8 d = new js8(4);
    public static final String[] e = new String[0];
    public static final js8 f = new js8(6);
    public static final js8 s = new js8(7);
    public static final js8 t = new js8(8);
    public static final js8 u = new js8(9);
    public static final js8 v = new js8(10);
    public static final js8 w = new js8(11);
    public static final so9 x = new so9(8);
    public static final xub y = new xub();
    public final /* synthetic */ int a;

    public /* synthetic */ js8(int i) {
        this.a = i;
    }

    public static final String g(char[] cArr, String[] strArr, int i, int i2) {
        ab6 ab6Var = h31.z;
        if (i2 > 12) {
            cArr.getClass();
            return iw9.y(cArr, i, i2 + i);
        }
        if (i2 < 1) {
            return "";
        }
        int i3 = i2 + i;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = i; i6 < i3; i6++) {
            cArr.getClass();
            i5 = (i5 * 31) + cArr[i6];
        }
        int i7 = i5 & 511;
        strArr.getClass();
        String str = strArr[i7];
        if (str != null && i2 == str.length()) {
            int i8 = i;
            while (true) {
                int i9 = i2 - 1;
                if (i2 == 0) {
                    return str;
                }
                cArr.getClass();
                int i10 = i8 + 1;
                int i11 = i4 + 1;
                if (cArr[i8] != str.charAt(i4)) {
                    break;
                }
                i8 = i10;
                i2 = i9;
                i4 = i11;
            }
        }
        cArr.getClass();
        String strY = iw9.y(cArr, i, i3);
        strArr[i7] = strY;
        return strY;
    }

    public static String l(int i, String str) {
        List listY;
        str.getClass();
        StringBuilder sb = new StringBuilder();
        if (i < 0) {
            String string = bw9.B0(str).toString();
            Pattern patternCompile = Pattern.compile("\\s+");
            patternCompile.getClass();
            string.getClass();
            bw9.m0(0);
            Matcher matcher = patternCompile.matcher(string);
            if (matcher.find()) {
                ArrayList arrayList = new ArrayList(10);
                int iEnd = 0;
                do {
                    arrayList.add(string.subSequence(iEnd, matcher.start()).toString());
                    iEnd = matcher.end();
                } while (matcher.find());
                arrayList.add(string.subSequence(iEnd, string.length()).toString());
                listY = arrayList;
            } else {
                listY = gc1.Y(string.toString());
            }
            i += listY.size();
        }
        int length = str.length();
        int i2 = 0;
        boolean z = true;
        for (int i3 = 0; i3 < length; i3++) {
            char cCharAt = str.charAt(i3);
            if (z && Character.isLetter(cCharAt) && i2 < i) {
                sb.append(Character.toUpperCase(cCharAt));
                i2++;
                z = false;
            } else {
                sb.append(Character.toLowerCase(cCharAt));
            }
            if (gjb.h0(cCharAt)) {
                z = true;
            }
        }
        return sb.toString();
    }

    public static ly5 p(List list, float f2, int i) {
        return new ly5(0, (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L), (((long) Float.floatToRawIntBits((i & 4) != 0 ? Float.POSITIVE_INFINITY : f2)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L), list, null);
    }

    public static ly5 q(xl7[] xl7VarArr, long j, long j2) {
        ArrayList arrayList = new ArrayList(xl7VarArr.length);
        for (xl7 xl7Var : xl7VarArr) {
            arrayList.add(new lc1(((lc1) xl7Var.b).a));
        }
        ArrayList arrayList2 = new ArrayList(xl7VarArr.length);
        for (xl7 xl7Var2 : xl7VarArr) {
            arrayList2.add(Float.valueOf(((Number) xl7Var2.a).floatValue()));
        }
        return new ly5(0, j, j2, arrayList, arrayList2);
    }

    public static String s(String str) {
        return j39.l("[ˆ̛̆]", j39.l("[̣̀́̃̉]", iw9.H(iw9.H(j39.l("[yỳýỵỷỹ]", j39.l("[YÝỲỸỴ]", j39.l("[uùúụủũưừứựửữ]", j39.l("[UÚÙŨỤƯỨỪỮỰ]", j39.l("[oòóọỏõôồốộổỗơờớợởỡ]", j39.l("[OÓÒÕỌÔỐỒỖỘƠỚỜỠỢ]", j39.l("[iìíịỉĩ]", j39.l("[IÍÌĨỊ]", j39.l("[eèéẹẻẽêềếệểễ]", j39.l("[EÉÈẼẸÊẾỀỄỆ]", j39.l("[aàáạảãâầấậẩẫăằắặẳẵ]", j39.l("[AÁÀÃẠÂẤẦẪẬĂẮẰẴẶ]", str, "A"), "a"), "E"), "e"), "I"), "i"), "O"), "o"), "U"), "u"), "Y"), "y"), false, "Đ", "D"), false, "đ", "d"), ""), "");
    }

    public static ArrayList u(String str, char... cArr) {
        Character chValueOf;
        int iW;
        str.getClass();
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (i != -1) {
            int length = cArr.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    chValueOf = null;
                    iW = -1;
                    break;
                }
                char c2 = cArr[i2];
                iW = bw9.W(str, c2, i, 4);
                if (iW != -1) {
                    chValueOf = Character.valueOf(c2);
                    break;
                }
                i2++;
            }
            if (iW == -1) {
                break;
            }
            arrayList.add(new xl7(str.substring(i, iW), chValueOf));
            i = iW + 1;
        }
        if (i < str.length()) {
            arrayList.add(new xl7(str.substring(i), null));
        }
        return arrayList;
    }

    public static ly5 x(List list, float f2, int i) {
        return new ly5(0, (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L), (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits((i & 4) != 0 ? Float.POSITIVE_INFINITY : f2)) & 4294967295L), list, null);
    }

    public static ly5 y(xl7[] xl7VarArr) {
        return q((xl7[]) Arrays.copyOf(xl7VarArr, xl7VarArr.length), (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L), (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(Float.POSITIVE_INFINITY)) & 4294967295L));
    }

    public float a() {
        return 0.0f;
    }

    @Override // defpackage.nw3
    public String c() {
        return null;
    }

    public tn7 d(an4 an4Var, wm4 wm4Var) {
        return new dn4(an4Var, wm4Var);
    }

    public void e(pn2 pn2Var, int i, int[] iArr, zm5 zm5Var, int[] iArr2) {
        if (zm5Var == zm5.a) {
            pv.c(i, iArr, iArr2, false);
        } else {
            pv.c(i, iArr, iArr2, true);
        }
    }

    public StaticsBoundaryInterface getStatics() {
        throw new UnsupportedOperationException("This should never happen, if this method was called it means we're trying to reach into WebView APK code on an incompatible device. This most likely means the current method is being called too early, or is being called on start-up rather than lazily");
    }

    public WebkitToCompatConverterBoundaryInterface getWebkitToCompatConverter() {
        throw new UnsupportedOperationException("This should never happen, if this method was called it means we're trying to reach into WebView APK code on an incompatible device. This most likely means the current method is being called too early, or is being called on start-up rather than lazily");
    }

    public String[] h() {
        return e;
    }

    public float i(float f2) {
        double d2 = f2;
        return (float) (d2 <= 0.04045d ? d2 / 12.92d : tw1.j0((d2 + 0.055d) / 1.055d, 2.4d));
    }

    public tn7 j() {
        return new dn4(an4.n, (wm4) null);
    }

    public boolean k(int i) {
        return 4 <= i || Log.isLoggable("FirebaseCrashlytics", i);
    }

    public void m(String str) {
        if (k(3)) {
            Log.d("FirebaseCrashlytics", str, null);
        }
    }

    public float o(float f2) {
        double d2 = f2;
        return (float) (d2 <= 0.0031308d ? d2 * 12.92d : (tw1.j0(d2, 0.4166666666666667d) * 1.055d) - 0.055d);
    }

    public void r(pn2 pn2Var, int i, int[] iArr, int[] iArr2) {
        pv.c(i, iArr, iArr2, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.t91
    public void t(is4 is4Var, o1a o1aVar) throws v0 {
        jt1 jt1Var = null;
        switch (this.a) {
            case 9:
                zb4 zb4Var = (zb4) o1aVar;
                is4Var.getClass();
                uf4 uf4Var = new uf4("BeforeReceive", 29);
                ru4 ru4Var = is4Var.e;
                uf4 uf4Var2 = ru4.o;
                ru4Var.getClass();
                uf4Var2.getClass();
                if (!ru4Var.e(uf4Var)) {
                    int iC = ru4Var.c(uf4Var2);
                    if (iC == -1) {
                        throw new v0("Phase " + uf4Var2 + " was not registered for this pipeline", 3);
                    }
                    ru4Var.a.add(iC, new es7(uf4Var, new ft7()));
                }
                ru4Var.g(uf4Var, new c8(zb4Var, jt1Var, 2));
                return;
            default:
                is4Var.getClass();
                is4Var.d.g(ru4.j, new c8((zb4) o1aVar, jt1Var, 8));
                return;
        }
    }

    public String toString() {
        switch (this.a) {
            case 15:
                return "Arrangement#SpaceEvenly";
            default:
                return super.toString();
        }
    }

    public void v(String str) {
        if (k(2)) {
            Log.v("FirebaseCrashlytics", str, null);
        }
    }

    public void z(String str, Exception exc) {
        if (k(5)) {
            Log.w("FirebaseCrashlytics", str, exc);
        }
    }

    @Override // defpackage.nw3
    public void b() {
    }

    public int n(int i) {
        return i;
    }

    public int w(int i) {
        return i;
    }

    @Override // defpackage.nw3
    public void f(long j, String str) {
    }
}
