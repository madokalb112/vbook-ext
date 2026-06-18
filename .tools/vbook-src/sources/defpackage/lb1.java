package defpackage;

import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public abstract class lb1 {
    public static final Set a;
    public static final Set b;
    public static final ArrayList c;
    public static final ArrayList d;

    static {
        ArrayList arrayListI0 = fc1.I0(fc1.H0(new x21('a', 'z'), new x21('A', 'Z')), new x21('0', '9'));
        ArrayList arrayList = new ArrayList(gc1.M(arrayListI0, 10));
        int size = arrayListI0.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayListI0.get(i);
            i++;
            arrayList.add(Byte.valueOf((byte) ((Character) obj).charValue()));
        }
        a = fc1.e1(arrayList);
        b = fc1.e1(fc1.I0(fc1.H0(new x21('a', 'z'), new x21('A', 'Z')), new x21('0', '9')));
        fc1.e1(fc1.I0(fc1.H0(new x21('a', 'f'), new x21('A', 'F')), new x21('0', '9')));
        Set setQ0 = fw.Q0(new Character[]{':', '/', '?', '#', '[', ']', '@', '!', '$', '&', '\'', '(', ')', '*', ',', ';', '=', '-', '.', '_', '~', '+'});
        ArrayList arrayList2 = new ArrayList(gc1.M(setQ0, 10));
        Iterator it = setQ0.iterator();
        while (it.hasNext()) {
            arrayList2.add(Byte.valueOf((byte) ((Character) it.next()).charValue()));
        }
        c = arrayList2;
        fw.Q0(new Character[]{':', '@', '!', '$', '&', '\'', '(', ')', '*', '+', ',', ';', '=', '-', '.', '_', '~'});
        e11.X(b, fw.Q0(new Character[]{'!', '#', '$', '&', '+', '-', '.', '^', '_', '`', '|', '~'}));
        List listZ = gc1.Z('-', '.', '_', '~');
        ArrayList arrayList3 = new ArrayList(gc1.M(listZ, 10));
        Iterator it2 = listZ.iterator();
        while (it2.hasNext()) {
            arrayList3.add(Byte.valueOf((byte) ((Character) it2.next()).charValue()));
        }
        d = arrayList3;
    }

    public static final int a(char c2) {
        if ('0' <= c2 && c2 < ':') {
            return c2 - '0';
        }
        if ('A' <= c2 && c2 < 'G') {
            return c2 - '7';
        }
        if ('a' > c2 || c2 >= 'g') {
            return -1;
        }
        return c2 - 'W';
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: e20 */
    public static final String b(String str, int i, int i2, boolean z) throws e20 {
        int i3 = i;
        while (i3 < i2) {
            char cCharAt = str.charAt(i3);
            if (cCharAt == '%' || (z && cCharAt == '+')) {
                int i4 = i2 - i;
                if (i4 > 255) {
                    i4 /= 3;
                }
                StringBuilder sb = new StringBuilder(i4);
                if (i3 > i) {
                    sb.append((CharSequence) str, i, i3);
                }
                byte[] bArr = null;
                while (i3 < i2) {
                    char cCharAt2 = str.charAt(i3);
                    if (z && cCharAt2 == '+') {
                        sb.append(' ');
                    } else if (cCharAt2 == '%') {
                        if (bArr == null) {
                            bArr = new byte[(i2 - i3) / 3];
                        }
                        int i5 = 0;
                        while (i3 < i2 && str.charAt(i3) == '%') {
                            int i6 = i3 + 2;
                            if (i6 >= i2) {
                                StringBuilder sb2 = new StringBuilder("Incomplete trailing HEX escape: ");
                                sb2.append(str.subSequence(i3, str.length()).toString());
                                sb2.append(", in ");
                                sb2.append((Object) str);
                                throw new e20(tw2.r(sb2, " at ", i3));
                            }
                            int i7 = i3 + 1;
                            int iA = a(str.charAt(i7));
                            int iA2 = a(str.charAt(i6));
                            if (iA == -1 || iA2 == -1) {
                                throw new e20("Wrong HEX escape: %" + str.charAt(i7) + str.charAt(i6) + ", in " + ((Object) str) + ", at " + i3);
                            }
                            bArr[i5] = (byte) ((iA * 16) + iA2);
                            i3 += 3;
                            i5++;
                        }
                        sb.append(iw9.A(0, bArr, i5, 4));
                    } else {
                        sb.append(cCharAt2);
                    }
                    i3++;
                }
                return sb.toString();
            }
            i3++;
        }
        return (i == 0 && i2 == str.length()) ? str.toString() : str.substring(i, i2);
    }

    public static String c(String str) {
        int length = str.length();
        Charset charset = q31.a;
        str.getClass();
        charset.getClass();
        return b(str, 0, length, false);
    }

    public static String d(int i, String str, int i2, int i3) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = str.length();
        }
        boolean z = (i3 & 4) == 0;
        Charset charset = q31.a;
        str.getClass();
        charset.getClass();
        return b(str, i, i2, z);
    }

    public static final String e(String str, boolean z) {
        str.getClass();
        StringBuilder sb = new StringBuilder();
        CharsetEncoder charsetEncoderNewEncoder = q31.a.newEncoder();
        charsetEncoderNewEncoder.getClass();
        int length = str.length();
        wq0 wq0Var = new wq0();
        fx1.Y(charsetEncoderNewEncoder, wq0Var, str, 0, length);
        f(wq0Var, new hb0(sb, z, 1));
        return sb.toString();
    }

    public static final void f(wq0 wq0Var, kb4 kb4Var) {
        while (!wq0Var.k()) {
            while (!wq0Var.k()) {
                kb4Var.invoke(Byte.valueOf(wq0Var.readByte()));
            }
        }
    }

    public static final String g(byte b2) {
        int i = (b2 & 255) >> 4;
        int i2 = b2 & 15;
        return new String(new char[]{'%', (char) ((i < 0 || i >= 10) ? ((char) (i + 65)) - '\n' : i + 48), (char) ((i2 < 0 || i2 >= 10) ? ((char) (i2 + 65)) - '\n' : i2 + 48)});
    }
}
