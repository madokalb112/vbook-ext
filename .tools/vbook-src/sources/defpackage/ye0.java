package defpackage;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class ye0 implements yb4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ou6 b;
    public final /* synthetic */ uka c;
    public final /* synthetic */ kb4 d;
    public final /* synthetic */ int e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ int s;
    public final /* synthetic */ int t;
    public final /* synthetic */ int u;
    public final /* synthetic */ int v;
    public final /* synthetic */ CharSequence w;
    public final /* synthetic */ Object x;

    public /* synthetic */ ye0(CharSequence charSequence, ou6 ou6Var, uka ukaVar, kb4 kb4Var, int i, boolean z, int i2, int i3, Object obj, int i4, int i5, int i6) {
        this.a = i6;
        this.w = charSequence;
        this.b = ou6Var;
        this.c = ukaVar;
        this.d = kb4Var;
        this.e = i;
        this.f = z;
        this.s = i2;
        this.t = i3;
        this.x = obj;
        this.u = i4;
        this.v = i5;
    }

    @Override // defpackage.yb4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        heb hebVar = heb.a;
        int i2 = this.u;
        Object obj3 = this.x;
        bp bpVar = this.w;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int iX0 = qu1.x0(i2 | 1);
                yb0.d((String) bpVar, this.b, this.c, this.d, this.e, this.f, this.s, this.t, (g60) obj3, (dd4) obj, iX0, this.v);
                break;
            default:
                ((Integer) obj2).getClass();
                int iX02 = qu1.x0(i2 | 1);
                int iX03 = qu1.x0(this.v);
                yb0.c(bpVar, this.b, this.c, this.d, this.e, this.f, this.s, this.t, (Map) obj3, (dd4) obj, iX02, iX03);
                break;
        }
        return hebVar;
    }
}
