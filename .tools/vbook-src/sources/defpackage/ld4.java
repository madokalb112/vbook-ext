package defpackage;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class ld4 {
    public as2 a;
    public as2 b;
    public as2 c;
    public Map d;
    public final as2 e;
    public final as2 f;
    public final as2 g;
    public final as2 h;
    public f76 i;
    public final Map j;
    public final Map k;

    public ld4(as2 as2Var, as2 as2Var2, as2 as2Var3, Map map, as2 as2Var4, as2 as2Var5, as2 as2Var6, as2 as2Var7, f76 f76Var, Map map2, Map map3) {
        this.a = as2Var;
        this.b = as2Var2;
        this.c = as2Var3;
        this.d = map;
        this.e = as2Var4;
        this.f = as2Var5;
        this.g = as2Var6;
        this.h = as2Var7;
        this.i = f76Var;
        this.j = map2;
        this.k = map3;
    }

    public final String a(int i, int i2, String str) {
        as2 as2Var;
        str.getClass();
        as2 as2Var2 = this.e;
        String str2 = as2Var2 != null ? (String) as2Var2.b(i, i2, str) : null;
        if (str2 != null) {
            return str2;
        }
        as2 as2Var3 = this.h;
        if ((as2Var3 != null ? (String) as2Var3.b(i, i2, str) : null) == null && (as2Var = this.b) != null) {
            return (String) as2Var.b(i, i2, str);
        }
        return null;
    }

    public final String b(int i, int i2, String str) {
        as2 as2Var;
        str.getClass();
        as2 as2Var2 = this.f;
        String str2 = as2Var2 != null ? (String) as2Var2.b(i, i2, str) : null;
        if (str2 != null) {
            return str2;
        }
        as2 as2Var3 = this.g;
        if ((as2Var3 != null ? (String) as2Var3.b(i, i2, str) : null) == null && (as2Var = this.a) != null) {
            return (String) as2Var.b(i, i2, str);
        }
        return null;
    }
}
