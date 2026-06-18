package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class kq8 implements jt1 {
    public final jq8 a;
    public final /* synthetic */ rg8 b;
    public final /* synthetic */ ng8 c;
    public final /* synthetic */ rg8 d;

    public kq8(pg8 pg8Var, rg8 rg8Var, ng8 ng8Var, rg8 rg8Var2) {
        this.b = rg8Var;
        this.c = ng8Var;
        this.d = rg8Var2;
        this.a = new jq8(pg8Var);
    }

    @Override // defpackage.jt1
    public final jx1 getContext() {
        return this.a;
    }

    @Override // defpackage.jt1
    public final void resumeWith(Object obj) {
        Throwable thA = qm8.a(obj);
        ng8 ng8Var = this.c;
        if (thA != null) {
            this.b.a = thA;
            ng8Var.a = true;
            thA.printStackTrace();
        } else {
            e11.e0(obj);
            if (obj == null) {
                obj = heb.a;
            }
            this.d.a = obj;
            ng8Var.a = true;
        }
    }
}
