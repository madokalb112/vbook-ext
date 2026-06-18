package defpackage;

import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public abstract class dv4 {
    public static final j00 a;

    static {
        fbb fbbVarE;
        fbb fbbVarD;
        fbb fbbVarF;
        fbb fbbVarF2;
        fbb fbbVarF3;
        Class cls = Boolean.TYPE;
        Class cls2 = Integer.TYPE;
        n46.b("io.ktor.client.plugins.HttpRequestRetry");
        int i = cv4.a;
        a91 a91VarA = ug8.a(z91.class);
        fbb fbbVarF4 = null;
        try {
            ri5 ri5Var = ri5.c;
            a91 a91VarA2 = ug8.a(y91.class);
            ug8.a.getClass();
            cbb cbbVar = new cbb(a91VarA2);
            ug8.c(cbbVar, ug8.d(Object.class));
            List list = Collections.EMPTY_LIST;
            list.getClass();
            fbbVarE = ug8.e(z91.class, lw1.H(new fbb(cbbVar, list, 0)));
        } catch (Throwable unused) {
            fbbVarE = null;
        }
        new j00("RetryFeature", new bbb(a91VarA, fbbVarE));
        a91 a91VarA3 = ug8.a(Integer.class);
        try {
            fbbVarD = ug8.d(cls2);
        } catch (Throwable unused2) {
            fbbVarD = null;
        }
        a = new j00("MaxRetriesPerRequestAttributeKey", new bbb(a91VarA3, fbbVarD));
        a91 a91VarA4 = ug8.a(zb4.class);
        try {
            ri5 ri5Var2 = ri5.c;
            fbbVarF = ug8.f(zb4.class, lw1.H(ug8.d(ov4.class)), lw1.H(ug8.d(wu4.class)), lw1.H(ug8.d(gv4.class)), lw1.H(ug8.d(cls)));
        } catch (Throwable unused3) {
            fbbVarF = null;
        }
        new j00("ShouldRetryPerRequestAttributeKey", new bbb(a91VarA4, fbbVarF));
        a91 a91VarA5 = ug8.a(zb4.class);
        try {
            ri5 ri5Var3 = ri5.c;
            fbbVarF2 = ug8.f(zb4.class, lw1.H(ug8.d(ov4.class)), lw1.H(ug8.d(xu4.class)), lw1.H(ug8.d(Throwable.class)), lw1.H(ug8.d(cls)));
        } catch (Throwable unused4) {
            fbbVarF2 = null;
        }
        new j00("ShouldRetryOnExceptionPerRequestAttributeKey", new bbb(a91VarA5, fbbVarF2));
        a91 a91VarA6 = ug8.a(yb4.class);
        try {
            ri5 ri5Var4 = ri5.c;
            fbbVarF3 = ug8.f(yb4.class, lw1.H(ug8.d(nv4.class)), lw1.H(ug8.d(xu4.class)), lw1.H(ug8.d(heb.class)));
        } catch (Throwable unused5) {
            fbbVarF3 = null;
        }
        new j00("ModifyRequestPerRequestAttributeKey", new bbb(a91VarA6, fbbVarF3));
        a91 a91VarA7 = ug8.a(yb4.class);
        try {
            ri5 ri5Var5 = ri5.c;
            fbbVarF4 = ug8.f(yb4.class, lw1.H(ug8.d(mv4.class)), lw1.H(ug8.d(cls2)), lw1.H(ug8.d(Long.TYPE)));
        } catch (Throwable unused6) {
        }
        new j00("RetryDelayPerRequestAttributeKey", new bbb(a91VarA7, fbbVarF4));
    }
}
