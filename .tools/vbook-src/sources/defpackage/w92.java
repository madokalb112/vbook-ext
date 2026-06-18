package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class w92 implements kb4 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ int b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ w92(long j, String str, b92 b92Var, int i) {
        this.c = j;
        this.d = str;
        this.e = b92Var;
        this.b = i;
    }

    @Override // defpackage.kb4
    public final Object invoke(Object obj) {
        int i = this.a;
        heb hebVar = heb.a;
        Object obj2 = this.e;
        int i2 = this.b;
        Object obj3 = this.d;
        switch (i) {
            case 0:
                rj rjVar = (rj) obj;
                rjVar.getClass();
                rjVar.j(0, Long.valueOf(this.c));
                rjVar.g(1, (String) obj3);
                ((mc8) ((b92) obj2).c).getClass();
                rjVar.j(2, Long.valueOf(i2));
                break;
            default:
                jka jkaVar = (jka) obj2;
                r43 r43Var = (r43) obj;
                r43Var.getClass();
                List list = ((sia) obj3).d;
                int size = list.size();
                for (int i3 = 0; i3 < size; i3++) {
                    tia tiaVar = (tia) list.get(i3);
                    jk jkVar = tiaVar.h;
                    int i4 = tiaVar.e;
                    int iMax = tiaVar.d;
                    if (jkVar != null) {
                        if (i2 == jkaVar.c().a) {
                            iMax = Math.max(jkaVar.c().b, iMax);
                        }
                        int iMin = i2 == jkaVar.b().a ? Math.min(jkaVar.b().b, i4 - 1) : i4 - 1;
                        if (iMax <= iMin) {
                            int i5 = tiaVar.b;
                            t1c.U(r43Var, iMax - i5, iMin - i5, tiaVar.a, 0.0f, this.c, tiaVar.h);
                        }
                    }
                }
                break;
        }
        return hebVar;
    }

    public /* synthetic */ w92(sia siaVar, int i, jka jkaVar, long j) {
        this.d = siaVar;
        this.b = i;
        this.e = jkaVar;
        this.c = j;
    }
}
