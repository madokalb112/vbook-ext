package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class nj8 extends rl5 implements ib4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ st5 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nj8(st5 st5Var, int i) {
        super(0);
        this.a = i;
        this.b = st5Var;
    }

    @Override // defpackage.ib4
    public final Object invoke() {
        long jG;
        int i = this.a;
        st5 st5Var = this.b;
        switch (i) {
            case 0:
                nt5 nt5VarJ = st5Var.j();
                int iOrdinal = nt5VarJ.p.ordinal();
                if (iOrdinal == 0) {
                    jG = nt5VarJ.g() & 4294967295L;
                } else {
                    if (iOrdinal != 1) {
                        mn5.g();
                        return null;
                    }
                    jG = nt5VarJ.g() >> 32;
                }
                return Float.valueOf(((int) jG) * 0.05f);
            default:
                return st5Var.j().p;
        }
    }
}
