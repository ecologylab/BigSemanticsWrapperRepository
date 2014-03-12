<?xml version="1.0" encoding="ISO-8859-1"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">

  <xsl:template match="@* | node()">
    <xsl:copy>
      <xsl:apply-templates select="@*[name() != 'xpath']" />
      <xsl:apply-templates select="@xpath" />
      <xsl:apply-templates select="node()" />
    </xsl:copy>
  </xsl:template>

  <xsl:template match="@xpath">
    <xsl:element name="xpath"><xsl:value-of select="."/></xsl:element>
  </xsl:template>

</xsl:stylesheet>

