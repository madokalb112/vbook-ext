package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class qmb implements ha6 {
    public final /* synthetic */ ib4 a;
    public final /* synthetic */ ib4 b;
    public final /* synthetic */ rx8 c;
    public final /* synthetic */ br9 d;

    public qmb(ib4 ib4Var, ib4 ib4Var2, rx8 rx8Var, br9 br9Var) {
        this.a = ib4Var;
        this.b = ib4Var2;
        this.c = rx8Var;
        this.d = br9Var;
    }

    public final ia6 d(ja6 ja6Var, List list, long j) {
        ja6Var.getClass();
        list.getClass();
        int iQ = wx1.Q((int) (((Number) this.a.invoke()).floatValue() * up1.h(j)), 0, up1.h(j));
        return ja6Var.R(up1.i(j), up1.h(j), mc3.a, new ss3(j, this.b, this.c, ((ca6) list.get(0)).C(up1.b(j, 0, 0, iQ, iQ, 3)), ((ca6) list.get(1)).C(j), ((ca6) list.get(2)).C(j), this.d));
    }
}
