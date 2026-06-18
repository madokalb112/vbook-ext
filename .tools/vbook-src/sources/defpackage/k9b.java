package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class k9b {
    public long A;
    public boolean B;
    public String C;
    public String D;
    public String E;
    public List F;
    public List G;
    public List H;
    public boolean I;
    public boolean J;
    public long K;
    public long L;
    public final String a;
    public final b15 b;
    public final sja c;
    public final aw5 d;
    public final tna e;
    public final qp3 f;
    public final f4b g;
    public final t0c h;
    public final h8b i;
    public final mka j;
    public final iw0 k;
    public final Object l;
    public final p8b m;
    public final ec0 n;
    public c85 o;
    public zv5 p;
    public kka q;
    public List r;
    public LinkedHashMap s;
    public v5b t;
    public int u;
    public String v;
    public String w;
    public double x;
    public int y;
    public oq9 z;

    public k9b(String str, b15 b15Var, sja sjaVar, aw5 aw5Var, tna tnaVar, qp3 qp3Var, f4b f4bVar, t0c t0cVar, h8b h8bVar, mka mkaVar) {
        str.getClass();
        b15Var.getClass();
        sjaVar.getClass();
        aw5Var.getClass();
        tnaVar.getClass();
        qp3Var.getClass();
        f4bVar.getClass();
        t0cVar.getClass();
        h8bVar.getClass();
        mkaVar.getClass();
        this.a = str;
        this.b = b15Var;
        this.c = sjaVar;
        this.d = aw5Var;
        this.e = tnaVar;
        this.f = qp3Var;
        this.g = f4bVar;
        this.h = t0cVar;
        this.i = h8bVar;
        this.j = mkaVar;
        aj2 aj2Var = rw2.a;
        this.k = wx1.b(nh2.c);
        this.l = new Object();
        this.m = new p8b();
        this.n = new ec0();
        this.v = "";
        this.w = "";
        this.C = "";
        this.D = "";
        this.E = "";
        lc3 lc3Var = lc3.a;
        this.F = lc3Var;
        this.G = lc3Var;
        this.H = lc3Var;
    }

    public final bp a(bp bpVar) {
        if (this.H.isEmpty() && this.G.isEmpty()) {
            return bpVar;
        }
        String str = bpVar.b;
        str.getClass();
        ArrayList arrayList = new ArrayList(str.length());
        int i = 0;
        int i2 = 0;
        while (i < str.length()) {
            arrayList.add(new mz7(str.charAt(i), i2));
            i++;
            i2++;
        }
        i21 i21Var = new i21(arrayList);
        for (i6b i6bVar : this.H) {
            i21Var = i21Var.d(i6bVar.c, "", i6bVar.d, false);
        }
        for (p17 p17Var : this.G) {
            i21Var = i21Var.d(p17Var.c, p17Var.d, false, p17Var.e);
        }
        return new bp(i21Var.toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.String r8, defpackage.kt1 r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof defpackage.r8b
            if (r0 == 0) goto L14
            r0 = r9
            r8b r0 = (defpackage.r8b) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.c = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            r8b r0 = new r8b
            r0.<init>(r7, r9)
            goto L12
        L1a:
            java.lang.Object r9 = r6.a
            int r0 = r6.c
            r1 = 1
            if (r0 == 0) goto L2e
            if (r0 != r1) goto L27
            defpackage.e11.e0(r9)
            goto L66
        L27:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            gp.j(r7)
            r7 = 0
            return r7
        L2e:
            defpackage.e11.e0(r9)
            boolean r9 = r7.J
            if (r9 != 0) goto L36
            goto L49
        L36:
            java.lang.String r9 = r7.C
            java.lang.String r0 = "qt"
            boolean r9 = defpackage.lc5.Q(r9, r0)
            if (r9 != 0) goto L41
            goto L49
        L41:
            java.lang.String r9 = r7.C
            v5b r9 = r7.f(r9)
            if (r9 != 0) goto L4a
        L49:
            return r8
        L4a:
            java.lang.String r3 = r7.D
            java.lang.String r4 = r7.E
            java.lang.String r7 = "convertSimplified"
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            java.util.Map r5 = java.util.Collections.singletonMap(r7, r0)
            r5.getClass()
            r6.c = r1
            r2 = r8
            r1 = r9
            java.lang.Object r9 = r1.a(r2, r3, r4, r5, r6)
            xx1 r7 = defpackage.xx1.a
            if (r9 != r7) goto L66
            return r7
        L66:
            s5b r9 = (defpackage.s5b) r9
            java.lang.String r7 = r9.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.k9b.b(java.lang.String, kt1):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x00e5, code lost:
    
        if (w(r0) != r8) goto L57;
     */
    /* JADX WARN: Removed duplicated region for block: B:38:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(defpackage.kt1 r10) {
        /*
            Method dump skipped, instruction units count: 238
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.k9b.c(kt1):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0056, code lost:
    
        if (r3 == r6) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(defpackage.kt1 r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof defpackage.t8b
            if (r0 == 0) goto L13
            r0 = r8
            t8b r0 = (defpackage.t8b) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            t8b r0 = new t8b
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.a
            int r1 = r0.c
            r2 = 0
            heb r3 = defpackage.heb.a
            r4 = 2
            r5 = 1
            xx1 r6 = defpackage.xx1.a
            if (r1 == 0) goto L37
            if (r1 == r5) goto L33
            if (r1 != r4) goto L2d
            defpackage.e11.e0(r8)     // Catch: java.lang.Throwable -> L59
            goto L59
        L2d:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            gp.j(r7)
            return r2
        L33:
            defpackage.e11.e0(r8)
            goto L43
        L37:
            defpackage.e11.e0(r8)
            r0.c = r5
            java.lang.Object r8 = r7.w(r0)
            if (r8 != r6) goto L43
            goto L58
        L43:
            ec0 r8 = r7.n     // Catch: java.lang.Throwable -> L59
            r0.c = r4     // Catch: java.lang.Throwable -> L59
            zb r8 = r8.a     // Catch: java.lang.Throwable -> L59
            if (r8 == 0) goto L56
            boolean r0 = r8.a()     // Catch: java.lang.Throwable -> L59
            if (r0 == 0) goto L56
            android.media.MediaPlayer r8 = r8.a     // Catch: java.lang.Throwable -> L59
            r8.pause()     // Catch: java.lang.Throwable -> L59
        L56:
            if (r3 != r6) goto L59
        L58:
            return r6
        L59:
            r7.B = r5
            qa1 r8 = defpackage.r95.a
            p95 r8 = r8.k()
            long r0 = r8.c()
            r7.K = r0
            oq9 r7 = r7.z
            if (r7 == 0) goto L6e
            r7.cancel(r2)
        L6e:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.k9b.d(kt1):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x007e, code lost:
    
        if (r1.i(r0) == r6) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0074 A[Catch: all -> 0x0081, TRY_LEAVE, TryCatch #0 {all -> 0x0081, blocks: (B:13:0x002a, B:18:0x0038, B:31:0x006c, B:33:0x0074, B:21:0x0040, B:27:0x005a, B:24:0x004a), top: B:39:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(defpackage.kt1 r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof defpackage.u8b
            if (r0 == 0) goto L13
            r0 = r9
            u8b r0 = (defpackage.u8b) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            u8b r0 = new u8b
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.c
            int r1 = r0.e
            r2 = 0
            r3 = 3
            r4 = 2
            r5 = 1
            xx1 r6 = defpackage.xx1.a
            if (r1 == 0) goto L47
            if (r1 == r5) goto L3c
            if (r1 == r4) goto L34
            if (r1 != r3) goto L2e
            defpackage.e11.e0(r9)     // Catch: java.lang.Throwable -> L81
            goto L81
        L2e:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            gp.j(r8)
            return r2
        L34:
            int r8 = r0.b
            k9b r1 = r0.a
            defpackage.e11.e0(r9)     // Catch: java.lang.Throwable -> L81
            goto L6c
        L3c:
            int r8 = r0.b
            k9b r1 = r0.a
            defpackage.e11.e0(r9)     // Catch: java.lang.Throwable -> L81
            r7 = r1
            r1 = r8
            r8 = r7
            goto L5a
        L47:
            defpackage.e11.e0(r9)
            p8b r9 = r8.m     // Catch: java.lang.Throwable -> L81
            r0.a = r8     // Catch: java.lang.Throwable -> L81
            r1 = 0
            r0.b = r1     // Catch: java.lang.Throwable -> L81
            r0.e = r5     // Catch: java.lang.Throwable -> L81
            java.lang.Object r9 = r9.f(r0)     // Catch: java.lang.Throwable -> L81
            if (r9 != r6) goto L5a
            goto L80
        L5a:
            p8b r9 = r8.m     // Catch: java.lang.Throwable -> L81
            r0.a = r8     // Catch: java.lang.Throwable -> L81
            r0.b = r1     // Catch: java.lang.Throwable -> L81
            r0.e = r4     // Catch: java.lang.Throwable -> L81
            java.lang.Object r9 = r9.e(r0)     // Catch: java.lang.Throwable -> L81
            if (r9 != r6) goto L69
            goto L80
        L69:
            r7 = r1
            r1 = r8
            r8 = r7
        L6c:
            java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch: java.lang.Throwable -> L81
            boolean r9 = r9.booleanValue()     // Catch: java.lang.Throwable -> L81
            if (r9 != 0) goto L81
            r0.a = r2     // Catch: java.lang.Throwable -> L81
            r0.b = r8     // Catch: java.lang.Throwable -> L81
            r0.e = r3     // Catch: java.lang.Throwable -> L81
            java.lang.Object r8 = r1.i(r0)     // Catch: java.lang.Throwable -> L81
            if (r8 != r6) goto L81
        L80:
            return r6
        L81:
            heb r8 = defpackage.heb.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.k9b.e(kt1):java.lang.Object");
    }

    public final v5b f(String str) {
        v5b v5bVarD;
        synchronized (this.l) {
            v5bVarD = this.t;
            if (v5bVarD == null) {
                f4b f4bVar = this.g;
                String str2 = this.a;
                j4b j4bVar = (j4b) f4bVar;
                j4bVar.getClass();
                str.getClass();
                str2.getClass();
                v5bVarD = j4bVar.c.d(str, str2);
                this.t = v5bVarD;
            }
        }
        return v5bVarD;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0095, code lost:
    
        if (r9 != r7) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(defpackage.kt1 r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof defpackage.v8b
            if (r0 == 0) goto L13
            r0 = r9
            v8b r0 = (defpackage.v8b) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            v8b r0 = new v8b
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.b
            int r1 = r0.d
            t0c r2 = r8.h
            r3 = 4
            r4 = 3
            r5 = 1
            r6 = 2
            xx1 r7 = defpackage.xx1.a
            if (r1 == 0) goto L4d
            if (r1 == r5) goto L47
            if (r1 == r6) goto L41
            if (r1 == r4) goto L3b
            if (r1 != r3) goto L34
            k9b r8 = r0.a
            defpackage.e11.e0(r9)
            goto L98
        L34:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            gp.j(r8)
            r8 = 0
            return r8
        L3b:
            k9b r1 = r0.a
            defpackage.e11.e0(r9)
            goto L83
        L41:
            k9b r1 = r0.a
            defpackage.e11.e0(r9)
            goto L6d
        L47:
            k9b r1 = r0.a
            defpackage.e11.e0(r9)
            goto L60
        L4d:
            defpackage.e11.e0(r9)
            r0.a = r8
            r0.d = r5
            tna r9 = r8.e
            zna r9 = (defpackage.zna) r9
            kb3 r9 = r9.n()
            if (r9 != r7) goto L5f
            goto L97
        L5f:
            r1 = r8
        L60:
            b24 r9 = (defpackage.b24) r9
            r0.a = r1
            r0.d = r6
            java.lang.Object r9 = defpackage.cx1.N(r9, r0)
            if (r9 != r7) goto L6d
            goto L97
        L6d:
            java.util.List r9 = (java.util.List) r9
            r1.F = r9
            java.lang.String r9 = r8.a
            y0c r9 = defpackage.t0c.a(r2, r9)
            r0.a = r8
            r0.d = r4
            java.lang.Object r9 = defpackage.cx1.N(r9, r0)
            if (r9 != r7) goto L82
            goto L97
        L82:
            r1 = r8
        L83:
            java.util.List r9 = (java.util.List) r9
            r1.G = r9
            d1c r2 = (defpackage.d1c) r2
            y0c r9 = r2.e()
            r0.a = r8
            r0.d = r3
            java.lang.Object r9 = defpackage.cx1.N(r9, r0)
            if (r9 != r7) goto L98
        L97:
            return r7
        L98:
            java.util.List r9 = (java.util.List) r9
            r8.H = r9
            heb r8 = defpackage.heb.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.k9b.g(kt1):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:78:0x0235, code lost:
    
        if (r0 == r9) goto L79;
     */
    /* JADX WARN: Removed duplicated region for block: B:177:0x036e  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01ec A[PHI: r0 r3
  0x01ec: PHI (r0v47 boolean) = (r0v10 boolean), (r0v51 boolean) binds: [B:45:0x011a, B:62:0x01e0] A[DONT_GENERATE, DONT_INLINE]
  0x01ec: PHI (r3v32 java.util.Map) = (r3v10 java.util.Map), (r3v40 java.util.Map) binds: [B:45:0x011a, B:62:0x01e0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0245  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(defpackage.kt1 r23) {
        /*
            Method dump skipped, instruction units count: 908
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.k9b.h(kt1):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(defpackage.kt1 r6) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.x8b
            if (r0 == 0) goto L13
            r0 = r6
            x8b r0 = (defpackage.x8b) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            x8b r0 = new x8b
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.a
            int r1 = r0.c
            r2 = 0
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L2d
            if (r1 != r4) goto L27
            defpackage.e11.e0(r6)
            goto L58
        L27:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            gp.j(r5)
            return r3
        L2d:
            defpackage.e11.e0(r6)
            java.util.List r6 = r5.r
            if (r6 == 0) goto L60
            int r6 = r6.size()
            int r1 = r5.u
            int r6 = r6 - r4
            if (r1 >= r6) goto L4d
            aj2 r6 = defpackage.rw2.a
            nh2 r6 = defpackage.nh2.c
            y8b r0 = new y8b
            r0.<init>(r5, r3, r2)
            r1 = 2
            iw0 r5 = r5.k
            defpackage.ah1.J(r5, r6, r3, r0, r1)
            goto L5d
        L4d:
            r0.c = r4
            java.lang.Object r6 = r5.w(r0)
            xx1 r0 = defpackage.xx1.a
            if (r6 != r0) goto L58
            return r0
        L58:
            h8b r5 = r5.i
            r5.d(r2, r2)
        L5d:
            heb r5 = defpackage.heb.a
            return r5
        L60:
            java.lang.String r5 = "chapterList"
            defpackage.lc5.i0(r5)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.k9b.i(kt1):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x00b2, code lost:
    
        if (r2 != r9) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00cc, code lost:
    
        if (w(r0) == r9) goto L52;
     */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0085 A[Catch: all -> 0x0040, TryCatch #0 {all -> 0x0040, blocks: (B:17:0x003b, B:22:0x0047, B:39:0x0081, B:41:0x0085, B:42:0x00a4, B:25:0x004f, B:36:0x0072, B:28:0x0056, B:30:0x0062, B:32:0x0068), top: B:57:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object j(defpackage.kt1 r15) {
        /*
            Method dump skipped, instruction units count: 227
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.k9b.j(kt1):java.lang.Object");
    }

    public final void k() {
        List list = this.r;
        jt1 jt1Var = null;
        if (list == null) {
            lc5.i0("chapterList");
            throw null;
        }
        if (list.isEmpty() || this.u <= 0) {
            this.i.d(false, false);
            return;
        }
        aj2 aj2Var = rw2.a;
        ah1.J(this.k, nh2.c, null, new y8b(this, jt1Var, 1), 2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0082, code lost:
    
        if (r2.q(r11, r9, r0) != r8) goto L41;
     */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00d5 A[Catch: all -> 0x0036, TryCatch #0 {all -> 0x0036, blocks: (B:15:0x0031, B:63:0x00d1, B:65:0x00d5, B:66:0x00e9, B:22:0x0043, B:54:0x00b9, B:56:0x00c5, B:48:0x00a2, B:50:0x00b1), top: B:86:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object l(defpackage.kt1 r11) {
        /*
            Method dump skipped, instruction units count: 348
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.k9b.l(kt1):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0076 A[Catch: all -> 0x0082, TRY_LEAVE, TryCatch #0 {all -> 0x0082, blocks: (B:13:0x002c, B:18:0x003a, B:31:0x006e, B:33:0x0076, B:21:0x0042, B:27:0x005c, B:24:0x004c), top: B:38:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m(defpackage.kt1 r10) {
        /*
            r9 = this;
            boolean r0 = r10 instanceof defpackage.b9b
            if (r0 == 0) goto L13
            r0 = r10
            b9b r0 = (defpackage.b9b) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            b9b r0 = new b9b
            r0.<init>(r9, r10)
        L18:
            java.lang.Object r10 = r0.c
            int r1 = r0.e
            r2 = 0
            heb r3 = defpackage.heb.a
            r4 = 3
            r5 = 2
            r6 = 1
            xx1 r7 = defpackage.xx1.a
            if (r1 == 0) goto L49
            if (r1 == r6) goto L3e
            if (r1 == r5) goto L36
            if (r1 != r4) goto L30
            defpackage.e11.e0(r10)     // Catch: java.lang.Throwable -> L82
            return r3
        L30:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            gp.j(r9)
            return r2
        L36:
            int r9 = r0.b
            k9b r1 = r0.a
            defpackage.e11.e0(r10)     // Catch: java.lang.Throwable -> L82
            goto L6e
        L3e:
            int r9 = r0.b
            k9b r1 = r0.a
            defpackage.e11.e0(r10)     // Catch: java.lang.Throwable -> L82
            r8 = r1
            r1 = r9
            r9 = r8
            goto L5c
        L49:
            defpackage.e11.e0(r10)
            p8b r10 = r9.m     // Catch: java.lang.Throwable -> L82
            r0.a = r9     // Catch: java.lang.Throwable -> L82
            r1 = 0
            r0.b = r1     // Catch: java.lang.Throwable -> L82
            r0.e = r6     // Catch: java.lang.Throwable -> L82
            java.lang.Object r10 = r10.f(r0)     // Catch: java.lang.Throwable -> L82
            if (r10 != r7) goto L5c
            goto L81
        L5c:
            p8b r10 = r9.m     // Catch: java.lang.Throwable -> L82
            r0.a = r9     // Catch: java.lang.Throwable -> L82
            r0.b = r1     // Catch: java.lang.Throwable -> L82
            r0.e = r5     // Catch: java.lang.Throwable -> L82
            java.lang.Object r10 = r10.g(r0)     // Catch: java.lang.Throwable -> L82
            if (r10 != r7) goto L6b
            goto L81
        L6b:
            r8 = r1
            r1 = r9
            r9 = r8
        L6e:
            java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch: java.lang.Throwable -> L82
            boolean r10 = r10.booleanValue()     // Catch: java.lang.Throwable -> L82
            if (r10 != 0) goto L82
            r0.a = r2     // Catch: java.lang.Throwable -> L82
            r0.b = r9     // Catch: java.lang.Throwable -> L82
            r0.e = r4     // Catch: java.lang.Throwable -> L82
            r1.k()     // Catch: java.lang.Throwable -> L82
            if (r3 != r7) goto L82
        L81:
            return r7
        L82:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.k9b.m(kt1):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(float r9, defpackage.kt1 r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof defpackage.c9b
            if (r0 == 0) goto L13
            r0 = r10
            c9b r0 = (defpackage.c9b) r0
            int r1 = r0.f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f = r1
            goto L18
        L13:
            c9b r0 = new c9b
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.d
            int r1 = r0.f
            r2 = 0
            heb r3 = defpackage.heb.a
            r4 = 2
            r5 = 1
            xx1 r6 = defpackage.xx1.a
            if (r1 == 0) goto L40
            if (r1 == r5) goto L33
            if (r1 != r4) goto L2d
            defpackage.e11.e0(r10)     // Catch: java.lang.Throwable -> L6e
            return r3
        L2d:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            gp.j(r8)
            return r2
        L33:
            int r8 = r0.c
            float r9 = r0.a
            k9b r1 = r0.b
            defpackage.e11.e0(r10)     // Catch: java.lang.Throwable -> L6e
            r7 = r1
            r1 = r8
            r8 = r7
            goto L55
        L40:
            defpackage.e11.e0(r10)
            p8b r10 = r8.m     // Catch: java.lang.Throwable -> L6e
            r0.b = r8     // Catch: java.lang.Throwable -> L6e
            r0.a = r9     // Catch: java.lang.Throwable -> L6e
            r1 = 0
            r0.c = r1     // Catch: java.lang.Throwable -> L6e
            r0.f = r5     // Catch: java.lang.Throwable -> L6e
            java.lang.Object r10 = r10.f(r0)     // Catch: java.lang.Throwable -> L6e
            if (r10 != r6) goto L55
            goto L6d
        L55:
            p8b r8 = r8.m     // Catch: java.lang.Throwable -> L6e
            r0.b = r2     // Catch: java.lang.Throwable -> L6e
            r0.a = r9     // Catch: java.lang.Throwable -> L6e
            r0.c = r1     // Catch: java.lang.Throwable -> L6e
            r0.f = r4     // Catch: java.lang.Throwable -> L6e
            dla r8 = r8.a     // Catch: java.lang.Throwable -> L6e
            if (r8 == 0) goto L6a
            java.lang.Object r8 = r8.p(r9, r0)     // Catch: java.lang.Throwable -> L6e
            if (r8 != r6) goto L6a
            goto L6b
        L6a:
            r8 = r3
        L6b:
            if (r8 != r6) goto L6e
        L6d:
            return r6
        L6e:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.k9b.n(float, kt1):java.lang.Object");
    }

    public final void o(long j) {
        Object value;
        oq9 oq9Var = this.z;
        jt1 jt1Var = null;
        if (oq9Var != null) {
            oq9Var.cancel(null);
        }
        fr9 fr9Var = this.i.c;
        do {
            value = fr9Var.getValue();
            ((g8b) value).getClass();
        } while (!fr9Var.j(value, new g8b(j)));
        if (j <= 0) {
            return;
        }
        this.A = j;
        ah1.J(this.k, null, null, new y8b(this, jt1Var, 2), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0291 A[PHI: r1
  0x0291: PHI (r1v36 java.lang.Object) = (r1v35 java.lang.Object), (r1v1 java.lang.Object) binds: [B:145:0x028d, B:15:0x0046] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:149:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x02e7  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x02fc  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0320  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x032b  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0346 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:195:0x02f7 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:198:0x01f0 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0178 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:213:0x00ed A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a4 A[PHI: r1 r3
  0x00a4: PHI (r1v8 java.lang.Object) = (r1v7 java.lang.Object), (r1v1 java.lang.Object) binds: [B:28:0x00a0, B:22:0x0069] A[DONT_GENERATE, DONT_INLINE]
  0x00a4: PHI (r3v2 java.util.ArrayList) = (r3v1 java.util.ArrayList), (r3v7 java.util.ArrayList) binds: [B:28:0x00a0, B:22:0x0069] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0108 A[PHI: r1
  0x0108: PHI (r1v14 java.lang.Object) = (r1v12 java.lang.Object), (r1v1 java.lang.Object) binds: [B:46:0x0104, B:21:0x0064] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0124 A[PHI: r1
  0x0124: PHI (r1v19 java.lang.Object) = (r1v18 java.lang.Object), (r1v1 java.lang.Object) binds: [B:52:0x0120, B:19:0x005a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x019f A[PHI: r1
  0x019f: PHI (r1v29 java.lang.Object) = (r1v28 java.lang.Object), (r1v1 java.lang.Object) binds: [B:84:0x019b, B:17:0x0050] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01d8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object p(defpackage.kt1 r18) {
        /*
            Method dump skipped, instruction units count: 870
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.k9b.p(kt1):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:215:0x04f6, code lost:
    
        if (r3 == r2) goto L260;
     */
    /* JADX WARN: Code restructure failed: missing block: B:245:0x059a, code lost:
    
        if (d(r11) == r2) goto L260;
     */
    /* JADX WARN: Code restructure failed: missing block: B:259:0x05d5, code lost:
    
        if (d(r11) == r2) goto L260;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x01d4, code lost:
    
        if (d(r11) == r2) goto L260;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x02ab A[Catch: all -> 0x02b4, TRY_LEAVE, TryCatch #9 {all -> 0x02b4, blocks: (B:109:0x02a7, B:111:0x02ab), top: B:290:0x02a7 }] */
    /* JADX WARN: Removed duplicated region for block: B:132:0x02db  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x02e0  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x03c3 A[PHI: r2 r4 r5 r6 r7 r8
  0x03c3: PHI (r2v18 xx1) = (r2v17 xx1), (r2v0 xx1) binds: [B:172:0x03bf, B:34:0x00f9] A[DONT_GENERATE, DONT_INLINE]
  0x03c3: PHI (r4v24 boolean) = (r4v61 boolean), (r4v62 boolean) binds: [B:172:0x03bf, B:34:0x00f9] A[DONT_GENERATE, DONT_INLINE]
  0x03c3: PHI (r5v24 int) = (r5v22 int), (r5v25 int) binds: [B:172:0x03bf, B:34:0x00f9] A[DONT_GENERATE, DONT_INLINE]
  0x03c3: PHI (r6v17 int) = (r6v15 int), (r6v18 int) binds: [B:172:0x03bf, B:34:0x00f9] A[DONT_GENERATE, DONT_INLINE]
  0x03c3: PHI (r7v18 java.lang.String) = (r7v16 java.lang.String), (r7v19 java.lang.String) binds: [B:172:0x03bf, B:34:0x00f9] A[DONT_GENERATE, DONT_INLINE]
  0x03c3: PHI (r8v20 java.lang.String) = (r8v17 java.lang.String), (r8v22 java.lang.String) binds: [B:172:0x03bf, B:34:0x00f9] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:177:0x03de A[PHI: r0 r2 r4 r5 r6 r7 r8
  0x03de: PHI (r0v62 java.lang.Object) = (r0v61 java.lang.Object), (r0v1 java.lang.Object) binds: [B:175:0x03da, B:33:0x00e8] A[DONT_GENERATE, DONT_INLINE]
  0x03de: PHI (r2v19 xx1) = (r2v18 xx1), (r2v0 xx1) binds: [B:175:0x03da, B:33:0x00e8] A[DONT_GENERATE, DONT_INLINE]
  0x03de: PHI (r4v26 boolean) = (r4v59 boolean), (r4v60 boolean) binds: [B:175:0x03da, B:33:0x00e8] A[DONT_GENERATE, DONT_INLINE]
  0x03de: PHI (r5v26 int) = (r5v24 int), (r5v27 int) binds: [B:175:0x03da, B:33:0x00e8] A[DONT_GENERATE, DONT_INLINE]
  0x03de: PHI (r6v19 int) = (r6v17 int), (r6v20 int) binds: [B:175:0x03da, B:33:0x00e8] A[DONT_GENERATE, DONT_INLINE]
  0x03de: PHI (r7v20 java.lang.String) = (r7v18 java.lang.String), (r7v21 java.lang.String) binds: [B:175:0x03da, B:33:0x00e8] A[DONT_GENERATE, DONT_INLINE]
  0x03de: PHI (r8v23 java.lang.String) = (r8v20 java.lang.String), (r8v25 java.lang.String) binds: [B:175:0x03da, B:33:0x00e8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:179:0x03e6  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0401 A[PHI: r2 r4 r5 r6 r7 r8
  0x0401: PHI (r2v20 xx1) = (r2v19 xx1), (r2v19 xx1), (r2v0 xx1) binds: [B:178:0x03e4, B:180:0x03fd, B:32:0x00d7] A[DONT_GENERATE, DONT_INLINE]
  0x0401: PHI (r4v28 boolean) = (r4v56 boolean), (r4v57 boolean), (r4v58 boolean) binds: [B:178:0x03e4, B:180:0x03fd, B:32:0x00d7] A[DONT_GENERATE, DONT_INLINE]
  0x0401: PHI (r5v28 int) = (r5v26 int), (r5v26 int), (r5v29 int) binds: [B:178:0x03e4, B:180:0x03fd, B:32:0x00d7] A[DONT_GENERATE, DONT_INLINE]
  0x0401: PHI (r6v21 int) = (r6v19 int), (r6v19 int), (r6v22 int) binds: [B:178:0x03e4, B:180:0x03fd, B:32:0x00d7] A[DONT_GENERATE, DONT_INLINE]
  0x0401: PHI (r7v22 java.lang.String) = (r7v20 java.lang.String), (r7v20 java.lang.String), (r7v23 java.lang.String) binds: [B:178:0x03e4, B:180:0x03fd, B:32:0x00d7] A[DONT_GENERATE, DONT_INLINE]
  0x0401: PHI (r8v26 java.lang.String) = (r8v23 java.lang.String), (r8v23 java.lang.String), (r8v28 java.lang.String) binds: [B:178:0x03e4, B:180:0x03fd, B:32:0x00d7] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:184:0x041a  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0421 A[PHI: r2 r4 r5 r6 r7 r8
  0x0421: PHI (r2v21 xx1) = (r2v20 xx1), (r2v0 xx1) binds: [B:185:0x041d, B:31:0x00c6] A[DONT_GENERATE, DONT_INLINE]
  0x0421: PHI (r4v30 boolean) = (r4v28 boolean), (r4v31 boolean) binds: [B:185:0x041d, B:31:0x00c6] A[DONT_GENERATE, DONT_INLINE]
  0x0421: PHI (r5v30 int) = (r5v28 int), (r5v31 int) binds: [B:185:0x041d, B:31:0x00c6] A[DONT_GENERATE, DONT_INLINE]
  0x0421: PHI (r6v23 int) = (r6v21 int), (r6v24 int) binds: [B:185:0x041d, B:31:0x00c6] A[DONT_GENERATE, DONT_INLINE]
  0x0421: PHI (r7v24 java.lang.String) = (r7v22 java.lang.String), (r7v25 java.lang.String) binds: [B:185:0x041d, B:31:0x00c6] A[DONT_GENERATE, DONT_INLINE]
  0x0421: PHI (r8v29 java.lang.String) = (r8v26 java.lang.String), (r8v31 java.lang.String) binds: [B:185:0x041d, B:31:0x00c6] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0440  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0447 A[PHI: r2 r4 r5 r6 r7 r8
  0x0447: PHI (r2v22 xx1) = (r2v21 xx1), (r2v0 xx1) binds: [B:190:0x0443, B:30:0x00b5] A[DONT_GENERATE, DONT_INLINE]
  0x0447: PHI (r4v32 boolean) = (r4v30 boolean), (r4v33 boolean) binds: [B:190:0x0443, B:30:0x00b5] A[DONT_GENERATE, DONT_INLINE]
  0x0447: PHI (r5v32 int) = (r5v30 int), (r5v33 int) binds: [B:190:0x0443, B:30:0x00b5] A[DONT_GENERATE, DONT_INLINE]
  0x0447: PHI (r6v25 int) = (r6v23 int), (r6v26 int) binds: [B:190:0x0443, B:30:0x00b5] A[DONT_GENERATE, DONT_INLINE]
  0x0447: PHI (r7v26 java.lang.String) = (r7v24 java.lang.String), (r7v27 java.lang.String) binds: [B:190:0x0443, B:30:0x00b5] A[DONT_GENERATE, DONT_INLINE]
  0x0447: PHI (r8v32 java.lang.String) = (r8v29 java.lang.String), (r8v34 java.lang.String) binds: [B:190:0x0443, B:30:0x00b5] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0466  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x046d A[PHI: r2 r4 r5 r6 r7 r8
  0x046d: PHI (r2v23 xx1) = (r2v22 xx1), (r2v0 xx1) binds: [B:195:0x0469, B:29:0x00a4] A[DONT_GENERATE, DONT_INLINE]
  0x046d: PHI (r4v34 boolean) = (r4v32 boolean), (r4v35 boolean) binds: [B:195:0x0469, B:29:0x00a4] A[DONT_GENERATE, DONT_INLINE]
  0x046d: PHI (r5v34 int) = (r5v32 int), (r5v35 int) binds: [B:195:0x0469, B:29:0x00a4] A[DONT_GENERATE, DONT_INLINE]
  0x046d: PHI (r6v27 int) = (r6v25 int), (r6v28 int) binds: [B:195:0x0469, B:29:0x00a4] A[DONT_GENERATE, DONT_INLINE]
  0x046d: PHI (r7v28 java.lang.String) = (r7v26 java.lang.String), (r7v29 java.lang.String) binds: [B:195:0x0469, B:29:0x00a4] A[DONT_GENERATE, DONT_INLINE]
  0x046d: PHI (r8v35 java.lang.String) = (r8v32 java.lang.String), (r8v37 java.lang.String) binds: [B:195:0x0469, B:29:0x00a4] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:199:0x048c  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0493 A[PHI: r2 r4 r5 r6 r7 r8
  0x0493: PHI (r2v24 xx1) = (r2v23 xx1), (r2v0 xx1) binds: [B:200:0x048f, B:28:0x0093] A[DONT_GENERATE, DONT_INLINE]
  0x0493: PHI (r4v36 boolean) = (r4v34 boolean), (r4v37 boolean) binds: [B:200:0x048f, B:28:0x0093] A[DONT_GENERATE, DONT_INLINE]
  0x0493: PHI (r5v36 int) = (r5v34 int), (r5v38 int) binds: [B:200:0x048f, B:28:0x0093] A[DONT_GENERATE, DONT_INLINE]
  0x0493: PHI (r6v29 int) = (r6v27 int), (r6v31 int) binds: [B:200:0x048f, B:28:0x0093] A[DONT_GENERATE, DONT_INLINE]
  0x0493: PHI (r7v30 java.lang.String) = (r7v28 java.lang.String), (r7v33 java.lang.String) binds: [B:200:0x048f, B:28:0x0093] A[DONT_GENERATE, DONT_INLINE]
  0x0493: PHI (r8v38 java.lang.String) = (r8v35 java.lang.String), (r8v41 java.lang.String) binds: [B:200:0x048f, B:28:0x0093] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:204:0x049e  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x04c1  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0502 A[PHI: r2 r4 r5 r6 r7 r8 r9
  0x0502: PHI (r2v27 xx1) = (r2v26 xx1), (r2v28 xx1) binds: [B:210:0x04cc, B:218:0x04ff] A[DONT_GENERATE, DONT_INLINE]
  0x0502: PHI (r4v44 ??) = (r4v54 ??), (r4v46 ??) binds: [B:210:0x04cc, B:218:0x04ff] A[DONT_GENERATE, DONT_INLINE]
  0x0502: PHI (r5v44 int) = (r5v40 int), (r5v49 int) binds: [B:210:0x04cc, B:218:0x04ff] A[DONT_GENERATE, DONT_INLINE]
  0x0502: PHI (r6v36 int) = (r6v34 int), (r6v44 int) binds: [B:210:0x04cc, B:218:0x04ff] A[DONT_GENERATE, DONT_INLINE]
  0x0502: PHI (r7v37 int) = (r7v35 int), (r7v39 int) binds: [B:210:0x04cc, B:218:0x04ff] A[DONT_GENERATE, DONT_INLINE]
  0x0502: PHI (r8v45 k9b) = (r8v42 k9b), (r8v47 k9b) binds: [B:210:0x04cc, B:218:0x04ff] A[DONT_GENERATE, DONT_INLINE]
  0x0502: PHI (r9v39 java.lang.String) = (r9v36 java.lang.String), (r9v43 java.lang.String) binds: [B:210:0x04cc, B:218:0x04ff] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0538 A[Catch: all -> 0x054c, TRY_LEAVE, TryCatch #5 {all -> 0x054c, blocks: (B:220:0x0506, B:222:0x0538), top: B:282:0x0506 }] */
    /* JADX WARN: Removed duplicated region for block: B:225:0x0540  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x055c  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x057e  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x05ef  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x04ce A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x022c A[Catch: all -> 0x0221, TRY_LEAVE, TryCatch #0 {all -> 0x0221, blocks: (B:80:0x0213, B:82:0x0217, B:89:0x0228, B:91:0x022c), top: B:272:0x0213 }] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0249 A[Catch: all -> 0x0247, TryCatch #2 {all -> 0x0247, blocks: (B:93:0x0232, B:97:0x024d, B:96:0x0249), top: B:276:0x022a }] */
    /* JADX WARN: Type inference failed for: r0v92 */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v2, types: [c21, java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r4v38 */
    /* JADX WARN: Type inference failed for: r4v39, types: [boolean] */
    /* JADX WARN: Type inference failed for: r4v42 */
    /* JADX WARN: Type inference failed for: r4v43 */
    /* JADX WARN: Type inference failed for: r4v44, types: [boolean] */
    /* JADX WARN: Type inference failed for: r4v46 */
    /* JADX WARN: Type inference failed for: r4v48 */
    /* JADX WARN: Type inference failed for: r4v50 */
    /* JADX WARN: Type inference failed for: r4v51 */
    /* JADX WARN: Type inference failed for: r4v52 */
    /* JADX WARN: Type inference failed for: r4v53 */
    /* JADX WARN: Type inference failed for: r4v54 */
    /* JADX WARN: Type inference failed for: r4v55 */
    /* JADX WARN: Type inference failed for: r5v41 */
    /* JADX WARN: Type inference failed for: r5v48 */
    /* JADX WARN: Type inference failed for: r5v50, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v2, types: [int] */
    /* JADX WARN: Type inference failed for: r6v33 */
    /* JADX WARN: Type inference failed for: r6v37 */
    /* JADX WARN: Type inference failed for: r6v51 */
    /* JADX WARN: Type inference failed for: r6v52 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object q(int r21, int r22, defpackage.kt1 r23) {
        /*
            Method dump skipped, instruction units count: 1568
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.k9b.q(int, int, kt1):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:126:0x02f4, code lost:
    
        if (r0 != r5) goto L128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0236, code lost:
    
        if (h(r2) != r5) goto L93;
     */
    /* JADX WARN: Removed duplicated region for block: B:113:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x02c4  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x02c7  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x02cc  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x02cf  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0303  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0357  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x036d  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0389  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0397 A[Catch: all -> 0x03b9, TRY_LEAVE, TryCatch #2 {all -> 0x03b9, blocks: (B:145:0x038f, B:147:0x0397), top: B:187:0x038f }] */
    /* JADX WARN: Removed duplicated region for block: B:155:0x03bc  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x03d2  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x03dd A[Catch: all -> 0x0058, TRY_LEAVE, TryCatch #1 {all -> 0x0058, blocks: (B:16:0x0053, B:159:0x03d3, B:161:0x03dd, B:156:0x03be, B:141:0x0370), top: B:185:0x0035 }] */
    /* JADX WARN: Removed duplicated region for block: B:168:0x03f7  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x042e  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01a8 A[PHI: r0 r3 r10 r15
  0x01a8: PHI (r0v36 java.lang.Object) = (r0v35 java.lang.Object), (r0v1 java.lang.Object) binds: [B:61:0x01a4, B:38:0x00df] A[DONT_GENERATE, DONT_INLINE]
  0x01a8: PHI (r3v13 int) = (r3v11 int), (r3v14 int) binds: [B:61:0x01a4, B:38:0x00df] A[DONT_GENERATE, DONT_INLINE]
  0x01a8: PHI (r10v7 int) = (r10v5 int), (r10v8 int) binds: [B:61:0x01a4, B:38:0x00df] A[DONT_GENERATE, DONT_INLINE]
  0x01a8: PHI (r15v11 k9b) = (r15v9 k9b), (r15v12 k9b) binds: [B:61:0x01a4, B:38:0x00df] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01e7 A[PHI: r0 r3 r8 r13
  0x01e7: PHI (r0v48 java.lang.Object) = (r0v47 java.lang.Object), (r0v1 java.lang.Object) binds: [B:73:0x01e3, B:36:0x00c9] A[DONT_GENERATE, DONT_INLINE]
  0x01e7: PHI (r3v17 int) = (r3v15 int), (r3v18 int) binds: [B:73:0x01e3, B:36:0x00c9] A[DONT_GENERATE, DONT_INLINE]
  0x01e7: PHI (r8v5 int) = (r8v3 int), (r8v6 int) binds: [B:73:0x01e3, B:36:0x00c9] A[DONT_GENERATE, DONT_INLINE]
  0x01e7: PHI (r13v5 k9b) = (r13v3 k9b), (r13v6 k9b) binds: [B:73:0x01e3, B:36:0x00c9] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0209 A[LOOP:0: B:83:0x0203->B:85:0x0209, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0247  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object r(int r30, int r31, defpackage.kt1 r32) {
        /*
            Method dump skipped, instruction units count: 1118
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.k9b.r(int, int, kt1):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x00b0, code lost:
    
        if (w(r0) != r9) goto L42;
     */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0078 A[Catch: all -> 0x00a8, TryCatch #0 {all -> 0x00a8, blocks: (B:17:0x003b, B:20:0x0043, B:33:0x0074, B:35:0x0078, B:36:0x0097, B:23:0x004b, B:30:0x0065, B:26:0x0054), top: B:47:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object s(defpackage.kt1 r14) {
        /*
            r13 = this;
            boolean r0 = r14 instanceof defpackage.h9b
            if (r0 == 0) goto L13
            r0 = r14
            h9b r0 = (defpackage.h9b) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            h9b r0 = new h9b
            r0.<init>(r13, r14)
        L18:
            java.lang.Object r14 = r0.c
            int r1 = r0.e
            heb r2 = defpackage.heb.a
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 0
            r7 = 1
            r8 = 0
            xx1 r9 = defpackage.xx1.a
            if (r1 == 0) goto L4f
            if (r1 == r7) goto L47
            if (r1 == r5) goto L3f
            if (r1 == r4) goto L3b
            if (r1 != r3) goto L35
            defpackage.e11.e0(r14)
            goto Lb3
        L35:
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            gp.j(r13)
            return r6
        L3b:
            defpackage.e11.e0(r14)     // Catch: java.lang.Throwable -> La8
            goto La8
        L3f:
            int r1 = r0.b
            k9b r7 = r0.a
            defpackage.e11.e0(r14)     // Catch: java.lang.Throwable -> La8
            goto L74
        L47:
            int r1 = r0.b
            k9b r7 = r0.a
            defpackage.e11.e0(r14)     // Catch: java.lang.Throwable -> La8
            goto L65
        L4f:
            defpackage.e11.e0(r14)
            r13.B = r7
            ec0 r14 = r13.n     // Catch: java.lang.Throwable -> La8
            r0.a = r13     // Catch: java.lang.Throwable -> La8
            r0.b = r8     // Catch: java.lang.Throwable -> La8
            r0.e = r7     // Catch: java.lang.Throwable -> La8
            java.lang.Object r14 = r14.e(r0)     // Catch: java.lang.Throwable -> La8
            if (r14 != r9) goto L63
            goto Lb2
        L63:
            r7 = r13
            r1 = r8
        L65:
            p8b r14 = r7.m     // Catch: java.lang.Throwable -> La8
            r0.a = r7     // Catch: java.lang.Throwable -> La8
            r0.b = r1     // Catch: java.lang.Throwable -> La8
            r0.e = r5     // Catch: java.lang.Throwable -> La8
            java.lang.Object r14 = r14.i(r0)     // Catch: java.lang.Throwable -> La8
            if (r14 != r9) goto L74
            goto Lb2
        L74:
            c85 r14 = r7.o     // Catch: java.lang.Throwable -> La8
            if (r14 == 0) goto L97
            java.lang.Object r14 = r14.a     // Catch: java.lang.Throwable -> La8
            com.reader.data.reader.text.core.tts.AndroidTextToSpeechService r14 = (com.reader.data.reader.text.core.tts.AndroidTextToSpeechService) r14     // Catch: java.lang.Throwable -> La8
            dp5 r10 = r14.s     // Catch: java.lang.Throwable -> La8
            java.lang.Object r10 = r10.getValue()     // Catch: java.lang.Throwable -> La8
            h8b r10 = (defpackage.h8b) r10     // Catch: java.lang.Throwable -> La8
            r10.d(r8, r8)     // Catch: java.lang.Throwable -> La8
            iw0 r10 = r14.B     // Catch: java.lang.Throwable -> La8
            aj2 r11 = defpackage.rw2.a     // Catch: java.lang.Throwable -> La8
            fj4 r11 = defpackage.r76.a     // Catch: java.lang.Throwable -> La8
            fj4 r11 = r11.f     // Catch: java.lang.Throwable -> La8
            gl r12 = new gl     // Catch: java.lang.Throwable -> La8
            r12.<init>(r14, r6, r4)     // Catch: java.lang.Throwable -> La8
            defpackage.ah1.J(r10, r11, r6, r12, r5)     // Catch: java.lang.Throwable -> La8
        L97:
            h8b r14 = r7.i     // Catch: java.lang.Throwable -> La8
            r14.d(r8, r8)     // Catch: java.lang.Throwable -> La8
            r0.a = r6     // Catch: java.lang.Throwable -> La8
            r0.b = r1     // Catch: java.lang.Throwable -> La8
            r0.e = r4     // Catch: java.lang.Throwable -> La8
            r7.v(r0)     // Catch: java.lang.Throwable -> La8
            if (r2 != r9) goto La8
            goto Lb2
        La8:
            r0.a = r6
            r0.e = r3
            java.lang.Object r14 = r13.w(r0)
            if (r14 != r9) goto Lb3
        Lb2:
            return r9
        Lb3:
            oq9 r13 = r13.z
            if (r13 == 0) goto Lba
            r13.cancel(r6)
        Lba:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.k9b.s(kt1):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object t(java.lang.String r8, boolean r9, defpackage.kt1 r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof defpackage.i9b
            if (r0 == 0) goto L14
            r0 = r10
            i9b r0 = (defpackage.i9b) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.c = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            i9b r0 = new i9b
            r0.<init>(r7, r10)
            goto L12
        L1a:
            java.lang.Object r10 = r6.a
            int r0 = r6.c
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L2e
            if (r0 != r1) goto L28
            defpackage.e11.e0(r10)
            goto L75
        L28:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            gp.j(r7)
            return r2
        L2e:
            defpackage.e11.e0(r10)
            boolean r10 = r7.J
            if (r10 != 0) goto L36
            goto L3e
        L36:
            java.lang.String r10 = r7.C
            v5b r10 = r7.f(r10)
            if (r10 != 0) goto L3f
        L3e:
            return r2
        L3f:
            java.lang.String r3 = r7.D
            java.lang.String r4 = r7.E
            java.lang.Boolean r7 = java.lang.Boolean.TRUE
            xl7 r0 = new xl7
            java.lang.String r2 = "firstCapitalize"
            r0.<init>(r2, r7)
            java.lang.Boolean r7 = java.lang.Boolean.FALSE
            xl7 r2 = new xl7
            java.lang.String r5 = "convertSimplified"
            r2.<init>(r5, r7)
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r9)
            xl7 r9 = new xl7
            java.lang.String r5 = "firstLineChapterName"
            r9.<init>(r5, r7)
            xl7[] r7 = new defpackage.xl7[]{r0, r2, r9}
            java.util.Map r5 = defpackage.y86.P(r7)
            r6.c = r1
            r2 = r8
            r1 = r10
            java.lang.Object r10 = r1.a(r2, r3, r4, r5, r6)
            xx1 r7 = defpackage.xx1.a
            if (r10 != r7) goto L75
            return r7
        L75:
            s5b r10 = (defpackage.s5b) r10
            java.lang.String r7 = r10.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.k9b.t(java.lang.String, boolean, kt1):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0096 A[PHI: r1
  0x0096: PHI (r1v4 boolean) = (r1v2 boolean), (r1v5 boolean) binds: [B:33:0x0093, B:18:0x0043] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a2 A[PHI: r1 r7
  0x00a2: PHI (r1v6 boolean) = (r1v4 boolean), (r1v7 boolean) binds: [B:36:0x009f, B:17:0x003d] A[DONT_GENERATE, DONT_INLINE]
  0x00a2: PHI (r7v14 java.lang.Object) = (r7v13 java.lang.Object), (r7v1 java.lang.Object) binds: [B:36:0x009f, B:17:0x003d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00d6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object u(defpackage.jt1 r7) {
        /*
            Method dump skipped, instruction units count: 234
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.k9b.u(jt1):java.lang.Object");
    }

    public final heb v(kt1 kt1Var) {
        int i = this.u;
        String str = this.v;
        ((wja) this.c).a.b.r0(this.w, i, str, this.x, r95.a.k().c(), this.a);
        return heb.a;
    }

    public final Object w(kt1 kt1Var) throws Throwable {
        long j = this.L;
        if (j > 0) {
            long jC = r95.a.k().c() - j;
            this.L = 0L;
            if (jC > 0) {
                aj2 aj2Var = rw2.a;
                Object objB0 = ah1.b0(nh2.c, new w35(this, j, jC, null, 3), kt1Var);
                if (objB0 == xx1.a) {
                    return objB0;
                }
            }
        }
        return heb.a;
    }
}
