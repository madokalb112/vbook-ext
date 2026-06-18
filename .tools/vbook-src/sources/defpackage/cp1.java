package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class cp1 implements k77 {
    public final String a;

    public cp1(String str) {
        str.getClass();
        this.a = str;
    }

    @Override // defpackage.r84
    public final s84 a() {
        this.a.getClass();
        return new in1();
    }

    @Override // defpackage.r84
    public final sn7 b() {
        List listJ;
        String strSubstring;
        String strSubstring2 = this.a;
        int length = strSubstring2.length();
        lc3 lc3Var = lc3.a;
        if (length == 0) {
            listJ = lc3Var;
        } else {
            zy5 zy5VarN = gc1.N();
            String strSubstring3 = "";
            if (dk9.u(strSubstring2.charAt(0))) {
                int length2 = strSubstring2.length();
                int i = 0;
                while (true) {
                    if (i >= length2) {
                        strSubstring = strSubstring2;
                        break;
                    }
                    if (!dk9.u(strSubstring2.charAt(i))) {
                        strSubstring = strSubstring2.substring(0, i);
                        break;
                    }
                    i++;
                }
                zy5VarN.add(new ha7(gc1.Y(new dp1(strSubstring))));
                int length3 = strSubstring2.length();
                int i2 = 0;
                while (true) {
                    if (i2 >= length3) {
                        strSubstring2 = "";
                        break;
                    }
                    if (!dk9.u(strSubstring2.charAt(i2))) {
                        strSubstring2 = strSubstring2.substring(i2);
                        break;
                    }
                    i2++;
                }
            }
            if (strSubstring2.length() > 0) {
                if (dk9.u(strSubstring2.charAt(strSubstring2.length() - 1))) {
                    int length4 = strSubstring2.length();
                    while (true) {
                        length4--;
                        if (-1 >= length4) {
                            break;
                        }
                        if (!dk9.u(strSubstring2.charAt(length4))) {
                            strSubstring3 = strSubstring2.substring(0, length4 + 1);
                            break;
                        }
                    }
                    zy5VarN.add(new st7(strSubstring3));
                    int length5 = strSubstring2.length() - 1;
                    while (true) {
                        if (-1 >= length5) {
                            break;
                        }
                        if (!dk9.u(strSubstring2.charAt(length5))) {
                            strSubstring2 = strSubstring2.substring(length5 + 1);
                            break;
                        }
                        length5--;
                    }
                    zy5VarN.add(new ha7(gc1.Y(new dp1(strSubstring2))));
                } else {
                    zy5VarN.add(new st7(strSubstring2));
                }
            }
            listJ = gc1.J(zy5VarN);
        }
        return new sn7(listJ, lc3Var);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof cp1) {
            return lc5.Q(this.a, ((cp1) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return xv5.s(new StringBuilder("ConstantFormatStructure("), this.a, ')');
    }
}
