package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class ji implements ah8 {
    @Override // defpackage.ah8
    public final bh8 a(ty9 ty9Var, s25 s25Var) {
        ty9Var.getClass();
        s25Var.getClass();
        return new li(ty9Var, s25Var, ty9Var.b);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006d  */
    @Override // defpackage.ah8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Boolean b(java.lang.String r2) {
        /*
            r1 = this;
            r2.getClass()
            java.lang.String r1 = "image/"
            r0 = 0
            boolean r1 = defpackage.iw9.K(r2, r1, r0)
            if (r1 != 0) goto Lf
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            return r1
        Lf:
            int r1 = r2.hashCode()
            switch(r1) {
                case -1487656890: goto L73;
                case -1487464693: goto L5e;
                case -1487464690: goto L55;
                case -1487394660: goto L49;
                case -1487018032: goto L40;
                case -879272239: goto L34;
                case -879267568: goto L2b;
                case -879258763: goto L22;
                case -227171396: goto L18;
                default: goto L16;
            }
        L16:
            goto L85
        L18:
            java.lang.String r1 = "image/svg+xml"
            boolean r1 = r2.equals(r1)
            if (r1 != 0) goto L3d
            goto L85
        L22:
            java.lang.String r1 = "image/png"
            boolean r1 = r2.equals(r1)
            if (r1 != 0) goto L52
            goto L85
        L2b:
            java.lang.String r1 = "image/gif"
            boolean r1 = r2.equals(r1)
            if (r1 != 0) goto L3d
            goto L85
        L34:
            java.lang.String r1 = "image/bmp"
            boolean r1 = r2.equals(r1)
            if (r1 != 0) goto L3d
            goto L85
        L3d:
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            return r1
        L40:
            java.lang.String r1 = "image/webp"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L85
            goto L52
        L49:
            java.lang.String r1 = "image/jpeg"
            boolean r1 = r2.equals(r1)
            if (r1 != 0) goto L52
            goto L85
        L52:
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            return r1
        L55:
            java.lang.String r1 = "image/heif"
            boolean r1 = r2.equals(r1)
            if (r1 != 0) goto L67
            goto L85
        L5e:
            java.lang.String r1 = "image/heic"
            boolean r1 = r2.equals(r1)
            if (r1 != 0) goto L67
            goto L85
        L67:
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 27
            if (r1 < r2) goto L6e
            r0 = 1
        L6e:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            return r1
        L73:
            java.lang.String r1 = "image/avif"
            boolean r1 = r2.equals(r1)
            if (r1 != 0) goto L7c
            goto L85
        L7c:
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 35
            if (r1 > r2) goto L85
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            return r1
        L85:
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ji.b(java.lang.String):java.lang.Boolean");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && ji.class == obj.getClass();
    }

    public final int hashCode() {
        return ug8.a(ji.class).hashCode();
    }

    public final String toString() {
        return "AndroidRegionDecoder";
    }

    @Override // defpackage.ah8
    public final void c() {
    }
}
