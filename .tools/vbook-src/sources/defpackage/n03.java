package defpackage;

import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public abstract class n03 {
    public static final j00 a;
    public static final j00 b;
    public static final d6a c;
    public static final y91 d;

    static {
        fbb fbbVarD;
        fbb fbbVarD2;
        a91 a91VarA = ug8.a(heb.class);
        fbb fbbVarE = null;
        try {
            fbbVarD = ug8.d(heb.class);
        } catch (Throwable unused) {
            fbbVarD = null;
        }
        a = new j00("SkipSaveBody", new bbb(a91VarA, fbbVarD));
        a91 a91VarA2 = ug8.a(heb.class);
        try {
            fbbVarD2 = ug8.d(heb.class);
        } catch (Throwable unused2) {
            fbbVarD2 = null;
        }
        b = new j00("ResponseBodySaved", new bbb(a91VarA2, fbbVarD2));
        c = new d6a(new bs2(12));
        d = new y91("SaveBody", new dh1(1), new gq2(11));
        int i = m03.a;
        a91 a91VarA3 = ug8.a(z91.class);
        try {
            ri5 ri5Var = ri5.c;
            a91 a91VarA4 = ug8.a(y91.class);
            ug8.a.getClass();
            cbb cbbVar = new cbb(a91VarA4);
            ug8.c(cbbVar, ug8.d(Object.class));
            List list = Collections.EMPTY_LIST;
            list.getClass();
            fbbVarE = ug8.e(z91.class, lw1.H(new fbb(cbbVar, list, 0)));
        } catch (Throwable unused3) {
        }
        new j00("DoubleReceivePlugin", new bbb(a91VarA3, fbbVarE));
    }

    public static final k46 a() {
        return (k46) c.getValue();
    }

    public static final boolean b(gv4 gv4Var) {
        gv4Var.getClass();
        return gv4Var.p0().getAttributes().b(b);
    }
}
