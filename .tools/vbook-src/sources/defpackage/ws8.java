package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class ws8 extends ks4 {
    public final boolean f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ws8(is4 is4Var, wu4 wu4Var, gv4 gv4Var, byte[] bArr) {
        super(is4Var);
        is4Var.getClass();
        this.b = new nm2(this, wu4Var, 1);
        this.c = new ih2(this, bArr, gv4Var);
        wm9.i(tu1.x(gv4Var), bArr.length, wu4Var.getMethod());
        this.f = true;
    }

    @Override // defpackage.ks4
    public final boolean b() {
        return this.f;
    }
}
