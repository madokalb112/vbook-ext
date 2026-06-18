package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class vn8 implements wn8 {
    public final String b;
    public final f48 c = new f48(14);

    public vn8(String str) {
        this.b = str;
    }

    @Override // defpackage.wn8
    public final void b(r43 r43Var, qha qhaVar, long j, yn8 yn8Var, float f, float f2) {
        r43Var.getClass();
        yn8Var.getClass();
    }

    @Override // defpackage.wn8
    public final kb4 c() {
        return this.c;
    }

    @Override // defpackage.wn8
    public final boolean d() {
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof vn8) {
            return this.b.equals(((vn8) obj).b);
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }
}
