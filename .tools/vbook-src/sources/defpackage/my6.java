package defpackage;

import com.reader.app.widget.NextSongAction;
import com.reader.app.widget.PreviousSongAction;
import com.reader.app.widget.TogglePlaybackAction;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class my6 implements zb4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ o8a b;
    public final /* synthetic */ i8a c;

    public /* synthetic */ my6(o8a o8aVar, i8a i8aVar, int i) {
        this.a = i;
        this.b = o8aVar;
        this.c = i8aVar;
    }

    @Override // defpackage.zb4
    public final Object c(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        heb hebVar = heb.a;
        i8a i8aVar = this.c;
        switch (i) {
            case 0:
                dd4 dd4Var = (dd4) obj2;
                ((Integer) obj3).getClass();
                ((gq8) obj).getClass();
                mq8 mq8Var = new mq8(PreviousSongAction.class, fw.B0((z4[]) Arrays.copyOf(new z4[0], 0)));
                o8a o8aVar = this.b;
                hn9.b(mq8Var, 2131231029, 2131231124, o8aVar.g, 64.0f, 64.0f, 24.0f, dd4Var, 1794048);
                tn9.a(xg9.p(20.0f), dd4Var, 0);
                hn9.b(new mq8(TogglePlaybackAction.class, fw.B0((z4[]) Arrays.copyOf(new z4[0], 0))), i8aVar.c ? 2131231025 : 2131231026, 2131231125, o8aVar.h, 136.0f, 78.0f, 30.0f, dd4Var, 1794048);
                tn9.a(xg9.p(20.0f), dd4Var, 0);
                hn9.b(new mq8(NextSongAction.class, fw.B0((z4[]) Arrays.copyOf(new z4[0], 0))), 2131231028, 2131231124, o8aVar.g, 64.0f, 64.0f, 24.0f, dd4Var, 1794048);
                break;
            case 1:
                dd4 dd4Var2 = (dd4) obj2;
                ((Integer) obj3).getClass();
                ((gq8) obj).getClass();
                mq8 mq8Var2 = new mq8(PreviousSongAction.class, fw.B0((z4[]) Arrays.copyOf(new z4[0], 0)));
                o8a o8aVar2 = this.b;
                hn9.i(mq8Var2, 2131231029, o8aVar2, 14.0f, dd4Var2, 3072);
                tn9.a(xg9.p(10.0f), dd4Var2, 0);
                hn9.b(new mq8(TogglePlaybackAction.class, fw.B0((z4[]) Arrays.copyOf(new z4[0], 0))), i8aVar.c ? 2131231025 : 2131231026, 2131231123, o8aVar2.h, 42.0f, 42.0f, 18.0f, dd4Var2, 1794048);
                tn9.a(xg9.p(10.0f), dd4Var2, 0);
                hn9.i(new mq8(NextSongAction.class, fw.B0((z4[]) Arrays.copyOf(new z4[0], 0))), 2131231028, o8aVar2, 14.0f, dd4Var2, 3072);
                break;
            default:
                dd4 dd4Var3 = (dd4) obj2;
                ((Integer) obj3).getClass();
                ((gq8) obj).getClass();
                mq8 mq8Var3 = new mq8(PreviousSongAction.class, fw.B0((z4[]) Arrays.copyOf(new z4[0], 0)));
                o8a o8aVar3 = this.b;
                hn9.i(mq8Var3, 2131231029, o8aVar3, 22.0f, dd4Var3, 3072);
                tn9.a(xg9.p(30.0f), dd4Var3, 0);
                hn9.b(new mq8(TogglePlaybackAction.class, fw.B0((z4[]) Arrays.copyOf(new z4[0], 0))), i8aVar.c ? 2131231025 : 2131231026, 2131231123, o8aVar3.h, 90.0f, 90.0f, 34.0f, dd4Var3, 1794048);
                tn9.a(xg9.p(30.0f), dd4Var3, 0);
                hn9.i(new mq8(NextSongAction.class, fw.B0((z4[]) Arrays.copyOf(new z4[0], 0))), 2131231028, o8aVar3, 22.0f, dd4Var3, 3072);
                break;
        }
        return hebVar;
    }
}
