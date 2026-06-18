package defpackage;

import android.content.Context;
import android.speech.tts.TextToSpeech;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class n7a implements dla {
    public List a;
    public ArrayList b;
    public ArrayList c;
    public final zk d;
    public int e;
    public long f;
    public String g;
    public int h;
    public int i;

    public n7a() {
        Context context = kl8.D;
        context.getClass();
        this.d = new zk(context);
        mc8 mc8Var = k63.b;
        this.f = 0L;
        this.g = "";
        this.i = -1;
    }

    @Override // defpackage.dla
    public final heb a(wka wkaVar) {
        TextToSpeech textToSpeech;
        d27 d27Var = new d27(wkaVar.a, wkaVar.b);
        zk zkVar = this.d;
        zkVar.m = d27Var;
        zkVar.d.k(null);
        TextToSpeech textToSpeech2 = zkVar.c;
        if (textToSpeech2 != null && textToSpeech2.isSpeaking() && (textToSpeech = zkVar.c) != null) {
            gc1.I(textToSpeech.stop());
        }
        TextToSpeech textToSpeech3 = zkVar.c;
        if (textToSpeech3 != null) {
            textToSpeech3.shutdown();
        }
        zkVar.c = null;
        zkVar.l.clear();
        zkVar.f();
        return heb.a;
    }

    @Override // defpackage.dla
    public final void b(int i) {
        this.i = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.dla
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable c(defpackage.jt1 r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.h7a
            if (r0 == 0) goto L13
            r0 = r5
            h7a r0 = (defpackage.h7a) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L1a
        L13:
            h7a r0 = new h7a
            kt1 r5 = (defpackage.kt1) r5
            r0.<init>(r4, r5)
        L1a:
            java.lang.Object r5 = r0.a
            int r1 = r0.c
            r2 = 1
            if (r1 == 0) goto L2e
            if (r1 != r2) goto L27
            defpackage.e11.e0(r5)
            goto L3e
        L27:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            gp.j(r4)
            r4 = 0
            return r4
        L2e:
            defpackage.e11.e0(r5)
            r0.c = r2
            zk r4 = r4.d
            java.lang.Object r5 = r4.c(r0)
            xx1 r4 = defpackage.xx1.a
            if (r5 != r4) goto L3e
            return r4
        L3e:
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.ArrayList r4 = new java.util.ArrayList
            r0 = 10
            int r0 = defpackage.gc1.M(r5, r0)
            r4.<init>(r0)
            java.util.Iterator r5 = r5.iterator()
        L4f:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L68
            java.lang.Object r0 = r5.next()
            e27 r0 = (defpackage.e27) r0
            yka r1 = new yka
            java.lang.String r2 = r0.a
            java.lang.String r0 = r0.b
            r1.<init>(r2, r0)
            r4.add(r1)
            goto L4f
        L68:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n7a.c(jt1):java.io.Serializable");
    }

    @Override // defpackage.dla
    public final void d(bla blaVar) {
        wo9 wo9Var = new wo9(5, this, blaVar);
        zk zkVar = this.d;
        zkVar.getClass();
        zkVar.b = wo9Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.dla
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(defpackage.jt1 r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.l7a
            if (r0 == 0) goto L13
            r0 = r6
            l7a r0 = (defpackage.l7a) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L1a
        L13:
            l7a r0 = new l7a
            kt1 r6 = (defpackage.kt1) r6
            r0.<init>(r5, r6)
        L1a:
            java.lang.Object r6 = r0.a
            int r1 = r0.c
            r2 = 1
            if (r1 == 0) goto L2e
            if (r1 != r2) goto L27
            defpackage.e11.e0(r6)
            goto L54
        L27:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            gp.j(r5)
            r5 = 0
            return r5
        L2e:
            defpackage.e11.e0(r6)
            java.util.ArrayList r6 = r5.b
            if (r6 != 0) goto L38
            java.lang.Boolean r5 = java.lang.Boolean.TRUE
            return r5
        L38:
            int r1 = r5.e
            int r6 = r6.size()
            int r6 = r6 - r2
            if (r1 >= r6) goto L57
            int r6 = r5.e
            int r6 = r6 + (-1)
            r5.e = r6
            long r3 = r5.f
            r0.c = r2
            java.lang.Object r5 = r5.x(r6, r3, r0)
            xx1 r6 = defpackage.xx1.a
            if (r5 != r6) goto L54
            return r6
        L54:
            java.lang.Boolean r5 = java.lang.Boolean.TRUE
            return r5
        L57:
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n7a.f(jt1):java.lang.Object");
    }

    @Override // defpackage.dla
    public final Object g(float f, kt1 kt1Var) {
        Object objI = this.d.i(f, kt1Var);
        return objI == xx1.a ? objI : heb.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.dla
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable h(defpackage.yka r5, defpackage.jt1 r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.j7a
            if (r0 == 0) goto L13
            r0 = r6
            j7a r0 = (defpackage.j7a) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L1a
        L13:
            j7a r0 = new j7a
            kt1 r6 = (defpackage.kt1) r6
            r0.<init>(r4, r6)
        L1a:
            java.lang.Object r6 = r0.a
            int r1 = r0.c
            r2 = 1
            if (r1 == 0) goto L2e
            if (r1 != r2) goto L27
            defpackage.e11.e0(r6)
            goto L47
        L27:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            gp.j(r4)
            r4 = 0
            return r4
        L2e:
            defpackage.e11.e0(r6)
            e27 r6 = new e27
            java.lang.String r1 = r5.a
            java.lang.String r5 = r5.b
            r6.<init>(r1, r5)
            r0.c = r2
            zk r4 = r4.d
            java.io.Serializable r6 = r4.e(r6, r0)
            xx1 r4 = defpackage.xx1.a
            if (r6 != r4) goto L47
            return r4
        L47:
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.ArrayList r4 = new java.util.ArrayList
            r5 = 10
            int r5 = defpackage.gc1.M(r6, r5)
            r4.<init>(r5)
            java.util.Iterator r5 = r6.iterator()
        L58:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L73
            java.lang.Object r6 = r5.next()
            f27 r6 = (defpackage.f27) r6
            cla r0 = new cla
            java.lang.String r1 = r6.a
            java.lang.String r2 = r6.b
            boolean r6 = r6.c
            r0.<init>(r1, r2, r6)
            r4.add(r0)
            goto L58
        L73:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n7a.h(yka, jt1):java.io.Serializable");
    }

    @Override // defpackage.dla
    public final Object i(float f, kt1 kt1Var) {
        Object objH = this.d.h(f, kt1Var);
        return objH == xx1.a ? objH : heb.a;
    }

    @Override // defpackage.dla
    public final void j(List list) {
        list.getClass();
        this.a = list;
    }

    @Override // defpackage.dla
    public final Object k(kt1 kt1Var) {
        zk zkVar = this.d;
        return new xka(0, false, TextToSpeech.getMaxSpeechInputLength(), zkVar.q, zkVar.p, zkVar.s, zkVar.r, false, false, "");
    }

    @Override // defpackage.dla
    public final Boolean l(l8b l8bVar) {
        return Boolean.valueOf(this.d.h);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.dla
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m(defpackage.jt1 r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.i7a
            if (r0 == 0) goto L13
            r0 = r5
            i7a r0 = (defpackage.i7a) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L1a
        L13:
            i7a r0 = new i7a
            kt1 r5 = (defpackage.kt1) r5
            r0.<init>(r4, r5)
        L1a:
            java.lang.Object r5 = r0.a
            int r1 = r0.c
            r2 = 1
            if (r1 == 0) goto L2e
            if (r1 != r2) goto L27
            defpackage.e11.e0(r5)
            goto L3e
        L27:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            gp.j(r4)
            r4 = 0
            return r4
        L2e:
            defpackage.e11.e0(r5)
            r0.c = r2
            zk r4 = r4.d
            java.io.Serializable r5 = r4.d(r0)
            xx1 r4 = defpackage.xx1.a
            if (r5 != r4) goto L3e
            return r4
        L3e:
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.ArrayList r4 = new java.util.ArrayList
            r0 = 10
            int r0 = defpackage.gc1.M(r5, r0)
            r4.<init>(r0)
            java.util.Iterator r5 = r5.iterator()
        L4f:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L68
            java.lang.Object r0 = r5.next()
            d27 r0 = (defpackage.d27) r0
            wka r1 = new wka
            java.lang.String r2 = r0.a
            java.lang.String r0 = r0.b
            r1.<init>(r2, r0)
            r4.add(r1)
            goto L4f
        L68:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n7a.m(jt1):java.lang.Object");
    }

    @Override // defpackage.dla
    public final void n(int i) {
        this.h = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0063, code lost:
    
        if (x(r8, r5, r0) == r4) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.dla
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o(defpackage.jt1 r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof defpackage.k7a
            if (r0 == 0) goto L13
            r0 = r8
            k7a r0 = (defpackage.k7a) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L1a
        L13:
            k7a r0 = new k7a
            kt1 r8 = (defpackage.kt1) r8
            r0.<init>(r7, r8)
        L1a:
            java.lang.Object r8 = r0.a
            int r1 = r0.c
            r2 = 2
            r3 = 1
            xx1 r4 = defpackage.xx1.a
            if (r1 == 0) goto L37
            if (r1 == r3) goto L33
            if (r1 != r2) goto L2c
            defpackage.e11.e0(r8)
            goto L66
        L2c:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            gp.j(r7)
            r7 = 0
            return r7
        L33:
            defpackage.e11.e0(r8)
            goto L59
        L37:
            defpackage.e11.e0(r8)
            java.util.ArrayList r8 = r7.b
            if (r8 != 0) goto L41
            java.lang.Boolean r7 = java.lang.Boolean.TRUE
            return r7
        L41:
            int r1 = r7.e
            int r8 = r8.size()
            int r8 = r8 - r3
            if (r1 >= r8) goto L69
            int r8 = r7.e
            int r8 = r8 + r3
            r7.e = r8
            r0.c = r3
            r7.w(r0)
            heb r8 = defpackage.heb.a
            if (r8 != r4) goto L59
            goto L65
        L59:
            int r8 = r7.e
            long r5 = r7.f
            r0.c = r2
            java.lang.Object r7 = r7.x(r8, r5, r0)
            if (r7 != r4) goto L66
        L65:
            return r4
        L66:
            java.lang.Boolean r7 = java.lang.Boolean.TRUE
            return r7
        L69:
            java.lang.Boolean r7 = java.lang.Boolean.FALSE
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n7a.o(jt1):java.lang.Object");
    }

    @Override // defpackage.dla
    public final Object p(float f, c9b c9bVar) throws Throwable {
        if (this.g.length() > 0) {
            Object objT = t(this.g, (int) (f * r2.length()), this.f, c9bVar);
            if (objT == xx1.a) {
                return objT;
            }
        }
        return heb.a;
    }

    @Override // defpackage.dla
    public final Object q(yka ykaVar, kt1 kt1Var) {
        Object objG = this.d.g(new e27(ykaVar.a, ykaVar.b), kt1Var);
        return objG == xx1.a ? objG : heb.a;
    }

    @Override // defpackage.dla
    public final heb r(a9b a9bVar) {
        this.d.l();
        return heb.a;
    }

    @Override // defpackage.dla
    public final Object s(kt1 kt1Var) {
        TextToSpeech textToSpeech;
        zk zkVar = this.d;
        zkVar.f = true;
        zkVar.d.k(null);
        TextToSpeech textToSpeech2 = zkVar.c;
        if (textToSpeech2 != null && textToSpeech2.isSpeaking() && (textToSpeech = zkVar.c) != null) {
            gc1.I(textToSpeech.stop());
        }
        TextToSpeech textToSpeech3 = zkVar.c;
        if (textToSpeech3 != null) {
            textToSpeech3.shutdown();
        }
        zkVar.c = null;
        zkVar.l.clear();
        return heb.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:69:0x0174, code lost:
    
        if (x(r10, r1, r5) != r11) goto L71;
     */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    @Override // defpackage.dla
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object t(java.lang.String r17, int r18, long r19, defpackage.kt1 r21) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 378
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n7a.t(java.lang.String, int, long, kt1):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.dla
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object u(defpackage.kt1 r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.g7a
            if (r0 == 0) goto L13
            r0 = r6
            g7a r0 = (defpackage.g7a) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            g7a r0 = new g7a
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.a
            int r1 = r0.c
            heb r2 = defpackage.heb.a
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L2e
            if (r1 != r4) goto L28
            defpackage.e11.e0(r6)
            goto L64
        L28:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            gp.j(r5)
            return r3
        L2e:
            defpackage.e11.e0(r6)
            r0.c = r4
            zk r6 = r5.d
            r6.f = r4
            fr9 r0 = r6.d
            r0.k(r3)
            android.speech.tts.TextToSpeech r0 = r6.c
            if (r0 == 0) goto L51
            boolean r0 = r0.isSpeaking()
            if (r0 != r4) goto L51
            android.speech.tts.TextToSpeech r0 = r6.c
            if (r0 == 0) goto L51
            int r0 = r0.stop()
            defpackage.gc1.I(r0)
        L51:
            android.speech.tts.TextToSpeech r0 = r6.c
            if (r0 == 0) goto L58
            r0.shutdown()
        L58:
            r6.c = r3
            java.util.HashSet r6 = r6.l
            r6.clear()
            xx1 r6 = defpackage.xx1.a
            if (r2 != r6) goto L64
            return r6
        L64:
            r5.b = r3
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n7a.u(kt1):java.lang.Object");
    }

    @Override // defpackage.dla
    public final Object v(cla claVar, kt1 kt1Var) {
        Object objJ = this.d.j(new f27(claVar.a, claVar.b, claVar.c), kt1Var);
        return objJ == xx1.a ? objJ : heb.a;
    }

    @Override // defpackage.dla
    public final Object w(kt1 kt1Var) {
        zk zkVar = this.d;
        zkVar.h = false;
        TextToSpeech textToSpeech = zkVar.c;
        if (textToSpeech != null) {
            gc1.I(textToSpeech.stop());
        }
        zkVar.l.clear();
        return heb.a;
    }

    public final Object x(int i, long j, kt1 kt1Var) {
        Object objK;
        ArrayList arrayList = this.c;
        return (arrayList == null || (objK = this.d.k(arrayList, i, j, kt1Var)) != xx1.a) ? heb.a : objK;
    }

    @Override // defpackage.dla
    public final void e(List list) {
    }
}
