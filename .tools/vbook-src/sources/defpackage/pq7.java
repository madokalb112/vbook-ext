package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.text.TextUtils;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.internal.base.zac;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public class pq7 implements o05, xd5, yv9, olb, tvb, ai8, OnFailureListener, ykc, kgc {
    public Object a;

    public /* synthetic */ pq7(Object obj) {
        this.a = obj;
    }

    public void A(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        RecyclerView recyclerView = (RecyclerView) this.a;
        int I = recyclerView.f.I();
        int i10 = -1;
        if (i < i2) {
            i4 = i;
            i3 = i2;
            i5 = -1;
        } else {
            i3 = i;
            i4 = i2;
            i5 = 1;
        }
        for (int i11 = 0; i11 < I; i11++) {
            kg8 kg8VarF = RecyclerView.F(recyclerView.f.H(i11));
            if (kg8VarF != null && (i9 = kg8VarF.c) >= i4 && i9 <= i3) {
                if (i9 == i) {
                    kg8VarF.k(i2 - i, false);
                } else {
                    kg8VarF.k(i5, false);
                }
                recyclerView.p0.e = true;
            }
        }
        ArrayList arrayList = (ArrayList) recyclerView.c.e;
        if (i < i2) {
            i7 = i;
            i6 = i2;
        } else {
            i6 = i;
            i7 = i2;
            i10 = 1;
        }
        int size = arrayList.size();
        for (int i12 = 0; i12 < size; i12++) {
            kg8 kg8Var = (kg8) arrayList.get(i12);
            if (kg8Var != null && (i8 = kg8Var.c) >= i7 && i8 <= i6) {
                if (i8 == i) {
                    kg8Var.k(i2 - i, false);
                } else {
                    kg8Var.k(i10, false);
                }
            }
        }
        recyclerView.requestLayout();
        recyclerView.s0 = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0094  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object B(defpackage.h11 r21, defpackage.ib4 r22) {
        /*
            Method dump skipped, instruction units count: 212
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pq7.B(h11, ib4):java.lang.Object");
    }

    public void C(boolean z) {
        ((WebSettingsBoundaryInterface) this.a).setAlgorithmicDarkeningAllowed(z);
    }

    public void D(long j) {
        o7c o7cVar = ((bz9) this.a).a;
        long jM0 = vo1.m0(j);
        o7cVar.f.setValue(new na5(jM0));
        q6c q6cVar = o7cVar.c;
        long jH0 = vo1.h0(jM0);
        q6cVar.getClass();
        sw1.h0();
        if (oa5.a(q6cVar.f, jH0)) {
            return;
        }
        q6cVar.f = jH0;
        l46 l46Var = q6cVar.a;
        l46Var.getClass();
        g46 g46Var = g46.b;
        if (l46Var.a(g46Var)) {
            String str = "ZoomableState. contentOriginSize=" + ((Object) oa5.b(jH0));
            xg xgVar = l46Var.b;
            String str2 = l46Var.a;
            xgVar.getClass();
            xg.a(g46Var, str2, str);
        }
        q6c.e(q6cVar, "contentOriginSizeChanged");
    }

    public boolean a() {
        ((s16) this.a).getClass();
        return false;
    }

    public void accept(Object obj, Object obj2) {
        dac service = ((nac) obj).getService();
        iaa iaaVar = (iaa) this.a;
        Parcel parcelZaa = service.zaa();
        zac.zac(parcelZaa, iaaVar);
        service.zad(1, parcelZaa);
        ((TaskCompletionSource) obj2).setResult((Object) null);
    }

    public Set b() {
        return ((zv9) pg9.e((qm7) this.a)).b();
    }

    public void c(String str, String str2, Bundle bundle) {
        boolean zIsEmpty = TextUtils.isEmpty(str);
        oic oicVar = (oic) this.a;
        if (zIsEmpty) {
            oicVar.L("auto", "_err", bundle);
        } else {
            oicVar.getClass();
            gp.j("Unexpected call on client side");
        }
    }

    public /* synthetic */ void d(String str, int i, Throwable th, byte[] bArr, Map map) {
        ((rkc) this.a).B(str, i, th, bArr, map);
    }

    public long f(vo voVar, vo voVar2, vo voVar3) {
        return ((s16) this.a).f(voVar, voVar2, voVar3);
    }

    public void g(String str, List list) {
        str.getClass();
        list.getClass();
        qm7 qm7Var = (qm7) this.a;
        String strE = lb1.e(str, false);
        ArrayList arrayList = new ArrayList(gc1.M(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str2 = (String) it.next();
            str2.getClass();
            arrayList.add(lb1.e(str2, true));
        }
        qm7Var.g(strE, arrayList);
    }

    @Override // defpackage.tvb
    public void h(String str) {
        fxb fxbVar = (fxb) this.a;
        fxbVar.getClass();
        fxbVar.e.setValue(str);
        tvb tvbVar = fxbVar.k;
        if (tvbVar != null) {
            tvbVar.h(str);
        }
    }

    @Override // defpackage.tvb
    public uc6 i(String str) {
        tvb tvbVar = ((fxb) this.a).k;
        if (tvbVar != null) {
            return tvbVar.i(str);
        }
        return null;
    }

    @Override // defpackage.tvb
    public void j(int i) {
        fxb fxbVar = (fxb) this.a;
        fxbVar.h.i(i);
        tvb tvbVar = fxbVar.k;
        if (tvbVar != null) {
            tvbVar.j(i);
        }
    }

    @Override // defpackage.tvb
    public void k(ng ngVar) {
        fxb fxbVar = (fxb) this.a;
        fxbVar.d.setValue(ngVar);
        tvb tvbVar = fxbVar.k;
        if (tvbVar != null) {
            tvbVar.k(ngVar);
        }
    }

    @Override // defpackage.xd5
    public Object l(String str, Object[] objArr) {
        objArr.getClass();
        return ah1.S(hc3.a, new ck7((List) this.a, str, objArr, (jt1) null, 5));
    }

    public vo m(long j, vo voVar, vo voVar2, vo voVar3) {
        return ((s16) this.a).m(j, voVar, voVar2, voVar3);
    }

    @Override // defpackage.tvb
    public void n(String str, ky4 ky4Var) throws Throwable {
        str.getClass();
        fxb fxbVar = (fxb) this.a;
        fxbVar.g.setValue(Boolean.TRUE);
        fxbVar.f.setValue(str);
        fxbVar.d.setValue(ky4Var);
        ah1.S(hc3.a, new dxb(fxbVar, null, 1));
        tvb tvbVar = fxbVar.k;
        if (tvbVar != null) {
            tvbVar.n(str, ky4Var);
        }
    }

    @Override // defpackage.tvb
    public void o(String str) throws Throwable {
        fxb fxbVar = (fxb) this.a;
        fxbVar.g.setValue(Boolean.FALSE);
        fxbVar.h.i(0);
        fxbVar.f.setValue(str);
        ah1.S(hc3.a, new dxb(fxbVar, null, 0));
        tvb tvbVar = fxbVar.k;
        if (tvbVar != null) {
            tvbVar.o(str);
        }
    }

    public void onFailure(Exception exc) {
        if (exc instanceof cz3) {
            h46 h46Var = ddc.e;
            h46Var.e("Failure to refresh token; scheduling refresh after failure", new Object[0]);
            ddc ddcVar = (ddc) ((oc4) this.a).c;
            int i = (int) ddcVar.b;
            ddcVar.b = (i == 30 || i == 60 || i == 120 || i == 240 || i == 480) ? 2 * ddcVar.b : i != 960 ? 30L : 960L;
            ddcVar.a = (ddcVar.b * 1000) + System.currentTimeMillis();
            h46Var.e(xv5.l(ddcVar.a, "Scheduling refresh for "), new Object[0]);
            ddcVar.c.postDelayed(ddcVar.d, ddcVar.b * 1000);
        }
    }

    public void p(int i, boolean z) {
        a81 a81Var = (a81) this.a;
        if (z) {
            a81Var.a(i);
        } else {
            a81Var.getClass();
        }
    }

    public void q(String str, String str2) {
        str.getClass();
        str2.getClass();
        ((qm7) this.a).h(lb1.e(str, false), lb1.e(str2, true));
    }

    public void r(q6 q6Var) {
        RecyclerView recyclerView = (RecyclerView) this.a;
        int i = q6Var.a;
        if (i == 1) {
            recyclerView.y.V(q6Var.b, q6Var.c);
            return;
        }
        if (i == 2) {
            recyclerView.y.Y(q6Var.b, q6Var.c);
        } else if (i == 4) {
            recyclerView.y.Z(q6Var.b, q6Var.c);
        } else {
            if (i != 8) {
                return;
            }
            recyclerView.y.X(q6Var.b, q6Var.c);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object s(java.lang.Object r19, defpackage.kt1 r20) {
        /*
            Method dump skipped, instruction units count: 264
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pq7.s(java.lang.Object, kt1):java.lang.Object");
    }

    public vo u(long j, vo voVar, vo voVar2, vo voVar3) {
        return ((s16) this.a).u(j, voVar, voVar2, voVar3);
    }

    public vo v(vo voVar, vo voVar2, vo voVar3) {
        return ((s16) this.a).v(voVar, voVar2, voVar3);
    }

    public kg8 w(int i) {
        RecyclerView recyclerView = (RecyclerView) this.a;
        int I = recyclerView.f.I();
        int i2 = 0;
        kg8 kg8Var = null;
        while (true) {
            if (i2 >= I) {
                break;
            }
            kg8 kg8VarF = RecyclerView.F(recyclerView.f.H(i2));
            if (kg8VarF != null && !kg8VarF.g() && kg8VarF.c == i) {
                if (!((ArrayList) recyclerView.f.d).contains(kg8VarF.a)) {
                    kg8Var = kg8VarF;
                    break;
                }
                kg8Var = kg8VarF;
            }
            i2++;
        }
        if (kg8Var != null) {
            if (!((ArrayList) recyclerView.f.d).contains(kg8Var.a)) {
                return kg8Var;
            }
        }
        return null;
    }

    public void x(int i, int i2) {
        int i3;
        int i4;
        RecyclerView recyclerView = (RecyclerView) this.a;
        int I = recyclerView.f.I();
        int i5 = i2 + i;
        for (int i6 = 0; i6 < I; i6++) {
            View viewH = recyclerView.f.H(i6);
            kg8 kg8VarF = RecyclerView.F(viewH);
            if (kg8VarF != null && !kg8VarF.n() && (i4 = kg8VarF.c) >= i && i4 < i5) {
                kg8VarF.a(2);
                kg8VarF.a(1024);
                viewH.getLayoutParams().c = true;
            }
        }
        dg8 dg8Var = recyclerView.c;
        ArrayList arrayList = (ArrayList) dg8Var.e;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            kg8 kg8Var = (kg8) arrayList.get(size);
            if (kg8Var != null && (i3 = kg8Var.c) >= i && i3 < i5) {
                kg8Var.a(2);
                dg8Var.j(size);
            }
        }
        recyclerView.t0 = true;
    }

    public void y(int i, int i2) {
        RecyclerView recyclerView = (RecyclerView) this.a;
        int I = recyclerView.f.I();
        for (int i3 = 0; i3 < I; i3++) {
            kg8 kg8VarF = RecyclerView.F(recyclerView.f.H(i3));
            if (kg8VarF != null && !kg8VarF.n() && kg8VarF.c >= i) {
                kg8VarF.k(i2, false);
                recyclerView.p0.e = true;
            }
        }
        ArrayList arrayList = (ArrayList) recyclerView.c.e;
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            kg8 kg8Var = (kg8) arrayList.get(i4);
            if (kg8Var != null && kg8Var.c >= i) {
                kg8Var.k(i2, false);
            }
        }
        recyclerView.requestLayout();
        recyclerView.s0 = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r6v6, types: [byte[], java.io.Serializable, java.lang.Object] */
    @Override // defpackage.o05
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.io.Serializable z(defpackage.m35 r5, defpackage.kt1 r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.oq7
            if (r0 == 0) goto L13
            r0 = r6
            oq7 r0 = (defpackage.oq7) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            oq7 r0 = new oq7
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.a
            int r1 = r0.c
            r2 = 1
            if (r1 == 0) goto L2c
            if (r1 != r2) goto L25
            defpackage.e11.e0(r6)
            goto L4f
        L25:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            gp.j(r4)
            r4 = 0
            return r4
        L2c:
            defpackage.e11.e0(r6)
            r5.getClass()
            java.lang.String r5 = r5.b
            java.lang.String r6 = ":"
            java.lang.String r5 = defpackage.bw9.u0(r5, r6, r5)
            java.lang.Object r4 = r4.a
            rq7 r4 = (defpackage.rq7) r4
            t25 r4 = r4.r()
            r0.c = r2
            mc3 r6 = defpackage.mc3.a
            java.lang.Object r6 = r4.s(r5, r6, r0)
            xx1 r4 = defpackage.xx1.a
            if (r6 != r4) goto L4f
            return r4
        L4f:
            byte[] r6 = (byte[]) r6
            r6.getClass()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pq7.z(m35, kt1):java.io.Serializable");
    }
}
