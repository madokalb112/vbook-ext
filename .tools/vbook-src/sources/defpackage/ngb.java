package defpackage;

import java.io.Serializable;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
@t39(with = rgb.class)
public final class ngb implements Serializable {
    public static final mgb Companion = new mgb();
    public final String a;
    public final int b;
    public final pm7 c;
    public final String d;
    public final String e;
    public final String f;
    public final tcb s;
    public final tcb t;
    public final d6a u;
    public final d6a v;

    public ngb(tcb tcbVar, String str, int i, ArrayList arrayList, pm7 pm7Var, String str2, String str3, String str4, String str5) {
        str.getClass();
        pm7Var.getClass();
        str2.getClass();
        this.a = str;
        this.b = i;
        this.c = pm7Var;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        if (i < 0 || i >= 65536) {
            gp.k(dx1.f(i, "Port must be between 0 and 65535, or 0 if not set. Provided: "));
            throw null;
        }
        final int i2 = 1;
        new d6a(new y39(i2, arrayList));
        this.s = tcbVar;
        this.t = tcbVar == null ? tcb.c : tcbVar;
        new d6a(new nga(9, arrayList, this));
        final int i3 = 0;
        new d6a(new ib4(this) { // from class: lgb
            public final /* synthetic */ ngb b;

            {
                this.b = this;
            }

            @Override // defpackage.ib4
            public final Object invoke() {
                int i4 = i3;
                ngb ngbVar = this.b;
                switch (i4) {
                    case 0:
                        String str6 = ngbVar.f;
                        int iW = bw9.W(str6, '?', 0, 6) + 1;
                        if (iW == 0) {
                            return "";
                        }
                        int iW2 = bw9.W(str6, '#', iW, 4);
                        return iW2 == -1 ? str6.substring(iW) : str6.substring(iW, iW2);
                    case 1:
                        String str7 = ngbVar.f;
                        int iW3 = bw9.W(str7, '/', ngbVar.t.a.length() + 3, 4);
                        if (iW3 == -1) {
                            return "";
                        }
                        int iW4 = bw9.W(str7, '#', iW3, 4);
                        return iW4 == -1 ? str7.substring(iW3) : str7.substring(iW3, iW4);
                    case 2:
                        String str8 = ngbVar.f;
                        String str9 = ngbVar.d;
                        if (str9 == null) {
                            return null;
                        }
                        if (str9.length() == 0) {
                            return "";
                        }
                        int length = ngbVar.t.a.length() + 3;
                        return str8.substring(length, bw9.Z(str8, new char[]{':', '@'}, length, 4));
                    case 3:
                        String str10 = ngbVar.f;
                        String str11 = ngbVar.e;
                        if (str11 == null) {
                            return null;
                        }
                        return str11.length() == 0 ? "" : str10.substring(bw9.W(str10, ':', ngbVar.t.a.length() + 3, 4) + 1, bw9.W(str10, '@', 0, 6));
                    default:
                        String str12 = ngbVar.f;
                        int iW5 = bw9.W(str12, '#', 0, 6) + 1;
                        return iW5 == 0 ? "" : str12.substring(iW5);
                }
            }
        });
        new d6a(new ib4(this) { // from class: lgb
            public final /* synthetic */ ngb b;

            {
                this.b = this;
            }

            @Override // defpackage.ib4
            public final Object invoke() {
                int i4 = i2;
                ngb ngbVar = this.b;
                switch (i4) {
                    case 0:
                        String str6 = ngbVar.f;
                        int iW = bw9.W(str6, '?', 0, 6) + 1;
                        if (iW == 0) {
                            return "";
                        }
                        int iW2 = bw9.W(str6, '#', iW, 4);
                        return iW2 == -1 ? str6.substring(iW) : str6.substring(iW, iW2);
                    case 1:
                        String str7 = ngbVar.f;
                        int iW3 = bw9.W(str7, '/', ngbVar.t.a.length() + 3, 4);
                        if (iW3 == -1) {
                            return "";
                        }
                        int iW4 = bw9.W(str7, '#', iW3, 4);
                        return iW4 == -1 ? str7.substring(iW3) : str7.substring(iW3, iW4);
                    case 2:
                        String str8 = ngbVar.f;
                        String str9 = ngbVar.d;
                        if (str9 == null) {
                            return null;
                        }
                        if (str9.length() == 0) {
                            return "";
                        }
                        int length = ngbVar.t.a.length() + 3;
                        return str8.substring(length, bw9.Z(str8, new char[]{':', '@'}, length, 4));
                    case 3:
                        String str10 = ngbVar.f;
                        String str11 = ngbVar.e;
                        if (str11 == null) {
                            return null;
                        }
                        return str11.length() == 0 ? "" : str10.substring(bw9.W(str10, ':', ngbVar.t.a.length() + 3, 4) + 1, bw9.W(str10, '@', 0, 6));
                    default:
                        String str12 = ngbVar.f;
                        int iW5 = bw9.W(str12, '#', 0, 6) + 1;
                        return iW5 == 0 ? "" : str12.substring(iW5);
                }
            }
        });
        final int i4 = 2;
        this.u = new d6a(new ib4(this) { // from class: lgb
            public final /* synthetic */ ngb b;

            {
                this.b = this;
            }

            @Override // defpackage.ib4
            public final Object invoke() {
                int i42 = i4;
                ngb ngbVar = this.b;
                switch (i42) {
                    case 0:
                        String str6 = ngbVar.f;
                        int iW = bw9.W(str6, '?', 0, 6) + 1;
                        if (iW == 0) {
                            return "";
                        }
                        int iW2 = bw9.W(str6, '#', iW, 4);
                        return iW2 == -1 ? str6.substring(iW) : str6.substring(iW, iW2);
                    case 1:
                        String str7 = ngbVar.f;
                        int iW3 = bw9.W(str7, '/', ngbVar.t.a.length() + 3, 4);
                        if (iW3 == -1) {
                            return "";
                        }
                        int iW4 = bw9.W(str7, '#', iW3, 4);
                        return iW4 == -1 ? str7.substring(iW3) : str7.substring(iW3, iW4);
                    case 2:
                        String str8 = ngbVar.f;
                        String str9 = ngbVar.d;
                        if (str9 == null) {
                            return null;
                        }
                        if (str9.length() == 0) {
                            return "";
                        }
                        int length = ngbVar.t.a.length() + 3;
                        return str8.substring(length, bw9.Z(str8, new char[]{':', '@'}, length, 4));
                    case 3:
                        String str10 = ngbVar.f;
                        String str11 = ngbVar.e;
                        if (str11 == null) {
                            return null;
                        }
                        return str11.length() == 0 ? "" : str10.substring(bw9.W(str10, ':', ngbVar.t.a.length() + 3, 4) + 1, bw9.W(str10, '@', 0, 6));
                    default:
                        String str12 = ngbVar.f;
                        int iW5 = bw9.W(str12, '#', 0, 6) + 1;
                        return iW5 == 0 ? "" : str12.substring(iW5);
                }
            }
        });
        final int i5 = 3;
        this.v = new d6a(new ib4(this) { // from class: lgb
            public final /* synthetic */ ngb b;

            {
                this.b = this;
            }

            @Override // defpackage.ib4
            public final Object invoke() {
                int i42 = i5;
                ngb ngbVar = this.b;
                switch (i42) {
                    case 0:
                        String str6 = ngbVar.f;
                        int iW = bw9.W(str6, '?', 0, 6) + 1;
                        if (iW == 0) {
                            return "";
                        }
                        int iW2 = bw9.W(str6, '#', iW, 4);
                        return iW2 == -1 ? str6.substring(iW) : str6.substring(iW, iW2);
                    case 1:
                        String str7 = ngbVar.f;
                        int iW3 = bw9.W(str7, '/', ngbVar.t.a.length() + 3, 4);
                        if (iW3 == -1) {
                            return "";
                        }
                        int iW4 = bw9.W(str7, '#', iW3, 4);
                        return iW4 == -1 ? str7.substring(iW3) : str7.substring(iW3, iW4);
                    case 2:
                        String str8 = ngbVar.f;
                        String str9 = ngbVar.d;
                        if (str9 == null) {
                            return null;
                        }
                        if (str9.length() == 0) {
                            return "";
                        }
                        int length = ngbVar.t.a.length() + 3;
                        return str8.substring(length, bw9.Z(str8, new char[]{':', '@'}, length, 4));
                    case 3:
                        String str10 = ngbVar.f;
                        String str11 = ngbVar.e;
                        if (str11 == null) {
                            return null;
                        }
                        return str11.length() == 0 ? "" : str10.substring(bw9.W(str10, ':', ngbVar.t.a.length() + 3, 4) + 1, bw9.W(str10, '@', 0, 6));
                    default:
                        String str12 = ngbVar.f;
                        int iW5 = bw9.W(str12, '#', 0, 6) + 1;
                        return iW5 == 0 ? "" : str12.substring(iW5);
                }
            }
        });
        final int i6 = 4;
        new d6a(new ib4(this) { // from class: lgb
            public final /* synthetic */ ngb b;

            {
                this.b = this;
            }

            @Override // defpackage.ib4
            public final Object invoke() {
                int i42 = i6;
                ngb ngbVar = this.b;
                switch (i42) {
                    case 0:
                        String str6 = ngbVar.f;
                        int iW = bw9.W(str6, '?', 0, 6) + 1;
                        if (iW == 0) {
                            return "";
                        }
                        int iW2 = bw9.W(str6, '#', iW, 4);
                        return iW2 == -1 ? str6.substring(iW) : str6.substring(iW, iW2);
                    case 1:
                        String str7 = ngbVar.f;
                        int iW3 = bw9.W(str7, '/', ngbVar.t.a.length() + 3, 4);
                        if (iW3 == -1) {
                            return "";
                        }
                        int iW4 = bw9.W(str7, '#', iW3, 4);
                        return iW4 == -1 ? str7.substring(iW3) : str7.substring(iW3, iW4);
                    case 2:
                        String str8 = ngbVar.f;
                        String str9 = ngbVar.d;
                        if (str9 == null) {
                            return null;
                        }
                        if (str9.length() == 0) {
                            return "";
                        }
                        int length = ngbVar.t.a.length() + 3;
                        return str8.substring(length, bw9.Z(str8, new char[]{':', '@'}, length, 4));
                    case 3:
                        String str10 = ngbVar.f;
                        String str11 = ngbVar.e;
                        if (str11 == null) {
                            return null;
                        }
                        return str11.length() == 0 ? "" : str10.substring(bw9.W(str10, ':', ngbVar.t.a.length() + 3, 4) + 1, bw9.W(str10, '@', 0, 6));
                    default:
                        String str12 = ngbVar.f;
                        int iW5 = bw9.W(str12, '#', 0, 6) + 1;
                        return iW5 == 0 ? "" : str12.substring(iW5);
                }
            }
        });
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ngb.class != obj.getClass()) {
            return false;
        }
        return this.f.equals(((ngb) obj).f);
    }

    public final int hashCode() {
        return this.f.hashCode();
    }

    public final String toString() {
        return this.f;
    }
}
