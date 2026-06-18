package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class me5 extends kc4 implements zb4 {
    public static final me5 a = new me5(3, pe5.class, "onAwaitInternalRegFunc", "onAwaitInternalRegFunc(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);

    @Override // defpackage.zb4
    public final Object c(Object obj, Object obj2, Object obj3) {
        pe5 pe5Var = (pe5) obj;
        g09 g09Var = (g09) obj2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = pe5.a;
        while (true) {
            Object objH = pe5Var.H();
            if (!(objH instanceof t55)) {
                if (!(objH instanceof ei1)) {
                    objH = qe5.a(objH);
                }
                g09Var.e = objH;
            } else if (pe5Var.d0(objH) >= 0) {
                g09Var.c = qx1.B(pe5Var, true, new je5(pe5Var, g09Var));
                break;
            }
        }
        return heb.a;
    }
}
