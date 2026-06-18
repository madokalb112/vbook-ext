package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class apa {
    public final bp a;
    public final bp b;
    public final List c;

    public apa(bp bpVar, bp bpVar2, zy5 zy5Var) {
        bpVar.getClass();
        this.a = bpVar;
        this.b = bpVar2;
        this.c = zy5Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof apa)) {
            return false;
        }
        apa apaVar = (apa) obj;
        return lc5.Q(this.a, apaVar.a) && lc5.Q(this.b, apaVar.b) && lc5.Q(this.c, apaVar.c);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        bp bpVar = this.b;
        int iHashCode2 = (iHashCode + (bpVar == null ? 0 : bpVar.hashCode())) * 31;
        List list = this.c;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TextTranslateContent(originText=");
        sb.append(this.a);
        sb.append(", translateText=");
        sb.append(this.b);
        sb.append(", segments=");
        return tw2.t(sb, this.c, ")");
    }
}
