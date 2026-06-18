package defpackage;

import android.net.NetworkRequest;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.view.KeyEvent;
import com.google.android.gms.internal.firebase-auth-api.zzahy;
import com.google.android.gms.internal.firebase-auth-api.zzaiz;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import org.mozilla.javascript.Parser;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public abstract class tl9 {
    public static final fg3 a(a25 a25Var, Throwable th) {
        jy4 jy4Var;
        if (th instanceof x97) {
            kb4 kb4Var = a25Var.n;
            x15 x15Var = a25Var.t;
            jy4Var = (jy4) kb4Var.invoke(a25Var);
            if (jy4Var == null) {
                jy4Var = (jy4) x15Var.j.invoke(a25Var);
            }
            if (jy4Var == null && (jy4Var = (jy4) a25Var.m.invoke(a25Var)) == null) {
                jy4Var = (jy4) x15Var.i.invoke(a25Var);
            }
        } else {
            jy4Var = (jy4) a25Var.m.invoke(a25Var);
            if (jy4Var == null) {
                jy4Var = (jy4) a25Var.t.i.invoke(a25Var);
            }
        }
        return new fg3(jy4Var, a25Var, th);
    }

    public static final void b(boolean z, List list, boolean z2, ou6 ou6Var, pj7 pj7Var, ib4 ib4Var, ib4 ib4Var2, dd4 dd4Var, int i) {
        int i2;
        ou6 ou6Var2;
        dd4Var.h0(-786622706);
        if ((i & 6) == 0) {
            i2 = (dd4Var.g(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= dd4Var.h(list) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= dd4Var.g(z2) ? 256 : Token.CASE;
        }
        if ((i & 3072) == 0) {
            ou6Var2 = ou6Var;
            i2 |= dd4Var.f(ou6Var2) ? 2048 : 1024;
        } else {
            ou6Var2 = ou6Var;
        }
        if ((i & 24576) == 0) {
            i2 |= dd4Var.f(pj7Var) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= dd4Var.h(ib4Var) ? 131072 : Parser.ARGC_LIMIT;
        }
        if ((1572864 & i) == 0) {
            i2 |= dd4Var.h(ib4Var2) ? 1048576 : 524288;
        }
        int i3 = 1;
        if (dd4Var.V(i2 & 1, (599187 & i2) != 599186)) {
            g78 g78VarB = z68.b(dd4Var);
            z68.a(z, ib4Var, ou6Var2, g78VarB, (f9) null, jf0.G(-953634411, new gu2(g78VarB, z, pj7Var, i3), dd4Var), false, 0.0f, jf0.G(1332009522, new sl9(mt5.e(0, ib4Var2, dd4Var, (i2 >> 9) & 7168, 7), pj7Var, list, z2), dd4Var), dd4Var, (i2 & 14) | 100859904 | ((i2 >> 12) & Token.ASSIGN_MOD) | ((i2 >> 3) & 896));
        } else {
            dd4Var.Y();
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new dn0(z, list, z2, ou6Var, pj7Var, ib4Var, ib4Var2, i);
        }
    }

    public static final void c(ul9 ul9Var, ou6 ou6Var, pj7 pj7Var, ib4 ib4Var, ib4 ib4Var2, dd4 dd4Var, int i) {
        int i2;
        dd4 dd4Var2 = dd4Var;
        dd4Var2.h0(122573930);
        if ((i & 6) == 0) {
            i2 = (dd4Var2.f(ul9Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= dd4Var2.f(ou6Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= dd4Var2.f(pj7Var) ? 256 : Token.CASE;
        }
        if ((i & 3072) == 0) {
            i2 |= dd4Var2.h(ib4Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= dd4Var2.h(ib4Var2) ? 16384 : 8192;
        }
        int i3 = i2;
        if (dd4Var2.V(i3 & 1, (i3 & 9363) != 9362)) {
            boolean z = ul9Var.a;
            List list = ul9Var.c;
            if (z && list.isEmpty()) {
                dd4Var2.f0(877997233);
                d(gjb.n0(gjb.k0(tg9.f(ou6Var, 1.0f), pj7Var), 16.0f, 0.0f, 2), dd4Var2, 0);
                dd4Var2.q(false);
            } else if (ul9Var.d) {
                dd4Var2.f0(878215597);
                dd4Var2.q(false);
            } else if (list.isEmpty()) {
                dd4Var2.f0(878264205);
                dd4Var2.q(false);
            } else {
                dd4Var2.f0(878320284);
                b(ul9Var.a, ul9Var.c, ul9Var.b, tg9.f(ou6Var, 1.0f), yib.m(yib.w(pj7Var, yib.d(14, dd4Var2, false)), 16.0f, 0.0f, 16.0f, 12.0f, dd4Var2, 27696, 2), ib4Var, ib4Var2, dd4Var, (i3 << 6) & 4128768);
                dd4Var2 = dd4Var;
                dd4Var2.q(false);
            }
        } else {
            dd4Var2.Y();
        }
        ye8 ye8VarU = dd4Var2.u();
        if (ye8VarU != null) {
            ye8VarU.d = new l41(ul9Var, ou6Var, pj7Var, ib4Var, ib4Var2, i);
        }
    }

    public static final void d(ou6 ou6Var, dd4 dd4Var, int i) {
        dd4Var.h0(-1690828537);
        int i2 = (dd4Var.f(ou6Var) ? 4 : 2) | i;
        if (dd4Var.V(i2 & 1, (i2 & 3) != 2)) {
            ie1 ie1VarA = ge1.a(pv.c, bv4.z, dd4Var, 0);
            int iHashCode = Long.hashCode(dd4Var.T);
            lr7 lr7VarL = dd4Var.l();
            ou6 ou6VarL0 = s32.L0(dd4Var, ou6Var);
            ml1.k.getClass();
            um1 um1Var = ll1.b;
            dd4Var.j0();
            if (dd4Var.S) {
                dd4Var.k(um1Var);
            } else {
                dd4Var.s0();
            }
            un9.s(ll1.f, dd4Var, ie1VarA);
            un9.s(ll1.e, dd4Var, lr7VarL);
            un9.s(ll1.g, dd4Var, Integer.valueOf(iHashCode));
            un9.r(dd4Var, ll1.h);
            un9.s(ll1.d, dd4Var, ou6VarL0);
            dd4Var.f0(1117177059);
            for (int i3 = 0; i3 < 12; i3++) {
                lu6 lu6Var = lu6.a;
                ql9.e(j(dd4Var, tg9.f(lu6Var, 1.0f)), dd4Var, 0);
                if (i3 < 11) {
                    ky0.z(dd4Var, -1848431783, lu6Var, 8.0f, dd4Var);
                    dd4Var.q(false);
                } else {
                    dd4Var.f0(-1848362591);
                    dd4Var.q(false);
                }
            }
            dd4Var.q(false);
            dd4Var.q(true);
        } else {
            dd4Var.Y();
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new ot(ou6Var, i, 21);
        }
    }

    public static final void e(final String str, final String str2, final String str3, final t27 t27Var, dd4 dd4Var, final int i) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        t27Var.getClass();
        dd4Var.h0(-773081524);
        int i2 = 4;
        int i3 = i | (dd4Var.f(str) ? 4 : 2) | (dd4Var.f(str2) ? 32 : 16) | (dd4Var.f(str3) ? 256 : Token.CASE) | (dd4Var.f(t27Var) ? 2048 : 1024);
        final int i4 = 1;
        if (dd4Var.V(i3 & 1, (i3 & 1171) != 1170)) {
            String strH = dx1.h(str, "-", str3);
            boolean z = ((i3 & 896) == 256) | ((i3 & 14) == 4);
            Object objQ = dd4Var.Q();
            Object obj = vl1.a;
            if (z || objQ == obj) {
                objQ = new lq2(str, str3, i2);
                dd4Var.p0(objQ);
            }
            ib4 ib4Var = (ib4) objQ;
            pj4 pj4VarA = e36.a(dd4Var);
            if (pj4VarA == null) {
                gp.j("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
            ry6 ry6VarD = pj4VarA instanceof pj4 ? pj4VarA.d() : v02.b;
            ev8 ev8VarA = ek5.a(dd4Var);
            a91 a91VarA = ug8.a(yl9.class);
            yl9 yl9Var = (yl9) ((qtb) qx1.N(a91VarA, pj4VarA.f(), dx1.h(a91VarA.f(), "-", strH), ry6VarD, ev8VarA, ib4Var));
            boolean zF = dd4Var.f(yl9Var);
            Object objQ2 = dd4Var.Q();
            if (zF || objQ2 == obj) {
                objQ2 = new ol9(yl9Var, 1);
                dd4Var.p0(objQ2);
            }
            lx1.g(yl9Var, null, (kb4) objQ2, dd4Var, 0);
            a07 a07VarB = bx1.B(yl9Var.M, dd4Var);
            final a07 a07VarB2 = bx1.B(yl9Var.d, dd4Var);
            Object[] objArr = new Object[0];
            Object objQ3 = dd4Var.Q();
            if (objQ3 == obj) {
                objQ3 = new aa9(28);
                dd4Var.p0(objQ3);
            }
            final a07 a07Var = (a07) ww1.b0(objArr, (ib4) objQ3, dd4Var, 48);
            dd4Var.f0(98019706);
            String strK = str2.length() == 0 ? wn9.K((pv9) vt9.y0.getValue(), dd4Var) : str2;
            dd4Var.q(false);
            boolean z2 = false;
            gx1.p(strK, null, false, jf0.G(1377216592, new oe9(t27Var, i4), dd4Var), jf0.G(-670762233, new zb4() { // from class: jz5
                @Override // defpackage.zb4
                public final Object c(Object obj2, Object obj3, Object obj4) {
                    int i5 = i4;
                    heb hebVar = heb.a;
                    lu6 lu6Var = lu6.a;
                    Object obj5 = vl1.a;
                    br9 br9Var = a07VarB2;
                    a07 a07Var2 = a07Var;
                    switch (i5) {
                        case 0:
                            dd4 dd4Var2 = (dd4) obj3;
                            int iIntValue = ((Integer) obj4).intValue();
                            ((fq8) obj2).getClass();
                            if (!dd4Var2.V(iIntValue & 1, (iIntValue & 17) != 16)) {
                                dd4Var2.Y();
                            } else {
                                u4b u4bVar = (u4b) br9Var.getValue();
                                rj7 rj7Var = new rj7(3.0f, 3.0f, 3.0f, 3.0f);
                                boolean zF2 = dd4Var2.f(a07Var2);
                                Object objQ4 = dd4Var2.Q();
                                if (zF2 || objQ4 == obj5) {
                                    objQ4 = new lz4(a07Var2, 8);
                                    dd4Var2.p0(objQ4);
                                }
                                wn9.h(u4bVar, false, null, rj7Var, (ib4) objQ4, dd4Var2, 3072, 6);
                                un9.a(dd4Var2, tg9.r(lu6Var, 6.0f));
                            }
                            break;
                        default:
                            dd4 dd4Var3 = (dd4) obj3;
                            int iIntValue2 = ((Integer) obj4).intValue();
                            ((fq8) obj2).getClass();
                            if (!dd4Var3.V(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                dd4Var3.Y();
                            } else {
                                u4b u4bVar2 = (u4b) br9Var.getValue();
                                rj7 rj7Var2 = new rj7(3.0f, 3.0f, 3.0f, 3.0f);
                                boolean zF3 = dd4Var3.f(a07Var2);
                                Object objQ5 = dd4Var3.Q();
                                if (zF3 || objQ5 == obj5) {
                                    objQ5 = new vb9(a07Var2, 4);
                                    dd4Var3.p0(objQ5);
                                }
                                wn9.h(u4bVar2, false, null, rj7Var2, (ib4) objQ5, dd4Var3, 3072, 6);
                                un9.a(dd4Var3, tg9.r(lu6Var, 6.0f));
                            }
                            break;
                    }
                    return hebVar;
                }
            }, dd4Var), jf0.G(1443411650, new qs1(6, yl9Var, a07VarB), dd4Var), dd4Var, 224256, 6);
            boolean zBooleanValue = ((Boolean) a07Var.getValue()).booleanValue();
            boolean zF2 = dd4Var.f(a07Var);
            Object objQ4 = dd4Var.Q();
            if (zF2 || objQ4 == obj) {
                objQ4 = new hp8(a07Var, 27);
                dd4Var.p0(objQ4);
            }
            kb4 kb4Var = (kb4) objQ4;
            boolean zF3 = dd4Var.f(a07Var);
            if ((i3 & 7168) == 2048) {
                z2 = true;
            }
            boolean z3 = zF3 | z2;
            Object objQ5 = dd4Var.Q();
            if (z3 || objQ5 == obj) {
                objQ5 = new xj0(t27Var, a07Var, 20);
                dd4Var.p0(objQ5);
            }
            wn9.c(zBooleanValue, null, str, kb4Var, (ib4) objQ5, dd4Var, (i3 << 6) & 896);
        } else {
            dd4Var.Y();
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            final int i5 = 1;
            ye8VarU.d = new yb4(str, str2, str3, t27Var, i, i5) { // from class: kz5
                public final /* synthetic */ int a;
                public final /* synthetic */ String b;
                public final /* synthetic */ String c;
                public final /* synthetic */ String d;
                public final /* synthetic */ t27 e;

                {
                    this.a = i5;
                }

                @Override // defpackage.yb4
                public final Object invoke(Object obj2, Object obj3) {
                    int i6 = this.a;
                    heb hebVar = heb.a;
                    switch (i6) {
                        case 0:
                            ((Integer) obj3).getClass();
                            int iX0 = qu1.x0(1);
                            i12.i(this.b, this.c, this.d, this.e, (dd4) obj2, iX0);
                            break;
                        default:
                            ((Integer) obj3).getClass();
                            int iX02 = qu1.x0(1);
                            tl9.e(this.b, this.c, this.d, this.e, (dd4) obj2, iX02);
                            break;
                    }
                    return hebVar;
                }
            };
        }
    }

    public static final void f(String str, ou6 ou6Var, dd4 dd4Var, int i) {
        str.getClass();
        dd4Var.h0(-1643328597);
        int i2 = i & 1;
        if (dd4Var.V(i2, i2 != 0)) {
            ou6Var = lu6.a;
        } else {
            dd4Var.Y();
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new l8(str, ou6Var, i, 4);
        }
    }

    public static final void g(boolean z, ib4 ib4Var, ib4 ib4Var2, ib4 ib4Var3, dd4 dd4Var, int i) {
        ib4Var.getClass();
        ib4Var2.getClass();
        ib4Var3.getClass();
        dd4Var.h0(-824872784);
        int i2 = (dd4Var.g(z) ? 4 : 2) | i | (dd4Var.h(ib4Var) ? 32 : 16) | (dd4Var.h(ib4Var2) ? 256 : Token.CASE) | (dd4Var.h(ib4Var3) ? 2048 : 1024);
        int i3 = 1;
        if (dd4Var.V(i2 & 1, (i2 & 1171) != 1170)) {
            boolean z2 = ((i2 & Token.ASSIGN_MOD) == 32) | ((i2 & 7168) == 2048) | ((i2 & 896) == 256);
            Object objQ = dd4Var.Q();
            if (z2 || objQ == vl1.a) {
                objQ = new pj5(ib4Var, ib4Var3, ib4Var2, i3);
                dd4Var.p0(objQ);
            }
            tw1.f(z, (kb4) objQ, dd4Var, i2 & 14, 0);
        } else {
            dd4Var.Y();
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new i90(z, ib4Var, ib4Var2, ib4Var3, i);
        }
    }

    public static final boolean h(int i, KeyEvent keyEvent) {
        return ((int) (vw1.C(keyEvent) >> 32)) == i;
    }

    public static final LinkedHashSet i(byte[] bArr) throws IOException {
        bArr.getClass();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (bArr.length == 0) {
            return linkedHashSet;
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        try {
            try {
                ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
                try {
                    int i = objectInputStream.readInt();
                    for (int i2 = 0; i2 < i; i2++) {
                        Uri uri = Uri.parse(objectInputStream.readUTF());
                        boolean z = objectInputStream.readBoolean();
                        uri.getClass();
                        linkedHashSet.add(new sp1(z, uri));
                    }
                    objectInputStream.close();
                } finally {
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            byteArrayInputStream.close();
            return linkedHashSet;
        } finally {
        }
    }

    public static final ou6 j(dd4 dd4Var, ou6 ou6Var) {
        ur9 ur9Var = s96.a;
        return gjb.l0(fe.L(t96.w(ou6Var, ((q96) dd4Var.j(ur9Var)).c.d), dd1.g(((q96) dd4Var.j(ur9Var)).a, 1.0f), jf0.G), 16.0f);
    }

    public static o9a k(float f, float f2, int i, int i2, int i3) {
        sz6 sz6Var = new sz6(1);
        sz6Var.b = 0.0f;
        sz6Var.c = 0.0f;
        sz6Var.d = 0.0f;
        sz6Var.e = 0.0f;
        o9a o9aVar = o9a.a;
        o9a o9aVar2 = o9a.c;
        o9a o9aVar3 = o9a.b;
        switch (i3) {
            case 0:
                return f < ((float) i) / 3.0f ? o9aVar : f > ((float) (i * 2)) / 3.0f ? o9aVar3 : o9aVar2;
            case 1:
                float f3 = i2;
                sz6Var.d(i / 4.0f, f3 / 3.0f, (i * 3) / 4.0f, (i2 * 2) / 3.0f);
                return sz6Var.a(f, f2) ? o9aVar2 : f2 < f3 / 2.0f ? o9aVar : o9aVar3;
            case 2:
                float f4 = i2;
                float f5 = f4 / 3.0f;
                float f6 = i;
                float f7 = f6 / 3.0f;
                sz6Var.d(0.0f, f5, f7, f4);
                if (sz6Var.a(f, f2)) {
                    return o9aVar;
                }
                sz6Var.d(f7, (i2 * 2) / 3.0f, f6, f4);
                if (sz6Var.a(f, f2)) {
                    return o9aVar3;
                }
                sz6Var.d((i * 2) / 3.0f, f5, f6, f4);
                return sz6Var.a(f, f2) ? o9aVar3 : o9aVar2;
            case 3:
                float f8 = (i * 2) / 7.0f;
                float f9 = i2 / 3.0f;
                float f10 = (i * 5) / 7.0f;
                sz6Var.d(f8, f9, f10, (i2 * 2) / 3.0f);
                if (sz6Var.a(f, f2)) {
                    return o9aVar2;
                }
                if (f < f8) {
                    return o9aVar;
                }
                sz6Var.d(0.0f, 0.0f, f10, f9);
                return sz6Var.a(f, f2) ? o9aVar : o9aVar3;
            case 4:
                sz6Var.d((i * 2) / 7.0f, i2 / 3.0f, (i * 5) / 7.0f, (i2 * 2) / 3.0f);
                return sz6Var.a(f, f2) ? o9aVar2 : o9aVar3;
            case 5:
                float f11 = (i * 2) / 7.0f;
                float f12 = i2 / 3.0f;
                float f13 = (i * 5) / 7.0f;
                sz6Var.d(f11, f12, f13, (i2 * 2) / 3.0f);
                if (sz6Var.a(f, f2)) {
                    return o9aVar2;
                }
                sz6Var.d(f11, 0.0f, f13, f12);
                return sz6Var.a(f, f2) ? o9aVar : o9aVar3;
            case 6:
                float f14 = (i * 2) / 7.0f;
                float f15 = i2 / 3.0f;
                sz6Var.d(f14, f15, (i * 5) / 7.0f, (i2 * 2) / 3.0f);
                if (sz6Var.a(f, f2)) {
                    return o9aVar2;
                }
                sz6Var.d(0.0f, 0.0f, f14, f15);
                return sz6Var.a(f, f2) ? o9aVar : o9aVar3;
            case 7:
                float f16 = i2 / 3.0f;
                float f17 = (i * 5) / 7.0f;
                sz6Var.d((i * 2) / 7.0f, f16, f17, (i2 * 2) / 3.0f);
                if (sz6Var.a(f, f2)) {
                    return o9aVar2;
                }
                sz6Var.d(f17, 0.0f, i, f16);
                return sz6Var.a(f, f2) ? o9aVar : o9aVar3;
            default:
                return o9a.d;
        }
    }

    public static final hc0 l(int i) {
        if (i == 0) {
            return hc0.a;
        }
        if (i == 1) {
            return hc0.b;
        }
        gp.l(xv5.k(i, "Could not convert ", " to BackoffPolicy"));
        return null;
    }

    public static final w57 m(int i) {
        if (i == 0) {
            return w57.a;
        }
        if (i == 1) {
            return w57.b;
        }
        if (i == 2) {
            return w57.c;
        }
        if (i == 3) {
            return w57.d;
        }
        if (i == 4) {
            return w57.e;
        }
        if (Build.VERSION.SDK_INT >= 30 && i == 5) {
            return w57.f;
        }
        gp.l(xv5.k(i, "Could not convert ", " to NetworkType"));
        return null;
    }

    public static final rh7 n(int i) {
        if (i == 0) {
            return rh7.a;
        }
        if (i == 1) {
            return rh7.b;
        }
        gp.l(xv5.k(i, "Could not convert ", " to OutOfQuotaPolicy"));
        return null;
    }

    public static final p1c o(int i) {
        if (i == 0) {
            return p1c.a;
        }
        if (i == 1) {
            return p1c.b;
        }
        if (i == 2) {
            return p1c.c;
        }
        if (i == 3) {
            return p1c.d;
        }
        if (i == 4) {
            return p1c.e;
        }
        if (i == 5) {
            return p1c.f;
        }
        gp.l(xv5.k(i, "Could not convert ", " to State"));
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:78:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0119  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final uka p(uka r28, zm5 r29) {
        /*
            Method dump skipped, instruction units count: 295
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tl9.p(uka, zm5):uka");
    }

    public static final int q(p1c p1cVar) {
        p1cVar.getClass();
        int iOrdinal = p1cVar.ordinal();
        if (iOrdinal == 0) {
            return 0;
        }
        int i = 1;
        if (iOrdinal != 1) {
            i = 2;
            if (iOrdinal != 2) {
                i = 3;
                if (iOrdinal != 3) {
                    i = 4;
                    if (iOrdinal != 4) {
                        if (iOrdinal == 5) {
                            return 5;
                        }
                        mn5.g();
                        return 0;
                    }
                }
            }
        }
        return i;
    }

    public static final p57 r(byte[] bArr) throws IOException {
        bArr.getClass();
        if (Build.VERSION.SDK_INT < 28 || bArr.length == 0) {
            return new p57((NetworkRequest) null);
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        try {
            ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
            try {
                int i = objectInputStream.readInt();
                int[] iArr = new int[i];
                for (int i2 = 0; i2 < i; i2++) {
                    iArr[i2] = objectInputStream.readInt();
                }
                int i3 = objectInputStream.readInt();
                int[] iArr2 = new int[i3];
                for (int i4 = 0; i4 < i3; i4++) {
                    iArr2[i4] = objectInputStream.readInt();
                }
                p57 p57VarJ = cr.j(iArr2, iArr);
                objectInputStream.close();
                byteArrayInputStream.close();
                return p57VarJ;
            } finally {
            }
        } finally {
        }
    }

    public static final int s(String str) {
        hcb hcbVarT = t(16, str);
        if (hcbVarT != null) {
            return hcbVarT.a;
        }
        iw9.E(str);
        throw null;
    }

    public static final hcb t(int i, String str) {
        int i2;
        gjb.X(i);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i3 = 0;
        char cCharAt = str.charAt(0);
        if (lc5.V(cCharAt, 48) < 0) {
            i2 = 1;
            if (length == 1 || cCharAt != '+') {
                return null;
            }
        } else {
            i2 = 0;
        }
        int i4 = 119304647;
        while (i2 < length) {
            int iDigit = Character.digit((int) str.charAt(i2), i);
            if (iDigit < 0) {
                return null;
            }
            int i5 = i3 ^ Integer.MIN_VALUE;
            if (Integer.compare(i5, i4 ^ Integer.MIN_VALUE) > 0) {
                if (i4 != 119304647) {
                    return null;
                }
                i4 = (int) (4294967295L / (((long) i) & 4294967295L));
                if (Integer.compare(i5, i4 ^ Integer.MIN_VALUE) > 0) {
                    return null;
                }
            }
            int i6 = i3 * i;
            int i7 = iDigit + i6;
            if (Integer.compare(i7 ^ Integer.MIN_VALUE, i6 ^ Integer.MIN_VALUE) < 0) {
                return null;
            }
            i2++;
            i3 = i7;
        }
        return new hcb(i3);
    }

    public static final mcb u(String str) {
        str.getClass();
        int i = 10;
        gjb.X(10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i2 = 0;
        char cCharAt = str.charAt(0);
        if (lc5.V(cCharAt, 48) < 0) {
            i2 = 1;
            if (length == 1 || cCharAt != '+') {
                return null;
            }
        }
        long j = 0;
        long j2 = 512409557603043100L;
        while (i2 < length) {
            int iDigit = Character.digit((int) str.charAt(i2), i);
            if (iDigit < 0) {
                return null;
            }
            long j3 = j ^ Long.MIN_VALUE;
            int i3 = length;
            if (Long.compare(j3, j2 ^ Long.MIN_VALUE) > 0) {
                if (j2 != 512409557603043100L || Long.compare(j3, -7378697629483820647L) > 0) {
                    return null;
                }
                j2 = 1844674407370955161L;
            }
            long j4 = j * 10;
            long j5 = (((long) iDigit) & 4294967295L) + j4;
            if (Long.compare(j5 ^ Long.MIN_VALUE, j4 ^ Long.MIN_VALUE) < 0) {
                return null;
            }
            i2++;
            j = j5;
            length = i3;
            i = 10;
        }
        return new mcb(j);
    }

    public static cx6 v(zzahy zzahyVar) {
        if (zzahyVar == null) {
            return null;
        }
        if (!TextUtils.isEmpty(zzahyVar.zze())) {
            String strZzd = zzahyVar.zzd();
            String strZzc = zzahyVar.zzc();
            long jZza = zzahyVar.zza();
            String strZze = zzahyVar.zze();
            ex1.z(strZze);
            return new js7(jZza, strZzd, strZzc, strZze);
        }
        if (zzahyVar.zzb() == null) {
            return null;
        }
        String strZzd2 = zzahyVar.zzd();
        String strZzc2 = zzahyVar.zzc();
        long jZza2 = zzahyVar.zza();
        zzaiz zzaizVarZzb = zzahyVar.zzb();
        ex1.D(zzaizVarZzb, "totpInfo cannot be null.");
        return new h1b(strZzd2, strZzc2, jZza2, zzaizVarZzb);
    }

    public static ArrayList w(List list) {
        if (list == null || list.isEmpty()) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            cx6 cx6VarV = v((zzahy) it.next());
            if (cx6VarV != null) {
                arrayList.add(cx6VarV);
            }
        }
        return arrayList;
    }
}
