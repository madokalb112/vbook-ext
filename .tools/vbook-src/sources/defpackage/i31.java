package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public abstract class i31 {
    public static final /* synthetic */ int a = 0;

    static {
        long j;
        long j2;
        long j3;
        p7c.R(gu4.k, new vi0(28), new k7(8));
        ha5 ha5Var = new ha5(0, 255, 1);
        ArrayList arrayList = new ArrayList(gc1.M(ha5Var, 10));
        Iterator it = ha5Var.iterator();
        while (true) {
            w21 w21Var = (w21) it;
            if (!w21Var.d) {
                break;
            }
            int iNextInt = w21Var.nextInt();
            if (48 > iNextInt || iNextInt >= 58) {
                j = iNextInt;
                if (j >= 97 && j <= 102) {
                    j3 = 87;
                } else if (j < 65 || j > 70) {
                    j2 = -1;
                    arrayList.add(Long.valueOf(j2));
                } else {
                    j3 = 55;
                }
            } else {
                j = iNextInt;
                j3 = 48;
            }
            j2 = j - j3;
            arrayList.add(Long.valueOf(j2));
        }
        fc1.a1(arrayList);
        ha5 ha5Var2 = new ha5(0, 15, 1);
        ArrayList arrayList2 = new ArrayList(gc1.M(ha5Var2, 10));
        Iterator it2 = ha5Var2.iterator();
        while (true) {
            w21 w21Var2 = (w21) it2;
            if (!w21Var2.d) {
                fc1.U0(arrayList2);
                return;
            } else {
                int iNextInt2 = w21Var2.nextInt();
                arrayList2.add(Byte.valueOf((byte) (iNextInt2 < 10 ? iNextInt2 + 48 : (char) (((char) (iNextInt2 + 97)) - '\n'))));
            }
        }
    }

    public static final int a(CharSequence charSequence, int i, int i2) {
        charSequence.getClass();
        int i3 = 0;
        while (i < i2) {
            int iCharAt = charSequence.charAt(i);
            if (65 <= iCharAt && iCharAt < 91) {
                iCharAt += 32;
            }
            i3 = (i3 * 31) + iCharAt;
            i++;
        }
        return i3;
    }

    public static final void b(i21 i21Var, int i) {
        throw new NumberFormatException("Invalid number: " + ((Object) i21Var) + ", wrong digit: " + i21Var.charAt(i) + " at position " + i);
    }
}
