package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class ha7 implements rn7 {
    public final List a;
    public final int b;
    public final boolean c;

    public ha7(List list) {
        boolean z;
        int i;
        this.a = list;
        Iterator it = list.iterator();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int iIntValue = 1;
            if (!it.hasNext()) {
                break;
            }
            Integer num = ((ea7) it.next()).a;
            if (num != null) {
                iIntValue = num.intValue();
            }
            i3 += iIntValue;
        }
        this.b = i3;
        List list2 = this.a;
        if (list2.isEmpty()) {
            z = false;
        } else {
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                if (((ea7) it2.next()).a == null) {
                    z = true;
                    break;
                }
            }
            z = false;
        }
        this.c = z;
        List list3 = this.a;
        if (!list3.isEmpty()) {
            Iterator it3 = list3.iterator();
            while (it3.hasNext()) {
                Integer num2 = ((ea7) it3.next()).a;
                if ((num2 != null ? num2.intValue() : Integer.MAX_VALUE) <= 0) {
                    gp.l("Failed requirement.");
                    throw null;
                }
            }
        }
        List list4 = this.a;
        if (list4.isEmpty()) {
            i = 0;
        } else {
            Iterator it4 = list4.iterator();
            i = 0;
            while (it4.hasNext()) {
                if (((ea7) it4.next()).a == null && (i = i + 1) < 0) {
                    throw new ArithmeticException("Count overflow has happened.");
                }
            }
        }
        if (i <= 1) {
            return;
        }
        List list5 = this.a;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list5) {
            if (((ea7) obj).a == null) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(gc1.M(arrayList, 10));
        int size = arrayList.size();
        while (i2 < size) {
            Object obj2 = arrayList.get(i2);
            i2++;
            arrayList2.add(((ea7) obj2).b);
        }
        so9.r(arrayList2, ". Parsing is undefined: for example, with variable-length month number and variable-length day of month, '111' can be parsed as Jan 11th or Nov 1st.", "At most one variable-length numeric field in a row is allowed, but got several: ");
        throw null;
    }

    public final Object a(xv1 xv1Var, String str, int i) {
        int i2;
        int i3 = this.b;
        if (i + i3 > str.length()) {
            return new jn7(i, new wn6(this, 6));
        }
        pg8 pg8Var = new pg8();
        while (true) {
            i2 = 1;
            if (pg8Var.a + i >= str.length() || !dk9.u(str.charAt(pg8Var.a + i))) {
                break;
            }
            pg8Var.a++;
        }
        if (pg8Var.a < i3) {
            return new jn7(i, new e67(i2, pg8Var, this));
        }
        List list = this.a;
        int size = list.size();
        int i4 = 0;
        while (i4 < size) {
            Integer num = ((ea7) list.get(i4)).a;
            int iIntValue = (num != null ? num.intValue() : (pg8Var.a - i3) + 1) + i;
            fa7 fa7VarA = ((ea7) list.get(i4)).a(i, str, xv1Var, iIntValue);
            if (fa7VarA != null) {
                return new jn7(i, new ga7(str.subSequence(i, iIntValue).toString(), this, i4, fa7VarA));
            }
            i4++;
            i = iIntValue;
        }
        return Integer.valueOf(i);
    }

    public final String b() {
        List<ea7> list = this.a;
        ArrayList arrayList = new ArrayList(gc1.M(list, 10));
        for (ea7 ea7Var : list) {
            StringBuilder sb = new StringBuilder();
            Integer num = ea7Var.a;
            sb.append(num == null ? "at least one digit" : num + " digits");
            sb.append(" for ");
            sb.append(ea7Var.b);
            arrayList.add(sb.toString());
        }
        boolean z = this.c;
        int i = this.b;
        if (z) {
            return "a number with at least " + i + " digits: " + arrayList;
        }
        return "a number with exactly " + i + " digits: " + arrayList;
    }

    public final String toString() {
        return b();
    }
}
