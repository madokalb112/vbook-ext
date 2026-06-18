package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class qn1 implements s84 {
    public final List a;

    public qn1(qd2 qd2Var, int i, int i2, List list) {
        list.getClass();
        this.a = list;
        if (1 > i || i >= 10) {
            gp.k(xv5.k(i, "The minimum number of digits (", ") is not in range 1..9"));
            throw null;
        }
        if (i > i2 || i2 >= 10) {
            gp.k(xv5.j(i2, i, "The maximum number of digits (", ") is not in range ", "..9"));
            throw null;
        }
    }

    public qn1(List list) {
        this.a = list;
    }
}
