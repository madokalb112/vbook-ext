package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class z55 implements f4c, xv1 {
    public Integer a;
    public Integer b;

    public z55(Integer num, Integer num2) {
        this.a = num;
        this.b = num2;
    }

    public final Object c() {
        return new z55(this.a, this.b);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof z55)) {
            return false;
        }
        z55 z55Var = (z55) obj;
        return lc5.Q(this.a, z55Var.a) && lc5.Q(this.b, z55Var.b);
    }

    @Override // defpackage.f4c
    public final void f(Integer num) {
        this.b = num;
    }

    public final int hashCode() {
        Integer num = this.a;
        int iHashCode = (num != null ? num.hashCode() : 0) * 31;
        Integer num2 = this.b;
        return iHashCode + (num2 != null ? num2.hashCode() : 0);
    }

    @Override // defpackage.f4c
    public final Integer i() {
        return this.a;
    }

    @Override // defpackage.f4c
    public final void r(Integer num) {
        this.a = num;
    }

    @Override // defpackage.f4c
    public final Integer s() {
        return this.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        Object obj = this.a;
        if (obj == null) {
            obj = "??";
        }
        sb.append(obj);
        sb.append('-');
        Integer num = this.b;
        sb.append(num != null ? num : "??");
        return sb.toString();
    }
}
