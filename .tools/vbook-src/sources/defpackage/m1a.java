package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class m1a implements jt1, yx1 {
    public int a = Integer.MIN_VALUE;
    public final /* synthetic */ n1a b;

    public m1a(n1a n1aVar) {
        this.b = n1aVar;
    }

    @Override // defpackage.yx1
    public final yx1 getCallerFrame() {
        jt1 jt1Var = up9.a;
        int i = this.a;
        n1a n1aVar = this.b;
        if (i == Integer.MIN_VALUE) {
            this.a = n1aVar.f;
        }
        int i2 = this.a;
        if (i2 < 0) {
            this.a = Integer.MIN_VALUE;
            jt1Var = null;
        } else {
            try {
                jt1 jt1Var2 = n1aVar.e[i2];
                if (jt1Var2 != null) {
                    this.a = i2 - 1;
                    jt1Var = jt1Var2;
                }
            } catch (Throwable unused) {
            }
        }
        if (jt1Var instanceof yx1) {
            return (yx1) jt1Var;
        }
        return null;
    }

    @Override // defpackage.jt1
    public final jx1 getContext() {
        n1a n1aVar = this.b;
        for (int i = n1aVar.f; -1 < i; i--) {
            jt1 jt1Var = n1aVar.e[i];
            if (jt1Var != this && jt1Var != null) {
                return jt1Var.getContext();
            }
        }
        gp.j("Not started");
        return null;
    }

    @Override // defpackage.jt1
    public final void resumeWith(Object obj) {
        Throwable thA = qm8.a(obj);
        n1a n1aVar = this.b;
        if (thA != null) {
            n1aVar.f(new pm8(thA));
        } else {
            n1aVar.e(false);
        }
    }
}
