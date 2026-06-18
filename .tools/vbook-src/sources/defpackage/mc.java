package defpackage;

import com.reader.data.updates.impl.bookupdate.AndroidBookUpdateWorker;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class mc implements yb4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ vx1 b;
    public final /* synthetic */ AndroidBookUpdateWorker c;

    public /* synthetic */ mc(vx1 vx1Var, AndroidBookUpdateWorker androidBookUpdateWorker, int i) {
        this.a = i;
        this.b = vx1Var;
        this.c = androidBookUpdateWorker;
    }

    @Override // defpackage.yb4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        heb hebVar = heb.a;
        vx1 vx1Var = this.b;
        switch (i) {
            case 0:
                ah1.J(vx1Var, null, null, new nc(this.c, ((Integer) obj).intValue(), ((Integer) obj2).intValue(), null, 1), 3);
                break;
            default:
                ah1.J(vx1Var, null, null, new pc(this.c, (a82) obj, ((Integer) obj2).intValue(), (jt1) null, 0), 3);
                break;
        }
        return hebVar;
    }
}
