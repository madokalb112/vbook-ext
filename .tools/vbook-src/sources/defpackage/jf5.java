package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class jf5 extends s32 {
    public final l1 T;
    public final q32 U;

    public jf5(l1 l1Var, ue5 ue5Var) {
        ue5Var.getClass();
        this.T = l1Var;
        this.U = ue5Var.b;
    }

    @Override // defpackage.s32, defpackage.yd2
    public final byte A() {
        ccb ccbVar;
        l1 l1Var = this.T;
        String strN = l1Var.n();
        try {
            strN.getClass();
            hcb hcbVarT = tl9.t(10, strN);
            if (hcbVarT != null) {
                int i = hcbVarT.a;
                ccbVar = Integer.compare(Integer.MIN_VALUE ^ i, -2147483393) > 0 ? null : new ccb((byte) i);
            }
            if (ccbVar != null) {
                return ccbVar.a;
            }
            iw9.E(strN);
            throw null;
        } catch (IllegalArgumentException unused) {
            l1.s(l1Var, j39.i('\'', "Failed to parse type 'UByte' for input '", strN), 0, null, 6);
            throw null;
        }
    }

    @Override // defpackage.s32, defpackage.yd2
    public final short B() {
        ucb ucbVar;
        l1 l1Var = this.T;
        String strN = l1Var.n();
        try {
            strN.getClass();
            hcb hcbVarT = tl9.t(10, strN);
            if (hcbVarT != null) {
                int i = hcbVarT.a;
                ucbVar = Integer.compare(Integer.MIN_VALUE ^ i, -2147418113) > 0 ? null : new ucb((short) i);
            }
            if (ucbVar != null) {
                return ucbVar.a;
            }
            iw9.E(strN);
            throw null;
        } catch (IllegalArgumentException unused) {
            l1.s(l1Var, j39.i('\'', "Failed to parse type 'UShort' for input '", strN), 0, null, 6);
            throw null;
        }
    }

    @Override // defpackage.am1
    public final int f(m39 m39Var) {
        m39Var.getClass();
        throw new IllegalStateException("unsupported");
    }

    @Override // defpackage.s32, defpackage.yd2
    public final int l() {
        l1 l1Var = this.T;
        String strN = l1Var.n();
        try {
            strN.getClass();
            hcb hcbVarT = tl9.t(10, strN);
            if (hcbVarT != null) {
                return hcbVarT.a;
            }
            iw9.E(strN);
            throw null;
        } catch (IllegalArgumentException unused) {
            l1.s(l1Var, j39.i('\'', "Failed to parse type 'UInt' for input '", strN), 0, null, 6);
            throw null;
        }
    }

    @Override // defpackage.am1
    public final q32 o() {
        return this.U;
    }

    @Override // defpackage.s32, defpackage.yd2
    public final long v() {
        l1 l1Var = this.T;
        String strN = l1Var.n();
        try {
            strN.getClass();
            mcb mcbVarU = tl9.u(strN);
            if (mcbVarU != null) {
                return mcbVarU.a;
            }
            iw9.E(strN);
            throw null;
        } catch (IllegalArgumentException unused) {
            l1.s(l1Var, j39.i('\'', "Failed to parse type 'ULong' for input '", strN), 0, null, 6);
            throw null;
        }
    }
}
