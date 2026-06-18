package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import androidx.work.impl.foreground.SystemForegroundService;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.regex.Pattern;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class wp0 implements ib4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ wp0(a07 a07Var, vx1 vx1Var, a07 a07Var2, wq5 wq5Var) {
        this.a = 19;
        this.b = a07Var;
        this.d = vx1Var;
        this.c = a07Var2;
        this.e = wq5Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [jt1] */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r1v16, types: [kb4] */
    /* JADX WARN: Type inference failed for: r1v48, types: [yb4] */
    @Override // defpackage.ib4
    public final Object invoke() {
        kq5 kq5Var;
        qu5 qu5Var;
        Object value;
        Object value2;
        Object value3;
        int i = 1;
        ?? r10 = 0;
        switch (this.a) {
            case 0:
                vx1 vx1Var = (vx1) this.d;
                a07 a07Var = (a07) this.b;
                fxb fxbVar = (fxb) this.e;
                a07 a07Var2 = (a07) this.c;
                heb hebVar = heb.a;
                if (((Boolean) a07Var.getValue()).booleanValue()) {
                    a07Var.setValue(Boolean.FALSE);
                } else {
                    ah1.J(vx1Var, null, null, new eq0(fxbVar, a07Var2, r10, i), 3);
                }
                return hebVar;
            case 1:
                e71 e71Var = (e71) this.d;
                a07 a07Var3 = (a07) this.b;
                a07 a07Var4 = (a07) this.c;
                a07 a07Var5 = (a07) this.e;
                a07Var3.setValue(Boolean.FALSE);
                String str = (String) a07Var4.getValue();
                bi5 bi5Var = (bi5) a07Var5.getValue();
                str.getClass();
                Long lN = iw9.N(e71Var.c);
                if (lN != null) {
                    long jLongValue = lN.longValue();
                    String string = bw9.B0(str).toString();
                    if (string.length() != 0 && !((t61) e71Var.s.getValue()).v) {
                        za1 za1VarA = vtb.a(e71Var);
                        aj2 aj2Var = rw2.a;
                        e71Var.g(za1VarA, nh2.c, new c71(e71Var, jLongValue, string, bi5Var, null));
                    }
                }
                return heb.a;
            case 2:
                dd4 dd4Var = (dd4) this.d;
                e11 e11Var = (e11) this.b;
                ni9 ni9Var = (ni9) this.c;
                kw6 kw6Var = (kw6) this.e;
                wl1 wl1Var = dd4Var.M;
                e11 e11Var2 = wl1Var.b;
                try {
                    wl1Var.b = e11Var;
                    ni9 ni9Var2 = dd4Var.G;
                    int[] iArr = dd4Var.o;
                    wy6 wy6Var = dd4Var.v;
                    dd4Var.o = null;
                    dd4Var.v = null;
                    try {
                        dd4Var.G = ni9Var;
                        boolean z = wl1Var.e;
                        try {
                            wl1Var.e = false;
                            dd4Var.H(kw6Var.a, kw6Var.g, kw6Var.b, true);
                            wl1Var.b = e11Var2;
                            return heb.a;
                        } finally {
                            wl1Var.e = z;
                        }
                    } finally {
                        dd4Var.G = ni9Var2;
                        dd4Var.o = iArr;
                        dd4Var.v = wy6Var;
                    }
                } catch (Throwable th) {
                    wl1Var.b = e11Var2;
                    throw th;
                }
            case 3:
                Float f = (Float) this.d;
                d75 d75Var = (d75) this.b;
                Float f2 = (Float) this.c;
                c75 c75Var = (c75) this.e;
                if (!f.equals(d75Var.a) || !f2.equals(d75Var.b)) {
                    d75Var.a = f;
                    d75Var.b = f2;
                    d75Var.d = new daa(c75Var, ah1.t0, f, f2, (vo) null);
                    d75Var.t.b.setValue(Boolean.TRUE);
                    d75Var.e = false;
                    d75Var.f = true;
                }
                return heb.a;
            case 4:
                ?? r1 = (kb4) this.d;
                an2 an2Var = (uk9) this.c;
                a07 a07Var6 = (a07) this.b;
                br9 br9Var = (br9) this.e;
                String str2 = ((wga) a07Var6.getValue()).a.b;
                Pattern patternCompile = Pattern.compile("(https?:\\/\\/(?:www\\.|(?!www))[a-zA-Z0-9\\u00A0-\\uD7FF\\uF900-\\uFDCF\\uFDF0-\\uFFEF][a-zA-Z0-9-\\u00A0-\\uD7FF\\uF900-\\uFDCF\\uFDF0-\\uFFEF]+[a-zA-Z0-9\\u00A0-\\uD7FF\\uF900-\\uFDCF\\uFDF0-\\uFFEF]\\.[^\\s]{2,}|www\\.[a-zA-Z0-9\\u00A0-\\uD7FF\\uF900-\\uFDCF\\uFDF0-\\uFFEF][a-zA-Z0-9-\\u00A0-\\uD7FF\\uF900-\\uFDCF\\uFDF0-\\uFFEF]+[a-zA-Z0-9\\u00A0-\\uD7FF\\uF900-\\uFDCF\\uFDF0-\\uFFEF]\\.[^\\s]{2,}|https?:\\/\\/(?:www\\.|(?!www))[a-zA-Z0-9\\u00A0-\\uD7FF\\uF900-\\uFDCF\\uFDF0-\\uFFEF]+\\.[^\\s]{2,}|www\\.[a-zA-Z0-9\\u00A0-\\uD7FF\\uF900-\\uFDCF\\uFDF0-\\uFFEF]+\\.[^\\s]{2,})");
                patternCompile.getClass();
                str2.getClass();
                if (!patternCompile.matcher(str2).matches()) {
                    Iterator it = ((jq0) br9Var.getValue()).b.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            Object next = it.next();
                            if (((hq0) next).a.equals(((jq0) br9Var.getValue()).a)) {
                                r10 = next;
                            }
                        }
                    }
                    hq0 hq0Var = (hq0) r10;
                    if (hq0Var != null) {
                        r1.invoke(tn9.i(hq0Var.c, new Object[]{str2}));
                    }
                } else if (iw9.K(str2, "http", false)) {
                    r1.invoke(str2);
                } else {
                    r1.invoke("https://".concat(str2));
                }
                if (an2Var != null) {
                    an2Var.a();
                }
                return heb.a;
            case 5:
                wq5 wq5Var = (wq5) this.d;
                br9 br9Var2 = (br9) this.b;
                br9 br9Var3 = (br9) this.c;
                br9 br9Var4 = (br9) this.e;
                jq5 jq5VarJ = wq5Var.j();
                int i2 = jq5VarJ.p;
                List list = jq5VarJ.m;
                if (i2 != 0 && (kq5Var = (kq5) br9Var2.getValue()) != null) {
                    int i3 = wq5Var.i();
                    int i4 = (int) (kq5Var.t & 4294967295L);
                    float f3 = i4 == 0 ? 0.0f : i3 / i4;
                    kq5 kq5Var2 = (kq5) fc1.E0(list);
                    int i5 = jq5VarJ.o;
                    int i6 = (int) (kq5Var2.t & 4294967295L);
                    size = ((((list.size() / ((Number) br9Var3.getValue()).intValue()) - (((Boolean) br9Var4.getValue()).booleanValue() ? 1 : 0)) - f3) - (1.0f - (i6 != 0 ? (i5 - ((int) (4294967295L & kq5Var2.u))) / i6 : 0.0f))) / (jq5VarJ.p / ((Number) br9Var3.getValue()).intValue());
                }
                return Float.valueOf(size);
            case 6:
                uu5 uu5Var = (uu5) this.d;
                br9 br9Var5 = (br9) this.b;
                br9 br9Var6 = (br9) this.c;
                br9 br9Var7 = (br9) this.e;
                ou5 ou5VarG = uu5Var.g();
                int i7 = ou5VarG.l;
                List list2 = ou5VarG.m;
                if (i7 != 0 && (qu5Var = (qu5) br9Var5.getValue()) != null) {
                    int iH = ((zm7) uu5Var.c.f).h();
                    int i8 = (int) (qu5Var.s & 4294967295L);
                    float f4 = i8 == 0 ? 0.0f : iH / i8;
                    qu5 qu5Var2 = (qu5) fc1.E0(list2);
                    int i9 = ou5VarG.p;
                    int i10 = (int) (qu5Var2.s & 4294967295L);
                    size = ((((list2.size() / ((Number) br9Var6.getValue()).intValue()) - (((Boolean) br9Var7.getValue()).booleanValue() ? 1 : 0)) - f4) - (1.0f - (i10 != 0 ? (i9 - ((int) (4294967295L & qu5Var2.t))) / i10 : 0.0f))) / (ou5VarG.l / ((Number) br9Var6.getValue()).intValue());
                }
                return Float.valueOf(size);
            case 7:
                dc dcVar = (u90) this.d;
                m56 m56Var = (m56) this.e;
                a07 a07Var7 = (a07) this.b;
                a07 a07Var8 = (a07) this.c;
                if (dcVar != null) {
                    dcVar.a.a();
                }
                String str3 = (String) a07Var7.getValue();
                String str4 = (String) a07Var8.getValue();
                str3.getClass();
                str4.getClass();
                za1 za1VarA2 = vtb.a(m56Var);
                aj2 aj2Var2 = rw2.a;
                m56Var.g(za1VarA2, nh2.c, new vg(m56Var, str3, str4, (jt1) null, 26));
                return heb.a;
            case 8:
                ?? r12 = (yb4) this.d;
                kb4 kb4Var = (kb4) this.e;
                a07 a07Var9 = (a07) this.b;
                a07 a07Var10 = (a07) this.c;
                Boolean bool = (Boolean) a07Var9.getValue();
                bool.booleanValue();
                r12.invoke(bool, (List) a07Var10.getValue());
                kb4Var.invoke(Boolean.FALSE);
                return heb.a;
            case 9:
                g95 g95Var = (g95) this.d;
                ib4 ib4Var = (ib4) this.b;
                kb4 kb4Var2 = (kb4) this.c;
                ib4 ib4Var2 = (ib4) this.e;
                wl4 wl4Var = new wl4(2, ib4Var, kb4Var2);
                wl4 wl4Var2 = new wl4(3, ib4Var2, kb4Var2);
                fr9 fr9Var = g95Var.d;
                String str5 = ((f95) fr9Var.getValue()).a;
                if (!bw9.a0(str5)) {
                    if (fr9Var != null) {
                        do {
                            value = fr9Var.getValue();
                        } while (!fr9Var.j(value, f95.a((f95) value, j95.d, null, 5)));
                    }
                    za1 za1VarA3 = vtb.a(g95Var);
                    aj2 aj2Var3 = rw2.a;
                    g95Var.g(za1VarA3, nh2.c, new ug(g95Var, str5, wl4Var, wl4Var2, null, 11));
                }
                return heb.a;
            case 10:
                i95 i95Var = (i95) this.d;
                ib4 ib4Var3 = (ib4) this.b;
                kb4 kb4Var3 = (kb4) this.c;
                ib4 ib4Var4 = (ib4) this.e;
                wl4 wl4Var3 = new wl4(4, ib4Var3, kb4Var3);
                wl4 wl4Var4 = new wl4(5, ib4Var4, kb4Var3);
                fr9 fr9Var2 = i95Var.e;
                String str6 = ((h95) fr9Var2.getValue()).a;
                if (!bw9.a0(str6)) {
                    if (fr9Var2 != null) {
                        do {
                            value2 = fr9Var2.getValue();
                        } while (!fr9Var2.j(value2, h95.a((h95) value2, j95.d, null, 5)));
                    }
                    za1 za1VarA4 = vtb.a(i95Var);
                    aj2 aj2Var4 = rw2.a;
                    i95Var.g(za1VarA4, nh2.c, new ug(i95Var, str6, wl4Var3, wl4Var4, null, 12));
                }
                return heb.a;
            case 11:
                kb4 kb4Var4 = (kb4) this.d;
                Long[] lArr = (Long[]) this.e;
                a07 a07Var11 = (a07) this.b;
                a07 a07Var12 = (a07) this.c;
                if (((Number) a07Var11.getValue()).intValue() == 5) {
                    Long lN2 = iw9.N(((wga) a07Var12.getValue()).a.b);
                    kb4Var4.invoke(Long.valueOf((lN2 != null ? lN2.longValue() : 0L) * 60));
                } else {
                    kb4Var4.invoke(lArr[((Number) a07Var11.getValue()).intValue()]);
                }
                return heb.a;
            case 12:
                List<zd1> list3 = (List) this.d;
                String str7 = (String) this.e;
                a07 a07Var13 = (a07) this.b;
                a07 a07Var14 = (a07) this.c;
                for (zd1 zd1Var : list3) {
                    if (lc5.Q(zd1Var.a, str7)) {
                        a07Var13.setValue(zd1Var);
                        a07Var14.setValue(Boolean.TRUE);
                        return heb.a;
                    }
                }
                so9.n("Collection contains no element matching the predicate.");
                return null;
            case 13:
                y37 y37Var = (y37) this.d;
                nu8 nu8Var = (nu8) this.b;
                List list4 = (List) this.c;
                List list5 = (List) this.e;
                y37Var.c.setValue(nu8Var);
                y37Var.b.setValue(list4);
                y37Var.d.setValue(list5);
                return heb.a;
            case 14:
                return Boolean.valueOf(((Boolean) ((a07) this.b).getValue()).booleanValue() || ((Boolean) ((a07) this.c).getValue()).booleanValue() || ((Boolean) ((a07) this.d).getValue()).booleanValue() || ((Boolean) ((a07) this.e).getValue()).booleanValue());
            case 15:
                hra hraVar = (hra) this.d;
                a07 a07Var15 = (a07) this.b;
                a07 a07Var16 = (a07) this.c;
                a07 a07Var17 = (a07) this.e;
                Boolean bool2 = Boolean.FALSE;
                a07Var15.setValue(bool2);
                rj9.f(a07Var16, true);
                a07Var17.setValue(bool2);
                hraVar.V();
                return heb.a;
            case 16:
                zlb zlbVar = (zlb) this.d;
                joa joaVar = (joa) this.b;
                ym7 ym7Var = (ym7) this.c;
                ym7 ym7Var2 = (ym7) this.e;
                float fC = wlb.c(zlbVar.a(sg9.b(Float.MAX_VALUE, Float.MAX_VALUE)));
                ur9 ur9Var = zma.a;
                if (ym7Var.h() > ym7Var2.h() * 0.25f || fC > 1500.0f) {
                    joaVar.k();
                } else {
                    ym7Var.i(0.0f);
                }
                return heb.a;
            case 17:
                String str8 = (String) this.b;
                ng8 ng8Var = (ng8) this.c;
                vx1 vx1Var2 = (vx1) this.d;
                qta qtaVar = (qta) this.e;
                StringBuilder sbM = dx1.m("TileManager. updateTileSnapshotList:", str8, ". end. running=");
                sbM.append(ng8Var.a);
                sbM.append(", active=");
                sbM.append(wx1.k0(vx1Var2));
                sbM.append(". '");
                return j39.j(qtaVar.b, sbM, '\'');
            case 18:
                c1b c1bVar = (c1b) this.d;
                mn8 mn8Var = (mn8) this.e;
                a07 a07Var18 = (a07) this.b;
                a07 a07Var19 = (a07) this.c;
                String strS = mn8Var.a.s();
                wj8 wj8Var = (wj8) a07Var18.getValue();
                Long lValueOf = wj8Var != null ? Long.valueOf(wj8Var.a) : null;
                List list6 = (List) a07Var19.getValue();
                list6.getClass();
                fr9 fr9Var3 = c1bVar.f;
                xq2 xq2Var = ((b1b) fr9Var3.getValue()).f;
                if (xq2Var != null && !((b1b) fr9Var3.getValue()).e) {
                    if (fr9Var3 != null) {
                        do {
                            value3 = fr9Var3.getValue();
                        } while (!fr9Var3.j(value3, b1b.a((b1b) value3, false, false, false, false, true, null, null, Token.ASSIGN_DIV)));
                    }
                    za1 za1VarA5 = vtb.a(c1bVar);
                    aj2 aj2Var5 = rw2.a;
                    c1bVar.g(za1VarA5, nh2.c, new tf(c1bVar, xq2Var, strS, lValueOf, list6, (jt1) null));
                }
                return heb.a;
            case 19:
                fz1.J((vx1) this.d, (a07) this.c, (wq5) this.e, ((Number) ((a07) this.b).getValue()).intValue());
                return heb.a;
            default:
                m1c m1cVar = (m1c) this.d;
                UUID uuid = (UUID) this.b;
                f84 f84Var = (f84) this.c;
                Context context = (Context) this.e;
                String string2 = uuid.toString();
                d2c d2cVarE = m1cVar.c.e(string2);
                if (d2cVarE == null || d2cVarE.b.a()) {
                    gp.j("Calls to setForegroundAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
                } else {
                    l38 l38Var = m1cVar.b;
                    synchronized (l38Var.k) {
                        try {
                            cp4.k().l(l38.l, "Moving WorkSpec (" + string2 + ") to the foreground");
                            t2c t2cVar = (t2c) l38Var.g.remove(string2);
                            if (t2cVar != null) {
                                if (l38Var.a == null) {
                                    PowerManager.WakeLock wakeLockA = ivb.a(l38Var.b);
                                    l38Var.a = wakeLockA;
                                    wakeLockA.acquire();
                                }
                                l38Var.f.put(string2, t2cVar);
                                hs1.startForegroundService(l38Var.b, v6a.c(l38Var.b, ql9.t(t2cVar.a), f84Var));
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                        break;
                    }
                    n1c n1cVarT = ql9.t(d2cVarE);
                    String str9 = v6a.v;
                    Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
                    intent.setAction("ACTION_NOTIFY");
                    intent.putExtra("KEY_NOTIFICATION_ID", f84Var.a);
                    intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", f84Var.b);
                    intent.putExtra("KEY_NOTIFICATION", f84Var.c);
                    intent.putExtra("KEY_WORKSPEC_ID", n1cVarT.a);
                    intent.putExtra("KEY_GENERATION", n1cVarT.b);
                    context.startService(intent);
                }
                return null;
        }
    }

    public /* synthetic */ wp0(kb4 kb4Var, uk9 uk9Var, a07 a07Var, br9 br9Var) {
        this.a = 4;
        this.d = kb4Var;
        this.c = uk9Var;
        this.b = a07Var;
        this.e = br9Var;
    }

    public /* synthetic */ wp0(vx1 vx1Var, a07 a07Var, fxb fxbVar, a07 a07Var2) {
        this.a = 0;
        this.d = vx1Var;
        this.b = a07Var;
        this.e = fxbVar;
        this.c = a07Var2;
    }

    public /* synthetic */ wp0(Object obj, Object obj2, a07 a07Var, a07 a07Var2, int i) {
        this.a = i;
        this.d = obj;
        this.e = obj2;
        this.b = a07Var;
        this.c = a07Var2;
    }

    public /* synthetic */ wp0(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.a = i;
        this.d = obj;
        this.b = obj2;
        this.c = obj3;
        this.e = obj4;
    }

    public /* synthetic */ wp0(Object obj, Object obj2, Object obj3, Object obj4, int i, boolean z) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }
}
