package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class e09 {
    public final Object a;
    public final zb4 b;
    public final zb4 c;
    public final Object d;
    public final o1a e;
    public final zb4 f;
    public Object g;
    public int h = -1;
    public final /* synthetic */ g09 i;

    public e09(g09 g09Var, Object obj, zb4 zb4Var, zb4 zb4Var2, zy2 zy2Var, o1a o1aVar, zb4 zb4Var3) {
        this.i = g09Var;
        this.a = obj;
        this.b = zb4Var;
        this.c = zb4Var2;
        this.d = zy2Var;
        this.e = o1aVar;
        this.f = zb4Var3;
    }

    public final void a() {
        Object obj = this.g;
        if (obj instanceof pz8) {
            ((pz8) obj).m(this.h, this.i.a);
            return;
        }
        ax2 ax2Var = obj instanceof ax2 ? (ax2) obj : null;
        if (ax2Var != null) {
            ax2Var.a();
        }
    }
}
