package defpackage;

import com.google.firebase.auth.FirebaseAuth;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import okhttp3.internal.concurrent.TaskQueue;
import okhttp3.internal.http2.ErrorCode;
import okhttp3.internal.http2.Http2Connection;
import okhttp3.internal.http2.Http2Stream;
import okhttp3.internal.http2.Settings;
import okhttp3.internal.platform.Platform;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class al3 implements ib4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ al3(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [jt1] */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8 */
    @Override // defpackage.ib4
    public final Object invoke() {
        long jA;
        String[] strArrNames;
        int i = 2;
        int i2 = 4;
        Object[] objArr = 0;
        objArr = 0;
        z = false;
        z = false;
        boolean z = false;
        z = false;
        z = false;
        boolean z2 = false;
        z = false;
        z = false;
        boolean z3 = false;
        int i3 = 1;
        switch (this.a) {
            case 0:
                ((kb4) this.b).invoke((wk3) this.c);
                return heb.a;
            case 1:
                yb0.T((t27) this.b, ((to3) this.c).e);
                return heb.a;
            case 2:
                fn2 fn2Var = (fn2) this.b;
                to3 to3Var = (to3) this.c;
                String str = to3Var.a;
                String str2 = to3Var.b;
                fn2Var.getClass();
                str.getClass();
                str2.getClass();
                fn2Var.b.setValue(str);
                fn2Var.c.setValue(str2);
                fn2Var.a(true);
                return heb.a;
            case 3:
                yn3 yn3Var = (yn3) this.b;
                boolean z4 = !((to3) this.c).q;
                za1 za1VarA = vtb.a(yn3Var);
                aj2 aj2Var = rw2.a;
                yn3Var.g(za1VarA, nh2.c, new lk0(yn3Var, z4, objArr, i));
                return heb.a;
            case 4:
                yb4 yb4Var = (yb4) this.b;
                yo3 yo3Var = (yo3) this.c;
                yb4Var.invoke(yo3Var.a, yo3Var.b);
                return heb.a;
            case 5:
                ((kb4) this.b).invoke(((yo3) this.c).a);
                return heb.a;
            case 6:
                ((FirebaseAuth) ((bbc) this.b).b).c.remove((hy3) this.c);
                return heb.a;
            case 7:
                ((rg8) this.b).a = md2.y((m54) this.c, ys7.a);
                return heb.a;
            case 8:
                ((kb4) this.b).invoke(Boolean.valueOf(!((o54) this.c).f));
                return heb.a;
            case 9:
                ((kb4) this.b).invoke(Boolean.valueOf(((zk7) this.c).k() == 0));
                return heb.a;
            case 10:
                m84 m84Var = (m84) this.b;
                String str3 = (String) ((a07) this.c).getValue();
                str3.getClass();
                za1 za1VarA2 = vtb.a(m84Var);
                aj2 aj2Var2 = rw2.a;
                m84Var.g(za1VarA2, nh2.c, new hl2(m84Var, str3, objArr, 25));
                return heb.a;
            case 11:
                dd4 dd4Var = (dd4) this.b;
                kw6 kw6Var = (kw6) this.c;
                dd4Var.H(kw6Var.a, kw6Var.g, kw6Var.b, true);
                return heb.a;
            case 12:
                yb4 yb4Var2 = (yb4) this.b;
                de4 de4Var = (de4) this.c;
                yb4Var2.invoke(de4Var.a, de4Var.b);
                return heb.a;
            case 13:
                cm4 cm4Var = (cm4) this.b;
                a07 a07Var = (a07) this.c;
                za1 za1VarA3 = vtb.a(cm4Var);
                aj2 aj2Var3 = rw2.a;
                cm4Var.g(za1VarA3, nh2.c, new am4(cm4Var, objArr, i));
                a07Var.setValue(Boolean.FALSE);
                return heb.a;
            case 14:
                ((kb4) this.b).invoke(Integer.valueOf(((gc9) this.c).a));
                return heb.a;
            case 15:
                ((ej4) this.b).invoke((String) this.c);
                return heb.a;
            case 16:
                Http2Connection http2Connection = (Http2Connection) this.b;
                Http2Stream http2Stream = (Http2Stream) this.c;
                try {
                    http2Connection.a.b(http2Stream);
                    break;
                } catch (IOException e) {
                    Platform platform = Platform.a;
                    Platform.a.j(4, "Http2Connection.Listener failure for " + http2Connection.c, e);
                    try {
                        http2Stream.e(ErrorCode.PROTOCOL_ERROR, e);
                        break;
                    } catch (IOException unused) {
                    }
                }
                return heb.a;
            case 17:
                Http2Connection.ReaderRunnable readerRunnable = (Http2Connection.ReaderRunnable) this.b;
                Settings settings = (Settings) this.c;
                rg8 rg8Var = new rg8();
                Http2Connection http2Connection2 = Http2Connection.this;
                synchronized (http2Connection2.I) {
                    synchronized (http2Connection2) {
                        try {
                            Settings settings2 = http2Connection2.D;
                            Settings settings3 = new Settings();
                            settings2.getClass();
                            for (int i4 = 0; i4 < 10; i4++) {
                                if (((1 << i4) & settings2.a) != 0) {
                                    settings3.b(i4, settings2.b[i4]);
                                }
                            }
                            for (int i5 = 0; i5 < 10; i5++) {
                                if (((1 << i5) & settings.a) != 0) {
                                    settings3.b(i5, settings.b[i5]);
                                }
                            }
                            rg8Var.a = settings3;
                            jA = ((long) settings3.a()) - ((long) settings2.a());
                            if (jA != 0 && !http2Connection2.b.isEmpty()) {
                                objArr = (Http2Stream[]) http2Connection2.b.values().toArray(new Http2Stream[0]);
                            }
                            Settings settings4 = (Settings) rg8Var.a;
                            settings4.getClass();
                            http2Connection2.D = settings4;
                            TaskQueue.c(http2Connection2.v, http2Connection2.c + " onSettings", 0L, new al3(18, http2Connection2, rg8Var), 6);
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    try {
                        http2Connection2.I.p((Settings) rg8Var.a);
                    } catch (IOException e2) {
                        ErrorCode errorCode = ErrorCode.PROTOCOL_ERROR;
                        http2Connection2.p(errorCode, errorCode, e2);
                    }
                    break;
                }
                if (objArr != 0) {
                    for (Http2Stream http2Stream2 : objArr) {
                        synchronized (http2Stream2) {
                            http2Stream2.e += jA;
                            if (jA > 0) {
                                http2Stream2.notifyAll();
                            }
                        }
                    }
                }
                return heb.a;
            case 18:
                Http2Connection http2Connection3 = (Http2Connection) this.b;
                http2Connection3.a.a(http2Connection3, (Settings) ((rg8) this.c).a);
                return heb.a;
            case 19:
                i45 i45Var = (i45) this.b;
                int i6 = ((zy4) ((a07) this.c).getValue()).e;
                if (i6 == 0) {
                    i2 = 1;
                } else if (i6 == 1) {
                    i2 = 3;
                } else if (i6 != 3) {
                    i2 = 0;
                }
                i45Var.getClass();
                za1 za1VarA4 = vtb.a(i45Var);
                aj2 aj2Var4 = rw2.a;
                i45Var.g(za1VarA4, nh2.c, new v35(i45Var, i2, objArr, i3));
                return heb.a;
            case 20:
                z50 z50Var = (z50) this.b;
                ((a07) this.c).setValue(Boolean.FALSE);
                z50Var.j();
                return heb.a;
            case 21:
                m39 m39Var = (m39) this.b;
                ue5 ue5Var = (ue5) this.c;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                cf5 cf5Var = ue5Var.a;
                bg5.d(ue5Var, m39Var);
                int iF = m39Var.f();
                for (int i7 = 0; i7 < iF; i7++) {
                    List listH = m39Var.h(i7);
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : listH) {
                        if (obj instanceof ag5) {
                            arrayList.add(obj);
                        }
                    }
                    ag5 ag5Var = (ag5) fc1.P0(arrayList);
                    if (ag5Var != null && (strArrNames = ag5Var.names()) != null) {
                        for (String str4 : strArrNames) {
                            String str5 = lc5.Q(m39Var.e(), s39.c) ? "enum value" : "property";
                            if (linkedHashMap.containsKey(str4)) {
                                throw new kf5(ny1.E("The suggested name '" + str4 + "' for " + str5 + ' ' + m39Var.g(i7) + " is already one of the names for " + str5 + ' ' + m39Var.g(((Number) y86.G(str4, linkedHashMap)).intValue()) + " in " + m39Var, null, null, null, -1));
                            }
                            linkedHashMap.put(str4, Integer.valueOf(i7));
                        }
                    }
                }
                return linkedHashMap.isEmpty() ? mc3.a : linkedHashMap;
            case 22:
                st5 st5Var = (st5) this.b;
                ot5 ot5Var = (ot5) ((br9) this.c).getValue();
                if (ot5Var != null) {
                    int i8 = ot5Var.a;
                    ot5 ot5Var2 = (ot5) fc1.z0(st5Var.j().k);
                    if (ot5Var2 != null && i8 != ot5Var2.a) {
                        z3 = true;
                    }
                }
                return Boolean.valueOf(z3);
            case 23:
                fo2 fo2Var = (fo2) this.b;
                wq5 wq5Var = (wq5) this.c;
                aq5 aq5Var = (aq5) fo2Var.getValue();
                return new bq5(wq5Var, aq5Var, new og((ha5) wq5Var.d.f.getValue(), aq5Var));
            case 24:
                wq5 wq5Var2 = (wq5) this.b;
                kq5 kq5Var = (kq5) ((br9) this.c).getValue();
                if (kq5Var != null) {
                    int i9 = kq5Var.a;
                    kq5 kq5Var2 = (kq5) fc1.z0(wq5Var2.j().m);
                    if (kq5Var2 != null && i9 != kq5Var2.a) {
                        z2 = true;
                    }
                }
                return Boolean.valueOf(z2);
            case 25:
                fo2 fo2Var2 = (fo2) this.b;
                zk7 zk7Var = (zk7) this.c;
                nk7 nk7Var = (nk7) fo2Var2.getValue();
                return new ok7(zk7Var, nk7Var, new og((ha5) ((fs5) zk7Var.d.f).getValue(), nk7Var));
            case 26:
                return new yt5((rs8) this.b, mc3.a, (ns8) this.c);
            case 27:
                fo2 fo2Var3 = (fo2) this.b;
                uu5 uu5Var = (uu5) this.c;
                eu5 eu5Var = (eu5) fo2Var3.getValue();
                return new fu5(uu5Var, eu5Var, new og((ha5) ((fs5) uu5Var.c.h).getValue(), eu5Var));
            case 28:
                uu5 uu5Var2 = (uu5) this.b;
                qu5 qu5Var = (qu5) ((br9) this.c).getValue();
                if (qu5Var != null) {
                    int i10 = qu5Var.a;
                    qu5 qu5Var2 = (qu5) fc1.z0(uu5Var2.g().m);
                    if (qu5Var2 != null && i10 != qu5Var2.a) {
                        z = true;
                    }
                }
                return Boolean.valueOf(z);
            default:
                mn5 mn5Var = (mn5) this.b;
                b96 b96Var = (b96) this.c;
                pn2 pn2Var = vw1.S(b96Var).L;
                b96Var.C.h();
                int iH = b96Var.D.h();
                mn5Var.getClass();
                return Integer.valueOf(t96.M(0.33333334f * iH));
        }
    }
}
