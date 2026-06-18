package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class je3 extends hx7 {
    public final s39 l;
    public final d6a m;

    public je3(String str, int i) {
        super(str, null, i);
        this.l = s39.c;
        this.m = new d6a(new lj(i, str, this, 1));
    }

    @Override // defpackage.hx7, defpackage.m39
    public final gx1 e() {
        return this.l;
    }

    @Override // defpackage.hx7
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof m39)) {
            return false;
        }
        m39 m39Var = (m39) obj;
        return m39Var.e() == s39.c && this.a.equals(m39Var.a()) && lc5.Q(kc5.s(this), kc5.s(m39Var));
    }

    @Override // defpackage.hx7
    public final int hashCode() {
        int iHashCode = this.a.hashCode();
        n1 n1Var = new n1(this);
        int iHashCode2 = 1;
        while (n1Var.hasNext()) {
            int i = iHashCode2 * 31;
            String str = (String) n1Var.next();
            iHashCode2 = i + (str != null ? str.hashCode() : 0);
        }
        return (iHashCode * 31) + iHashCode2;
    }

    @Override // defpackage.hx7, defpackage.m39
    public final m39 i(int i) {
        return ((m39[]) this.m.getValue())[i];
    }

    @Override // defpackage.hx7
    public final String toString() {
        return fc1.D0(new j65(this, 2), ", ", this.a.concat("("), ")", null, 56);
    }
}
