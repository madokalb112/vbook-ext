package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class r25 implements q25 {
    public final s25 a;
    public final String b;

    public r25(s25 s25Var) {
        s25Var.getClass();
        this.a = s25Var;
        this.b = s25Var.getKey();
    }

    @Override // defpackage.q25
    public final Object a(jt1 jt1Var) {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || r25.class != obj.getClass()) {
            return false;
        }
        return lc5.Q(this.a, ((r25) obj).a);
    }

    @Override // defpackage.q25
    public final String getKey() {
        return this.b;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "WrapperFactory(" + this.a + ')';
    }
}
