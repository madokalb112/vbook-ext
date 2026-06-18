package defpackage;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class gn9 {
    public final wa2 a;
    public final Map b;
    public final HashMap c;
    public final d6a d;

    public gn9(wa2 wa2Var) {
        wa2Var.getClass();
        this.a = wa2Var;
        this.b = wa2Var.r;
        this.c = new HashMap();
        this.d = new d6a(new o39(this, 11));
    }

    public final String a(String str) {
        String strA;
        om9 om9Var;
        String str2;
        str.getClass();
        HashMap map = this.c;
        String str3 = "";
        if (!map.containsKey(str)) {
            boolean z = this.a.o;
            Map map2 = this.b;
            if (z) {
                try {
                    om9Var = (om9) this.d.getValue();
                    str2 = (String) map2.get(str);
                } catch (Exception unused) {
                    strA = (String) map2.get(str);
                    if (strA != null) {
                    }
                    map.put(str, str3);
                    return str3;
                }
                if (str2 != null) {
                    strA = om9Var.a(str2);
                    str3 = strA;
                }
            } else {
                strA = (String) map2.get(str);
                if (strA != null) {
                    str3 = strA;
                }
            }
            map.put(str, str3);
            return str3;
        }
        String str4 = (String) map.get(str);
        if (str4 != null) {
            return str4;
        }
        return "";
    }
}
