package defpackage;

import java.nio.channels.AsynchronousFileChannel;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class nz extends zy {
    public final /* synthetic */ AsynchronousFileChannel a;
    public final /* synthetic */ rz b;
    public final /* synthetic */ String c;

    public nz(AsynchronousFileChannel asynchronousFileChannel, rz rzVar, String str) {
        this.a = asynchronousFileChannel;
        this.b = rzVar;
        this.c = str;
    }

    @Override // defpackage.ax
    public final Object a(kt1 kt1Var) {
        this.a.close();
        return heb.a;
    }

    @Override // defpackage.zy, defpackage.fx
    public final Object e(kt1 kt1Var) {
        AsynchronousFileChannel asynchronousFileChannel = this.a;
        this.b.getClass();
        return pu1.n0(new qz(asynchronousFileChannel, null), kt1Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.zy, defpackage.fx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(defpackage.kt1 r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.mz
            if (r0 == 0) goto L13
            r0 = r5
            mz r0 = (defpackage.mz) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            mz r0 = new mz
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.a
            int r1 = r0.c
            r2 = 1
            if (r1 == 0) goto L2c
            if (r1 != r2) goto L25
            defpackage.e11.e0(r5)
            goto L3a
        L25:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            gp.j(r4)
            r4 = 0
            return r4
        L2c:
            defpackage.e11.e0(r5)
            r0.c = r2
            java.lang.Object r5 = r4.e(r0)
            xx1 r4 = defpackage.xx1.a
            if (r5 != r4) goto L3a
            return r4
        L3a:
            java.lang.Number r5 = (java.lang.Number) r5
            long r4 = r5.longValue()
            r0 = 0
            int r4 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r4 < 0) goto L47
            goto L48
        L47:
            r2 = 0
        L48:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r2)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nz.h(kt1):java.lang.Object");
    }

    @Override // defpackage.zy
    public final Object i(long j, byte[] bArr, int i, int i2, jt1 jt1Var) {
        return dk9.y(new lz(this.a, bArr, i, i2, j, 0), (kt1) jt1Var);
    }

    @Override // defpackage.zy
    public final Object j(long j, byte[] bArr, int i, int i2, jt1 jt1Var) {
        Object objY = dk9.y(new lz(this.a, bArr, i, i2, j, 1), (kt1) jt1Var);
        return objY == xx1.a ? objY : heb.a;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.b.a);
        sb.append('(');
        return xv5.s(sb, this.c, ')');
    }
}
