package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class zo implements Appendable {
    public final StringBuilder a;
    public final ArrayList b;
    public final ArrayList c;

    public zo() {
        this.a = new StringBuilder(16);
        this.b = new ArrayList();
        this.c = new ArrayList();
        new ArrayList();
    }

    public final void a(String str, int i, int i2, String str2) {
        this.c.add(new yo(i, str, new gv9(str2), i2));
    }

    @Override // java.lang.Appendable
    public final Appendable append(CharSequence charSequence) {
        if (charSequence instanceof bp) {
            d((bp) charSequence);
            return this;
        }
        this.a.append(charSequence);
        return this;
    }

    public final void b(km7 km7Var, int i, int i2) {
        this.c.add(new yo(i, i2, 8, km7Var, null));
    }

    public final void c(vn9 vn9Var, int i, int i2) {
        this.c.add(new yo(i, i2, 8, vn9Var, null));
    }

    public final void d(bp bpVar) {
        StringBuilder sb = this.a;
        int length = sb.length();
        sb.append(bpVar.b);
        List list = bpVar.a;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                ap apVar = (ap) list.get(i);
                Object obj = apVar.a;
                this.c.add(new yo(apVar.b + length, apVar.d, obj, apVar.c + length));
            }
        }
    }

    public final void e(bp bpVar, int i, int i2) {
        StringBuilder sb = this.a;
        int length = sb.length();
        sb.append((CharSequence) bpVar.b, i, i2);
        List listA = cp.a(bpVar, i, i2, null);
        if (listA != null) {
            int size = listA.size();
            for (int i3 = 0; i3 < size; i3++) {
                ap apVar = (ap) listA.get(i3);
                Object obj = apVar.a;
                this.c.add(new yo(apVar.b + length, apVar.d, obj, apVar.c + length));
            }
        }
    }

    public final void f(String str) {
        this.a.append(str);
    }

    public final void g() {
        ArrayList arrayList = this.b;
        if (arrayList.isEmpty()) {
            r75.c("Nothing to pop.");
        }
        ((yo) arrayList.remove(arrayList.size() - 1)).c = this.a.length();
    }

    public final void h(int i) {
        ArrayList arrayList = this.b;
        if (i >= arrayList.size()) {
            r75.c(i + " should be less than " + arrayList.size());
        }
        while (arrayList.size() - 1 >= i) {
            g();
        }
    }

    public final int i(String str, String str2) {
        yo yoVar = new yo(this.a.length(), 0, 4, new gv9(str2), str);
        this.b.add(yoVar);
        this.c.add(yoVar);
        return r7.size() - 1;
    }

    public final int j(km7 km7Var) {
        yo yoVar = new yo(this.a.length(), 0, 12, km7Var, null);
        this.b.add(yoVar);
        this.c.add(yoVar);
        return r7.size() - 1;
    }

    public final int k(vn9 vn9Var) {
        yo yoVar = new yo(this.a.length(), 0, 12, vn9Var, null);
        this.b.add(yoVar);
        this.c.add(yoVar);
        return r7.size() - 1;
    }

    public final bp l() {
        StringBuilder sb = this.a;
        String string = sb.toString();
        ArrayList arrayList = this.c;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            arrayList2.add(((yo) arrayList.get(i)).a(sb.length()));
        }
        return new bp(string, arrayList2);
    }

    @Override // java.lang.Appendable
    public final Appendable append(CharSequence charSequence, int i, int i2) {
        if (charSequence instanceof bp) {
            e((bp) charSequence, i, i2);
            return this;
        }
        this.a.append(charSequence, i, i2);
        return this;
    }

    @Override // java.lang.Appendable
    public final Appendable append(char c) {
        this.a.append(c);
        return this;
    }

    public zo(bp bpVar) {
        this();
        d(bpVar);
    }
}
