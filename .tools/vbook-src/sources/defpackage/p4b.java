package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class p4b implements c24 {
    public final /* synthetic */ int a;
    public final /* synthetic */ t4b b;

    public /* synthetic */ p4b(t4b t4bVar, int i) {
        this.a = i;
        this.b = t4bVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0071 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0072 -> B:21:0x0075). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(boolean r12, defpackage.jt1 r13) {
        /*
            r11 = this;
            boolean r0 = r13 instanceof defpackage.o4b
            if (r0 == 0) goto L13
            r0 = r13
            o4b r0 = (defpackage.o4b) r0
            int r1 = r0.w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.w = r1
            goto L18
        L13:
            o4b r0 = new o4b
            r0.<init>(r11, r13)
        L18:
            java.lang.Object r13 = r0.u
            int r1 = r0.w
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L3f
            if (r1 != r3) goto L39
            boolean r11 = r0.b
            int r12 = r0.t
            int r1 = r0.s
            boolean r4 = r0.a
            l4b r5 = r0.f
            java.lang.Object r6 = r0.e
            b07 r7 = r0.d
            t4b r8 = r0.c
            defpackage.e11.e0(r13)
            r10 = r4
            r4 = r12
            r12 = r10
            goto L75
        L39:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            gp.j(r11)
            return r2
        L3f:
            defpackage.e11.e0(r13)
            t4b r11 = r11.b
            fr9 r13 = r11.d
            if (r13 == 0) goto L8c
            r1 = 0
            r8 = r11
            r7 = r13
            r11 = r1
        L4c:
            java.lang.Object r6 = r7.getValue()
            r5 = r6
            l4b r5 = (defpackage.l4b) r5
            f4b r13 = r8.c
            r0.c = r8
            r0.d = r7
            r0.e = r6
            r0.f = r5
            r0.a = r12
            r0.s = r11
            r0.t = r1
            r0.b = r12
            r0.w = r3
            j4b r13 = (defpackage.j4b) r13
            java.lang.Integer r13 = r13.h()
            xx1 r4 = defpackage.xx1.a
            if (r13 != r4) goto L72
            return r4
        L72:
            r4 = r1
            r1 = r11
            r11 = r12
        L75:
            java.lang.Number r13 = (java.lang.Number) r13
            int r13 = r13.intValue()
            r9 = 4
            l4b r11 = defpackage.l4b.a(r5, r11, r13, r2, r9)
            fr9 r7 = (defpackage.fr9) r7
            boolean r11 = r7.j(r6, r11)
            if (r11 == 0) goto L89
            goto L8c
        L89:
            r11 = r1
            r1 = r4
            goto L4c
        L8c:
            heb r11 = defpackage.heb.a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.p4b.a(boolean, jt1):java.lang.Object");
    }

    @Override // defpackage.c24
    public final Object b(Object obj, jt1 jt1Var) {
        Object value;
        l4b l4bVar;
        ArrayList arrayList;
        switch (this.a) {
            case 0:
                return a(((Boolean) obj).booleanValue(), jt1Var);
            default:
                List list = (List) obj;
                fr9 fr9Var = this.b.d;
                if (fr9Var != null) {
                    do {
                        value = fr9Var.getValue();
                        l4bVar = (l4b) value;
                        arrayList = new ArrayList();
                        for (Object obj2 : list) {
                            if (!((p5b) obj2).a.equals("qt")) {
                                arrayList.add(obj2);
                            }
                        }
                    } while (!fr9Var.j(value, l4b.a(l4bVar, false, 0, arrayList, 3)));
                }
                return heb.a;
        }
    }
}
