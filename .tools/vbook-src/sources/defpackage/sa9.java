package defpackage;

import android.util.Log;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class sa9 {
    public final j69 a;
    public final n59 b;
    public final m59 c;
    public final iua d;
    public final h42 e;
    public final d38 f;
    public final jx1 g;
    public e59 h;
    public boolean i;
    public boolean j;
    public String k;

    public sa9(j69 j69Var, n59 n59Var, m59 m59Var, iua iuaVar, h42 h42Var, d38 d38Var, jx1 jx1Var) {
        j69Var.getClass();
        n59Var.getClass();
        m59Var.getClass();
        iuaVar.getClass();
        h42Var.getClass();
        d38Var.getClass();
        jx1Var.getClass();
        this.a = j69Var;
        this.b = n59Var;
        this.c = m59Var;
        this.d = iuaVar;
        this.e = h42Var;
        this.f = d38Var;
        this.g = jx1Var;
        this.k = "";
        ah1.J(wx1.b(jx1Var), null, null, new oa9(this, null, 0), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(defpackage.sa9 r5, java.lang.String r6, defpackage.pa9 r7, defpackage.jt1 r8) {
        /*
            Method dump skipped, instruction units count: 244
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sa9.a(sa9, java.lang.String, pa9, jt1):java.lang.Object");
    }

    public final void b() {
        this.i = false;
        if (this.h == null) {
            Log.d("FirebaseSessions", "App backgrounded, but local SessionData not initialized");
            return;
        }
        Log.d("FirebaseSessions", "App backgrounded on " + this.f.a());
        ah1.J(wx1.b(this.g), null, null, new oa9(this, null, 1), 3);
    }

    public final void c() {
        this.i = true;
        e59 e59Var = this.h;
        if (e59Var == null) {
            this.j = true;
            Log.d("FirebaseSessions", "App foregrounded, but local SessionData not initialized");
            return;
        }
        jt1 jt1Var = null;
        if (e59Var == null) {
            lc5.i0("localSessionData");
            throw null;
        }
        Log.d("FirebaseSessions", "App foregrounded on " + this.f.a());
        if (e(e59Var) || d(e59Var)) {
            ah1.J(wx1.b(this.g), null, null, new b69(this, e59Var, jt1Var, 3), 3);
        }
    }

    public final boolean d(e59 e59Var) {
        Map map = e59Var.c;
        boolean z = true;
        d38 d38Var = this.f;
        if (map == null) {
            Log.d("FirebaseSessions", "No process data for " + d38Var.a());
            return true;
        }
        d38Var.getClass();
        b38 b38Var = (b38) map.get(d38Var.a());
        if (b38Var != null && b38Var.a == d38Var.c && lc5.Q(b38Var.b, (String) d38Var.d.getValue())) {
            z = false;
        }
        if (z) {
            Log.d("FirebaseSessions", "Process " + d38Var.a() + " is stale");
        }
        return z;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean e(defpackage.e59 r11) {
        /*
            r10 = this;
            uta r0 = r11.b
            i59 r11 = r11.a
            java.lang.String r1 = "Session "
            java.lang.String r2 = "FirebaseSessions"
            r3 = 0
            if (r0 == 0) goto L77
            iua r4 = r10.d
            r4.getClass()
            uta r4 = defpackage.iua.a()
            mc8 r5 = defpackage.k63.b
            long r4 = r4.a
            long r6 = r0.a
            long r4 = r4 - r6
            o63 r0 = defpackage.o63.MILLISECONDS
            long r4 = defpackage.lx1.A0(r4, r0)
            j69 r10 = r10.a
            i89 r0 = r10.a
            k63 r0 = r0.c()
            r6 = 0
            if (r0 == 0) goto L3a
            long r8 = r0.a
            int r0 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r0 <= 0) goto L3a
            boolean r0 = defpackage.k63.g(r8)
            if (r0 != 0) goto L3a
            goto L57
        L3a:
            i89 r10 = r10.b
            k63 r10 = r10.c()
            if (r10 == 0) goto L4f
            long r8 = r10.a
            int r10 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r10 <= 0) goto L4f
            boolean r10 = defpackage.k63.g(r8)
            if (r10 != 0) goto L4f
            goto L57
        L4f:
            r10 = 30
            o63 r0 = defpackage.o63.MINUTES
            long r8 = defpackage.lx1.z0(r10, r0)
        L57:
            int r10 = defpackage.k63.c(r4, r8)
            if (r10 <= 0) goto L5e
            r3 = 1
        L5e:
            if (r3 == 0) goto L76
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>(r1)
            java.lang.String r11 = r11.a
            r10.append(r11)
            java.lang.String r11 = " is expired"
            r10.append(r11)
            java.lang.String r10 = r10.toString()
            android.util.Log.d(r2, r10)
        L76:
            return r3
        L77:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>(r1)
            java.lang.String r11 = r11.a
            r10.append(r11)
            java.lang.String r11 = " has not backgrounded yet"
            r10.append(r11)
            java.lang.String r10 = r10.toString()
            android.util.Log.d(r2, r10)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sa9.e(e59):boolean");
    }
}
