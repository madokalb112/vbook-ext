package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public abstract class om8 extends nm8 implements ic4 {
    public final int a;

    public om8(int i, jt1 jt1Var) {
        super(jt1Var);
        this.a = i;
    }

    @Override // defpackage.ic4
    public final int getArity() {
        return this.a;
    }

    @Override // defpackage.vc0
    public final String toString() {
        if (getCompletion() != null) {
            return super.toString();
        }
        ug8.a.getClass();
        return vg8.a(this);
    }
}
