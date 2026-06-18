package defpackage;

import org.mozilla.javascript.Context;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public abstract class w3b {
    public static final be3 a;
    public static final cj3 b;

    static {
        hh hhVarA = mh.a();
        hhVarA.i(0.0f, 0.0f);
        hhVarA.f(0.05f, 0.0f, 0.133333f, 0.06f, 0.166666f, 0.4f);
        hhVarA.f(0.208333f, 0.82f, 0.25f, 1.0f, 1.0f, 1.0f);
        ab6 ab6Var = new ab6(hhVarA, 14);
        a22 a22Var = new a22(0.3f, 0.0f, 0.8f, 0.15f);
        a = wd3.c(ah1.a0(450, 0, ab6Var, 2), 2).a(wd3.e(0.98f, un9.c(0.5f, 0.5f), ah1.a0(500, 0, ab6Var, 2)));
        b = wd3.d(ah1.a0(Context.VERSION_ECMASCRIPT, 0, a22Var, 2), 2).a(wd3.g(0.98f, un9.c(0.5f, 0.5f), ah1.a0(300, 0, a22Var, 2)));
    }
}
