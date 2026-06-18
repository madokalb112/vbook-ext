package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class kb9 {
    public final boolean a;
    public final ob b;
    public final pn2 c;

    public kb9(boolean z, boolean z2, pn2 pn2Var, kb4 kb4Var) {
        ob obVar;
        pn2Var.getClass();
        kb4Var.getClass();
        this.a = z2;
        final int i = 0;
        if (z) {
            obVar = new ob(new ax8(9), new ib4(this) { // from class: jb9
                public final /* synthetic */ kb9 b;

                {
                    this.b = this;
                }

                @Override // defpackage.ib4
                public final Object invoke() {
                    int i2 = i;
                    kb9 kb9Var = this.b;
                    switch (i2) {
                        case 0:
                            pn2 pn2Var2 = kb9Var.c;
                            if (pn2Var2 == null) {
                                gp.l("SheetState did not have a density attached. Are you using SheetState with BottomSheetScaffold or ModalBottomSheet component?");
                            }
                            break;
                        default:
                            pn2 pn2Var3 = kb9Var.c;
                            if (pn2Var3 == null) {
                                gp.l("SheetState did not have a density attached. Are you using SheetState with BottomSheetScaffold or ModalBottomSheet component?");
                            }
                            break;
                    }
                    return null;
                }
            }, new p9b(256, (a83) null, 6), kb4Var);
        } else {
            final int i2 = 1;
            obVar = new ob(new hy7(this, 21), new ib4(this) { // from class: jb9
                public final /* synthetic */ kb9 b;

                {
                    this.b = this;
                }

                @Override // defpackage.ib4
                public final Object invoke() {
                    int i22 = i2;
                    kb9 kb9Var = this.b;
                    switch (i22) {
                        case 0:
                            pn2 pn2Var2 = kb9Var.c;
                            if (pn2Var2 == null) {
                                gp.l("SheetState did not have a density attached. Are you using SheetState with BottomSheetScaffold or ModalBottomSheet component?");
                            }
                            break;
                        default:
                            pn2 pn2Var3 = kb9Var.c;
                            if (pn2Var3 == null) {
                                gp.l("SheetState did not have a density attached. Are you using SheetState with BottomSheetScaffold or ModalBottomSheet component?");
                            }
                            break;
                    }
                    return null;
                }
            }, ah1.a0(350, 0, new a22(0.2f, 0.9f, 0.42f, 1.0f), 2), kb4Var);
        }
        this.b = obVar;
        this.c = pn2Var;
    }

    public static Object a(kb9 kb9Var, lb9 lb9Var, o1a o1aVar) {
        Object objV = ah1.v(kb9Var.b, lb9Var, kb9Var.b.k.h(), o1aVar);
        return objV == xx1.a ? objV : heb.a;
    }

    public final lb9 b() {
        return (lb9) this.b.g.getValue();
    }

    public final boolean c() {
        h86 h86VarD = this.b.d();
        return h86VarD.a.containsKey(lb9.c);
    }

    public final lb9 d() {
        return (lb9) this.b.h.getValue();
    }

    public final Object e(o1a o1aVar) {
        Object objA = a(this, lb9.a, o1aVar);
        return objA == xx1.a ? objA : heb.a;
    }

    public final boolean f() {
        return this.b.g.getValue() != lb9.a;
    }

    public final Object g(o1a o1aVar) {
        if (this.a) {
            gp.j("Attempted to animate to partial expanded when skipPartiallyExpanded was enabled. Set skipPartiallyExpanded to false to use this function.");
            return null;
        }
        Object objA = a(this, lb9.c, o1aVar);
        return objA == xx1.a ? objA : heb.a;
    }

    public final Object h(float f, o1a o1aVar) {
        Object objV;
        ob obVar = this.b;
        Object value = obVar.g.getValue();
        Object objC = obVar.c(obVar.f(), f, value);
        boolean zBooleanValue = ((Boolean) obVar.d.invoke(objC)).booleanValue();
        xx1 xx1Var = xx1.a;
        heb hebVar = heb.a;
        if (!zBooleanValue ? (objV = ah1.v(obVar, value, f, o1aVar)) != xx1Var : (objV = ah1.v(obVar, objC, f, o1aVar)) != xx1Var) {
            objV = hebVar;
        }
        return objV == xx1Var ? objV : hebVar;
    }
}
