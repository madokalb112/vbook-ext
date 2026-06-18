package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class f04 implements ah8 {
    public final ji a = new ji();

    @Override // defpackage.ah8
    public final bh8 a(ty9 ty9Var, s25 s25Var) {
        ty9Var.getClass();
        s25Var.getClass();
        return new g04(new li(ty9Var, s25Var, ty9Var.b));
    }

    @Override // defpackage.ah8
    public final Boolean b(String str) {
        str.getClass();
        return this.a.b(str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj instanceof f04;
    }

    public final int hashCode() {
        return ug8.a(f04.class).hashCode();
    }

    public final String toString() {
        return "FixedSizeRegionDecoder";
    }

    @Override // defpackage.ah8
    public final void c() {
    }
}
