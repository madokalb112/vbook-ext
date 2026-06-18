package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class kr3 {
    public final boolean a;
    public final boolean b;
    public final Set c;
    public final Set d;
    public final Set e;
    public final Set f;
    public final Set g;
    public final Set h;
    public final Set i;
    public final List j;
    public final List k;
    public final List l;

    public kr3(boolean z, boolean z2, Set set, Set set2, Set set3, Set set4, Set set5, Set set6, Set set7, List list, List list2, List list3) {
        set.getClass();
        set2.getClass();
        set3.getClass();
        set4.getClass();
        set5.getClass();
        set6.getClass();
        set7.getClass();
        list.getClass();
        list2.getClass();
        list3.getClass();
        this.a = z;
        this.b = z2;
        this.c = set;
        this.d = set2;
        this.e = set3;
        this.f = set4;
        this.g = set5;
        this.h = set6;
        this.i = set7;
        this.j = list;
        this.k = list2;
        this.l = list3;
    }

    public static kr3 a(kr3 kr3Var, boolean z, boolean z2, Set set, LinkedHashSet linkedHashSet, Set set2, LinkedHashSet linkedHashSet2, Set set3, LinkedHashSet linkedHashSet3, Set set4, ArrayList arrayList, List list, List list2, int i) {
        if ((i & 1) != 0) {
            z = kr3Var.a;
        }
        boolean z3 = z;
        if ((i & 2) != 0) {
            z2 = kr3Var.b;
        }
        boolean z4 = z2;
        Set set5 = (i & 4) != 0 ? kr3Var.c : set;
        Set set6 = (i & 8) != 0 ? kr3Var.d : linkedHashSet;
        Set set7 = (i & 16) != 0 ? kr3Var.e : set2;
        Set set8 = (i & 32) != 0 ? kr3Var.f : linkedHashSet2;
        Set set9 = (i & 64) != 0 ? kr3Var.g : set3;
        Set set10 = (i & Token.CASE) != 0 ? kr3Var.h : linkedHashSet3;
        Set set11 = (i & 256) != 0 ? kr3Var.i : set4;
        List list3 = (i & 512) != 0 ? kr3Var.j : arrayList;
        List list4 = (i & 1024) != 0 ? kr3Var.k : list;
        List list5 = (i & 2048) != 0 ? kr3Var.l : list2;
        kr3Var.getClass();
        set5.getClass();
        set6.getClass();
        set7.getClass();
        set8.getClass();
        set9.getClass();
        set10.getClass();
        set11.getClass();
        list3.getClass();
        list4.getClass();
        list5.getClass();
        return new kr3(z3, z4, set5, set6, set7, set8, set9, set10, set11, list3, list4, list5);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kr3)) {
            return false;
        }
        kr3 kr3Var = (kr3) obj;
        return this.a == kr3Var.a && this.b == kr3Var.b && lc5.Q(this.c, kr3Var.c) && lc5.Q(this.d, kr3Var.d) && lc5.Q(this.e, kr3Var.e) && lc5.Q(this.f, kr3Var.f) && lc5.Q(this.g, kr3Var.g) && lc5.Q(this.h, kr3Var.h) && lc5.Q(this.i, kr3Var.i) && lc5.Q(this.j, kr3Var.j) && lc5.Q(this.k, kr3Var.k) && lc5.Q(this.l, kr3Var.l);
    }

    public final int hashCode() {
        return this.l.hashCode() + j39.d(j39.d((this.i.hashCode() + ((this.h.hashCode() + ((this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + j39.c(Boolean.hashCode(this.a) * 31, 31, this.b)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31, this.j, 31), this.k, 31);
    }

    public final String toString() {
        StringBuilder sbR = j39.r("ExtensionState(isLoading=", this.a, ", isNsfw=", this.b, ", categories=");
        sbR.append(this.c);
        sbR.append(", allCategories=");
        sbR.append(this.d);
        sbR.append(", languages=");
        sbR.append(this.e);
        sbR.append(", allLanguages=");
        sbR.append(this.f);
        sbR.append(", authors=");
        sbR.append(this.g);
        sbR.append(", allAuthors=");
        sbR.append(this.h);
        sbR.append(", downloadExtensions=");
        sbR.append(this.i);
        sbR.append(", updateExtensions=");
        sbR.append(this.j);
        sbR.append(", installedExtensions=");
        sbR.append(this.k);
        sbR.append(", allExtensions=");
        sbR.append(this.l);
        sbR.append(")");
        return sbR.toString();
    }
}
