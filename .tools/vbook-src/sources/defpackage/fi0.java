package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public abstract class fi0 {
    public static final j00 a;
    public static final j00 b;
    public static final y91 c;

    static {
        fbb fbbVarD;
        a91 a91VarA = ug8.a(h88.class);
        fbb fbbVarD2 = null;
        try {
            fbbVarD = ug8.d(h88.class);
        } catch (Throwable unused) {
            fbbVarD = null;
        }
        a = new j00("UploadProgressListenerAttributeKey", new bbb(a91VarA, fbbVarD));
        a91 a91VarA2 = ug8.a(h88.class);
        try {
            fbbVarD2 = ug8.d(h88.class);
        } catch (Throwable unused2) {
        }
        b = new j00("DownloadProgressListenerAttributeKey", new bbb(a91VarA2, fbbVarD2));
        c = new y91("BodyProgress", new dh1(1), new e4(27));
    }
}
