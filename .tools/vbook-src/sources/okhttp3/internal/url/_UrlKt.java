package okhttp3.internal.url;

import defpackage.bw9;
import defpackage.xq0;
import okhttp3.internal._UtilCommonKt;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class _UrlKt {
    public static final char[] a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    public static String a(String str, int i, int i2, String str2, int i3) {
        int i4 = (i3 & 1) != 0 ? 0 : i;
        int length = (i3 & 2) != 0 ? str.length() : i2;
        boolean z = (i3 & 8) == 0;
        boolean z2 = (i3 & 16) == 0;
        boolean z3 = (i3 & 32) == 0;
        boolean z4 = (i3 & 64) == 0;
        str.getClass();
        int iCharCount = i4;
        while (iCharCount < length) {
            int iCodePointAt = str.codePointAt(iCharCount);
            int i5 = 32;
            if (iCodePointAt < 32 || iCodePointAt == 127 || ((iCodePointAt >= 128 && !z4) || bw9.P(str2, (char) iCodePointAt) || ((iCodePointAt == 37 && (!z || (z2 && !b(iCharCount, length, str)))) || (iCodePointAt == 43 && z3)))) {
                xq0 xq0Var = new xq0();
                xq0Var.W0(i4, iCharCount, str);
                xq0 xq0Var2 = null;
                while (iCharCount < length) {
                    int iCodePointAt2 = str.codePointAt(iCharCount);
                    if (!z || (iCodePointAt2 != 9 && iCodePointAt2 != 10 && iCodePointAt2 != 12 && iCodePointAt2 != 13)) {
                        if (iCodePointAt2 == i5 && str2 == " !\"#$&'()+,/:;<=>?@[\\]^`{|}~") {
                            xq0Var.X0("+");
                        } else if (iCodePointAt2 == 43 && z3) {
                            xq0Var.X0(z ? "+" : "%2B");
                        } else {
                            if (iCodePointAt2 >= i5 && iCodePointAt2 != 127) {
                                if ((iCodePointAt2 < 128 || z4) && !bw9.P(str2, (char) iCodePointAt2) && (iCodePointAt2 != 37 || (z && (!z2 || b(iCharCount, length, str))))) {
                                    xq0Var.Y0(iCodePointAt2);
                                }
                            }
                            if (xq0Var2 == null) {
                                xq0Var2 = new xq0();
                            }
                            xq0Var2.Y0(iCodePointAt2);
                            while (!xq0Var2.k()) {
                                byte b = xq0Var2.readByte();
                                xq0Var.O0(37);
                                char[] cArr = a;
                                xq0Var.O0(cArr[((b & 255) >> 4) & 15]);
                                xq0Var.O0(cArr[b & 15]);
                            }
                        }
                    }
                    iCharCount += Character.charCount(iCodePointAt2);
                    i5 = 32;
                }
                return xq0Var.p0();
            }
            iCharCount += Character.charCount(iCodePointAt);
        }
        return str.substring(i4, length);
    }

    public static final boolean b(int i, int i2, String str) {
        str.getClass();
        int i3 = i + 2;
        return i3 < i2 && str.charAt(i) == '%' && _UtilCommonKt.l(str.charAt(i + 1)) != -1 && _UtilCommonKt.l(str.charAt(i3)) != -1;
    }

    public static String c(int i, String str, int i2, int i3) {
        int i4;
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = str.length();
        }
        boolean z = (i3 & 4) == 0;
        str.getClass();
        int iCharCount = i;
        while (iCharCount < i2) {
            char cCharAt = str.charAt(iCharCount);
            if (cCharAt == '%' || (cCharAt == '+' && z)) {
                xq0 xq0Var = new xq0();
                xq0Var.W0(i, iCharCount, str);
                while (iCharCount < i2) {
                    int iCodePointAt = str.codePointAt(iCharCount);
                    if (iCodePointAt == 37 && (i4 = iCharCount + 2) < i2) {
                        int iL = _UtilCommonKt.l(str.charAt(iCharCount + 1));
                        int iL2 = _UtilCommonKt.l(str.charAt(i4));
                        if (iL == -1 || iL2 == -1) {
                            xq0Var.Y0(iCodePointAt);
                            iCharCount += Character.charCount(iCodePointAt);
                        } else {
                            xq0Var.O0((iL << 4) + iL2);
                            iCharCount = Character.charCount(iCodePointAt) + i4;
                        }
                    } else if (iCodePointAt == 43 && z) {
                        xq0Var.O0(32);
                        iCharCount++;
                    } else {
                        xq0Var.Y0(iCodePointAt);
                        iCharCount += Character.charCount(iCodePointAt);
                    }
                }
                return xq0Var.p0();
            }
            iCharCount++;
        }
        return str.substring(i, i2);
    }
}
