package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public abstract class ys4 {
    public static final rx1 a = new rx1("call-context");
    public static final j00 b;

    static {
        fbb fbbVarE;
        a91 a91VarA = ug8.a(ps4.class);
        try {
            fbbVarE = ug8.e(ps4.class, ri5.c);
        } catch (Throwable unused) {
            fbbVarE = null;
        }
        b = new j00("client-config", new bbb(a91VarA, fbbVarE));
    }
}
