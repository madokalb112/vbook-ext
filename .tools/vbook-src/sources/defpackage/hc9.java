package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class hc9 implements kb4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ mb9 b;
    public final /* synthetic */ kb4 c;
    public final /* synthetic */ kb4 d;

    public /* synthetic */ hc9(mb9 mb9Var, kb4 kb4Var, kb4 kb4Var2, int i) {
        this.a = i;
        this.b = mb9Var;
        this.c = kb4Var;
        this.d = kb4Var2;
    }

    @Override // defpackage.kb4
    public final Object invoke(Object obj) {
        int i;
        List list;
        List list2;
        int i2;
        kb4 kb4Var;
        int i3;
        int i4 = this.a;
        heb hebVar = heb.a;
        int i5 = 1;
        switch (i4) {
            case 0:
                aq5 aq5Var = (aq5) obj;
                aq5Var.getClass();
                mb9 mb9Var = this.b;
                List list3 = mb9Var.h;
                List list4 = mb9Var.j;
                List list5 = mb9Var.i;
                List list6 = mb9Var.g;
                boolean zIsEmpty = list3.isEmpty();
                kb4 kb4Var2 = this.c;
                kb4 kb4Var3 = this.d;
                if (zIsEmpty) {
                    i = 11;
                } else {
                    aq5.b0(aq5Var, "last_add_list1", new ax8(10), fz1.v, 4);
                    List list7 = mb9Var.h;
                    i = 11;
                    aq5Var.c0(list7.size(), new kt6(10, new ax8(13), list7), (yb4) null, new kt6(11, new ax8(14), list7), new rj1(new l90(list7, mb9Var, kb4Var2, kb4Var3, 7), true, -1117249557));
                }
                int i6 = 2;
                if (!list6.isEmpty()) {
                    aq5.b0(aq5Var, "recent_list1", new ax8(15), fz1.w, 4);
                    aq5.d0(aq5Var, Math.min(6, list6.size()), new mc9(mb9Var, 1), new ax8(12), new rj1(new lc9(mb9Var, kb4Var2, kb4Var3, i6), true, -1378077659), 4);
                }
                int i7 = 0;
                if (!list5.isEmpty()) {
                    aq5.b0(aq5Var, "last_update_list1", new ax8(16), fz1.x, 4);
                    aq5.d0(aq5Var, Math.min(6, list5.size()), new mc9(mb9Var, 2), new ax8(12), new rj1(new lc9(mb9Var, kb4Var2, kb4Var3, i7), true, 1111386342), 4);
                }
                if (!list4.isEmpty()) {
                    aq5.b0(aq5Var, "often_read_list1", new ax8(i), fz1.y, 4);
                    aq5.d0(aq5Var, Math.min(6, list4.size()), new mc9(mb9Var, 0), new ax8(12), new rj1(new lc9(mb9Var, kb4Var2, kb4Var3, i5), true, -694116953), 4);
                }
                break;
            default:
                aq5 aq5Var2 = (aq5) obj;
                aq5Var2.getClass();
                mb9 mb9Var2 = this.b;
                List list8 = mb9Var2.h;
                List list9 = mb9Var2.j;
                List list10 = mb9Var2.i;
                List list11 = mb9Var2.g;
                boolean zIsEmpty2 = list8.isEmpty();
                kb4 kb4Var4 = this.c;
                kb4 kb4Var5 = this.d;
                if (zIsEmpty2) {
                    list = list10;
                    list2 = list11;
                    i2 = 5;
                    kb4Var = kb4Var4;
                } else {
                    aq5.b0(aq5Var2, "last_add_list2", new ax8(24), fz1.z, 4);
                    List list12 = mb9Var2.h;
                    ax8 ax8Var = new ax8(26);
                    ax8 ax8Var2 = new ax8(27);
                    int size = list12.size();
                    list = list10;
                    kt6 kt6Var = new kt6(12, ax8Var, list12);
                    kt6 kt6Var2 = new kt6(13, ax8Var2, list12);
                    rj1 rj1Var = new rj1(new xq3(list12, kb4Var4, kb4Var5, 5), true, -1117249557);
                    list2 = list11;
                    kb4Var = kb4Var4;
                    i2 = 5;
                    aq5Var2.c0(size, kt6Var, (yb4) null, kt6Var2, rj1Var);
                }
                int i8 = 7;
                if (list2.isEmpty()) {
                    i3 = 7;
                } else {
                    aq5.b0(aq5Var2, "recent_list2", new ax8(28), fz1.A, 4);
                    i3 = 7;
                    aq5.d0(aq5Var2, Math.min(6, list2.size()), new mc9(mb9Var2, 6), new ax8(12), new rj1(new lc9(mb9Var2, kb4Var, kb4Var5, i8), true, -676143066), 4);
                }
                if (!list.isEmpty()) {
                    aq5.b0(aq5Var2, "last_update_list2", new ax8(29), fz1.B, 4);
                    aq5.d0(aq5Var2, Math.min(6, list.size()), new mc9(mb9Var2, i3), new ax8(12), new rj1(new lc9(mb9Var2, kb4Var, kb4Var5, i2), true, 1813320935), 4);
                }
                if (!list9.isEmpty()) {
                    aq5.b0(aq5Var2, "often_read_list2", new ax8(25), fz1.C, 4);
                    aq5.d0(aq5Var2, Math.min(6, list9.size()), new mc9(mb9Var2, i2), new ax8(12), new rj1(new lc9(mb9Var2, kb4Var, kb4Var5, 6), true, 7817640), 4);
                }
                break;
        }
        return hebVar;
    }
}
