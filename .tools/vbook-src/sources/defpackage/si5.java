package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class si5 implements pi5 {
    public final pi5 a;

    public si5(pi5 pi5Var) {
        pi5Var.getClass();
        this.a = pi5Var;
    }

    @Override // defpackage.pi5
    public final boolean a() {
        return this.a.a();
    }

    @Override // defpackage.pi5
    public final List b() {
        return this.a.b();
    }

    @Override // defpackage.pi5
    public final sh5 d() {
        return this.a.d();
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        si5 si5Var = obj instanceof si5 ? (si5) obj : null;
        pi5 pi5Var = si5Var != null ? si5Var.a : null;
        pi5 pi5Var2 = this.a;
        if (!lc5.Q(pi5Var2, pi5Var)) {
            return false;
        }
        sh5 sh5VarD = pi5Var2.d();
        if (sh5VarD instanceof a91) {
            pi5 pi5Var3 = obj instanceof pi5 ? (pi5) obj : null;
            sh5 sh5VarD2 = pi5Var3 != null ? pi5Var3.d() : null;
            if (sh5VarD2 != null && (sh5VarD2 instanceof a91)) {
                return tu1.M((a91) sh5VarD).equals(tu1.M((a91) sh5VarD2));
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "KTypeWrapper: " + this.a;
    }
}
