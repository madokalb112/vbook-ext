package defpackage;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class n55 extends o1a implements yb4 {
    public final /* synthetic */ Object A;
    public final /* synthetic */ int a = 1;
    public LinkedHashMap b;
    public Iterator c;
    public Object d;
    public int e;
    public int f;
    public int s;
    public Object t;
    public Object u;
    public Object v;
    public Object w;
    public Object x;
    public Object y;
    public Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n55(List list, o55 o55Var, jt1 jt1Var) {
        super(2, jt1Var);
        this.A = list;
        this.x = o55Var;
    }

    @Override // defpackage.vc0
    public final jt1 create(Object obj, jt1 jt1Var) {
        int i = this.a;
        Object obj2 = this.A;
        switch (i) {
            case 0:
                n55 n55Var = new n55((List) obj2, (o55) this.x, jt1Var);
                n55Var.z = obj;
                return n55Var;
            default:
                return new n55((hra) obj2, jt1Var);
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
        return ((n55) create(vx1Var, jt1Var)).invokeSuspend(hebVar);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:66|(1:116)|67|68|114|69|70|112|71|(4:74|75|84|(2:86|(12:89|90|(0)(0)|(0)|96|(0)|102|104|(0)|110|64|(1:129)(0)))(6:103|104|(0)|110|64|(0)(0)))|88|130) */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x008d, code lost:
    
        if (defpackage.hra.N(r5, true, r24) == r4) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x028b, code lost:
    
        r17 = r6;
        r6 = r3;
        r3 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0290, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0292, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0328  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0331  */
    /* JADX WARN: Removed duplicated region for block: B:129:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x02ed  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x02f0  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x02f3  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x02fe A[LOOP:0: B:98:0x02fe->B:101:0x0321, LOOP_START] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:103:0x0328 -> B:104:0x032b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x012b -> B:34:0x0132). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:89:0x02e5 -> B:90:0x02e9). Please report as a decompilation issue!!! */
    @Override // defpackage.vc0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r25) {
        /*
            Method dump skipped, instruction units count: 884
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n55.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n55(hra hraVar, jt1 jt1Var) {
        super(2, jt1Var);
        this.A = hraVar;
    }
}
