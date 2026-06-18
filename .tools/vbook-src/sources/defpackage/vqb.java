package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class vqb implements tvb {
    public final /* synthetic */ kb4 a;
    public final /* synthetic */ ai1 b;

    public vqb(kb4 kb4Var, ai1 ai1Var) {
        this.a = kb4Var;
        this.b = ai1Var;
    }

    @Override // defpackage.tvb
    public final uc6 i(String str) {
        this.a.invoke(str);
        String strC = zqb.c(str);
        if (zqb.b.contains(strC) || zqb.a.containsKey(strC)) {
            return new uc6(new byte[0]);
        }
        return null;
    }

    @Override // defpackage.tvb
    public final void o(String str) {
        hx1 hx1Var = this.b;
        if (((pe5) hx1Var).M()) {
            return;
        }
        ((bi1) hx1Var).Q(heb.a);
    }
}
