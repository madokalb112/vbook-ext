package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public abstract class bt4 {
    public static final j00 a;

    static {
        fbb fbbVarD;
        a91 a91VarA = ug8.a(on1.class);
        try {
            fbbVarD = ug8.d(on1.class);
        } catch (Throwable unused) {
            fbbVarD = null;
        }
        a = new j00("ApplicationPluginRegistry", new bbb(a91VarA, fbbVarD));
    }

    public static final Object a(is4 is4Var, at4 at4Var) {
        is4Var.getClass();
        on1 on1Var = (on1) is4Var.t.e(a);
        Object objE = on1Var != null ? on1Var.e(at4Var.getKey()) : null;
        if (objE != null) {
            return objE;
        }
        StringBuilder sb = new StringBuilder("Plugin ");
        sb.append(at4Var);
        j00 key = at4Var.getKey();
        sb.append(" is not installed. Consider using `install(");
        sb.append(key);
        sb.append(")` in client config first.");
        throw new IllegalStateException(sb.toString());
    }
}
