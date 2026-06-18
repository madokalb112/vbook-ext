package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class fwb extends o1a implements zb4 {
    public int a;
    public /* synthetic */ ct7 b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ hwb d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fwb(jt1 jt1Var, hwb hwbVar, boolean z) {
        super(3, jt1Var);
        this.c = z;
        this.d = hwbVar;
    }

    @Override // defpackage.zb4
    public final Object c(Object obj, Object obj2, Object obj3) {
        fwb fwbVar = new fwb((jt1) obj3, this.d, this.c);
        fwbVar.b = (ct7) obj;
        return fwbVar.invokeSuspend(heb.a);
    }

    @Override // defpackage.vc0
    public final Object invokeSuspend(Object obj) {
        ct7 ct7Var = this.b;
        int i = this.a;
        heb hebVar = heb.a;
        if (i != 0) {
            if (i == 1) {
                e11.e0(obj);
                return hebVar;
            }
            gp.j("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        e11.e0(obj);
        Object obj2 = ct7Var.a;
        tcb tcbVarD = ((xu4) obj2).a.d();
        tcbVarD.getClass();
        String str = tcbVarD.a;
        if (str.equals("ws") || str.equals("wss")) {
            k46 k46Var = iwb.c;
            if (ww1.S(k46Var)) {
                k46Var.j("Sending WebSocket request " + ((xu4) obj2).a);
            }
            xu4 xu4Var = (xu4) obj2;
            xu4Var.c(xvb.a, hebVar);
            boolean z = this.c;
            hwb hwbVar = this.d;
            if (z) {
                ArrayList arrayList = hwbVar.b.a;
                ArrayList arrayList2 = new ArrayList(gc1.M(arrayList, 10));
                int size = arrayList.size();
                int i2 = 0;
                while (i2 < size) {
                    Object obj3 = arrayList.get(i2);
                    i2++;
                    if (((ib4) obj3).invoke() != null) {
                        j31.j();
                        return null;
                    }
                    arrayList2.add(null);
                }
                xu4Var.f.f(iwb.a, arrayList2);
                ArrayList arrayList3 = new ArrayList();
                Iterator it = arrayList2.iterator();
                if (it.hasNext()) {
                    throw j39.h(it);
                }
                if (!arrayList3.isEmpty()) {
                    ym9.g(xu4Var, "Sec-WebSocket-Extensions", fc1.D0(arrayList3, ",", null, null, null, 62));
                }
            }
            on1 on1Var = xu4Var.f;
            j00 j00Var = iwb.b;
            on1Var.getClass();
            j00Var.getClass();
            hwbVar.getClass();
            on1Var.f(j00Var, hwbVar);
            zvb zvbVar = new zvb();
            this.b = null;
            this.a = 1;
            Object objD = ct7Var.d(this, zvbVar);
            xx1 xx1Var = xx1.a;
            if (objD == xx1Var) {
                return xx1Var;
            }
        } else {
            k46 k46Var2 = iwb.c;
            if (ww1.S(k46Var2)) {
                k46Var2.j("Skipping WebSocket plugin for non-websocket request: " + ((xu4) obj2).a);
                return hebVar;
            }
        }
        return hebVar;
    }
}
