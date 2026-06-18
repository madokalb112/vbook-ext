package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public abstract class bw9 extends iw9 {
    public static Boolean A0(String str) {
        str.getClass();
        if (str.equals("true")) {
            return Boolean.TRUE;
        }
        if (str.equals("false")) {
            return Boolean.FALSE;
        }
        return null;
    }

    public static CharSequence B0(CharSequence charSequence) {
        charSequence.getClass();
        int length = charSequence.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            boolean zH0 = gjb.h0(charSequence.charAt(!z ? i : length));
            if (z) {
                if (!zH0) {
                    break;
                }
                length--;
            } else if (zH0) {
                i++;
            } else {
                z = true;
            }
        }
        return charSequence.subSequence(i, length + 1);
    }

    public static String C0(String str, char... cArr) {
        str.getClass();
        int length = str.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            char cCharAt = str.charAt(!z ? i : length);
            int length2 = cArr.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length2) {
                    i2 = -1;
                    break;
                }
                if (cCharAt == cArr[i2]) {
                    break;
                }
                i2++;
            }
            boolean z2 = i2 >= 0;
            if (z) {
                if (!z2) {
                    break;
                }
                length--;
            } else if (z2) {
                i++;
            } else {
                z = true;
            }
        }
        return str.subSequence(i, length + 1).toString();
    }

    public static CharSequence D0(String str) {
        int length = str.length() - 1;
        if (length < 0) {
            return "";
        }
        while (true) {
            int i = length - 1;
            if (!gjb.h0(str.charAt(length))) {
                return str.subSequence(0, length + 1);
            }
            if (i < 0) {
                return "";
            }
            length = i;
        }
    }

    public static String E0(String str, char... cArr) {
        CharSequence charSequenceSubSequence;
        str.getClass();
        int length = str.length() - 1;
        if (length >= 0) {
            while (true) {
                int i = length - 1;
                char cCharAt = str.charAt(length);
                int length2 = cArr.length;
                int i2 = 0;
                while (true) {
                    if (i2 >= length2) {
                        i2 = -1;
                        break;
                    }
                    if (cCharAt == cArr[i2]) {
                        break;
                    }
                    i2++;
                }
                if (i2 < 0) {
                    charSequenceSubSequence = str.subSequence(0, length + 1);
                    break;
                }
                if (i < 0) {
                    break;
                }
                length = i;
            }
            charSequenceSubSequence = "";
        } else {
            charSequenceSubSequence = "";
        }
        return charSequenceSubSequence.toString();
    }

    public static CharSequence F0(String str) {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            if (!gjb.h0(str.charAt(i))) {
                return str.subSequence(i, str.length());
            }
        }
        return "";
    }

    public static String G0(String str, char... cArr) {
        CharSequence charSequenceSubSequence;
        str.getClass();
        int length = str.length();
        int i = 0;
        while (true) {
            if (i >= length) {
                charSequenceSubSequence = "";
                break;
            }
            char cCharAt = str.charAt(i);
            int length2 = cArr.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length2) {
                    i2 = -1;
                    break;
                }
                if (cCharAt == cArr[i2]) {
                    break;
                }
                i2++;
            }
            if (i2 < 0) {
                charSequenceSubSequence = str.subSequence(i, str.length());
                break;
            }
            i++;
        }
        return charSequenceSubSequence.toString();
    }

    public static boolean O(CharSequence charSequence, CharSequence charSequence2, boolean z) {
        charSequence.getClass();
        charSequence2.getClass();
        if (charSequence2 instanceof String) {
            if (X(charSequence, (String) charSequence2, 0, z, 2) >= 0) {
                return true;
            }
        } else if (V(charSequence, charSequence2, 0, charSequence.length(), z, false) >= 0) {
            return true;
        }
        return false;
    }

    public static boolean P(CharSequence charSequence, char c) {
        charSequence.getClass();
        return W(charSequence, c, 0, 2) >= 0;
    }

    public static boolean Q(CharSequence charSequence, char c) {
        return charSequence.length() > 0 && gjb.c0(charSequence.charAt(charSequence.length() - 1), c, false);
    }

    public static boolean R(CharSequence charSequence, String str) {
        charSequence.getClass();
        return charSequence instanceof String ? iw9.C((String) charSequence, str, false) : j0(charSequence, charSequence.length() - str.length(), str, 0, str.length(), false);
    }

    public static char S(String str) {
        str.getClass();
        if (str.length() != 0) {
            return str.charAt(0);
        }
        so9.n("Char sequence is empty.");
        return (char) 0;
    }

    public static int T(CharSequence charSequence) {
        charSequence.getClass();
        return charSequence.length() - 1;
    }

    public static int U(CharSequence charSequence, String str, int i, boolean z) {
        charSequence.getClass();
        str.getClass();
        return (z || !(charSequence instanceof String)) ? V(charSequence, str, i, charSequence.length(), z, false) : ((String) charSequence).indexOf(str, i);
    }

    public static final int V(CharSequence charSequence, CharSequence charSequence2, int i, int i2, boolean z, boolean z2) {
        ga5 ga5Var;
        if (z2) {
            int iT = T(charSequence);
            if (i > iT) {
                i = iT;
            }
            if (i2 < 0) {
                i2 = 0;
            }
            ga5Var = new ga5(i, i2, -1);
        } else {
            if (i < 0) {
                i = 0;
            }
            int length = charSequence.length();
            if (i2 > length) {
                i2 = length;
            }
            ga5Var = new ha5(i, i2, 1);
        }
        boolean z3 = charSequence instanceof String;
        int i3 = ga5Var.c;
        int i4 = ga5Var.b;
        int i5 = ga5Var.a;
        if (!z3 || !(charSequence2 instanceof String)) {
            boolean z4 = z;
            if ((i3 > 0 && i5 <= i4) || (i3 < 0 && i4 <= i5)) {
                while (true) {
                    CharSequence charSequence3 = charSequence;
                    CharSequence charSequence4 = charSequence2;
                    boolean z5 = z4;
                    z4 = z5;
                    if (!j0(charSequence4, 0, charSequence3, i5, charSequence2.length(), z5)) {
                        if (i5 == i4) {
                            break;
                        }
                        i5 += i3;
                        charSequence2 = charSequence4;
                        charSequence = charSequence3;
                    } else {
                        return i5;
                    }
                }
            }
        } else if ((i3 > 0 && i5 <= i4) || (i3 < 0 && i4 <= i5)) {
            int i6 = i5;
            while (true) {
                String str = (String) charSequence2;
                boolean z6 = z;
                if (!iw9.F(0, i6, str.length(), str, (String) charSequence, z6)) {
                    if (i6 == i4) {
                        break;
                    }
                    i6 += i3;
                    z = z6;
                } else {
                    return i6;
                }
            }
        }
        return -1;
    }

    public static int W(CharSequence charSequence, char c, int i, int i2) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        charSequence.getClass();
        return !(charSequence instanceof String) ? Y(charSequence, new char[]{c}, i, false) : ((String) charSequence).indexOf(c, i);
    }

    public static /* synthetic */ int X(CharSequence charSequence, String str, int i, boolean z, int i2) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return U(charSequence, str, i, z);
    }

    public static final int Y(CharSequence charSequence, char[] cArr, int i, boolean z) {
        charSequence.getClass();
        if (!z && cArr.length == 1 && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(fw.F0(cArr), i);
        }
        if (i < 0) {
            i = 0;
        }
        int length = charSequence.length() - 1;
        if (i > length) {
            return -1;
        }
        while (true) {
            char cCharAt = charSequence.charAt(i);
            for (char c : cArr) {
                if (gjb.c0(c, cCharAt, z)) {
                    return i;
                }
            }
            if (i == length) {
                return -1;
            }
            i++;
        }
    }

    public static /* synthetic */ int Z(CharSequence charSequence, char[] cArr, int i, int i2) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        return Y(charSequence, cArr, i, false);
    }

    public static boolean a0(CharSequence charSequence) {
        charSequence.getClass();
        for (int i = 0; i < charSequence.length(); i++) {
            if (!gjb.h0(charSequence.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public static char b0(CharSequence charSequence) {
        charSequence.getClass();
        if (charSequence.length() != 0) {
            return charSequence.charAt(charSequence.length() - 1);
        }
        so9.n("Char sequence is empty.");
        return (char) 0;
    }

    public static int c0(int i, String str, String str2) {
        int iT = (i & 2) != 0 ? T(str) : 0;
        str.getClass();
        str2.getClass();
        return str.lastIndexOf(str2, iT);
    }

    public static int d0(CharSequence charSequence, char c, int i, int i2) {
        if ((i2 & 2) != 0) {
            i = T(charSequence);
        }
        charSequence.getClass();
        return !(charSequence instanceof String) ? e0(charSequence, new char[]{c}, i) : ((String) charSequence).lastIndexOf(c, i);
    }

    public static final int e0(CharSequence charSequence, char[] cArr, int i) {
        charSequence.getClass();
        if (cArr.length == 1 && (charSequence instanceof String)) {
            return ((String) charSequence).lastIndexOf(fw.F0(cArr), i);
        }
        int length = charSequence.length() - 1;
        if (i > length) {
            i = length;
        }
        while (-1 < i) {
            char cCharAt = charSequence.charAt(i);
            for (char c : cArr) {
                if (gjb.c0(c, cCharAt, false)) {
                    return i;
                }
            }
            i--;
        }
        return -1;
    }

    public static Character f0(CharSequence charSequence) {
        charSequence.getClass();
        if (charSequence.length() == 0) {
            return null;
        }
        return Character.valueOf(charSequence.charAt(charSequence.length() - 1));
    }

    public static List g0(String str) {
        str.getClass();
        qy5 qy5Var = new qy5(str);
        if (!qy5Var.hasNext()) {
            return lc3.a;
        }
        Object next = qy5Var.next();
        if (!qy5Var.hasNext()) {
            return gc1.Y(next);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(next);
        while (qy5Var.hasNext()) {
            arrayList.add(qy5Var.next());
        }
        return arrayList;
    }

    public static String h0(int i, String str) {
        CharSequence charSequenceSubSequence;
        str.getClass();
        if (i < 0) {
            gp.l(xv5.k(i, "Desired length ", " is less than zero."));
            return null;
        }
        if (i <= str.length()) {
            charSequenceSubSequence = str.subSequence(0, str.length());
        } else {
            StringBuilder sb = new StringBuilder(i);
            sb.append((CharSequence) str);
            int length = i - str.length();
            int i2 = 1;
            if (1 <= length) {
                while (true) {
                    sb.append(' ');
                    if (i2 == length) {
                        break;
                    }
                    i2++;
                }
            }
            charSequenceSubSequence = sb;
        }
        return charSequenceSubSequence.toString();
    }

    public static String i0(int i, String str) {
        CharSequence charSequenceSubSequence;
        str.getClass();
        if (i < 0) {
            gp.l(xv5.k(i, "Desired length ", " is less than zero."));
            return null;
        }
        if (i <= str.length()) {
            charSequenceSubSequence = str.subSequence(0, str.length());
        } else {
            StringBuilder sb = new StringBuilder(i);
            int length = i - str.length();
            int i2 = 1;
            if (1 <= length) {
                while (true) {
                    sb.append('0');
                    if (i2 == length) {
                        break;
                    }
                    i2++;
                }
            }
            sb.append((CharSequence) str);
            charSequenceSubSequence = sb;
        }
        return charSequenceSubSequence.toString();
    }

    public static final boolean j0(CharSequence charSequence, int i, CharSequence charSequence2, int i2, int i3, boolean z) {
        charSequence.getClass();
        charSequence2.getClass();
        if (i2 < 0 || i < 0 || i > charSequence.length() - i3 || i2 > charSequence2.length() - i3) {
            return false;
        }
        for (int i4 = 0; i4 < i3; i4++) {
            if (!gjb.c0(charSequence.charAt(i + i4), charSequence2.charAt(i2 + i4), z)) {
                return false;
            }
        }
        return true;
    }

    public static String k0(String str, String str2) {
        str.getClass();
        return q0(str, str2, false) ? str.substring(str2.length()) : str;
    }

    public static String l0(String str, String str2) {
        str.getClass();
        return R(str, str2) ? str.substring(0, str.length() - str2.length()) : str;
    }

    public static final void m0(int i) {
        if (i >= 0) {
            return;
        }
        gp.k(dx1.f(i, "Limit must be non-negative, but was "));
    }

    public static final List n0(String str, CharSequence charSequence, int i) {
        m0(i);
        int iU = U(charSequence, str, 0, false);
        if (iU == -1 || i == 1) {
            return gc1.Y(charSequence.toString());
        }
        boolean z = i > 0;
        int i2 = 10;
        if (z && i <= 10) {
            i2 = i;
        }
        ArrayList arrayList = new ArrayList(i2);
        int length = 0;
        do {
            arrayList.add(charSequence.subSequence(length, iU).toString());
            length = str.length() + iU;
            if (z && arrayList.size() == i - 1) {
                break;
            }
            iU = U(charSequence, str, length, false);
        } while (iU != -1);
        arrayList.add(charSequence.subSequence(length, charSequence.length()).toString());
        return arrayList;
    }

    public static List o0(CharSequence charSequence, char[] cArr, int i, int i2) {
        if ((i2 & 4) != 0) {
            i = 0;
        }
        charSequence.getClass();
        int i3 = 1;
        if (cArr.length == 1) {
            return n0(String.valueOf(cArr[0]), charSequence, i);
        }
        m0(i);
        j65 j65Var = new j65(new nn2(charSequence, i, new w27(cArr, 16)), i3);
        ArrayList arrayList = new ArrayList(gc1.M(j65Var, 10));
        Iterator it = j65Var.iterator();
        while (true) {
            mn2 mn2Var = (mn2) it;
            if (!mn2Var.hasNext()) {
                return arrayList;
            }
            ha5 ha5Var = (ha5) mn2Var.next();
            ha5Var.getClass();
            arrayList.add(charSequence.subSequence(ha5Var.a, ha5Var.b + 1).toString());
        }
    }

    public static List p0(CharSequence charSequence, String[] strArr) {
        charSequence.getClass();
        int i = 1;
        if (strArr.length == 1) {
            String str = strArr[0];
            if (str.length() != 0) {
                return n0(str, charSequence, 0);
            }
        }
        m0(0);
        List listAsList = Arrays.asList(strArr);
        listAsList.getClass();
        j65 j65Var = new j65(new nn2(charSequence, 0, new gn6(listAsList)), i);
        ArrayList arrayList = new ArrayList(gc1.M(j65Var, 10));
        Iterator it = j65Var.iterator();
        while (true) {
            mn2 mn2Var = (mn2) it;
            if (!mn2Var.hasNext()) {
                return arrayList;
            }
            ha5 ha5Var = (ha5) mn2Var.next();
            ha5Var.getClass();
            arrayList.add(charSequence.subSequence(ha5Var.a, ha5Var.b + 1).toString());
        }
    }

    public static boolean q0(CharSequence charSequence, String str, boolean z) {
        charSequence.getClass();
        return (z || !(charSequence instanceof String)) ? j0(charSequence, 0, str, 0, str.length(), z) : iw9.K((String) charSequence, str, false);
    }

    public static String r0(char c, String str, String str2) {
        str.getClass();
        int iW = W(str, c, 0, 6);
        return iW == -1 ? str2 : str.substring(iW + 1, str.length());
    }

    public static String s0(String str, String str2, String str3) {
        str.getClass();
        str3.getClass();
        int iX = X(str, str2, 0, false, 6);
        return iX == -1 ? str3 : str.substring(str2.length() + iX, str.length());
    }

    public static String t0(char c, String str, String str2) {
        str.getClass();
        str2.getClass();
        int iD0 = d0(str, c, 0, 6);
        return iD0 == -1 ? str2 : str.substring(iD0 + 1, str.length());
    }

    public static String u0(String str, String str2, String str3) {
        str.getClass();
        str3.getClass();
        int iC0 = c0(6, str, str2);
        return iC0 == -1 ? str3 : str.substring(str2.length() + iC0, str.length());
    }

    public static String v0(String str, char c) {
        str.getClass();
        str.getClass();
        int iW = W(str, c, 0, 6);
        return iW == -1 ? str : str.substring(0, iW);
    }

    public static String w0(String str, String str2) {
        str.getClass();
        str.getClass();
        int iX = X(str, str2, 0, false, 6);
        return iX == -1 ? str : str.substring(0, iX);
    }

    public static String x0(char c, String str, String str2) {
        str.getClass();
        str2.getClass();
        int iD0 = d0(str, c, 0, 6);
        return iD0 == -1 ? str2 : str.substring(0, iD0);
    }

    public static String y0(String str, String str2) {
        str.getClass();
        str.getClass();
        int iC0 = c0(6, str, str2);
        return iC0 == -1 ? str : str.substring(0, iC0);
    }

    public static String z0(int i, String str) {
        str.getClass();
        if (i < 0) {
            gp.k(xv5.k(i, "Requested character count ", " is less than zero."));
            return null;
        }
        int length = str.length();
        if (i > length) {
            i = length;
        }
        return str.substring(0, i);
    }
}
