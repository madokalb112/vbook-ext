package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public abstract class yoa {
    public static final roa a = new roa();
    public static final float b = 0.125f / 18.0f;

    public static final kf8 a(yia yiaVar, int i, List list, lh7 lh7Var, List list2) {
        int i2;
        ot5 ot5Var;
        ot5 ot5Var2 = (ot5) fc1.z0(list);
        if (ot5Var2 != null) {
            int i3 = ot5Var2.a;
            ot5 ot5Var3 = (ot5) fc1.F0(list);
            if (ot5Var3 != null) {
                int i4 = ot5Var3.a;
                int i5 = -1;
                if (i3 <= i4) {
                    int i6 = i3;
                    i2 = -1;
                    while (true) {
                        tj7 tj7Var = (tj7) fc1.A0(i6, list2);
                        if (tj7Var != null && (tj7Var instanceof pia) && yiaVar.a == tj7Var.b) {
                            int i7 = yiaVar.b;
                            ria riaVar = ((pia) tj7Var).g;
                            if (i7 >= riaVar.b && i7 <= riaVar.c) {
                                i2 = i6 - i3;
                            }
                        }
                        if (i6 == i4) {
                            break;
                        }
                        i6++;
                    }
                } else {
                    i2 = -1;
                }
                if (i2 >= 0 && (ot5Var = (ot5) fc1.A0(i2, list)) != null) {
                    Object objA0 = fc1.A0(i2 + i3, list2);
                    Object obj = null;
                    pia piaVar = objA0 instanceof pia ? (pia) objA0 : null;
                    if (piaVar != null) {
                        ria riaVar2 = piaVar.g;
                        ArrayList arrayList = riaVar2.f;
                        int size = arrayList.size();
                        int i8 = 0;
                        int i9 = 0;
                        while (true) {
                            if (i9 >= size) {
                                break;
                            }
                            Object obj2 = arrayList.get(i9);
                            i9++;
                            sia siaVar = (sia) obj2;
                            int i10 = yiaVar.b;
                            if (i10 >= siaVar.a && i10 <= siaVar.b) {
                                i5 = i8;
                                break;
                            }
                            i8++;
                        }
                        sia siaVar2 = (sia) fc1.A0(i5, riaVar2.f);
                        if (siaVar2 != null) {
                            int i11 = (i5 * i) / riaVar2.d;
                            Iterator it = siaVar2.d.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    break;
                                }
                                Object next = it.next();
                                tia tiaVar = (tia) next;
                                int i12 = yiaVar.b;
                                if (i12 >= tiaVar.d && i12 <= tiaVar.e) {
                                    obj = next;
                                    break;
                                }
                            }
                            tia tiaVar2 = (tia) obj;
                            if (tiaVar2 != null) {
                                long j = tiaVar2.a;
                                jk jkVar = tiaVar2.h;
                                if (jkVar != null) {
                                    kf8 kf8VarA = jkVar.a(yiaVar.b - tiaVar2.b);
                                    float f = kf8VarA.b;
                                    float f2 = kf8VarA.a;
                                    if (lh7Var == lh7.a) {
                                        return rw1.w((((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j >> 32)) + f2)) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j & 4294967295L)) + f + ot5Var.p)) & 4294967295L), kf8VarA.f());
                                    }
                                    return rw1.w((((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j & 4294967295L)) + f)) & 4294967295L) | (((long) Float.floatToRawIntBits((Float.intBitsToFloat((int) (j >> 32)) + (i11 + f2)) + ot5Var.p)) << 32), kf8VarA.f());
                                }
                            }
                        }
                    }
                }
            }
        }
        return kf8.e;
    }

    public static final yia b(float f, float f2, int i, List list, lh7 lh7Var, List list2) {
        zoa zoaVarD = d(f, f2, i, list, lh7Var, list2);
        if (zoaVarD == null) {
            return yia.d;
        }
        int i2 = zoaVarD.a.b;
        int i3 = zoaVarD.d;
        tia tiaVar = zoaVarD.b;
        return new yia(i2, wx1.Q(i3 + tiaVar.b, tiaVar.d, tiaVar.e));
    }

    public static final boolean c(mx7 mx7Var, long j) {
        Object obj;
        List list = mx7Var.a;
        int size = list.size();
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= size) {
                obj = null;
                break;
            }
            obj = list.get(i);
            if (tx7.a(((ux7) obj).a, j)) {
                break;
            }
            i++;
        }
        ux7 ux7Var = (ux7) obj;
        if (ux7Var != null && ux7Var.d) {
            z = true;
        }
        return true ^ z;
    }

    public static final zoa d(float f, float f2, int i, List list, lh7 lh7Var, List list2) {
        lh7 lh7Var2;
        Object obj;
        tj7 tj7Var;
        int i2;
        sia siaVar;
        long j;
        zoa zoaVar;
        Object obj2;
        int i3;
        int size = list.size();
        int i4 = 0;
        int i5 = 0;
        while (true) {
            lh7Var2 = lh7.a;
            if (i5 >= size) {
                obj = null;
                break;
            }
            obj = list.get(i5);
            ot5 ot5Var = (ot5) obj;
            if (lh7Var != lh7Var2) {
                if (f >= ot5Var.p && f <= r9 + ot5Var.q) {
                    break;
                }
                i5++;
            } else {
                if (f2 >= ot5Var.p && f2 <= r9 + ot5Var.q) {
                    break;
                }
                i5++;
            }
        }
        ot5 ot5Var2 = (ot5) obj;
        if (ot5Var2 != null && (tj7Var = (tj7) fc1.A0(ot5Var2.a, list2)) != null && (tj7Var instanceof pia)) {
            pia piaVar = (pia) tj7Var;
            ria riaVar = piaVar.g;
            int size2 = riaVar.f.size();
            while (true) {
                size2--;
                if (-1 >= size2) {
                    i2 = 0;
                    siaVar = null;
                    break;
                }
                i2 = (size2 * i) / riaVar.d;
                if (f >= i2) {
                    siaVar = (sia) riaVar.f.get(size2);
                    break;
                }
            }
            if (siaVar != null) {
                List list3 = siaVar.d;
                int size3 = list3.size();
                while (true) {
                    if (i4 >= size3) {
                        j = 4294967295L;
                        zoaVar = null;
                        obj2 = null;
                        break;
                    }
                    obj2 = list3.get(i4);
                    tia tiaVar = (tia) obj2;
                    if (lh7Var == lh7Var2) {
                        i3 = size3;
                        zoaVar = null;
                        if (f2 >= Float.intBitsToFloat((int) (tiaVar.a >> 32)) + ot5Var2.p && f2 <= Float.intBitsToFloat((int) (tiaVar.a & 4294967295L)) + ot5Var2.p + tiaVar.g) {
                            j = 4294967295L;
                            break;
                        }
                        i4++;
                        size3 = i3;
                    } else {
                        i3 = size3;
                        zoaVar = null;
                        long j2 = tiaVar.a;
                        j = 4294967295L;
                        if (f2 >= Float.intBitsToFloat((int) (j2 & 4294967295L)) && f2 <= Float.intBitsToFloat((int) (j2 & 4294967295L)) + tiaVar.g) {
                            int i6 = (int) (j2 >> 32);
                            float f3 = i2;
                            if (f >= Float.intBitsToFloat(i6) + ot5Var2.p + f3 && f <= Float.intBitsToFloat(i6) + ot5Var2.p + f3 + tiaVar.f) {
                                break;
                            }
                        }
                        i4++;
                        size3 = i3;
                    }
                }
                tia tiaVar2 = (tia) obj2;
                if (tiaVar2 == null) {
                    return zoaVar;
                }
                long j3 = tiaVar2.a;
                jk jkVar = tiaVar2.h;
                if (jkVar == null) {
                    return zoaVar;
                }
                int iD = lh7Var == lh7Var2 ? jkVar.d((((long) Float.floatToRawIntBits(f - Float.intBitsToFloat((int) (j3 >> 32)))) << 32) | (((long) Float.floatToRawIntBits((f2 - Float.intBitsToFloat((int) (j3 & j))) - ot5Var2.p)) & j)) : jkVar.d((((long) Float.floatToRawIntBits(((f - Float.intBitsToFloat((int) (j3 >> 32))) - i2) - ot5Var2.p)) << 32) | (((long) Float.floatToRawIntBits(f2 - Float.intBitsToFloat((int) (j3 & j)))) & j));
                return iD == -1 ? zoaVar : new zoa(piaVar, tiaVar2, jkVar, iD);
            }
        }
        return null;
    }

    public static final float e(ftb ftbVar, int i) {
        ftbVar.getClass();
        return i == 2 ? ftbVar.f() * b : ftbVar.f();
    }

    public static final ou6 f(ou6 ou6Var, boolean z, int i, nca ncaVar, sw8 sw8Var, jka jkaVar, kba kbaVar, pj7 pj7Var, zb4 zb4Var, dd4 dd4Var) {
        Object obj;
        a07 a07Var;
        Object k16Var;
        a07 a07Var2;
        a07 a07Var3;
        a07 a07Var4;
        nca ncaVar2;
        st5 st5Var;
        Object[] objArr;
        Object obj2;
        kf8 kf8Var;
        ou6 ou6Var2;
        br9 br9Var;
        zm5 zm5Var;
        a07 a07Var5;
        Object xoaVar;
        jka jkaVar2;
        ou6Var.getClass();
        ncaVar.getClass();
        jkaVar.getClass();
        kbaVar.getClass();
        pj7Var.getClass();
        zb4Var.getClass();
        Object objQ = dd4Var.Q();
        Object obj3 = vl1.a;
        if (objQ == obj3) {
            objQ = dk9.x(yia.d);
            dd4Var.p0(objQ);
        }
        a07 a07Var6 = (a07) objQ;
        zm5 zm5Var2 = (zm5) dd4Var.j(xm1.n);
        pn2 pn2Var = (pn2) dd4Var.j(xm1.h);
        jj4 jj4Var = (jj4) dd4Var.j(xm1.l);
        Object objQ2 = dd4Var.Q();
        if (objQ2 == obj3) {
            objQ2 = dk9.x(new eb7(0L));
            dd4Var.p0(objQ2);
        }
        a07 a07Var7 = (a07) objQ2;
        Object objQ3 = dd4Var.Q();
        if (objQ3 == obj3) {
            objQ3 = dk9.x(Boolean.FALSE);
            dd4Var.p0(objQ3);
        }
        br9 br9Var2 = (a07) objQ3;
        Object objQ4 = dd4Var.Q();
        if (objQ4 == obj3) {
            objQ4 = dk9.x(Boolean.TRUE);
            dd4Var.p0(objQ4);
        }
        a07 a07Var8 = (a07) objQ4;
        a07 a07VarA = dk9.A(kbaVar.a, dd4Var);
        a07 a07VarA2 = dk9.A(Float.valueOf(pn2Var.k0(gjb.W(pj7Var, zm5Var2))), dd4Var);
        a07 a07VarA3 = dk9.A(Float.valueOf(pn2Var.k0(pj7Var.d())), dd4Var);
        a07 a07VarA4 = dk9.A(Integer.valueOf(((int) (sw8Var.j() >> 32)) - (pn2Var.w0(gjb.V(pj7Var, zm5Var2)) + pn2Var.w0(gjb.W(pj7Var, zm5Var2)))), dd4Var);
        WeakHashMap weakHashMap = pzb.w;
        geb gebVar = ju7.i(dd4Var).l;
        boolean zF = dd4Var.f(gebVar) | dd4Var.e(sw8Var.j()) | dd4Var.f(pn2Var) | dd4Var.d(zm5Var2.ordinal());
        Object objQ5 = dd4Var.Q();
        if (zF || objQ5 == obj3) {
            obj = obj3;
            a07Var = a07VarA;
            objQ5 = rw1.u((((long) Float.floatToRawIntBits(gebVar.d(pn2Var, zm5Var2))) << 32) | (((long) Float.floatToRawIntBits(gebVar.a(pn2Var))) & 4294967295L), (((long) Float.floatToRawIntBits(((int) (sw8Var.j() >> 32)) - gebVar.b(pn2Var, zm5Var2))) << 32) | (((long) Float.floatToRawIntBits(((int) (sw8Var.j() & 4294967295L)) - gebVar.c(pn2Var))) & 4294967295L));
            dd4Var.p0(objQ5);
        } else {
            obj = obj3;
            a07Var = a07VarA;
        }
        kf8 kf8Var2 = (kf8) objQ5;
        a07 a07Var9 = a07Var;
        Object[] objArr2 = {jkaVar.d(), new na5(sw8Var.j()), Float.valueOf(((Number) a07VarA3.getValue()).floatValue()), Float.valueOf(((Number) a07VarA2.getValue()).floatValue())};
        boolean zF2 = dd4Var.f(a07VarA4) | dd4Var.f(sw8Var) | dd4Var.f(ncaVar) | dd4Var.f(a07VarA2) | dd4Var.f(a07VarA3);
        Object objQ6 = dd4Var.Q();
        Object obj4 = obj;
        if (zF2 || objQ6 == obj4) {
            a07Var2 = a07VarA4;
            a07Var3 = a07Var6;
            a07Var4 = a07Var9;
            k16Var = new k16(jkaVar, sw8Var, ncaVar, a07Var2, a07VarA2, a07VarA3, null, 2);
            ncaVar2 = ncaVar;
            dd4Var.p0(k16Var);
        } else {
            k16Var = objQ6;
            ncaVar2 = ncaVar;
            a07Var2 = a07VarA4;
            a07Var3 = a07Var6;
            a07Var4 = a07Var9;
        }
        lc5.x(objArr2, (yb4) k16Var, dd4Var);
        st5 st5VarI = sw8Var.i();
        a07 a07VarA5 = dk9.A(ncaVar2, dd4Var);
        dd4Var.f0(-1567585412);
        boolean zF3 = dd4Var.f(sw8Var);
        Object objQ7 = dd4Var.Q();
        if (zF3 || objQ7 == obj4) {
            objQ7 = new iy1(sw8Var, 2);
            dd4Var.p0(objQ7);
        }
        ou6 ou6VarJ = m79.J(ou6Var, (kb4) objQ7);
        Object[] objArr3 = {zm5Var2, Boolean.valueOf(z), st5VarI};
        boolean zG = dd4Var.g(z) | dd4Var.f(a07VarA2) | dd4Var.f(a07VarA3) | dd4Var.f(a07Var2) | dd4Var.f(st5VarI) | dd4Var.f(a07VarA5) | dd4Var.f(a07Var4) | dd4Var.h(jj4Var);
        Object objQ8 = dd4Var.Q();
        if (zG || objQ8 == obj4) {
            st5Var = st5VarI;
            objArr = objArr3;
            obj2 = obj4;
            kf8Var = kf8Var2;
            ou6Var2 = ou6VarJ;
            a07 a07Var10 = a07Var2;
            br9Var = br9Var2;
            zm5Var = zm5Var2;
            a07Var5 = a07Var7;
            objQ8 = new voa(z, st5Var, jkaVar, jj4Var, a07VarA2, a07VarA3, a07Var10, a07VarA5, a07Var4, a07Var3, a07Var5, br9Var, a07Var8);
            a07Var2 = a07Var10;
            dd4Var.p0(objQ8);
        } else {
            st5Var = st5VarI;
            objArr = objArr3;
            obj2 = obj4;
            kf8Var = kf8Var2;
            br9Var = br9Var2;
            ou6Var2 = ou6VarJ;
            zm5Var = zm5Var2;
            a07Var5 = a07Var7;
        }
        ou6 ou6VarD = r1a.d(ou6Var2, objArr, (PointerInputEventHandler) objQ8);
        zm5 zm5Var3 = zm5Var;
        Object[] objArr4 = {zm5Var3, pj7Var, jkaVar.d(), Boolean.valueOf(z), Integer.valueOf(i)};
        boolean zF4 = dd4Var.f(a07VarA2) | dd4Var.f(a07VarA3) | dd4Var.f(a07Var2) | dd4Var.f(st5Var) | dd4Var.f(ncaVar) | dd4Var.d(i) | dd4Var.f(zb4Var);
        Object objQ9 = dd4Var.Q();
        Object obj5 = obj2;
        if (zF4 || objQ9 == obj5) {
            jkaVar2 = jkaVar;
            xoaVar = new xoa(jkaVar2, st5Var, ncaVar, a07VarA2, a07VarA3, a07Var2, i, zb4Var);
            dd4Var.p0(xoaVar);
        } else {
            xoaVar = objQ9;
            jkaVar2 = jkaVar;
        }
        ou6 ou6VarD2 = r1a.d(ou6VarD, objArr4, (PointerInputEventHandler) xoaVar);
        kf8 kf8Var3 = kf8Var;
        Object[] objArr5 = {zm5Var3, jkaVar2.d(), sw8Var, kf8Var3};
        boolean zF5 = dd4Var.f(kf8Var3) | dd4Var.f(sw8Var);
        Object objQ10 = dd4Var.Q();
        if (zF5 || objQ10 == obj5) {
            objQ10 = new yma(1, jkaVar2, kf8Var3, sw8Var);
            dd4Var.p0(objQ10);
        }
        ou6 ou6VarD3 = r1a.d(ou6VarD2, objArr5, (PointerInputEventHandler) objQ10);
        if (jkaVar2.d() != t19.a && ((Boolean) br9Var.getValue()).booleanValue() && ((Boolean) jkaVar2.f.getValue()).booleanValue()) {
            dd4Var.f0(2023006186);
            Object objQ11 = dd4Var.Q();
            if (objQ11 == obj5) {
                objQ11 = new qda(a07Var5, 19);
                dd4Var.p0(objQ11);
            }
            kb4 kb4Var = (kb4) objQ11;
            Object objQ12 = dd4Var.Q();
            if (objQ12 == obj5) {
                objQ12 = new qda(a07Var5, 20);
                dd4Var.p0(objQ12);
            }
            long jA = vw1.a(120.0f, 60.0f);
            ou6VarD3.getClass();
            kb4Var.getClass();
            ou6VarD3 = q76.b(ou6VarD3, kb4Var, (kb4) objQ12, (kb4) null, false, jA, (cu7) null, 512);
            dd4Var.q(false);
        } else {
            dd4Var.f0(2023381069);
            dd4Var.q(false);
        }
        dd4Var.q(false);
        return ou6VarD3;
    }
}
