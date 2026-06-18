package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class gwb extends o1a implements zb4 {
    public int a;
    public /* synthetic */ ct7 b;
    public /* synthetic */ hv4 c;
    public final /* synthetic */ hwb d;
    public final /* synthetic */ boolean e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gwb(jt1 jt1Var, hwb hwbVar, boolean z) {
        super(3, jt1Var);
        this.d = hwbVar;
        this.e = z;
    }

    @Override // defpackage.zb4
    public final Object c(Object obj, Object obj2, Object obj3) {
        gwb gwbVar = new gwb((jt1) obj3, this.d, this.e);
        gwbVar.b = (ct7) obj;
        gwbVar.c = (hv4) obj2;
        return gwbVar.invokeSuspend(heb.a);
    }

    @Override // defpackage.vc0
    public final Object invokeSuspend(Object obj) {
        Object pm2Var;
        dl2 dl2Var;
        List arrayList;
        ct7 ct7Var = this.b;
        hv4 hv4Var = this.c;
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
        bbb bbbVar = hv4Var.a;
        Object obj2 = hv4Var.b;
        Object obj3 = ct7Var.a;
        gv4 gv4VarD = ((ks4) obj3).d();
        yv4 yv4VarE = gv4VarD.e();
        wh7 wh7VarP = gv4VarD.p0().c().p();
        if (wh7VarP instanceof zvb) {
            yv4 yv4Var = yv4.c;
            if (!lc5.Q(yv4VarE, yv4Var)) {
                throw new r91(9, "Handshake exception, expected status code " + yv4Var.a + " but was " + yv4VarE.a, null);
            }
            if (!(obj2 instanceof cwb)) {
                throw new r91(9, "Handshake exception, expected `WebSocketSession` content but was " + ug8.a(obj2.getClass()), null);
            }
            k46 k46Var = iwb.c;
            if (ww1.S(k46Var)) {
                k46Var.j("Receive websocket session from " + ((ks4) obj3).c().getUrl() + ": " + obj2);
            }
            hwb hwbVar = this.d;
            long j = hwbVar.a;
            if (j != 2147483647L) {
                ((cwb) obj2).F0(j);
            }
            if (bbbVar.a.equals(ug8.a(yf2.class))) {
                cwb cwbVar = (cwb) obj2;
                boolean z = cwbVar instanceof dl2;
                if (z) {
                    dl2Var = (dl2) cwbVar;
                } else {
                    yvb yvbVar = hwbVar.c;
                    k46 k46Var2 = kl2.a;
                    yvbVar.getClass();
                    if (z) {
                        gp.l("Cannot wrap other DefaultWebSocketSession");
                        return null;
                    }
                    jl2 jl2Var = new jl2(cwbVar, yvbVar.a, yvbVar.b);
                    jl2Var.F0(hwbVar.a);
                    dl2Var = jl2Var;
                }
                ks4 ks4Var = (ks4) obj3;
                yf2 yf2Var = new yf2(ks4Var, dl2Var);
                if (this.e) {
                    String strC = ks4Var.d().a().c("Sec-WebSocket-Extensions");
                    if (strC != null) {
                        List listP0 = bw9.p0(strC, new String[]{","});
                        ArrayList arrayList2 = new ArrayList(gc1.M(listP0, 10));
                        Iterator it = listP0.iterator();
                        while (it.hasNext()) {
                            List listP02 = bw9.p0((String) it.next(), new String[]{";"});
                            String string = bw9.B0((String) fc1.x0(listP02)).toString();
                            List listT0 = fc1.t0(listP02, 1);
                            ArrayList arrayList3 = new ArrayList(gc1.M(listT0, 10));
                            Iterator it2 = listT0.iterator();
                            while (it2.hasNext()) {
                                arrayList3.add(bw9.B0((String) it2.next()).toString());
                            }
                            arrayList2.add(new wo9(string, arrayList3));
                        }
                    }
                    List list = (List) ks4Var.getAttributes().c(iwb.a);
                    arrayList = new ArrayList();
                    Iterator it3 = list.iterator();
                    if (it3.hasNext()) {
                        throw j39.h(it3);
                    }
                } else {
                    arrayList = lc3.a;
                }
                yf2Var.a.x0(arrayList);
                pm2Var = yf2Var;
            } else {
                pm2Var = new pm2((ks4) obj3, (cwb) obj2);
            }
            hv4 hv4Var2 = new hv4(bbbVar, pm2Var);
            this.b = null;
            this.c = null;
            this.a = 1;
            Object objD = ct7Var.d(this, hv4Var2);
            xx1 xx1Var = xx1.a;
            if (objD == xx1Var) {
                return xx1Var;
            }
        } else {
            k46 k46Var3 = iwb.c;
            if (ww1.S(k46Var3)) {
                k46Var3.j("Skipping non-websocket response from " + ((ks4) obj3).c().getUrl() + ": " + wh7VarP);
                return hebVar;
            }
        }
        return hebVar;
    }
}
