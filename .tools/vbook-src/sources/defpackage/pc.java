package defpackage;

import android.content.Context;
import androidx.glance.appwidget.GlanceAppWidgetReceiver;
import com.reader.data.server.AndroidTestServerService;
import com.reader.data.updates.impl.bookupdate.AndroidBookUpdateWorker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class pc extends o1a implements yb4 {
    public final /* synthetic */ int a;
    public int b;
    public int c;
    public Object d;
    public final /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pc(Object obj, int i, Object obj2, jt1 jt1Var, int i2) {
        super(2, jt1Var);
        this.a = i2;
        this.d = obj;
        this.c = i;
        this.e = obj2;
    }

    private final Object m(Object obj) {
        hra hraVar = (hra) this.e;
        vx1 vx1Var = (vx1) this.d;
        int i = this.b;
        if (i == 0) {
            e11.e0(obj);
            List list = (List) hraVar.Z.getValue();
            if (list == null) {
                list = lc3.a;
            }
            List list2 = list;
            int i2 = this.c;
            ha5 ha5Var = new ha5(i2 - 1, i2 + 1, 1);
            int i3 = this.c;
            ArrayList arrayList = new ArrayList(gc1.M(ha5Var, 10));
            Iterator it = ha5Var.iterator();
            while (true) {
                w21 w21Var = (w21) it;
                if (!w21Var.d) {
                    break;
                }
                arrayList.add(ah1.x(vx1Var, null, new lq0(list2, w21Var.nextInt(), hraVar, i3, null), 3));
            }
            this.d = null;
            this.b = 1;
            obj = vm7.K(arrayList, this);
            xx1 xx1Var = xx1.a;
            if (obj == xx1Var) {
                return xx1Var;
            }
        } else {
            if (i != 1) {
                gp.j("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            e11.e0(obj);
        }
        return gc1.O((Iterable) obj);
    }

    @Override // defpackage.vc0
    public final jt1 create(Object obj, jt1 jt1Var) {
        int i = this.a;
        Object obj2 = this.e;
        switch (i) {
            case 0:
                return new pc((AndroidBookUpdateWorker) this.d, (a82) obj2, this.c, jt1Var, 0);
            case 1:
                pc pcVar = new pc((AndroidTestServerService) obj2, this.c, jt1Var, 1);
                pcVar.d = obj;
                return pcVar;
            case 2:
                pc pcVar2 = new pc((ul0) obj2, this.c, jt1Var, 2);
                pcVar2.d = obj;
                return pcVar2;
            case 3:
                return new pc((my1) this.d, (ym) obj2, jt1Var, 3);
            case 4:
                pc pcVar3 = new pc((dw2) obj2, this.c, jt1Var, 4);
                pcVar3.d = obj;
                return pcVar3;
            case 5:
                return new pc((GlanceAppWidgetReceiver) this.d, (Context) obj2, this.c, jt1Var, 5);
            case 6:
                pc pcVar4 = new pc((i45) obj2, this.c, jt1Var, 6);
                pcVar4.d = obj;
                return pcVar4;
            case 7:
                pc pcVar5 = new pc((wq5) obj2, this.c, jt1Var, 7);
                pcVar5.d = obj;
                return pcVar5;
            case 8:
                return new pc((st5) this.d, this.c, (a07) obj2, jt1Var, 8);
            case 9:
                return new pc((o27) obj2, jt1Var, 9);
            case 10:
                pc pcVar6 = new pc((hk8) obj2, this.c, jt1Var, 10);
                pcVar6.d = obj;
                return pcVar6;
            case 11:
                return new pc((List) obj2, jt1Var, 11);
            case 12:
                return new pc((my1) this.d, (ym) obj2, jt1Var, 12);
            case 13:
                return new pc((my1) this.d, (ym) obj2, jt1Var, 13);
            case 14:
                pc pcVar7 = new pc((hra) obj2, this.c, jt1Var, 14);
                pcVar7.d = obj;
                return pcVar7;
            default:
                return new pc((h49) this.d, this.c, (prb) obj2, jt1Var, 15);
        }
    }

    @Override // defpackage.yb4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        heb hebVar = heb.a;
        switch (i) {
        }
        return ((pc) create((vx1) obj, (jt1) obj2)).invokeSuspend(hebVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:102:0x02ce, code lost:
    
        if (defpackage.ym.b(r0, r5, r2, r1, r23, 4) == r11) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x031f, code lost:
    
        if (defpackage.ym.b(r0, r6, r2, r5, r23, 4) != r11) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:246:0x059b, code lost:
    
        if (defpackage.pu1.D(r5, r0, r23) == r2) goto L250;
     */
    /* JADX WARN: Code restructure failed: missing block: B:249:0x05a5, code lost:
    
        if (defpackage.pu1.v0(r5, r0, r23) == r2) goto L250;
     */
    /* JADX WARN: Code restructure failed: missing block: B:356:0x0851, code lost:
    
        if (defpackage.ym.b(r0, r5, r2, r1, r23, 4) == r7) goto L367;
     */
    /* JADX WARN: Code restructure failed: missing block: B:366:0x089c, code lost:
    
        if (defpackage.ym.b(r0, r10, r2, r5, r23, 4) != r7) goto L368;
     */
    /* JADX WARN: Code restructure failed: missing block: B:458:0x0a9f, code lost:
    
        if (defpackage.ah1.b0(r0, r15, r23) == r2) goto L459;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0169, code lost:
    
        if (r0 != r11) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:511:?, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0197, code lost:
    
        if (r0 == r11) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x01f2, code lost:
    
        if (r0 != r11) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x021f, code lost:
    
        if (r0 == r11) goto L68;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Path cross not found for [B:224:0x052b, B:225:0x052d], limit reached: 499 */
    /* JADX WARN: Path cross not found for [B:232:0x055d, B:206:0x04ee], limit reached: 499 */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0330  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0336  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x033c  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x048a  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x049c  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x04a3  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x04af  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x04bb  */
    /* JADX WARN: Removed duplicated region for block: B:370:0x08ad  */
    /* JADX WARN: Removed duplicated region for block: B:373:0x08b3  */
    /* JADX WARN: Removed duplicated region for block: B:376:0x08b9  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x023e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:186:0x049a -> B:188:0x049f). Please report as a decompilation issue!!! */
    @Override // defpackage.vc0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r24) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2778
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pc.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pc(Object obj, int i, jt1 jt1Var, int i2) {
        super(2, jt1Var);
        this.a = i2;
        this.e = obj;
        this.c = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pc(kp4 kp4Var, ym ymVar, jt1 jt1Var, int i) {
        super(2, jt1Var);
        this.a = i;
        this.d = kp4Var;
        this.e = ymVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pc(Object obj, jt1 jt1Var, int i) {
        super(2, jt1Var);
        this.a = i;
        this.e = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pc(Object obj, Object obj2, int i, jt1 jt1Var, int i2) {
        super(2, jt1Var);
        this.a = i2;
        this.d = obj;
        this.e = obj2;
        this.c = i;
    }
}
