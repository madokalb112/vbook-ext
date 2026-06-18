package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class m75 extends hx7 {
    public final boolean l;

    public m75(String str, n75 n75Var) {
        super(str, n75Var, 1);
        this.l = true;
    }

    @Override // defpackage.hx7
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof m75) {
            m39 m39Var = (m39) obj;
            if (this.a.equals(m39Var.a())) {
                m75 m75Var = (m75) obj;
                if (m75Var.l && Arrays.equals((m39[]) this.j.getValue(), (m39[]) m75Var.j.getValue())) {
                    int iF = m39Var.f();
                    int i = this.c;
                    if (i == iF) {
                        for (int i2 = 0; i2 < i; i2++) {
                            if (lc5.Q(i(i2).a(), m39Var.i(i2).a()) && lc5.Q(i(i2).e(), m39Var.i(i2).e())) {
                            }
                        }
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // defpackage.hx7
    public final int hashCode() {
        return super.hashCode() * 31;
    }

    @Override // defpackage.m39
    public final boolean isInline() {
        return this.l;
    }
}
