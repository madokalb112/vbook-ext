package defpackage;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class ar2 extends o1a implements yb4 {
    public /* synthetic */ Object A;
    public final /* synthetic */ ir2 B;
    public ir2 a;
    public vx1 b;
    public vm3 c;
    public List d;
    public Iterator e;
    public String f;
    public List s;
    public int t;
    public int u;
    public int v;
    public int w;
    public int x;
    public int y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ar2(ir2 ir2Var, jt1 jt1Var) {
        super(2, jt1Var);
        this.B = ir2Var;
    }

    @Override // defpackage.vc0
    public final jt1 create(Object obj, jt1 jt1Var) {
        ar2 ar2Var = new ar2(this.B, jt1Var);
        ar2Var.A = obj;
        return ar2Var;
    }

    @Override // defpackage.yb4
    public final Object invoke(Object obj, Object obj2) {
        return ((ar2) create((vx1) obj, (jt1) obj2)).invokeSuspend(heb.a);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:129|53|54|138|55|56|133|57|58|(1:149)(10:61|127|62|63|64|137|76|(1:78)|79|(2:81|(2:83|146)(6:84|85|89|49|(2:51|90)(1:91)|(0)(0)))(5:88|140|49|(0)(0)|(0)(0)))) */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0202, code lost:
    
        r37 = r5;
        r5 = r4;
        r4 = r8;
        r8 = r9;
        r9 = r13;
        r13 = r37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x020b, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x020c, code lost:
    
        r6 = r27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x020f, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0210, code lost:
    
        r6 = r27;
     */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0330 A[Catch: all -> 0x027e, TryCatch #5 {all -> 0x027e, blocks: (B:76:0x021d, B:79:0x0222, B:81:0x0227, B:89:0x0291, B:75:0x0217, B:93:0x02a7, B:95:0x02bb, B:102:0x0300, B:106:0x0330, B:107:0x0335, B:110:0x034f, B:111:0x035a, B:112:0x035b, B:114:0x0365, B:116:0x0386), top: B:137:0x021d }] */
    /* JADX WARN: Removed duplicated region for block: B:112:0x035b A[Catch: all -> 0x027e, TryCatch #5 {all -> 0x027e, blocks: (B:76:0x021d, B:79:0x0222, B:81:0x0227, B:89:0x0291, B:75:0x0217, B:93:0x02a7, B:95:0x02bb, B:102:0x0300, B:106:0x0330, B:107:0x0335, B:110:0x034f, B:111:0x035a, B:112:0x035b, B:114:0x0365, B:116:0x0386), top: B:137:0x021d }] */
    /* JADX WARN: Removed duplicated region for block: B:148:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0198 A[Catch: all -> 0x0047, TryCatch #2 {all -> 0x0047, blocks: (B:10:0x0036, B:42:0x0192, B:44:0x0198, B:46:0x01a0, B:17:0x006e, B:20:0x00a6, B:28:0x011b, B:38:0x0178, B:41:0x0185, B:32:0x012a, B:34:0x0158), top: B:131:0x001a }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0227 A[Catch: all -> 0x027e, TryCatch #5 {all -> 0x027e, blocks: (B:76:0x021d, B:79:0x0222, B:81:0x0227, B:89:0x0291, B:75:0x0217, B:93:0x02a7, B:95:0x02bb, B:102:0x0300, B:106:0x0330, B:107:0x0335, B:110:0x034f, B:111:0x035a, B:112:0x035b, B:114:0x0365, B:116:0x0386), top: B:137:0x021d }] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x02a3 A[ADDED_TO_REGION, REMOVE] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x02a7 A[Catch: all -> 0x027e, TryCatch #5 {all -> 0x027e, blocks: (B:76:0x021d, B:79:0x0222, B:81:0x0227, B:89:0x0291, B:75:0x0217, B:93:0x02a7, B:95:0x02bb, B:102:0x0300, B:106:0x0330, B:107:0x0335, B:110:0x034f, B:111:0x035a, B:112:0x035b, B:114:0x0365, B:116:0x0386), top: B:137:0x021d }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:103:0x0324 -> B:105:0x0327). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:108:0x0336 -> B:109:0x0343). Please report as a decompilation issue!!! */
    @Override // defpackage.vc0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r39) {
        /*
            Method dump skipped, instruction units count: 965
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ar2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
