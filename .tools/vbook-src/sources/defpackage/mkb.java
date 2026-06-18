package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class mkb extends o1a implements yb4 {
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ pkb c;
    public final /* synthetic */ String d;
    public final /* synthetic */ yn7 e;
    public final /* synthetic */ lm8 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mkb(pkb pkbVar, String str, yn7 yn7Var, lm8 lm8Var, jt1 jt1Var, int i) {
        super(2, jt1Var);
        this.a = i;
        this.c = pkbVar;
        this.d = str;
        this.e = yn7Var;
        this.f = lm8Var;
    }

    @Override // defpackage.vc0
    public final jt1 create(Object obj, jt1 jt1Var) {
        switch (this.a) {
            case 0:
                return new mkb(this.c, this.d, this.e, this.f, jt1Var, 0);
            case 1:
                return new mkb(this.c, this.d, this.e, this.f, jt1Var, 1);
            case 2:
                return new mkb(this.c, this.d, this.e, this.f, jt1Var, 2);
            case 3:
                return new mkb(this.c, this.d, this.e, this.f, jt1Var, 3);
            case 4:
                return new mkb(this.c, this.d, this.e, this.f, jt1Var, 4);
            default:
                return new mkb(this.c, this.d, this.e, this.f, jt1Var, 5);
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
        return ((mkb) create(vx1Var, jt1Var)).invokeSuspend(hebVar);
    }

    @Override // defpackage.vc0
    public final Object invokeSuspend(Object obj) throws Exception {
        se8 se8Var;
        int i = this.a;
        yn7 yn7Var = this.e;
        xx1 xx1Var = xx1.a;
        heb hebVar = heb.a;
        switch (i) {
            case 0:
                int i2 = this.b;
                if (i2 == 0) {
                    e11.e0(obj);
                    String str = this.d;
                    lm8 lm8Var = this.f;
                    this.b = 1;
                    pkb pkbVar = this.c;
                    pkbVar.getClass();
                    yn7 yn7VarQ = cx1.q(yn7Var, "chapters.json");
                    lr3 lr3Var = hx3.a;
                    lr3Var.getClass();
                    if (yn7VarQ.a.exists()) {
                        se8Var = new se8(lr3Var.y(yn7VarQ));
                        try {
                            ym9.l(pkbVar.a, new nkb(lm8Var, pkbVar, se8Var, pkbVar, str, str, str, 1));
                            lc5.U(se8Var, null);
                        } finally {
                            try {
                                throw th;
                            } finally {
                            }
                        }
                    }
                    if (hebVar == xx1Var) {
                        return xx1Var;
                    }
                } else {
                    if (i2 != 1) {
                        gp.j("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    e11.e0(obj);
                }
                return hebVar;
            case 1:
                int i3 = this.b;
                if (i3 == 0) {
                    e11.e0(obj);
                    String str2 = this.d;
                    lm8 lm8Var2 = this.f;
                    this.b = 1;
                    pkb pkbVar2 = this.c;
                    pkbVar2.getClass();
                    yn7 yn7VarQ2 = cx1.q(yn7Var, "bookmarks.json");
                    lr3 lr3Var2 = hx3.a;
                    lr3Var2.getClass();
                    if (yn7VarQ2.a.exists()) {
                        se8Var = new se8(lr3Var2.y(yn7VarQ2));
                        try {
                            ym9.l(pkbVar2.a, new nkb(lm8Var2, pkbVar2, se8Var, pkbVar2, str2, str2, str2, 0));
                            lc5.U(se8Var, null);
                        } finally {
                            try {
                                throw th;
                            } finally {
                            }
                        }
                    }
                    if (hebVar == xx1Var) {
                        return xx1Var;
                    }
                } else {
                    if (i3 != 1) {
                        gp.j("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    e11.e0(obj);
                }
                return hebVar;
            case 2:
                int i4 = this.b;
                if (i4 == 0) {
                    e11.e0(obj);
                    String str3 = this.d;
                    lm8 lm8Var3 = this.f;
                    this.b = 1;
                    pkb pkbVar3 = this.c;
                    pkbVar3.getClass();
                    yn7 yn7VarQ3 = cx1.q(yn7Var, "toc_links.json");
                    lr3 lr3Var3 = hx3.a;
                    lr3Var3.getClass();
                    if (yn7VarQ3.a.exists()) {
                        se8Var = new se8(lr3Var3.y(yn7VarQ3));
                        try {
                            ym9.l(pkbVar3.a, new nkb(lm8Var3, pkbVar3, se8Var, pkbVar3, str3, str3, str3, 5));
                            lc5.U(se8Var, null);
                        } finally {
                            try {
                                throw th;
                            } finally {
                            }
                        }
                    }
                    if (hebVar == xx1Var) {
                        return xx1Var;
                    }
                } else {
                    if (i4 != 1) {
                        gp.j("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    e11.e0(obj);
                }
                return hebVar;
            case 3:
                int i5 = this.b;
                if (i5 == 0) {
                    e11.e0(obj);
                    String str4 = this.d;
                    lm8 lm8Var4 = this.f;
                    this.b = 1;
                    pkb pkbVar4 = this.c;
                    pkbVar4.getClass();
                    yn7 yn7VarQ4 = cx1.q(yn7Var, "contents.json");
                    lr3 lr3Var4 = hx3.a;
                    lr3Var4.getClass();
                    if (yn7VarQ4.a.exists()) {
                        se8Var = new se8(lr3Var4.y(yn7VarQ4));
                        try {
                            ym9.l(pkbVar4.a, new nkb(lm8Var4, pkbVar4, se8Var, pkbVar4, str4, str4, str4, 2));
                            lc5.U(se8Var, null);
                        } finally {
                            try {
                                throw th;
                            } finally {
                            }
                        }
                    }
                    if (hebVar == xx1Var) {
                        return xx1Var;
                    }
                } else {
                    if (i5 != 1) {
                        gp.j("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    e11.e0(obj);
                }
                return hebVar;
            case 4:
                int i6 = this.b;
                if (i6 == 0) {
                    e11.e0(obj);
                    String str5 = this.d;
                    lm8 lm8Var5 = this.f;
                    this.b = 1;
                    pkb pkbVar5 = this.c;
                    pkbVar5.getClass();
                    yn7 yn7VarQ5 = cx1.q(yn7Var, "names.json");
                    lr3 lr3Var5 = hx3.a;
                    lr3Var5.getClass();
                    if (yn7VarQ5.a.exists()) {
                        se8Var = new se8(lr3Var5.y(yn7VarQ5));
                        try {
                            ym9.l(pkbVar5.a, new nkb(lm8Var5, pkbVar5, se8Var, pkbVar5, str5, str5, str5, 3));
                            lc5.U(se8Var, null);
                        } finally {
                        }
                    }
                    if (hebVar == xx1Var) {
                        return xx1Var;
                    }
                } else {
                    if (i6 != 1) {
                        gp.j("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    e11.e0(obj);
                }
                return hebVar;
            default:
                int i7 = this.b;
                if (i7 == 0) {
                    e11.e0(obj);
                    String str6 = this.d;
                    lm8 lm8Var6 = this.f;
                    this.b = 1;
                    pkb pkbVar6 = this.c;
                    pkbVar6.getClass();
                    yn7 yn7VarQ6 = cx1.q(yn7Var, "qt_words.json");
                    lr3 lr3Var6 = hx3.a;
                    lr3Var6.getClass();
                    if (yn7VarQ6.a.exists()) {
                        se8Var = new se8(lr3Var6.y(yn7VarQ6));
                        try {
                            ym9.l(pkbVar6.a, new nkb(lm8Var6, pkbVar6, se8Var, pkbVar6, str6, str6, str6, 4));
                            lc5.U(se8Var, null);
                        } finally {
                        }
                    }
                    if (hebVar == xx1Var) {
                        return xx1Var;
                    }
                } else {
                    if (i7 != 1) {
                        gp.j("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    e11.e0(obj);
                }
                return hebVar;
        }
    }
}
