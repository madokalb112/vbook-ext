package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class fta implements gta {
    public static final fta a = new fta();
    public static final d6a b = new d6a(new nda(16));

    @Override // defpackage.gta
    public final eta a(String str, dh0 dh0Var, String str2, q05 q05Var) {
        q05Var.getClass();
        ((se6) b.getValue()).a(str, dh0Var);
        return dh0Var;
    }

    @Override // defpackage.gta
    public final eta c(String str) {
        se6 se6Var = (se6) b.getValue();
        se6Var.getClass();
        return (eta) se6Var.a.get(str);
    }
}
