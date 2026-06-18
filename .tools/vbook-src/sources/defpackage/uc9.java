package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class uc9 extends o1a implements cc4 {
    public /* synthetic */ Object a;
    public /* synthetic */ Object b;
    public /* synthetic */ Object c;
    public /* synthetic */ Object d;
    public /* synthetic */ Object e;

    public uc9(jt1 jt1Var) {
        super(6, jt1Var);
    }

    @Override // defpackage.cc4
    public final Object h(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        uc9 uc9Var = new uc9((jt1) obj6);
        uc9Var.a = obj;
        uc9Var.b = obj2;
        uc9Var.c = obj3;
        uc9Var.d = obj4;
        uc9Var.e = obj5;
        return uc9Var.invokeSuspend(heb.a);
    }

    @Override // defpackage.vc0
    public final Object invokeSuspend(Object obj) {
        Object obj2 = this.a;
        Object obj3 = this.b;
        Object obj4 = this.c;
        Object obj5 = this.d;
        Object obj6 = this.e;
        e11.e0(obj);
        return new Object[]{obj2, obj3, obj4, obj5, obj6};
    }
}
