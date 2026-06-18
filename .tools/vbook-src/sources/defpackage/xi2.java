package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public abstract class xi2 {
    public static final j00 a;
    public static final k46 b;

    static {
        fbb fbbVarD;
        a91 a91VarA = ug8.a(heb.class);
        try {
            fbbVarD = ug8.d(heb.class);
        } catch (Throwable unused) {
            fbbVarD = null;
        }
        a = new j00("ValidateMark", new bbb(a91VarA, fbbVarD));
        b = n46.b("io.ktor.client.plugins.DefaultResponseValidation");
    }
}
