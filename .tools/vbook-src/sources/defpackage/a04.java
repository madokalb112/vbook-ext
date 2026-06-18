package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class a04 implements oi5 {
    public static final a04 a = new a04();
    public static final o28 b = fx1.m("kotlinx.datetime.FixedOffsetTimeZone", m28.k);

    @Override // defpackage.oi5
    public final void b(md2 md2Var, Object obj) {
        zz3 zz3Var = (zz3) obj;
        zz3Var.getClass();
        String id = zz3Var.a.getId();
        id.getClass();
        md2Var.Y(id);
    }

    @Override // defpackage.oi5
    public final Object c(yd2 yd2Var) throws Exception {
        lua luaVar = mua.Companion;
        String strS = yd2Var.s();
        luaVar.getClass();
        mua muaVarB = lua.b(strS);
        if (muaVarB instanceof zz3) {
            return (zz3) muaVarB;
        }
        throw new u39("Timezone identifier '" + muaVarB + "' does not correspond to a fixed-offset timezone");
    }

    @Override // defpackage.oi5
    public final m39 e() {
        return b;
    }
}
