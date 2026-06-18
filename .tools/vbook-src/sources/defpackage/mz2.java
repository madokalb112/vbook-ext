package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class mz2 extends o1a implements kb4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ArrayList b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mz2(ArrayList arrayList, jt1 jt1Var, int i) {
        super(1, jt1Var);
        this.a = i;
        this.b = arrayList;
    }

    @Override // defpackage.vc0
    public final jt1 create(jt1 jt1Var) {
        int i = this.a;
        ArrayList arrayList = this.b;
        switch (i) {
            case 0:
                return new mz2(arrayList, jt1Var, 0);
            case 1:
                return new mz2(arrayList, jt1Var, 1);
            case 2:
                return new mz2(arrayList, jt1Var, 2);
            default:
                return new mz2(arrayList, jt1Var, 3);
        }
    }

    @Override // defpackage.kb4
    public final Object invoke(Object obj) {
        int i = this.a;
        heb hebVar = heb.a;
        jt1 jt1Var = (jt1) obj;
        switch (i) {
        }
        return ((mz2) create(jt1Var)).invokeSuspend(hebVar);
    }

    @Override // defpackage.vc0
    public final Object invokeSuspend(Object obj) {
        int i = this.a;
        ArrayList arrayList = this.b;
        switch (i) {
            case 0:
                e11.e0(obj);
                te5 te5Var = ue5.d;
                te5Var.getClass();
                return iw9.B(te5Var.b(new wv(dz2.Companion.serializer(), 0), arrayList));
            case 1:
                e11.e0(obj);
                te5 te5Var2 = ue5.d;
                te5Var2.getClass();
                return iw9.B(te5Var2.b(new wv(gab.Companion.serializer(), 0), arrayList));
            case 2:
                e11.e0(obj);
                te5 te5Var3 = ue5.d;
                te5Var3.getClass();
                return iw9.B(te5Var3.b(new wv(s17.Companion.serializer(), 0), arrayList));
            default:
                e11.e0(obj);
                te5 te5Var4 = ue5.d;
                te5Var4.getClass();
                return iw9.B(te5Var4.b(new wv(l6b.Companion.serializer(), 0), arrayList));
        }
    }
}
