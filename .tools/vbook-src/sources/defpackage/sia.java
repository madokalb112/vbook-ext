package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class sia {
    public final int a;
    public final int b;
    public final float c;
    public final List d;
    public final int e;

    public sia(int i, int i2, float f, List list, int i3) {
        this.a = i;
        this.b = i2;
        this.c = f;
        this.d = list;
        this.e = i3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof sia)) {
            return false;
        }
        sia siaVar = (sia) obj;
        return siaVar.e == this.e && siaVar.a == this.a && siaVar.b == this.b && siaVar.c == this.c;
    }

    public final int hashCode() {
        return Float.hashCode(this.c) + (((((this.e * 31) + this.a) * 31) + this.b) * 31);
    }

    public final String toString() {
        StringBuilder sbT = xv5.t(this.a, this.b, "PageColumn(start=", ", end=", ", height=");
        sbT.append(this.c);
        sbT.append(", paragraphs=");
        sbT.append(this.d);
        sbT.append(", hash=");
        return tw2.q(sbT, this.e, ")");
    }
}
