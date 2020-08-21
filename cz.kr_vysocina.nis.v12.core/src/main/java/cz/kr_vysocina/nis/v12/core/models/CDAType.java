package cz.kr_vysocina.nis.v12.core.models;

import com.fasterxml.jackson.annotation.JsonValue;

import javax.xml.bind.annotation.XmlEnum;

@XmlEnum(String.class)
public enum CDAType {
    L1("L1"),
    L3("L3");

    private String value;

    CDAType(String value) {
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

