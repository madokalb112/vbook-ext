package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class kf9 extends n95 {
    public volatile Object b;

    @Override // defpackage.n95
    public final Object a(s16 s16Var) {
        if (this.b == null) {
            return super.a(s16Var);
        }
        Object obj = this.b;
        if (obj != null) {
            return obj;
        }
        gp.j("Single instance created couldn't return value");
        return null;
    }

    @Override // defpackage.n95
    public final Object b(s16 s16Var) {
        if (this.b == null) {
            synchronized (this) {
                if (!(this.b != null)) {
                    this.b = a(s16Var);
                }
            }
        }
        Object obj = this.b;
        if (obj != null) {
            return obj;
        }
        gp.j("Single instance created couldn't return value");
        return null;
    }
}
