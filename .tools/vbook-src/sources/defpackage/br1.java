package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public abstract class br1 {
    public static final k46 a = n46.b("io.ktor.client.plugins.compression.ContentEncoding");
    public static final y91 b = new y91("HttpEncoding", zq1.a, new vd1(24));
    public static final j00 c;
    public static final j00 d;

    static {
        fbb fbbVarE;
        a91 a91VarA = ug8.a(List.class);
        fbb fbbVarE2 = null;
        try {
            ri5 ri5Var = ri5.c;
            fbbVarE = ug8.e(List.class, lw1.H(ug8.d(String.class)));
        } catch (Throwable unused) {
            fbbVarE = null;
        }
        c = new j00("CompressionListAttribute", new bbb(a91VarA, fbbVarE));
        a91 a91VarA2 = ug8.a(List.class);
        try {
            ri5 ri5Var2 = ri5.c;
            fbbVarE2 = ug8.e(List.class, lw1.H(ug8.d(String.class)));
        } catch (Throwable unused2) {
        }
        d = new j00("DecompressionListAttribute", new bbb(a91VarA2, fbbVarE2));
    }
}
