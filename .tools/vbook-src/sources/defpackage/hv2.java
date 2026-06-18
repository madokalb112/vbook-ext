package defpackage;

import android.content.Context;
import androidx.glance.appwidget.GlanceAppWidgetReceiver;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class hv2 extends o1a implements yb4 {
    public final /* synthetic */ int a = 2;
    public int b;
    public int c;
    public int d;
    public Object e;
    public Object f;
    public Object s;
    public Object t;
    public Object u;
    public Object v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hv2(hra hraVar, String str, String str2, jt1 jt1Var) {
        super(2, jt1Var);
        this.u = hraVar;
        this.e = str;
        this.v = str2;
    }

    @Override // defpackage.vc0
    public final jt1 create(Object obj, jt1 jt1Var) {
        switch (this.a) {
            case 0:
                return new hv2((jv2) this.t, jt1Var);
            case 1:
                hv2 hv2Var = new hv2((List) this.u, (sr3) this.v, jt1Var);
                hv2Var.e = obj;
                return hv2Var;
            case 2:
                hv2 hv2Var2 = new hv2((GlanceAppWidgetReceiver) this.t, (Context) this.u, (int[]) this.v, jt1Var);
                hv2Var2.e = obj;
                return hv2Var2;
            case 3:
                return new hv2(jt1Var, (hra) this.v, (String) this.f);
            default:
                return new hv2((hra) this.u, (String) this.e, (String) this.v, jt1Var);
        }
    }

    @Override // defpackage.yb4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        heb hebVar = heb.a;
        vx1 vx1Var = (vx1) obj;
        jt1 jt1Var = (jt1) obj2;
        switch (i) {
        }
        return ((hv2) create(vx1Var, jt1Var)).invokeSuspend(hebVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:107:0x0383, code lost:
    
        if (defpackage.sr3.k(r2, r48) == r8) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x0510, code lost:
    
        if (r0.E(r48) == r8) goto L176;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0182, code lost:
    
        if (r0 == r8) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x01ad, code lost:
    
        if (r0 == r8) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0234, code lost:
    
        if (((defpackage.xba) r1).a(r2, r48) == r8) goto L77;
     */
    /* JADX WARN: Path cross not found for [B:97:0x032b, B:104:0x0370], limit reached: 204 */
    /* JADX WARN: Removed duplicated region for block: B:116:0x03c6  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x03f3 A[LOOP:3: B:121:0x03ed->B:123:0x03f3, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0424  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0430 A[LOOP:4: B:130:0x0430->B:194:?, LOOP_START] */
    /* JADX WARN: Removed duplicated region for block: B:159:0x04d5  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x04de  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0541  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0565  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0574  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0582  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x02f0  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:127:0x0424 -> B:114:0x03c0). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:177:0x0565 -> B:178:0x056c). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:78:0x025f -> B:79:0x0260). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:92:0x030a -> B:93:0x0311). Please report as a decompilation issue!!! */
    @Override // defpackage.vc0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r49) {
        /*
            Method dump skipped, instruction units count: 1426
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hv2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hv2(jv2 jv2Var, jt1 jt1Var) {
        super(2, jt1Var);
        this.t = jv2Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hv2(jt1 jt1Var, hra hraVar, String str) {
        super(2, jt1Var);
        this.v = hraVar;
        this.f = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hv2(GlanceAppWidgetReceiver glanceAppWidgetReceiver, Context context, int[] iArr, jt1 jt1Var) {
        super(2, jt1Var);
        this.t = glanceAppWidgetReceiver;
        this.u = context;
        this.v = iArr;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hv2(List list, sr3 sr3Var, jt1 jt1Var) {
        super(2, jt1Var);
        this.u = list;
        this.v = sr3Var;
    }
}
