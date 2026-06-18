package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class rab extends p26 {
    public final String P0;
    public final aw5 Q0;
    public final f4b R0;
    public final j55 S0;
    public final hab T0;
    public final mka U0;
    public final fr9 V0;
    public String W0;

    public rab(String str, aw5 aw5Var, rd8 rd8Var, qba qbaVar, sja sjaVar, u64 u64Var, cm0 cm0Var, t0c t0cVar, cia ciaVar, f4b f4bVar, y78 y78Var, tna tnaVar, i13 i13Var, j55 j55Var, hab habVar, h8b h8bVar, q8b q8bVar, e15 e15Var, mka mkaVar, gj7 gj7Var) {
        super(str, aw5Var, rd8Var, qbaVar, sjaVar, u64Var, cm0Var, t0cVar, ciaVar, f4bVar, y78Var, tnaVar, i13Var, j55Var, h8bVar, q8bVar, e15Var, mkaVar, gj7Var);
        this.P0 = str;
        this.Q0 = aw5Var;
        this.R0 = f4bVar;
        this.S0 = j55Var;
        this.T0 = habVar;
        this.U0 = mkaVar;
        this.V0 = gr9.a(new mab(true, false, true, false, false, "", "", "", "", 0, null, ""));
        this.W0 = "detect_auto";
        za1 za1VarA = vtb.a(this);
        aj2 aj2Var = rw2.a;
        g(za1VarA, nh2.c, new qoa(this, (jt1) null, 16));
    }

    @Override // defpackage.hra
    public final void O0(boolean z) {
        fr9 fr9Var = this.V0;
        if (fr9Var == null) {
            return;
        }
        while (true) {
            Object value = fr9Var.getValue();
            boolean z2 = z;
            if (fr9Var.j(value, mab.a((mab) value, false, false, false, false, z2, null, null, null, 0, null, 4078))) {
                return;
            } else {
                z = z2;
            }
        }
    }
}
