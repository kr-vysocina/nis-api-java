package cz.kr_vysocina.nis.v12.core.models;

import com.fasterxml.jackson.annotation.JsonValue;

import javax.xml.bind.annotation.XmlEnum;

@XmlEnum(String.class)
public enum IdType {
    RC("RC");   //BIRTH NUMBER

    private String value;

    IdType(String value) {
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
