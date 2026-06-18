package defpackage;

import android.content.Intent;
import android.support.v4.media.session.a;
import android.view.KeyEvent;
import android.webkit.WebView;
import androidx.media.session.MediaButtonReceiver;
import baidu.lac.jni.LacLib;
import baidu.lac.jni.NativeToken;
import com.reader.data.reader.text.core.tts.AndroidTextToSpeechService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class pg extends o1a implements yb4 {
    public final /* synthetic */ int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pg(Object obj, Object obj2, jt1 jt1Var, int i) {
        super(2, jt1Var);
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // defpackage.vc0
    public final jt1 create(Object obj, jt1 jt1Var) {
        int i = this.a;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                return new pg((qg) this.b, (String) obj2, jt1Var, 0);
            case 1:
                return new pg((AndroidTextToSpeechService) this.b, (Intent) obj2, jt1Var, 1);
            case 2:
                return new pg((AndroidTextToSpeechService) this.b, (String) obj2, jt1Var, 2);
            case 3:
                return new pg((oy0) this.b, (jh4) obj2, jt1Var, 3);
            case 4:
                return new pg((v41) this.b, (a07) obj2, jt1Var, 4);
            case 5:
                return new pg((xp4) this.b, (a07) obj2, jt1Var, 5);
            case 6:
                pg pgVar = new pg((j22) obj2, jt1Var, 6);
                pgVar.b = obj;
                return pgVar;
            case 7:
                pg pgVar2 = new pg((ar9) obj2, jt1Var, 7);
                pgVar2.b = obj;
                return pgVar2;
            case 8:
                pg pgVar3 = new pg((String) obj2, jt1Var, 8);
                pgVar3.b = obj;
                return pgVar3;
            case 9:
                return new pg((jv2) this.b, (a07) obj2, jt1Var, 9);
            case 10:
                return new pg((hb1) this.b, (a07) obj2, jt1Var, 10);
            case 11:
                pg pgVar4 = new pg((jo3) obj2, jt1Var, 11);
                pgVar4.b = obj;
                return pgVar4;
            case 12:
                return new pg((a07) this.b, (a07) obj2, jt1Var, 12);
            case 13:
                return new pg((s74) this.b, (String) obj2, jt1Var, 13);
            case 14:
                return new pg((owb) this.b, (String) obj2, jt1Var, 14);
            case 15:
                return new pg((ro4) this.b, (a07) obj2, jt1Var, 15);
            case 16:
                return new pg((m6a) this.b, (br9) obj2, jt1Var, 16);
            case 17:
                return new pg((h12) this.b, (o12) obj2, jt1Var, 17);
            case 18:
                pg pgVar5 = new pg((h12) obj2, jt1Var, 18);
                pgVar5.b = obj;
                return pgVar5;
            case 19:
                return new pg((mq0) this.b, (a07) obj2, jt1Var, 19);
            case 20:
                pg pgVar6 = new pg((ib4) obj2, jt1Var, 20);
                pgVar6.b = obj;
                return pgVar6;
            case 21:
                pg pgVar7 = new pg((xm5) obj2, jt1Var, 21);
                pgVar7.b = obj;
                return pgVar7;
            case 22:
                pg pgVar8 = new pg((qa6) obj2, jt1Var, 22);
                pgVar8.b = obj;
                return pgVar8;
            case 23:
                return new pg((l7) this.b, (String[]) obj2, jt1Var, 23);
            case 24:
                return new pg((ArrayList) this.b, (hk9) obj2, jt1Var, 24);
            case 25:
                return new pg((wt7) this.b, (byte[]) obj2, jt1Var, 25);
            case 26:
                return new pg((yk1) this.b, (cx5) obj2, jt1Var, 26);
            case 27:
                pg pgVar9 = new pg((yb4) obj2, jt1Var, 27);
                pgVar9.b = obj;
                return pgVar9;
            case 28:
                return new pg((Long) this.b, (qsb) obj2, jt1Var, 28);
            default:
                return new pg((qsb) this.b, (gqb) obj2, jt1Var, 29);
        }
    }

    @Override // defpackage.yb4
    public final Object invoke(Object obj, Object obj2) throws Exception {
        int i = this.a;
        heb hebVar = heb.a;
        switch (i) {
            case 0:
                return ((pg) create((vx1) obj, (jt1) obj2)).invokeSuspend(hebVar);
            case 1:
                ((pg) create((vx1) obj, (jt1) obj2)).invokeSuspend(hebVar);
                return hebVar;
            case 2:
                ((pg) create((vx1) obj, (jt1) obj2)).invokeSuspend(hebVar);
                return hebVar;
            case 3:
                ((pg) create((vx1) obj, (jt1) obj2)).invokeSuspend(hebVar);
                return hebVar;
            case 4:
                ((pg) create((vx1) obj, (jt1) obj2)).invokeSuspend(hebVar);
                return hebVar;
            case 5:
                ((pg) create((vx1) obj, (jt1) obj2)).invokeSuspend(hebVar);
                return hebVar;
            case 6:
                return ((pg) create((vx1) obj, (jt1) obj2)).invokeSuspend(hebVar);
            case 7:
                return ((pg) create((ar9) obj, (jt1) obj2)).invokeSuspend(hebVar);
            case 8:
                ((pg) create((pz6) obj, (jt1) obj2)).invokeSuspend(hebVar);
                return hebVar;
            case 9:
                ((pg) create((vx1) obj, (jt1) obj2)).invokeSuspend(hebVar);
                return hebVar;
            case 10:
                ((pg) create((vx1) obj, (jt1) obj2)).invokeSuspend(hebVar);
                return hebVar;
            case 11:
                ((pg) create((vx1) obj, (jt1) obj2)).invokeSuspend(hebVar);
                return hebVar;
            case 12:
                ((pg) create((vx1) obj, (jt1) obj2)).invokeSuspend(hebVar);
                return hebVar;
            case 13:
                ((pg) create((vx1) obj, (jt1) obj2)).invokeSuspend(hebVar);
                return hebVar;
            case 14:
                ((pg) create((vx1) obj, (jt1) obj2)).invokeSuspend(hebVar);
                return hebVar;
            case 15:
                ((pg) create((vx1) obj, (jt1) obj2)).invokeSuspend(hebVar);
                return hebVar;
            case 16:
                ((pg) create((vx1) obj, (jt1) obj2)).invokeSuspend(hebVar);
                return hebVar;
            case 17:
                ((pg) create((vx1) obj, (jt1) obj2)).invokeSuspend(hebVar);
                return hebVar;
            case 18:
                return ((pg) create((h12) obj, (jt1) obj2)).invokeSuspend(hebVar);
            case 19:
                ((pg) create((vx1) obj, (jt1) obj2)).invokeSuspend(hebVar);
                return hebVar;
            case 20:
                return ((pg) create((vx1) obj, (jt1) obj2)).invokeSuspend(hebVar);
            case 21:
                return ((pg) create((no5) obj, (jt1) obj2)).invokeSuspend(hebVar);
            case 22:
                ((pg) create((vx1) obj, (jt1) obj2)).invokeSuspend(hebVar);
                throw null;
            case 23:
                ((pg) create((vx1) obj, (jt1) obj2)).invokeSuspend(hebVar);
                return hebVar;
            case 24:
                ((pg) create((vx1) obj, (jt1) obj2)).invokeSuspend(hebVar);
                return hebVar;
            case 25:
                ((pg) create((vx1) obj, (jt1) obj2)).invokeSuspend(hebVar);
                return hebVar;
            case 26:
                ((pg) create((vx1) obj, (jt1) obj2)).invokeSuspend(hebVar);
                return hebVar;
            case 27:
                return ((pg) create((vx1) obj, (jt1) obj2)).invokeSuspend(hebVar);
            case 28:
                ((pg) create((vx1) obj, (jt1) obj2)).invokeSuspend(hebVar);
                return hebVar;
            default:
                ((pg) create((vx1) obj, (jt1) obj2)).invokeSuspend(hebVar);
                return hebVar;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.vc0
    public final Object invokeSuspend(Object obj) throws Exception {
        Object next;
        Object pm8Var;
        Object pm8Var2;
        Object pm8Var3;
        gqb gqbVar;
        int i = 2;
        int i2 = 4;
        int i3 = 3;
        boolean z = true;
        int i4 = 0;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        Object[] objArr5 = 0;
        Object[] objArr6 = 0;
        Object[] objArr7 = 0;
        Object[] objArr8 = 0;
        Object[] objArr9 = 0;
        Object[] objArr10 = 0;
        switch (this.a) {
            case 0:
                e11.e0(obj);
                NativeToken[] nativeTokenArrAnalyze = LacLib.analyze(((Number) ((qg) this.b).c.getValue()).longValue(), (String) this.c);
                if (nativeTokenArrAnalyze == null) {
                    return lc3.a;
                }
                ArrayList arrayList = new ArrayList(nativeTokenArrAnalyze.length);
                int length = nativeTokenArrAnalyze.length;
                while (i4 < length) {
                    NativeToken nativeToken = nativeTokenArrAnalyze[i4];
                    arrayList.add(new ql5(nativeToken.word, nativeToken.tag));
                    i4++;
                }
                return arrayList;
            case 1:
                e11.e0(obj);
                AndroidTextToSpeechService androidTextToSpeechService = (AndroidTextToSpeechService) this.b;
                int i5 = AndroidTextToSpeechService.H;
                rna rnaVar = ((zna) ((tna) androidTextToSpeechService.f.getValue())).a;
                if (((Boolean) rnaVar.d.c(rna.m[3], rnaVar)).booleanValue()) {
                    jd6 jd6Var = (jd6) androidTextToSpeechService.v.getValue();
                    Intent intent = (Intent) this.c;
                    int i6 = MediaButtonReceiver.a;
                    if (jd6Var != null && intent != null && "android.intent.action.MEDIA_BUTTON".equals(intent.getAction()) && intent.hasExtra("android.intent.extra.KEY_EVENT")) {
                        KeyEvent keyEvent = (KeyEvent) intent.getParcelableExtra("android.intent.extra.KEY_EVENT");
                        lp8 lp8Var = jd6Var.b;
                        if (keyEvent == null) {
                            lp8Var.getClass();
                            gp.l("KeyEvent may not be null");
                            return null;
                        }
                        ((a) lp8Var.b).a.dispatchMediaButtonEvent(keyEvent);
                    }
                }
                return heb.a;
            case 2:
                e11.e0(obj);
                AndroidTextToSpeechService androidTextToSpeechService2 = (AndroidTextToSpeechService) this.b;
                int i7 = AndroidTextToSpeechService.H;
                kl klVarD = androidTextToSpeechService2.d();
                String str = (String) this.c;
                klVarD.getClass();
                str.getClass();
                klVarD.f = str;
                synchronized (klVarD.c()) {
                    c87 c87VarC = klVarD.c();
                    c87VarC.getClass();
                    c87VarC.f = c87.c(str);
                    klVarD.e(klVarD.c(), 6);
                    klVarD.c.a(10001, klVarD.c().b());
                }
                return heb.a;
            case 3:
                e11.e0(obj);
                ((oy0) this.b).a = (jh4) this.c;
                return heb.a;
            case 4:
                e11.e0(obj);
                a07 a07Var = (a07) this.c;
                if (((Boolean) a07Var.getValue()).booleanValue()) {
                    v41 v41Var = (v41) this.b;
                    v41Var.f = 1;
                    v41Var.t = true;
                    v41Var.u = false;
                    v41Var.v.clear();
                    String str2 = v41Var.s;
                    za1 za1VarA = vtb.a(v41Var);
                    aj2 aj2Var = rw2.a;
                    v41Var.g(za1VarA, nh2.c, new u41(false, v41Var, false, str2, null));
                } else {
                    a07Var.setValue(Boolean.TRUE);
                }
                return heb.a;
            case 5:
                e11.e0(obj);
                ((a07) this.c).setValue((xp4) this.b);
                return heb.a;
            case 6:
                e11.e0(obj);
                vx1 vx1Var = (vx1) this.b;
                j22 j22Var = (j22) this.c;
                yd5 yd5Var = (yd5) j22Var.b.getAndSet(null);
                AtomicReference atomicReference = j22Var.b;
                oq9 oq9VarJ = ah1.J(vx1Var, null, null, new et1(yd5Var, j22Var, objArr == true ? 1 : 0, i2), 3);
                while (true) {
                    if (!atomicReference.compareAndSet(null, oq9VarJ)) {
                        if (atomicReference.get() != null) {
                            z = false;
                        }
                    }
                }
                return Boolean.valueOf(z);
            case 7:
                e11.e0(obj);
                ar9 ar9Var = (ar9) this.b;
                return Boolean.valueOf((ar9Var instanceof o32) && ((o32) ar9Var).a <= ((o32) ((ar9) this.c)).a);
            case 8:
                e11.e0(obj);
                ((pz6) this.b).d(i12.f0((String) this.c));
                return heb.a;
            case 9:
                e11.e0(obj);
                jv2 jv2Var = (jv2) this.b;
                String str3 = (String) ((a07) this.c).getValue();
                str3.getClass();
                if (!lc5.Q(jv2Var.N, str3)) {
                    jv2Var.N = str3;
                    yd5 yd5Var2 = jv2Var.V;
                    if (yd5Var2 != null) {
                        yd5Var2.cancel(null);
                    }
                    za1 za1VarA2 = vtb.a(jv2Var);
                    aj2 aj2Var2 = rw2.a;
                    jv2Var.V = jv2Var.g(za1VarA2, nh2.c, new ev2(jv2Var, objArr2 == true ? 1 : 0, i3));
                }
                return heb.a;
            case 10:
                e11.e0(obj);
                a07 a07Var2 = (a07) this.c;
                Iterator it = ((dn3) a07Var2.getValue()).b.iterator();
                while (true) {
                    if (it.hasNext()) {
                        next = it.next();
                        if (lc5.Q(((br3) next).a, ((dn3) a07Var2.getValue()).a)) {
                        }
                    } else {
                        next = null;
                    }
                }
                br3 br3Var = (br3) next;
                hb1 hb1Var = (hb1) this.b;
                String str4 = br3Var != null ? br3Var.b : null;
                if (str4 == null) {
                    str4 = "";
                }
                int length2 = str4.length();
                hb1Var.getClass();
                hb1Var.b.setValue(new wga(str4, zk9.h(length2, length2), 4));
                return heb.a;
            case 11:
                List list = lc3.a;
                e11.e0(obj);
                jo3 jo3Var = (jo3) this.c;
                qt qtVar = jo3Var.a;
                fr9 fr9Var = jo3Var.b;
                try {
                    te5 te5Var = ue5.d;
                    String str5 = (String) qtVar.P.c(qt.T[42], qtVar);
                    te5Var.getClass();
                    pm8Var = (List) te5Var.a(new wv(tv9.a, 0), str5);
                    break;
                } catch (Throwable th) {
                    pm8Var = new pm8(th);
                }
                if (pm8Var instanceof pm8) {
                    pm8Var = null;
                }
                List list2 = (List) pm8Var;
                if (list2 == null) {
                    list2 = list;
                }
                fr9Var.getClass();
                fr9Var.l(null, list2);
                fr9 fr9Var2 = jo3Var.c;
                try {
                    te5 te5Var2 = ue5.d;
                    String str6 = (String) qtVar.Q.c(qt.T[43], qtVar);
                    te5Var2.getClass();
                    pm8Var2 = (List) te5Var2.a(new wv(tv9.a, 0), str6);
                    break;
                } catch (Throwable th2) {
                    pm8Var2 = new pm8(th2);
                }
                if (pm8Var2 instanceof pm8) {
                    pm8Var2 = null;
                }
                List list3 = (List) pm8Var2;
                if (list3 == null) {
                    list3 = list;
                }
                fr9Var2.getClass();
                fr9Var2.l(null, list3);
                fr9 fr9Var3 = jo3Var.d;
                try {
                    te5 te5Var3 = ue5.d;
                    String str7 = (String) qtVar.R.c(qt.T[44], qtVar);
                    te5Var3.getClass();
                    pm8Var3 = (List) te5Var3.a(new wv(la5.a, 0), str7);
                    break;
                } catch (Throwable th3) {
                    pm8Var3 = new pm8(th3);
                }
                if (pm8Var3 instanceof pm8) {
                    pm8Var3 = null;
                }
                List list4 = (List) pm8Var3;
                if (list4 != null) {
                    list = list4;
                }
                fr9Var3.getClass();
                fr9Var3.l(null, list);
                fr9 fr9Var4 = jo3Var.e;
                Boolean bool = (Boolean) qtVar.S.c(qt.T[45], qtVar);
                bool.getClass();
                fr9Var4.getClass();
                fr9Var4.l(null, bool);
                return heb.a;
            case 12:
                e11.e0(obj);
                ((kb4) ((a07) this.b).getValue()).invoke(((wga) ((a07) this.c).getValue()).a.b);
                return heb.a;
            case 13:
                e11.e0(obj);
                nra nraVar = ((s74) this.b).c;
                String str8 = (String) this.c;
                sra sraVar = (sra) nraVar;
                sraVar.getClass();
                str8.getClass();
                sraVar.a.n.e(qt.T[12], str8);
                fr9 fr9Var5 = sraVar.m;
                fr9Var5.getClass();
                fr9Var5.l(null, str8);
                return heb.a;
            case 14:
                e11.e0(obj);
                ((WebView) ((owb) this.b).d.b).getSettings().setUserAgentString((String) this.c);
                return heb.a;
            case 15:
                e11.e0(obj);
                ro4 ro4Var = (ro4) this.b;
                String str9 = (String) ((a07) this.c).getValue();
                str9.getClass();
                if (!str9.equals(ro4Var.s)) {
                    ro4Var.s = str9;
                    yd5 yd5Var3 = ro4Var.w;
                    if (yd5Var3 != null) {
                        yd5Var3.cancel(null);
                    }
                    za1 za1VarA3 = vtb.a(ro4Var);
                    aj2 aj2Var3 = rw2.a;
                    ro4Var.w = ro4Var.g(za1VarA3, nh2.c, new yw3((Object) ro4Var, (Object) str9, (jt1) (objArr3 == true ? 1 : 0), 16));
                }
                return heb.a;
            case 16:
                k6a k6aVar = k6a.a;
                e11.e0(obj);
                boolean zBooleanValue = ((Boolean) ((br9) this.c).getValue()).booleanValue();
                m6a m6aVar = (m6a) this.b;
                if (zBooleanValue) {
                    m6aVar.e(k6aVar);
                } else {
                    m6aVar.a(k6aVar);
                }
                return heb.a;
            case 17:
                e11.e0(obj);
                h12 h12Var = (h12) this.b;
                o12 o12Var = (o12) this.c;
                o12Var.getClass();
                List list5 = o12Var.e;
                e12 e12Var = (e12) fc1.z0(o12Var.d);
                if (e12Var == null) {
                    e12Var = h12Var.b;
                }
                e12Var.getClass();
                h12Var.j.setValue(e12Var);
                h12Var.b = e12Var;
                hw hwVar = (hw) fc1.z0(list5);
                kf8 kf8VarS = hwVar != null ? lw1.S(h12Var.b(), hwVar) : h12Var.f;
                h12Var.g = kf8VarS;
                h12Var.h.setValue(kf8VarS);
                boolean z2 = list5.size() == 1;
                h12Var.l.setValue(Boolean.valueOf(z2));
                h12Var.c = z2;
                return heb.a;
            case 18:
                e11.e0(obj);
                return Boolean.valueOf(((h12) this.b) == ((h12) this.c));
            case 19:
                e11.e0(obj);
                mq0 mq0Var = (mq0) this.b;
                String str10 = ((wga) ((a07) this.c).getValue()).a.b;
                str10.getClass();
                yd5 yd5Var4 = mq0Var.f;
                if (yd5Var4 != null) {
                    yd5Var4.cancel(null);
                }
                za1 za1VarA4 = vtb.a(mq0Var);
                aj2 aj2Var4 = rw2.a;
                mq0Var.f = mq0Var.g(za1VarA4, nh2.c, new lq0(mq0Var, str10, (jt1) null));
                return heb.a;
            case 20:
                e11.e0(obj);
                jx1 jx1VarQ = ((vx1) this.b).q();
                ib4 ib4Var = (ib4) this.c;
                try {
                    nsa nsaVar = new nsa();
                    nsaVar.u = qx1.B(qx1.w(jx1VarQ), true, nsaVar);
                    AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = nsa.v;
                    while (true) {
                        int i8 = atomicIntegerFieldUpdater.get(nsaVar);
                        if (i8 != 0) {
                            if (i8 != 2 && i8 != 3) {
                                nsa.t(i8);
                                throw null;
                            }
                        } else if (!atomicIntegerFieldUpdater.compareAndSet(nsaVar, i8, 0)) {
                        }
                    }
                    try {
                        return ib4Var.invoke();
                    } finally {
                        nsaVar.s();
                    }
                } catch (InterruptedException e) {
                    throw new CancellationException("Blocking call was interrupted due to parent cancellation").initCause(e);
                }
            case 21:
                e11.e0(obj);
                no5 no5Var = (no5) this.b;
                mo5 mo5Var = (rd4) no5Var.b(5);
                if (!((rd4) mo5Var).a.equals(no5Var)) {
                    mo5Var.c();
                    rd4.d(((rd4) mo5Var).b, no5Var);
                }
                xm5 xm5Var = (xm5) this.c;
                mo5 mo5Var2 = mo5Var;
                int iP = ((rd4) mo5Var2).b.p();
                mo5Var2.c();
                no5.m(((rd4) mo5Var2).b, iP);
                mo5Var2.c();
                no5.l(((rd4) mo5Var2).b);
                for (Map.Entry entry : xm5Var.b.entrySet()) {
                    ro5 ro5Var = (ro5) entry.getKey();
                    int iIntValue = ((Number) entry.getValue()).intValue();
                    if (xm5Var.e.contains(new Integer(iIntValue))) {
                        oo5 oo5VarO = po5.o();
                        oo5VarO.c();
                        po5.k(((rd4) oo5VarO).b, ro5Var);
                        oo5VarO.c();
                        po5.l(((rd4) oo5VarO).b, iIntValue);
                        mo5Var2.c();
                        no5.k(((rd4) mo5Var2).b, oo5VarO.a());
                    }
                }
                return mo5Var2.a();
            case 22:
                e11.e0(obj);
                throw null;
            case 23:
                e11.e0(obj);
                l7 l7Var = (l7) this.b;
                if (l7Var.a().length() == 0) {
                    String str11 = (String) fw.j0((String[]) this.c);
                    str11.getClass();
                    l7Var.h.setValue(str11);
                }
                return heb.a;
            case 24:
                e11.e0(obj);
                ArrayList arrayList2 = (ArrayList) this.b;
                hk9 hk9Var = (hk9) this.c;
                int size = arrayList2.size();
                while (i4 < size) {
                    if (arrayList2.get(i4) != null) {
                        j31.j();
                        return null;
                    }
                    if (!hk9Var.contains((Object) null)) {
                        hk9Var.add((Object) null);
                    }
                    i4++;
                }
                return heb.a;
            case 25:
                e11.e0(obj);
                qe8 qe8Var = new qe8(vo1.e0((wt7) this.b));
                byte[] bArr = (byte[]) this.c;
                try {
                    qe8Var.b0(bArr.length, bArr);
                    lc5.U(qe8Var, null);
                    return heb.a;
                } catch (Throwable th4) {
                    try {
                        throw th4;
                    } catch (Throwable th5) {
                        lc5.U(qe8Var, th4);
                        throw th5;
                    }
                }
            case 26:
                e11.e0(obj);
                yk1 yk1Var = (yk1) this.b;
                yk1Var.c = (cx5) this.c;
                yk1Var.a();
                return heb.a;
            case 27:
                e11.e0(obj);
                hx1 hx1Var = ((vx1) this.b).q().get(g83.d);
                hx1Var.getClass();
                lt1 lt1Var = (lt1) hx1Var;
                bi1 bi1VarD = p7c.d();
                ah1.I(yf4.a, lt1Var, zx1.d, new lq8((Object) bi1VarD, this.c, (jt1) (objArr5 == true ? 1 : 0), i4));
                while (!bi1VarD.M()) {
                    try {
                        return ah1.S(lt1Var, new l64((Object) bi1VarD, (jt1) (objArr4 == true ? 1 : 0), 25));
                    } catch (InterruptedException unused) {
                    }
                }
                return bi1VarD.z();
            case 28:
                e11.e0(obj);
                if (((Long) this.b) != null && (gqbVar = ((qsb) this.c).n) != null) {
                    gqbVar.j();
                }
                return heb.a;
            default:
                e11.e0(obj);
                qsb qsbVar = (qsb) this.b;
                gqb gqbVar2 = (gqb) this.c;
                gqbVar2.getClass();
                qsbVar.d();
                qsbVar.n = gqbVar2;
                iw0 iw0VarO = wx1.o();
                qsbVar.o = iw0VarO;
                Float f = qsbVar.p;
                if (f != null) {
                    gqbVar2.k(f.floatValue());
                }
                Boolean bool2 = qsbVar.q;
                if (bool2 != null) {
                    gqbVar2.c(bool2.booleanValue());
                }
                Float f2 = qsbVar.r;
                if (f2 != null) {
                    gqbVar2.b(f2.floatValue());
                }
                ah1.J(iw0VarO, null, null, new jsb(gqbVar2, qsbVar, objArr10 == true ? 1 : 0, i4), 3);
                ah1.J(iw0VarO, null, null, new jsb(gqbVar2, qsbVar, objArr9 == true ? 1 : 0, z ? 1 : 0), 3);
                ah1.J(iw0VarO, null, null, new jsb(gqbVar2, qsbVar, objArr8 == true ? 1 : 0, i), 3);
                ah1.J(iw0VarO, null, null, new jsb(gqbVar2, qsbVar, objArr7 == true ? 1 : 0, i3), 3);
                ah1.J(iw0VarO, null, null, new jsb(gqbVar2, qsbVar, objArr6 == true ? 1 : 0, i2), 3);
                ah1.J(iw0VarO, null, null, new jsb(qsbVar, gqbVar2, null), 3);
                return heb.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pg(Object obj, jt1 jt1Var, int i) {
        super(2, jt1Var);
        this.a = i;
        this.c = obj;
    }
}
