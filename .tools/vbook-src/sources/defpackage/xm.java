package defpackage;

import java.io.RandomAccessFile;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class xm extends o1a implements kb4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xm(Object obj, jt1 jt1Var, int i) {
        super(1, jt1Var);
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.vc0
    public final jt1 create(jt1 jt1Var) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                return new xm((ym) obj, jt1Var, 0);
            case 1:
                return new xm((RandomAccessFile) obj, jt1Var, 1);
            case 2:
                return new xm((ng) obj, jt1Var, 2);
            default:
                return new xm((List) obj, jt1Var, 3);
        }
    }

    @Override // defpackage.kb4
    public final Object invoke(Object obj) {
        int i = this.a;
        heb hebVar = heb.a;
        jt1 jt1Var = (jt1) obj;
        switch (i) {
            case 0:
                ((xm) create(jt1Var)).invokeSuspend(hebVar);
                break;
        }
        return ((xm) create(jt1Var)).invokeSuspend(hebVar);
    }

    @Override // defpackage.vc0
    public final Object invokeSuspend(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                e11.e0(obj);
                ym.a((ym) obj2);
                return heb.a;
            case 1:
                e11.e0(obj);
                return new Long(((RandomAccessFile) obj2).length());
            case 2:
                e11.e0(obj);
                return new my4((ng) obj2);
            default:
                e11.e0(obj);
                te5 te5Var = ue5.d;
                te5Var.getClass();
                return iw9.B(te5Var.b(new wv(lh9.Companion.serializer(), 0), (List) obj2));
        }
    }
}
