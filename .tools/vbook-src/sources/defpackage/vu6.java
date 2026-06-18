package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class vu6 {
    public final String a = tn9.n().toString();
    public final LinkedHashSet b = new LinkedHashSet();
    public final LinkedHashMap c = new LinkedHashMap();
    public final LinkedHashSet d = new LinkedHashSet();
    public final ArrayList e = new ArrayList();

    public final void a(n95 n95Var) {
        if0 if0Var = n95Var.a;
        a91 a91Var = if0Var.b;
        pa8 pa8Var = if0Var.a;
        StringBuilder sb = new StringBuilder();
        ky0.y(a91Var, sb, ':', "", ':');
        sb.append(pa8Var);
        this.c.put(sb.toString(), n95Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vu6)) {
            return false;
        }
        return lc5.Q(this.a, ((vu6) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
