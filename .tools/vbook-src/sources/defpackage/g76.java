package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class g76 extends n31 {
    public final /* synthetic */ int b;
    public m31 c;
    public final Object d;
    public Object e;
    public int f;

    public g76(int i) {
        this.b = i;
        m31 m31Var = m31.a;
        switch (i) {
            case 1:
                this.c = m31Var;
                ArrayList arrayList = new ArrayList();
                this.d = arrayList;
                int[] iArr = jx4.m;
                int[] iArr2 = vr0.f;
                arrayList.add(new if9(new jx4(iArr, iArr2, 0.976601f, "WINDOWS-1251"), false, null));
                arrayList.add(new if9(new jx4(jx4.j, iArr2, 0.976601f, "KOI8-R"), false, null));
                arrayList.add(new if9(new jx4(jx4.k, iArr2, 0.976601f, "ISO-8859-5"), false, null));
                arrayList.add(new if9(new jx4(jx4.l, iArr2, 0.976601f, "MACCYRILLIC"), false, null));
                arrayList.add(new if9(new jx4(jx4.i, iArr2, 0.976601f, "IBM866"), false, null));
                arrayList.add(new if9(new jx4(jx4.h, iArr2, 0.976601f, "IBM855"), false, null));
                int[] iArr3 = km5.h;
                int[] iArr4 = vr0.g;
                arrayList.add(new if9(new km5(iArr3, iArr4, 0.982851f, "ISO-8859-7"), false, null));
                arrayList.add(new if9(new km5(km5.i, iArr4, 0.982851f, "WINDOWS-1253"), false, null));
                int[] iArr5 = jm5.h;
                int[] iArr6 = vr0.e;
                arrayList.add(new if9(new jm5(iArr5, iArr6, 0.969392f, "ISO-8859-5"), false, null));
                arrayList.add(new if9(new jm5(jm5.i, iArr6, 0.969392f, "WINDOWS-1251"), false, null));
                arrayList.add(new if9(new dl4(dl4.g, dl4.h, 0.926386f, "TIS620"), false, null));
                dl4 dl4Var = new dl4(dl4.e, dl4.f, 0.984004f, "WINDOWS-1255");
                el4 el4Var = new el4();
                el4Var.d = (byte) 32;
                el4Var.e = (byte) 32;
                if9 if9Var = new if9(dl4Var, false, el4Var);
                if9 if9Var2 = new if9(dl4Var, true, el4Var);
                el4Var.f = if9Var;
                el4Var.g = if9Var2;
                arrayList.add(el4Var);
                arrayList.add(if9Var);
                arrayList.add(if9Var2);
                d();
                break;
            case 2:
                this.d = new ub7[]{new ub7(new yi4(new gi8(yi4.s), 6, new gi8(yi4.t), yi4.u, "HZ-GB-2312")), new ub7(new cx4(new gi8(cx4.s), 9, new gi8(cx4.t), cx4.u, "ISO-2022-CN")), new ub7(new dx4(new gi8(dx4.s), 10, new gi8(dx4.t), dx4.u, "ISO-2022-JP")), new ub7(new ex4(new gi8(ex4.s), 6, new gi8(ex4.t), ex4.u, "ISO-2022-KR"))};
                this.f = 4;
                this.c = m31Var;
                break;
            default:
                this.c = m31Var;
                rc4 rc4Var = new rc4();
                adb adbVar = new adb();
                adbVar.b = new ub7(adb.e);
                adbVar.c = m31Var;
                this.d = gc1.a0(rc4Var, adbVar, new cg0(), new tq8(), new s73(), new v73(), new y73());
                d();
                break;
        }
    }

    @Override // defpackage.n31
    public final String a() {
        String strA;
        String strA2;
        int i = this.b;
        Object obj = this.d;
        switch (i) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                if (((n31) this.e) == null) {
                    b();
                    if (((n31) this.e) == null && !arrayList.isEmpty()) {
                        this.e = (n31) arrayList.get(0);
                    }
                }
                n31 n31Var = (n31) this.e;
                return (n31Var == null || (strA = n31Var.a()) == null) ? "" : strA;
            case 1:
                ArrayList arrayList2 = (ArrayList) obj;
                if (((n31) this.e) == null) {
                    b();
                    if (((n31) this.e) == null && !arrayList2.isEmpty()) {
                        this.e = (n31) arrayList2.get(0);
                    }
                }
                n31 n31Var2 = (n31) this.e;
                return (n31Var2 == null || (strA2 = n31Var2.a()) == null) ? "" : strA2;
            default:
                String str = (String) this.e;
                return str == null ? "" : str;
        }
    }

    @Override // defpackage.n31
    public final float b() {
        int i = this.b;
        int i2 = 0;
        Object obj = this.d;
        m31 m31Var = m31.c;
        m31 m31Var2 = m31.b;
        switch (i) {
            case 0:
                m31 m31Var3 = this.c;
                if (m31Var3 != m31Var2) {
                    if (m31Var3 != m31Var) {
                        ArrayList arrayList = (ArrayList) obj;
                        int size = arrayList.size();
                        float f = 0.0f;
                        while (i2 < size) {
                            Object obj2 = arrayList.get(i2);
                            i2++;
                            n31 n31Var = (n31) obj2;
                            if (n31Var.a) {
                                float fB = n31Var.b();
                                if (f < fB) {
                                    this.e = n31Var;
                                    f = fB;
                                }
                            }
                        }
                        break;
                    }
                } else {
                    break;
                }
                break;
            case 1:
                m31 m31Var4 = this.c;
                if (m31Var4 != m31Var2) {
                    if (m31Var4 != m31Var) {
                        ArrayList arrayList2 = (ArrayList) obj;
                        int size2 = arrayList2.size();
                        float f2 = 0.0f;
                        while (i2 < size2) {
                            Object obj3 = arrayList2.get(i2);
                            i2++;
                            n31 n31Var2 = (n31) obj3;
                            if (n31Var2.a) {
                                float fB2 = n31Var2.b();
                                if (f2 < fB2) {
                                    this.e = n31Var2;
                                    f2 = fB2;
                                }
                            }
                        }
                        break;
                    }
                } else {
                    break;
                }
                break;
        }
        return 0.99f;
    }

    /* JADX WARN: Code restructure failed: missing block: B:65:0x00f3, code lost:
    
        r12.e = r4;
        r12.c = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x014c, code lost:
    
        r12.e = r4;
        r12.c = r3;
     */
    @Override // defpackage.n31
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.m31 c(int r13, byte[] r14) {
        /*
            Method dump skipped, instruction units count: 348
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.g76.c(int, byte[]):m31");
    }

    @Override // defpackage.n31
    public final void d() {
        int i = this.b;
        int i2 = 0;
        Object obj = this.d;
        m31 m31Var = m31.a;
        switch (i) {
            case 0:
                this.f = 0;
                ArrayList arrayList = (ArrayList) obj;
                int size = arrayList.size();
                while (i2 < size) {
                    Object obj2 = arrayList.get(i2);
                    i2++;
                    n31 n31Var = (n31) obj2;
                    n31Var.d();
                    n31Var.a = true;
                    this.f++;
                }
                this.e = null;
                this.c = m31Var;
                break;
            case 1:
                this.f = 0;
                ArrayList arrayList2 = (ArrayList) obj;
                int size2 = arrayList2.size();
                while (i2 < size2) {
                    Object obj3 = arrayList2.get(i2);
                    i2++;
                    n31 n31Var2 = (n31) obj3;
                    n31Var2.d();
                    n31Var2.a = true;
                    this.f++;
                }
                this.e = null;
                this.c = m31Var;
                break;
            default:
                this.c = m31Var;
                ub7[] ub7VarArr = (ub7[]) obj;
                for (ub7 ub7Var : ub7VarArr) {
                    ub7Var.a = 0;
                }
                this.f = ub7VarArr.length;
                this.e = null;
                break;
        }
    }
}
