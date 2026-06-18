package defpackage;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class u41 extends o1a implements yb4 {
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ String d;
    public final /* synthetic */ boolean e;
    public /* synthetic */ Object f;
    public final /* synthetic */ Object s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u41(List list, boolean z, boolean z2, hra hraVar, String str, jt1 jt1Var) {
        super(2, jt1Var);
        this.a = 3;
        this.f = list;
        this.c = z;
        this.e = z2;
        this.s = hraVar;
        this.d = str;
    }

    @Override // defpackage.vc0
    public final jt1 create(Object obj, jt1 jt1Var) {
        int i = this.a;
        Object obj2 = this.s;
        switch (i) {
            case 0:
                boolean z = this.e;
                String str = this.d;
                u41 u41Var = new u41(this.c, (v41) obj2, z, str, jt1Var);
                u41Var.f = obj;
                return u41Var;
            case 1:
                return new u41((gea) this.f, this.c, this.d, (String) obj2, this.e, jt1Var, 1);
            case 2:
                return new u41((hra) this.f, this.c, this.d, (String) obj2, this.e, jt1Var, 2);
            default:
                String str2 = this.d;
                return new u41((List) this.f, this.c, this.e, (hra) obj2, str2, jt1Var);
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
        return ((u41) create(vx1Var, jt1Var)).invokeSuspend(hebVar);
    }

    @Override // defpackage.vc0
    public final Object invokeSuspend(Object obj) {
        Object pm8Var;
        Object value;
        Object value2;
        boolean z;
        Collection collectionValues;
        Object value3;
        Object objG;
        Object value4;
        int i = this.a;
        String str = this.d;
        boolean z2 = this.e;
        boolean z3 = this.c;
        xx1 xx1Var = xx1.a;
        heb hebVar = heb.a;
        Object obj2 = this.s;
        switch (i) {
            case 0:
                v41 v41Var = (v41) obj2;
                fr9 fr9Var = v41Var.e;
                int i2 = this.b;
                try {
                    if (i2 == 0) {
                        e11.e0(obj);
                        if (z3) {
                            v41Var.u = true;
                            if (fr9Var != null) {
                                do {
                                    value4 = fr9Var.getValue();
                                } while (!fr9Var.j(value4, t41.a((t41) value4, false, false, true, false, null, null, null, Token.DOT)));
                            }
                        } else if (z2 && fr9Var != null) {
                            do {
                                value3 = fr9Var.getValue();
                            } while (!fr9Var.j(value3, t41.a((t41) value3, true, false, false, false, null, null, null, 120)));
                        }
                        z51 z51Var = v41Var.c;
                        int i3 = v41Var.f;
                        if (bw9.a0(str)) {
                            str = null;
                        }
                        this.f = null;
                        this.b = 1;
                        objG = ((p61) z51Var).g(i3, 24, this, str);
                        if (objG == xx1Var) {
                        }
                    } else if (i2 != 1) {
                        gp.j("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        e11.e0(obj);
                        objG = obj;
                    }
                    pm8Var = (List) objG;
                } catch (Throwable th) {
                    pm8Var = new pm8(th);
                }
                if (!(pm8Var instanceof pm8)) {
                    List<fv1> list = (List) pm8Var;
                    v41Var.t = list.size() == 24;
                    LinkedHashMap linkedHashMap = v41Var.v;
                    v41Var.f++;
                    for (fv1 fv1Var : list) {
                        linkedHashMap.put(new Long(fv1Var.a), fv1Var);
                    }
                    if (fr9Var != null) {
                        do {
                            value2 = fr9Var.getValue();
                            z = v41Var.t;
                            collectionValues = linkedHashMap.values();
                            collectionValues.getClass();
                        } while (!fr9Var.j(value2, t41.a((t41) value2, false, false, false, z, null, this.d, fc1.R0(new k54(15), collectionValues), 16)));
                    }
                }
                Throwable thA = qm8.a(pm8Var);
                if (thA != null) {
                    thA.printStackTrace();
                    String str2 = this.d;
                    if (z2 || ((t41) fr9Var.getValue()).g.isEmpty()) {
                        if (fr9Var != null) {
                            do {
                                value = fr9Var.getValue();
                            } while (!fr9Var.j(value, t41.a((t41) value, false, true, false, false, null, str2, null, 88)));
                        }
                    } else if (fr9Var != null) {
                        while (true) {
                            Object value5 = fr9Var.getValue();
                            String str3 = str2;
                            if (!fr9Var.j(value5, t41.a((t41) value5, false, false, false, false, null, str3, null, 90))) {
                                str2 = str3;
                            }
                        }
                    }
                }
                v41Var.u = false;
                break;
            case 1:
                int i4 = this.b;
                if (i4 != 0) {
                    if (i4 != 1) {
                        gp.j("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        e11.e0(obj);
                    }
                    break;
                } else {
                    e11.e0(obj);
                    gea geaVar = (gea) this.f;
                    t0c t0cVar = geaVar.d;
                    final String str4 = z3 ? geaVar.c : "general";
                    final String str5 = (String) obj2;
                    this.b = 1;
                    final d1c d1cVar = (d1c) t0cVar;
                    b92 b92Var = d1cVar.a.K;
                    final String str6 = this.d;
                    final boolean z4 = this.e;
                    ym9.l(b92Var, new kb4() { // from class: u0c
                        @Override // defpackage.kb4
                        public final Object invoke(Object obj3) {
                            String strP;
                            ((u2b) obj3).getClass();
                            m62 m62Var = d1cVar.a;
                            n92 n92Var = m62Var.A;
                            n92Var.getClass();
                            String str7 = str6;
                            str7.getClass();
                            ub2 ub2Var = ub2.a;
                            ob2 ob2Var = (ob2) new qb2(n92Var, str7, new sa2(27)).e();
                            n92 n92Var2 = m62Var.A;
                            n92Var2.O(str7);
                            if (ob2Var == null || (strP = ob2Var.a) == null) {
                                strP = wm9.p();
                            }
                            n92Var2.U(new ob2(strP, str4, str7, str5, z4, ob2Var != null ? ob2Var.f : r95.a.k().c()));
                            return heb.a;
                        }
                    });
                    if (hebVar == xx1Var) {
                    }
                }
                break;
            case 2:
                int i5 = this.b;
                if (i5 != 0) {
                    if (i5 != 1) {
                        gp.j("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        e11.e0(obj);
                    }
                    break;
                } else {
                    e11.e0(obj);
                    hra hraVar = (hra) this.f;
                    t0c t0cVar2 = hraVar.P;
                    final String str7 = z3 ? hraVar.H : "general";
                    final String str8 = (String) obj2;
                    this.b = 1;
                    final d1c d1cVar2 = (d1c) t0cVar2;
                    b92 b92Var2 = d1cVar2.a.K;
                    final String str9 = this.d;
                    final boolean z5 = this.e;
                    ym9.l(b92Var2, new kb4() { // from class: u0c
                        @Override // defpackage.kb4
                        public final Object invoke(Object obj3) {
                            String strP;
                            ((u2b) obj3).getClass();
                            m62 m62Var = d1cVar2.a;
                            n92 n92Var = m62Var.A;
                            n92Var.getClass();
                            String str72 = str9;
                            str72.getClass();
                            ub2 ub2Var = ub2.a;
                            ob2 ob2Var = (ob2) new qb2(n92Var, str72, new sa2(27)).e();
                            n92 n92Var2 = m62Var.A;
                            n92Var2.O(str72);
                            if (ob2Var == null || (strP = ob2Var.a) == null) {
                                strP = wm9.p();
                            }
                            n92Var2.U(new ob2(strP, str7, str72, str8, z5, ob2Var != null ? ob2Var.f : r95.a.k().c()));
                            return heb.a;
                        }
                    });
                    if (hebVar == xx1Var) {
                    }
                }
                break;
            default:
                hra hraVar2 = (hra) obj2;
                switch (this.b) {
                    case 0:
                        e11.e0(obj);
                        String strD0 = fc1.D0((List) this.f, "¦", null, null, null, 62);
                        if (z3 && z2) {
                            if (strD0.length() == 0) {
                                y78 y78Var = hraVar2.S;
                                String str10 = hraVar2.H;
                                this.b = 1;
                                ((c98) y78Var).r(str10, str);
                                if (hebVar == xx1Var) {
                                }
                            } else {
                                y78 y78Var2 = hraVar2.S;
                                String str11 = hraVar2.H;
                                this.b = 2;
                                ((c98) y78Var2).g(str11, str, strD0);
                                if (hebVar == xx1Var) {
                                }
                            }
                        } else if (!z3 || z2) {
                            if (z3 || !z2) {
                                if (!z3 && !z2) {
                                    if (strD0.length() == 0) {
                                        y78 y78Var3 = hraVar2.S;
                                        this.b = 7;
                                        ((c98) y78Var3).e(1, str, "");
                                        if (hebVar == xx1Var) {
                                        }
                                    } else {
                                        y78 y78Var4 = hraVar2.S;
                                        this.b = 8;
                                        ((c98) y78Var4).e(0, str, strD0);
                                        if (hebVar == xx1Var) {
                                        }
                                    }
                                }
                            } else if (strD0.length() == 0) {
                                y78 y78Var5 = hraVar2.S;
                                this.b = 5;
                                ((c98) y78Var5).c(1, str, "");
                                if (hebVar == xx1Var) {
                                }
                            } else {
                                y78 y78Var6 = hraVar2.S;
                                this.b = 6;
                                ((c98) y78Var6).c(0, str, strD0);
                                if (hebVar == xx1Var) {
                                }
                            }
                        } else if (strD0.length() == 0) {
                            y78 y78Var7 = hraVar2.S;
                            String str12 = hraVar2.H;
                            this.b = 3;
                            ((c98) y78Var7).t(str12, str);
                            if (hebVar == xx1Var) {
                            }
                        } else {
                            y78 y78Var8 = hraVar2.S;
                            String str13 = hraVar2.H;
                            this.b = 4;
                            ((c98) y78Var8).i(str13, str, strD0);
                            if (hebVar == xx1Var) {
                            }
                        }
                        break;
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                        e11.e0(obj);
                        break;
                    default:
                        gp.j("call to 'resume' before 'invoke' with coroutine");
                        break;
                }
                hra.O(hraVar2);
                hra.P(hraVar2);
                break;
        }
        return hebVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u41(qtb qtbVar, boolean z, String str, String str2, boolean z2, jt1 jt1Var, int i) {
        super(2, jt1Var);
        this.a = i;
        this.f = qtbVar;
        this.c = z;
        this.d = str;
        this.s = str2;
        this.e = z2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u41(boolean z, v41 v41Var, boolean z2, String str, jt1 jt1Var) {
        super(2, jt1Var);
        this.a = 0;
        this.c = z;
        this.s = v41Var;
        this.e = z2;
        this.d = str;
    }
}
