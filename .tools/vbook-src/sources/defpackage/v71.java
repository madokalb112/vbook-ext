package defpackage;

import java.io.Serializable;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public abstract class v71 {
    public static final Map a = y86.P(new xl7('1', 1), new xl7((char) 19968, 1), new xl7((char) 22777, 1), new xl7('2', 2), new xl7((char) 20108, 2), new xl7((char) 36019, 2), new xl7((char) 36014, 2), new xl7((char) 36144, 1), new xl7((char) 20841, 2), new xl7((char) 20004, 2), new xl7('3', 3), new xl7((char) 19977, 3), new xl7((char) 21441, 3), new xl7((char) 21443, 3), new xl7((char) 21444, 3), new xl7((char) 21442, 3), new xl7('4', 4), new xl7((char) 22235, 4), new xl7((char) 32902, 4), new xl7('5', 5), new xl7((char) 20116, 5), new xl7((char) 20237, 5), new xl7('6', 6), new xl7((char) 20845, 6), new xl7((char) 38520, 6), new xl7((char) 38470, 6), new xl7('7', 7), new xl7((char) 19971, 7), new xl7((char) 26578, 7), new xl7('8', 8), new xl7((char) 20843, 8), new xl7((char) 25420, 8), new xl7('9', 9), new xl7((char) 20061, 9), new xl7((char) 29590, 9), new xl7('0', 0), new xl7((char) 38646, 0), new xl7((char) 12295, 0));
    public static final Map b = y86.P(new xl7((char) 24319, "二十"), new xl7((char) 24565, "二十"), new xl7((char) 21317, "三十"), new xl7((char) 21324, "四十"), new xl7((char) 22313, "五十"), new xl7((char) 22291, "六十"), new xl7((char) 22278, "六十"), new xl7((char) 36914, "七十"), new xl7((char) 36827, "七十"), new xl7((char) 26543, "八十"), new xl7((char) 27194, "九十"), new xl7((char) 26726, "九十"), new xl7((char) 30357, "兩百"));
    public static final Map c = y86.P(new xl7((char) 21313, 10), new xl7((char) 25342, 10), new xl7((char) 30334, 100), new xl7((char) 20336, 100), new xl7((char) 21315, 1000), new xl7((char) 20191, 1000));
    public static final Map d = y86.P(new xl7((char) 33836, 10000), new xl7((char) 19975, 10000), new xl7((char) 20740, 100000000), new xl7((char) 20159, 100000000));

    /* JADX WARN: Removed duplicated region for block: B:35:0x00aa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int a(java.lang.String r13) {
        /*
            Method dump skipped, instruction units count: 264
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.v71.a(java.lang.String):int");
    }

    public static Serializable b(String str) {
        Serializable pm8Var;
        str.getClass();
        try {
            Integer numL = iw9.L(10, str);
            if (numL == null || (pm8Var = String.valueOf(numL.intValue())) == null) {
                pm8Var = Integer.valueOf(a(str));
            }
        } catch (Throwable th) {
            pm8Var = new pm8(th);
        }
        if (pm8Var instanceof pm8) {
            return null;
        }
        return pm8Var;
    }
}
