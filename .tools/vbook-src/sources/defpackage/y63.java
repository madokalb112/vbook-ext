package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class y63 {
    public String a;
    public kb4 b;
    public kb4 c;
    public boolean d;
    public kb4 e;
    public kb4 f;
    public kb4 g;
    public kb4 h;
    public kb4 i;
    public kb4 j;

    public final z63 a() {
        kb4 kb4Var = this.f;
        if (kb4Var == null && this.g != null) {
            gp.k(xv5.p("Color ", this.a, " has secondBackground defined, but background is not defined."));
            return null;
        }
        if (kb4Var == null && this.h != null) {
            gp.k(xv5.p("Color ", this.a, " has contrastCurve defined, but background is not defined."));
            return null;
        }
        if (kb4Var != null && this.h == null) {
            gp.k(xv5.p("Color ", this.a, " has background defined, but contrastCurve is not defined."));
            return null;
        }
        kb4 gq2Var = this.c;
        if (gq2Var == null) {
            gq2Var = kb4Var == null ? new gq2(15) : new mj(5, kb4Var);
        }
        String str = this.a;
        str.getClass();
        kb4 kb4Var2 = this.b;
        kb4Var2.getClass();
        return new z63(str, kb4Var2, gq2Var, this.d, this.e, this.f, this.g, this.h, this.i, this.j);
    }

    public final y63 b(final z63 z63Var) {
        String str = this.a;
        String str2 = z63Var.a;
        boolean zQ = lc5.Q(str, str2);
        id1 id1Var = id1.d;
        if (!zQ) {
            w58.n(j39.q("Attempting to extend color ", this.a, " with color ", str2, " of different name for spec version "), id1Var, ".");
            return null;
        }
        boolean z = this.d;
        boolean z2 = z63Var.d;
        String str3 = this.a;
        if (z != z2) {
            String str4 = z ? "background" : "foreground";
            String str5 = z2 ? "background" : "foreground";
            StringBuilder sbQ = j39.q("Attempting to extend color ", str3, " as a ", str4, " with color ");
            j39.y(sbQ, str2, " as a ", str5, " for spec version ");
            w58.n(sbQ, id1Var, ".");
            return null;
        }
        y63 y63Var = new y63();
        str3.getClass();
        y63Var.a = str3;
        y63Var.d = this.d;
        final int i = 0;
        y63Var.b = new kb4() { // from class: x63
            @Override // defpackage.kb4
            public final Object invoke(Object obj) {
                sza szaVar;
                int i2 = i;
                y63 y63Var2 = this;
                z63 z63Var2 = z63Var;
                id1 id1Var2 = id1.d;
                switch (i2) {
                    case 0:
                        kb4 kb4Var = z63Var2.b;
                        g73 g73Var = (g73) obj;
                        g73Var.getClass();
                        kb4 kb4Var2 = g73Var.l == id1Var2 ? kb4Var : y63Var2.b;
                        return (kb4Var2 == null || (szaVar = (sza) kb4Var2.invoke(g73Var)) == null) ? (sza) kb4Var.invoke(g73Var) : szaVar;
                    case 1:
                        kb4 kb4Var3 = z63Var2.c;
                        g73 g73Var2 = (g73) obj;
                        g73Var2.getClass();
                        kb4 kb4Var4 = g73Var2.l == id1Var2 ? kb4Var3 : y63Var2.c;
                        return Double.valueOf(((Number) (kb4Var4 != null ? kb4Var4.invoke(g73Var2) : kb4Var3.invoke(g73Var2))).doubleValue());
                    case 2:
                        g73 g73Var3 = (g73) obj;
                        g73Var3.getClass();
                        kb4 kb4Var5 = g73Var3.l == id1Var2 ? z63Var2.e : y63Var2.e;
                        return kb4Var5 != null ? (Double) kb4Var5.invoke(g73Var3) : Double.valueOf(1.0d);
                    case 3:
                        g73 g73Var4 = (g73) obj;
                        g73Var4.getClass();
                        kb4 kb4Var6 = g73Var4.l == id1Var2 ? z63Var2.f : y63Var2.f;
                        if (kb4Var6 != null) {
                            return (z63) kb4Var6.invoke(g73Var4);
                        }
                        return null;
                    case 4:
                        g73 g73Var5 = (g73) obj;
                        g73Var5.getClass();
                        kb4 kb4Var7 = g73Var5.l == id1Var2 ? z63Var2.g : y63Var2.g;
                        if (kb4Var7 != null) {
                            return (z63) kb4Var7.invoke(g73Var5);
                        }
                        return null;
                    case 5:
                        g73 g73Var6 = (g73) obj;
                        g73Var6.getClass();
                        kb4 kb4Var8 = g73Var6.l == id1Var2 ? z63Var2.h : y63Var2.h;
                        if (kb4Var8 != null) {
                            return (ru1) kb4Var8.invoke(g73Var6);
                        }
                        return null;
                    case 6:
                        g73 g73Var7 = (g73) obj;
                        g73Var7.getClass();
                        kb4 kb4Var9 = g73Var7.l == id1Var2 ? z63Var2.i : y63Var2.i;
                        if (kb4Var9 != null) {
                            return (vza) kb4Var9.invoke(g73Var7);
                        }
                        return null;
                    default:
                        g73 g73Var8 = (g73) obj;
                        g73Var8.getClass();
                        kb4 kb4Var10 = g73Var8.l == id1Var2 ? z63Var2.j : y63Var2.j;
                        if (kb4Var10 != null) {
                            return (Double) kb4Var10.invoke(g73Var8);
                        }
                        return null;
                }
            }
        };
        final int i2 = 1;
        y63Var.c = new kb4() { // from class: x63
            @Override // defpackage.kb4
            public final Object invoke(Object obj) {
                sza szaVar;
                int i22 = i2;
                y63 y63Var2 = this;
                z63 z63Var2 = z63Var;
                id1 id1Var2 = id1.d;
                switch (i22) {
                    case 0:
                        kb4 kb4Var = z63Var2.b;
                        g73 g73Var = (g73) obj;
                        g73Var.getClass();
                        kb4 kb4Var2 = g73Var.l == id1Var2 ? kb4Var : y63Var2.b;
                        return (kb4Var2 == null || (szaVar = (sza) kb4Var2.invoke(g73Var)) == null) ? (sza) kb4Var.invoke(g73Var) : szaVar;
                    case 1:
                        kb4 kb4Var3 = z63Var2.c;
                        g73 g73Var2 = (g73) obj;
                        g73Var2.getClass();
                        kb4 kb4Var4 = g73Var2.l == id1Var2 ? kb4Var3 : y63Var2.c;
                        return Double.valueOf(((Number) (kb4Var4 != null ? kb4Var4.invoke(g73Var2) : kb4Var3.invoke(g73Var2))).doubleValue());
                    case 2:
                        g73 g73Var3 = (g73) obj;
                        g73Var3.getClass();
                        kb4 kb4Var5 = g73Var3.l == id1Var2 ? z63Var2.e : y63Var2.e;
                        return kb4Var5 != null ? (Double) kb4Var5.invoke(g73Var3) : Double.valueOf(1.0d);
                    case 3:
                        g73 g73Var4 = (g73) obj;
                        g73Var4.getClass();
                        kb4 kb4Var6 = g73Var4.l == id1Var2 ? z63Var2.f : y63Var2.f;
                        if (kb4Var6 != null) {
                            return (z63) kb4Var6.invoke(g73Var4);
                        }
                        return null;
                    case 4:
                        g73 g73Var5 = (g73) obj;
                        g73Var5.getClass();
                        kb4 kb4Var7 = g73Var5.l == id1Var2 ? z63Var2.g : y63Var2.g;
                        if (kb4Var7 != null) {
                            return (z63) kb4Var7.invoke(g73Var5);
                        }
                        return null;
                    case 5:
                        g73 g73Var6 = (g73) obj;
                        g73Var6.getClass();
                        kb4 kb4Var8 = g73Var6.l == id1Var2 ? z63Var2.h : y63Var2.h;
                        if (kb4Var8 != null) {
                            return (ru1) kb4Var8.invoke(g73Var6);
                        }
                        return null;
                    case 6:
                        g73 g73Var7 = (g73) obj;
                        g73Var7.getClass();
                        kb4 kb4Var9 = g73Var7.l == id1Var2 ? z63Var2.i : y63Var2.i;
                        if (kb4Var9 != null) {
                            return (vza) kb4Var9.invoke(g73Var7);
                        }
                        return null;
                    default:
                        g73 g73Var8 = (g73) obj;
                        g73Var8.getClass();
                        kb4 kb4Var10 = g73Var8.l == id1Var2 ? z63Var2.j : y63Var2.j;
                        if (kb4Var10 != null) {
                            return (Double) kb4Var10.invoke(g73Var8);
                        }
                        return null;
                }
            }
        };
        final int i3 = 2;
        y63Var.e = new kb4() { // from class: x63
            @Override // defpackage.kb4
            public final Object invoke(Object obj) {
                sza szaVar;
                int i22 = i3;
                y63 y63Var2 = this;
                z63 z63Var2 = z63Var;
                id1 id1Var2 = id1.d;
                switch (i22) {
                    case 0:
                        kb4 kb4Var = z63Var2.b;
                        g73 g73Var = (g73) obj;
                        g73Var.getClass();
                        kb4 kb4Var2 = g73Var.l == id1Var2 ? kb4Var : y63Var2.b;
                        return (kb4Var2 == null || (szaVar = (sza) kb4Var2.invoke(g73Var)) == null) ? (sza) kb4Var.invoke(g73Var) : szaVar;
                    case 1:
                        kb4 kb4Var3 = z63Var2.c;
                        g73 g73Var2 = (g73) obj;
                        g73Var2.getClass();
                        kb4 kb4Var4 = g73Var2.l == id1Var2 ? kb4Var3 : y63Var2.c;
                        return Double.valueOf(((Number) (kb4Var4 != null ? kb4Var4.invoke(g73Var2) : kb4Var3.invoke(g73Var2))).doubleValue());
                    case 2:
                        g73 g73Var3 = (g73) obj;
                        g73Var3.getClass();
                        kb4 kb4Var5 = g73Var3.l == id1Var2 ? z63Var2.e : y63Var2.e;
                        return kb4Var5 != null ? (Double) kb4Var5.invoke(g73Var3) : Double.valueOf(1.0d);
                    case 3:
                        g73 g73Var4 = (g73) obj;
                        g73Var4.getClass();
                        kb4 kb4Var6 = g73Var4.l == id1Var2 ? z63Var2.f : y63Var2.f;
                        if (kb4Var6 != null) {
                            return (z63) kb4Var6.invoke(g73Var4);
                        }
                        return null;
                    case 4:
                        g73 g73Var5 = (g73) obj;
                        g73Var5.getClass();
                        kb4 kb4Var7 = g73Var5.l == id1Var2 ? z63Var2.g : y63Var2.g;
                        if (kb4Var7 != null) {
                            return (z63) kb4Var7.invoke(g73Var5);
                        }
                        return null;
                    case 5:
                        g73 g73Var6 = (g73) obj;
                        g73Var6.getClass();
                        kb4 kb4Var8 = g73Var6.l == id1Var2 ? z63Var2.h : y63Var2.h;
                        if (kb4Var8 != null) {
                            return (ru1) kb4Var8.invoke(g73Var6);
                        }
                        return null;
                    case 6:
                        g73 g73Var7 = (g73) obj;
                        g73Var7.getClass();
                        kb4 kb4Var9 = g73Var7.l == id1Var2 ? z63Var2.i : y63Var2.i;
                        if (kb4Var9 != null) {
                            return (vza) kb4Var9.invoke(g73Var7);
                        }
                        return null;
                    default:
                        g73 g73Var8 = (g73) obj;
                        g73Var8.getClass();
                        kb4 kb4Var10 = g73Var8.l == id1Var2 ? z63Var2.j : y63Var2.j;
                        if (kb4Var10 != null) {
                            return (Double) kb4Var10.invoke(g73Var8);
                        }
                        return null;
                }
            }
        };
        final int i4 = 3;
        y63Var.f = new kb4() { // from class: x63
            @Override // defpackage.kb4
            public final Object invoke(Object obj) {
                sza szaVar;
                int i22 = i4;
                y63 y63Var2 = this;
                z63 z63Var2 = z63Var;
                id1 id1Var2 = id1.d;
                switch (i22) {
                    case 0:
                        kb4 kb4Var = z63Var2.b;
                        g73 g73Var = (g73) obj;
                        g73Var.getClass();
                        kb4 kb4Var2 = g73Var.l == id1Var2 ? kb4Var : y63Var2.b;
                        return (kb4Var2 == null || (szaVar = (sza) kb4Var2.invoke(g73Var)) == null) ? (sza) kb4Var.invoke(g73Var) : szaVar;
                    case 1:
                        kb4 kb4Var3 = z63Var2.c;
                        g73 g73Var2 = (g73) obj;
                        g73Var2.getClass();
                        kb4 kb4Var4 = g73Var2.l == id1Var2 ? kb4Var3 : y63Var2.c;
                        return Double.valueOf(((Number) (kb4Var4 != null ? kb4Var4.invoke(g73Var2) : kb4Var3.invoke(g73Var2))).doubleValue());
                    case 2:
                        g73 g73Var3 = (g73) obj;
                        g73Var3.getClass();
                        kb4 kb4Var5 = g73Var3.l == id1Var2 ? z63Var2.e : y63Var2.e;
                        return kb4Var5 != null ? (Double) kb4Var5.invoke(g73Var3) : Double.valueOf(1.0d);
                    case 3:
                        g73 g73Var4 = (g73) obj;
                        g73Var4.getClass();
                        kb4 kb4Var6 = g73Var4.l == id1Var2 ? z63Var2.f : y63Var2.f;
                        if (kb4Var6 != null) {
                            return (z63) kb4Var6.invoke(g73Var4);
                        }
                        return null;
                    case 4:
                        g73 g73Var5 = (g73) obj;
                        g73Var5.getClass();
                        kb4 kb4Var7 = g73Var5.l == id1Var2 ? z63Var2.g : y63Var2.g;
                        if (kb4Var7 != null) {
                            return (z63) kb4Var7.invoke(g73Var5);
                        }
                        return null;
                    case 5:
                        g73 g73Var6 = (g73) obj;
                        g73Var6.getClass();
                        kb4 kb4Var8 = g73Var6.l == id1Var2 ? z63Var2.h : y63Var2.h;
                        if (kb4Var8 != null) {
                            return (ru1) kb4Var8.invoke(g73Var6);
                        }
                        return null;
                    case 6:
                        g73 g73Var7 = (g73) obj;
                        g73Var7.getClass();
                        kb4 kb4Var9 = g73Var7.l == id1Var2 ? z63Var2.i : y63Var2.i;
                        if (kb4Var9 != null) {
                            return (vza) kb4Var9.invoke(g73Var7);
                        }
                        return null;
                    default:
                        g73 g73Var8 = (g73) obj;
                        g73Var8.getClass();
                        kb4 kb4Var10 = g73Var8.l == id1Var2 ? z63Var2.j : y63Var2.j;
                        if (kb4Var10 != null) {
                            return (Double) kb4Var10.invoke(g73Var8);
                        }
                        return null;
                }
            }
        };
        final int i5 = 4;
        y63Var.g = new kb4() { // from class: x63
            @Override // defpackage.kb4
            public final Object invoke(Object obj) {
                sza szaVar;
                int i22 = i5;
                y63 y63Var2 = this;
                z63 z63Var2 = z63Var;
                id1 id1Var2 = id1.d;
                switch (i22) {
                    case 0:
                        kb4 kb4Var = z63Var2.b;
                        g73 g73Var = (g73) obj;
                        g73Var.getClass();
                        kb4 kb4Var2 = g73Var.l == id1Var2 ? kb4Var : y63Var2.b;
                        return (kb4Var2 == null || (szaVar = (sza) kb4Var2.invoke(g73Var)) == null) ? (sza) kb4Var.invoke(g73Var) : szaVar;
                    case 1:
                        kb4 kb4Var3 = z63Var2.c;
                        g73 g73Var2 = (g73) obj;
                        g73Var2.getClass();
                        kb4 kb4Var4 = g73Var2.l == id1Var2 ? kb4Var3 : y63Var2.c;
                        return Double.valueOf(((Number) (kb4Var4 != null ? kb4Var4.invoke(g73Var2) : kb4Var3.invoke(g73Var2))).doubleValue());
                    case 2:
                        g73 g73Var3 = (g73) obj;
                        g73Var3.getClass();
                        kb4 kb4Var5 = g73Var3.l == id1Var2 ? z63Var2.e : y63Var2.e;
                        return kb4Var5 != null ? (Double) kb4Var5.invoke(g73Var3) : Double.valueOf(1.0d);
                    case 3:
                        g73 g73Var4 = (g73) obj;
                        g73Var4.getClass();
                        kb4 kb4Var6 = g73Var4.l == id1Var2 ? z63Var2.f : y63Var2.f;
                        if (kb4Var6 != null) {
                            return (z63) kb4Var6.invoke(g73Var4);
                        }
                        return null;
                    case 4:
                        g73 g73Var5 = (g73) obj;
                        g73Var5.getClass();
                        kb4 kb4Var7 = g73Var5.l == id1Var2 ? z63Var2.g : y63Var2.g;
                        if (kb4Var7 != null) {
                            return (z63) kb4Var7.invoke(g73Var5);
                        }
                        return null;
                    case 5:
                        g73 g73Var6 = (g73) obj;
                        g73Var6.getClass();
                        kb4 kb4Var8 = g73Var6.l == id1Var2 ? z63Var2.h : y63Var2.h;
                        if (kb4Var8 != null) {
                            return (ru1) kb4Var8.invoke(g73Var6);
                        }
                        return null;
                    case 6:
                        g73 g73Var7 = (g73) obj;
                        g73Var7.getClass();
                        kb4 kb4Var9 = g73Var7.l == id1Var2 ? z63Var2.i : y63Var2.i;
                        if (kb4Var9 != null) {
                            return (vza) kb4Var9.invoke(g73Var7);
                        }
                        return null;
                    default:
                        g73 g73Var8 = (g73) obj;
                        g73Var8.getClass();
                        kb4 kb4Var10 = g73Var8.l == id1Var2 ? z63Var2.j : y63Var2.j;
                        if (kb4Var10 != null) {
                            return (Double) kb4Var10.invoke(g73Var8);
                        }
                        return null;
                }
            }
        };
        final int i6 = 5;
        y63Var.h = new kb4() { // from class: x63
            @Override // defpackage.kb4
            public final Object invoke(Object obj) {
                sza szaVar;
                int i22 = i6;
                y63 y63Var2 = this;
                z63 z63Var2 = z63Var;
                id1 id1Var2 = id1.d;
                switch (i22) {
                    case 0:
                        kb4 kb4Var = z63Var2.b;
                        g73 g73Var = (g73) obj;
                        g73Var.getClass();
                        kb4 kb4Var2 = g73Var.l == id1Var2 ? kb4Var : y63Var2.b;
                        return (kb4Var2 == null || (szaVar = (sza) kb4Var2.invoke(g73Var)) == null) ? (sza) kb4Var.invoke(g73Var) : szaVar;
                    case 1:
                        kb4 kb4Var3 = z63Var2.c;
                        g73 g73Var2 = (g73) obj;
                        g73Var2.getClass();
                        kb4 kb4Var4 = g73Var2.l == id1Var2 ? kb4Var3 : y63Var2.c;
                        return Double.valueOf(((Number) (kb4Var4 != null ? kb4Var4.invoke(g73Var2) : kb4Var3.invoke(g73Var2))).doubleValue());
                    case 2:
                        g73 g73Var3 = (g73) obj;
                        g73Var3.getClass();
                        kb4 kb4Var5 = g73Var3.l == id1Var2 ? z63Var2.e : y63Var2.e;
                        return kb4Var5 != null ? (Double) kb4Var5.invoke(g73Var3) : Double.valueOf(1.0d);
                    case 3:
                        g73 g73Var4 = (g73) obj;
                        g73Var4.getClass();
                        kb4 kb4Var6 = g73Var4.l == id1Var2 ? z63Var2.f : y63Var2.f;
                        if (kb4Var6 != null) {
                            return (z63) kb4Var6.invoke(g73Var4);
                        }
                        return null;
                    case 4:
                        g73 g73Var5 = (g73) obj;
                        g73Var5.getClass();
                        kb4 kb4Var7 = g73Var5.l == id1Var2 ? z63Var2.g : y63Var2.g;
                        if (kb4Var7 != null) {
                            return (z63) kb4Var7.invoke(g73Var5);
                        }
                        return null;
                    case 5:
                        g73 g73Var6 = (g73) obj;
                        g73Var6.getClass();
                        kb4 kb4Var8 = g73Var6.l == id1Var2 ? z63Var2.h : y63Var2.h;
                        if (kb4Var8 != null) {
                            return (ru1) kb4Var8.invoke(g73Var6);
                        }
                        return null;
                    case 6:
                        g73 g73Var7 = (g73) obj;
                        g73Var7.getClass();
                        kb4 kb4Var9 = g73Var7.l == id1Var2 ? z63Var2.i : y63Var2.i;
                        if (kb4Var9 != null) {
                            return (vza) kb4Var9.invoke(g73Var7);
                        }
                        return null;
                    default:
                        g73 g73Var8 = (g73) obj;
                        g73Var8.getClass();
                        kb4 kb4Var10 = g73Var8.l == id1Var2 ? z63Var2.j : y63Var2.j;
                        if (kb4Var10 != null) {
                            return (Double) kb4Var10.invoke(g73Var8);
                        }
                        return null;
                }
            }
        };
        final int i7 = 6;
        y63Var.i = new kb4() { // from class: x63
            @Override // defpackage.kb4
            public final Object invoke(Object obj) {
                sza szaVar;
                int i22 = i7;
                y63 y63Var2 = this;
                z63 z63Var2 = z63Var;
                id1 id1Var2 = id1.d;
                switch (i22) {
                    case 0:
                        kb4 kb4Var = z63Var2.b;
                        g73 g73Var = (g73) obj;
                        g73Var.getClass();
                        kb4 kb4Var2 = g73Var.l == id1Var2 ? kb4Var : y63Var2.b;
                        return (kb4Var2 == null || (szaVar = (sza) kb4Var2.invoke(g73Var)) == null) ? (sza) kb4Var.invoke(g73Var) : szaVar;
                    case 1:
                        kb4 kb4Var3 = z63Var2.c;
                        g73 g73Var2 = (g73) obj;
                        g73Var2.getClass();
                        kb4 kb4Var4 = g73Var2.l == id1Var2 ? kb4Var3 : y63Var2.c;
                        return Double.valueOf(((Number) (kb4Var4 != null ? kb4Var4.invoke(g73Var2) : kb4Var3.invoke(g73Var2))).doubleValue());
                    case 2:
                        g73 g73Var3 = (g73) obj;
                        g73Var3.getClass();
                        kb4 kb4Var5 = g73Var3.l == id1Var2 ? z63Var2.e : y63Var2.e;
                        return kb4Var5 != null ? (Double) kb4Var5.invoke(g73Var3) : Double.valueOf(1.0d);
                    case 3:
                        g73 g73Var4 = (g73) obj;
                        g73Var4.getClass();
                        kb4 kb4Var6 = g73Var4.l == id1Var2 ? z63Var2.f : y63Var2.f;
                        if (kb4Var6 != null) {
                            return (z63) kb4Var6.invoke(g73Var4);
                        }
                        return null;
                    case 4:
                        g73 g73Var5 = (g73) obj;
                        g73Var5.getClass();
                        kb4 kb4Var7 = g73Var5.l == id1Var2 ? z63Var2.g : y63Var2.g;
                        if (kb4Var7 != null) {
                            return (z63) kb4Var7.invoke(g73Var5);
                        }
                        return null;
                    case 5:
                        g73 g73Var6 = (g73) obj;
                        g73Var6.getClass();
                        kb4 kb4Var8 = g73Var6.l == id1Var2 ? z63Var2.h : y63Var2.h;
                        if (kb4Var8 != null) {
                            return (ru1) kb4Var8.invoke(g73Var6);
                        }
                        return null;
                    case 6:
                        g73 g73Var7 = (g73) obj;
                        g73Var7.getClass();
                        kb4 kb4Var9 = g73Var7.l == id1Var2 ? z63Var2.i : y63Var2.i;
                        if (kb4Var9 != null) {
                            return (vza) kb4Var9.invoke(g73Var7);
                        }
                        return null;
                    default:
                        g73 g73Var8 = (g73) obj;
                        g73Var8.getClass();
                        kb4 kb4Var10 = g73Var8.l == id1Var2 ? z63Var2.j : y63Var2.j;
                        if (kb4Var10 != null) {
                            return (Double) kb4Var10.invoke(g73Var8);
                        }
                        return null;
                }
            }
        };
        final int i8 = 7;
        y63Var.j = new kb4() { // from class: x63
            @Override // defpackage.kb4
            public final Object invoke(Object obj) {
                sza szaVar;
                int i22 = i8;
                y63 y63Var2 = this;
                z63 z63Var2 = z63Var;
                id1 id1Var2 = id1.d;
                switch (i22) {
                    case 0:
                        kb4 kb4Var = z63Var2.b;
                        g73 g73Var = (g73) obj;
                        g73Var.getClass();
                        kb4 kb4Var2 = g73Var.l == id1Var2 ? kb4Var : y63Var2.b;
                        return (kb4Var2 == null || (szaVar = (sza) kb4Var2.invoke(g73Var)) == null) ? (sza) kb4Var.invoke(g73Var) : szaVar;
                    case 1:
                        kb4 kb4Var3 = z63Var2.c;
                        g73 g73Var2 = (g73) obj;
                        g73Var2.getClass();
                        kb4 kb4Var4 = g73Var2.l == id1Var2 ? kb4Var3 : y63Var2.c;
                        return Double.valueOf(((Number) (kb4Var4 != null ? kb4Var4.invoke(g73Var2) : kb4Var3.invoke(g73Var2))).doubleValue());
                    case 2:
                        g73 g73Var3 = (g73) obj;
                        g73Var3.getClass();
                        kb4 kb4Var5 = g73Var3.l == id1Var2 ? z63Var2.e : y63Var2.e;
                        return kb4Var5 != null ? (Double) kb4Var5.invoke(g73Var3) : Double.valueOf(1.0d);
                    case 3:
                        g73 g73Var4 = (g73) obj;
                        g73Var4.getClass();
                        kb4 kb4Var6 = g73Var4.l == id1Var2 ? z63Var2.f : y63Var2.f;
                        if (kb4Var6 != null) {
                            return (z63) kb4Var6.invoke(g73Var4);
                        }
                        return null;
                    case 4:
                        g73 g73Var5 = (g73) obj;
                        g73Var5.getClass();
                        kb4 kb4Var7 = g73Var5.l == id1Var2 ? z63Var2.g : y63Var2.g;
                        if (kb4Var7 != null) {
                            return (z63) kb4Var7.invoke(g73Var5);
                        }
                        return null;
                    case 5:
                        g73 g73Var6 = (g73) obj;
                        g73Var6.getClass();
                        kb4 kb4Var8 = g73Var6.l == id1Var2 ? z63Var2.h : y63Var2.h;
                        if (kb4Var8 != null) {
                            return (ru1) kb4Var8.invoke(g73Var6);
                        }
                        return null;
                    case 6:
                        g73 g73Var7 = (g73) obj;
                        g73Var7.getClass();
                        kb4 kb4Var9 = g73Var7.l == id1Var2 ? z63Var2.i : y63Var2.i;
                        if (kb4Var9 != null) {
                            return (vza) kb4Var9.invoke(g73Var7);
                        }
                        return null;
                    default:
                        g73 g73Var8 = (g73) obj;
                        g73Var8.getClass();
                        kb4 kb4Var10 = g73Var8.l == id1Var2 ? z63Var2.j : y63Var2.j;
                        if (kb4Var10 != null) {
                            return (Double) kb4Var10.invoke(g73Var8);
                        }
                        return null;
                }
            }
        };
        return y63Var;
    }
}
