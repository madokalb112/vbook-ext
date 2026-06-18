package defpackage;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class tcb implements Serializable {
    public static final tcb c;
    public static final tcb d;
    public static final LinkedHashMap e;
    public final String a;
    public final int b;

    static {
        tcb tcbVar = new tcb("http", 80);
        c = tcbVar;
        tcb tcbVar2 = new tcb("https", 443);
        tcb tcbVar3 = new tcb("ws", 80);
        d = tcbVar3;
        List listZ = gc1.Z(tcbVar, tcbVar2, tcbVar3, new tcb("wss", 443), new tcb("socks", 1080));
        int iO = y86.O(gc1.M(listZ, 10));
        if (iO < 16) {
            iO = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iO);
        for (Object obj : listZ) {
            linkedHashMap.put(((tcb) obj).a, obj);
        }
        e = linkedHashMap;
    }

    public tcb(String str, int i) {
        this.a = str;
        this.b = i;
        for (int i2 = 0; i2 < str.length(); i2++) {
            char cCharAt = str.charAt(i2);
            if (Character.toLowerCase(cCharAt) != cCharAt) {
                gp.l("All characters should be lower case");
                throw null;
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tcb)) {
            return false;
        }
        tcb tcbVar = (tcb) obj;
        return this.a.equals(tcbVar.a) && this.b == tcbVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("URLProtocol(name=");
        sb.append(this.a);
        sb.append(", defaultPort=");
        return tw2.p(sb, this.b, ')');
    }
}
