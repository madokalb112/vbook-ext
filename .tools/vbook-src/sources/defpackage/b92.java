package defpackage;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class b92 extends yf1 {
    public final /* synthetic */ int b;
    public final Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b92(qj qjVar, Object obj, int i) {
        super(qjVar);
        this.b = i;
        this.c = obj;
    }

    public static final String I(b92 b92Var, int i) {
        b92Var.getClass();
        if (i == 0) {
            return "()";
        }
        StringBuilder sb = new StringBuilder((i * 2) + 1);
        sb.append("(?");
        int i2 = i - 1;
        for (int i3 = 0; i3 < i2; i3++) {
            sb.append(",?");
        }
        sb.append(')');
        return sb.toString();
    }

    public void J(String str) {
        str.getClass();
        ((qj) ((yf1) this).a).q(1411706676, "DELETE FROM DbTrash\nWHERE bookId = ?", new e82(str, 24));
        w(1411706676, new oc2(9));
    }

    public wa8 K(String str) {
        int i = this.b;
        int i2 = 20;
        str.getClass();
        switch (i) {
            case 0:
                va8 va8VarQ = ((qj) ((yf1) this).a).q(1805192001, "DELETE FROM DbBook\nWHERE id = ?", new e82(str, 0));
                w(1805192001, new hu1(14));
                return va8VarQ;
            case 1:
                va8 va8VarQ2 = ((qj) ((yf1) this).a).q(-1956331058, "DELETE FROM DbBookmark\nWHERE id = ?", new e82(str, 1));
                w(-1956331058, new hu1(i2));
                return va8VarQ2;
            default:
                va8 va8VarQ3 = ((qj) ((yf1) this).a).q(729812837, "DELETE FROM DbQtWord\nWHERE id = ?", new e82(str, 20));
                w(729812837, new pb2(21));
                return va8VarQ3;
        }
    }

    public void L(String str) {
        str.getClass();
        ((qj) ((yf1) this).a).q(1657400155, "DELETE FROM DbQtWord\nWHERE bookId = ?", new e82(str, 19));
        w(1657400155, new pb2(18));
    }

    public void M(String str) {
        str.getClass();
        ((qj) ((yf1) this).a).q(-413366321, "DELETE FROM DbBookmark\nWHERE bookId = ?", new e82(str, 2));
        w(-413366321, new hu1(21));
    }

    public void N(String str) {
        str.getClass();
        ((qj) ((yf1) this).a).q(1976631124, "DELETE FROM DbTrash\nWHERE word = ?", new e82(str, 25));
        w(1976631124, new oc2(11));
    }

    public void O(String str) {
        str.getClass();
        ((qj) ((yf1) this).a).q(318042797, "DELETE FROM DbChapter\nWHERE bookId = ?", new e82(str, 4));
        w(318042797, new q92(8));
    }

    public void P(String str) {
        str.getClass();
        ((qj) ((yf1) this).a).q(1633076525, "DELETE FROM DbContent\nWHERE bookId = ?", new e82(str, 5));
        w(1633076525, new q92(11));
    }

    public void Q(int i, String str) {
        str.getClass();
        ((qj) ((yf1) this).a).q(-1050045564, "DELETE FROM DbQtWord\nWHERE bookId = ? AND type = ?", new ja2(str, this, i));
        w(-1050045564, new pb2(19));
    }

    public void R(String str) {
        str.getClass();
        ((qj) ((yf1) this).a).q(-713904995, "DELETE FROM DbPage\nWHERE bookId = ?", new e82(str, 17));
        w(-713904995, new pb2(9));
    }

    public void S(String str) {
        str.getClass();
        ((qj) ((yf1) this).a).q(-1142400499, "DELETE FROM DbTocLink\nWHERE bookId = ?", new e82(str, 23));
        w(-1142400499, new oc2(6));
    }

    public ra8 T(String str) {
        int i = 6;
        switch (this.b) {
            case 0:
                str.getClass();
                q82 q82Var = q82.a;
                return new j82(this, str, new b82(this, i), (char) 0);
            case 1:
            case 2:
            default:
                str.getClass();
                eb2 eb2Var = eb2.a;
                return new cb2(this, str, new bb2(this, i));
            case 3:
                ca2 ca2Var = ca2.a;
                return new ba2(this, str, new aa2(this, 1), (byte) 0);
            case 4:
                str.getClass();
                la2 la2Var = la2.a;
                return new ka2(this, str, new ia2(this, 3), (byte) 0);
        }
    }

    public ra8 U() {
        switch (this.b) {
            case 4:
                ma2 ma2Var = ma2.a;
                qj qjVar = (qj) ((yf1) this).a;
                ia2 ia2Var = new ia2(this, 1);
                qjVar.getClass();
                return new af9(-938800288, new String[]{"DbDownload"}, qjVar, "DbDownload.sq", "getAll", "SELECT DbDownload.id, DbDownload.bookId, DbDownload.title, DbDownload.image, DbDownload.path, DbDownload.start, DbDownload.end, DbDownload.downloaded, DbDownload.total, DbDownload.type, DbDownload.status, DbDownload.createAt\nFROM DbDownload\nORDER BY createAt DESC", ia2Var);
            default:
                fb2 fb2Var = fb2.a;
                qj qjVar2 = (qj) ((yf1) this).a;
                bb2 bb2Var = new bb2(this, 10);
                qjVar2.getClass();
                return new af9(-1519730247, new String[]{"DbExtension"}, qjVar2, "DbExtension.sq", "getAll", "SELECT DbExtension.id, DbExtension.name, DbExtension.author, DbExtension.version, DbExtension.source, DbExtension.path, DbExtension.regex, DbExtension.icon, DbExtension.description, DbExtension.language, DbExtension.type, DbExtension.nsfw, DbExtension.development, DbExtension.draft, DbExtension.encrypt, DbExtension.scriptMetadata, DbExtension.settingMetadata, DbExtension.scriptData, DbExtension.settingData, DbExtension.translateData, DbExtension.pinedAt, DbExtension.lastUse, DbExtension.createAt, DbExtension.updateAt FROM DbExtension", bb2Var);
        }
    }

    public ra8 V(String str) {
        str.getClass();
        gc2 gc2Var = gc2.a;
        return new g82(this, str, new ec2(this, 1));
    }

    public m82 W(int i, String str) {
        str.getClass();
        hc2 hc2Var = hc2.a;
        return new m82(this, str, i, new ec2(this, 4));
    }

    public fc2 X(int i, String str, String str2) {
        str.getClass();
        str2.getClass();
        jc2 jc2Var = jc2.a;
        return new fc2(this, str, i, str2, new ec2(this, 2));
    }

    public g82 Y(String str) {
        str.getClass();
        y92 y92Var = y92.a;
        return new g82(this, str, new i92(this));
    }

    public l82 Z(boolean z) {
        x82 x82Var = x82.a;
        return new l82(this, z, new b82(this, 4));
    }

    public h82 a0(int i) {
        kc2 kc2Var = kc2.a;
        return new h82(this, i, new ec2(this, 0), 2);
    }

    public h82 b0(int i) {
        y82 y82Var = y82.a;
        return new h82(this, i, new b82(this, 8), 1);
    }

    public af9 c0() {
        hb2 hb2Var = hb2.a;
        qj qjVar = (qj) ((yf1) this).a;
        sa2 sa2Var = new sa2(15);
        qjVar.getClass();
        return new af9(508535728, new String[]{"DbExtension"}, qjVar, "DbExtension.sq", "getInstalledReadExtensionRegex", "SELECT id, regex\nFROM DbExtension\nWHERE draft = 0 AND (type = 1 OR type = 2 OR type = 3 OR type = 4)\nORDER BY pinedAt DESC, lastUse DESC, updateAt DESC", sa2Var);
    }

    public wc2 d0(String str) {
        str.getClass();
        zc2 zc2Var = zc2.a;
        return new wc2(this, str, new vc2(this, 0));
    }

    public va8 e0(wa2 wa2Var) {
        wa2Var.getClass();
        va8 va8VarQ = ((qj) ((yf1) this).a).q(-1454155257, "INSERT OR REPLACE INTO DbExtension (id, name, author, version, source, path, regex, icon, description, language, type, nsfw, development, draft, encrypt, scriptMetadata, settingMetadata, scriptData, settingData, translateData, pinedAt, lastUse, createAt, updateAt)\nVALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", new n82(8, wa2Var, this));
        w(-1454155257, new sa2(17));
        return va8VarQ;
    }

    public void f0(a82 a82Var) {
        ((qj) ((yf1) this).a).q(1956857935, "INSERT OR REPLACE INTO DbBook (id, name, author, cover, type, format, category, language, pathId, path, source, extensionId, status, location, description, isNsfw, lastReadChapterName, lastReadChapterId, lastReadChapterIndex, lastReadChapterPercent, totalChapter, totalReadTime, totalListenedTime, follow, favorite, hidden, pined, newUpdateCount, translate, extras, readScore, lastUpdate, lastRead, createAt, updateAt)\nVALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", new v(26, a82Var, this));
        w(1956857935, new hu1(6));
    }

    public void g0(c92 c92Var) {
        ((qj) ((yf1) this).a).q(-1804665124, "INSERT OR REPLACE INTO DbBookmark (id, bookId, chapterIndex, chapterName, type, content, description, color, startPosition, endPosition, createAt)\nVALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", new n82(2, c92Var, this));
        w(-1804665124, new hu1(18));
    }

    public void h0(v92 v92Var) {
        v92Var.getClass();
        ((qj) ((yf1) this).a).q(429290709, "INSERT OR REPLACE INTO DbChapter (id, bookId, pathId, position, path, count, downloaded, pay, lock, lastRead, createAt, updateAt)\nVALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", new n82(4, v92Var, this));
        w(429290709, new q92(7));
    }

    public void i0(z92 z92Var) {
        ((qj) ((yf1) this).a).q(-779491839, "INSERT OR REPLACE INTO DbContent (id, bookId, position, content, createAt, updateAt)\nVALUES (?, ?, ?, ?, ?, ?)", new n82(5, z92Var, this));
        w(-779491839, new q92(12));
    }

    public void j0(ha2 ha2Var) {
        ((qj) ((yf1) this).a).q(-873225298, "INSERT OR REPLACE INTO DbDownload (id, bookId, title, image, path, start, end, downloaded, total, type, status, createAt)\nVALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", new n82(7, ha2Var, this));
        w(-873225298, new q92(18));
    }

    public void k0(vb2 vb2Var) {
        ((qj) ((yf1) this).a).q(-801026863, "INSERT OR REPLACE INTO DbNotification (id, type, content, createAt, read)\nVALUES (?, ?, ?, ?, ?)", new n82(9, vb2Var, this));
        w(-801026863, new pb2(8));
    }

    public void l0(xb2 xb2Var) {
        int i = 10;
        ((qj) ((yf1) this).a).q(145791093, "INSERT OR REPLACE INTO DbPage (id, bookId, position, path, createAt, updateAt)\nVALUES (?, ?, ?, ?, ?, ?)", new n82(i, xb2Var, this));
        w(145791093, new pb2(i));
    }

    public void m0(dc2 dc2Var) {
        ((qj) ((yf1) this).a).q(881478771, "INSERT OR REPLACE INTO DbQtWord (id, bookId, word, trans, type, mode, createAt, updateAt)\nVALUES (?, ?, ?, ?, ?, ?, ?, ?)", new n82(11, dc2Var, this));
        w(881478771, new pb2(20));
    }

    public void n0(uc2 uc2Var) {
        uc2Var.getClass();
        ((qj) ((yf1) this).a).q(-2084674646, "INSERT OR REPLACE INTO DbTocLink (id, bookId, title, path, parentId, position, createAt, updateAt)\nVALUES (?, ?, ?, ?, ?, ?, ?, ?)", new n82(15, uc2Var, this));
        w(-2084674646, new oc2(7));
    }

    public void o0(ad2 ad2Var) {
        ((qj) ((yf1) this).a).q(-401570240, "INSERT OR REPLACE INTO DbTrash (id, bookId, word, type, regex, createAt, updateAt)\nVALUES (?, ?, ?, ?, ?, ?, ?)", new n82(16, ad2Var, this));
        w(-401570240, new oc2(13));
    }

    public void p0(String str, String str2, String str3) {
        str3.getClass();
        ((qj) ((yf1) this).a).q(936991630, "UPDATE DbBook\nSET extensionId = ?, source = ?\nWHERE id = ?", new v6(21, str, str2, str3));
        w(936991630, new hu1(10));
    }

    public void q0(long j, String str) {
        str.getClass();
        ((qj) ((yf1) this).a).q(2073247462, "UPDATE DbBook\nSET updateAt = ?\nWHERE id = ?", new d82(1, str, j));
        w(2073247462, new hu1(13));
    }

    public void r0(final String str, final int i, final String str2, final double d, final long j, final String str3) {
        j39.v(str, str2, str3);
        ((qj) ((yf1) this).a).q(220953231, "UPDATE DbBook\nSET lastReadChapterId = ?,\n    lastReadChapterIndex = ?,\n    lastReadChapterName = ?,\n    lastReadChapterPercent = ?,\n    lastRead = ?,\n    newUpdateCount = 0\nWHERE id = ?", new kb4() { // from class: c82
            @Override // defpackage.kb4
            public final Object invoke(Object obj) {
                rj rjVar = (rj) obj;
                rjVar.getClass();
                rjVar.g(0, str);
                ((bv4) this.c).getClass();
                rjVar.j(1, Long.valueOf(i));
                rjVar.g(2, str2);
                rjVar.k(3, Double.valueOf(d));
                rjVar.j(4, Long.valueOf(j));
                rjVar.g(5, str3);
                return heb.a;
            }
        });
        w(220953231, new hu1(11));
    }

    public void s0(String str, Map map) {
        int i = this.b;
        str.getClass();
        switch (i) {
            case 0:
                ((qj) ((yf1) this).a).q(1138991138, "UPDATE DbBook\nSET translate = ?\nWHERE id = ?", new v6(20, this, map, str));
                w(1138991138, new hu1(4));
                break;
            default:
                ((qj) ((yf1) this).a).q(-2080536614, "UPDATE DbExtension\nSET translateData = ?\nWHERE id = ?", new v6(23, this, map, str));
                w(-2080536614, new sa2(22));
                break;
        }
    }

    public void t0(final int i, final int i2, final long j, final long j2, final String str) {
        str.getClass();
        ((qj) ((yf1) this).a).q(1720876770, "UPDATE DbBook\nSET totalChapter = ?, newUpdateCount = newUpdateCount + ?, lastUpdate = ?, updateAt = ?\nWHERE id = ?", new kb4() { // from class: f82
            @Override // defpackage.kb4
            public final Object invoke(Object obj) {
                rj rjVar = (rj) obj;
                rjVar.getClass();
                b92 b92Var = this.a;
                ((bv4) b92Var.c).getClass();
                rjVar.j(0, Long.valueOf(i));
                ((bv4) b92Var.c).getClass();
                rjVar.j(1, Long.valueOf(i2));
                rjVar.j(2, Long.valueOf(j));
                rjVar.j(3, Long.valueOf(j2));
                rjVar.g(4, str);
                return heb.a;
            }
        });
        w(1720876770, new hu1(15));
    }

    public void u0(int i, int i2, String str) {
        str.getClass();
        ((qj) ((yf1) this).a).q(-1180271318, "UPDATE DbChapter\nSET count = ?\nWHERE bookId = ? AND position = ?", new x92(this, i, str, i2, 0));
        w(-1180271318, new q92(6));
    }

    public void v0(int i, int i2, String str) {
        str.getClass();
        ((qj) ((yf1) this).a).q(-1060609395, "UPDATE DbChapter\nSET downloaded = ?, count = ?\nWHERE bookId = ? AND position = ?", new x92(this, i, str, i2, 1));
        w(-1060609395, new q92(4));
    }

    public void w0(int i, String str, long j) {
        str.getClass();
        ((qj) ((yf1) this).a).q(-2115846629, "UPDATE DbChapter\nSET lastRead = ?\nWHERE bookId = ? AND position = ?", new w92(j, str, this, i));
        w(-2115846629, new q92(5));
    }

    public void x0(int i, String str) {
        str.getClass();
        ((qj) ((yf1) this).a).q(-2061562032, "UPDATE DbDownload\nSET status = ?\nWHERE id = ?", new ja2(this, i, str, 0));
        w(-2061562032, new q92(19));
    }
}
