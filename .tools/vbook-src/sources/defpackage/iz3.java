package defpackage;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class iz3 implements ht3 {
    public final /* synthetic */ int a;
    public final kg2 b;
    public final q58 c;

    public iz3(q58 q58Var, kg2 kg2Var) {
        this.a = 2;
        this.c = q58Var;
        this.b = kg2Var;
    }

    @Override // defpackage.r58
    public final Object get() {
        int i = this.a;
        kg2 kg2Var = this.b;
        q58 q58Var = this.c;
        switch (i) {
            case 0:
                Context context = (Context) kg2Var.a;
                jx1 jx1Var = (jx1) q58Var.get();
                context.getClass();
                jx1Var.getClass();
                return o90.a(fu6.H, new q43(new se3(19)), wx1.b(jx1Var), new gz3(context, 0));
            case 1:
                return new d38((Context) kg2Var.a, (wjb) q58Var.get());
            default:
                return new ji8((qu) q58Var.get(), (jx1) kg2Var.a);
        }
    }

    public /* synthetic */ iz3(kg2 kg2Var, q58 q58Var, int i) {
        this.a = i;
        this.b = kg2Var;
        this.c = q58Var;
    }
}
