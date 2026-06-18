package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class gb3 extends o1a implements yb4 {
    public final /* synthetic */ int a;
    public Object b;
    public int c;
    public int d;
    public int e;
    public Object f;
    public Object s;
    public Object t;
    public Object u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gb3(bp bpVar, List list, int i, int i2, uka ukaVar, kk kkVar, jt1 jt1Var) {
        super(2, jt1Var);
        this.a = 5;
        this.f = bpVar;
        this.s = list;
        this.d = i;
        this.e = i2;
        this.t = ukaVar;
        this.b = kkVar;
    }

    public static final void m(bp bpVar, List list, ArrayList arrayList, vx1 vx1Var, int i, int i2, uka ukaVar, kk kkVar, int i3, int i4) {
        bp bpVarI = bpVar.i(i3, i4);
        List listR0 = f39.r0(new r04(new vx3(new jc1(list, 0), true, new g25(i3, i4, 2)), new vl0(i3, 14)));
        if (i4 - i3 == 1) {
            List listE = bpVarI.e(0, bpVarI.b.length(), "androidx.compose.foundation.text.inlineContent");
            if (!listE.isEmpty()) {
                arrayList.add(ah1.x(vx1Var, null, new xia(listE, i3, i4, i, i2, null), 3));
                return;
            }
        }
        arrayList.add(ah1.x(vx1Var, null, new a71(bpVarI, ukaVar, kkVar, listR0, i3, i4, i, (jt1) null), 3));
    }

    @Override // defpackage.vc0
    public final jt1 create(Object obj, jt1 jt1Var) {
        switch (this.a) {
            case 0:
                gb3 gb3Var = new gb3((lb3) this.s, jt1Var);
                gb3Var.u = obj;
                return gb3Var;
            case 1:
                return new gb3((List) this.t, (r64) this.u, jt1Var);
            case 2:
                return new gb3((a76) this.b, jt1Var, 2);
            case 3:
                return new gb3((t78) this.b, jt1Var, 3);
            case 4:
                return new gb3((b89) this.b, jt1Var, 4);
            case 5:
                gb3 gb3Var2 = new gb3((bp) this.f, (List) this.s, this.d, this.e, (uka) this.t, (kk) this.b, jt1Var);
                gb3Var2.u = obj;
                return gb3Var2;
            case 6:
                return new gb3((yva) this.b, jt1Var, 6);
            default:
                return new gb3((rab) this.b, jt1Var, 7);
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
        return ((gb3) create(vx1Var, jt1Var)).invokeSuspend(hebVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:123:0x0308  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x037e  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x03a9  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0402  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0520 A[Catch: all -> 0x0572, TryCatch #0 {all -> 0x0572, blocks: (B:187:0x052c, B:189:0x0532, B:191:0x053e, B:193:0x0548, B:199:0x0565, B:169:0x047a, B:184:0x0512, B:186:0x0520, B:172:0x0492, B:180:0x04f4, B:176:0x04b2), top: B:203:0x044b }] */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0532 A[Catch: all -> 0x0572, TryCatch #0 {all -> 0x0572, blocks: (B:187:0x052c, B:189:0x0532, B:191:0x053e, B:193:0x0548, B:199:0x0565, B:169:0x047a, B:184:0x0512, B:186:0x0520, B:172:0x0492, B:180:0x04f4, B:176:0x04b2), top: B:203:0x044b }] */
    /* JADX WARN: Removed duplicated region for block: B:249:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:107:0x029b -> B:109:0x029f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:122:0x0306 -> B:124:0x030a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:143:0x03a7 -> B:151:0x03fb). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:145:0x03c2 -> B:147:0x03c7). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x0062 -> B:8:0x002e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:44:0x0109 -> B:46:0x010d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:91:0x022b -> B:83:0x01e5). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.vc0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r26) {
        /*
            Method dump skipped, instruction units count: 1414
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gb3.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gb3(lb3 lb3Var, jt1 jt1Var) {
        super(2, jt1Var);
        this.a = 0;
        this.s = lb3Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gb3(qtb qtbVar, jt1 jt1Var, int i) {
        super(2, jt1Var);
        this.a = i;
        this.b = qtbVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gb3(List list, r64 r64Var, jt1 jt1Var) {
        super(2, jt1Var);
        this.a = 1;
        this.t = list;
        this.u = r64Var;
    }
}
