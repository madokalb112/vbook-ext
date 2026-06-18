package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public interface bt0 extends dt0 {
    default void a(Throwable th) {
        Object pm8Var;
        jt1 jt1VarD = d();
        if (th != null) {
            pm8Var = new pm8(th);
        } else {
            dt0.a.getClass();
            pm8Var = heb.a;
        }
        jt1VarD.resumeWith(pm8Var);
    }

    default void b() {
        jt1 jt1VarD = d();
        dt0.a.getClass();
        jt1VarD.resumeWith(heb.a);
    }

    Throwable c();

    jt1 d();
}
