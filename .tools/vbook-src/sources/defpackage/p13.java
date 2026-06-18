package defpackage;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class p13 implements i13 {
    public final m62 a;
    public final yhb b;
    public final dt c;
    public final r13 d;

    public p13(m62 m62Var, yhb yhbVar, dt dtVar, r13 r13Var) {
        this.a = m62Var;
        this.b = yhbVar;
        this.c = dtVar;
        this.d = r13Var;
    }

    public static final r03 a(p13 p13Var, ha2 ha2Var) {
        p13Var.getClass();
        return new r03(ha2Var.a, ha2Var.b, ha2Var.c, ha2Var.d, ha2Var.e, ha2Var.h, ha2Var.i, ha2Var.j, ha2Var.k, ha2Var.l);
    }

    public final Object b(String str, int i, int i2, boolean z, o1a o1aVar) throws db4, ej0 {
        b92 b92Var = this.a.u;
        b92Var.getClass();
        str.getClass();
        na2 na2Var = na2.a;
        List listC = new ka2(b92Var, str, new ia2(b92Var, 0)).c();
        if (listC == null || !listC.isEmpty()) {
            Iterator it = listC.iterator();
            while (it.hasNext()) {
                int i3 = ((ha2) it.next()).k;
                if (i3 == 0 || i3 == 1 || i3 == 2) {
                    throw new ej0();
                }
            }
        }
        yhb yhbVar = this.b;
        x95 x95Var = yhbVar.i;
        km0 km0Var = yhbVar.g;
        ni5[] ni5VarArr = yhb.l;
        boolean zBooleanValue = ((Boolean) km0Var.c(ni5VarArr[7], yhbVar)).booleanValue();
        da7 da7Var = yhbVar.h;
        if (!zBooleanValue) {
            dt dtVar = this.c;
            int iIntValue = ((Number) dtVar.i.c(dt.s[7], dtVar)).intValue();
            String strI = zk4.i(zk4.j(), "yyyyMMdd");
            if (!lc5.Q((String) da7Var.c(ni5VarArr[8], yhbVar), strI)) {
                da7Var.e(ni5VarArr[8], strI);
                x95Var.e(ni5VarArr[9], 0);
            }
            int iIntValue2 = ((Number) x95Var.c(ni5VarArr[9], yhbVar)).intValue();
            if (iIntValue2 >= iIntValue) {
                throw new db4(iIntValue);
            }
            x95Var.e(ni5VarArr[9], Integer.valueOf(iIntValue2 + 1));
        }
        Object objA = this.d.a(str, i, i2, z, o1aVar);
        return objA == xx1.a ? objA : heb.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(java.lang.String r6, defpackage.kt1 r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.j13
            if (r0 == 0) goto L13
            r0 = r7
            j13 r0 = (defpackage.j13) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            j13 r0 = new j13
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.b
            int r1 = r0.d
            heb r2 = defpackage.heb.a
            r3 = 1
            if (r1 == 0) goto L30
            if (r1 != r3) goto L29
            java.lang.String r6 = r0.a
            defpackage.e11.e0(r7)
            goto L4a
        L29:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            gp.j(r5)
            r5 = 0
            return r5
        L30:
            defpackage.e11.e0(r7)
            r0.a = r6
            r0.d = r3
            boolean r7 = com.reader.data.download.impl.AndroidDownloadService.s
            if (r7 == 0) goto L45
            d6a r7 = defpackage.vg3.a
            a13 r7 = new a13
            r7.<init>(r6)
            defpackage.vg3.a(r7)
        L45:
            xx1 r7 = defpackage.xx1.a
            if (r2 != r7) goto L4a
            return r7
        L4a:
            m62 r5 = r5.a
            b92 r5 = r5.u
            r5.getClass()
            r6.getClass()
            java.lang.Object r7 = r5.a
            qj r7 = (qj) r7
            r0 = -1024891232(0xffffffffc2e966a0, float:-116.70044)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            e82 r3 = new e82
            r4 = 7
            r3.<init>(r6, r4)
            java.lang.String r6 = "DELETE FROM DbDownload\nWHERE id = ?"
            r7.q(r1, r6, r3)
            q92 r6 = new q92
            r7 = 22
            r6.<init>(r7)
            r5.w(r0, r6)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.p13.c(java.lang.String, kt1):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(defpackage.kt1 r13) {
        /*
            r12 = this;
            boolean r0 = r13 instanceof defpackage.o13
            if (r0 == 0) goto L13
            r0 = r13
            o13 r0 = (defpackage.o13) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            o13 r0 = new o13
            r0.<init>(r12, r13)
        L18:
            java.lang.Object r13 = r0.c
            int r1 = r0.e
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L30
            if (r1 != r3) goto L2a
            int r1 = r0.b
            java.util.Iterator r2 = r0.a
            defpackage.e11.e0(r13)
            goto L82
        L2a:
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            gp.j(r12)
            return r2
        L30:
            defpackage.e11.e0(r13)
            m62 r13 = r12.a
            b92 r13 = r13.u
            java.lang.Object r1 = r13.a
            qj r1 = (qj) r1
            r4 = 62997120(0x3c14280, float:1.1358788E-36)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r4)
            java.lang.String r6 = "UPDATE DbDownload\nSET status = 3\nWHERE status = 2"
            r1.q(r5, r6, r2)
            q92 r1 = new q92
            r2 = 23
            r1.<init>(r2)
            r13.w(r4, r1)
            r13.getClass()
            oa2 r1 = defpackage.oa2.a
            java.lang.String r1 = "DbDownload"
            java.lang.String[] r6 = new java.lang.String[]{r1}
            java.lang.Object r1 = r13.a
            r7 = r1
            qj r7 = (qj) r7
            ia2 r11 = new ia2
            r1 = 2
            r11.<init>(r13, r1)
            r7.getClass()
            af9 r4 = new af9
            r5 = -926481127(0xffffffffc8c70519, float:-407592.78)
            java.lang.String r8 = "DbDownload.sq"
            java.lang.String r9 = "getDownloading"
            java.lang.String r10 = "SELECT DbDownload.id, DbDownload.bookId, DbDownload.title, DbDownload.image, DbDownload.path, DbDownload.start, DbDownload.end, DbDownload.downloaded, DbDownload.total, DbDownload.type, DbDownload.status, DbDownload.createAt\nFROM DbDownload\nWHERE status = 0 OR status = 1"
            r4.<init>(r5, r6, r7, r8, r9, r10, r11)
            java.util.List r13 = r4.c()
            java.util.Iterator r13 = r13.iterator()
            r1 = 0
            r2 = r13
        L82:
            r9 = r0
        L83:
            boolean r13 = r2.hasNext()
            if (r13 == 0) goto La9
            java.lang.Object r13 = r2.next()
            ha2 r13 = (defpackage.ha2) r13
            java.lang.String r5 = r13.b
            int r6 = r13.f
            int r13 = r13.g
            int r7 = r13 - r6
            r9.a = r2
            r9.b = r1
            r9.e = r3
            r13 r4 = r12.d
            r8 = 0
            java.lang.Object r13 = r4.a(r5, r6, r7, r8, r9)
            xx1 r0 = defpackage.xx1.a
            if (r13 != r0) goto L83
            return r0
        La9:
            heb r12 = defpackage.heb.a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.p13.d(kt1):java.lang.Object");
    }
}
