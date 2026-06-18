package okhttp3.internal.publicsuffix;

import defpackage.a39;
import defpackage.a63;
import defpackage.av0;
import defpackage.bw9;
import defpackage.f39;
import defpackage.fc1;
import defpackage.gc1;
import defpackage.jc1;
import defpackage.lc3;
import defpackage.lc5;
import defpackage.q31;
import defpackage.ra1;
import defpackage.x53;
import defpackage.xv5;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.IDN;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import okhttp3.internal._UtilCommonKt;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class PublicSuffixDatabase {
    public static final av0 b;
    public static final List c;
    public static final PublicSuffixDatabase d;
    public final AssetPublicSuffixList a;

    /* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
    public static final class Companion {
        public static final String a(av0 av0Var, av0[] av0VarArr, int i) {
            int i2;
            boolean z;
            int i3;
            int i4;
            av0 av0Var2 = PublicSuffixDatabase.b;
            int iD = av0Var.d();
            int i5 = 0;
            while (i5 < iD) {
                int i6 = (i5 + iD) / 2;
                while (i6 > -1 && av0Var.i(i6) != 10) {
                    i6--;
                }
                int i7 = i6 + 1;
                int i8 = 1;
                while (true) {
                    i2 = i7 + i8;
                    if (av0Var.i(i2) == 10) {
                        break;
                    }
                    i8++;
                }
                int i9 = i2 - i7;
                int i10 = i;
                boolean z2 = false;
                int i11 = 0;
                int i12 = 0;
                while (true) {
                    if (z2) {
                        i3 = 46;
                        z = false;
                    } else {
                        byte bI = av0VarArr[i10].i(i11);
                        byte[] bArr = _UtilCommonKt.a;
                        int i13 = bI & 255;
                        z = z2;
                        i3 = i13;
                    }
                    byte bI2 = av0Var.i(i7 + i12);
                    byte[] bArr2 = _UtilCommonKt.a;
                    i4 = i3 - (bI2 & 255);
                    if (i4 != 0) {
                        break;
                    }
                    i12++;
                    i11++;
                    if (i12 == i9) {
                        break;
                    }
                    if (av0VarArr[i10].d() != i11) {
                        z2 = z;
                    } else {
                        if (i10 == av0VarArr.length - 1) {
                            break;
                        }
                        i10++;
                        i11 = -1;
                        z2 = true;
                    }
                }
                if (i4 >= 0) {
                    if (i4 <= 0) {
                        int i14 = i9 - i12;
                        int iD2 = av0VarArr[i10].d() - i11;
                        int length = av0VarArr.length;
                        for (int i15 = i10 + 1; i15 < length; i15++) {
                            iD2 += av0VarArr[i15].d();
                        }
                        if (iD2 >= i14) {
                            if (iD2 <= i14) {
                                return av0Var.o(i7, i9 + i7).n(q31.a);
                            }
                        }
                    }
                    i5 = i2 + 1;
                }
                iD = i6;
            }
            return null;
        }
    }

    static {
        av0 av0Var = av0.d;
        b = new av0(Arrays.copyOf(new byte[]{42}, 1));
        c = gc1.Y("*");
        d = new PublicSuffixDatabase(new AssetPublicSuffixList());
    }

    public PublicSuffixDatabase(AssetPublicSuffixList assetPublicSuffixList) {
        this.a = assetPublicSuffixList;
    }

    public static List b(String str) {
        List listO0 = bw9.o0(str, new char[]{'.'}, 0, 6);
        return lc5.Q(fc1.E0(listO0), "") ? fc1.u0(listO0) : listO0;
    }

    public final String a(String str) {
        String strA;
        String strA2;
        String strA3;
        List listO0;
        int size;
        int size2;
        String unicode = IDN.toUnicode(str);
        unicode.getClass();
        List listB = b(unicode);
        AssetPublicSuffixList assetPublicSuffixList = this.a;
        AtomicBoolean atomicBoolean = assetPublicSuffixList.a;
        if (atomicBoolean.get() || !atomicBoolean.compareAndSet(false, true)) {
            try {
                assetPublicSuffixList.b.await();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        } else {
            boolean z = false;
            while (true) {
                try {
                    try {
                        assetPublicSuffixList.c();
                        break;
                    } finally {
                        if (z) {
                            Thread.currentThread().interrupt();
                        }
                    }
                } catch (InterruptedIOException unused2) {
                    Thread.interrupted();
                    z = true;
                } catch (IOException e) {
                    assetPublicSuffixList.e = e;
                    if (z) {
                    }
                }
            }
        }
        if (assetPublicSuffixList.c == null) {
            IllegalStateException illegalStateException = new IllegalStateException("Unable to load " + ((Object) assetPublicSuffixList.f) + " resource.");
            illegalStateException.initCause(assetPublicSuffixList.e);
            throw illegalStateException;
        }
        int size3 = listB.size();
        av0[] av0VarArr = new av0[size3];
        for (int i = 0; i < size3; i++) {
            av0 av0Var = av0.d;
            av0VarArr[i] = ra1.s((String) listB.get(i));
        }
        int i2 = 0;
        while (true) {
            if (i2 >= size3) {
                strA = null;
                break;
            }
            strA = Companion.a(assetPublicSuffixList.a(), av0VarArr, i2);
            if (strA != null) {
                break;
            }
            i2++;
        }
        if (size3 > 1) {
            av0[] av0VarArr2 = (av0[]) av0VarArr.clone();
            int length = av0VarArr2.length - 1;
            for (int i3 = 0; i3 < length; i3++) {
                av0VarArr2[i3] = b;
                strA2 = Companion.a(assetPublicSuffixList.a(), av0VarArr2, i3);
                if (strA2 != null) {
                    break;
                }
            }
            strA2 = null;
        } else {
            strA2 = null;
        }
        if (strA2 != null) {
            int i4 = size3 - 1;
            for (int i5 = 0; i5 < i4; i5++) {
                av0 av0Var2 = assetPublicSuffixList.d;
                if (av0Var2 == null) {
                    lc5.i0("exceptionBytes");
                    throw null;
                }
                strA3 = Companion.a(av0Var2, av0VarArr, i5);
                if (strA3 != null) {
                    break;
                }
            }
            strA3 = null;
        } else {
            strA3 = null;
        }
        if (strA3 != null) {
            listO0 = bw9.o0("!".concat(strA3), new char[]{'.'}, 0, 6);
        } else if (strA == null && strA2 == null) {
            listO0 = c;
        } else {
            lc3 lc3Var = lc3.a;
            List listO02 = strA != null ? bw9.o0(strA, new char[]{'.'}, 0, 6) : lc3Var;
            listO0 = strA2 != null ? bw9.o0(strA2, new char[]{'.'}, 0, 6) : lc3Var;
            if (listO02.size() > listO0.size()) {
                listO0 = listO02;
            }
        }
        if (listB.size() == listO0.size() && ((String) listO0.get(0)).charAt(0) != '!') {
            return null;
        }
        if (((String) listO0.get(0)).charAt(0) == '!') {
            size = listB.size();
            size2 = listO0.size();
        } else {
            size = listB.size();
            size2 = listO0.size() + 1;
        }
        int i6 = size - size2;
        a39 jc1Var = new jc1(b(str), 0);
        if (i6 < 0) {
            gp.k(xv5.k(i6, "Requested element count ", " is less than zero."));
            return null;
        }
        if (i6 != 0) {
            jc1Var = jc1Var instanceof a63 ? ((a63) jc1Var).b(i6) : new x53(jc1Var, i6, 0);
        }
        return f39.p0(jc1Var, ".");
    }
}
