package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class tia {
    public final long a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final jk h;
    public final via i;

    public tia(long j, int i, int i2, int i3, int i4, int i5, int i6, jk jkVar, via viaVar) {
        this.a = j;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        this.f = i5;
        this.g = i6;
        this.h = jkVar;
        this.i = viaVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof tia)) {
            return false;
        }
        tia tiaVar = (tia) obj;
        return tiaVar.d == this.d && tiaVar.e == this.e;
    }

    public final int hashCode() {
        return (((((this.d * 31) + this.e) * 31) + this.f) * 31) + this.g;
    }

    public final String toString() {
        StringBuilder sbN = dx1.n("Paragraph(offset=", eb7.j(this.a), ", textStart=", ", textEnd=", this.b);
        ky0.u(this.c, this.d, ", start=", ", end=", sbN);
        ky0.u(this.e, this.f, ", width=", ", height=", sbN);
        sbN.append(this.g);
        sbN.append(", textLayoutResult=");
        sbN.append(this.h);
        sbN.append(", placeholder=");
        sbN.append(this.i);
        sbN.append(")");
        return sbN.toString();
    }
}
