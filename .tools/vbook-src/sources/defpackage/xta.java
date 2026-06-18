package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public interface xta {
    default void a(pd2 pd2Var) {
        e(pd2Var != null ? Integer.valueOf(pd2Var.a(9)) : null);
    }

    v9 b();

    void d(Integer num);

    void e(Integer num);

    Integer g();

    void h(Integer num);

    default pd2 k() {
        Integer numL = l();
        if (numL != null) {
            return new pd2(numL.intValue(), 9);
        }
        return null;
    }

    Integer l();

    Integer m();

    void p(v9 v9Var);

    void u(Integer num);

    Integer v();

    Integer w();

    void x(Integer num);
}
