package defpackage;

import j$.time.LocalDate;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class u55 implements f4c, o62, xv1 {
    public final z55 a;
    public Integer b;
    public Integer c;
    public Integer d;

    public u55(z55 z55Var, Integer num, Integer num2, Integer num3) {
        this.a = z55Var;
        this.b = num;
        this.c = num2;
        this.d = num3;
    }

    public final w16 a() {
        w16 w16Var;
        z55 z55Var = this.a;
        Integer num = z55Var.a;
        l4c.a(num, "year");
        int iIntValue = num.intValue();
        Integer num2 = this.d;
        if (num2 == null) {
            Integer num3 = z55Var.b;
            l4c.a(num3, "monthNumber");
            int iIntValue2 = num3.intValue();
            Integer num4 = this.b;
            l4c.a(num4, "day");
            w16Var = new w16(iIntValue, iIntValue2, num4.intValue());
        } else {
            w16 w16Var2 = new w16(iIntValue, 1, 1);
            int iIntValue3 = num2.intValue() - 1;
            s72.Companion.getClass();
            n72 n72Var = s72.a;
            n72Var.getClass();
            w16 w16VarA = b26.a(w16Var2, iIntValue3, n72Var);
            LocalDate localDate = w16VarA.a;
            if (localDate.getYear() != iIntValue) {
                throw new d72("Can not create a LocalDate from the given input: the day of year is " + num2 + ", which is not a valid day of year for the year " + iIntValue);
            }
            if (z55Var.b != null) {
                yu6 yu6VarB = w16VarA.b();
                yu6VarB.getClass();
                int iOrdinal = yu6VarB.ordinal() + 1;
                Integer num5 = z55Var.b;
                if (num5 == null || iOrdinal != num5.intValue()) {
                    StringBuilder sb = new StringBuilder("Can not create a LocalDate from the given input: the day of year is ");
                    sb.append(num2);
                    sb.append(", which is ");
                    sb.append(w16VarA.b());
                    Integer num6 = z55Var.b;
                    sb.append(", but ");
                    sb.append(num6);
                    sb.append(" was specified as the month number");
                    throw new d72(sb.toString());
                }
            }
            if (this.b != null) {
                int dayOfMonth = localDate.getDayOfMonth();
                Integer num7 = this.b;
                if (num7 == null || dayOfMonth != num7.intValue()) {
                    StringBuilder sb2 = new StringBuilder("Can not create a LocalDate from the given input: the day of year is ");
                    sb2.append(num2);
                    sb2.append(", which is the day ");
                    sb2.append(localDate.getDayOfMonth());
                    sb2.append(" of ");
                    sb2.append(w16VarA.b());
                    Integer num8 = this.b;
                    sb2.append(", but ");
                    sb2.append(num8);
                    sb2.append(" was specified as the day of month");
                    throw new d72(sb2.toString());
                }
            }
            w16Var = w16VarA;
        }
        Integer num9 = this.c;
        if (num9 != null) {
            int iIntValue4 = num9.intValue();
            z72 z72VarA = w16Var.a();
            z72VarA.getClass();
            if (iIntValue4 != z72VarA.ordinal() + 1) {
                StringBuilder sb3 = new StringBuilder("Can not create a LocalDate from the given input: the day of week is ");
                if (1 > iIntValue4 || iIntValue4 >= 8) {
                    gp.k(dx1.f(iIntValue4, "Expected ISO day-of-week number in 1..7, got "));
                    return null;
                }
                sb3.append((z72) z72.b.get(iIntValue4 - 1));
                sb3.append(" but the date is ");
                sb3.append(w16Var);
                sb3.append(", which is a ");
                sb3.append(w16Var.a());
                throw new d72(sb3.toString());
            }
        }
        return w16Var;
    }

    public final Object c() {
        z55 z55Var = this.a;
        return new u55(new z55(z55Var.a, z55Var.b), this.b, this.c, this.d);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof u55)) {
            return false;
        }
        u55 u55Var = (u55) obj;
        return lc5.Q(this.a, u55Var.a) && lc5.Q(this.b, u55Var.b) && lc5.Q(this.c, u55Var.c) && lc5.Q(this.d, u55Var.d);
    }

    @Override // defpackage.f4c
    public final void f(Integer num) {
        this.a.b = num;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 29791;
        Integer num = this.b;
        int iHashCode2 = ((num != null ? num.hashCode() : 0) * 961) + iHashCode;
        Integer num2 = this.c;
        int iHashCode3 = ((num2 != null ? num2.hashCode() : 0) * 31) + iHashCode2;
        Integer num3 = this.d;
        return iHashCode3 + (num3 != null ? num3.hashCode() : 0);
    }

    @Override // defpackage.f4c
    public final Integer i() {
        return this.a.a;
    }

    @Override // defpackage.o62
    public final Integer j() {
        return this.c;
    }

    @Override // defpackage.o62
    public final Integer n() {
        return this.b;
    }

    @Override // defpackage.o62
    public final void o(Integer num) {
        this.b = num;
    }

    @Override // defpackage.o62
    public final Integer q() {
        return this.d;
    }

    @Override // defpackage.f4c
    public final void r(Integer num) {
        this.a.a = num;
    }

    @Override // defpackage.f4c
    public final Integer s() {
        return this.a.b;
    }

    @Override // defpackage.o62
    public final void t(Integer num) {
        this.c = num;
    }

    public final String toString() {
        Integer num = this.d;
        z55 z55Var = this.a;
        if (num == null) {
            StringBuilder sb = new StringBuilder();
            sb.append(z55Var);
            sb.append('-');
            Object obj = this.b;
            if (obj == null) {
                obj = "??";
            }
            sb.append(obj);
            sb.append(" (day of week is ");
            Integer num2 = this.c;
            return xv5.r(sb, num2 != null ? num2 : "??", ')');
        }
        if (this.b == null && z55Var.b == null) {
            StringBuilder sb2 = new StringBuilder("(");
            Object obj2 = z55Var.a;
            if (obj2 == null) {
                obj2 = "??";
            }
            sb2.append(obj2);
            sb2.append(")-");
            sb2.append(this.d);
            sb2.append(" (day of week is ");
            Integer num3 = this.c;
            return xv5.r(sb2, num3 != null ? num3 : "??", ')');
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append(z55Var);
        sb3.append('-');
        Object obj3 = this.b;
        if (obj3 == null) {
            obj3 = "??";
        }
        sb3.append(obj3);
        sb3.append(" (day of week is ");
        Integer num4 = this.c;
        sb3.append(num4 != null ? num4 : "??");
        sb3.append(", day of year is ");
        sb3.append(this.d);
        sb3.append(')');
        return sb3.toString();
    }

    @Override // defpackage.o62
    public final void y(Integer num) {
        this.d = num;
    }

    public /* synthetic */ u55() {
        this(new z55(null, null), null, null, null);
    }
}
