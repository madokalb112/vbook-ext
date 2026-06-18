package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class k4c extends o0 {
    public final ax0 a;

    public k4c(ax0 ax0Var) {
        this.a = ax0Var;
    }

    @Override // defpackage.o0
    public final ax0 a() {
        return this.a;
    }

    @Override // defpackage.o0
    public final xv1 b() {
        return l4c.a;
    }

    @Override // defpackage.o0
    public final Object d(xv1 xv1Var) {
        z55 z55Var = (z55) xv1Var;
        z55Var.getClass();
        Integer num = z55Var.a;
        l4c.a(num, "year");
        int iIntValue = num.intValue();
        Integer num2 = z55Var.b;
        l4c.a(num2, "monthNumber");
        return new e4c(iIntValue, num2.intValue());
    }
}
