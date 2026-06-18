package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class jja {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final List d;
    public final List e;
    public final int f;
    public final List g;

    public jja(boolean z, boolean z2, boolean z3, List list, List list2, int i, List list3) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = list;
        this.e = list2;
        this.f = i;
        this.g = list3;
    }

    public static jja a(jja jjaVar, boolean z, boolean z2, List list, List list2, int i, List list3, int i2) {
        if ((i2 & 1) != 0) {
            z = jjaVar.a;
        }
        boolean z3 = z;
        if ((i2 & 2) != 0) {
            z2 = jjaVar.b;
        }
        boolean z4 = z2;
        boolean z5 = (i2 & 4) != 0 ? jjaVar.c : true;
        if ((i2 & 8) != 0) {
            list = jjaVar.d;
        }
        List list4 = list;
        if ((i2 & 16) != 0) {
            list2 = jjaVar.e;
        }
        List list5 = list2;
        if ((i2 & 32) != 0) {
            i = jjaVar.f;
        }
        int i3 = i;
        if ((i2 & 64) != 0) {
            list3 = jjaVar.g;
        }
        List list6 = list3;
        jjaVar.getClass();
        list4.getClass();
        list5.getClass();
        list6.getClass();
        return new jja(z3, z4, z5, list4, list5, i3, list6);
    }

    public final List b() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jja)) {
            return false;
        }
        jja jjaVar = (jja) obj;
        return this.a == jjaVar.a && this.b == jjaVar.b && this.c == jjaVar.c && lc5.Q(this.d, jjaVar.d) && lc5.Q(this.e, jjaVar.e) && this.f == jjaVar.f && lc5.Q(this.g, jjaVar.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + tw2.d(this.f, j39.d(j39.d(j39.c(j39.c(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c), this.d, 31), this.e, 31), 31);
    }

    public final String toString() {
        StringBuilder sbR = j39.r("TextQtNERAnalyzerState(isAnalyzing=", this.a, ", isAnalyzeFinished=", this.b, ", isSaving=");
        sbR.append(this.c);
        sbR.append(", analyzeEngines=");
        sbR.append(this.d);
        sbR.append(", translateEngines=");
        sbR.append(this.e);
        sbR.append(", analyzeProgress=");
        sbR.append(this.f);
        sbR.append(", analyzeResult=");
        return tw2.t(sbR, this.g, ")");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ jja() {
        lc3 lc3Var = lc3.a;
        this(false, false, false, lc3Var, lc3Var, 0, lc3Var);
    }
}
