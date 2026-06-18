package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class kg1 implements vv8 {
    public final /* synthetic */ int a;

    public /* synthetic */ kg1(int i) {
        this.a = i;
    }

    public static byte[] c(String str) {
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            int i2 = i * 2;
            String strSubstring = str.substring(i2, i2 + 2);
            gjb.X(16);
            bArr[i] = (byte) Integer.parseInt(strSubstring, 16);
        }
        return bArr;
    }

    public static boolean d(char c) {
        if ('0' <= c && c < ':') {
            return true;
        }
        if ('a' > c || c >= 'g') {
            return 'A' <= c && c < 'G';
        }
        return true;
    }

    public static byte[] e(int i, String str) {
        if (str == null || str.length() == 0) {
            return new byte[i];
        }
        if (str.length() == i * 2) {
            for (int i2 = 0; i2 < str.length(); i2++) {
                if (d(str.charAt(i2))) {
                }
            }
            return c(str);
        }
        return Arrays.copyOf(iw9.B(str), i);
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0071 A[PHI: r0
  0x0071: PHI (r0v5 int) = (r0v3 int), (r0v4 int) binds: [B:37:0x006f, B:40:0x0075] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static byte[] f(java.lang.Integer r3, java.lang.String r4) {
        /*
            r0 = 0
            if (r3 != 0) goto L7d
            int r3 = r4.length()
            r1 = 32
            if (r3 != r1) goto L25
            r3 = r0
        Lc:
            int r2 = r4.length()
            if (r3 >= r2) goto L20
            char r2 = r4.charAt(r3)
            boolean r2 = d(r2)
            if (r2 != 0) goto L1d
            goto L25
        L1d:
            int r3 = r3 + 1
            goto Lc
        L20:
            byte[] r3 = c(r4)
            return r3
        L25:
            int r3 = r4.length()
            r2 = 48
            if (r3 != r2) goto L47
            r3 = r0
        L2e:
            int r2 = r4.length()
            if (r3 >= r2) goto L42
            char r2 = r4.charAt(r3)
            boolean r2 = d(r2)
            if (r2 != 0) goto L3f
            goto L47
        L3f:
            int r3 = r3 + 1
            goto L2e
        L42:
            byte[] r3 = c(r4)
            return r3
        L47:
            int r3 = r4.length()
            r2 = 64
            if (r3 != r2) goto L68
        L4f:
            int r3 = r4.length()
            if (r0 >= r3) goto L63
            char r3 = r4.charAt(r0)
            boolean r3 = d(r3)
            if (r3 != 0) goto L60
            goto L68
        L60:
            int r0 = r0 + 1
            goto L4f
        L63:
            byte[] r3 = c(r4)
            return r3
        L68:
            byte[] r3 = defpackage.iw9.B(r4)
            int r4 = r3.length
            r0 = 16
            if (r4 > r0) goto L73
        L71:
            r1 = r0
            goto L78
        L73:
            r0 = 24
            if (r4 > r0) goto L78
            goto L71
        L78:
            byte[] r3 = java.util.Arrays.copyOf(r3, r1)
            return r3
        L7d:
            int r1 = r4.length()
            int r2 = r3.intValue()
            int r2 = r2 * 2
            if (r1 != r2) goto La2
        L89:
            int r1 = r4.length()
            if (r0 >= r1) goto L9d
            char r1 = r4.charAt(r0)
            boolean r1 = d(r1)
            if (r1 != 0) goto L9a
            goto La2
        L9a:
            int r0 = r0 + 1
            goto L89
        L9d:
            byte[] r3 = c(r4)
            return r3
        La2:
            byte[] r4 = defpackage.iw9.B(r4)
            int r3 = r3.intValue()
            byte[] r3 = java.util.Arrays.copyOf(r4, r3)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kg1.f(java.lang.Integer, java.lang.String):byte[]");
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0031, code lost:
    
        if (r1.equals("CBC") != false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x003a, code lost:
    
        if (r1.equals("") != false) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.g81 g(java.lang.String r4) {
        /*
            r0 = 0
            if (r4 == 0) goto Ld
            java.util.Locale r1 = java.util.Locale.ROOT
            java.lang.String r1 = r4.toUpperCase(r1)
            r1.getClass()
            goto Le
        Ld:
            r1 = r0
        Le:
            if (r1 == 0) goto L49
            int r2 = r1.hashCode()
            if (r2 == 0) goto L34
            r3 = 66500(0x103c4, float:9.3186E-41)
            if (r2 == r3) goto L2b
            r3 = 68452(0x10b64, float:9.5922E-41)
            if (r2 != r3) goto L3d
            java.lang.String r2 = "ECB"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L3d
            g81 r4 = defpackage.g81.b
            return r4
        L2b:
            java.lang.String r2 = "CBC"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L3d
            goto L49
        L34:
            java.lang.String r2 = ""
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L3d
            goto L49
        L3d:
            java.lang.String r1 = "Unsupported cipher mode: "
            java.lang.String r2 = ". Only CBC and ECB are supported."
            java.lang.String r4 = defpackage.xv5.p(r1, r4, r2)
            gp.l(r4)
            return r0
        L49:
            g81 r4 = defpackage.g81.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kg1.g(java.lang.String):g81");
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0042, code lost:
    
        if (r2.equals("no") == false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x004b, code lost:
    
        if (r2.equals("nopadding") == false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0050, code lost:
    
        return defpackage.i81.c;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.i81 h(java.lang.String r2) {
        /*
            if (r2 == 0) goto Lc
            java.util.Locale r0 = java.util.Locale.ROOT
            java.lang.String r2 = r2.toLowerCase(r0)
            r2.getClass()
            goto Ld
        Lc:
            r2 = 0
        Ld:
            if (r2 == 0) goto L51
            int r0 = r2.hashCode()
            r1 = -1879416016(0xffffffff8ffa6330, float:-2.4690109E-29)
            if (r0 == r1) goto L45
            r1 = 3521(0xdc1, float:4.934E-42)
            if (r0 == r1) goto L3c
            r1 = 3735208(0x38fea8, float:5.234141E-39)
            if (r0 == r1) goto L30
            r1 = 922939497(0x3702f069, float:7.804579E-6)
            if (r0 == r1) goto L27
            goto L51
        L27:
            java.lang.String r0 = "zeropadding"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L39
            goto L51
        L30:
            java.lang.String r0 = "zero"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L39
            goto L51
        L39:
            i81 r2 = defpackage.i81.b
            return r2
        L3c:
            java.lang.String r0 = "no"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L4e
            goto L51
        L45:
            java.lang.String r0 = "nopadding"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L4e
            goto L51
        L4e:
            i81 r2 = defpackage.i81.c
            return r2
        L51:
            i81 r2 = defpackage.i81.a
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kg1.h(java.lang.String):i81");
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.vv8
    public final Object b(String str, Object[] objArr, jt1 jt1Var) throws Throwable {
        Object objP0;
        String string;
        Object objP02;
        String string2;
        Object objP03;
        String string3;
        Object objP04;
        String string4;
        Object objP05;
        String string5;
        Object objP06;
        String string6;
        Object objP07;
        String string7;
        Object objP08;
        String string8;
        byte[] bArrP;
        Object objP09;
        String string9;
        Object objP010;
        String string10;
        Object objP011;
        String string11;
        Object objP012;
        String string12;
        Object objP013;
        String string13;
        Object objP014;
        String string14;
        Object objP015;
        String string15;
        Object objP016;
        String string16;
        Object objP017;
        String string17;
        Object objP018;
        String string18;
        byte[] bArrR;
        Object objP019;
        String string19;
        Object objP020;
        String string20;
        Object objP021;
        String string21;
        Object objP022;
        String string22;
        Object[] objArr2 = 0;
        switch (this.a) {
            case 0:
                if (!str.equals("Common_sleep")) {
                    return null;
                }
                ah1.S(hc3.a, new rf(objArr, objArr2 == true ? 1 : 0, 11));
                return Boolean.TRUE;
            default:
                h81 h81Var = h81.e;
                j81 j81Var = j81.N;
                j81 j81Var2 = j81.O;
                j81 j81Var3 = j81.M;
                int i = 0;
                switch (str.hashCode()) {
                    case -1093089467:
                        if (!str.equals("Crypto_sha256") || (objP0 = fw.p0(0, objArr)) == null || (string = objP0.toString()) == null) {
                            return null;
                        }
                        return vw1.F(iw9.B(string), pq8.j).a();
                    case -1093086712:
                        if (!str.equals("Crypto_sha512") || (objP02 = fw.p0(0, objArr)) == null || (string2 = objP02.toString()) == null) {
                            return null;
                        }
                        return vw1.F(iw9.B(string2), qq8.k).a();
                    case -554010951:
                        if (!str.equals("Crypto_hmacMd5") || (objP03 = fw.p0(0, objArr)) == null || (string3 = objP03.toString()) == null || (objP04 = fw.p0(1, objArr)) == null || (string4 = objP04.toString()) == null) {
                            return null;
                        }
                        return lw1.G(iw9.B(string4), iw9.B(string3), new i76()).a();
                    case -113744969:
                        if (!str.equals("Crypto_tripleDesDecrypt") || (objP05 = fw.p0(0, objArr)) == null || (string5 = objP05.toString()) == null || (objP06 = fw.p0(1, objArr)) == null || (string6 = objP06.toString()) == null) {
                            return null;
                        }
                        Object objP023 = fw.p0(2, objArr);
                        String string23 = objP023 != null ? objP023.toString() : null;
                        Object objP024 = fw.p0(3, objArr);
                        g81 g81VarG = g(objP024 != null ? objP024.toString() : null);
                        Object objP025 = fw.p0(4, objArr);
                        i81 i81VarH = h(objP025 != null ? objP025.toString() : null);
                        byte[] bArrF = f(new Integer(24), string6);
                        byte[] bArrE = e(8, string23);
                        int[] iArr = qc0.a;
                        byte[] bArrA = qc0.a(string5);
                        if (bArrA.length % 8 == 0) {
                            return iw9.z(vv1.w(2, bArrA, bArrF, bArrE, g81VarG, i81VarH));
                        }
                        j31.e(bArrA.length, "Invalid 3DES ciphertext length ", " for ", g81VarG, " mode. Decoded ciphertext must be a multiple of 8 bytes.");
                        return null;
                    case -74443812:
                        if (!str.equals("Crypto_aesDecrypt") || (objP07 = fw.p0(0, objArr)) == null || (string7 = objP07.toString()) == null || (objP08 = fw.p0(1, objArr)) == null || (string8 = objP08.toString()) == null) {
                            return null;
                        }
                        Object objP026 = fw.p0(2, objArr);
                        String string24 = objP026 != null ? objP026.toString() : null;
                        Object objP027 = fw.p0(3, objArr);
                        g81 g81VarG2 = g(objP027 != null ? objP027.toString() : null);
                        Object objP028 = fw.p0(4, objArr);
                        i81 i81VarH2 = h(objP028 != null ? objP028.toString() : null);
                        byte[] bArrF2 = f(null, string8);
                        byte[] bArrE2 = e(16, string24);
                        int[] iArr2 = qc0.a;
                        byte[] bArrA2 = qc0.a(string7);
                        if (bArrA2.length % 16 != 0) {
                            j31.e(bArrA2.length, "Invalid AES ciphertext length ", " for ", g81VarG2, " mode. Decoded ciphertext must be a multiple of 16 bytes.");
                            return null;
                        }
                        int iOrdinal = i81VarH2.ordinal();
                        if (iOrdinal != 0) {
                            if (iOrdinal == 1) {
                                j81Var = j81Var2;
                            } else {
                                if (iOrdinal != 2) {
                                    mn5.g();
                                    return null;
                                }
                                j81Var = j81Var3;
                            }
                        }
                        int iOrdinal2 = g81VarG2.ordinal();
                        if (iOrdinal2 == 0) {
                            int[] iArr3 = h.g;
                            bArrP = vo1.P(bArrA2, bArrF2, bArrE2, j81Var);
                        } else {
                            if (iOrdinal2 != 1) {
                                mn5.g();
                                return null;
                            }
                            h hVar = new h(bArrF2);
                            h81Var.getClass();
                            byte[] bArrY = fw.Y(bArrA2, 0, bArrA2.length);
                            if (j81Var.equals(j81Var3)) {
                                int length = bArrY.length;
                                if (length % 16 != 0) {
                                    length = ((length / 16) + 1) * 16;
                                }
                                bArrP = Arrays.copyOf(h81Var.a(Arrays.copyOf(bArrY, length), hVar, j81Var2, null), bArrY.length);
                            } else {
                                bArrP = h81Var.a(bArrY, hVar, j81Var, null);
                            }
                        }
                        return iw9.z(bArrP);
                    case 1399072:
                        if (!str.equals("Crypto_md5") || (objP09 = fw.p0(0, objArr)) == null || (string9 = objP09.toString()) == null) {
                            return null;
                        }
                        return vw1.F(iw9.B(string9), i76.j).a();
                    case 5713706:
                        if (!str.equals("Crypto_hmacSha1") || (objP010 = fw.p0(0, objArr)) == null || (string10 = objP010.toString()) == null || (objP011 = fw.p0(1, objArr)) == null || (string11 = objP011.toString()) == null) {
                            return null;
                        }
                        return lw1.G(iw9.B(string11), iw9.B(string10), new oq8()).a();
                    case 43555235:
                        if (!str.equals("Crypto_sha1") || (objP012 = fw.p0(0, objArr)) == null || (string12 = objP012.toString()) == null) {
                            return null;
                        }
                        return vw1.F(iw9.B(string12), oq8.i).a();
                    case 277931707:
                        if (!str.equals("Crypto_base64Decode") || (objP013 = fw.p0(0, objArr)) == null || (string13 = objP013.toString()) == null) {
                            return null;
                        }
                        int[] iArr4 = qc0.a;
                        byte[] bArrA3 = qc0.a(string13);
                        StringBuilder sb = new StringBuilder(bArrA3.length);
                        int length2 = bArrA3.length;
                        while (i < length2) {
                            sb.append((char) (bArrA3[i] & 255));
                            i++;
                        }
                        return sb.toString();
                    case 314872547:
                        if (!str.equals("Crypto_base64Encode") || (objP014 = fw.p0(0, objArr)) == null || (string14 = objP014.toString()) == null) {
                            return null;
                        }
                        int[] iArr5 = qc0.a;
                        int length3 = string14.length();
                        byte[] bArr = new byte[length3];
                        while (i < length3) {
                            bArr[i] = (byte) (string14.charAt(i) & 255);
                            i++;
                        }
                        return qc0.b(bArr);
                    case 1031421071:
                        if (!str.equals("Crypto_tripleDesEncrypt") || (objP015 = fw.p0(0, objArr)) == null || (string15 = objP015.toString()) == null || (objP016 = fw.p0(1, objArr)) == null || (string16 = objP016.toString()) == null) {
                            return null;
                        }
                        Object objP029 = fw.p0(2, objArr);
                        String string25 = objP029 != null ? objP029.toString() : null;
                        Object objP030 = fw.p0(3, objArr);
                        g81 g81VarG3 = g(objP030 != null ? objP030.toString() : null);
                        Object objP031 = fw.p0(4, objArr);
                        byte[] bArrW = vv1.w(1, iw9.B(string15), f(new Integer(24), string16), e(8, string25), g81VarG3, h(objP031 != null ? objP031.toString() : null));
                        int[] iArr6 = qc0.a;
                        return qc0.b(bArrW);
                    case 1070722228:
                        if (!str.equals("Crypto_aesEncrypt") || (objP017 = fw.p0(0, objArr)) == null || (string17 = objP017.toString()) == null || (objP018 = fw.p0(1, objArr)) == null || (string18 = objP018.toString()) == null) {
                            return null;
                        }
                        Object objP032 = fw.p0(2, objArr);
                        String string26 = objP032 != null ? objP032.toString() : null;
                        Object objP033 = fw.p0(3, objArr);
                        g81 g81VarG4 = g(objP033 != null ? objP033.toString() : null);
                        Object objP034 = fw.p0(4, objArr);
                        i81 i81VarH3 = h(objP034 != null ? objP034.toString() : null);
                        byte[] bArrF3 = f(null, string18);
                        byte[] bArrE3 = e(16, string26);
                        byte[] bArrB = iw9.B(string17);
                        int iOrdinal3 = i81VarH3.ordinal();
                        if (iOrdinal3 != 0) {
                            if (iOrdinal3 == 1) {
                                j81Var = j81Var2;
                            } else {
                                if (iOrdinal3 != 2) {
                                    mn5.g();
                                    return null;
                                }
                                j81Var = j81Var3;
                            }
                        }
                        int iOrdinal4 = g81VarG4.ordinal();
                        if (iOrdinal4 == 0) {
                            int[] iArr7 = h.g;
                            bArrR = vo1.R(bArrB, bArrF3, bArrE3, j81Var);
                        } else {
                            if (iOrdinal4 != 1) {
                                mn5.g();
                                return null;
                            }
                            h hVar2 = new h(bArrF3);
                            h81Var.getClass();
                            byte[] bArrY2 = fw.Y(bArrB, 0, bArrB.length);
                            bArrR = j81Var.equals(j81Var3) ? Arrays.copyOf(h81Var.b(bArrY2, hVar2, j81Var2, null), bArrY2.length) : h81Var.b(bArrY2, hVar2, j81Var, null);
                        }
                        int[] iArr8 = qc0.a;
                        return qc0.b(bArrR);
                    case 1195906828:
                        if (!str.equals("Crypto_hmacSha256") || (objP019 = fw.p0(0, objArr)) == null || (string19 = objP019.toString()) == null || (objP020 = fw.p0(1, objArr)) == null || (string20 = objP020.toString()) == null) {
                            return null;
                        }
                        return lw1.G(iw9.B(string20), iw9.B(string19), new pq8()).a();
                    case 1195909583:
                        if (!str.equals("Crypto_hmacSha512") || (objP021 = fw.p0(0, objArr)) == null || (string21 = objP021.toString()) == null || (objP022 = fw.p0(1, objArr)) == null || (string22 = objP022.toString()) == null) {
                            return null;
                        }
                        return lw1.G(iw9.B(string22), iw9.B(string21), new qq8()).a();
                    default:
                        return null;
                }
        }
    }
}
