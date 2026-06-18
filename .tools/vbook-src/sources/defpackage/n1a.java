package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class n1a extends ct7 {
    public final List b;
    public final m1a c;
    public Object d;
    public final jt1[] e;
    public int f;
    public int s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n1a(Object obj, Object obj2, List list) {
        super(obj2);
        obj.getClass();
        obj2.getClass();
        list.getClass();
        this.b = list;
        this.c = new m1a(this);
        this.d = obj;
        this.e = new jt1[list.size()];
        this.f = -1;
    }

    @Override // defpackage.ct7
    public final Object a(Object obj, kt1 kt1Var) {
        this.s = 0;
        if (this.b.size() == 0) {
            return obj;
        }
        obj.getClass();
        this.d = obj;
        if (this.f < 0) {
            return c(kt1Var);
        }
        gp.j("Already started");
        return null;
    }

    @Override // defpackage.ct7
    public final Object b() {
        return this.d;
    }

    @Override // defpackage.ct7
    public final Object c(jt1 jt1Var) {
        Object obj;
        int i = this.s;
        int size = this.b.size();
        xx1 xx1Var = xx1.a;
        if (i == size) {
            obj = this.d;
        } else {
            jt1Var.getClass();
            int i2 = this.f + 1;
            this.f = i2;
            jt1[] jt1VarArr = this.e;
            jt1VarArr[i2] = jt1Var;
            if (e(true)) {
                int i3 = this.f;
                if (i3 < 0) {
                    gp.j("No more continuations to resume");
                    return null;
                }
                this.f = i3 - 1;
                jt1VarArr[i3] = null;
                obj = this.d;
            } else {
                obj = xx1Var;
            }
        }
        if (obj == xx1Var) {
            jt1Var.getClass();
        }
        return obj;
    }

    @Override // defpackage.ct7
    public final Object d(jt1 jt1Var, Object obj) {
        obj.getClass();
        this.d = obj;
        return c(jt1Var);
    }

    public final boolean e(boolean z) {
        zb4 zb4Var;
        Object obj;
        m1a m1aVar;
        do {
            int i = this.s;
            List list = this.b;
            if (i == list.size()) {
                if (z) {
                    return true;
                }
                f(this.d);
                return false;
            }
            this.s = i + 1;
            zb4Var = (zb4) list.get(i);
            try {
                obj = this.d;
                m1aVar = this.c;
                zb4Var.getClass();
                obj.getClass();
                m1aVar.getClass();
                fw.F(3, zb4Var);
            } catch (Throwable th) {
                f(new pm8(th));
                return false;
            }
        } while (zb4Var.c(this, obj, m1aVar) != xx1.a);
        return false;
    }

    public final void f(Object obj) {
        int i = this.f;
        if (i < 0) {
            gp.j("No more continuations to resume");
            return;
        }
        jt1[] jt1VarArr = this.e;
        jt1 jt1VarJ = jt1VarArr[i];
        jt1VarJ.getClass();
        int i2 = this.f;
        this.f = i2 - 1;
        jt1VarArr[i2] = null;
        lt1 lt1Var = (lt1) jt1VarJ.getContext().get(g83.d);
        if (!(lt1Var instanceof nx1) || ((nx1) lt1Var).R(jt1VarJ.getContext())) {
            jt1VarJ = bx1.J(jt1VarJ);
        }
        Throwable thA = qm8.a(obj);
        if (thA == null) {
            jt1VarJ.resumeWith(obj);
        } else {
            try {
                thA.getCause();
            } catch (Throwable unused) {
            }
            jt1VarJ.resumeWith(new pm8(thA));
        }
    }

    @Override // defpackage.vx1
    public final jx1 q() {
        return this.c.getContext();
    }
}
