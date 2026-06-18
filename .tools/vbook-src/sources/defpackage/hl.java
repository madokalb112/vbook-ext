package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import com.reader.data.reader.text.core.tts.AndroidTextToSpeechService;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class hl extends o1a implements yb4 {
    public final /* synthetic */ int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hl(sra sraVar, String str, xr xrVar, String str2, jt1 jt1Var) {
        super(2, jt1Var);
        this.a = 8;
        this.b = sraVar;
        this.c = str;
        this.e = xrVar;
        this.d = str2;
    }

    @Override // defpackage.vc0
    public final jt1 create(Object obj, jt1 jt1Var) {
        int i = this.a;
        Object obj2 = this.e;
        Object obj3 = this.d;
        Object obj4 = this.c;
        switch (i) {
            case 0:
                return new hl((AndroidTextToSpeechService) this.b, (String) obj4, (String) obj3, (ng) obj2, jt1Var, 0);
            case 1:
                return new hl((a07) this.b, (a07) obj4, (a07) obj3, (a07) obj2, jt1Var, 1);
            case 2:
                hl hlVar = new hl((zx7) obj4, (tda) obj3, (kga) obj2, jt1Var);
                hlVar.b = obj;
                return hlVar;
            case 3:
                return new hl((otb) this.b, (kf8) obj4, (m45) obj3, (kf8) obj2, jt1Var, 3);
            case 4:
                return new hl((List) this.b, (a07) obj4, (a07) obj3, (a07) obj2, jt1Var, 4);
            case 5:
                return new hl((ab6) this.b, (Uri) obj3, (String) obj4, (lq7) obj2, jt1Var);
            case 6:
                return new hl((m6a) this.b, (a07) obj4, (a07) obj3, (a07) obj2, jt1Var, 6);
            case 7:
                return new hl((jka) this.b, (kba) obj4, (a07) obj3, (a07) obj2, jt1Var, 7);
            case 8:
                return new hl((sra) this.b, (String) obj4, (xr) obj2, (String) obj3, jt1Var);
            default:
                return new hl((kta) this.b, (lta) obj4, (ja5) obj3, (ky4) obj2, jt1Var, 9);
        }
    }

    @Override // defpackage.yb4
    public final Object invoke(Object obj, Object obj2) throws IOException {
        int i = this.a;
        heb hebVar = heb.a;
        vx1 vx1Var = (vx1) obj;
        jt1 jt1Var = (jt1) obj2;
        switch (i) {
            case 0:
                ((hl) create(vx1Var, jt1Var)).invokeSuspend(hebVar);
                break;
            case 1:
                ((hl) create(vx1Var, jt1Var)).invokeSuspend(hebVar);
                break;
            case 2:
                ((hl) create(vx1Var, jt1Var)).invokeSuspend(hebVar);
                break;
            case 3:
                ((hl) create(vx1Var, jt1Var)).invokeSuspend(hebVar);
                break;
            case 4:
                ((hl) create(vx1Var, jt1Var)).invokeSuspend(hebVar);
                break;
            case 5:
                break;
            case 6:
                ((hl) create(vx1Var, jt1Var)).invokeSuspend(hebVar);
                break;
            case 7:
                ((hl) create(vx1Var, jt1Var)).invokeSuspend(hebVar);
                break;
            case 8:
                ((hl) create(vx1Var, jt1Var)).invokeSuspend(hebVar);
                break;
            default:
                ((hl) create(vx1Var, jt1Var)).invokeSuspend(hebVar);
                break;
        }
        return hebVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.vc0
    public final Object invokeSuspend(Object obj) throws IOException {
        Object next;
        int i = 2;
        int i2 = 0;
        switch (this.a) {
            case 0:
                e11.e0(obj);
                AndroidTextToSpeechService androidTextToSpeechService = (AndroidTextToSpeechService) this.b;
                int i3 = AndroidTextToSpeechService.H;
                kl klVarD = androidTextToSpeechService.d();
                String str = (String) this.c;
                String str2 = (String) this.d;
                Bitmap bitmapA = q95.a((ng) this.e);
                klVarD.getClass();
                str.getClass();
                bitmapA.getClass();
                klVarD.g = bitmapA;
                klVarD.e = str2;
                synchronized (klVarD.c()) {
                    c87 c87VarC = klVarD.c();
                    c87VarC.getClass();
                    c87VarC.e = c87.c(str2);
                    c87VarC.e(bitmapA);
                    c87VarC.u.deleteIntent = klVarD.a("com.reader.action.tts.STOP");
                    c87VarC.d(8);
                    c87VarC.d(2);
                    c87VarC.u.when = System.currentTimeMillis();
                    c87VarC.i = -1;
                    c87VarC.r = 1;
                    c87VarC.g = klVarD.b(str);
                    klVarD.e(klVarD.c(), 6);
                    klVarD.c.a(10001, klVarD.c().b());
                }
                return heb.a;
            case 1:
                e11.e0(obj);
                if (((Boolean) ((a07) this.b).getValue()).booleanValue()) {
                    ((a07) this.d).setValue(((t61) ((a07) this.c).getValue()).h);
                    ((a07) this.e).setValue((Object) null);
                }
                return heb.a;
            case 2:
                e11.e0(obj);
                vx1 vx1Var = (vx1) this.b;
                zx1 zx1Var = zx1.d;
                zx7 zx7Var = (zx7) this.c;
                ah1.J(vx1Var, null, zx1Var, new jw1(zx7Var, (tda) this.d, null == true ? 1 : 0, i2), 1);
                ah1.J(vx1Var, null, zx1Var, new et1(zx7Var, (kga) this.e, null == true ? 1 : 0, i), 1);
                return heb.a;
            case 3:
                e11.e0(obj);
                otb otbVar = (otb) this.b;
                kf8 kf8Var = (kf8) this.c;
                m45 m45Var = (m45) this.d;
                kf8Var.getClass();
                m45Var.getClass();
                if (gc1.Z(90, 270).contains(Integer.valueOf((m45Var.a + 360) % 360))) {
                    kf8Var = new kf8(kf8Var.b, kf8Var.a, kf8Var.d, kf8Var.c);
                }
                kf8 kf8VarA = otb.a(kf8Var, (kf8) this.e);
                float[] fArrA = u96.a();
                v96.c(fArrA, kf8Var, kf8VarA);
                otbVar.a = fArrA[0];
                return heb.a;
            case 4:
                e11.e0(obj);
                a07 a07Var = (a07) this.e;
                boolean zBooleanValue = ((Boolean) ((a07) this.c).getValue()).booleanValue();
                List listN0 = (List) this.b;
                if (zBooleanValue) {
                    listN0 = fc1.N0(listN0);
                }
                a07 a07Var2 = (a07) this.d;
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : listN0) {
                    if (bw9.O(((oy4) obj2).e, ((wga) a07Var2.getValue()).a.b, true)) {
                        arrayList.add(obj2);
                    }
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                int size = arrayList.size();
                while (i2 < size) {
                    Object obj3 = arrayList.get(i2);
                    i2++;
                    Integer num = new Integer(((oy4) obj3).c);
                    Object arrayList2 = linkedHashMap.get(num);
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                        linkedHashMap.put(num, arrayList2);
                    }
                    ((List) arrayList2).add(obj3);
                }
                a07Var.setValue(linkedHashMap);
                return heb.a;
            case 5:
                e11.e0(obj);
                ab6 ab6Var = (ab6) this.b;
                Context context = (Context) ab6Var.c;
                context.getClass();
                Uri uri = (Uri) this.d;
                uri.getClass();
                ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(uri, "r");
                if (parcelFileDescriptorOpenFileDescriptor == null) {
                    sy3.m("Failed to open PDF file");
                    return null;
                }
                Uri uri2 = (Uri) this.d;
                String str3 = (String) this.c;
                mq7 mq7Var = (lq7) this.e;
                ui8 ui8Var = new ui8(1, 0, 1);
                mq7 mq7Var2 = mq7Var;
                qp7 qp7VarC = mq7Var2.c();
                if (qp7VarC == null) {
                    gp.j("Binder interface not available for loading the document!");
                    return null;
                }
                eq7 eq7Var = (eq7) eq7.c.get(qp7VarC.q(parcelFileDescriptorOpenFileDescriptor, str3));
                if (eq7Var == eq7.a) {
                    try {
                        qp7VarC.i();
                        break;
                    } catch (UnsupportedOperationException unused) {
                    }
                    try {
                        qp7VarC.h();
                        break;
                    } catch (UnsupportedOperationException unused2) {
                    }
                    return new fs8(uri2, mq7Var2, str3, parcelFileDescriptorOpenFileDescriptor, (jx1) ab6Var.b, qp7VarC.n(), ui8Var);
                }
                parcelFileDescriptorOpenFileDescriptor.close();
                int iOrdinal = eq7Var.ordinal();
                if (iOrdinal == 1) {
                    throw new jq7("Incorrect password");
                }
                if (iOrdinal == 2) {
                    sy3.m("Unable to process the PDF document");
                    return null;
                }
                if (iOrdinal != 3) {
                    w58.s(eq7Var, "Unknown loading status: ");
                    return null;
                }
                k27.i("Loading failed");
                return null;
            case 6:
                k6a k6aVar = k6a.a;
                m6a m6aVar = (m6a) this.b;
                e11.e0(obj);
                if (((Boolean) ((a07) this.c).getValue()).booleanValue() || ((Boolean) ((a07) this.d).getValue()).booleanValue() || ((Boolean) ((a07) this.e).getValue()).booleanValue()) {
                    m6aVar.e(k6aVar);
                } else {
                    m6aVar.a(k6aVar);
                }
                return heb.a;
            case 7:
                e11.e0(obj);
                jka jkaVar = (jka) this.b;
                yia yiaVarC = jkaVar.c();
                yia yiaVarB = jkaVar.b();
                a07 a07Var3 = (a07) this.d;
                Iterator it = ((kba) this.c).a.iterator();
                while (true) {
                    if (it.hasNext()) {
                        next = it.next();
                        gba gbaVar = (gba) next;
                        if (gbaVar.e != 1 || gbaVar.c != yiaVarC.a || !ri9.D(gbaVar, yiaVarC.b, yiaVarB.b)) {
                        }
                    } else {
                        next = null;
                    }
                }
                a07Var3.setValue((gba) next);
                a07 a07Var4 = (a07) this.e;
                gba gbaVar2 = (gba) a07Var3.getValue();
                String str4 = gbaVar2 != null ? gbaVar2.g : null;
                if (str4 == null) {
                    str4 = "";
                }
                a07Var4.setValue(str4);
                return heb.a;
            case 8:
                e11.e0(obj);
                sra sraVar = (sra) this.b;
                List<kra> listB = sra.b(sraVar);
                String strP = wm9.p();
                String str5 = (String) this.d;
                String str6 = (String) this.c;
                xr xrVar = (xr) this.e;
                ArrayList arrayList3 = new ArrayList(gc1.M(listB, 10));
                for (kra kraVar : listB) {
                    if (lc5.Q(kraVar.a, str5)) {
                        kraVar = new kra(strP, str6, xrVar.a);
                    }
                    arrayList3.add(kraVar);
                }
                qt qtVar = sraVar.a;
                te5 te5Var = ue5.d;
                te5Var.getClass();
                qtVar.e(te5Var.b(new wv(kra.Companion.serializer(), 0), arrayList3));
                fr9 fr9Var = sraVar.f;
                List listZ0 = fc1.Z0(arrayList3);
                fr9Var.getClass();
                fr9Var.l(null, listZ0);
                sraVar.d(strP, str6, xrVar);
                return heb.a;
            default:
                e11.e0(obj);
                kta ktaVar = (kta) this.b;
                jk9 jk9Var = ktaVar.f;
                lta ltaVar = (lta) this.c;
                ja5 ja5Var = (ja5) this.d;
                jk9Var.put(ltaVar, new ata(ltaVar, ja5Var, (ky4) this.e));
                Iterator it2 = ktaVar.f.b.iterator();
                while (true) {
                    l1 l1Var = (l1) it2;
                    if (!l1Var.hasNext()) {
                        return heb.a;
                    }
                    Map.Entry entry = (Map.Entry) ((kr9) it2).next();
                    lta ltaVar2 = (lta) entry.getKey();
                    ata ataVar = (ata) entry.getValue();
                    if (ltaVar2.a != ltaVar.a) {
                        ja5 ja5Var2 = ataVar.b;
                        if (ja5Var2.a >= ja5Var.a && ja5Var2.b >= ja5Var.b && ja5Var2.c <= ja5Var.c && ja5Var2.d <= ja5Var.d) {
                            l1Var.remove();
                        }
                    }
                }
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hl(zx7 zx7Var, tda tdaVar, kga kgaVar, jt1 jt1Var) {
        super(2, jt1Var);
        this.a = 2;
        this.c = zx7Var;
        this.d = tdaVar;
        this.e = kgaVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hl(ab6 ab6Var, Uri uri, String str, lq7 lq7Var, jt1 jt1Var) {
        super(2, jt1Var);
        this.a = 5;
        this.b = ab6Var;
        this.d = uri;
        this.c = str;
        this.e = lq7Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hl(Object obj, Object obj2, Object obj3, Object obj4, jt1 jt1Var, int i) {
        super(2, jt1Var);
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }
}
