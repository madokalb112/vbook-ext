package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class yk3 implements kb4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ gl3 b;
    public final /* synthetic */ kb4 c;

    public /* synthetic */ yk3(gl3 gl3Var, kb4 kb4Var, int i) {
        this.a = i;
        this.b = gl3Var;
        this.c = kb4Var;
    }

    @Override // defpackage.kb4
    public final Object invoke(Object obj) {
        int i = this.a;
        heb hebVar = heb.a;
        kb4 kb4Var = this.c;
        gl3 gl3Var = this.b;
        at5 at5Var = (at5) obj;
        switch (i) {
            case 0:
                at5Var.getClass();
                ArrayList arrayList = gl3Var.f;
                at5Var.c0(arrayList.size(), new f7(23, new se3(9), arrayList), new cl3(0, arrayList), new rj1(new dl3(arrayList, kb4Var, 0), true, 802480018));
                break;
            case 1:
                at5Var.getClass();
                ArrayList arrayList2 = gl3Var.f;
                at5Var.c0(arrayList2.size(), new f7(24, new se3(11), arrayList2), new cl3(1, arrayList2), new rj1(new dl3(arrayList2, kb4Var, 2), true, 802480018));
                break;
            case 2:
                at5Var.getClass();
                ArrayList arrayList3 = gl3Var.f;
                at5Var.c0(arrayList3.size(), new f7(25, new se3(8), arrayList3), new cl3(2, arrayList3), new rj1(new dl3(arrayList3, kb4Var, 3), true, 802480018));
                break;
            default:
                at5Var.getClass();
                ArrayList arrayList4 = gl3Var.f;
                at5Var.c0(arrayList4.size(), (kb4) null, new cl3(3, arrayList4), new rj1(new dl3(arrayList4, kb4Var, 1), true, 2039820996));
                break;
        }
        return hebVar;
    }
}
