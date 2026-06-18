package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class yb1 implements ib4 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ yb1(ox oxVar, long j, Object obj) {
        this.c = oxVar;
        this.b = j;
        this.d = obj;
    }

    @Override // defpackage.ib4
    public final Object invoke() {
        String str;
        int i = this.a;
        long j = this.b;
        Object obj = this.d;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                ox oxVar = (ox) obj2;
                if (oxVar instanceof mx) {
                    str = "Loading";
                } else if (oxVar instanceof nx) {
                    str = "Success";
                } else if (oxVar instanceof lx) {
                    str = "Error";
                } else {
                    if (!(oxVar instanceof kx)) {
                        mn5.g();
                        return null;
                    }
                    str = "Empty";
                }
                return dx1.k(j39.q("CoilZoomAsyncImage. ", str, ". contentSize=", na5.c(j), ". data='"), obj, "'");
            default:
                q6c q6cVar = (q6c) obj2;
                StringBuilder sb = new StringBuilder("ZoomableState. fling. end. offset=");
                q6cVar.getClass();
                sb.append(pu1.y0(q6cVar.r.b));
                sb.append(", bounds=");
                sb.append(y86.k0((lf8) obj));
                sb.append(", velocity=");
                sb.append(pu1.y0(j));
                return sb.toString();
        }
    }

    public /* synthetic */ yb1(q6c q6cVar, lf8 lf8Var, long j) {
        this.c = q6cVar;
        this.d = lf8Var;
        this.b = j;
    }
}
