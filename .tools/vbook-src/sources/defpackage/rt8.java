package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class rt8 implements qt8 {
    public final /* synthetic */ yb4 a;
    public final /* synthetic */ kb4 b;

    public rt8(yb4 yb4Var, kb4 kb4Var) {
        this.a = yb4Var;
        this.b = kb4Var;
    }

    @Override // defpackage.qt8
    public final Object a(Object obj) {
        return this.b.invoke(obj);
    }

    @Override // defpackage.qt8
    public final Object b(ms8 ms8Var, Object obj) {
        return this.a.invoke(ms8Var, obj);
    }
}
