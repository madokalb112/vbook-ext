package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class dea {
    public final boolean a;
    public final List b;

    public dea(List list, boolean z) {
        list.getClass();
        this.a = z;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dea)) {
            return false;
        }
        dea deaVar = (dea) obj;
        return this.a == deaVar.a && lc5.Q(this.b, deaVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + j39.c(Boolean.hashCode(false) * 31, 31, this.a);
    }

    public final String toString() {
        return "TextEditWordState(isLoading=false, isGeneral=" + this.a + ", words=" + this.b + ")";
    }
}
