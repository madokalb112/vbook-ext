package defpackage;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class i21 implements CharSequence {
    public final /* synthetic */ int a = 1;
    public final int b;
    public final int c;
    public Object d;
    public final Object e;

    public i21(List list) {
        list.getClass();
        this.d = list;
        mz7 mz7Var = (mz7) fc1.z0(list);
        this.b = mz7Var != null ? mz7Var.b : -1;
        mz7 mz7Var2 = (mz7) fc1.F0(list);
        this.c = mz7Var2 != null ? mz7Var2.b : -1;
        this.e = new HashMap();
    }

    public void a() {
        List list = (List) this.d;
        HashMap map = (HashMap) this.e;
        if (map.isEmpty()) {
            int size = list.size();
            int i = 0;
            for (int i2 = 0; i2 < size; i2++) {
                int i3 = ((mz7) list.get(i2)).b;
                if (i3 >= i) {
                    while (i < i3) {
                        map.put(Integer.valueOf(i), Integer.valueOf(i2 - 1));
                        i++;
                    }
                    map.put(Integer.valueOf(i3), Integer.valueOf(i2));
                    i = i3 + 1;
                }
            }
        }
    }

    public int b(int i) {
        if (((List) this.d).isEmpty() || i < this.b) {
            return -1;
        }
        if (i > this.c) {
            return r0.size() - 1;
        }
        a();
        Integer num = (Integer) ((HashMap) this.e).get(Integer.valueOf(i));
        if (num != null) {
            return num.intValue();
        }
        return -1;
    }

    public int c(int i) {
        if (((List) this.d).isEmpty()) {
            return -1;
        }
        if (i < this.b) {
            return 0;
        }
        if (i > this.c) {
            return -1;
        }
        a();
        Integer num = (Integer) ((HashMap) this.e).get(Integer.valueOf(i));
        if (num != null) {
            return num.intValue();
        }
        return -1;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        switch (this.a) {
            case 0:
                int i2 = this.b + i;
                if (i < 0) {
                    gp.k(dx1.f(i, "index is negative: "));
                    return (char) 0;
                }
                if (i2 < this.c) {
                    return ((k21) this.e).c(i2);
                }
                StringBuilder sbU = xv5.u(i, "index (", ") should be less than length (");
                sbU.append(length());
                sbU.append(')');
                throw new IllegalArgumentException(sbU.toString().toString());
            default:
                return ((mz7) ((List) this.d).get(i)).a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00b1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public defpackage.i21 d(java.lang.String r10, java.lang.String r11, boolean r12, boolean r13) {
        /*
            r9 = this;
            java.lang.Object r0 = r9.d
            java.util.List r0 = (java.util.List) r0
            r10.getClass()
            r11.getClass()
            zy2 r3 = new zy2
            r3.<init>(r10, r12, r13)
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            r8 = 0
            if (r12 == 0) goto L2d
            yg8 r12 = new yg8
            r12.<init>(r10)
            r04 r9 = defpackage.yg8.a(r12, r9)
            f48 r10 = new f48
            r12 = 6
            r10.<init>(r12)
            r04 r12 = new r04
            r12.<init>(r9, r10)
        L2b:
            r5 = r8
            goto L55
        L2d:
            r10 = 1
            if (r13 == 0) goto L43
            pg8 r4 = new pg8
            r4.<init>()
            xg8 r1 = new xg8
            r6 = 0
            r5 = 1
            r2 = r9
            r1.<init>(r2, r3, r4, r5, r6)
            jc1 r12 = new jc1
            r12.<init>(r1, r10)
            goto L2b
        L43:
            r2 = r9
            pg8 r4 = new pg8
            r4.<init>()
            xg8 r1 = new xg8
            r6 = 0
            r5 = r8
            r1.<init>(r2, r3, r4, r5, r6)
            jc1 r12 = new jc1
            r12.<init>(r1, r10)
        L55:
            java.util.Iterator r9 = r12.iterator()
            r8 = r5
        L5a:
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto Lab
            java.lang.Object r10 = r9.next()
            h96 r10 = (defpackage.h96) r10
            int r12 = r10.a
            int r13 = r10.b
        L6a:
            if (r8 >= r12) goto L76
            java.lang.Object r1 = r0.get(r8)
            r7.add(r1)
            int r8 = r8 + 1
            goto L6a
        L76:
            int r12 = r11.length()
            if (r12 <= 0) goto La8
            int r10 = r10.a
            java.lang.Object r10 = r0.get(r10)
            mz7 r10 = (defpackage.mz7) r10
            java.lang.Object r12 = r0.get(r13)
            mz7 r12 = (defpackage.mz7) r12
            int r1 = r11.length()
            r8 = r5
        L8f:
            if (r8 >= r1) goto La8
            mz7 r2 = new mz7
            char r3 = r11.charAt(r8)
            int r4 = r10.b
            int r4 = r4 + r8
            int r6 = r12.b
            if (r4 <= r6) goto L9f
            r4 = r6
        L9f:
            r2.<init>(r3, r4)
            r7.add(r2)
            int r8 = r8 + 1
            goto L8f
        La8:
            int r8 = r13 + 1
            goto L5a
        Lab:
            int r9 = r0.size()
            if (r8 >= r9) goto Lc1
            int r9 = r0.size()
        Lb5:
            if (r8 >= r9) goto Lc1
            java.lang.Object r10 = r0.get(r8)
            r7.add(r10)
            int r8 = r8 + 1
            goto Lb5
        Lc1:
            i21 r9 = new i21
            r9.<init>(r7)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.i21.d(java.lang.String, java.lang.String, boolean, boolean):i21");
    }

    public bp e(bp bpVar) {
        bpVar.getClass();
        String string = toString();
        zo zoVar = new zo();
        zoVar.f(string);
        for (ap apVar : bpVar.c()) {
            int iC = c(apVar.b);
            int iB = b(apVar.c - 1);
            if (iC >= 0 && iB >= 0 && iB >= iC) {
                zoVar.c((vn9) apVar.a, iC, iB + 1);
            }
        }
        int i = -1;
        for (ap apVar2 : bpVar.b()) {
            int iC2 = c(apVar2.b);
            int iB2 = b(apVar2.c - 1);
            if (iC2 >= 0 && iB2 >= 0 && iB2 >= iC2 && iC2 >= i) {
                if (iC2 != iB2 || string.charAt(iC2) != '\n') {
                    zoVar.b((km7) apVar2.a, iC2, iB2 + 1);
                }
                i = iB2 + 1;
            }
        }
        for (ap apVar3 : bpVar.d(0, bpVar.b.length())) {
            int iC3 = c(apVar3.b);
            int iB3 = b(apVar3.c - 1);
            if (iC3 >= 0 && iB3 >= 0 && iB3 >= iC3) {
                zoVar.a(apVar3.d, iC3, iB3 + 1, (String) apVar3.a);
            }
        }
        return zoVar.l();
    }

    public boolean equals(Object obj) {
        switch (this.a) {
            case 0:
                if (!(obj instanceof CharSequence)) {
                    return false;
                }
                CharSequence charSequence = (CharSequence) obj;
                if (charSequence.length() != length()) {
                    return false;
                }
                k21 k21Var = (k21) this.e;
                int length = length();
                for (int i = 0; i < length; i++) {
                    if (k21Var.c(this.b + i) != charSequence.charAt(i)) {
                        return false;
                    }
                }
                return true;
            default:
                return super.equals(obj);
        }
    }

    public int hashCode() {
        switch (this.a) {
            case 0:
                String str = (String) this.d;
                if (str != null) {
                    return str.hashCode();
                }
                k21 k21Var = (k21) this.e;
                int iC = 0;
                for (int i = this.b; i < this.c; i++) {
                    iC = (iC * 31) + k21Var.c(i);
                }
                return iC;
            default:
                return super.hashCode();
        }
    }

    @Override // java.lang.CharSequence
    public final int length() {
        switch (this.a) {
            case 0:
                return this.c - this.b;
            default:
                return ((List) this.d).size();
        }
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i, int i2) {
        switch (this.a) {
            case 0:
                if (i < 0) {
                    gp.k(dx1.f(i, "start is negative: "));
                    return null;
                }
                if (i > i2) {
                    gp.f(i, "start (", ") should be less or equal to end (", i2);
                    return null;
                }
                int i3 = this.c;
                int i4 = this.b;
                if (i2 <= i3 - i4) {
                    return i == i2 ? "" : new i21((k21) this.e, i + i4, i4 + i2);
                }
                if2.d(length(), 41, "end should be less than length (");
                return null;
            default:
                return new i21(((List) this.d).subList(i, i2));
        }
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        switch (this.a) {
            case 0:
                String str = (String) this.d;
                if (str != null) {
                    return str;
                }
                String string = ((k21) this.e).b(this.b, this.c).toString();
                this.d = string;
                return string;
            default:
                StringBuilder sb = new StringBuilder();
                Iterator it = ((List) this.d).iterator();
                while (it.hasNext()) {
                    sb.append(((mz7) it.next()).a);
                }
                return sb.toString();
        }
    }

    public i21(k21 k21Var, int i, int i2) {
        this.e = k21Var;
        this.b = i;
        this.c = i2;
    }
}
