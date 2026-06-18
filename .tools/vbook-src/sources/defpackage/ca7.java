package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class ca7 implements oi5 {
    public final oi5 a;
    public final n39 b;

    public ca7(oi5 oi5Var) {
        oi5Var.getClass();
        this.a = oi5Var;
        this.b = new n39(oi5Var.e());
    }

    @Override // defpackage.oi5
    public final void b(md2 md2Var, Object obj) {
        if (obj != null) {
            md2Var.W(this.a, obj);
        } else {
            md2Var.T();
        }
    }

    @Override // defpackage.oi5
    public final Object c(yd2 yd2Var) {
        if (yd2Var.w()) {
            return yd2Var.d(this.a);
        }
        return null;
    }

    @Override // defpackage.oi5
    public final m39 e() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && ca7.class == obj.getClass() && lc5.Q(this.a, ((ca7) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
