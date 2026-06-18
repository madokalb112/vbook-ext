package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class r4b extends o1a implements yb4 {
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ s4b c;
    public final /* synthetic */ String d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ String f;
    public final /* synthetic */ String s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r4b(s4b s4bVar, String str, boolean z, String str2, String str3, jt1 jt1Var, int i) {
        super(2, jt1Var);
        this.a = i;
        this.c = s4bVar;
        this.d = str;
        this.e = z;
        this.f = str2;
        this.s = str3;
    }

    @Override // defpackage.vc0
    public final jt1 create(Object obj, jt1 jt1Var) {
        switch (this.a) {
            case 0:
                return new r4b(this.c, this.d, this.e, this.f, this.s, jt1Var, 0);
            case 1:
                return new r4b(this.c, this.d, this.e, this.f, this.s, jt1Var, 1);
            default:
                return new r4b(this.c, this.e, this.d, this.f, this.s, jt1Var);
        }
    }

    @Override // defpackage.yb4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        heb hebVar = heb.a;
        vx1 vx1Var = (vx1) obj;
        jt1 jt1Var = (jt1) obj2;
        switch (i) {
        }
        return ((r4b) create(vx1Var, jt1Var)).invokeSuspend(hebVar);
    }

    @Override // defpackage.vc0
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = this.a;
        mc3 mc3Var = mc3.a;
        String str = this.s;
        String str2 = this.f;
        String str3 = this.d;
        xx1 xx1Var = xx1.a;
        s4b s4bVar = this.c;
        heb hebVar = heb.a;
        boolean z = this.e;
        switch (i) {
            case 0:
                int i2 = this.b;
                if (i2 != 0) {
                    if (i2 != 1) {
                        gp.j("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        e11.e0(obj);
                    }
                    break;
                } else {
                    e11.e0(obj);
                    f4b f4bVar = s4bVar.s;
                    String str4 = s4bVar.c;
                    this.b = 1;
                    ((j4b) f4bVar).a.b.s0(str4, y86.P(new xl7("show_raw", String.valueOf(z)), new xl7("engine_id", str3), new xl7("from_language", str2), new xl7("to_language", str)));
                    if (hebVar == xx1Var) {
                    }
                }
                break;
            case 1:
                f4b f4bVar2 = s4bVar.s;
                String str5 = s4bVar.c;
                int i3 = this.b;
                if (i3 != 0) {
                    if (i3 == 1) {
                        e11.e0(obj);
                    } else if (i3 != 2) {
                        gp.j("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        e11.e0(obj);
                    }
                    break;
                } else {
                    e11.e0(obj);
                    if (str5.length() > 0) {
                        this.b = 1;
                        ((j4b) f4bVar2).a.b.s0(str5, mc3Var);
                        if (hebVar == xx1Var) {
                        }
                    }
                }
                String str6 = s4bVar.d;
                this.b = 2;
                ((j4b) f4bVar2).a.x.s0(str6, y86.P(new xl7("show_raw", String.valueOf(z)), new xl7("engine_id", str3), new xl7("from_language", str2), new xl7("to_language", str)));
                if (hebVar == xx1Var) {
                }
                break;
            default:
                String str7 = s4bVar.d;
                String str8 = s4bVar.c;
                f4b f4bVar3 = s4bVar.s;
                int i4 = this.b;
                if (i4 != 0) {
                    if (i4 == 1) {
                        e11.e0(obj);
                    } else if (i4 == 2 || i4 == 3) {
                        e11.e0(obj);
                        this.b = 4;
                        j4b j4bVar = (j4b) f4bVar3;
                        e4b e4bVar = j4bVar.b;
                        km0 km0Var = e4bVar.d;
                        ni5[] ni5VarArr = e4b.f;
                        km0Var.e(ni5VarArr[2], Boolean.valueOf(z));
                        g18 g18Var = e4bVar.a;
                        str3.getClass();
                        e4bVar.e.e(ni5VarArr[3], str3);
                        str2.getClass();
                        g18Var.j("from_language_".concat(str3), str2);
                        str.getClass();
                        g18Var.j("to_language_".concat(str3), str);
                        fr9 fr9Var = j4bVar.h;
                        fr9Var.getClass();
                        fr9Var.l(null, str3);
                        fr9 fr9Var2 = j4bVar.i;
                        fr9Var2.getClass();
                        fr9Var2.l(null, str2);
                        fr9 fr9Var3 = j4bVar.j;
                        fr9Var3.getClass();
                        fr9Var3.l(null, str);
                        if (hebVar == xx1Var) {
                        }
                    } else if (i4 != 4) {
                        gp.j("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        e11.e0(obj);
                    }
                    break;
                } else {
                    e11.e0(obj);
                    this.b = 1;
                    j4b j4bVar2 = (j4b) f4bVar3;
                    j4bVar2.b.d.e(e4b.f[2], Boolean.valueOf(z));
                    fr9 fr9Var4 = j4bVar2.g;
                    Boolean boolValueOf = Boolean.valueOf(z);
                    fr9Var4.getClass();
                    fr9Var4.l(null, boolValueOf);
                    if (hebVar == xx1Var) {
                    }
                }
                if (str8.length() > 0) {
                    this.b = 2;
                    ((j4b) f4bVar3).a.b.s0(str8, mc3Var);
                    if (hebVar == xx1Var) {
                    }
                } else if (str7.length() > 0) {
                    this.b = 3;
                    ((j4b) f4bVar3).a.x.s0(str7, mc3Var);
                    if (hebVar == xx1Var) {
                    }
                }
                this.b = 4;
                j4b j4bVar3 = (j4b) f4bVar3;
                e4b e4bVar2 = j4bVar3.b;
                km0 km0Var2 = e4bVar2.d;
                ni5[] ni5VarArr2 = e4b.f;
                km0Var2.e(ni5VarArr2[2], Boolean.valueOf(z));
                g18 g18Var2 = e4bVar2.a;
                str3.getClass();
                e4bVar2.e.e(ni5VarArr2[3], str3);
                str2.getClass();
                g18Var2.j("from_language_".concat(str3), str2);
                str.getClass();
                g18Var2.j("to_language_".concat(str3), str);
                fr9 fr9Var5 = j4bVar3.h;
                fr9Var5.getClass();
                fr9Var5.l(null, str3);
                fr9 fr9Var22 = j4bVar3.i;
                fr9Var22.getClass();
                fr9Var22.l(null, str2);
                fr9 fr9Var32 = j4bVar3.j;
                fr9Var32.getClass();
                fr9Var32.l(null, str);
                if (hebVar == xx1Var) {
                }
                break;
        }
        return hebVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r4b(s4b s4bVar, boolean z, String str, String str2, String str3, jt1 jt1Var) {
        super(2, jt1Var);
        this.a = 2;
        this.c = s4bVar;
        this.e = z;
        this.d = str;
        this.f = str2;
        this.s = str3;
    }
}
