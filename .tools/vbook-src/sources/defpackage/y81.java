package defpackage;

import java.util.Arrays;
import org.mozilla.javascript.Kit;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class y81 {
    public final /* synthetic */ z81 k;
    public l0a[] g = null;
    public int[] c = null;
    public int[] a = null;
    public l0a[] e = null;
    public byte[] h = null;
    public int b = 0;
    public int d = 0;
    public int f = 0;
    public int i = 0;
    public boolean j = false;

    public y81(z81 z81Var) {
        this.k = z81Var;
    }

    public final void a(l0a l0aVar) {
        if (l0aVar.g) {
            return;
        }
        l0aVar.g = true;
        l0aVar.f = true;
        int i = this.f;
        l0a[] l0aVarArr = this.e;
        if (i == l0aVarArr.length) {
            l0a[] l0aVarArr2 = new l0a[i * 2];
            System.arraycopy(l0aVarArr, 0, l0aVarArr2, 0, i);
            this.e = l0aVarArr2;
        }
        l0a[] l0aVarArr3 = this.e;
        int i2 = this.f;
        this.f = i2 + 1;
        l0aVarArr3[i2] = l0aVar;
    }

    public final void b(int i) {
        int i2 = i < this.b ? this.a[i] : 0;
        int i3 = i2 & 255;
        if (i3 == 7 || i3 == 6 || i3 == 8 || i3 == 5) {
            j(i2);
        } else {
            gp.j(xv5.o("bad local variable type: ", i2, i, " at index: "));
        }
    }

    public final void c(int i, int i2) {
        h();
        int i3 = this.b;
        if (i >= i3) {
            int i4 = i + 1;
            int[] iArr = new int[i4];
            System.arraycopy(this.a, 0, iArr, 0, i3);
            this.a = iArr;
            this.b = i4;
        }
        this.a[i] = i2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:186:0x049d  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x04be  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x04c0  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x04c2  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x04c8  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x04d0  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x04d4  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0519 A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0540  */
    /* JADX WARN: Type inference failed for: r26v0, types: [y81] */
    /* JADX WARN: Type inference failed for: r8v126 */
    /* JADX WARN: Type inference failed for: r8v19 */
    /* JADX WARN: Type inference failed for: r8v4, types: [int] */
    /*  JADX ERROR: UnsupportedOperationException in pass: RegionMakerVisitor
        java.lang.UnsupportedOperationException
        	at java.base/java.util.Collections$UnmodifiableCollection.add(Unknown Source)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker$1.leaveRegion(SwitchRegionMaker.java:390)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:70)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:23)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaksForCase(SwitchRegionMaker.java:370)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaks(SwitchRegionMaker.java:85)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.leaveRegion(PostProcessRegions.java:33)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:70)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.process(PostProcessRegions.java:23)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:31)
        */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d() {
        /*
            Method dump skipped, instruction units count: 2364
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.y81.d():void");
    }

    public final void e(l0a l0aVar) {
        if (l0aVar.b(this.a, this.b, this.c, this.d, this.k.k)) {
            a(l0aVar);
        }
    }

    public final int f(int i, int i2) {
        if (i2 > 4) {
            gp.l("bad operand size");
            return 0;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            i3 = (i3 << 8) | (this.k.i[i + i4] & 255);
        }
        return i3;
    }

    public final l0a g(int i) {
        z81 z81Var = this.k;
        int iBinarySearch = Arrays.binarySearch(z81Var.a, 0, z81Var.b, i);
        if (iBinarySearch < 0) {
            iBinarySearch = (-iBinarySearch) - 2;
        }
        if (iBinarySearch >= z81Var.b) {
            gp.l(dx1.f(i, "bad offset: "));
            return null;
        }
        l0a l0aVar = this.g[iBinarySearch];
        if (i >= l0aVar.b && i < l0aVar.c) {
            return l0aVar;
        }
        Kit.codeBug();
        return l0aVar;
    }

    public final int h() {
        int[] iArr = this.c;
        int i = this.d - 1;
        this.d = i;
        return iArr[i];
    }

    public final long i() {
        long jH = h();
        return yib.u((int) jH) ? jH : (jH << 32) | ((long) (h() & 16777215));
    }

    public final void j(int i) {
        int i2 = this.d;
        if (i2 == this.c.length) {
            int[] iArr = new int[Math.max(i2 * 2, 4)];
            System.arraycopy(this.c, 0, iArr, 0, this.d);
            this.c = iArr;
        }
        int[] iArr2 = this.c;
        int i3 = this.d;
        this.d = i3 + 1;
        iArr2[i3] = i;
    }

    public final void k(long j) {
        j((int) (j & 16777215));
        long j2 = j >>> 32;
        if (j2 != 0) {
            j((int) (j2 & 16777215));
        }
    }

    public final void l(int[] iArr, int[] iArr2, int i) {
        byte[] bArr = this.h;
        int i2 = this.i;
        int i3 = i2 + 1;
        this.i = i3;
        bArr[i2] = -1;
        int I = z81.I(bArr, i, i3);
        this.i = I;
        this.i = z81.I(this.h, iArr.length, I);
        n(0, iArr);
        this.i = z81.I(this.h, iArr2.length, this.i);
        n(0, iArr2);
    }

    public final int m(int i) {
        int i2 = i & 255;
        byte[] bArr = this.h;
        int i3 = this.i;
        int i4 = i3 + 1;
        this.i = i4;
        bArr[i3] = (byte) i2;
        if (i2 == 7 || i2 == 8) {
            this.i = z81.I(bArr, i >>> 8, i4);
        }
        return this.i;
    }

    public final int n(int i, int[] iArr) {
        while (i < iArr.length) {
            this.i = m(iArr[i]);
            i++;
        }
        return this.i;
    }
}
