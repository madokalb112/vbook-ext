package org.mozilla.javascript.ast;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public class RegExpLiteral extends AstNode {
    private String flags;
    private String value;

    public RegExpLiteral() {
        this.type = 53;
    }

    public String getFlags() {
        return this.flags;
    }

    public String getValue() {
        return this.value;
    }

    public void setFlags(String str) {
        this.flags = str;
    }

    public void setValue(String str) {
        assertNotNull(str);
        this.value = str;
    }

    @Override // org.mozilla.javascript.ast.AstNode
    public String toSource(int i) {
        String strMakeIndent = makeIndent(i);
        String str = this.value;
        String str2 = this.flags;
        if (str2 == null) {
            str2 = "";
        }
        return strMakeIndent + "/" + str + "/" + str2;
    }

    @Override // org.mozilla.javascript.ast.AstNode
    public void visit(NodeVisitor nodeVisitor) {
        nodeVisitor.visit(this);
    }

    public RegExpLiteral(int i) {
        super(i);
        this.type = 53;
    }

    public RegExpLiteral(int i, int i2) {
        super(i, i2);
        this.type = 53;
    }
}
