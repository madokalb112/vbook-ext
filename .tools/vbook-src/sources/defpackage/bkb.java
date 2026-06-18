package defpackage;

import android.content.pm.PackageInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class bkb extends o1a implements kb4 {
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ pkb c;
    public final /* synthetic */ yn7 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bkb(pkb pkbVar, yn7 yn7Var, jt1 jt1Var, int i) {
        super(1, jt1Var);
        this.a = i;
        this.c = pkbVar;
        this.d = yn7Var;
    }

    private final Object m(Object obj) throws Exception {
        int i = this.b;
        heb hebVar = heb.a;
        if (i != 0) {
            if (i == 1) {
                e11.e0(obj);
                return hebVar;
            }
            gp.j("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        e11.e0(obj);
        pkb pkbVar = this.c;
        this.b = 1;
        String strB = kr2.b();
        String strC = kr2.c();
        kr2.d();
        Object value = ((wb) pu.a.getValue()).b.getValue();
        value.getClass();
        String str = ((PackageInfo) value).versionName;
        if (str == null) {
            str = "";
        }
        c4a c4aVar = new c4a(r95.a.k().c(), strB, strC, str);
        qe8 qe8Var = new qe8(lr3.x(hx3.a, cx1.q(this.d, "manifest.json")));
        try {
            uf5 uf5Var = pkbVar.b;
            uf5Var.getClass();
            fx1.Z(uf5Var, c4a.Companion.serializer(), c4aVar, qe8Var);
            lc5.U(qe8Var, null);
            xx1 xx1Var = xx1.a;
            return hebVar == xx1Var ? xx1Var : hebVar;
        } finally {
        }
    }

    private final Object n(Object obj) throws Exception {
        int i = this.b;
        heb hebVar = heb.a;
        if (i != 0) {
            if (i == 1) {
                e11.e0(obj);
                return hebVar;
            }
            gp.j("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        e11.e0(obj);
        this.b = 1;
        pkb pkbVar = this.c;
        n92 n92Var = pkbVar.a.I;
        n92Var.getClass();
        sc2 sc2Var = sc2.a;
        qj qjVar = (qj) ((yf1) n92Var).a;
        oc2 oc2Var = new oc2(4);
        qjVar.getClass();
        List<rc2> listC = new af9(1876706263, new String[]{"DbTTSWord"}, qjVar, "DbTTSWord.sq", "getAll", "SELECT DbTTSWord.id, DbTTSWord.word, DbTTSWord.replace, DbTTSWord.ignoreCase, DbTTSWord.createAt, DbTTSWord.updateAt\nFROM DbTTSWord\nORDER BY createAt ASC", oc2Var).c();
        ArrayList arrayList = new ArrayList(gc1.M(listC, 10));
        for (rc2 rc2Var : listC) {
            rc2Var.getClass();
            arrayList.add(new u5a(rc2Var.a, rc2Var.b, rc2Var.c, rc2Var.d, rc2Var.e, rc2Var.f));
        }
        qe8 qe8Var = new qe8(lr3.x(hx3.a, cx1.q(this.d, "tts_words.json")));
        try {
            uf5 uf5Var = pkbVar.b;
            uf5Var.getClass();
            fx1.Z(uf5Var, new wv(u5a.Companion.serializer(), 0), arrayList, qe8Var);
            lc5.U(qe8Var, null);
            xx1 xx1Var = xx1.a;
            return hebVar == xx1Var ? xx1Var : hebVar;
        } finally {
        }
    }

    private final Object o(Object obj) throws Exception {
        int i = this.b;
        heb hebVar = heb.a;
        if (i != 0) {
            if (i == 1) {
                e11.e0(obj);
                return hebVar;
            }
            gp.j("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        e11.e0(obj);
        this.b = 1;
        pkb.e(cx1.q(this.d, "app_settings.json"), "app_settings");
        xx1 xx1Var = xx1.a;
        return hebVar == xx1Var ? xx1Var : hebVar;
    }

    private final Object p(Object obj) throws Exception {
        int i = this.b;
        heb hebVar = heb.a;
        if (i != 0) {
            if (i == 1) {
                e11.e0(obj);
                return hebVar;
            }
            gp.j("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        e11.e0(obj);
        this.b = 1;
        pkb.e(cx1.q(this.d, "browser_settings.json"), "browser_settings");
        xx1 xx1Var = xx1.a;
        return hebVar == xx1Var ? xx1Var : hebVar;
    }

    private final Object q(Object obj) throws Exception {
        int i = this.b;
        heb hebVar = heb.a;
        if (i != 0) {
            if (i == 1) {
                e11.e0(obj);
                return hebVar;
            }
            gp.j("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        e11.e0(obj);
        this.b = 1;
        pkb.e(cx1.q(this.d, "image_settings.json"), "image_settings");
        xx1 xx1Var = xx1.a;
        return hebVar == xx1Var ? xx1Var : hebVar;
    }

    private final Object r(Object obj) throws Exception {
        int i = this.b;
        heb hebVar = heb.a;
        if (i != 0) {
            if (i == 1) {
                e11.e0(obj);
                return hebVar;
            }
            gp.j("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        e11.e0(obj);
        this.b = 1;
        pkb.e(cx1.q(this.d, "text_settings.json"), "text_settings");
        xx1 xx1Var = xx1.a;
        return hebVar == xx1Var ? xx1Var : hebVar;
    }

    private final Object s(Object obj) throws Exception {
        int i = this.b;
        heb hebVar = heb.a;
        if (i != 0) {
            if (i == 1) {
                e11.e0(obj);
                return hebVar;
            }
            gp.j("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        e11.e0(obj);
        this.b = 1;
        pkb.e(cx1.q(this.d, "tts_settings.json"), "tts_settings");
        xx1 xx1Var = xx1.a;
        return hebVar == xx1Var ? xx1Var : hebVar;
    }

    private final Object t(Object obj) throws Exception {
        int i = this.b;
        heb hebVar = heb.a;
        if (i != 0) {
            if (i == 1) {
                e11.e0(obj);
                return hebVar;
            }
            gp.j("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        e11.e0(obj);
        this.b = 1;
        pkb.e(cx1.q(this.d, "reader_settings.json"), "reader_settings");
        xx1 xx1Var = xx1.a;
        return hebVar == xx1Var ? xx1Var : hebVar;
    }

    @Override // defpackage.vc0
    public final jt1 create(jt1 jt1Var) {
        int i = this.a;
        yn7 yn7Var = this.d;
        pkb pkbVar = this.c;
        switch (i) {
            case 0:
                return new bkb(pkbVar, yn7Var, jt1Var, 0);
            case 1:
                return new bkb(pkbVar, yn7Var, jt1Var, 1);
            case 2:
                return new bkb(pkbVar, yn7Var, jt1Var, 2);
            case 3:
                return new bkb(pkbVar, yn7Var, jt1Var, 3);
            case 4:
                return new bkb(pkbVar, yn7Var, jt1Var, 4);
            case 5:
                return new bkb(pkbVar, yn7Var, jt1Var, 5);
            case 6:
                return new bkb(pkbVar, yn7Var, jt1Var, 6);
            case 7:
                return new bkb(pkbVar, yn7Var, jt1Var, 7);
            case 8:
                return new bkb(pkbVar, yn7Var, jt1Var, 8);
            case 9:
                return new bkb(pkbVar, yn7Var, jt1Var, 9);
            case 10:
                return new bkb(pkbVar, yn7Var, jt1Var, 10);
            case 11:
                return new bkb(pkbVar, yn7Var, jt1Var, 11);
            case 12:
                return new bkb(pkbVar, yn7Var, jt1Var, 12);
            case 13:
                return new bkb(pkbVar, yn7Var, jt1Var, 13);
            case 14:
                return new bkb(pkbVar, yn7Var, jt1Var, 14);
            case 15:
                return new bkb(pkbVar, yn7Var, jt1Var, 15);
            case 16:
                return new bkb(pkbVar, yn7Var, jt1Var, 16);
            case 17:
                return new bkb(pkbVar, yn7Var, jt1Var, 17);
            case 18:
                return new bkb(pkbVar, yn7Var, jt1Var, 18);
            case 19:
                return new bkb(pkbVar, yn7Var, jt1Var, 19);
            case 20:
                return new bkb(pkbVar, yn7Var, jt1Var, 20);
            case 21:
                return new bkb(pkbVar, yn7Var, jt1Var, 21);
            case 22:
                return new bkb(pkbVar, yn7Var, jt1Var, 22);
            case 23:
                return new bkb(pkbVar, yn7Var, jt1Var, 23);
            case 24:
                return new bkb(pkbVar, yn7Var, jt1Var, 24);
            case 25:
                return new bkb(pkbVar, yn7Var, jt1Var, 25);
            default:
                return new bkb(pkbVar, yn7Var, jt1Var, 26);
        }
    }

    @Override // defpackage.kb4
    public final Object invoke(Object obj) {
        int i = this.a;
        heb hebVar = heb.a;
        jt1 jt1Var = (jt1) obj;
        switch (i) {
        }
        return ((bkb) create(jt1Var)).invokeSuspend(hebVar);
    }

    @Override // defpackage.vc0
    public final Object invokeSuspend(Object obj) throws Exception {
        qe8 qe8Var;
        int i = this.a;
        pkb pkbVar = this.c;
        yn7 yn7Var = this.d;
        xx1 xx1Var = xx1.a;
        heb hebVar = heb.a;
        switch (i) {
            case 0:
                int i2 = this.b;
                if (i2 == 0) {
                    e11.e0(obj);
                    this.b = 1;
                    pkb.e(cx1.q(yn7Var, "translate_settings.json"), "translate_settings");
                    if (hebVar == xx1Var) {
                        return xx1Var;
                    }
                } else {
                    if (i2 != 1) {
                        gp.j("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    e11.e0(obj);
                }
                return hebVar;
            case 1:
                int i3 = this.b;
                if (i3 == 0) {
                    e11.e0(obj);
                    this.b = 1;
                    List listC = pkbVar.a.x.U().c();
                    ArrayList arrayList = new ArrayList(gc1.M(listC, 10));
                    for (Iterator it = listC.iterator(); it.hasNext(); it = it) {
                        wa2 wa2Var = (wa2) it.next();
                        wa2Var.getClass();
                        arrayList.add(new t3a(wa2Var.a, wa2Var.b, wa2Var.c, wa2Var.d, wa2Var.e, wa2Var.f, wa2Var.g, wa2Var.h, wa2Var.i, wa2Var.j, wa2Var.k, wa2Var.l, wa2Var.m, wa2Var.n, wa2Var.o, wa2Var.p, wa2Var.q, wa2Var.r, wa2Var.s, wa2Var.t, wa2Var.u, wa2Var.v, wa2Var.w, wa2Var.x));
                    }
                    qe8Var = new qe8(lr3.x(hx3.a, cx1.q(yn7Var, "extensions.json")));
                    try {
                        uf5 uf5Var = pkbVar.b;
                        uf5Var.getClass();
                        fx1.Z(uf5Var, new wv(t3a.Companion.serializer(), 0), arrayList, qe8Var);
                        lc5.U(qe8Var, null);
                        if (hebVar == xx1Var) {
                            return xx1Var;
                        }
                    } finally {
                        try {
                            throw th;
                        } finally {
                        }
                    }
                } else {
                    if (i3 != 1) {
                        gp.j("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    e11.e0(obj);
                }
                return hebVar;
            case 2:
                int i4 = this.b;
                if (i4 == 0) {
                    e11.e0(obj);
                    this.b = 1;
                    List<mb2> listC2 = pkbVar.a.z.P().c();
                    ArrayList arrayList2 = new ArrayList(gc1.M(listC2, 10));
                    for (mb2 mb2Var : listC2) {
                        mb2Var.getClass();
                        arrayList2.add(new z3a(mb2Var.a, mb2Var.b, mb2Var.c, mb2Var.d, mb2Var.e));
                    }
                    qe8Var = new qe8(lr3.x(hx3.a, cx1.q(yn7Var, "extension_sources.json")));
                    try {
                        uf5 uf5Var2 = pkbVar.b;
                        uf5Var2.getClass();
                        fx1.Z(uf5Var2, new wv(z3a.Companion.serializer(), 0), arrayList2, qe8Var);
                        lc5.U(qe8Var, null);
                        if (hebVar == xx1Var) {
                            return xx1Var;
                        }
                    } finally {
                        try {
                            throw th;
                        } finally {
                        }
                    }
                } else {
                    if (i4 != 1) {
                        gp.j("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    e11.e0(obj);
                }
                return hebVar;
            case 3:
                int i5 = this.b;
                if (i5 == 0) {
                    e11.e0(obj);
                    this.b = 1;
                    n92 n92Var = pkbVar.a.y;
                    n92Var.getClass();
                    za2 za2Var = za2.a;
                    qj qjVar = (qj) ((yf1) n92Var).a;
                    sa2 sa2Var = new sa2(7);
                    qjVar.getClass();
                    List<xa2> listC3 = new af9(1963271785, new String[]{"DbExtensionLocalStorage"}, qjVar, "DbExtensionLocalStorage.sq", "getAll", "SELECT DbExtensionLocalStorage.id, DbExtensionLocalStorage.extensionId, DbExtensionLocalStorage.key, DbExtensionLocalStorage.content FROM DbExtensionLocalStorage", sa2Var).c();
                    ArrayList arrayList3 = new ArrayList(gc1.M(listC3, 10));
                    for (xa2 xa2Var : listC3) {
                        xa2Var.getClass();
                        arrayList3.add(new w3a(xa2Var.a, xa2Var.b, xa2Var.c, xa2Var.d));
                    }
                    qe8Var = new qe8(lr3.x(hx3.a, cx1.q(yn7Var, "extension_local_storages.json")));
                    try {
                        uf5 uf5Var3 = pkbVar.b;
                        uf5Var3.getClass();
                        fx1.Z(uf5Var3, new wv(w3a.Companion.serializer(), 0), arrayList3, qe8Var);
                        lc5.U(qe8Var, null);
                        if (hebVar == xx1Var) {
                            return xx1Var;
                        }
                    } finally {
                        try {
                            throw th;
                        } finally {
                        }
                    }
                } else {
                    if (i5 != 1) {
                        gp.j("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    e11.e0(obj);
                }
                return hebVar;
            case 4:
                int i6 = this.b;
                if (i6 == 0) {
                    e11.e0(obj);
                    this.b = 1;
                    List<o92> listC4 = pkbVar.a.e.P().c();
                    ArrayList arrayList4 = new ArrayList(gc1.M(listC4, 10));
                    for (o92 o92Var : listC4) {
                        o92Var.getClass();
                        arrayList4.add(new o2a(o92Var.c, o92Var.a, o92Var.b));
                    }
                    qe8Var = new qe8(lr3.x(hx3.a, cx1.q(yn7Var, "categories.json")));
                    try {
                        uf5 uf5Var4 = pkbVar.b;
                        uf5Var4.getClass();
                        fx1.Z(uf5Var4, new wv(o2a.Companion.serializer(), 0), arrayList4, qe8Var);
                        lc5.U(qe8Var, null);
                        if (hebVar == xx1Var) {
                            return xx1Var;
                        }
                    } finally {
                        try {
                            throw th;
                        } finally {
                        }
                    }
                } else {
                    if (i6 != 1) {
                        gp.j("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    e11.e0(obj);
                }
                return hebVar;
            case 5:
                int i7 = this.b;
                if (i7 == 0) {
                    e11.e0(obj);
                    this.b = 1;
                    n92 n92Var2 = pkbVar.a.G;
                    n92Var2.getClass();
                    mc2 mc2Var = mc2.a;
                    qj qjVar2 = (qj) ((yf1) n92Var2).a;
                    pb2 pb2Var = new pb2(23);
                    qjVar2.getClass();
                    List<lc2> listC5 = new af9(642483352, new String[]{"DbReadHistory"}, qjVar2, "DbReadHistory.sq", "getAll", "SELECT DbReadHistory.id, DbReadHistory.readTime, DbReadHistory.listenTime, DbReadHistory.createAt FROM DbReadHistory", pb2Var).c();
                    ArrayList arrayList5 = new ArrayList(gc1.M(listC5, 10));
                    for (lc2 lc2Var : listC5) {
                        lc2Var.getClass();
                        arrayList5.add(new y4a(lc2Var.a, lc2Var.b, lc2Var.c, lc2Var.d));
                    }
                    qe8Var = new qe8(lr3.x(hx3.a, cx1.q(yn7Var, "read_histories.json")));
                    try {
                        uf5 uf5Var5 = pkbVar.b;
                        uf5Var5.getClass();
                        fx1.Z(uf5Var5, new wv(y4a.Companion.serializer(), 0), arrayList5, qe8Var);
                        lc5.U(qe8Var, null);
                        if (hebVar == xx1Var) {
                            return xx1Var;
                        }
                    } finally {
                        try {
                            throw th;
                        } finally {
                        }
                    }
                } else {
                    if (i7 != 1) {
                        gp.j("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    e11.e0(obj);
                }
                return hebVar;
            case 6:
                int i8 = this.b;
                if (i8 == 0) {
                    e11.e0(obj);
                    this.b = 1;
                    List listC6 = pkbVar.a.u.U().c();
                    ArrayList arrayList6 = new ArrayList(gc1.M(listC6, 10));
                    for (Iterator it2 = listC6.iterator(); it2.hasNext(); it2 = it2) {
                        ha2 ha2Var = (ha2) it2.next();
                        ha2Var.getClass();
                        arrayList6.add(new a3a(ha2Var.a, ha2Var.b, ha2Var.c, ha2Var.d, ha2Var.e, ha2Var.f, ha2Var.g, ha2Var.h, ha2Var.i, ha2Var.j, ha2Var.k, ha2Var.l));
                    }
                    qe8Var = new qe8(lr3.x(hx3.a, cx1.q(yn7Var, "downloads.json")));
                    try {
                        uf5 uf5Var6 = pkbVar.b;
                        uf5Var6.getClass();
                        fx1.Z(uf5Var6, new wv(a3a.Companion.serializer(), 0), arrayList6, qe8Var);
                        lc5.U(qe8Var, null);
                        if (hebVar == xx1Var) {
                            return xx1Var;
                        }
                    } finally {
                        try {
                            throw th;
                        } finally {
                        }
                    }
                } else {
                    if (i8 != 1) {
                        gp.j("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    e11.e0(obj);
                }
                return hebVar;
            case 7:
                int i9 = this.b;
                if (i9 == 0) {
                    e11.e0(obj);
                    this.b = 1;
                    n92 n92Var3 = pkbVar.a.d;
                    n92Var3.getClass();
                    l92 l92Var = l92.a;
                    qj qjVar3 = (qj) ((yf1) n92Var3).a;
                    hu1 hu1Var = new hu1(23);
                    qjVar3.getClass();
                    List<h92> listC7 = new af9(1499221264, new String[]{"DbBrowserHistory"}, qjVar3, "DbBrowserHistory.sq", "getAllHistory", "SELECT DbBrowserHistory.url, DbBrowserHistory.title, DbBrowserHistory.createAt FROM DbBrowserHistory\nORDER BY createAt DESC", hu1Var).c();
                    ArrayList arrayList7 = new ArrayList(gc1.M(listC7, 10));
                    for (h92 h92Var : listC7) {
                        h92Var.getClass();
                        arrayList7.add(new l2a(h92Var.c, h92Var.a, h92Var.b));
                    }
                    qe8Var = new qe8(lr3.x(hx3.a, cx1.q(yn7Var, "browser_histories.json")));
                    try {
                        uf5 uf5Var7 = pkbVar.b;
                        uf5Var7.getClass();
                        fx1.Z(uf5Var7, new wv(l2a.Companion.serializer(), 0), arrayList7, qe8Var);
                        lc5.U(qe8Var, null);
                        if (hebVar == xx1Var) {
                            return xx1Var;
                        }
                    } finally {
                        try {
                            throw th;
                        } finally {
                        }
                    }
                } else {
                    if (i9 != 1) {
                        gp.j("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    e11.e0(obj);
                }
                return hebVar;
            case 8:
                int i10 = this.b;
                if (i10 == 0) {
                    e11.e0(obj);
                    this.b = 1;
                    n92 n92Var4 = pkbVar.a.v;
                    n92Var4.getClass();
                    ta2 ta2Var = ta2.a;
                    qj qjVar4 = (qj) ((yf1) n92Var4).a;
                    sa2 sa2Var2 = new sa2(2);
                    qjVar4.getClass();
                    List<pa2> listC8 = new af9(-1849163392, new String[]{"DbEmoji"}, qjVar4, "DbEmoji.sq", "getAll", "SELECT DbEmoji.id, DbEmoji.category, DbEmoji.url, DbEmoji.lastUse FROM DbEmoji", sa2Var2).c();
                    ArrayList arrayList8 = new ArrayList(gc1.M(listC8, 10));
                    for (pa2 pa2Var : listC8) {
                        pa2Var.getClass();
                        arrayList8.add(new d3a(pa2Var.d, pa2Var.a, pa2Var.b, pa2Var.c));
                    }
                    qe8Var = new qe8(lr3.x(hx3.a, cx1.q(yn7Var, "emojis.json")));
                    try {
                        uf5 uf5Var8 = pkbVar.b;
                        uf5Var8.getClass();
                        fx1.Z(uf5Var8, new wv(d3a.Companion.serializer(), 0), arrayList8, qe8Var);
                        lc5.U(qe8Var, null);
                        if (hebVar == xx1Var) {
                            return xx1Var;
                        }
                    } finally {
                        try {
                            throw th;
                        } finally {
                        }
                    }
                } else {
                    if (i10 != 1) {
                        gp.j("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    e11.e0(obj);
                }
                return hebVar;
            case 9:
                int i11 = this.b;
                if (i11 == 0) {
                    e11.e0(obj);
                    this.b = 1;
                    n92 n92Var5 = pkbVar.a.w;
                    n92Var5.getClass();
                    ra2 ra2Var = ra2.a;
                    qj qjVar5 = (qj) ((yf1) n92Var5).a;
                    q92 q92Var = new q92(28);
                    qjVar5.getClass();
                    List<qa2> listC9 = new af9(619904542, new String[]{"DbEmojiCategory"}, qjVar5, "DbEmojiCategory.sq", "getAll", "SELECT DbEmojiCategory.id, DbEmojiCategory.thumb, DbEmojiCategory.count, DbEmojiCategory.position\nFROM DbEmojiCategory\nORDER BY position ASC", q92Var).c();
                    ArrayList arrayList9 = new ArrayList(gc1.M(listC9, 10));
                    for (qa2 qa2Var : listC9) {
                        qa2Var.getClass();
                        arrayList9.add(new g3a(qa2Var.c, qa2Var.d, qa2Var.a, qa2Var.b));
                    }
                    qe8Var = new qe8(lr3.x(hx3.a, cx1.q(yn7Var, "emoji_categories.json")));
                    try {
                        uf5 uf5Var9 = pkbVar.b;
                        uf5Var9.getClass();
                        fx1.Z(uf5Var9, new wv(g3a.Companion.serializer(), 0), arrayList9, qe8Var);
                        lc5.U(qe8Var, null);
                        if (hebVar == xx1Var) {
                            return xx1Var;
                        }
                    } finally {
                        try {
                            throw th;
                        } finally {
                        }
                    }
                } else {
                    if (i11 != 1) {
                        gp.j("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    e11.e0(obj);
                }
                return hebVar;
            case 10:
                int i12 = this.b;
                if (i12 == 0) {
                    e11.e0(obj);
                    this.b = 1;
                    n92 n92Var6 = pkbVar.a.H;
                    n92Var6.getClass();
                    qc2 qc2Var = qc2.a;
                    qj qjVar6 = (qj) ((yf1) n92Var6).a;
                    pb2 pb2Var2 = new pb2(28);
                    qjVar6.getClass();
                    List<nc2> listC10 = new af9(776422464, new String[]{"DbSearch"}, qjVar6, "DbSearch.sq", "getAll", "SELECT DbSearch.key, DbSearch.createAt FROM DbSearch", pb2Var2).c();
                    ArrayList arrayList10 = new ArrayList(gc1.M(listC10, 10));
                    for (nc2 nc2Var : listC10) {
                        nc2Var.getClass();
                        arrayList10.add(new n5a(nc2Var.a, nc2Var.b));
                    }
                    qe8Var = new qe8(lr3.x(hx3.a, cx1.q(yn7Var, "searches.json")));
                    try {
                        uf5 uf5Var10 = pkbVar.b;
                        uf5Var10.getClass();
                        fx1.Z(uf5Var10, new wv(n5a.Companion.serializer(), 0), arrayList10, qe8Var);
                        lc5.U(qe8Var, null);
                        if (hebVar == xx1Var) {
                            return xx1Var;
                        }
                    } finally {
                        try {
                            throw th;
                        } finally {
                        }
                    }
                } else {
                    if (i12 != 1) {
                        gp.j("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    e11.e0(obj);
                }
                return hebVar;
            case 11:
                int i13 = this.b;
                if (i13 == 0) {
                    e11.e0(obj);
                    this.b = 1;
                    List<fa2> listC11 = pkbVar.a.t.P().c();
                    ArrayList arrayList11 = new ArrayList(gc1.M(listC11, 10));
                    for (fa2 fa2Var : listC11) {
                        fa2Var.getClass();
                        arrayList11.add(new x2a(fa2Var.a, fa2Var.b, fa2Var.c, fa2Var.d, fa2Var.e, fa2Var.f, fa2Var.g));
                    }
                    qe8Var = new qe8(lr3.x(hx3.a, cx1.q(yn7Var, "domains.json")));
                    try {
                        uf5 uf5Var11 = pkbVar.b;
                        uf5Var11.getClass();
                        fx1.Z(uf5Var11, new wv(x2a.Companion.serializer(), 0), arrayList11, qe8Var);
                        lc5.U(qe8Var, null);
                        if (hebVar == xx1Var) {
                            return xx1Var;
                        }
                    } finally {
                        try {
                            throw th;
                        } finally {
                        }
                    }
                } else {
                    if (i13 != 1) {
                        gp.j("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    e11.e0(obj);
                }
                return hebVar;
            case 12:
                int i14 = this.b;
                if (i14 == 0) {
                    e11.e0(obj);
                    this.b = 1;
                    b92 b92Var = pkbVar.a.K;
                    b92Var.getClass();
                    dd2 dd2Var = dd2.a;
                    qj qjVar7 = (qj) ((yf1) b92Var).a;
                    bd2 bd2Var = new bd2(b92Var, 0);
                    qjVar7.getClass();
                    List<ad2> listC12 = new af9(-467145230, new String[]{"DbTrash"}, qjVar7, "DbTrash.sq", "getAll", "SELECT DbTrash.id, DbTrash.bookId, DbTrash.word, DbTrash.type, DbTrash.regex, DbTrash.createAt, DbTrash.updateAt\nFROM DbTrash\nORDER BY createAt ASC", bd2Var).c();
                    ArrayList arrayList12 = new ArrayList(gc1.M(listC12, 10));
                    for (ad2 ad2Var : listC12) {
                        ad2Var.getClass();
                        String str = ad2Var.a;
                        String str2 = ad2Var.b;
                        String str3 = ad2Var.c;
                        arrayList12.add(new a6a(ad2Var.d, ad2Var.f, ad2Var.g, str, str2, str3, ad2Var.e));
                    }
                    qe8Var = new qe8(lr3.x(hx3.a, cx1.q(yn7Var, "trashes.json")));
                    try {
                        uf5 uf5Var12 = pkbVar.b;
                        uf5Var12.getClass();
                        fx1.Z(uf5Var12, new wv(a6a.Companion.serializer(), 0), arrayList12, qe8Var);
                        lc5.U(qe8Var, null);
                        if (hebVar == xx1Var) {
                            return xx1Var;
                        }
                    } finally {
                        try {
                            throw th;
                        } finally {
                        }
                    }
                } else {
                    if (i14 != 1) {
                        gp.j("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    e11.e0(obj);
                }
                return hebVar;
            case 13:
                int i15 = this.b;
                if (i15 == 0) {
                    e11.e0(obj);
                    this.b = 1;
                    n92 n92Var7 = pkbVar.a.D;
                    n92Var7.getClass();
                    ac2 ac2Var = ac2.a;
                    qj qjVar8 = (qj) ((yf1) n92Var7).a;
                    pb2 pb2Var3 = new pb2(13);
                    qjVar8.getClass();
                    List<zb2> listC13 = new af9(1261311281, new String[]{"DbQtDictionary"}, qjVar8, "DbQtDictionary.sq", "getAll", "SELECT DbQtDictionary.id, DbQtDictionary.name, DbQtDictionary.nameDictionary, DbQtDictionary.vpDictionary, DbQtDictionary.createAt, DbQtDictionary.updateAt\nFROM DbQtDictionary\nORDER BY createAt DESC", pb2Var3).c();
                    ArrayList arrayList13 = new ArrayList(gc1.M(listC13, 10));
                    for (zb2 zb2Var : listC13) {
                        zb2Var.getClass();
                        arrayList13.add(new p4a(zb2Var.a, zb2Var.b, zb2Var.c, zb2Var.d, zb2Var.e, zb2Var.f));
                    }
                    qe8Var = new qe8(lr3.x(hx3.a, cx1.q(yn7Var, "qt_dictionaries.json")));
                    try {
                        uf5 uf5Var13 = pkbVar.b;
                        uf5Var13.getClass();
                        fx1.Z(uf5Var13, new wv(p4a.Companion.serializer(), 0), arrayList13, qe8Var);
                        lc5.U(qe8Var, null);
                        if (hebVar == xx1Var) {
                            return xx1Var;
                        }
                    } finally {
                        try {
                            throw th;
                        } finally {
                        }
                    }
                } else {
                    if (i15 != 1) {
                        gp.j("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    e11.e0(obj);
                }
                return hebVar;
            case 14:
                int i16 = this.b;
                if (i16 == 0) {
                    e11.e0(obj);
                    this.b = 1;
                    List<dc2> listC14 = pkbVar.a.F.V("general").c();
                    ArrayList arrayList14 = new ArrayList(gc1.M(listC14, 10));
                    for (dc2 dc2Var : listC14) {
                        dc2Var.getClass();
                        arrayList14.add(new v4a(dc2Var.a, dc2Var.c, dc2Var.d, dc2Var.e, dc2Var.f, dc2Var.g, dc2Var.h));
                    }
                    qe8Var = new qe8(lr3.x(hx3.a, cx1.q(yn7Var, "qt_words.json")));
                    try {
                        uf5 uf5Var14 = pkbVar.b;
                        uf5Var14.getClass();
                        fx1.Z(uf5Var14, new wv(v4a.Companion.serializer(), 0), arrayList14, qe8Var);
                        lc5.U(qe8Var, null);
                        if (hebVar == xx1Var) {
                            return xx1Var;
                        }
                    } finally {
                        try {
                            throw th;
                        } finally {
                        }
                    }
                } else {
                    if (i16 != 1) {
                        gp.j("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    e11.e0(obj);
                }
                return hebVar;
            case 15:
                int i17 = this.b;
                if (i17 == 0) {
                    e11.e0(obj);
                    this.b = 1;
                    List<bc2> listC15 = pkbVar.a.E.P().c();
                    ArrayList arrayList15 = new ArrayList(gc1.M(listC15, 10));
                    for (bc2 bc2Var : listC15) {
                        bc2Var.getClass();
                        arrayList15.add(new s4a(bc2Var.c, bc2Var.d, bc2Var.a, bc2Var.b));
                    }
                    qe8Var = new qe8(lr3.x(hx3.a, cx1.q(yn7Var, "qt_name_skips.json")));
                    try {
                        uf5 uf5Var15 = pkbVar.b;
                        uf5Var15.getClass();
                        fx1.Z(uf5Var15, new wv(s4a.Companion.serializer(), 0), arrayList15, qe8Var);
                        lc5.U(qe8Var, null);
                        if (hebVar == xx1Var) {
                            return xx1Var;
                        }
                    } finally {
                        try {
                            throw th;
                        } finally {
                        }
                    }
                } else {
                    if (i17 != 1) {
                        gp.j("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    e11.e0(obj);
                }
                return hebVar;
            case 16:
                int i18 = this.b;
                if (i18 == 0) {
                    e11.e0(obj);
                    this.b = 1;
                    List<ob2> listC16 = pkbVar.a.A.Q("general").c();
                    ArrayList arrayList16 = new ArrayList(gc1.M(listC16, 10));
                    for (ob2 ob2Var : listC16) {
                        ob2Var.getClass();
                        arrayList16.add(new i4a(ob2Var.a, ob2Var.c, ob2Var.d, ob2Var.e, ob2Var.f));
                        yn7Var = yn7Var;
                    }
                    qe8Var = new qe8(lr3.x(hx3.a, cx1.q(yn7Var, "names.json")));
                    try {
                        uf5 uf5Var16 = pkbVar.b;
                        uf5Var16.getClass();
                        fx1.Z(uf5Var16, new wv(i4a.Companion.serializer(), 0), arrayList16, qe8Var);
                        lc5.U(qe8Var, null);
                        if (hebVar == xx1Var) {
                            return xx1Var;
                        }
                    } finally {
                    }
                } else {
                    if (i18 != 1) {
                        gp.j("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    e11.e0(obj);
                }
                return hebVar;
            case 17:
                return n(obj);
            case 18:
                int i19 = this.b;
                if (i19 == 0) {
                    e11.e0(obj);
                    this.b = 1;
                    b92 b92Var2 = pkbVar.a.B;
                    b92Var2.getClass();
                    wb2 wb2Var = wb2.a;
                    qj qjVar9 = (qj) ((yf1) b92Var2).a;
                    rb2 rb2Var = new rb2(b92Var2);
                    qjVar9.getClass();
                    List<vb2> listC17 = new af9(-866601853, new String[]{"DbNotification"}, qjVar9, "DbNotification.sq", "getAll", "SELECT DbNotification.id, DbNotification.type, DbNotification.content, DbNotification.createAt, DbNotification.read FROM DbNotification\nORDER BY read ASC, createAt DESC", rb2Var).c();
                    ArrayList arrayList17 = new ArrayList(gc1.M(listC17, 10));
                    for (vb2 vb2Var : listC17) {
                        vb2Var.getClass();
                        String str4 = vb2Var.a;
                        arrayList17.add(new l4a(vb2Var.b, vb2Var.d, str4, vb2Var.c, vb2Var.e));
                    }
                    qe8Var = new qe8(lr3.x(hx3.a, cx1.q(yn7Var, "notifications.json")));
                    try {
                        uf5 uf5Var17 = pkbVar.b;
                        uf5Var17.getClass();
                        fx1.Z(uf5Var17, new wv(l4a.Companion.serializer(), 0), arrayList17, qe8Var);
                        lc5.U(qe8Var, null);
                        if (hebVar == xx1Var) {
                            return xx1Var;
                        }
                    } finally {
                    }
                } else {
                    if (i19 != 1) {
                        gp.j("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    e11.e0(obj);
                }
                return hebVar;
            case 19:
                return m(obj);
            case 20:
                return o(obj);
            case 21:
                return p(obj);
            case 22:
                return q(obj);
            case 23:
                return r(obj);
            case 24:
                return s(obj);
            case 25:
                return t(obj);
            default:
                int i20 = this.b;
                if (i20 == 0) {
                    e11.e0(obj);
                    this.b = 1;
                    pkb.e(cx1.q(yn7Var, "qt_settings.json"), "qt_settings");
                    if (hebVar == xx1Var) {
                        return xx1Var;
                    }
                } else {
                    if (i20 != 1) {
                        gp.j("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    e11.e0(obj);
                }
                return hebVar;
        }
    }
}
