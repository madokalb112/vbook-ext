package defpackage;

import j$.time.format.DateTimeFormatterBuilder;
import j$.time.format.SignStyle;
import j$.time.temporal.ChronoField;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class ttb implements ib4 {
    public final /* synthetic */ int a;

    public /* synthetic */ ttb(int i) {
        this.a = i;
    }

    @Override // defpackage.ib4
    public final Object invoke() {
        int i = 0;
        switch (this.a) {
            case 0:
                aj2 aj2Var = rw2.a;
                fj4 fj4Var = r76.a.f;
                o0a o0aVarA = zib.a();
                fj4Var.getClass();
                return wx1.b(gx1.T(fj4Var, o0aVarA));
            case 1:
                d6a d6aVar = utb.a;
                return null;
            case 2:
                return new fxb();
            case 3:
                throw new IllegalStateException("LocalWindowSizeClass not initialized");
            case 4:
                return new mc8(i);
            case 5:
                throw new IllegalStateException("Expedited WorkRequests require a Worker to provide an implementation for `getForegroundInfo()`");
            case 6:
                j4c j4cVar = new j4c(new nu(0, false));
                b72.c(j4cVar);
                yn2.u(j4cVar, '-');
                b72.f(j4cVar);
                return new k4c(j4cVar.build());
            case 7:
                return new DateTimeFormatterBuilder().parseCaseInsensitive().appendValue(ChronoField.YEAR, 4, 10, SignStyle.EXCEEDS_PAD).appendLiteral('-').appendValue(ChronoField.MONTH_OF_YEAR, 2).toFormatter();
            default:
                return dk9.x(Boolean.FALSE);
        }
    }
}
