package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class mv3 implements s25 {
    public final zn7 a;
    public final String b;

    public mv3(zn7 zn7Var) {
        zn7Var.getClass();
        this.a = zn7Var;
        this.b = "file://" + zn7Var;
    }

    @Override // defpackage.s25
    public final il9 a() {
        return gx3.a.T0(this.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || mv3.class != obj.getClass()) {
            return false;
        }
        return lc5.Q(this.a, ((mv3) obj).a);
    }

    @Override // defpackage.s25
    public final String getKey() {
        return this.b;
    }

    public final int hashCode() {
        return this.a.a.hashCode();
    }

    public final String toString() {
        return "FileImageSource('" + this.a + "')";
    }
}
