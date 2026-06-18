package org.mozilla.javascript.ast;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public class XmlDotQuery extends InfixExpression {
    private int rp;

    public XmlDotQuery() {
        this.rp = -1;
        this.type = 160;
    }

    public int getRp() {
        return this.rp;
    }

    public void setRp(int i) {
        this.rp = i;
    }

    @Override // org.mozilla.javascript.ast.InfixExpression, org.mozilla.javascript.ast.AstNode
    public String toSource(int i) {
        return makeIndent(i) + getLeft().toSource(0) + ".(" + getRight().toSource(0) + ")";
    }

    public XmlDotQuery(int i) {
        super(i);
        this.rp = -1;
        this.type = 160;
    }

    public XmlDotQuery(int i, int i2) {
        super(i, i2);
        this.rp = -1;
        this.type = 160;
    }
}
