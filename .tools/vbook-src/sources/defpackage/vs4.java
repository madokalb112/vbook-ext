package defpackage;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public abstract class vs4 {
    public static final j00 a;

    static {
        fbb fbbVar;
        a91 a91VarA = ug8.a(Map.class);
        try {
            ri5 ri5VarH = lw1.H(ug8.e(us4.class, ri5.c));
            ri5 ri5VarH2 = lw1.H(ug8.d(Object.class));
            vg8 vg8Var = ug8.a;
            a91 a91VarA2 = ug8.a(Map.class);
            List listAsList = Arrays.asList(ri5VarH, ri5VarH2);
            vg8Var.getClass();
            listAsList.getClass();
            fbbVar = new fbb(a91VarA2, listAsList, 2);
        } catch (Throwable unused) {
            fbbVar = null;
        }
        a = new j00("EngineCapabilities", new bbb(a91VarA, fbbVar));
        e11.d0(aw4.a);
    }
}
