package defpackage;

import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class va1 {
    public final short a;
    public final String b;

    public va1(short s, String str) {
        str.getClass();
        this.a = s;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof va1)) {
            return false;
        }
        va1 va1Var = (va1) obj;
        return this.a == va1Var.a && lc5.Q(this.b, va1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Short.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CloseReason(reason=");
        ua1.b.getClass();
        LinkedHashMap linkedHashMap = ua1.c;
        short s = this.a;
        Object objValueOf = (ua1) linkedHashMap.get(Short.valueOf(s));
        if (objValueOf == null) {
            objValueOf = Short.valueOf(s);
        }
        sb.append(objValueOf);
        sb.append(", message=");
        return xv5.s(sb, this.b, ')');
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public va1(ua1 ua1Var, String str) {
        this(ua1Var.a, str);
        str.getClass();
    }
}
