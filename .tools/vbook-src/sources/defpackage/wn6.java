package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Enumeration;
import java.util.List;
import java.util.UUID;
import okhttp3.internal._UtilCommonKt;
import okhttp3.internal.ws.RealWebSocket;
import okhttp3.internal.ws.WebSocketWriter;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class wn6 implements ib4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ wn6(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.ib4
    public final Object invoke() throws IOException {
        int iC0;
        xl7 xl7Var;
        xl7 xl7Var2;
        int i = this.a;
        lc3 lc3Var = lc3.a;
        int i2 = 0;
        heb hebVar = heb.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                v78 v78Var = (v78) obj;
                agVarD = v78Var != null ? v78Var.d : null;
                return dk9.x(new wga(agVarD != null ? agVarD : "", 0L, 6));
            case 1:
                oja ojaVar = (oja) obj;
                return (s5b) ojaVar.f.get(ojaVar.e);
            case 2:
                fma fmaVar = (fma) obj;
                za1 za1VarA = vtb.a(fmaVar);
                aj2 aj2Var = rw2.a;
                fmaVar.g(za1VarA, nh2.c, new b69(fmaVar, agVarD, 29));
                return hebVar;
            case 3:
                return dk9.x(fc1.D0(((ihb) obj).h, " ", null, null, null, 62));
            case 4:
                an2 an2Var = (uk9) obj;
                if (an2Var != null) {
                    an2Var.a();
                }
                return hebVar;
            case 5:
                ((ax2) obj).a();
                return hebVar;
            case 6:
                return "Unexpected end of input: yet to parse ".concat(((ha7) obj).b());
            case 7:
                return new re7((te7) obj);
            case 8:
                return new x13(sw1.V(24.0f, 16.0f, ((tfa) obj).invoke()));
            case 9:
                og ogVar = (og) obj;
                vj7 vj7Var = (vj7) ogVar.b;
                int i3 = ogVar.a;
                tp7 tp7Var = vj7Var.a;
                tp7Var.getClass();
                try {
                    agVarD = tp7Var.D(i3, false);
                    ArrayList<Parcelable> arrayListA = vj7.a(i3, agVarD);
                    tp7Var.Q(i3, agVarD);
                    Object obj2 = lc3Var;
                    if (!arrayListA.isEmpty()) {
                        ArrayList arrayList = new ArrayList();
                        ArrayList arrayList2 = new ArrayList();
                        int i4 = 0;
                        for (Parcelable parcelable : arrayListA) {
                            parcelable.getClass();
                            Parcel parcelObtain = Parcel.obtain();
                            parcelObtain.getClass();
                            parcelable.writeToParcel(parcelObtain, 0);
                            int iDataSize = parcelObtain.dataSize();
                            parcelObtain.recycle();
                            if (iDataSize <= 1000000) {
                                if (!arrayList2.isEmpty() && i4 + iDataSize > 1000000) {
                                    arrayList.add(arrayList2);
                                    arrayList2 = new ArrayList();
                                    i4 = 0;
                                }
                                arrayList2.add(parcelable);
                                i4 += iDataSize;
                            }
                        }
                        obj2 = arrayList;
                        if (!arrayList2.isEmpty()) {
                            arrayList.add(arrayList2);
                            obj2 = arrayList;
                        }
                    }
                    return obj2;
                } catch (Throwable th) {
                    tp7Var.Q(i3, agVarD);
                    throw th;
                }
            case 10:
                return xv5.s(new StringBuilder("Unexpected end of input: yet to parse '"), ((st7) obj).a, '\'');
            case 11:
                iy7 iy7Var = (iy7) obj;
                p39 p39VarZ = fx1.z("kotlinx.serialization.Polymorphic", gy7.c, new m39[0], new hy7(iy7Var, i2));
                a91 a91Var = iy7Var.a;
                a91Var.getClass();
                return new is1(p39VarZ, a91Var);
            case 12:
                return new wh0(new uf4(((g18) obj).a, 15));
            case 13:
                ((wjb) obj).getClass();
                UUID uuidRandomUUID = UUID.randomUUID();
                uuidRandomUUID.getClass();
                String string = uuidRandomUUID.toString();
                string.getClass();
                return string;
            case 14:
                return Float.valueOf(((g78) obj).a());
            case 15:
                ma8 ma8Var = (ma8) obj;
                return cx1.s0(new u31(ma8Var.o(), 3), vtb.a(ma8Var), new yq9(5000L, Long.MAX_VALUE), new ja8(lc3Var, true));
            case 16:
                List list = RealWebSocket.J;
                ((RealWebSocket) obj).cancel();
                return hebVar;
            case 17:
                List list2 = RealWebSocket.J;
                _UtilCommonKt.b((WebSocketWriter) obj);
                return hebVar;
            case 18:
                List list3 = RealWebSocket.J;
                _UtilCommonKt.b((Closeable) ((rg8) obj).a);
                return hebVar;
            case 19:
                e37[] e37VarArr = (e37[]) obj;
                e37[] e37VarArr2 = (e37[]) Arrays.copyOf(e37VarArr, e37VarArr.length);
                Object[] objArrCopyOf = Arrays.copyOf(e37VarArr2, e37VarArr2.length);
                hk9 hk9Var = new hk9();
                hk9Var.addAll(fw.O0(objArrCopyOf));
                return new u27(hk9Var);
            case 20:
                uk8 uk8Var = (uk8) obj;
                ArrayList arrayList3 = new ArrayList();
                if (uk8Var.b) {
                    arrayList3.add("containerSize");
                }
                if (uk8Var.c) {
                    arrayList3.add("contentSize");
                }
                if (uk8Var.d) {
                    arrayList3.add("contentOriginSize");
                }
                if (uk8Var.e) {
                    arrayList3.add("rotation");
                }
                if (uk8Var.f) {
                    arrayList3.add("contentScale");
                }
                if (uk8Var.g) {
                    arrayList3.add("alignment");
                }
                if (uk8Var.h) {
                    arrayList3.add("rtlLayoutDirection");
                }
                if (uk8Var.i) {
                    arrayList3.add("readMode");
                }
                if (uk8Var.j) {
                    arrayList3.add("scalesCalculator");
                }
                if (uk8Var.k) {
                    arrayList3.add("limitOffsetWithinBaseVisibleRect");
                }
                if (uk8Var.l) {
                    arrayList3.add("containerWhitespaceMultiple");
                }
                if (uk8Var.m) {
                    arrayList3.add("containerWhitespace");
                }
                return fc1.D0(fc1.Z0(arrayList3), null, null, null, null, 63);
            case 21:
                ll8 ll8Var = (ll8) obj;
                ClassLoader classLoader = ll8Var.c;
                gx3 gx3Var = ll8Var.d;
                Enumeration<URL> resources = classLoader.getResources("");
                resources.getClass();
                ArrayList list4 = Collections.list(resources);
                list4.getClass();
                ArrayList arrayList4 = new ArrayList();
                int size = list4.size();
                int i5 = 0;
                while (i5 < size) {
                    Object obj3 = list4.get(i5);
                    i5++;
                    URL url = (URL) obj3;
                    url.getClass();
                    if (lc5.Q(url.getProtocol(), "file")) {
                        String str = zn7.b;
                        xl7Var2 = new xl7(gx3Var, xn7.e(new File(url.toURI())));
                    } else {
                        xl7Var2 = null;
                    }
                    if (xl7Var2 != null) {
                        arrayList4.add(xl7Var2);
                    }
                }
                Enumeration<URL> resources2 = classLoader.getResources("META-INF/MANIFEST.MF");
                resources2.getClass();
                ArrayList list5 = Collections.list(resources2);
                list5.getClass();
                ArrayList arrayList5 = new ArrayList();
                int size2 = list5.size();
                int i6 = 0;
                while (i6 < size2) {
                    Object obj4 = list5.get(i6);
                    i6++;
                    URL url2 = (URL) obj4;
                    url2.getClass();
                    String string2 = url2.toString();
                    string2.getClass();
                    if (iw9.K(string2, "jar:file:", false) && (iC0 = bw9.c0(6, string2, "!")) != -1) {
                        String str2 = zn7.b;
                        xl7Var = new xl7(un9.n(xn7.e(new File(URI.create(string2.substring(4, iC0)))), gx3Var, new f48(9)), ll8.f);
                    } else {
                        xl7Var = null;
                    }
                    if (xl7Var != null) {
                        arrayList5.add(xl7Var);
                    }
                }
                return fc1.I0(arrayList4, arrayList5);
            case 22:
                ms8 ms8Var = (ms8) obj;
                qt8 qt8Var = ms8Var.a;
                Object obj5 = ms8Var.d;
                if (obj5 != null) {
                    return qt8Var.b(ms8Var, obj5);
                }
                gp.l("Value should be initialized");
                return null;
            case 23:
                ab6 ab6Var = ((us8) obj).c;
                if (ab6Var == null) {
                    return null;
                }
                Bundle bundleU = jv3.u((xl7[]) Arrays.copyOf(new xl7[0], 0));
                ab6Var.z(bundleU);
                if (bundleU.isEmpty()) {
                    return null;
                }
                return bundleU;
            case 24:
                return gt8.c((eub) obj);
            case 25:
                mt8 mt8Var = (mt8) obj;
                mt8Var.i().a(new jf8(mt8Var, 0));
                return hebVar;
            case 26:
                return new gn9((wa2) ((k80) obj).b);
            case 27:
                yw8 yw8Var = (yw8) obj;
                bg bgVar = (bg) md2.y(yw8Var, xi7.a);
                yw8Var.N = bgVar;
                yw8Var.O = bgVar != null ? new ag(bgVar.a, bgVar.b, bgVar.c, bgVar.d) : null;
                return hebVar;
            case 28:
                iz8 iz8Var = (iz8) obj;
                p3b p3bVar = iz8Var.e;
                iz8Var.f = p3bVar != null ? ((Number) p3bVar.l.getValue()).longValue() : 0L;
                return hebVar;
            default:
                return obj;
        }
    }
}
