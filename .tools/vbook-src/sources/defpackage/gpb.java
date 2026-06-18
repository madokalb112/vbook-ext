package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class gpb extends o1a implements yb4 {
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ Object c;
    public /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gpb(nc1 nc1Var, String str, uqb uqbVar, rg8 rg8Var, jt1 jt1Var) {
        super(2, jt1Var);
        this.a = 1;
        this.d = nc1Var;
        this.c = str;
        this.e = uqbVar;
        this.f = rg8Var;
    }

    @Override // defpackage.vc0
    public final jt1 create(Object obj, jt1 jt1Var) {
        int i = this.a;
        Object obj2 = this.f;
        Object obj3 = this.c;
        Object obj4 = this.e;
        switch (i) {
            case 0:
                return new gpb((wq5) this.d, (a07) obj4, (String) obj3, (a07) obj2, jt1Var);
            case 1:
                return new gpb((nc1) this.d, (String) obj3, (uqb) obj4, (rg8) obj2, jt1Var);
            case 2:
                gpb gpbVar = new gpb((owb) obj4, this.f, (List) obj3, jt1Var, 2);
                gpbVar.d = obj;
                return gpbVar;
            case 3:
                gpb gpbVar2 = new gpb((ArrayList) obj4, (h49) obj2, (w1b) obj3, jt1Var, 3);
                gpbVar2.d = obj;
                return gpbVar2;
            case 4:
                return new gpb((String) obj3, (owb) this.d, (String) obj4, (String) obj2, jt1Var);
            case 5:
                gpb gpbVar3 = new gpb((String) obj3, (String) obj4, (String) obj2, jt1Var);
                gpbVar3.d = obj;
                return gpbVar3;
            case 6:
                return new gpb((rg8) this.d, (ff8) obj4, (mx5) obj2, (h0c) obj3, jt1Var, 6);
            default:
                return new gpb((zz5) this.d, (d2c) obj4, (m1c) obj2, (Context) obj3, jt1Var, 7);
        }
    }

    @Override // defpackage.yb4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        heb hebVar = heb.a;
        switch (i) {
        }
        return ((gpb) create((vx1) obj, (jt1) obj2)).invokeSuspend(hebVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:109:0x023d, code lost:
    
        if (r5 != r2) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x02e6, code lost:
    
        if (wq5.f(r4, r2, r17) == r1) goto L148;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0162, code lost:
    
        if (r2 == r7) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0187, code lost:
    
        if (r2 == r7) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x018a, code lost:
    
        return r7;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Path cross not found for [B:113:0x0245, B:115:0x024b], limit reached: 169 */
    /* JADX WARN: Removed duplicated region for block: B:103:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:169:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r5v0, types: [jt1] */
    /* JADX WARN: Type inference failed for: r5v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v18 */
    /* JADX WARN: Type inference failed for: r5v39 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:109:0x023d -> B:111:0x0241). Please report as a decompilation issue!!! */
    @Override // defpackage.vc0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 768
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gpb.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gpb(wq5 wq5Var, a07 a07Var, String str, a07 a07Var2, jt1 jt1Var) {
        super(2, jt1Var);
        this.a = 0;
        this.d = wq5Var;
        this.e = a07Var;
        this.c = str;
        this.f = a07Var2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gpb(Object obj, Object obj2, Object obj3, jt1 jt1Var, int i) {
        super(2, jt1Var);
        this.a = i;
        this.e = obj;
        this.f = obj2;
        this.c = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gpb(Object obj, Object obj2, Object obj3, Object obj4, jt1 jt1Var, int i) {
        super(2, jt1Var);
        this.a = i;
        this.d = obj;
        this.e = obj2;
        this.f = obj3;
        this.c = obj4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gpb(String str, owb owbVar, String str2, String str3, jt1 jt1Var) {
        super(2, jt1Var);
        this.a = 4;
        this.c = str;
        this.d = owbVar;
        this.e = str2;
        this.f = str3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gpb(String str, String str2, String str3, jt1 jt1Var) {
        super(2, jt1Var);
        this.a = 5;
        this.c = str;
        this.e = str2;
        this.f = str3;
    }
}
