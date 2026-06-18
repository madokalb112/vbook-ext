package defpackage;

import android.content.Context;
import android.os.Bundle;
import androidx.glance.appwidget.GlanceAppWidgetReceiver;
import com.reader.data.updates.impl.bookupdate.AndroidBookUpdateWorker;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class oc extends o1a implements yb4 {
    public final /* synthetic */ int a;
    public int b;
    public int c;
    public Object d;
    public Object e;
    public Object f;
    public Object s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oc(kba kbaVar, int i, sia siaVar, a07 a07Var, a07 a07Var2, jt1 jt1Var) {
        super(2, jt1Var);
        this.a = 6;
        this.d = kbaVar;
        this.c = i;
        this.e = siaVar;
        this.f = a07Var;
        this.s = a07Var2;
    }

    @Override // defpackage.vc0
    public final jt1 create(Object obj, jt1 jt1Var) {
        switch (this.a) {
            case 0:
                return new oc((AndroidBookUpdateWorker) this.d, (a82) this.e, (String) this.f, (ky4) this.s, this.c, jt1Var);
            case 1:
                return new oc((gv4) this.d, jt1Var, (yb4) this.e);
            case 2:
                oc ocVar = new oc((nv2) this.s, jt1Var, 2);
                ocVar.f = obj;
                return ocVar;
            case 3:
                oc ocVar2 = new oc((GlanceAppWidgetReceiver) this.e, (Context) this.f, this.c, (Bundle) this.s, jt1Var);
                ocVar2.d = obj;
                return ocVar2;
            case 4:
                oc ocVar3 = new oc((GlanceAppWidgetReceiver) this.e, (Context) this.s, this.c, (String) this.f, jt1Var);
                ocVar3.d = obj;
                return ocVar3;
            case 5:
                return new oc((yk4) this.s, jt1Var, 5);
            case 6:
                return new oc((kba) this.d, this.c, (sia) this.e, (a07) this.f, (a07) this.s, jt1Var);
            case 7:
                oc ocVar4 = new oc((c1b) this.s, jt1Var, 7);
                ocVar4.f = obj;
                return ocVar4;
            case 8:
                oc ocVar5 = new oc((ehb) this.s, (String) this.f, jt1Var);
                ocVar5.e = obj;
                return ocVar5;
            default:
                oc ocVar6 = new oc((String) this.s, jt1Var, 9);
                ocVar6.e = obj;
                return ocVar6;
        }
    }

    @Override // defpackage.yb4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        heb hebVar = heb.a;
        switch (i) {
            case 0:
                return ((oc) create((vx1) obj, (jt1) obj2)).invokeSuspend(hebVar);
            case 1:
                return ((oc) create((vx1) obj, (jt1) obj2)).invokeSuspend(hebVar);
            case 2:
                return ((oc) create((vx1) obj, (jt1) obj2)).invokeSuspend(hebVar);
            case 3:
                return ((oc) create((vx1) obj, (jt1) obj2)).invokeSuspend(hebVar);
            case 4:
                return ((oc) create((vx1) obj, (jt1) obj2)).invokeSuspend(hebVar);
            case 5:
                return ((oc) create((vx1) obj, (jt1) obj2)).invokeSuspend(hebVar);
            case 6:
                return ((oc) create((vx1) obj, (jt1) obj2)).invokeSuspend(hebVar);
            case 7:
                return ((oc) create((vx1) obj, (jt1) obj2)).invokeSuspend(hebVar);
            case 8:
                return ((oc) create((vx1) obj, (jt1) obj2)).invokeSuspend(hebVar);
            default:
                return ((oc) create((gnb) obj, (jt1) obj2)).invokeSuspend(hebVar);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:117:0x0255, code lost:
    
        if (r4 == r8) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0044, code lost:
    
        if (r0 == r8) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:214:0x051d, code lost:
    
        if (r0 == r8) goto L215;
     */
    /* JADX WARN: Code restructure failed: missing block: B:266:0x05ff, code lost:
    
        if (defpackage.qn9.j(r0, r22) != r8) goto L268;
     */
    /* JADX WARN: Code restructure failed: missing block: B:272:0x061a, code lost:
    
        if (defpackage.qn9.j(r1, r22) == r8) goto L273;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x017f, code lost:
    
        if (r6 != r8) goto L80;
     */
    /* JADX WARN: Removed duplicated region for block: B:164:0x03fa  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x04b2  */
    /* JADX WARN: Removed duplicated region for block: B:342:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x014a A[Catch: all -> 0x0093, TRY_ENTER, TryCatch #1 {all -> 0x0093, blocks: (B:28:0x008e, B:34:0x00a2, B:77:0x0166, B:70:0x014a), top: B:290:0x007e }] */
    @Override // defpackage.vc0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r23) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1666
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oc.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oc(gv4 gv4Var, jt1 jt1Var, yb4 yb4Var) {
        super(2, jt1Var);
        this.a = 1;
        this.d = gv4Var;
        this.e = yb4Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oc(ehb ehbVar, String str, jt1 jt1Var) {
        super(2, jt1Var);
        this.a = 8;
        this.s = ehbVar;
        this.f = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oc(GlanceAppWidgetReceiver glanceAppWidgetReceiver, Context context, int i, Bundle bundle, jt1 jt1Var) {
        super(2, jt1Var);
        this.a = 3;
        this.e = glanceAppWidgetReceiver;
        this.f = context;
        this.c = i;
        this.s = bundle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oc(GlanceAppWidgetReceiver glanceAppWidgetReceiver, Context context, int i, String str, jt1 jt1Var) {
        super(2, jt1Var);
        this.a = 4;
        this.e = glanceAppWidgetReceiver;
        this.s = context;
        this.c = i;
        this.f = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oc(AndroidBookUpdateWorker androidBookUpdateWorker, a82 a82Var, String str, ky4 ky4Var, int i, jt1 jt1Var) {
        super(2, jt1Var);
        this.a = 0;
        this.d = androidBookUpdateWorker;
        this.e = a82Var;
        this.f = str;
        this.s = ky4Var;
        this.c = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ oc(Object obj, jt1 jt1Var, int i) {
        super(2, jt1Var);
        this.a = i;
        this.s = obj;
    }
}
