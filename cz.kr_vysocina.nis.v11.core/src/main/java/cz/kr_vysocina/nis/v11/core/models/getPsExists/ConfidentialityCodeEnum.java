package cz.kr_vysocina.nis.v11.core.models.getPsExists;

import com.fasterxml.jackson.annotation.JsonValue;

import jakarta.xml.bind.annotation.XmlEnum;

/**
 * Confidentiality level of the document: N = normal, R = restricted, V = very restricted.
 */
@XmlEnum(String.class)
public enum ConfidentialityCodeEnum {
    N("N"),
    R("R"),
    V("V");

    private String value;

    ConfidentialityCodeEnum(String value) {
        this.value = value;
    }

    @JsonValue
    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return value;
    }
}
