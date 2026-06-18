package defpackage;

import j$.util.DesugarTimeZone;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public abstract class t62 {
    public static final int[] a;
    public static final int[] b;

    static {
        DesugarTimeZone.getTimeZone("GMT");
        a = new int[]{0, 31, 59, 90, 120, Token.TYPEOFNAME, Token.TEMPLATE_CHARS, 212, 243, 273, 304, 334};
        b = new int[]{0, 31, 60, 91, Token.DOT, Token.USE_STACK, Token.TEMPLATE_LITERAL_SUBST, 213, 244, 274, 305, 335};
    }

    public static final wc4 a(Long l) {
        int i;
        int i2;
        long jLongValue = l != null ? l.longValue() : System.currentTimeMillis();
        long jFloorDiv = Math.floorDiv(jLongValue, 1000L);
        long jFloorMod = Math.floorMod(jFloorDiv, 86400L);
        int i3 = (int) (jFloorMod % 60);
        int i4 = (int) ((jFloorMod / 60) % 60);
        int i5 = (int) (jFloorMod / 3600);
        int iFloorDiv = (int) Math.floorDiv(jFloorDiv, 86400L);
        yxb.a.getClass();
        yxb yxbVar = (yxb) yxb.c.get(((iFloorDiv % 7) + 10) % 7);
        int i6 = 719468 + iFloorDiv;
        if (i6 >= 0) {
            i = i6 / 146097;
            i2 = i6 % 146097;
        } else {
            i = (iFloorDiv + 573372) / 146097;
            i2 = i6 - (146097 * i);
        }
        int i7 = (((i2 / 36524) + (i2 - (i2 / 1460))) - (i2 / 146096)) / 365;
        int i8 = (i * 400) + i7;
        int i9 = i2 - (((i7 / 4) + (i7 * 365)) - (i7 / 100));
        int i10 = ((i9 * 5) + 2) / Token.SETPROP_OP;
        int i11 = (i9 - (((i10 * Token.SETPROP_OP) + 2) / 5)) + 1;
        int i12 = i10 < 10 ? i10 + 2 : i10 - 10;
        if (i12 <= 1) {
            i8++;
        }
        int i13 = i8;
        int i14 = ((i13 % 4 != 0 || (i13 % 100 == 0 && i13 % 400 != 0)) ? a : b)[i12] + i11;
        zu6.a.getClass();
        return new wc4(i3, i4, i5, yxbVar, i11, i14, (zu6) zu6.c.get(i12), i13, jLongValue);
    }
}
