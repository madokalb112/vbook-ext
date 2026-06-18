package defpackage;

import java.io.Serializable;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class m42 extends o1a implements kb4 {
    public Object a;
    public Serializable b;
    public Object c;
    public Object d;
    public Iterator e;
    public int f;
    public int s;
    public final /* synthetic */ a52 t;
    public final /* synthetic */ s16 u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m42(a52 a52Var, s16 s16Var, jt1 jt1Var) {
        super(1, jt1Var);
        this.t = a52Var;
        this.u = s16Var;
    }

    @Override // defpackage.vc0
    public final jt1 create(jt1 jt1Var) {
        return new m42(this.t, this.u, jt1Var);
    }

    @Override // defpackage.kb4
    public final Object invoke(Object obj) {
        return ((m42) create((jt1) obj)).invokeSuspend(heb.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00fd  */
    @Override // defpackage.vc0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            Method dump skipped, instruction units count: 273
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m42.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
