package defpackage;

import android.content.Context;
import android.media.AudioManager;
import java.util.Map;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class o27 implements gqb {
    public final kqb a;
    public final t10 b;
    public boolean c;
    public Map d;
    public w1b e;
    public boolean f;
    public final iw0 g;
    public oq9 h;

    public o27(kqb kqbVar, t10 t10Var) {
        kqbVar.getClass();
        t10Var.getClass();
        this.a = kqbVar;
        this.b = t10Var;
        this.d = mc3.a;
        o0a o0aVarA = zib.a();
        aj2 aj2Var = rw2.a;
        this.g = wx1.b(gx1.T(o0aVarA, r76.a));
    }

    public static krb a(w1b w1bVar) {
        String str = w1bVar.b;
        String str2 = w1bVar.e;
        String str3 = w1bVar.c;
        Map map = w1bVar.d;
        boolean z = true;
        if (!iw9.K(str, "data:", true)) {
            Pattern patternCompile = Pattern.compile("^[a-zA-Z][a-zA-Z0-9+.-]*:");
            patternCompile.getClass();
            if (!patternCompile.matcher(str).find()) {
                z = false;
            }
        }
        String str4 = w1bVar.b;
        return z ? new kgb(str4, str3, str2, map) : new j62(str4, str3, str2, map);
    }

    @Override // defpackage.gqb
    public final void b(float f) {
        gv7 gv7Var;
        uf4 uf4Var = this.a.a.B;
        s00 s00Var = s00.u;
        gv7 gv7Var2 = (du3) ((Map) uf4Var.b).get(s00Var);
        if (gv7Var2 != null) {
            gv7Var2.a(f);
        }
        if (!this.c || this.f || (gv7Var = (du3) ((Map) this.b.a.B.b).get(s00Var)) == null) {
            return;
        }
        gv7Var.a(f);
    }

    @Override // defpackage.gqb
    public final void c(boolean z) {
        if (!this.c || this.f) {
            this.a.d(z);
        }
    }

    @Override // defpackage.gqb
    public final void close() {
        oq9 oq9Var = this.h;
        if (oq9Var != null) {
            oq9Var.cancel(null);
        }
        this.h = null;
        wx1.K(this.g, null);
        boolean z = this.c;
        t10 t10Var = this.b;
        if (z) {
            nk3 nk3Var = t10Var.a;
            if (((iv7) nk3Var.b.getValue()).compareTo(iv7.e) >= 0) {
                nk3Var.P();
                fr9 fr9Var = nk3Var.c;
                ik3 ik3Var = (ik3) fr9Var.getValue();
                fr9Var.k(null);
                if (ik3Var != null) {
                    ik3Var.a();
                }
            }
            this.c = false;
            this.f = false;
        }
        this.f = false;
        t10Var.a.close();
        this.a.a.close();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.gqb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(defpackage.w1b r7, defpackage.jt1 r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.n27
            if (r0 == 0) goto L13
            r0 = r8
            n27 r0 = (defpackage.n27) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            n27 r0 = new n27
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.a
            int r1 = r0.c
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L2c
            if (r1 != r2) goto L26
            defpackage.e11.e0(r8)     // Catch: java.lang.Throwable -> L85
            goto L80
        L26:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            gp.j(r6)
            return r3
        L2c:
            defpackage.e11.e0(r8)
            r6.e = r7
            java.util.Map r8 = r7.d
            r6.d = r8
            oq9 r8 = r6.h
            if (r8 == 0) goto L3c
            r8.cancel(r3)
        L3c:
            r6.h = r3
            boolean r8 = r6.c
            r1 = 0
            if (r8 == 0) goto L6d
            t10 r8 = r6.b
            nk3 r8 = r8.a
            fr9 r4 = r8.b
            java.lang.Object r4 = r4.getValue()
            iv7 r4 = (iv7) r4
            iv7 r5 = iv7.e
            int r4 = r4.compareTo(r5)
            if (r4 >= 0) goto L58
            goto L6b
        L58:
            r8.P()
            fr9 r8 = r8.c
            java.lang.Object r4 = r8.getValue()
            ik3 r4 = (ik3) r4
            r8.k(r3)
            if (r4 == 0) goto L6b
            r4.a()
        L6b:
            r6.c = r1
        L6d:
            r6.f = r1
            kqb r6 = r6.a     // Catch: java.lang.Throwable -> L85
            krb r7 = a(r7)     // Catch: java.lang.Throwable -> L85
            r0.c = r2     // Catch: java.lang.Throwable -> L85
            java.lang.Object r8 = r6.b(r7, r3, r0)     // Catch: java.lang.Throwable -> L85
            xx1 r6 = defpackage.xx1.a
            if (r8 != r6) goto L80
            return r6
        L80:
            java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch: java.lang.Throwable -> L85
            r8.getClass()     // Catch: java.lang.Throwable -> L85
        L85:
            heb r6 = defpackage.heb.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.o27.d(w1b, jt1):java.lang.Object");
    }

    @Override // defpackage.gqb
    public final b24 e() {
        return new u31(this.a.a.v, 9);
    }

    @Override // defpackage.gqb
    public final void f() {
        kqb kqbVar = this.a;
        boolean zA = kqbVar.a();
        nk3 nk3Var = kqbVar.a;
        nk3Var.getClass();
        iv7 iv7Var = (iv7) nk3Var.b.getValue();
        if (iv7Var == iv7.s) {
            nk3Var.q();
        } else if (iv7Var == iv7.f) {
            nk3Var.A();
        }
        if (!this.c || this.f) {
            return;
        }
        t10 t10Var = this.b;
        if (zA) {
            t10Var.a.q();
        } else {
            t10Var.a.A();
        }
    }

    @Override // defpackage.gqb
    public final void g(long j) {
        kqb kqbVar = this.a;
        nk3 nk3Var = kqbVar.a;
        long jE = k63.e(j);
        nk3Var.getClass();
        nk3Var.E(nk3Var.u.k() + jE);
        if (!this.c || this.f) {
            return;
        }
        this.b.a.E(k63.e(lx1.A0(((Number) kqbVar.a.A.getValue()).longValue(), o63.MILLISECONDS)));
    }

    @Override // defpackage.gqb
    public final dr9 h() {
        return this.a.b;
    }

    @Override // defpackage.gqb
    public final void i() {
        o27 o27Var;
        if (this.c) {
            oq9 oq9Var = this.h;
            if (oq9Var != null) {
                oq9Var.cancel(null);
            }
            this.h = null;
            kqb kqbVar = this.a;
            long jLongValue = ((Number) kqbVar.a.A.getValue()).longValue();
            boolean zA = kqbVar.a();
            if (this.f) {
                w1b w1bVar = this.e;
                if (w1bVar != null) {
                    o27Var = this;
                    ah1.J(o27Var.g, null, null, new m27(o27Var, w1bVar, jLongValue, zA, null), 3);
                } else {
                    o27Var = this;
                }
            } else {
                o27Var = this;
                nk3 nk3Var = o27Var.b.a;
                if (((iv7) nk3Var.b.getValue()).compareTo(iv7.e) >= 0) {
                    nk3Var.P();
                    fr9 fr9Var = nk3Var.c;
                    ik3 ik3Var = (ik3) fr9Var.getValue();
                    fr9Var.k(null);
                    if (ik3Var != null) {
                        ik3Var.a();
                    }
                }
                kqbVar.d(false);
            }
            o27Var.c = false;
            o27Var.f = false;
        }
    }

    @Override // defpackage.gqb
    public final void j() {
        this.a.a.q();
        if (!this.c || this.f) {
            return;
        }
        this.b.a.q();
    }

    @Override // defpackage.gqb
    public final void k(float f) {
        js8 js8Var = js8.b;
        boolean z = this.c;
        kqb kqbVar = this.a;
        if (!z || this.f) {
            kqbVar.getClass();
            if (ri9.h(kqbVar, f)) {
                return;
            }
            if (((du3) ((Map) kqbVar.a.B.b).get(js8Var)) == null) {
                ri9.h(kqbVar, f);
                return;
            } else {
                j31.j();
                return;
            }
        }
        kqbVar.getClass();
        if (ri9.h(kqbVar, f)) {
            return;
        }
        if (((du3) ((Map) kqbVar.a.B.b).get(js8Var)) == null) {
            ri9.h(kqbVar, f);
        } else {
            j31.j();
        }
    }

    @Override // defpackage.gqb
    public final void l(long j) {
        this.a.a.E(k63.e(j));
        if (!this.c || this.f) {
            return;
        }
        this.b.a.E(k63.e(j));
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
    @Override // defpackage.gqb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m(java.lang.String r22, java.util.Map r23, java.lang.String r24, defpackage.jt1 r25) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 464
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.o27.m(java.lang.String, java.util.Map, java.lang.String, jt1):java.lang.Object");
    }

    @Override // defpackage.gqb
    public final Float n() {
        int streamMaxVolume;
        kqb kqbVar = this.a;
        kqbVar.getClass();
        Object obj = kqbVar.c;
        Context context = obj instanceof Context ? (Context) obj : null;
        Object systemService = context != null ? context.getSystemService("audio") : null;
        AudioManager audioManager = systemService instanceof AudioManager ? (AudioManager) systemService : null;
        if (audioManager != null && (streamMaxVolume = audioManager.getStreamMaxVolume(3)) > 0) {
            return Float.valueOf(wx1.P(audioManager.getStreamVolume(3) / streamMaxVolume, 0.0f, 1.0f));
        }
        return null;
    }

    @Override // defpackage.gqb
    public final b24 o() {
        nk3 nk3Var = this.a.a;
        nk3Var.getClass();
        return new a62(new u31(nk3Var.v, 2), nk3Var.A, new f2(3, null), 1);
    }

    @Override // defpackage.gqb
    public final b24 p() {
        return new u31(this.a.a.b, 8);
    }

    @Override // defpackage.gqb
    public final void q() {
        this.a.c();
        if (!this.c || this.f) {
            return;
        }
        this.b.a.A();
    }

    @Override // defpackage.gqb
    public final fr9 r() {
        return this.a.a.A;
    }

    @Override // defpackage.gqb
    public final void stop() {
        nk3 nk3Var = this.a.a;
        iv7 iv7Var = (iv7) nk3Var.b.getValue();
        iv7 iv7Var2 = iv7.e;
        if (iv7Var.compareTo(iv7Var2) >= 0) {
            nk3Var.P();
            fr9 fr9Var = nk3Var.c;
            ik3 ik3Var = (ik3) fr9Var.getValue();
            fr9Var.k(null);
            if (ik3Var != null) {
                ik3Var.a();
            }
        }
        if (!this.c || this.f) {
            return;
        }
        nk3 nk3Var2 = this.b.a;
        if (((iv7) nk3Var2.b.getValue()).compareTo(iv7Var2) < 0) {
            return;
        }
        nk3Var2.P();
        fr9 fr9Var2 = nk3Var2.c;
        ik3 ik3Var2 = (ik3) fr9Var2.getValue();
        fr9Var2.k(null);
        if (ik3Var2 != null) {
            ik3Var2.a();
        }
    }
}
