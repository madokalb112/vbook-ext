package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class wh5 extends rh6 {
    public static final yg8 t = new yg8("kindle:pos:fid:(\\w+):off:(\\w+)");
    public static final yg8 u = new yg8("kindle:(flow|embed):(\\w+)(?:\\?mime=(\\w+/[-+.\\w]+))?");
    public int[] m;
    public int[] n;
    public ArrayList o;
    public ArrayList p;
    public xh5 q;
    public ArrayList r;
    public LinkedHashMap s;

    public static String i(int i, int i2) {
        gjb.X(32);
        String string = Integer.toString(i, 32);
        string.getClass();
        Locale locale = Locale.ROOT;
        String upperCase = string.toUpperCase(locale);
        upperCase.getClass();
        String strI0 = bw9.i0(4, upperCase);
        gjb.X(32);
        String string2 = Integer.toString(i2, 32);
        string2.getClass();
        String upperCase2 = string2.toUpperCase(locale);
        upperCase2.getClass();
        return j39.m("kindle:pos:fid:", strI0, ":off:", bw9.i0(10, upperCase2));
    }

    public static yh5 j(String str) {
        yg8 yg8Var = t;
        yg8Var.getClass();
        Matcher matcher = yg8Var.a.matcher(str);
        matcher.getClass();
        k96 k96VarW = sw1.w(matcher, 0, str);
        if (k96VarW == null) {
            return null;
        }
        String str2 = (String) ((i96) k96VarW.a()).get(1);
        gjb.X(32);
        int i = Integer.parseInt(str2, 32);
        String str3 = (String) ((i96) k96VarW.a()).get(2);
        gjb.X(32);
        return new yh5(i, Integer.parseInt(str3, 32));
    }

    public static final o7a k(wh5 wh5Var, v07 v07Var) {
        ArrayList arrayList;
        List list = v07Var.f;
        list.getClass();
        int i = 0;
        String strI = i(((Number) list.get(0)).intValue(), ((Number) list.get(1)).intValue());
        String str = v07Var.d;
        ArrayList arrayList2 = v07Var.j;
        if (arrayList2 != null) {
            arrayList = new ArrayList(gc1.M(arrayList2, 10));
            int size = arrayList2.size();
            while (i < size) {
                Object obj = arrayList2.get(i);
                i++;
                arrayList.add(k(wh5Var, (v07) obj));
            }
        } else {
            arrayList = null;
        }
        return new o7a(str, strI, arrayList);
    }

    public static final void l(wh5 wh5Var, o7a o7aVar) {
        yh5 yh5VarJ = j(o7aVar.b);
        int iG = yh5VarJ == null ? -1 : wh5Var.g(yh5VarJ.a);
        if (iG == -1) {
            return;
        }
        LinkedHashMap linkedHashMap = wh5Var.s;
        if (linkedHashMap == null) {
            lc5.i0("sectionIdMap");
            throw null;
        }
        Integer numValueOf = Integer.valueOf(iG);
        Object arrayList = linkedHashMap.get(numValueOf);
        if (arrayList == null) {
            arrayList = new ArrayList();
            linkedHashMap.put(numValueOf, arrayList);
        }
        ((ArrayList) arrayList).add(o7aVar);
        List list = o7aVar.c;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                l(wh5Var, (o7a) it.next());
            }
        }
    }

    public final int g(int i) {
        ArrayList arrayList = this.r;
        if (arrayList == null) {
            lc5.i0("sections");
            throw null;
        }
        int size = arrayList.size();
        int i2 = 0;
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            List list = ((ai5) obj).c;
            if (!list.isEmpty()) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    if (((e94) it.next()).c == i) {
                        return i2;
                    }
                }
            }
            i2++;
        }
        return -1;
    }

    public final String h(ai5 ai5Var) {
        ai5Var.getClass();
        dh9 dh9Var = ai5Var.b;
        List<e94> list = ai5Var.c;
        int i = ai5Var.e;
        int i2 = dh9Var.d;
        qh6 qh6Var = new qh6(this);
        qh6Var.d(i2);
        byte[] bArr = new byte[i];
        for (int i3 = 0; i3 < i; i3++) {
            bArr[i3] = qh6Var.c();
        }
        byte[] bArr2 = new byte[i];
        int i4 = dh9Var.e;
        fw.R(bArr, 0, bArr2, 0, i4);
        int i5 = i - i4;
        for (e94 e94Var : list) {
            int i6 = e94Var.a;
            int i7 = e94Var.e;
            int i8 = i6 - i2;
            int i9 = e94Var.d + i4;
            fw.R(bArr2, i8 + i7, bArr2, i8, i - i5);
            fw.R(bArr, i8, bArr2, i9, i9 + i7);
            i5 -= i7;
        }
        return this.h.a(bArr2);
    }
}
