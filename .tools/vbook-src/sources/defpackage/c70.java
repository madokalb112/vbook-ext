package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class c70 extends vz1 {
    public final long a;
    public final String b;
    public final pz1 c;
    public final qz1 d;
    public final rz1 e;
    public final uz1 f;

    public c70(long j, String str, pz1 pz1Var, qz1 qz1Var, rz1 rz1Var, uz1 uz1Var) {
        this.a = j;
        this.b = str;
        this.c = pz1Var;
        this.d = qz1Var;
        this.e = rz1Var;
        this.f = uz1Var;
    }

    public final b70 a() {
        b70 b70Var = new b70();
        b70Var.a = this.a;
        b70Var.b = this.b;
        b70Var.c = this.c;
        b70Var.d = this.d;
        b70Var.e = this.e;
        b70Var.f = this.f;
        b70Var.g = (byte) 1;
        return b70Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof vz1) {
            c70 c70Var = (c70) ((vz1) obj);
            if (this.a == c70Var.a && this.b.equals(c70Var.b) && this.c.equals(c70Var.c) && this.d.equals(c70Var.d)) {
                rz1 rz1Var = c70Var.e;
                rz1 rz1Var2 = this.e;
                if (rz1Var2 != null ? rz1Var2.equals(rz1Var) : rz1Var == null) {
                    uz1 uz1Var = c70Var.f;
                    uz1 uz1Var2 = this.f;
                    if (uz1Var2 != null ? uz1Var2.equals(uz1Var) : uz1Var == null) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.a;
        int iHashCode = (((((((((int) ((j >>> 32) ^ j)) ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003;
        rz1 rz1Var = this.e;
        int iHashCode2 = (iHashCode ^ (rz1Var == null ? 0 : rz1Var.hashCode())) * 1000003;
        uz1 uz1Var = this.f;
        return iHashCode2 ^ (uz1Var != null ? uz1Var.hashCode() : 0);
    }

    public final String toString() {
        return "Event{timestamp=" + this.a + ", type=" + this.b + ", app=" + this.c + ", device=" + this.d + ", log=" + this.e + ", rollouts=" + this.f + "}";
    }
}
