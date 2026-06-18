package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class tk5 {
    public final ue5 a;
    public final ArrayList b;

    public tk5(ue5 ue5Var) {
        ue5Var.getClass();
        this.a = ue5Var;
        List list = tr3.a;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((uk5) it.next()).getClass();
            arrayList.add(new zk5(ue5Var));
        }
        this.b = arrayList;
        if (this.a instanceof ue5) {
            return;
        }
        so9.r(this.a, " is not supported.", "Only binary and string formats are supported, ");
        throw null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: e20 */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ab A[Catch: all -> 0x00d4, TryCatch #0 {all -> 0x00d4, blocks: (B:32:0x00a7, B:34:0x00ab, B:36:0x00b6, B:37:0x00d3), top: B:41:0x00a7 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b6 A[Catch: all -> 0x00d4, TryCatch #0 {all -> 0x00d4, blocks: (B:32:0x00a7, B:34:0x00ab, B:36:0x00b6, B:37:0x00d3), top: B:41:0x00a7 }] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.nio.charset.Charset r15, defpackage.bbb r16, defpackage.ut0 r17, defpackage.kt1 r18) throws e20 {
        /*
            Method dump skipped, instruction units count: 238
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tk5.a(java.nio.charset.Charset, bbb, ut0, kt1):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.as1 r13, java.nio.charset.Charset r14, defpackage.bbb r15, java.lang.Object r16, defpackage.kt1 r17) {
        /*
            r12 = this;
            r0 = r17
            ue5 r1 = r12.a
            boolean r2 = r0 instanceof defpackage.sk5
            if (r2 == 0) goto L17
            r2 = r0
            sk5 r2 = (defpackage.sk5) r2
            int r3 = r2.s
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.s = r3
            goto L1c
        L17:
            sk5 r2 = new sk5
            r2.<init>(r12, r0)
        L1c:
            java.lang.Object r0 = r2.e
            int r3 = r2.s
            r4 = 0
            r5 = 1
            if (r3 == 0) goto L3a
            if (r3 != r5) goto L34
            java.lang.Object r12 = r2.d
            bbb r13 = r2.c
            java.nio.charset.Charset r14 = r2.b
            as1 r2 = r2.a
            defpackage.e11.e0(r0)
            r10 = r13
            r13 = r2
            goto L6a
        L34:
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            gp.j(r12)
            return r4
        L3a:
            defpackage.e11.e0(r0)
            pp1 r7 = new pp1
            java.util.ArrayList r12 = r12.b
            r0 = 4
            r7.<init>(r12, r0)
            rk5 r6 = new rk5
            r8 = r13
            r9 = r14
            r10 = r15
            r11 = r16
            r6.<init>(r7, r8, r9, r10, r11)
            ei0 r12 = new ei0
            r3 = 2
            r12.<init>(r3, r0, r4)
            r2.a = r13
            r2.b = r14
            r2.c = r15
            r2.d = r11
            r2.s = r5
            java.lang.Object r0 = defpackage.cx1.Q(r6, r12, r2)
            xx1 r12 = defpackage.xx1.a
            if (r0 != r12) goto L68
            return r12
        L68:
            r10 = r15
            r12 = r11
        L6a:
            wh7 r0 = (defpackage.wh7) r0
            if (r0 == 0) goto L6f
            return r0
        L6f:
            q32 r0 = r1.b     // Catch: defpackage.u39 -> L76
            oi5 r0 = defpackage.lx1.x0(r0, r10)     // Catch: defpackage.u39 -> L76
            goto L7c
        L76:
            q32 r0 = r1.b
            oi5 r0 = defpackage.lx1.p0(r12, r0)
        L7c:
            boolean r2 = r1 instanceof defpackage.ue5
            if (r2 == 0) goto L90
            oi5 r0 = (defpackage.oi5) r0
            java.lang.String r12 = r1.b(r0, r12)
            zba r0 = new zba
            as1 r13 = defpackage.ds1.b(r13, r14)
            r0.<init>(r12, r13)
            return r0
        L90:
            java.lang.String r12 = "Unsupported format "
            defpackage.mn5.n(r1, r12)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tk5.b(as1, java.nio.charset.Charset, bbb, java.lang.Object, kt1):java.lang.Object");
    }
}
