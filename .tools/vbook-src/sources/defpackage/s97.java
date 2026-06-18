package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class s97 extends hra {
    public final String O0;
    public final aw5 P0;
    public final f4b Q0;
    public final mka R0;
    public final fr9 S0;
    public final ne8 T0;

    public s97(String str, aw5 aw5Var, rd8 rd8Var, qba qbaVar, sja sjaVar, u64 u64Var, cm0 cm0Var, t0c t0cVar, cia ciaVar, f4b f4bVar, y78 y78Var, tna tnaVar, i13 i13Var, h8b h8bVar, q8b q8bVar, e15 e15Var, mka mkaVar, gj7 gj7Var) {
        super(str, aw5Var, i13Var, rd8Var, qbaVar, sjaVar, u64Var, cm0Var, t0cVar, ciaVar, f4bVar, y78Var, tnaVar, h8bVar, q8bVar, gj7Var);
        this.O0 = str;
        this.P0 = aw5Var;
        this.Q0 = f4bVar;
        this.R0 = mkaVar;
        this.S0 = gr9.a(new j97("", "", true, false, false));
        za1 za1VarA = vtb.a(this);
        aj2 aj2Var = rw2.a;
        g(za1VarA, nh2.c, new mt4(this, (jt1) null, 18));
        this.T0 = e15Var.a(new r97(this, 0));
    }

    @Override // defpackage.hra
    public final void O0(boolean z) {
        Object value;
        fr9 fr9Var = this.S0;
        if (fr9Var != null) {
            do {
                value = fr9Var.getValue();
            } while (!fr9Var.j(value, j97.a((j97) value, false, z, null, 26)));
        }
    }

    @Override // defpackage.hra
    public final ne8 p0() {
        return this.T0;
    }
}
