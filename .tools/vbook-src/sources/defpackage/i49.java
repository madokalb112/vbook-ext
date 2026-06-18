package defpackage;

import android.text.TextPaint;
import java.text.BreakIterator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class i49 implements yb4 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ a07 b;
    public final /* synthetic */ a07 c;
    public final /* synthetic */ a07 d;
    public final /* synthetic */ a07 e;
    public final /* synthetic */ a07 f;
    public final /* synthetic */ a07 s;
    public final /* synthetic */ Object t;
    public final /* synthetic */ Object u;
    public final /* synthetic */ Object v;
    public final /* synthetic */ br9 w;
    public final /* synthetic */ br9 x;
    public final /* synthetic */ br9 y;

    public /* synthetic */ i49(st5 st5Var, jka jkaVar, jj4 jj4Var, a07 a07Var, a07 a07Var2, a07 a07Var3, a07 a07Var4, a07 a07Var5, a07 a07Var6, a07 a07Var7, a07 a07Var8, a07 a07Var9) {
        this.t = st5Var;
        this.u = jkaVar;
        this.v = jj4Var;
        this.b = a07Var;
        this.c = a07Var2;
        this.d = a07Var3;
        this.e = a07Var4;
        this.f = a07Var5;
        this.s = a07Var6;
        this.w = a07Var7;
        this.x = a07Var8;
        this.y = a07Var9;
    }

    @Override // defpackage.yb4
    public final Object invoke(Object obj, Object obj2) {
        a07 a07Var;
        w1b w1bVar;
        kb4 kb4Var;
        h49 h49Var;
        String str;
        String str2;
        h49 h49Var2;
        br9 br9Var;
        yt7 yt7Var;
        int iPreceding;
        int iPreceding2;
        int iFollowing;
        int iFollowing2;
        long jH;
        yia[] yiaVarArr;
        yia[] yiaVarArr2;
        Object next;
        int i = this.a;
        a07 a07Var2 = this.y;
        a07 a07Var3 = this.x;
        a07 a07Var4 = this.w;
        a07 a07Var5 = this.s;
        br9 br9Var2 = this.f;
        a07 a07Var6 = this.e;
        a07 a07Var7 = this.d;
        a07 a07Var8 = this.c;
        a07 a07Var9 = this.b;
        Object obj3 = this.v;
        Object obj4 = this.u;
        Object obj5 = this.t;
        switch (i) {
            case 0:
                h49 h49Var3 = (h49) obj5;
                t27 t27Var = (t27) obj4;
                br9 br9Var3 = (br9) obj3;
                dd4 dd4Var = (dd4) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (dd4Var.V(iIntValue & 1, (iIntValue & 3) != 2)) {
                    w1b w1bVar2 = ((urb) br9Var3.getValue()).f;
                    Object objQ = dd4Var.Q();
                    Object obj6 = vl1.a;
                    if (objQ == obj6) {
                        objQ = new qsb();
                        dd4Var.p0(objQ);
                    }
                    qsb qsbVar = (qsb) objQ;
                    a07 a07VarB = bx1.B(qsbVar.m, dd4Var);
                    a07 a07VarB2 = bx1.B(qsbVar.l, dd4Var);
                    a07 a07VarB3 = bx1.B(qsbVar.k, dd4Var);
                    a07 a07VarB4 = bx1.B(qsbVar.h, dd4Var);
                    boolean zF = dd4Var.f(w1bVar2) | dd4Var.d(((ipb) a07Var4.getValue()).a) | dd4Var.d(((urb) br9Var3.getValue()).e);
                    Object objQ2 = dd4Var.Q();
                    if (zF || objQ2 == obj6) {
                        int i2 = ((ipb) a07Var4.getValue()).a;
                        int i3 = ((urb) br9Var3.getValue()).e;
                        a07Var = a07Var2;
                        String str3 = w1bVar2 != null ? w1bVar2.b : null;
                        w1bVar = w1bVar2;
                        objQ2 = i2 + "_" + i3 + "_" + (str3 != null ? str3.hashCode() : 0);
                        dd4Var.p0(objQ2);
                    } else {
                        w1bVar = w1bVar2;
                        a07Var = a07Var2;
                    }
                    String str4 = (String) objQ2;
                    boolean zF2 = dd4Var.f(str4);
                    Object objQ3 = dd4Var.Q();
                    if (zF2 || objQ3 == obj6) {
                        objQ3 = dk9.x((Object) null);
                        dd4Var.p0(objQ3);
                    }
                    a07 a07Var10 = (a07) objQ3;
                    boolean zF3 = dd4Var.f(str4);
                    Object objQ4 = dd4Var.Q();
                    if (zF3 || objQ4 == obj6) {
                        objQ4 = dk9.x(Boolean.FALSE);
                        dd4Var.p0(objQ4);
                    }
                    a07 a07Var11 = (a07) objQ4;
                    boolean zF4 = dd4Var.f(str4);
                    Object objQ5 = dd4Var.Q();
                    if (zF4 || objQ5 == obj6) {
                        objQ5 = dk9.x(Boolean.FALSE);
                        dd4Var.p0(objQ5);
                    }
                    a07 a07Var12 = (a07) objQ5;
                    Object objQ6 = dd4Var.Q();
                    if (objQ6 == obj6) {
                        objQ6 = dk9.x(Boolean.FALSE);
                        dd4Var.p0(objQ6);
                    }
                    a07 a07Var13 = (a07) objQ6;
                    onb onbVar = (onb) a07Var6.getValue();
                    double d = ((ipb) a07Var4.getValue()).d;
                    long jLongValue = ((Number) a07VarB4.getValue()).longValue();
                    Long l = (Long) a07Var10.getValue();
                    boolean zBooleanValue = ((Boolean) a07Var11.getValue()).booleanValue();
                    boolean zBooleanValue2 = ((Boolean) a07Var13.getValue()).booleanValue();
                    boolean zF5 = dd4Var.f(a07Var11);
                    Object objQ7 = dd4Var.Q();
                    if (zF5 || objQ7 == obj6) {
                        objQ7 = new hp8(a07Var11, 9);
                        dd4Var.p0(objQ7);
                    }
                    kb4 kb4Var2 = (kb4) objQ7;
                    boolean zF6 = dd4Var.f(a07Var10);
                    Object objQ8 = dd4Var.Q();
                    if (zF6 || objQ8 == obj6) {
                        objQ8 = new hp8(a07Var10, 10);
                        dd4Var.p0(objQ8);
                    }
                    kb4 kb4Var3 = (kb4) objQ8;
                    Object objQ9 = dd4Var.Q();
                    if (objQ9 == obj6) {
                        kb4Var = kb4Var2;
                        objQ9 = new hp8(a07Var13, 11);
                        dd4Var.p0(objQ9);
                    } else {
                        kb4Var = kb4Var2;
                    }
                    kb4 kb4Var4 = (kb4) objQ9;
                    boolean zF7 = dd4Var.f(h49Var3);
                    Object objQ10 = dd4Var.Q();
                    if (zF7 || objQ10 == obj6) {
                        objQ10 = new r51(2, h49Var3, h49.class, "saveLastReadProgress", "saveLastReadProgress(JJ)V", 0, 9);
                        dd4Var.p0(objQ10);
                    }
                    yb4 yb4Var = (yb4) ((ei5) objQ10);
                    boolean zF8 = dd4Var.f(h49Var3);
                    Object objQ11 = dd4Var.Q();
                    if (zF8 || objQ11 == obj6) {
                        objQ11 = new m98(0, h49Var3, h49.class, "onPlaybackFinished", "onPlaybackFinished()V", 0, 22);
                        h49Var = h49Var3;
                        dd4Var.p0(objQ11);
                    } else {
                        h49Var = h49Var3;
                    }
                    ib4 ib4Var = (ib4) ((ei5) objQ11);
                    boolean zF9 = dd4Var.f(h49Var);
                    Object objQ12 = dd4Var.Q();
                    if (zF9 || objQ12 == obj6) {
                        objQ12 = new n98(1, h49Var, h49.class, "changeVolume", "changeVolume(F)V", 0, 10);
                        dd4Var.p0(objQ12);
                    }
                    kl8.E(qsbVar, w1bVar, onbVar, str4, d, jLongValue, l, zBooleanValue, zBooleanValue2, kb4Var, kb4Var3, kb4Var4, yb4Var, ib4Var, (kb4) ((ei5) objQ12), dd4Var, 64);
                    urb urbVar = (urb) br9Var3.getValue();
                    onb onbVar2 = (onb) a07Var6.getValue();
                    boolean zBooleanValue3 = ((Boolean) a07VarB.getValue()).booleanValue();
                    boolean zBooleanValue4 = ((Boolean) a07VarB2.getValue()).booleanValue();
                    boolean zF10 = dd4Var.f(h49Var);
                    Object objQ13 = dd4Var.Q();
                    if (zF10 || objQ13 == obj6) {
                        objQ13 = new r51(2, h49Var, h49.class, "saveLastReadProgress", "saveLastReadProgress(JJ)V", 0, 10);
                        dd4Var.p0(objQ13);
                    }
                    kl8.G(qsbVar, w1bVar, urbVar, onbVar2, zBooleanValue3, zBooleanValue4, (yb4) ((ei5) objQ13), dd4Var, 64);
                    if (((urb) br9Var3.getValue()).b || ((Boolean) a07VarB3.getValue()).booleanValue()) {
                        dd4Var.f0(-2995971);
                        String str5 = ((urb) br9Var3.getValue()).c;
                        ou6 ou6VarL = fe.L(tg9.c, ((q96) dd4Var.j(s96.a)).a.p, jf0.G);
                        boolean zF11 = dd4Var.f(h49Var);
                        Object objQ14 = dd4Var.Q();
                        if (zF11 || objQ14 == obj6) {
                            objQ14 = new m98(0, h49Var, h49.class, "refreshCurrentEpisode", "refreshCurrentEpisode()V", 0, 23);
                            dd4Var.p0(objQ14);
                        }
                        kl8.H(3072, (ib4) ((ei5) objQ14), dd4Var, ou6VarL, str5, false);
                        dd4Var.q(false);
                    } else {
                        dd4Var.f0(-2613896);
                        dd4Var.q(false);
                    }
                    boolean zBooleanValue5 = ((Boolean) a07Var3.getValue()).booleanValue();
                    onb onbVar3 = (onb) a07Var6.getValue();
                    String str6 = ((lnb) a07Var.getValue()).b;
                    String str7 = ((ipb) a07Var4.getValue()).b;
                    urb urbVar2 = (urb) br9Var3.getValue();
                    boolean zBooleanValue6 = ((Boolean) a07Var9.getValue()).booleanValue();
                    boolean zBooleanValue7 = ((Boolean) a07Var7.getValue()).booleanValue();
                    boolean zBooleanValue8 = ((Boolean) br9Var2.getValue()).booleanValue();
                    boolean zBooleanValue9 = ((Boolean) a07Var5.getValue()).booleanValue();
                    boolean zBooleanValue10 = ((Boolean) a07Var8.getValue()).booleanValue();
                    Long l2 = (Long) a07Var10.getValue();
                    boolean zBooleanValue11 = ((Boolean) a07Var12.getValue()).booleanValue();
                    boolean zF12 = dd4Var.f(a07Var12);
                    Object objQ15 = dd4Var.Q();
                    if (zF12 || objQ15 == obj6) {
                        objQ15 = new hp8(a07Var12, 12);
                        dd4Var.p0(objQ15);
                    }
                    kb4 kb4Var5 = (kb4) objQ15;
                    boolean zF13 = dd4Var.f(t27Var);
                    Object objQ16 = dd4Var.Q();
                    if (zF13 || objQ16 == obj6) {
                        objQ16 = new m98(0, t27Var, t27.class, "navigateUp", "navigateUp()V", 0, 17);
                        dd4Var.p0(objQ16);
                    }
                    ib4 ib4Var2 = (ib4) ((ei5) objQ16);
                    boolean zF14 = dd4Var.f(a07Var9);
                    Object objQ17 = dd4Var.Q();
                    if (zF14 || objQ17 == obj6) {
                        objQ17 = new bq6(a07Var9, 26);
                        dd4Var.p0(objQ17);
                    }
                    ib4 ib4Var3 = (ib4) objQ17;
                    boolean zF15 = dd4Var.f(a07Var8);
                    Object objQ18 = dd4Var.Q();
                    if (zF15 || objQ18 == obj6) {
                        objQ18 = new bq6(a07Var8, 27);
                        dd4Var.p0(objQ18);
                    }
                    ib4 ib4Var4 = (ib4) objQ18;
                    boolean zF16 = dd4Var.f(a07Var7);
                    Object objQ19 = dd4Var.Q();
                    if (zF16 || objQ19 == obj6) {
                        objQ19 = new bq6(a07Var7, 28);
                        dd4Var.p0(objQ19);
                    }
                    ib4 ib4Var5 = (ib4) objQ19;
                    boolean zF17 = dd4Var.f(a07Var10);
                    Object objQ20 = dd4Var.Q();
                    if (zF17 || objQ20 == obj6) {
                        objQ20 = new hp8(a07Var10, 13);
                        dd4Var.p0(objQ20);
                    }
                    kb4 kb4Var6 = (kb4) objQ20;
                    boolean zF18 = dd4Var.f(h49Var);
                    Object objQ21 = dd4Var.Q();
                    if (zF18 || objQ21 == obj6) {
                        str = str7;
                        str2 = str6;
                        h49Var2 = h49Var;
                        n98 n98Var = new n98(1, h49Var2, h49.class, "changePlaybackSpeed", "changePlaybackSpeed(F)V", 0, 3);
                        dd4Var.p0(n98Var);
                        objQ21 = n98Var;
                    } else {
                        str2 = str6;
                        h49Var2 = h49Var;
                        str = str7;
                    }
                    kb4 kb4Var7 = (kb4) ((ei5) objQ21);
                    boolean zF19 = dd4Var.f(h49Var2);
                    Object objQ22 = dd4Var.Q();
                    if (zF19 || objQ22 == obj6) {
                        m98 m98Var = new m98(0, h49Var2, h49.class, "readNextEpisode", "readNextEpisode()V", 0, 18);
                        dd4Var.p0(m98Var);
                        objQ22 = m98Var;
                    }
                    ib4 ib4Var6 = (ib4) ((ei5) objQ22);
                    boolean zF20 = dd4Var.f(h49Var2);
                    Object objQ23 = dd4Var.Q();
                    if (zF20 || objQ23 == obj6) {
                        m98 m98Var2 = new m98(0, h49Var2, h49.class, "readPrevEpisode", "readPrevEpisode()V", 0, 19);
                        dd4Var.p0(m98Var2);
                        objQ23 = m98Var2;
                    }
                    ib4 ib4Var7 = (ib4) ((ei5) objQ23);
                    boolean zF21 = dd4Var.f(h49Var2);
                    Object objQ24 = dd4Var.Q();
                    if (zF21 || objQ24 == obj6) {
                        n98 n98Var2 = new n98(1, h49Var2, h49.class, "changeScreenOrientation", "changeScreenOrientation(I)V", 0, 4);
                        dd4Var.p0(n98Var2);
                        objQ24 = n98Var2;
                    }
                    kb4 kb4Var8 = (kb4) ((ei5) objQ24);
                    boolean zF22 = dd4Var.f(h49Var2);
                    Object objQ25 = dd4Var.Q();
                    if (zF22 || objQ25 == obj6) {
                        n98 n98Var3 = new n98(1, h49Var2, h49.class, "changeBrightness", "changeBrightness(F)V", 0, 5);
                        dd4Var.p0(n98Var3);
                        objQ25 = n98Var3;
                    }
                    kb4 kb4Var9 = (kb4) ((ei5) objQ25);
                    boolean zF23 = dd4Var.f(h49Var2);
                    Object objQ26 = dd4Var.Q();
                    if (zF23 || objQ26 == obj6) {
                        n98 n98Var4 = new n98(1, h49Var2, h49.class, "changeVolume", "changeVolume(F)V", 0, 6);
                        dd4Var.p0(n98Var4);
                        objQ26 = n98Var4;
                    }
                    kb4 kb4Var10 = (kb4) ((ei5) objQ26);
                    boolean zF24 = dd4Var.f(h49Var2);
                    Object objQ27 = dd4Var.Q();
                    if (zF24 || objQ27 == obj6) {
                        n98 n98Var5 = new n98(1, h49Var2, h49.class, "changeMuted", "changeMuted(Z)V", 0, 7);
                        dd4Var.p0(n98Var5);
                        objQ27 = n98Var5;
                    }
                    kb4 kb4Var11 = (kb4) ((ei5) objQ27);
                    boolean zF25 = dd4Var.f(h49Var2);
                    Object objQ28 = dd4Var.Q();
                    if (zF25 || objQ28 == obj6) {
                        m98 m98Var3 = new m98(0, h49Var2, h49.class, "refreshCurrentEpisode", "refreshCurrentEpisode()V", 0, 20);
                        dd4Var.p0(m98Var3);
                        objQ28 = m98Var3;
                    }
                    ib4 ib4Var8 = (ib4) ((ei5) objQ28);
                    boolean zF26 = dd4Var.f(h49Var2);
                    Object objQ29 = dd4Var.Q();
                    if (zF26 || objQ29 == obj6) {
                        r51 r51Var = new r51(2, h49Var2, h49.class, "saveLastReadProgress", "saveLastReadProgress(JJ)V", 0, 8);
                        dd4Var.p0(r51Var);
                        objQ29 = r51Var;
                    }
                    yb4 yb4Var2 = (yb4) ((ei5) objQ29);
                    boolean zF27 = dd4Var.f(h49Var2);
                    Object objQ30 = dd4Var.Q();
                    if (zF27 || objQ30 == obj6) {
                        n98 n98Var6 = new n98(1, h49Var2, h49.class, "selectTrack", "selectTrack(I)V", 0, 8);
                        dd4Var.p0(n98Var6);
                        objQ30 = n98Var6;
                    }
                    kb4 kb4Var12 = (kb4) ((ei5) objQ30);
                    boolean zF28 = dd4Var.f(h49Var2);
                    Object objQ31 = dd4Var.Q();
                    if (zF28 || objQ31 == obj6) {
                        n98 n98Var7 = new n98(1, h49Var2, h49.class, "changeAutoResumeLastPosition", "changeAutoResumeLastPosition(Z)V", 0, 9);
                        dd4Var.p0(n98Var7);
                        objQ31 = n98Var7;
                    }
                    kl8.F(zBooleanValue5, qsbVar, onbVar3, str2, str, urbVar2, w1bVar, zBooleanValue6, zBooleanValue7, zBooleanValue8, zBooleanValue9, zBooleanValue10, l2, zBooleanValue11, kb4Var5, ib4Var2, ib4Var3, ib4Var4, ib4Var5, kb4Var6, kb4Var7, ib4Var6, ib4Var7, kb4Var8, kb4Var9, kb4Var10, kb4Var11, ib4Var8, yb4Var2, kb4Var12, (kb4) ((ei5) objQ31), dd4Var, 2097152);
                    if (((urb) br9Var3.getValue()).b || ((Boolean) a07VarB3.getValue()).booleanValue()) {
                        dd4Var.f0(-540182);
                        px3 px3Var = tg9.c;
                        boolean zF29 = dd4Var.f(h49Var2);
                        Object objQ32 = dd4Var.Q();
                        if (zF29 || objQ32 == obj6) {
                            m98 m98Var4 = new m98(0, h49Var2, h49.class, "refreshCurrentEpisode", "refreshCurrentEpisode()V", 0, 21);
                            dd4Var.p0(m98Var4);
                            objQ32 = m98Var4;
                        }
                        kl8.I(48, (ib4) ((ei5) objQ32), dd4Var, px3Var);
                        dd4Var.q(false);
                    } else {
                        dd4Var.f0(-355112);
                        dd4Var.q(false);
                    }
                } else {
                    dd4Var.Y();
                }
                return heb.a;
            default:
                st5 st5Var = (st5) obj5;
                jka jkaVar = (jka) obj4;
                yt7 yt7Var2 = (jj4) obj3;
                a07 a07Var14 = a07Var4;
                a07 a07Var15 = a07Var3;
                a07 a07Var16 = a07Var2;
                eb7 eb7Var = (eb7) obj;
                int i4 = 1;
                Boolean bool = (Boolean) obj2;
                boolean zBooleanValue12 = bool.booleanValue();
                float fIntBitsToFloat = Float.intBitsToFloat((int) (eb7Var.a >> 32));
                roa roaVar = yoa.a;
                float fFloatValue = fIntBitsToFloat - ((Number) a07Var9.getValue()).floatValue();
                long j = eb7Var.a;
                zoa zoaVarD = yoa.d(fFloatValue, Float.intBitsToFloat((int) (j & 4294967295L)) - ((Number) a07Var8.getValue()).floatValue(), ((Number) a07Var7.getValue()).intValue(), st5Var.j().k, st5Var.j().p, ((nca) a07Var6.getValue()).b);
                if (zoaVarD == null) {
                    yiaVarArr = new yia[0];
                    br9Var = br9Var2;
                    yt7Var = yt7Var2;
                } else {
                    int i5 = zoaVarD.b.b;
                    int i6 = zoaVarD.a.b;
                    jk jkVar = zoaVarD.c;
                    int i7 = zoaVarD.d;
                    pha phaVar = jkVar.c;
                    pha phaVar2 = jkVar.c;
                    br9Var = br9Var2;
                    TextPaint textPaint = jkVar.b;
                    int iQ = wx1.Q(i7, 0, phaVar.a.b.length() - 1);
                    List list = jkVar.d;
                    pja pjaVar = (pja) fc1.A0(gc1.F(new vl0(iQ, 13), list, list.size()), list);
                    if (pjaVar != null) {
                        jH = pjaVar.a;
                        yt7Var = yt7Var2;
                    } else {
                        uc6 uc6Var = jkVar.h;
                        if (uc6Var == null) {
                            Locale textLocale = textPaint.getTextLocale();
                            textLocale.getClass();
                            uc6Var = new uc6(textLocale, phaVar2.a.b);
                            jkVar.h = uc6Var;
                        }
                        s0c s0cVar = (s0c) uc6Var.a;
                        s0cVar.a(iQ);
                        BreakIterator breakIterator = s0cVar.e;
                        if (s0cVar.i(breakIterator.preceding(iQ))) {
                            s0cVar.a(iQ);
                            yt7Var = yt7Var2;
                            iPreceding = iQ;
                            while (iPreceding != -1 && (!s0cVar.i(iPreceding) || s0cVar.d(iPreceding))) {
                                s0cVar.a(iPreceding);
                                iPreceding = breakIterator.preceding(iPreceding);
                            }
                        } else {
                            yt7Var = yt7Var2;
                            s0cVar.a(iQ);
                            if (s0cVar.g(iQ)) {
                                if (!breakIterator.isBoundary(iQ) || s0cVar.b(iQ)) {
                                    iPreceding2 = breakIterator.preceding(iQ);
                                    iPreceding = iPreceding2;
                                } else {
                                    iPreceding = iQ;
                                }
                            } else if (s0cVar.b(iQ)) {
                                iPreceding2 = breakIterator.preceding(iQ);
                                iPreceding = iPreceding2;
                            } else {
                                iPreceding = -1;
                            }
                        }
                        if (iPreceding == -1) {
                            iPreceding = iQ;
                        }
                        uc6 uc6Var2 = jkVar.h;
                        if (uc6Var2 == null) {
                            Locale textLocale2 = textPaint.getTextLocale();
                            textLocale2.getClass();
                            uc6Var2 = new uc6(textLocale2, phaVar2.a.b);
                            jkVar.h = uc6Var2;
                        }
                        s0c s0cVar2 = (s0c) uc6Var2.a;
                        s0cVar2.a(iQ);
                        BreakIterator breakIterator2 = s0cVar2.e;
                        if (s0cVar2.d(breakIterator2.following(iQ))) {
                            s0cVar2.a(iQ);
                            iFollowing = iQ;
                            while (iFollowing != -1 && (s0cVar2.i(iFollowing) || !s0cVar2.d(iFollowing))) {
                                s0cVar2.a(iFollowing);
                                iFollowing = breakIterator2.following(iFollowing);
                            }
                        } else {
                            s0cVar2.a(iQ);
                            if (s0cVar2.b(iQ)) {
                                if (!breakIterator2.isBoundary(iQ) || s0cVar2.g(iQ)) {
                                    iFollowing2 = breakIterator2.following(iQ);
                                    iFollowing = iFollowing2;
                                } else {
                                    iFollowing = iQ;
                                }
                            } else if (s0cVar2.g(iQ)) {
                                iFollowing2 = breakIterator2.following(iQ);
                                iFollowing = iFollowing2;
                            } else {
                                iFollowing = -1;
                            }
                        }
                        if (iFollowing != -1) {
                            iQ = iFollowing;
                        }
                        jH = zk9.h(iPreceding, iQ);
                    }
                    yiaVarArr = new yia[]{new yia(i6, pja.g(jH) + i5), new yia(i6, (pja.f(jH) - 1) + i5)};
                }
                boolean z = yiaVarArr.length == 0;
                boolean z2 = !z;
                if (!z) {
                    yia yiaVar = (yia) fw.j0(yiaVarArr);
                    yia yiaVar2 = (yia) fw.y0(yiaVarArr);
                    Iterator it = ((List) br9Var.getValue()).iterator();
                    while (true) {
                        if (it.hasNext()) {
                            next = it.next();
                            gba gbaVar = (gba) next;
                            yiaVarArr2 = yiaVarArr;
                            if (gbaVar.e != i4 || !ri9.D(gbaVar, yiaVar.b, yiaVar2.b)) {
                                yiaVarArr = yiaVarArr2;
                                i4 = 1;
                            }
                        } else {
                            yiaVarArr2 = yiaVarArr;
                            next = null;
                        }
                    }
                    gba gbaVar2 = (gba) next;
                    yia[] yiaVarArr3 = gbaVar2 != null ? new yia[]{new yia(yiaVar.a, gbaVar2.i), new yia(yiaVar2.a, gbaVar2.j)} : new yia[0];
                    yia yiaVar3 = (yia) fw.k0(yiaVarArr3);
                    if (yiaVar3 == null) {
                        yiaVar3 = (yia) fw.j0(yiaVarArr2);
                    }
                    yia yiaVar4 = yiaVarArr3.length != 0 ? yiaVarArr3[yiaVarArr3.length - 1] : null;
                    if (yiaVar4 == null) {
                        yiaVar4 = (yia) fw.y0(yiaVarArr2);
                    }
                    yia yiaVar5 = yiaVar4;
                    jkaVar.f.setValue(bool);
                    if (zBooleanValue12) {
                        yt7Var.a(0);
                    }
                    jkaVar.a.setValue(t19.b);
                    a07Var5.setValue(yiaVar3);
                    yiaVar3.getClass();
                    jkaVar.b.setValue(yiaVar3);
                    yiaVar5.getClass();
                    jkaVar.c.setValue(yiaVar5);
                    a07Var14.setValue(new eb7(j));
                    Boolean bool2 = Boolean.TRUE;
                    a07Var15.setValue(bool2);
                    a07Var16.setValue(bool2);
                }
                return Boolean.valueOf(z2);
        }
    }

    public /* synthetic */ i49(h49 h49Var, t27 t27Var, a07 a07Var, a07 a07Var2, a07 a07Var3, br9 br9Var, br9 br9Var2, a07 a07Var4, br9 br9Var3, br9 br9Var4, a07 a07Var5, a07 a07Var6) {
        this.t = h49Var;
        this.u = t27Var;
        this.b = a07Var;
        this.c = a07Var2;
        this.d = a07Var3;
        this.v = br9Var;
        this.w = br9Var2;
        this.e = a07Var4;
        this.x = br9Var3;
        this.y = br9Var4;
        this.f = a07Var5;
        this.s = a07Var6;
    }
}
