package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class jkb extends o1a implements kb4 {
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ pkb c;
    public final /* synthetic */ yn7 d;
    public final /* synthetic */ lm8 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jkb(pkb pkbVar, yn7 yn7Var, lm8 lm8Var, jt1 jt1Var, int i) {
        super(1, jt1Var);
        this.a = i;
        this.c = pkbVar;
        this.d = yn7Var;
        this.e = lm8Var;
    }

    @Override // defpackage.vc0
    public final jt1 create(jt1 jt1Var) {
        switch (this.a) {
            case 0:
                return new jkb(this.c, this.d, this.e, jt1Var, 0);
            case 1:
                return new jkb(this.c, this.d, this.e, jt1Var, 1);
            case 2:
                return new jkb(this.c, this.d, this.e, jt1Var, 2);
            case 3:
                return new jkb(this.c, this.d, this.e, jt1Var, 3);
            case 4:
                return new jkb(this.c, this.d, this.e, jt1Var, 4);
            case 5:
                return new jkb(this.c, this.d, this.e, jt1Var, 5);
            case 6:
                return new jkb(this.c, this.d, this.e, jt1Var, 6);
            case 7:
                return new jkb(this.c, this.d, this.e, jt1Var, 7);
            case 8:
                return new jkb(this.c, this.d, this.e, jt1Var, 8);
            case 9:
                return new jkb(this.c, this.d, this.e, jt1Var, 9);
            case 10:
                return new jkb(this.c, this.d, this.e, jt1Var, 10);
            case 11:
                return new jkb(this.c, this.d, this.e, jt1Var, 11);
            case 12:
                return new jkb(this.c, this.d, this.e, jt1Var, 12);
            case 13:
                return new jkb(this.c, this.d, this.e, jt1Var, 13);
            case 14:
                return new jkb(this.c, this.d, this.e, jt1Var, 14);
            case 15:
                return new jkb(this.c, this.d, this.e, jt1Var, 15);
            case 16:
                return new jkb(this.c, this.d, this.e, jt1Var, 16);
            case 17:
                return new jkb(this.c, this.d, this.e, jt1Var, 17);
            case 18:
                return new jkb(this.c, this.d, this.e, jt1Var, 18);
            case 19:
                return new jkb(this.c, this.d, this.e, jt1Var, 19);
            case 20:
                return new jkb(this.c, this.d, this.e, jt1Var, 20);
            case 21:
                return new jkb(this.c, this.d, this.e, jt1Var, 21);
            case 22:
                return new jkb(this.c, this.d, this.e, jt1Var, 22);
            case 23:
                return new jkb(this.c, this.d, this.e, jt1Var, 23);
            case 24:
                return new jkb(this.c, this.d, this.e, jt1Var, 24);
            default:
                return new jkb(this.c, this.d, this.e, jt1Var, 25);
        }
    }

    @Override // defpackage.kb4
    public final Object invoke(Object obj) {
        int i = this.a;
        heb hebVar = heb.a;
        jt1 jt1Var = (jt1) obj;
        switch (i) {
        }
        return ((jkb) create(jt1Var)).invokeSuspend(hebVar);
    }

    @Override // defpackage.vc0
    public final Object invokeSuspend(Object obj) throws Exception {
        se8 se8Var;
        int i = this.a;
        lm8 lm8Var = this.e;
        pkb pkbVar = this.c;
        yn7 yn7Var = this.d;
        xx1 xx1Var = xx1.a;
        heb hebVar = heb.a;
        switch (i) {
            case 0:
                int i2 = this.b;
                if (i2 == 0) {
                    e11.e0(obj);
                    lm8 lm8Var2 = this.e;
                    this.b = 1;
                    pkb pkbVar2 = this.c;
                    pkbVar2.getClass();
                    yn7 yn7VarB = pkb.b(yn7Var, "extensions.json");
                    lr3 lr3Var = hx3.a;
                    lr3Var.getClass();
                    if (yn7VarB.a.exists()) {
                        se8Var = new se8(lr3Var.y(yn7VarB));
                        try {
                            ym9.l(pkbVar2.a, new okb(lm8Var2, pkbVar2, se8Var, pkbVar2, 8));
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
                    lm8 lm8Var3 = this.e;
                    this.b = 1;
                    pkb pkbVar3 = this.c;
                    pkbVar3.getClass();
                    yn7 yn7VarB2 = pkb.b(yn7Var, "extension_sources.json");
                    lr3 lr3Var2 = hx3.a;
                    lr3Var2.getClass();
                    if (yn7VarB2.a.exists()) {
                        se8Var = new se8(lr3Var2.y(yn7VarB2));
                        try {
                            ym9.l(pkbVar3.a, new okb(lm8Var3, pkbVar3, se8Var, pkbVar3, 7));
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
                    lm8 lm8Var4 = this.e;
                    this.b = 1;
                    pkb pkbVar4 = this.c;
                    pkbVar4.getClass();
                    yn7 yn7VarB3 = pkb.b(yn7Var, "extension_local_storages.json");
                    lr3 lr3Var3 = hx3.a;
                    lr3Var3.getClass();
                    if (yn7VarB3.a.exists()) {
                        se8Var = new se8(lr3Var3.y(yn7VarB3));
                        try {
                            ym9.l(pkbVar4.a, new okb(lm8Var4, pkbVar4, se8Var, pkbVar4, 6));
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
                    lm8 lm8Var5 = this.e;
                    this.b = 1;
                    pkb pkbVar5 = this.c;
                    pkbVar5.getClass();
                    yn7 yn7VarB4 = pkb.b(yn7Var, "categories.json");
                    lr3 lr3Var4 = hx3.a;
                    lr3Var4.getClass();
                    if (yn7VarB4.a.exists()) {
                        se8Var = new se8(lr3Var4.y(yn7VarB4));
                        try {
                            ym9.l(pkbVar5.a, new okb(lm8Var5, pkbVar5, se8Var, pkbVar5, 1));
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
                    lm8 lm8Var6 = this.e;
                    this.b = 1;
                    pkb pkbVar6 = this.c;
                    pkbVar6.getClass();
                    yn7 yn7VarQ = cx1.q(yn7Var, "read_histories.json");
                    lr3 lr3Var5 = hx3.a;
                    lr3Var5.getClass();
                    if (yn7VarQ.a.exists()) {
                        se8Var = new se8(lr3Var5.y(yn7VarQ));
                        try {
                            ym9.l(pkbVar6.a, new okb(lm8Var6, pkbVar6, se8Var, pkbVar6, 14));
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
                    if (i6 != 1) {
                        gp.j("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    e11.e0(obj);
                }
                return hebVar;
            case 5:
                int i7 = this.b;
                if (i7 == 0) {
                    e11.e0(obj);
                    lm8 lm8Var7 = this.e;
                    this.b = 1;
                    pkb pkbVar7 = this.c;
                    pkbVar7.getClass();
                    yn7 yn7VarQ2 = cx1.q(yn7Var, "downloads.json");
                    lr3 lr3Var6 = hx3.a;
                    lr3Var6.getClass();
                    if (yn7VarQ2.a.exists()) {
                        se8Var = new se8(lr3Var6.y(yn7VarQ2));
                        try {
                            ym9.l(pkbVar7.a, new okb(lm8Var7, pkbVar7, se8Var, pkbVar7, 3));
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
                    if (i7 != 1) {
                        gp.j("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    e11.e0(obj);
                }
                return hebVar;
            case 6:
                int i8 = this.b;
                if (i8 == 0) {
                    e11.e0(obj);
                    lm8 lm8Var8 = this.e;
                    this.b = 1;
                    pkb pkbVar8 = this.c;
                    pkbVar8.getClass();
                    yn7 yn7VarB5 = pkb.b(yn7Var, "browser_histories.json");
                    lr3 lr3Var7 = hx3.a;
                    lr3Var7.getClass();
                    if (yn7VarB5.a.exists()) {
                        se8Var = new se8(lr3Var7.y(yn7VarB5));
                        try {
                            ym9.l(pkbVar8.a, new okb(lm8Var8, pkbVar8, se8Var, pkbVar8, 0));
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
                    if (i8 != 1) {
                        gp.j("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    e11.e0(obj);
                }
                return hebVar;
            case 7:
                int i9 = this.b;
                if (i9 == 0) {
                    e11.e0(obj);
                    lm8 lm8Var9 = this.e;
                    this.b = 1;
                    pkb pkbVar9 = this.c;
                    pkbVar9.getClass();
                    yn7 yn7VarB6 = pkb.b(yn7Var, "domains.json");
                    lr3 lr3Var8 = hx3.a;
                    lr3Var8.getClass();
                    if (yn7VarB6.a.exists()) {
                        se8Var = new se8(lr3Var8.y(yn7VarB6));
                        try {
                            ym9.l(pkbVar9.a, new okb(lm8Var9, pkbVar9, se8Var, pkbVar9, 2));
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
                    if (i9 != 1) {
                        gp.j("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    e11.e0(obj);
                }
                return hebVar;
            case 8:
                int i10 = this.b;
                if (i10 == 0) {
                    e11.e0(obj);
                    lm8 lm8Var10 = this.e;
                    this.b = 1;
                    pkb pkbVar10 = this.c;
                    pkbVar10.getClass();
                    yn7 yn7VarB7 = pkb.b(yn7Var, "emojis.json");
                    lr3 lr3Var9 = hx3.a;
                    lr3Var9.getClass();
                    if (yn7VarB7.a.exists()) {
                        se8Var = new se8(lr3Var9.y(yn7VarB7));
                        try {
                            ym9.l(pkbVar10.a, new okb(lm8Var10, pkbVar10, se8Var, pkbVar10, 5));
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
                    if (i10 != 1) {
                        gp.j("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    e11.e0(obj);
                }
                return hebVar;
            case 9:
                int i11 = this.b;
                if (i11 == 0) {
                    e11.e0(obj);
                    lm8 lm8Var11 = this.e;
                    this.b = 1;
                    pkb pkbVar11 = this.c;
                    pkbVar11.getClass();
                    yn7 yn7VarB8 = pkb.b(yn7Var, "emoji_categories.json");
                    lr3 lr3Var10 = hx3.a;
                    lr3Var10.getClass();
                    if (yn7VarB8.a.exists()) {
                        se8Var = new se8(lr3Var10.y(yn7VarB8));
                        try {
                            ym9.l(pkbVar11.a, new okb(lm8Var11, pkbVar11, se8Var, pkbVar11, 4));
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
                    if (i11 != 1) {
                        gp.j("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    e11.e0(obj);
                }
                return hebVar;
            case 10:
                int i12 = this.b;
                if (i12 == 0) {
                    e11.e0(obj);
                    lm8 lm8Var12 = this.e;
                    this.b = 1;
                    pkb pkbVar12 = this.c;
                    pkbVar12.getClass();
                    yn7 yn7VarB9 = pkb.b(yn7Var, "notifications.json");
                    lr3 lr3Var11 = hx3.a;
                    lr3Var11.getClass();
                    if (yn7VarB9.a.exists()) {
                        se8Var = new se8(lr3Var11.y(yn7VarB9));
                        try {
                            ym9.l(pkbVar12.a, new okb(lm8Var12, pkbVar12, se8Var, pkbVar12, 10));
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
                    if (i12 != 1) {
                        gp.j("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    e11.e0(obj);
                }
                return hebVar;
            case 11:
                int i13 = this.b;
                if (i13 == 0) {
                    e11.e0(obj);
                    lm8 lm8Var13 = this.e;
                    this.b = 1;
                    pkb pkbVar13 = this.c;
                    pkbVar13.getClass();
                    yn7 yn7VarB10 = pkb.b(yn7Var, "qt_dictionaries.json");
                    lr3 lr3Var12 = hx3.a;
                    lr3Var12.getClass();
                    if (yn7VarB10.a.exists()) {
                        se8Var = new se8(lr3Var12.y(yn7VarB10));
                        try {
                            ym9.l(pkbVar13.a, new okb(lm8Var13, pkbVar13, se8Var, pkbVar13, 11));
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
                    if (i13 != 1) {
                        gp.j("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    e11.e0(obj);
                }
                return hebVar;
            case 12:
                int i14 = this.b;
                if (i14 == 0) {
                    e11.e0(obj);
                    lm8 lm8Var14 = this.e;
                    this.b = 1;
                    pkb pkbVar14 = this.c;
                    pkbVar14.getClass();
                    yn7 yn7VarB11 = pkb.b(yn7Var, "qt_words.json");
                    lr3 lr3Var13 = hx3.a;
                    lr3Var13.getClass();
                    if (yn7VarB11.a.exists()) {
                        se8Var = new se8(lr3Var13.y(yn7VarB11));
                        try {
                            ym9.l(pkbVar14.a, new okb(lm8Var14, pkbVar14, se8Var, pkbVar14, 13));
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
                    if (i14 != 1) {
                        gp.j("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    e11.e0(obj);
                }
                return hebVar;
            case 13:
                int i15 = this.b;
                if (i15 == 0) {
                    e11.e0(obj);
                    lm8 lm8Var15 = this.e;
                    this.b = 1;
                    pkb pkbVar15 = this.c;
                    pkbVar15.getClass();
                    yn7 yn7VarB12 = pkb.b(yn7Var, "qt_name_skips.json");
                    lr3 lr3Var14 = hx3.a;
                    lr3Var14.getClass();
                    if (yn7VarB12.a.exists()) {
                        se8Var = new se8(lr3Var14.y(yn7VarB12));
                        try {
                            ym9.l(pkbVar15.a, new okb(lm8Var15, pkbVar15, se8Var, pkbVar15, 12));
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
                    if (i15 != 1) {
                        gp.j("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    e11.e0(obj);
                }
                return hebVar;
            case 14:
                int i16 = this.b;
                if (i16 == 0) {
                    e11.e0(obj);
                    lm8 lm8Var16 = this.e;
                    this.b = 1;
                    pkb pkbVar16 = this.c;
                    pkbVar16.getClass();
                    yn7 yn7VarB13 = pkb.b(yn7Var, "names.json");
                    lr3 lr3Var15 = hx3.a;
                    lr3Var15.getClass();
                    if (yn7VarB13.a.exists()) {
                        se8Var = new se8(lr3Var15.y(yn7VarB13));
                        try {
                            ym9.l(pkbVar16.a, new okb(lm8Var16, pkbVar16, se8Var, pkbVar16, 9));
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
                    if (i16 != 1) {
                        gp.j("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    e11.e0(obj);
                }
                return hebVar;
            case 15:
                int i17 = this.b;
                if (i17 == 0) {
                    e11.e0(obj);
                    lm8 lm8Var17 = this.e;
                    this.b = 1;
                    pkb pkbVar17 = this.c;
                    pkbVar17.getClass();
                    yn7 yn7VarB14 = pkb.b(yn7Var, "searches.json");
                    lr3 lr3Var16 = hx3.a;
                    lr3Var16.getClass();
                    if (yn7VarB14.a.exists()) {
                        se8Var = new se8(lr3Var16.y(yn7VarB14));
                        try {
                            ym9.l(pkbVar17.a, new okb(lm8Var17, pkbVar17, se8Var, pkbVar17, 15));
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
                    if (i17 != 1) {
                        gp.j("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    e11.e0(obj);
                }
                return hebVar;
            case 16:
                int i18 = this.b;
                if (i18 == 0) {
                    e11.e0(obj);
                    lm8 lm8Var18 = this.e;
                    this.b = 1;
                    pkb pkbVar18 = this.c;
                    pkbVar18.getClass();
                    yn7 yn7VarB15 = pkb.b(yn7Var, "tts_words.json");
                    lr3 lr3Var17 = hx3.a;
                    lr3Var17.getClass();
                    if (yn7VarB15.a.exists()) {
                        se8Var = new se8(lr3Var17.y(yn7VarB15));
                        try {
                            ym9.l(pkbVar18.a, new okb(lm8Var18, pkbVar18, se8Var, pkbVar18, 17));
                            lc5.U(se8Var, null);
                        } finally {
                        }
                    }
                    if (hebVar == xx1Var) {
                        return xx1Var;
                    }
                } else {
                    if (i18 != 1) {
                        gp.j("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    e11.e0(obj);
                }
                return hebVar;
            case 17:
                int i19 = this.b;
                if (i19 == 0) {
                    e11.e0(obj);
                    lm8 lm8Var19 = this.e;
                    this.b = 1;
                    pkb pkbVar19 = this.c;
                    pkbVar19.getClass();
                    yn7 yn7VarB16 = pkb.b(yn7Var, "trashes.json");
                    lr3 lr3Var18 = hx3.a;
                    lr3Var18.getClass();
                    if (yn7VarB16.a.exists()) {
                        se8Var = new se8(lr3Var18.y(yn7VarB16));
                        try {
                            ym9.l(pkbVar19.a, new okb(lm8Var19, pkbVar19, se8Var, pkbVar19, 16));
                            lc5.U(se8Var, null);
                        } finally {
                        }
                    }
                    if (hebVar == xx1Var) {
                        return xx1Var;
                    }
                } else {
                    if (i19 != 1) {
                        gp.j("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    e11.e0(obj);
                }
                return hebVar;
            case 18:
                int i20 = this.b;
                if (i20 == 0) {
                    e11.e0(obj);
                    this.b = 1;
                    pkbVar.getClass();
                    pkbVar.g(pkb.b(yn7Var, "app_settings.json"), "app_settings", lm8Var);
                    if (hebVar == xx1Var) {
                        return xx1Var;
                    }
                } else {
                    if (i20 != 1) {
                        gp.j("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    e11.e0(obj);
                }
                return hebVar;
            case 19:
                int i21 = this.b;
                if (i21 == 0) {
                    e11.e0(obj);
                    this.b = 1;
                    pkbVar.getClass();
                    pkbVar.g(pkb.b(yn7Var, "browser_settings.json"), "browser_settings", lm8Var);
                    if (hebVar == xx1Var) {
                        return xx1Var;
                    }
                } else {
                    if (i21 != 1) {
                        gp.j("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    e11.e0(obj);
                }
                return hebVar;
            case 20:
                int i22 = this.b;
                if (i22 == 0) {
                    e11.e0(obj);
                    this.b = 1;
                    pkbVar.getClass();
                    pkbVar.g(pkb.b(yn7Var, "image_settings.json"), "image_settings", lm8Var);
                    if (hebVar == xx1Var) {
                        return xx1Var;
                    }
                } else {
                    if (i22 != 1) {
                        gp.j("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    e11.e0(obj);
                }
                return hebVar;
            case 21:
                int i23 = this.b;
                if (i23 == 0) {
                    e11.e0(obj);
                    this.b = 1;
                    pkbVar.getClass();
                    pkbVar.g(pkb.b(yn7Var, "text_settings.json"), "text_settings", lm8Var);
                    if (hebVar == xx1Var) {
                        return xx1Var;
                    }
                } else {
                    if (i23 != 1) {
                        gp.j("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    e11.e0(obj);
                }
                return hebVar;
            case 22:
                int i24 = this.b;
                if (i24 == 0) {
                    e11.e0(obj);
                    this.b = 1;
                    pkbVar.getClass();
                    pkbVar.g(pkb.b(yn7Var, "tts_settings.json"), "tts_settings", lm8Var);
                    if (hebVar == xx1Var) {
                        return xx1Var;
                    }
                } else {
                    if (i24 != 1) {
                        gp.j("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    e11.e0(obj);
                }
                return hebVar;
            case 23:
                int i25 = this.b;
                if (i25 == 0) {
                    e11.e0(obj);
                    this.b = 1;
                    pkbVar.getClass();
                    pkbVar.g(pkb.b(yn7Var, "reader_settings.json"), "reader_settings", lm8Var);
                    if (hebVar == xx1Var) {
                        return xx1Var;
                    }
                } else {
                    if (i25 != 1) {
                        gp.j("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    e11.e0(obj);
                }
                return hebVar;
            case 24:
                int i26 = this.b;
                if (i26 == 0) {
                    e11.e0(obj);
                    this.b = 1;
                    pkbVar.getClass();
                    pkbVar.g(pkb.b(yn7Var, "qt_settings.json"), "qt_settings", lm8Var);
                    if (hebVar == xx1Var) {
                        return xx1Var;
                    }
                } else {
                    if (i26 != 1) {
                        gp.j("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    e11.e0(obj);
                }
                return hebVar;
            default:
                int i27 = this.b;
                if (i27 == 0) {
                    e11.e0(obj);
                    this.b = 1;
                    pkbVar.getClass();
                    pkbVar.g(pkb.b(yn7Var, "translate_settings.json"), "translate_settings", lm8Var);
                    if (hebVar == xx1Var) {
                        return xx1Var;
                    }
                } else {
                    if (i27 != 1) {
                        gp.j("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    e11.e0(obj);
                }
                return hebVar;
        }
    }
}
