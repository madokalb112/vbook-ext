package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class aga {
    public final bp a;
    public final long b;
    public final qha c;
    public final ob7 d;
    public final aja e;
    public long f;
    public final bp g;
    public final wga h;
    public final rha i;

    public aga(wga wgaVar, ob7 ob7Var, rha rhaVar, aja ajaVar) {
        bp bpVar = wgaVar.a;
        long j = wgaVar.b;
        qha qhaVar = rhaVar != null ? rhaVar.a : null;
        this.a = bpVar;
        this.b = j;
        this.c = qhaVar;
        this.d = ob7Var;
        this.e = ajaVar;
        this.f = j;
        this.g = bpVar;
        this.h = wgaVar;
        this.i = rhaVar;
    }

    public final List a(kb4 kb4Var) {
        if (!pja.d(this.f)) {
            return gc1.Z(new hg1("", 0), new n69(pja.g(this.f), pja.g(this.f)));
        }
        h83 h83Var = (h83) kb4Var.invoke(this);
        if (h83Var != null) {
            return gc1.Y(h83Var);
        }
        return null;
    }

    public final Integer b() {
        qha qhaVar = this.c;
        if (qhaVar == null) {
            return null;
        }
        gx6 gx6Var = qhaVar.b;
        int iF = pja.f(this.f);
        ob7 ob7Var = this.d;
        return Integer.valueOf(ob7Var.n(gx6Var.c(gx6Var.d(ob7Var.w(iF)), true)));
    }

    public final Integer c() {
        qha qhaVar = this.c;
        if (qhaVar == null) {
            return null;
        }
        int iG = pja.g(this.f);
        ob7 ob7Var = this.d;
        return Integer.valueOf(ob7Var.n(qhaVar.h(qhaVar.b.d(ob7Var.w(iG)))));
    }

    public final Integer d() {
        int length;
        qha qhaVar = this.c;
        if (qhaVar == null) {
            return null;
        }
        int iR = r();
        while (true) {
            bp bpVar = this.a;
            if (iR < bpVar.b.length()) {
                int length2 = this.g.b.length() - 1;
                if (iR <= length2) {
                    length2 = iR;
                }
                long j = qhaVar.j(length2);
                int i = pja.c;
                int i2 = (int) (j & 4294967295L);
                if (i2 > iR) {
                    length = this.d.n(i2);
                    break;
                }
                iR++;
            } else {
                length = bpVar.b.length();
                break;
            }
        }
        return Integer.valueOf(length);
    }

    public final Integer e() {
        int iN;
        qha qhaVar = this.c;
        if (qhaVar == null) {
            return null;
        }
        int iR = r();
        while (true) {
            if (iR <= 0) {
                iN = 0;
                break;
            }
            int length = this.g.b.length() - 1;
            if (iR <= length) {
                length = iR;
            }
            long j = qhaVar.j(length);
            int i = pja.c;
            int i2 = (int) (j >> 32);
            if (i2 < iR) {
                iN = this.d.n(i2);
                break;
            }
            iR--;
        }
        return Integer.valueOf(iN);
    }

    public final boolean f() {
        qha qhaVar = this.c;
        return (qhaVar != null ? qhaVar.b.i(r()) : null) != cl8.b;
    }

    public final int g(qha qhaVar, int i) {
        int iR = r();
        aja ajaVar = this.e;
        if (ajaVar.a == null) {
            ajaVar.a = Float.valueOf(qhaVar.c(iR).a);
        }
        gx6 gx6Var = qhaVar.b;
        int iD = gx6Var.d(iR) + i;
        if (iD < 0) {
            return 0;
        }
        if (iD >= gx6Var.f) {
            return this.g.b.length();
        }
        float fB = gx6Var.b(iD) - 1.0f;
        Float f = ajaVar.a;
        f.getClass();
        float fFloatValue = f.floatValue();
        if ((f() && fFloatValue >= gx6Var.f(iD)) || (!f() && fFloatValue <= qhaVar.g(iD))) {
            return gx6Var.c(iD, true);
        }
        return this.d.n(gx6Var.h((((long) Float.floatToRawIntBits(fB)) & 4294967295L) | (Float.floatToRawIntBits(f.floatValue()) << 32)));
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int h(rha r9, int r10) {
        /*
            r8 = this;
            ym5 r0 = r9.b
            qha r1 = r9.a
            if (r0 == 0) goto L13
            ym5 r9 = r9.c
            if (r9 == 0) goto L10
            r2 = 1
            kf8 r9 = r9.O(r0, r2)
            goto L11
        L10:
            r9 = 0
        L11:
            if (r9 != 0) goto L15
        L13:
            kf8 r9 = kf8.e
        L15:
            wga r0 = r8.h
            long r2 = r0.b
            int r0 = pja.c
            r4 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r2 = r2 & r4
            int r0 = (int) r2
            ob7 r8 = r8.d
            int r0 = r8.w(r0)
            kf8 r0 = r1.c(r0)
            float r2 = r0.a
            float r0 = r0.b
            long r6 = r9.f()
            long r6 = r6 & r4
            int r9 = (int) r6
            float r9 = java.lang.Float.intBitsToFloat(r9)
            float r10 = (float) r10
            float r9 = r9 * r10
            float r9 = r9 + r0
            int r10 = java.lang.Float.floatToRawIntBits(r2)
            long r2 = (long) r10
            int r9 = java.lang.Float.floatToRawIntBits(r9)
            long r9 = (long) r9
            r0 = 32
            long r2 = r2 << r0
            long r9 = r9 & r4
            long r9 = r9 | r2
            gx6 r0 = r1.b
            int r9 = r0.h(r9)
            int r8 = r8.n(r9)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aga.h(rha, int):int");
    }

    public final void i() {
        aja ajaVar = this.e;
        ajaVar.a = null;
        bp bpVar = this.g;
        if (bpVar.b.length() > 0) {
            if (f()) {
                k();
                return;
            }
            ajaVar.a = null;
            if (bpVar.b.length() > 0) {
                String str = bpVar.b;
                long j = this.f;
                int i = pja.c;
                int iL = hn9.l((int) (j & 4294967295L), str);
                if (iL != -1) {
                    q(iL, iL);
                }
            }
        }
    }

    public final void j() {
        this.e.a = null;
        bp bpVar = this.g;
        String str = bpVar.b;
        String str2 = bpVar.b;
        if (str.length() > 0) {
            int iE = ym9.e(str2, pja.f(this.f));
            if (iE == pja.f(this.f) && iE != str2.length()) {
                iE = ym9.e(str2, iE + 1);
            }
            q(iE, iE);
        }
    }

    public final void k() {
        this.e.a = null;
        bp bpVar = this.g;
        if (bpVar.b.length() > 0) {
            String str = bpVar.b;
            long j = this.f;
            int i = pja.c;
            int iM = hn9.m((int) (j & 4294967295L), str);
            if (iM != -1) {
                q(iM, iM);
            }
        }
    }

    public final void l() {
        this.e.a = null;
        bp bpVar = this.g;
        String str = bpVar.b;
        String str2 = bpVar.b;
        if (str.length() > 0) {
            int iF = ym9.f(str2, pja.g(this.f));
            if (iF == pja.g(this.f) && iF != 0) {
                iF = ym9.f(str2, iF - 1);
            }
            q(iF, iF);
        }
    }

    public final void m() {
        aja ajaVar = this.e;
        ajaVar.a = null;
        bp bpVar = this.g;
        if (bpVar.b.length() > 0) {
            if (!f()) {
                k();
                return;
            }
            ajaVar.a = null;
            if (bpVar.b.length() > 0) {
                String str = bpVar.b;
                long j = this.f;
                int i = pja.c;
                int iL = hn9.l((int) (j & 4294967295L), str);
                if (iL != -1) {
                    q(iL, iL);
                }
            }
        }
    }

    public final void n() {
        Integer numB;
        this.e.a = null;
        if (this.g.b.length() <= 0 || (numB = b()) == null) {
            return;
        }
        int iIntValue = numB.intValue();
        q(iIntValue, iIntValue);
    }

    public final void o() {
        Integer numC;
        this.e.a = null;
        if (this.g.b.length() <= 0 || (numC = c()) == null) {
            return;
        }
        int iIntValue = numC.intValue();
        q(iIntValue, iIntValue);
    }

    public final void p() {
        if (this.g.b.length() > 0) {
            int i = pja.c;
            this.f = zk9.h((int) (this.b >> 32), (int) (this.f & 4294967295L));
        }
    }

    public final void q(int i, int i2) {
        this.f = zk9.h(i, i2);
    }

    public final int r() {
        long j = this.f;
        int i = pja.c;
        return this.d.w((int) (j & 4294967295L));
    }
}
