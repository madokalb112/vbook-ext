package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class yhb {
    public static final /* synthetic */ ni5[] l = {new qz6(yhb.class, "userId", "getUserId()Ljava/lang/String;", 0), new qz6(yhb.class, "email", "getEmail()Ljava/lang/String;", 0), new qz6(yhb.class, "fcmToken", "getFcmToken()Ljava/lang/String;", 0), new qz6(yhb.class, "token", "getToken()Ljava/lang/String;", 0), new qz6(yhb.class, "refreshToken", "getRefreshToken()Ljava/lang/String;", 0), new qz6(yhb.class, "avatar", "getAvatar()Ljava/lang/String;", 0), new qz6(yhb.class, "name", "getName()Ljava/lang/String;", 0), new qz6(yhb.class, "premium", "getPremium()Z", 0), new qz6(yhb.class, "freeDownloadDay", "getFreeDownloadDay()Ljava/lang/String;", 0), new qz6(yhb.class, "freeDownloadCount", "getFreeDownloadCount()I", 0), new qz6(yhb.class, "role", "getRole()I", 0), new qz6(yhb.class, "color", "getColor()Ljava/lang/String;", 0)};
    public final da7 a;
    public final da7 b;
    public final da7 c;
    public final da7 d;
    public final da7 e;
    public final da7 f;
    public final km0 g;
    public final da7 h;
    public final x95 i;
    public final x95 j;
    public final da7 k;

    public yhb() {
        g18 g18VarW = pu1.w("users");
        this.a = new da7(g18VarW, "user_id", "");
        this.b = new da7(g18VarW, "email", "");
        this.c = new da7(g18VarW, "token", "");
        this.d = new da7(g18VarW, "refresh_token", "");
        this.e = new da7(g18VarW, "avatar", "");
        this.f = new da7(g18VarW, "name", "");
        this.g = new km0(g18VarW, "premium", false);
        this.h = new da7(g18VarW, "free_download_day", "");
        this.i = new x95(g18VarW, "free_download_count", 0);
        this.j = new x95(g18VarW, "role", 0);
        this.k = new da7(g18VarW, "color", "");
    }

    public final String a() {
        return (String) this.c.c(l[3], this);
    }

    public final void b(String str) {
        str.getClass();
        this.c.e(l[3], str);
    }
}
