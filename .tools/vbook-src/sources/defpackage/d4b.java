package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class d4b implements yb4 {
    public final /* synthetic */ int a;

    public /* synthetic */ d4b(int i) {
        this.a = i;
    }

    @Override // defpackage.yb4
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                ((ev8) obj).getClass();
                ((rm7) obj2).getClass();
                return new ds3();
            case 1:
                ((ev8) obj).getClass();
                ((rm7) obj2).getClass();
                return new v98();
            case 2:
                ev8 ev8Var = (ev8) obj;
                Object objE = dx1.e(ev8Var, (rm7) obj2, m62.class, null);
                Object objD = ev8Var.d(ug8.a(qt.class), null);
                Object objD2 = ev8Var.d(ug8.a(mka.class), null);
                Object objD3 = ev8Var.d(ug8.a(w25.class), null);
                Object objD4 = ev8Var.d(ug8.a(mrb.class), null);
                return new zl0((m62) objE, (qt) objD, (mka) objD2, (w25) objD3, (mrb) objD4, (m87) ev8Var.d(ug8.a(m87.class), null), (f4b) ev8Var.d(ug8.a(f4b.class), null));
            default:
                ev8 ev8Var2 = (ev8) obj;
                Object objE2 = dx1.e(ev8Var2, (rm7) obj2, m62.class, null);
                Object objD5 = ev8Var2.d(ug8.a(is4.class), null);
                return new lr3(0);
        }
    }
}
